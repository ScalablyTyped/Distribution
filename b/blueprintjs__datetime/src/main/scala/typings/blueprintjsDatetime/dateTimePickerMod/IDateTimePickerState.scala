package typings.blueprintjsDatetime.dateTimePickerMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateTimePickerState extends js.Object {
  var dateValue: js.UndefOr[Date] = js.native
  var timeValue: js.UndefOr[Date] = js.native
}

object IDateTimePickerState {
  @scala.inline
  def apply(): IDateTimePickerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDateTimePickerState]
  }
  @scala.inline
  implicit class IDateTimePickerStateOps[Self <: IDateTimePickerState] (val x: Self) extends AnyVal {
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
    def setDateValue(value: Date): Self = this.set("dateValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateValue: Self = this.set("dateValue", js.undefined)
    @scala.inline
    def setTimeValue(value: Date): Self = this.set("timeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeValue: Self = this.set("timeValue", js.undefined)
  }
  
}

