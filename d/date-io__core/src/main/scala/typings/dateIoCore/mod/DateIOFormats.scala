package typings.dateIoCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateIOFormats[TLibFormatToken] extends js.Object {
  /** Day format string @example "1" */
  var dayOfMonth: TLibFormatToken = js.native
  /** Localized full date @example "Jan 1, 2019" */
  var fullDate: TLibFormatToken = js.native
  /** Date & time format string with localized time @example "Jan 1, 2018 11:44 PM" */
  var fullDateTime: TLibFormatToken = js.native
  /** Not localized date & Time format 12h @example "Jan 1, 2018 11:44 PM" */
  var fullDateTime12h: TLibFormatToken = js.native
  /** Not localized date & Time format 24h @example "Jan 1, 2018 23:44" */
  var fullDateTime24h: TLibFormatToken = js.native
  /** Partially localized full date with weekday, useful for text-to-speech accessibility @example "Tuesday, January 1, 2019" */
  var fullDateWithWeekday: TLibFormatToken = js.native
  /** Full time localized format string @example "11:44 PM" for US, "23:44" for Europe */
  var fullTime: TLibFormatToken = js.native
  /** Not localized full time format string @example "11:44 PM" */
  var fullTime12h: TLibFormatToken = js.native
  /** Not localized full time format string @example "23:44" */
  var fullTime24h: TLibFormatToken = js.native
  /** Hours format string @example "11" */
  var hours12h: TLibFormatToken = js.native
  /** Hours format string @example "23" */
  var hours24h: TLibFormatToken = js.native
  /** Localized keyboard input friendly date format @example "02/13/2020 */
  var keyboardDate: TLibFormatToken = js.native
  /** Localized keyboard input friendly date/time format @example "02/13/2020 23:44" */
  var keyboardDateTime: TLibFormatToken = js.native
  /** Partially localized keyboard input friendly date/time 12h format @example "02/13/2020 11:44 PM" */
  var keyboardDateTime12h: TLibFormatToken = js.native
  /** Partially localized keyboard input friendly date/time 24h format @example "02/13/2020 23:44" */
  var keyboardDateTime24h: TLibFormatToken = js.native
  /** Minutes format string @example "44" */
  var minutes: TLibFormatToken = js.native
  /** Month format string @example "January" */
  var month: TLibFormatToken = js.native
  /** Month with date format string @example "January 1" */
  var monthAndDate: TLibFormatToken = js.native
  /** Short month format string @example "January 2018" */
  var monthAndYear: TLibFormatToken = js.native
  /** Short month format string @example "Jan" */
  var monthShort: TLibFormatToken = js.native
  /** Date format string with month and day of month @example "1 January" */
  var normalDate: TLibFormatToken = js.native
  /** Date format string with weekday, month and day of month @example "Wed, Jan 1" */
  var normalDateWithWeekday: TLibFormatToken = js.native
  /** Seconds format string @example "00" */
  var seconds: TLibFormatToken = js.native
  /** Shorter day format @example "Jan 1" */
  var shortDate: TLibFormatToken = js.native
  /** Weekday format string @example "Wednesday" */
  var weekday: TLibFormatToken = js.native
  /** Short weekday format string @example "Wed" */
  var weekdayShort: TLibFormatToken = js.native
  /** Year format string @example "2019" */
  var year: TLibFormatToken = js.native
}

