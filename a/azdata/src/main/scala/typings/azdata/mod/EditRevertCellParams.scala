package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditRevertCellParams extends IEditRowOperationParams {
  var columnId: Double = js.native
}

object EditRevertCellParams {
  @scala.inline
  def apply(columnId: Double, ownerUri: String, rowId: Double): EditRevertCellParams = {
    val __obj = js.Dynamic.literal(columnId = columnId.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditRevertCellParams]
  }
  @scala.inline
  implicit class EditRevertCellParamsOps[Self <: EditRevertCellParams] (val x: Self) extends AnyVal {
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
  }
  
}

