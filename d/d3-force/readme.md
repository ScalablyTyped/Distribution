
# Scala.js typings for d3-force

Typings are for version 1.2

## Library description:
Force-directed graph layout using velocity Verlet integration.

|                    |                 |
| ------------------ | :-------------: |
| Full name          | d3-force |
| Keywords           | d3, d3-module, layout, network, graph, force, verlet, infovis |
| # releases         | 9 |
| # dependents       | 93 |
| # downloads        | 15060100 |
| # stars            | 0 |

## Links
- [Homepage](https://d3js.org/d3-force/)
- [Bugs](https://github.com/d3/d3-force/issues)
- [Repository](https://github.com/d3/d3-force)
- [Npm](https://www.npmjs.com/package/d3-force)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for D3JS d3-force module 1.2
// Project: https://github.com/d3/d3-force/, https://d3js.org/d3-force
// Definitions by: Tom Wanzek <https://github.com/tomwanzek>
//                 Alex Ford <https://github.com/gustavderdrache>
//                 Boris Yankov <https://github.com/borisyankov>
//                 denisname <https://github.com/denisname>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// Last module patch version validated against: 1.2.0
// -----------------------------------------------------------------------
// Force Simulation
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

