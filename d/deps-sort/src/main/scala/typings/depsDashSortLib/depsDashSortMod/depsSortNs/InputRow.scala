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

object InputRow {
  @scala.inline
  def apply(deps: js.Array[java.lang.String], id: java.lang.String, source: java.lang.String): InputRow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deps")(deps)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[InputRow]
  }
}

