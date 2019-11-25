package typings.atBlueprintjsTable.libEsmCommonCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFocusedCellCoordinates extends ICellCoordinates {
  var focusSelectionIndex: Double
}

object IFocusedCellCoordinates {
  @scala.inline
  def apply(col: Double, focusSelectionIndex: Double, row: Double): IFocusedCellCoordinates = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], focusSelectionIndex = focusSelectionIndex.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFocusedCellCoordinates]
  }
}

