package typings
package atBlueprintjsTableLib.libEsmCommonCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFocusedCellCoordinates extends ICellCoordinates {
  var focusSelectionIndex: scala.Double
}

object IFocusedCellCoordinates {
  @scala.inline
  def apply(col: scala.Double, focusSelectionIndex: scala.Double, row: scala.Double): IFocusedCellCoordinates = {
    val __obj = js.Dynamic.literal(col = col, focusSelectionIndex = focusSelectionIndex, row = row)
  
    __obj.asInstanceOf[IFocusedCellCoordinates]
  }
}

