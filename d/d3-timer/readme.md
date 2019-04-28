
# Scala.js typings for d3-timer

Typings are for version 1.0

## Library description:
An efficient queue capable of managing thousands of concurrent animations.

|                    |                 |
| ------------------ | :-------------: |
| Full name          | d3-timer |
| Keywords           | d3, d3-module, timer, transition, animation, requestAnimationFrame, setTimeout, setInterval |
| # releases         | 5 |
| # dependents       | 64 |
| # downloads        | 20935788 |
| # stars            | 0 |

## Links
- [Homepage](https://d3js.org/d3-timer/)
- [Bugs](https://github.com/d3/d3-timer/issues)
- [Repository](https://github.com/d3/d3-timer)
- [Npm](https://www.npmjs.com/package/d3-timer)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for d3JS d3-timer module 1.0
// Project: https://github.com/d3/d3-timer/, https://d3js.org/d3-timer
// Definitions by: Tom Wanzek <https://github.com/tomwanzek>
//                 Alex Ford <https://github.com/gustavderdrache>
//                 Boris Yankov <https://github.com/borisyankov>
//                 denisname <https://github.com/denisname>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// Last module patch version validated against: 1.0.7
/**
 * Returns the current time as defined by performance.now if available, and Date.now if not.
 * The current time is updated at the start of a frame; it is thus consistent during the frame, and any timers scheduled during the same frame will be synchronized.
 * If this method is called outside of a frame, such as in response to a user event, the current time is calculated and then fixed until the next frame,
 * again ensuring consistent timing during event handling.
 */

```

