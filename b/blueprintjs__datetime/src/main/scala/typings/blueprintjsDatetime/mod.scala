package typings.blueprintjsDatetime

import typings.blueprintjsDatetime.anon.PartialIDateInputProps
import typings.blueprintjsDatetime.anon.PartialIDateRangeInputPro
import typings.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typings.blueprintjsDatetime.blueprintjsDatetimeStrings.millisecond
import typings.blueprintjsDatetime.blueprintjsDatetimeStrings.minute
import typings.blueprintjsDatetime.blueprintjsDatetimeStrings.second
import typings.blueprintjsDatetime.datePickerMod.IDatePickerProps
import typings.blueprintjsDatetime.dateRangeInputMod.IDateRangeInputProps
import typings.blueprintjsDatetime.dateRangeMod.DateRange
import typings.blueprintjsDatetime.dateRangePickerMod.IDateRangePickerProps
import typings.blueprintjsDatetime.dateTimePickerMod.IDateTimePickerProps
import typings.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/datetime", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object Classes extends js.Object {
    
    val DATEINPUT: String = js.native
    
    val DATEINPUT_POPOVER: String = js.native
    
    val DATEPICKER: String = js.native
    
    val DATEPICKER_CAPTION: String = js.native
    
    val DATEPICKER_CAPTION_CARET: String = js.native
    
    val DATEPICKER_CAPTION_MEASURE: String = js.native
    
    val DATEPICKER_CAPTION_SELECT: String = js.native
    
    val DATEPICKER_DAY: /* "DayPicker-Day" */ String = js.native
    
    val DATEPICKER_DAY_DISABLED: String = js.native
    
    val DATEPICKER_DAY_IS_TODAY: String = js.native
    
    val DATEPICKER_DAY_OUTSIDE: String = js.native
    
    val DATEPICKER_DAY_SELECTED: String = js.native
    
    val DATEPICKER_DAY_WRAPPER: String = js.native
    
    val DATEPICKER_FOOTER: String = js.native
    
    val DATEPICKER_MONTH_SELECT: String = js.native
    
    val DATEPICKER_NAVBAR: String = js.native
    
    val DATEPICKER_NAVBUTTON: /* "DayPicker-NavButton" */ String = js.native
    
    val DATEPICKER_TIMEPICKER_WRAPPER: String = js.native
    
    val DATEPICKER_YEAR_SELECT: String = js.native
    
    val DATERANGEPICKER: String = js.native
    
    val DATERANGEPICKER_CONTIGUOUS: String = js.native
    
    val DATERANGEPICKER_DAY_HOVERED_RANGE: String = js.native
    
    val DATERANGEPICKER_DAY_SELECTED_RANGE: String = js.native
    
    val DATERANGEPICKER_SHORTCUTS: String = js.native
    
    val DATERANGEPICKER_SINGLE_MONTH: String = js.native
    
    val DATERANGEPICKER_TIMEPICKERS: String = js.native
    
    val DATETIMEPICKER: String = js.native
    
    val TIMEPICKER: String = js.native
    
    val TIMEPICKER_AMPM_SELECT: String = js.native
    
    val TIMEPICKER_ARROW_BUTTON: String = js.native
    
    val TIMEPICKER_ARROW_ROW: String = js.native
    
    val TIMEPICKER_DIVIDER_TEXT: String = js.native
    
    val TIMEPICKER_HOUR: String = js.native
    
    val TIMEPICKER_INPUT: String = js.native
    
    val TIMEPICKER_INPUT_ROW: String = js.native
    
    val TIMEPICKER_MILLISECOND: String = js.native
    
    val TIMEPICKER_MINUTE: String = js.native
    
    val TIMEPICKER_SECOND: String = js.native
  }
  
  @js.native
  class DateInput ()
    extends typings.blueprintjsDatetime.dateInputMod.DateInput
  /* static members */
  @js.native
  object DateInput extends js.Object {
    
    var defaultProps: PartialIDateInputProps = js.native
    
    var displayName: String = js.native
  }
  
  @js.native
  class DatePicker protected ()
    extends typings.blueprintjsDatetime.datePickerMod.DatePicker {
    def this(props: IDatePickerProps) = this()
    def this(props: IDatePickerProps, context: js.Any) = this()
  }
  /* static members */
  @js.native
  object DatePicker extends js.Object {
    
    var defaultProps: IDatePickerProps = js.native
    
    var displayName: String = js.native
  }
  
  @js.native
  class DateRangeInput protected ()
    extends typings.blueprintjsDatetime.dateRangeInputMod.DateRangeInput {
    def this(props: IDateRangeInputProps) = this()
    def this(props: IDateRangeInputProps, context: js.Any) = this()
  }
  /* static members */
  @js.native
  object DateRangeInput extends js.Object {
    
    var defaultProps: PartialIDateRangeInputPro = js.native
    
    var displayName: String = js.native
  }
  
  @js.native
  class DateRangePicker protected ()
    extends typings.blueprintjsDatetime.dateRangePickerMod.DateRangePicker {
    def this(props: IDateRangePickerProps) = this()
    def this(props: IDateRangePickerProps, context: js.Any) = this()
  }
  /* static members */
  @js.native
  object DateRangePicker extends js.Object {
    
    var defaultProps: IDateRangePickerProps = js.native
    
    var displayName: String = js.native
  }
  
  @js.native
  class DateTimePicker ()
    extends typings.blueprintjsDatetime.dateTimePickerMod.DateTimePicker {
    def this(props: IDateTimePickerProps) = this()
    def this(props: js.UndefOr[scala.Nothing], context: js.Any) = this()
    def this(props: IDateTimePickerProps, context: js.Any) = this()
  }
  /* static members */
  @js.native
  object DateTimePicker extends js.Object {
    
    var defaultProps: IDateTimePickerProps = js.native
    
    var displayName: String = js.native
  }
  
  @js.native
  object DateUtils extends js.Object {
    
    def areEqual(date1: Date, date2: Date): Boolean = js.native
    
    def areRangesEqual(dateRange1: DateRange, dateRange2: DateRange): Boolean = js.native
    
    def areSameDay(date1: Date, date2: Date): Boolean = js.native
    
    def areSameMonth(date1: Date, date2: Date): Boolean = js.native
    
    def areSameTime(date1: Date, date2: Date): Boolean = js.native
    
    def clone(d: Date): Date = js.native
    
    def convert24HourMeridiem(hour: Double, toPm: Boolean): Double = js.native
    
    def get12HourFrom24Hour(hour: Double): Double = js.native
    
    def get24HourFrom12Hour(hour: Double, isPm: Boolean): Double = js.native
    
    def getDateBetween(dateRange: DateRange): Date = js.native
    
    def getDateNextMonth(date: Date): Date = js.native
    
    def getDateOnlyWithTime(date: Date): Date = js.native
    
    def getDatePreviousMonth(date: Date): Date = js.native
    
    def getDateTime(): Date = js.native
    def getDateTime(date: Null, time: Date): Date = js.native
    def getDateTime(date: Date): Date = js.native
    def getDateTime(date: Date, time: Date): Date = js.native
    
    def getIsPmFrom24Hour(hour: Double): Boolean = js.native
    
    def getTimeInRange(time: Date, minTime: Date, maxTime: Date): Date = js.native
    
    def isDateValid(): /* is std.Date */ Boolean = js.native
    def isDateValid(date: Date): /* is std.Date */ Boolean = js.native
    @JSName("isDateValid")
    def isDateValid_false(date: `false`): /* is std.Date */ Boolean = js.native
    
    def isDayInRange(date: Date, dateRange: DateRange): Boolean = js.native
    def isDayInRange(date: Date, dateRange: DateRange, exclusive: Boolean): Boolean = js.native
    
    def isDayRangeInRange(innerRange: DateRange, outerRange: DateRange): Boolean = js.native
    
    def isMonthInRange(date: Date, dateRange: DateRange): Boolean = js.native
    
    def isTimeEqualOrGreaterThan(time: Date, timeToCompare: Date): Boolean = js.native
    
    def isTimeEqualOrSmallerThan(time: Date, timeToCompare: Date): Boolean = js.native
    
    def isTimeInRange(date: Date, minDate: Date, maxDate: Date): Boolean = js.native
    
    def isTimeSameOrAfter(date: Date, dateToCompare: Date): Boolean = js.native
    
    def isToday(date: Date): Boolean = js.native
  }
  
  @js.native
  trait IDatePickerLocaleUtils extends js.Object {
    
    def formatDate(date: Date): String = js.native
    def formatDate(date: Date, format: js.UndefOr[scala.Nothing], locale: String): String = js.native
    def formatDate(date: Date, format: String): String = js.native
    def formatDate(date: Date, format: String, locale: String): String = js.native
    def formatDate(date: Date, format: js.Array[String]): String = js.native
    def formatDate(date: Date, format: js.Array[String], locale: String): String = js.native
    
    def formatDay(day: Date): String = js.native
    def formatDay(day: Date, locale: String): String = js.native
    
    def formatMonthTitle(month: Date): String = js.native
    def formatMonthTitle(month: Date, locale: String): String = js.native
    
    def formatWeekdayLong(weekday: Double): String = js.native
    def formatWeekdayLong(weekday: Double, locale: String): String = js.native
    
    def formatWeekdayShort(weekday: Double): String = js.native
    def formatWeekdayShort(weekday: Double, locale: String): String = js.native
    
    def getFirstDayOfWeek(): Double = js.native
    def getFirstDayOfWeek(locale: String): Double = js.native
    
    def getMonths(): js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
    def getMonths(locale: String): js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
    
    def parseDate(str: String): Date = js.native
    def parseDate(str: String, format: js.UndefOr[scala.Nothing], locale: String): Date = js.native
    def parseDate(str: String, format: String): Date = js.native
    def parseDate(str: String, format: String, locale: String): Date = js.native
  }
  
  @js.native
  object Months extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.blueprintjsDatetime.monthsMod.Months with Double] = js.native
    
    /* 3 */ val APRIL: typings.blueprintjsDatetime.monthsMod.Months.APRIL with Double = js.native
    
    /* 7 */ val AUGUST: typings.blueprintjsDatetime.monthsMod.Months.AUGUST with Double = js.native
    
    /* 11 */ val DECEMBER: typings.blueprintjsDatetime.monthsMod.Months.DECEMBER with Double = js.native
    
    /* 1 */ val FEBRUARY: typings.blueprintjsDatetime.monthsMod.Months.FEBRUARY with Double = js.native
    
    /* 0 */ val JANUARY: typings.blueprintjsDatetime.monthsMod.Months.JANUARY with Double = js.native
    
    /* 6 */ val JULY: typings.blueprintjsDatetime.monthsMod.Months.JULY with Double = js.native
    
    /* 5 */ val JUNE: typings.blueprintjsDatetime.monthsMod.Months.JUNE with Double = js.native
    
    /* 2 */ val MARCH: typings.blueprintjsDatetime.monthsMod.Months.MARCH with Double = js.native
    
    /* 4 */ val MAY: typings.blueprintjsDatetime.monthsMod.Months.MAY with Double = js.native
    
    /* 10 */ val NOVEMBER: typings.blueprintjsDatetime.monthsMod.Months.NOVEMBER with Double = js.native
    
    /* 9 */ val OCTOBER: typings.blueprintjsDatetime.monthsMod.Months.OCTOBER with Double = js.native
    
    /* 8 */ val SEPTEMBER: typings.blueprintjsDatetime.monthsMod.Months.SEPTEMBER with Double = js.native
  }
  
  @js.native
  class TimePicker ()
    extends typings.blueprintjsDatetime.timePickerMod.TimePicker {
    def this(props: ITimePickerProps) = this()
    def this(props: js.UndefOr[scala.Nothing], context: js.Any) = this()
    def this(props: ITimePickerProps, context: js.Any) = this()
  }
  /* static members */
  @js.native
  object TimePicker extends js.Object {
    
    var defaultProps: ITimePickerProps = js.native
    
    var displayName: String = js.native
  }
  
  @js.native
  object TimePrecision extends js.Object {
    
    var MILLISECOND: millisecond = js.native
    
    var MINUTE: minute = js.native
    
    var SECOND: second = js.native
  }
  
  @js.native
  object TimeUnit extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.blueprintjsDatetime.timeUnitMod.TimeUnit with String] = js.native
    
    /* "hour12" */ val HOUR_12: typings.blueprintjsDatetime.timeUnitMod.TimeUnit.HOUR_12 with String = js.native
    
    /* "hour24" */ val HOUR_24: typings.blueprintjsDatetime.timeUnitMod.TimeUnit.HOUR_24 with String = js.native
    
    /* "minute" */ val MINUTE: typings.blueprintjsDatetime.timeUnitMod.TimeUnit.MINUTE with String = js.native
    
    /* "ms" */ val MS: typings.blueprintjsDatetime.timeUnitMod.TimeUnit.MS with String = js.native
    
    /* "second" */ val SECOND: typings.blueprintjsDatetime.timeUnitMod.TimeUnit.SECOND with String = js.native
  }
}
