package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditCell extends DbCellValue {
  var isDirty: Boolean = js.native
}

object EditCell {
  @scala.inline
  def apply(displayValue: String, invariantCultureDisplayValue: String, isDirty: Boolean, isNull: Boolean): EditCell = {
    val __obj = js.Dynamic.literal(displayValue = displayValue.asInstanceOf[js.Any], invariantCultureDisplayValue = invariantCultureDisplayValue.asInstanceOf[js.Any], isDirty = isDirty.asInstanceOf[js.Any], isNull = isNull.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditCell]
  }
  @scala.inline
  implicit class EditCellOps[Self <: EditCell] (val x: Self) extends AnyVal {
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
    def setIsDirty(value: Boolean): Self = this.set("isDirty", value.asInstanceOf[js.Any])
  }
  
}

