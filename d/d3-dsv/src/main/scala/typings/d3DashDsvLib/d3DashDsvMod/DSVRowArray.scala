package typings
package d3DashDsvLib.d3DashDsvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DSVRowArray[Columns /* <: java.lang.String */]
  extends stdLib.Array[DSVRowString[Columns]] {
  /**
    * List of column names.
    */
  var columns: js.Array[Columns] = js.native
}

