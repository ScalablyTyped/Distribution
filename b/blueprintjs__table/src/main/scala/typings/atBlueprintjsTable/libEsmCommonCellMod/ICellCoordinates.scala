package typings.atBlueprintjsTable.libEsmCommonCellMod

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
    val __obj = js.Dynamic.literal(col = col, row = row)
  
    __obj.asInstanceOf[ICellCoordinates]
  }
}

