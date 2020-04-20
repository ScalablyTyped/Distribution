package typings.blueprintjsTable.commonCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellCoordinates extends js.Object {
  var col: Double
  var row: Double
}

object ICellCoordinates {
  @scala.inline
  def apply(col: Double, row: Double): ICellCoordinates = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellCoordinates]
  }
}

