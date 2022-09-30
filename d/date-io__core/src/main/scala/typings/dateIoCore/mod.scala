package typings.dateIoCore

import typings.dateIoCore.dateIoCoreStrings.am
import typings.dateIoCore.dateIoCoreStrings.dayOfMonth
import typings.dateIoCore.dateIoCoreStrings.fullDate
import typings.dateIoCore.dateIoCoreStrings.fullDateTime
import typings.dateIoCore.dateIoCoreStrings.fullDateTime12h
import typings.dateIoCore.dateIoCoreStrings.fullDateTime24h
import typings.dateIoCore.dateIoCoreStrings.fullDateWithWeekday
import typings.dateIoCore.dateIoCoreStrings.fullTime
import typings.dateIoCore.dateIoCoreStrings.fullTime12h
import typings.dateIoCore.dateIoCoreStrings.fullTime24h
import typings.dateIoCore.dateIoCoreStrings.hours12h
import typings.dateIoCore.dateIoCoreStrings.hours24h
import typings.dateIoCore.dateIoCoreStrings.keyboardDate
import typings.dateIoCore.dateIoCoreStrings.keyboardDateTime
import typings.dateIoCore.dateIoCoreStrings.keyboardDateTime12h
import typings.dateIoCore.dateIoCoreStrings.keyboardDateTime24h
import typings.dateIoCore.dateIoCoreStrings.minutes
import typings.dateIoCore.dateIoCoreStrings.month
import typings.dateIoCore.dateIoCoreStrings.monthAndDate
import typings.dateIoCore.dateIoCoreStrings.monthAndYear
import typings.dateIoCore.dateIoCoreStrings.monthShort
import typings.dateIoCore.dateIoCoreStrings.normalDate
import typings.dateIoCore.dateIoCoreStrings.normalDateWithWeekday
import typings.dateIoCore.dateIoCoreStrings.pm
import typings.dateIoCore.dateIoCoreStrings.seconds
import typings.dateIoCore.dateIoCoreStrings.shortDate
import typings.dateIoCore.dateIoCoreStrings.weekday
import typings.dateIoCore.dateIoCoreStrings.weekdayShort
import typings.dateIoCore.dateIoCoreStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait DateIOFormats[TLibFormatToken] extends StObject {
    
    /** Day format string @example "1" */
    var dayOfMonth: TLibFormatToken
    
    /** Localized full date @example "Jan 1, 2019" */
    var fullDate: TLibFormatToken
    
    /** Date & time format string with localized time @example "Jan 1, 2018 11:44 PM" */
    var fullDateTime: TLibFormatToken
    
    /** Not localized date & Time format 12h @example "Jan 1, 2018 11:44 PM" */
    var fullDateTime12h: TLibFormatToken
    
    /** Not localized date & Time format 24h @example "Jan 1, 2018 23:44" */
    var fullDateTime24h: TLibFormatToken
    
    /** Partially localized full date with weekday, useful for text-to-speech accessibility @example "Tuesday, January 1, 2019" */
    var fullDateWithWeekday: TLibFormatToken
    
    /** Full time localized format string @example "11:44 PM" for US, "23:44" for Europe */
    var fullTime: TLibFormatToken
    
    /** Not localized full time format string @example "11:44 PM" */
    var fullTime12h: TLibFormatToken
    
    /** Not localized full time format string @example "23:44" */
    var fullTime24h: TLibFormatToken
    
    /** Hours format string @example "11" */
    var hours12h: TLibFormatToken
    
    /** Hours format string @example "23" */
    var hours24h: TLibFormatToken
    
    /** Localized keyboard input friendly date format @example "02/13/2020 */
    var keyboardDate: TLibFormatToken
    
    /** Localized keyboard input friendly date/time format @example "02/13/2020 23:44" */
    var keyboardDateTime: TLibFormatToken
    
    /** Partially localized keyboard input friendly date/time 12h format @example "02/13/2020 11:44 PM" */
    var keyboardDateTime12h: TLibFormatToken
    
    /** Partially localized keyboard input friendly date/time 24h format @example "02/13/2020 23:44" */
    var keyboardDateTime24h: TLibFormatToken
    
    /** Minutes format string @example "44" */
    var minutes: TLibFormatToken
    
    /** Month format string @example "January" */
    var month: TLibFormatToken
    
    /** Month with date format string @example "January 1" */
    var monthAndDate: TLibFormatToken
    
    /** Month with year format string @example "January 2018" */
    var monthAndYear: TLibFormatToken
    
    /** Short month format string @example "Jan" */
    var monthShort: TLibFormatToken
    
    /** Date format string with month and day of month @example "1 January" */
    var normalDate: TLibFormatToken
    
    /** Date format string with weekday, month and day of month @example "Wed, Jan 1" */
    var normalDateWithWeekday: TLibFormatToken
    
    /** Seconds format string @example "00" */
    var seconds: TLibFormatToken
    
    /** Shorter day format @example "Jan 1" */
    var shortDate: TLibFormatToken
    
    /** Weekday format string @example "Wednesday" */
    var weekday: TLibFormatToken
    
    /** Short weekday format string @example "Wed" */
    var weekdayShort: TLibFormatToken
    
    /** Year format string @example "2019" */
    var year: TLibFormatToken
  }
  object DateIOFormats {
    
    inline def apply[TLibFormatToken](
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
    
    extension [Self <: DateIOFormats[?], TLibFormatToken](x: Self & DateIOFormats[TLibFormatToken]) {
      
      inline def setDayOfMonth(value: TLibFormatToken): Self = StObject.set(x, "dayOfMonth", value.asInstanceOf[js.Any])
      
      inline def setFullDate(value: TLibFormatToken): Self = StObject.set(x, "fullDate", value.asInstanceOf[js.Any])
      
      inline def setFullDateTime(value: TLibFormatToken): Self = StObject.set(x, "fullDateTime", value.asInstanceOf[js.Any])
      
      inline def setFullDateTime12h(value: TLibFormatToken): Self = StObject.set(x, "fullDateTime12h", value.asInstanceOf[js.Any])
      
      inline def setFullDateTime24h(value: TLibFormatToken): Self = StObject.set(x, "fullDateTime24h", value.asInstanceOf[js.Any])
      
      inline def setFullDateWithWeekday(value: TLibFormatToken): Self = StObject.set(x, "fullDateWithWeekday", value.asInstanceOf[js.Any])
      
      inline def setFullTime(value: TLibFormatToken): Self = StObject.set(x, "fullTime", value.asInstanceOf[js.Any])
      
      inline def setFullTime12h(value: TLibFormatToken): Self = StObject.set(x, "fullTime12h", value.asInstanceOf[js.Any])
      
      inline def setFullTime24h(value: TLibFormatToken): Self = StObject.set(x, "fullTime24h", value.asInstanceOf[js.Any])
      
      inline def setHours12h(value: TLibFormatToken): Self = StObject.set(x, "hours12h", value.asInstanceOf[js.Any])
      
      inline def setHours24h(value: TLibFormatToken): Self = StObject.set(x, "hours24h", value.asInstanceOf[js.Any])
      
      inline def setKeyboardDate(value: TLibFormatToken): Self = StObject.set(x, "keyboardDate", value.asInstanceOf[js.Any])
      
      inline def setKeyboardDateTime(value: TLibFormatToken): Self = StObject.set(x, "keyboardDateTime", value.asInstanceOf[js.Any])
      
      inline def setKeyboardDateTime12h(value: TLibFormatToken): Self = StObject.set(x, "keyboardDateTime12h", value.asInstanceOf[js.Any])
      
      inline def setKeyboardDateTime24h(value: TLibFormatToken): Self = StObject.set(x, "keyboardDateTime24h", value.asInstanceOf[js.Any])
      
      inline def setMinutes(value: TLibFormatToken): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: TLibFormatToken): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthAndDate(value: TLibFormatToken): Self = StObject.set(x, "monthAndDate", value.asInstanceOf[js.Any])
      
      inline def setMonthAndYear(value: TLibFormatToken): Self = StObject.set(x, "monthAndYear", value.asInstanceOf[js.Any])
      
      inline def setMonthShort(value: TLibFormatToken): Self = StObject.set(x, "monthShort", value.asInstanceOf[js.Any])
      
      inline def setNormalDate(value: TLibFormatToken): Self = StObject.set(x, "normalDate", value.asInstanceOf[js.Any])
      
      inline def setNormalDateWithWeekday(value: TLibFormatToken): Self = StObject.set(x, "normalDateWithWeekday", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: TLibFormatToken): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setShortDate(value: TLibFormatToken): Self = StObject.set(x, "shortDate", value.asInstanceOf[js.Any])
      
      inline def setWeekday(value: TLibFormatToken): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      inline def setWeekdayShort(value: TLibFormatToken): Self = StObject.set(x, "weekdayShort", value.asInstanceOf[js.Any])
      
      inline def setYear(value: TLibFormatToken): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExtendableDateType extends StObject
  
  @js.native
  trait IUtils[TDate /* <: ExtendableDateType */] extends StObject {
    
    def addDays(value: TDate, count: Double): TDate = js.native
    
    def addHours(value: TDate, count: Double): TDate = js.native
    
    def addMinutes(value: TDate, count: Double): TDate = js.native
    
    def addMonths(value: TDate, count: Double): TDate = js.native
    
    def addSeconds(value: TDate, count: Double): TDate = js.native
    
    def addWeeks(value: TDate, count: Double): TDate = js.native
    
    def addYears(value: TDate, count: Double): TDate = js.native
    
    // constructor (options?: { formats?: DateIOFormats, locale?: any, instance?: any });
    def date(): TDate | Null = js.native
    def date(value: Any): TDate | Null = js.native
    
    var dayjs: js.UndefOr[Any] = js.native
    
    def endOfDay(value: TDate): TDate = js.native
    
    def endOfMonth(value: TDate): TDate = js.native
    
    def endOfWeek(value: TDate): TDate = js.native
    
    def endOfYear(value: TDate): TDate = js.native
    
    def format(
      value: TDate,
      formatKey: /* keyof @date-io/core.@date-io/core/IUtils.DateIOFormats<string> */ fullDate | fullDateWithWeekday | normalDate | normalDateWithWeekday | shortDate | year | month | monthShort | monthAndYear | monthAndDate | weekday | weekdayShort | dayOfMonth | hours12h | hours24h | minutes | seconds | fullTime | fullTime12h | fullTime24h | fullDateTime | fullDateTime12h | fullDateTime24h | keyboardDate | keyboardDateTime | keyboardDateTime12h | keyboardDateTime24h
    ): String = js.native
    
    def formatByString(value: TDate, formatString: String): String = js.native
    
    def formatNumber(numberToFormat: String): String = js.native
    
    var formats: DateIOFormats[Any] = js.native
    
    def getCurrentLocaleCode(): String = js.native
    
    def getDate(value: TDate): Double = js.native
    
    def getDaysInMonth(value: TDate): Double = js.native
    
    def getDiff(value: TDate, comparing: TDate): Double = js.native
    def getDiff(value: TDate, comparing: TDate, unit: Unit): Double = js.native
    def getDiff(value: TDate, comparing: String): Double = js.native
    def getDiff(value: TDate, comparing: String, unit: Unit): Double = js.native
    
    /** Returns user readable format (taking into account localized format tokens), useful to render helper text for input (e.g. placeholder). For luxon always returns empty string. */
    def getFormatHelperText(format: String): String = js.native
    
    def getHours(value: TDate): Double = js.native
    
    /** Allow to customize displaying "am/pm" strings */
    def getMeridiemText(ampm: am | pm): String = js.native
    
    def getMinutes(value: TDate): Double = js.native
    
    def getMonth(value: TDate): Double = js.native
    
    def getMonthArray(value: TDate): js.Array[TDate] = js.native
    
    def getNextMonth(value: TDate): TDate = js.native
    
    def getPreviousMonth(value: TDate): TDate = js.native
    
    def getSeconds(value: TDate): Double = js.native
    
    def getWeekArray(date: TDate): js.Array[js.Array[TDate]] = js.native
    
    def getWeekdays(): js.Array[String] = js.native
    
    def getYear(value: TDate): Double = js.native
    
    def getYearRange(start: TDate, end: TDate): js.Array[TDate] = js.native
    
    def is12HourCycleInCurrentLocale(): Boolean = js.native
    
    def isAfter(value: TDate, comparing: TDate): Boolean = js.native
    
    def isAfterDay(value: TDate, comparing: TDate): Boolean = js.native
    
    def isAfterYear(value: TDate, comparing: TDate): Boolean = js.native
    
    def isBefore(value: TDate, comparing: TDate): Boolean = js.native
    
    def isBeforeDay(value: TDate, comparing: TDate): Boolean = js.native
    
    def isBeforeYear(value: TDate, comparing: TDate): Boolean = js.native
    
    def isEqual(value: Any, comparing: Any): Boolean = js.native
    
    def isNull(): Boolean = js.native
    def isNull(value: TDate): Boolean = js.native
    
    def isSameDay(value: TDate, comparing: TDate): Boolean = js.native
    
    def isSameHour(value: TDate, comparing: TDate): Boolean = js.native
    
    def isSameMonth(value: TDate, comparing: TDate): Boolean = js.native
    
    def isSameYear(value: TDate, comparing: TDate): Boolean = js.native
    
    def isValid(value: Any): Boolean = js.native
    
    def isWithinRange(value: TDate, range: js.Tuple2[TDate, TDate]): Boolean = js.native
    
    /** Name of the library that is used right now */
    var lib: String = js.native
    
    var locale: js.UndefOr[Any] = js.native
    
    def mergeDateAndTime(date: TDate, time: TDate): TDate = js.native
    
    var moment: js.UndefOr[Any] = js.native
    
    def parse(value: String, format: String): TDate | Null = js.native
    
    def parseISO(isString: String): TDate = js.native
    
    def setDate(value: TDate, count: Double): TDate = js.native
    
    def setHours(value: TDate, count: Double): TDate = js.native
    
    def setMinutes(value: TDate, count: Double): TDate = js.native
    
    def setMonth(value: TDate, count: Double): TDate = js.native
    
    def setSeconds(value: TDate, count: Double): TDate = js.native
    
    def setYear(value: TDate, count: Double): TDate = js.native
    
    def startOfDay(value: TDate): TDate = js.native
    
    def startOfMonth(value: TDate): TDate = js.native
    
    def startOfWeek(value: TDate): TDate = js.native
    
    def startOfYear(value: TDate): TDate = js.native
    
    def toISO(value: TDate): String = js.native
    
    def toJsDate(value: TDate): js.Date = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dateIoCore.dateIoCoreStrings.years
    - typings.dateIoCore.dateIoCoreStrings.quarters
    - typings.dateIoCore.dateIoCoreStrings.months
    - typings.dateIoCore.dateIoCoreStrings.weeks
    - typings.dateIoCore.dateIoCoreStrings.days
    - typings.dateIoCore.dateIoCoreStrings.hours
    - typings.dateIoCore.dateIoCoreStrings.minutes
    - typings.dateIoCore.dateIoCoreStrings.seconds
    - typings.dateIoCore.dateIoCoreStrings.milliseconds
  */
  trait Unit extends StObject
  object Unit {
    
    inline def days: typings.dateIoCore.dateIoCoreStrings.days = "days".asInstanceOf[typings.dateIoCore.dateIoCoreStrings.days]
    
    inline def hours: typings.dateIoCore.dateIoCoreStrings.hours = "hours".asInstanceOf[typings.dateIoCore.dateIoCoreStrings.hours]
    
    inline def milliseconds: typings.dateIoCore.dateIoCoreStrings.milliseconds = "milliseconds".asInstanceOf[typings.dateIoCore.dateIoCoreStrings.milliseconds]
    
    inline def minutes: typings.dateIoCore.dateIoCoreStrings.minutes = "minutes".asInstanceOf[typings.dateIoCore.dateIoCoreStrings.minutes]
    
    inline def months: typings.dateIoCore.dateIoCoreStrings.months = "months".asInstanceOf[typings.dateIoCore.dateIoCoreStrings.months]
    
    inline def quarters: typings.dateIoCore.dateIoCoreStrings.quarters = "quarters".asInstanceOf[typings.dateIoCore.dateIoCoreStrings.quarters]
    
    inline def seconds: typings.dateIoCore.dateIoCoreStrings.seconds = "seconds".asInstanceOf[typings.dateIoCore.dateIoCoreStrings.seconds]
    
    inline def weeks: typings.dateIoCore.dateIoCoreStrings.weeks = "weeks".asInstanceOf[typings.dateIoCore.dateIoCoreStrings.weeks]
    
    inline def years: typings.dateIoCore.dateIoCoreStrings.years = "years".asInstanceOf[typings.dateIoCore.dateIoCoreStrings.years]
  }
}
