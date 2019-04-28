
# Scala.js typings for canvas-confetti

Typings are for version 0.1

## Library description:
canvas-confetti

|                    |                 |
| ------------------ | :-------------: |
| Full name          | canvas-confetti |
| Keywords           | - |
| # releases         | 6 |
| # dependents       | 0 |
| # downloads        | 30396 |
| # stars            | 0 |

## Links
- [Homepage](https://github.com/catdad/canvas-confetti#readme)
- [Bugs](https://github.com/catdad/canvas-confetti/issues)
- [Repository](https://github.com/catdad/canvas-confetti)
- [Npm](https://www.npmjs.com/package/canvas-confetti)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for canvas-confetti 0.1
// Project: https://github.com/catdad/canvas-confetti#readme
// Definitions by: Martin Tracey <https://github.com/matracey>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
/**
 * `confetti` takes a single optional object. When `window.Promise` is available, it will return a Promise to let you know when it is done. When promises are not available (like in IE), it will return
 * `null`. You can polyfill promises using any of the popular polyfills. You can also provide a custom promise implementation to `confetti` through:
 *
 * `const MyPromise = require('some-promise-lib');
 *  const confetti = require('canvas-confetti');
 *  confetti.Promise = MyPromise;`
 *
 * If you call `confetti` multiple times before it is done, it
 * will return the same promise every time. Internally, the same canvas element will be reused, continuing the existing animation with the new confetti added. The promise returned by each call to
 * `confetti` will resolve once all animations are done.
 *
 */

```

