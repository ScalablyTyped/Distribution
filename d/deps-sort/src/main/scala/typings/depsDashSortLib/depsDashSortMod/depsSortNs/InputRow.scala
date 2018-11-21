package typings
package depsDashSortLib.depsDashSortMod.depsSortNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Input objects are file objects in the module-deps shape. They must at least have these properties:
     */

trait InputRow extends js.Object {
  /**
           * dependencies for this file, mapping strings as used in require() to row IDs
           */
  var deps: js.Array[java.lang.String]
  /**
           * a unique identifier for the file
           */
  var id: java.lang.String
  /**
           * the file contents
           */
  var source: java.lang.String
}

