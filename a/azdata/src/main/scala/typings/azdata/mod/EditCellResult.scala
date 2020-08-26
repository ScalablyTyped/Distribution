package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditCellResult extends js.Object {
  var cell: EditCell = js.native
  var isRowDirty: Boolean = js.native
}

object EditCellResult {
  @scala.inline
  def apply(cell: EditCell, isRowDirty: Boolean): EditCellResult = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], isRowDirty = isRowDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditCellResult]
  }
  @scala.inline
  implicit class EditCellResultOps[Self <: EditCellResult] (val x: Self) extends AnyVal {
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
    def setCell(value: EditCell): Self = this.set("cell", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRowDirty(value: Boolean): Self = this.set("isRowDirty", value.asInstanceOf[js.Any])
  }
  
}

