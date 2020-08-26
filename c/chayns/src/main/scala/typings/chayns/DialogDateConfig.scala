package typings.chayns

import typings.chayns.chayns.dialog.dateType
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.dialog.date()
@js.native
trait DialogDateConfig extends js.Object {
  var dateType: typings.chayns.chayns.dialog.dateType = js.native
  var maxDate: js.UndefOr[Date] = js.native
  var minDate: js.UndefOr[Date] = js.native
  var preSelect: js.UndefOr[Date] = js.native
}

object DialogDateConfig {
  @scala.inline
  def apply(dateType: dateType): DialogDateConfig = {
    val __obj = js.Dynamic.literal(dateType = dateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogDateConfig]
  }
  @scala.inline
  implicit class DialogDateConfigOps[Self <: DialogDateConfig] (val x: Self) extends AnyVal {
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
    def setDateType(value: dateType): Self = this.set("dateType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setPreSelect(value: Date): Self = this.set("preSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreSelect: Self = this.set("preSelect", js.undefined)
  }
  
}

