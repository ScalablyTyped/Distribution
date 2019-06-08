
# Scala.js typings for death

Typings are for version 1.1

## Library description:
Gracefully cleanup when termination signals are sent to your process.

|                    |                 |
| ------------------ | :-------------: |
| Full name          | death |
| Keywords           | sigint, sigterm, sigkill, sigquit, exception, kill, terminate, process, clean |
| # releases         | 1 |
| # dependents       | 114 |
| # downloads        | 4089207 |
| # stars            | 15 |

## Links
- [Homepage](https://github.com/jprichardson/node-death#readme)
- [Bugs](https://github.com/jprichardson/node-death/issues)
- [Repository](https://github.com/jprichardson/node-death)
- [Npm](https://www.npmjs.com/package/death)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for death 1.1
// Project: https://github.com/jprichardson/node-death
// Definitions by: Cameron Knight <https://github.com/ckknight>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.1
/**
 * Invokes a callback when a SIGINT, SIGTERM, or SIGQUIT is detected
 * on the current node process.
 * @param callback The callback to invoke
 * @returns A function to unsubscribe and prevent the callback from being invoked
 * @example
 *  ON_DEATH((signal) => {
 *    console.log('Oh no!');
 *  });
 * @example
 *  const OFF_DEATH = ON_DEATH((signal) => {
 *    console.log('Oh no!');
 *  });
 *  // later
 *  OFF_DEATH();
 */

```

