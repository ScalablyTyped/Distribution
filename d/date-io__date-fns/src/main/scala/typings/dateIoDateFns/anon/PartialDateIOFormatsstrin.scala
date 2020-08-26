package typings.dateIoDateFns.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@date-io/core.@date-io/core/IUtils.DateIOFormats<string>> */
@js.native
trait PartialDateIOFormatsstrin extends js.Object {
  var dayOfMonth: js.UndefOr[String] = js.native
  var fullDate: js.UndefOr[String] = js.native
  var fullDateTime: js.UndefOr[String] = js.native
  var fullDateTime12h: js.UndefOr[String] = js.native
  var fullDateTime24h: js.UndefOr[String] = js.native
  var fullDateWithWeekday: js.UndefOr[String] = js.native
  var fullTime: js.UndefOr[String] = js.native
  var fullTime12h: js.UndefOr[String] = js.native
  var fullTime24h: js.UndefOr[String] = js.native
  var hours12h: js.UndefOr[String] = js.native
  var hours24h: js.UndefOr[String] = js.native
  var keyboardDate: js.UndefOr[String] = js.native
  var keyboardDateTime: js.UndefOr[String] = js.native
  var keyboardDateTime12h: js.UndefOr[String] = js.native
  var keyboardDateTime24h: js.UndefOr[String] = js.native
  var minutes: js.UndefOr[String] = js.native
  var month: js.UndefOr[String] = js.native
  var monthAndDate: js.UndefOr[String] = js.native
  var monthAndYear: js.UndefOr[String] = js.native
  var monthShort: js.UndefOr[String] = js.native
  var normalDate: js.UndefOr[String] = js.native
  var normalDateWithWeekday: js.UndefOr[String] = js.native
  var seconds: js.UndefOr[String] = js.native
  var shortDate: js.UndefOr[String] = js.native
  var weekday: js.UndefOr[String] = js.native
  var weekdayShort: js.UndefOr[String] = js.native
  var year: js.UndefOr[String] = js.native
}

object PartialDateIOFormatsstrin {
  @scala.inline
  def apply(): PartialDateIOFormatsstrin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDateIOFormatsstrin]
  }
  @scala.inline
  implicit class PartialDateIOFormatsstrinOps[Self <: PartialDateIOFormatsstrin] (val x: Self) extends AnyVal {
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
    def setDayOfMonth(value: String): Self = this.set("dayOfMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayOfMonth: Self = this.set("dayOfMonth", js.undefined)
    @scala.inline
    def setFullDate(value: String): Self = this.set("fullDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullDate: Self = this.set("fullDate", js.undefined)
    @scala.inline
    def setFullDateTime(value: String): Self = this.set("fullDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullDateTime: Self = this.set("fullDateTime", js.undefined)
    @scala.inline
    def setFullDateTime12h(value: String): Self = this.set("fullDateTime12h", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullDateTime12h: Self = this.set("fullDateTime12h", js.undefined)
    @scala.inline
    def setFullDateTime24h(value: String): Self = this.set("fullDateTime24h", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullDateTime24h: Self = this.set("fullDateTime24h", js.undefined)
    @scala.inline
    def setFullDateWithWeekday(value: String): Self = this.set("fullDateWithWeekday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullDateWithWeekday: Self = this.set("fullDateWithWeekday", js.undefined)
    @scala.inline
    def setFullTime(value: String): Self = this.set("fullTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullTime: Self = this.set("fullTime", js.undefined)
    @scala.inline
    def setFullTime12h(value: String): Self = this.set("fullTime12h", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullTime12h: Self = this.set("fullTime12h", js.undefined)
    @scala.inline
    def setFullTime24h(value: String): Self = this.set("fullTime24h", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullTime24h: Self = this.set("fullTime24h", js.undefined)
    @scala.inline
    def setHours12h(value: String): Self = this.set("hours12h", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHours12h: Self = this.set("hours12h", js.undefined)
    @scala.inline
    def setHours24h(value: String): Self = this.set("hours24h", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHours24h: Self = this.set("hours24h", js.undefined)
    @scala.inline
    def setKeyboardDate(value: String): Self = this.set("keyboardDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardDate: Self = this.set("keyboardDate", js.undefined)
    @scala.inline
    def setKeyboardDateTime(value: String): Self = this.set("keyboardDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardDateTime: Self = this.set("keyboardDateTime", js.undefined)
    @scala.inline
    def setKeyboardDateTime12h(value: String): Self = this.set("keyboardDateTime12h", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardDateTime12h: Self = this.set("keyboardDateTime12h", js.undefined)
    @scala.inline
    def setKeyboardDateTime24h(value: String): Self = this.set("keyboardDateTime24h", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardDateTime24h: Self = this.set("keyboardDateTime24h", js.undefined)
    @scala.inline
    def setMinutes(value: String): Self = this.set("minutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinutes: Self = this.set("minutes", js.undefined)
    @scala.inline
    def setMonth(value: String): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    @scala.inline
    def setMonthAndDate(value: String): Self = this.set("monthAndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthAndDate: Self = this.set("monthAndDate", js.undefined)
    @scala.inline
    def setMonthAndYear(value: String): Self = this.set("monthAndYear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthAndYear: Self = this.set("monthAndYear", js.undefined)
    @scala.inline
    def setMonthShort(value: String): Self = this.set("monthShort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthShort: Self = this.set("monthShort", js.undefined)
    @scala.inline
    def setNormalDate(value: String): Self = this.set("normalDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalDate: Self = this.set("normalDate", js.undefined)
    @scala.inline
    def setNormalDateWithWeekday(value: String): Self = this.set("normalDateWithWeekday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalDateWithWeekday: Self = this.set("normalDateWithWeekday", js.undefined)
    @scala.inline
    def setSeconds(value: String): Self = this.set("seconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeconds: Self = this.set("seconds", js.undefined)
    @scala.inline
    def setShortDate(value: String): Self = this.set("shortDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortDate: Self = this.set("shortDate", js.undefined)
    @scala.inline
    def setWeekday(value: String): Self = this.set("weekday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekday: Self = this.set("weekday", js.undefined)
    @scala.inline
    def setWeekdayShort(value: String): Self = this.set("weekdayShort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekdayShort: Self = this.set("weekdayShort", js.undefined)
    @scala.inline
    def setYear(value: String): Self = this.set("year", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
  
}