object DateIOFormats {
  @scala.inline
  def apply[TLibFormatToken](
    dayOfMonth: TLibFormatToken,
    fullDate: TLibFormatToken,
    fullDateTime: TLibFormatToken,
    fullDateTime12h: TLibFormatToken,
    fullDateTime24h: TLibFormatToken,
    fullDateWithWeekday: TLibFormatToken,
    fullTime: TLibFormatToken,
    fullTime12h: TLibFormatToken,
    fullTime24h: TLibFormatToken,
    hours12h: TLibFormatToken,
    hours24h: TLibFormatToken,
    keyboardDate: TLibFormatToken,
    keyboardDateTime: TLibFormatToken,
    keyboardDateTime12h: TLibFormatToken,
    keyboardDateTime24h: TLibFormatToken,
    minutes: TLibFormatToken,
    month: TLibFormatToken,
    monthAndDate: TLibFormatToken,
    monthAndYear: TLibFormatToken,
    monthShort: TLibFormatToken,
    normalDate: TLibFormatToken,
    normalDateWithWeekday: TLibFormatToken,
    seconds: TLibFormatToken,
    shortDate: TLibFormatToken,
    weekday: TLibFormatToken,
    weekdayShort: TLibFormatToken,
    year: TLibFormatToken
  ): DateIOFormats[TLibFormatToken] = {
    val __obj = js.Dynamic.literal(dayOfMonth = dayOfMonth.asInstanceOf[js.Any], fullDate = fullDate.asInstanceOf[js.Any], fullDateTime = fullDateTime.asInstanceOf[js.Any], fullDateTime12h = fullDateTime12h.asInstanceOf[js.Any], fullDateTime24h = fullDateTime24h.asInstanceOf[js.Any], fullDateWithWeekday = fullDateWithWeekday.asInstanceOf[js.Any], fullTime = fullTime.asInstanceOf[js.Any], fullTime12h = fullTime12h.asInstanceOf[js.Any], fullTime24h = fullTime24h.asInstanceOf[js.Any], hours12h = hours12h.asInstanceOf[js.Any], hours24h = hours24h.asInstanceOf[js.Any], keyboardDate = keyboardDate.asInstanceOf[js.Any], keyboardDateTime = keyboardDateTime.asInstanceOf[js.Any], keyboardDateTime12h = keyboardDateTime12h.asInstanceOf[js.Any], keyboardDateTime24h = keyboardDateTime24h.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], monthAndDate = monthAndDate.asInstanceOf[js.Any], monthAndYear = monthAndYear.asInstanceOf[js.Any], monthShort = monthShort.asInstanceOf[js.Any], normalDate = normalDate.asInstanceOf[js.Any], normalDateWithWeekday = normalDateWithWeekday.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], shortDate = shortDate.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any], weekdayShort = weekdayShort.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateIOFormats[TLibFormatToken]]
  }
  @scala.inline
  implicit class DateIOFormatsOps[Self <: DateIOFormats[_], TLibFormatToken] (val x: Self with DateIOFormats[TLibFormatToken]) extends AnyVal {
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
    def setDayOfMonth(value: TLibFormatToken): Self = this.set("dayOfMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullDate(value: TLibFormatToken): Self = this.set("fullDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullDateTime(value: TLibFormatToken): Self = this.set("fullDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullDateTime12h(value: TLibFormatToken): Self = this.set("fullDateTime12h", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullDateTime24h(value: TLibFormatToken): Self = this.set("fullDateTime24h", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullDateWithWeekday(value: TLibFormatToken): Self = this.set("fullDateWithWeekday", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullTime(value: TLibFormatToken): Self = this.set("fullTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullTime12h(value: TLibFormatToken): Self = this.set("fullTime12h", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullTime24h(value: TLibFormatToken): Self = this.set("fullTime24h", value.asInstanceOf[js.Any])
    @scala.inline
    def setHours12h(value: TLibFormatToken): Self = this.set("hours12h", value.asInstanceOf[js.Any])
    @scala.inline
    def setHours24h(value: TLibFormatToken): Self = this.set("hours24h", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyboardDate(value: TLibFormatToken): Self = this.set("keyboardDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyboardDateTime(value: TLibFormatToken): Self = this.set("keyboardDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyboardDateTime12h(value: TLibFormatToken): Self = this.set("keyboardDateTime12h", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyboardDateTime24h(value: TLibFormatToken): Self = this.set("keyboardDateTime24h", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinutes(value: TLibFormatToken): Self = this.set("minutes", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonth(value: TLibFormatToken): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthAndDate(value: TLibFormatToken): Self = this.set("monthAndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthAndYear(value: TLibFormatToken): Self = this.set("monthAndYear", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthShort(value: TLibFormatToken): Self = this.set("monthShort", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalDate(value: TLibFormatToken): Self = this.set("normalDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalDateWithWeekday(value: TLibFormatToken): Self = this.set("normalDateWithWeekday", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeconds(value: TLibFormatToken): Self = this.set("seconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortDate(value: TLibFormatToken): Self = this.set("shortDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekday(value: TLibFormatToken): Self = this.set("weekday", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekdayShort(value: TLibFormatToken): Self = this.set("weekdayShort", value.asInstanceOf[js.Any])
    @scala.inline
    def setYear(value: TLibFormatToken): Self = this.set("year", value.asInstanceOf[js.Any])
  }
  
}

