
# Scala.js typings for beeper

Typings are for version 2.0.0

## Library description:
Make your terminal beep

|                    |                 |
| ------------------ | :-------------: |
| Full name          | beeper |
| Keywords           | beep, beeper, boop, terminal, term, cli, console, ding, ping, alert, gulpfriendly |
| # releases         | 0 |
| # dependents       | 44 |
| # downloads        | 64456547 |
| # stars            | 15 |

## Links
- [Homepage](https://github.com/sindresorhus/beeper#readme)
- [Bugs](https://github.com/sindresorhus/beeper/issues)
- [Repository](https://github.com/sindresorhus/beeper)
- [Npm](https://www.npmjs.com/package/beeper)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
Make your terminal beep.

@param count - How many times you want it to beep. Default: `1`.
@param melody - Construct your own melody by supplying a string of `*` for beep `-` for pause.
@returns A `Promise` that is resolved after the melody has ended.

@example
```
import beeper = require('beeper');

(async => {
	await beeper();
	// beep one time

	await beeper(3);
	// beep three times

	await beeper('****-*-*');
	// beep, beep, beep, beep, pause, beep, pause, beep
})();
```
*/

```

