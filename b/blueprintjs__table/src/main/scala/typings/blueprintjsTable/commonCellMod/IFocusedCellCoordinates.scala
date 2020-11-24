package typings.blueprintjsTable.commonCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFocusedCellCoordinates extends ICellCoordinates {
  
  var focusSelectionIndex: Double = js.native
}
object IFocusedCellCoordinates {
  
  @scala.inline
  def apply(col: Double, focusSelectionIndex: Double, row: Double): IFocusedCellCoordinates = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], focusSelectionIndex = focusSelectionIndex.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFocusedCellCoordinates]
  }
  
  @scala.inline
  implicit class IFocusedCellCoordinatesOps[Self <: IFocusedCellCoordinates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFocusSelectionIndex(value: Double): Self = this.set("focusSelectionIndex", value.asInstanceOf[js.Any])
  }
}
