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