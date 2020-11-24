package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditRow extends js.Object {
  
  var cells: js.Array[DbCellValue] = js.native
  
  var id: Double = js.native
  
  var isDirty: Boolean = js.native
  
  var state: EditRowState = js.native
}
object EditRow {
  
  @scala.inline
  def apply(cells: js.Array[DbCellValue], id: Double, isDirty: Boolean, state: EditRowState): EditRow = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDirty = isDirty.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditRow]
  }
  
  @scala.inline
  implicit class EditRowOps[Self <: EditRow] (val x: Self) extends AnyVal {
    
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
    def setCellsVarargs(value: DbCellValue*): Self = this.set("cells", js.Array(value :_*))
    
    @scala.inline
    def setCells(value: js.Array[DbCellValue]): Self = this.set("cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDirty(value: Boolean): Self = this.set("isDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: EditRowState): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
