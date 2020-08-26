package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditUpdateCellParams extends IEditRowOperationParams {
  var columnId: Double = js.native
  var newValue: String = js.native
}

object EditUpdateCellParams {
  @scala.inline
  def apply(columnId: Double, newValue: String, ownerUri: String, rowId: Double): EditUpdateCellParams = {
    val __obj = js.Dynamic.literal(columnId = columnId.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditUpdateCellParams]
  }
  @scala.inline
  implicit class EditUpdateCellParamsOps[Self <: EditUpdateCellParams] (val x: Self) extends AnyVal {
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
    def setColumnId(value: Double): Self = this.set("columnId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewValue(value: String): Self = this.set("newValue", value.asInstanceOf[js.Any])
  }
  
}

