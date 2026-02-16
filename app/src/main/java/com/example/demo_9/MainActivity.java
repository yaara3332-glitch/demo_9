package com.example.demo_9;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;


public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editTextNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = findViewById(R.id.editTextNumber);
        button = findViewById(R.id.button);
    }

    public void clicked(View view) {
        String num_1 = editTextNumber.getText().toString();
        int num = Integer.parseInt(num_1);
        if (num % 7 != 0) {
            button.setText("the number " + num + " is divided  by the number 7 : ");
        } else {
            button.setText("BOOM!");
        }

    }
}