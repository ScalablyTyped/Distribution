package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DbCellValue extends js.Object {
  var displayValue: String = js.native
  var invariantCultureDisplayValue: String = js.native
  var isNull: Boolean = js.native
}

object DbCellValue {
  @scala.inline
  def apply(displayValue: String, invariantCultureDisplayValue: String, isNull: Boolean): DbCellValue = {
    val __obj = js.Dynamic.literal(displayValue = displayValue.asInstanceOf[js.Any], invariantCultureDisplayValue = invariantCultureDisplayValue.asInstanceOf[js.Any], isNull = isNull.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbCellValue]
  }
  @scala.inline
  implicit class DbCellValueOps[Self <: DbCellValue] (val x: Self) extends AnyVal {
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
    def setDisplayValue(value: String): Self = this.set("displayValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvariantCultureDisplayValue(value: String): Self = this.set("invariantCultureDisplayValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsNull(value: Boolean): Self = this.set("isNull", value.asInstanceOf[js.Any])
  }
  
}

