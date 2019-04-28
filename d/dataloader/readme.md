
# Scala.js typings for dataloader

Typings are for version 1.4.0

## Library description:
A data loading utility to reduce requests to a backend via batching and caching.

|                    |                 |
| ------------------ | :-------------: |
| Full name          | dataloader |
| Keywords           | - |
| # releases         | 2 |
| # dependents       | 202 |
| # downloads        | 4249598 |
| # stars            | 12 |

## Links
- [Homepage](https://github.com/facebook/dataloader)
- [Bugs](https://github.com/facebook/dataloader/issues)
- [Repository](https://github.com/facebook/dataloader)
- [Npm](https://www.npmjs.com/package/dataloader)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
 *  Copyright (c) 2015, Facebook, Inc.
 *  All rights reserved.
 *
 *  This source code is licensed under the BSD-style license found in the
 *  LICENSE file in the root directory of this source tree. An additional grant
 *  of patent rights can be found in the PATENTS file in the same directory.
 */

/**
 * DataLoader creates a public API for loading data from a particular
 * data back-end with unique keys such as the id column of a SQL table
 * or document name in a MongoDB database, given a batch loading function.
 *
 * Each DataLoader instance contains a unique memoized cache. Use caution
 * when used in long-lived applications or those which serve many users
 * with different access permissions and consider creating a new instance
 * per web request.
 */

```

