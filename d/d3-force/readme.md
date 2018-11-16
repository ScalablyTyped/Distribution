```
// Type definitions for D3JS d3-force module 1.1
// Project: https://github.com/d3/d3-force/
// Definitions by: Tom Wanzek <https://github.com/tomwanzek>, Alex Ford <https://github.com/gustavderdrache>, Boris Yankov <https://github.com/borisyankov>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// Last module patch version validated against: 1.1.0
// -----------------------------------------------------------------------
// Force Simulation
// -----------------------------------------------------------------------
/**
 * The base data structure for the datum of a Simulation Node.
 * The optional properties contained in this data structure are internally assigned
 * by the Simulation upon (re-)initialization.
 *
 * When defining a data type to use for node data, it should be an extension of this interface
 * and respect the already "earmarked" properties used by the simulation.
 *
 * IMPORTANT: Prior to initialization, the following properties are optional: index, x, y, vx, and vy.
 * After initialization they will be defined. The optional properties fx and fy are ONLY defined,
 * if the node's position has been fixed.
 */
```