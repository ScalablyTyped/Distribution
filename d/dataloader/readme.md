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