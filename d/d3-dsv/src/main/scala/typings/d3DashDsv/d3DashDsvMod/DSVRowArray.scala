package typings.d3DashDsv.d3DashDsvMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DSVRowArray[Columns /* <: String */] extends Array[DSVRowString[Columns]] {
  /**
    * List of column names.
    */
  var columns: js.Array[Columns] = js.native
}

