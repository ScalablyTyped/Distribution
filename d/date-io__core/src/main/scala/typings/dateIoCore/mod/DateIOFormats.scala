package typings.dateIoCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateIOFormats[TLibFormatToken] extends js.Object {
  /** Day format string @example "12" */
  var dayOfMonth: TLibFormatToken
  /** Localized full date, useful for accessibility @example "January 1st, 2019" */
  var fullDate: TLibFormatToken
  /** Date & time format string with localized time @example "2018, Jan 1st 11:44 PM" */
  var fullDateTime: TLibFormatToken
  /** Not localized date & Time format 12h @example "2018, Jan 1st 11:44 PM" */
  var fullDateTime12h: TLibFormatToken
  /** Not localized date & Time format 24h @example "2018, Jan 1st 23:44" */
  var fullDateTime24h: TLibFormatToken
  /** Full time localized format string @example "11:44 PM" for US, "23:44" for Europe */
  var fullTime: TLibFormatToken
  /** Not localized full time format string @example "11:44 PM" */
  var fullTime12h: TLibFormatToken
  /** Not localized full time format string @example "23:59" */
  var fullTime24h: TLibFormatToken
  /** Hours format string @example "11" */
  var hours12h: TLibFormatToken
  /** Hours format string @example "23" */
  var hours24h: TLibFormatToken
  /** Localized keyboard input friendly date format @example "2019/01/01" */
  var keyboardDate: TLibFormatToken
  /** Localized keyboard input friendly date/time format @example "2019/01/01 23:44" */
  var keyboardDateTime: TLibFormatToken
  /** Not Localized keyboard input friendly date/time 12h format @example "2019/01/01 11:44 PM" */
  var keyboardDateTime12h: TLibFormatToken
  /** Not localized keyboard input friendly date/time 24h format @example "2019/01/01 23:44" */
  var keyboardDateTime24h: TLibFormatToken
  /** Minutes format string @example "59" */
  var minutes: TLibFormatToken
  /** Month format string @example "January" */
  var month: TLibFormatToken
  /** Month with date format string @example "January 1st" */
  var monthAndDate: TLibFormatToken
  /** Short month format string @example "January 2018" */
  var monthAndYear: TLibFormatToken
  /** Short month format string @example "Jan" */
  var monthShort: TLibFormatToken
  /** Date format string with month and day of month @example "01 January" */
  var normalDate: TLibFormatToken
  /** Date format string with weekday, month and day of month @example "Wed, Jan 1st" */
  var normalDateWithWeekday: TLibFormatToken
  /** Seconds format string @example "59" */
  var seconds: TLibFormatToken
  /** Shorter day format @example "1 January" */
  var shortDate: TLibFormatToken
  /** Year format string @example "2019" */
  var year: TLibFormatToken
}

object DateIOFormats {
  @scala.inline
  def apply[TLibFormatToken](
    dayOfMonth: TLibFormatToken,
    fullDate: TLibFormatToken,
    fullDateTime: TLibFormatToken,
    fullDateTime12h: TLibFormatToken,
    fullDateTime24h: TLibFormatToken,
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
    year: TLibFormatToken
  ): DateIOFormats[TLibFormatToken] = {
    val __obj = js.Dynamic.literal(dayOfMonth = dayOfMonth.asInstanceOf[js.Any], fullDate = fullDate.asInstanceOf[js.Any], fullDateTime = fullDateTime.asInstanceOf[js.Any], fullDateTime12h = fullDateTime12h.asInstanceOf[js.Any], fullDateTime24h = fullDateTime24h.asInstanceOf[js.Any], fullTime = fullTime.asInstanceOf[js.Any], fullTime12h = fullTime12h.asInstanceOf[js.Any], fullTime24h = fullTime24h.asInstanceOf[js.Any], hours12h = hours12h.asInstanceOf[js.Any], hours24h = hours24h.asInstanceOf[js.Any], keyboardDate = keyboardDate.asInstanceOf[js.Any], keyboardDateTime = keyboardDateTime.asInstanceOf[js.Any], keyboardDateTime12h = keyboardDateTime12h.asInstanceOf[js.Any], keyboardDateTime24h = keyboardDateTime24h.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], monthAndDate = monthAndDate.asInstanceOf[js.Any], monthAndYear = monthAndYear.asInstanceOf[js.Any], monthShort = monthShort.asInstanceOf[js.Any], normalDate = normalDate.asInstanceOf[js.Any], normalDateWithWeekday = normalDateWithWeekday.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], shortDate = shortDate.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateIOFormats[TLibFormatToken]]
  }
}

