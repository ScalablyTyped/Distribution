package typings.blueprintjsDatetime

import typings.blueprintjsDatetime.anon.PartialIDateInputProps
import typings.blueprintjsDatetime.anon.PartialIDateRangeInputPro
import typings.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typings.blueprintjsDatetime.blueprintjsDatetimeStrings.millisecond
import typings.blueprintjsDatetime.blueprintjsDatetimeStrings.minute
import typings.blueprintjsDatetime.blueprintjsDatetimeStrings.second
import typings.blueprintjsDatetime.dateInputMod.IDateInputProps
import typings.blueprintjsDatetime.datePickerMod.IDatePickerProps
import typings.blueprintjsDatetime.dateRangeInputMod.IDateRangeInputProps
import typings.blueprintjsDatetime.dateRangeMod.DateRange
import typings.blueprintjsDatetime.dateRangePickerMod.IDateRangePickerProps
import typings.blueprintjsDatetime.dateTimePickerMod.IDateTimePickerProps
import typings.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Classes {
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEINPUT")
    @js.native
    val DATEINPUT: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEINPUT_POPOVER")
    @js.native
    val DATEINPUT_POPOVER: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER")
    @js.native
    val DATEPICKER: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_CAPTION")
    @js.native
    val DATEPICKER_CAPTION: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_CAPTION_CARET")
    @js.native
    val DATEPICKER_CAPTION_CARET: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_CAPTION_MEASURE")
    @js.native
    val DATEPICKER_CAPTION_MEASURE: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_CAPTION_SELECT")
    @js.native
    val DATEPICKER_CAPTION_SELECT: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_DAY")
    @js.native
    val DATEPICKER_DAY: /* "DayPicker-Day" */ String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_DAY_DISABLED")
    @js.native
    val DATEPICKER_DAY_DISABLED: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_DAY_IS_TODAY")
    @js.native
    val DATEPICKER_DAY_IS_TODAY: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_DAY_OUTSIDE")
    @js.native
    val DATEPICKER_DAY_OUTSIDE: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_DAY_SELECTED")
    @js.native
    val DATEPICKER_DAY_SELECTED: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_DAY_WRAPPER")
    @js.native
    val DATEPICKER_DAY_WRAPPER: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_FOOTER")
    @js.native
    val DATEPICKER_FOOTER: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_MONTH_SELECT")
    @js.native
    val DATEPICKER_MONTH_SELECT: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_NAVBAR")
    @js.native
    val DATEPICKER_NAVBAR: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_NAVBUTTON")
    @js.native
    val DATEPICKER_NAVBUTTON: /* "DayPicker-NavButton" */ String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_TIMEPICKER_WRAPPER")
    @js.native
    val DATEPICKER_TIMEPICKER_WRAPPER: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_YEAR_SELECT")
    @js.native
    val DATEPICKER_YEAR_SELECT: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATERANGEPICKER")
    @js.native
    val DATERANGEPICKER: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATERANGEPICKER_CONTIGUOUS")
    @js.native
    val DATERANGEPICKER_CONTIGUOUS: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATERANGEPICKER_DAY_HOVERED_RANGE")
    @js.native
    val DATERANGEPICKER_DAY_HOVERED_RANGE: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATERANGEPICKER_DAY_SELECTED_RANGE")
    @js.native
    val DATERANGEPICKER_DAY_SELECTED_RANGE: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATERANGEPICKER_SHORTCUTS")
    @js.native
    val DATERANGEPICKER_SHORTCUTS: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATERANGEPICKER_SINGLE_MONTH")
    @js.native
    val DATERANGEPICKER_SINGLE_MONTH: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATERANGEPICKER_TIMEPICKERS")
    @js.native
    val DATERANGEPICKER_TIMEPICKERS: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATETIMEPICKER")
    @js.native
    val DATETIMEPICKER: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.TIMEPICKER")
    @js.native
    val TIMEPICKER: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.TIMEPICKER_AMPM_SELECT")
    @js.native
    val TIMEPICKER_AMPM_SELECT: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.TIMEPICKER_ARROW_BUTTON")
    @js.native
    val TIMEPICKER_ARROW_BUTTON: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.TIMEPICKER_ARROW_ROW")
    @js.native
    val TIMEPICKER_ARROW_ROW: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.TIMEPICKER_DIVIDER_TEXT")
    @js.native
    val TIMEPICKER_DIVIDER_TEXT: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.TIMEPICKER_HOUR")
    @js.native
    val TIMEPICKER_HOUR: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.TIMEPICKER_INPUT")
    @js.native
    val TIMEPICKER_INPUT: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.TIMEPICKER_INPUT_ROW")
    @js.native
    val TIMEPICKER_INPUT_ROW: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.TIMEPICKER_MILLISECOND")
    @js.native
    val TIMEPICKER_MILLISECOND: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.TIMEPICKER_MINUTE")
    @js.native
    val TIMEPICKER_MINUTE: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.TIMEPICKER_SECOND")
    @js.native
    val TIMEPICKER_SECOND: String = js.native
  }
  
  @JSImport("@blueprintjs/datetime", "DateInput")
  @js.native
  class DateInput protected ()
    extends typings.blueprintjsDatetime.dateInputMod.DateInput {
    def this(props: IDateInputProps) = this()
    def this(props: IDateInputProps, context: js.Any) = this()
  }
  /* static members */
  object DateInput {
    
    @JSImport("@blueprintjs/datetime", "DateInput")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime", "DateInput.defaultProps")
    @js.native
    def defaultProps: PartialIDateInputProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialIDateInputProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime", "DateInput.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/datetime", "DatePicker")
  @js.native
  class DatePicker protected ()
    extends typings.blueprintjsDatetime.datePickerMod.DatePicker {
    def this(props: IDatePickerProps) = this()
    def this(props: IDatePickerProps, context: js.Any) = this()
  }
  /* static members */
  object DatePicker {
    
    @JSImport("@blueprintjs/datetime", "DatePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime", "DatePicker.defaultProps")
    @js.native
    def defaultProps: IDatePickerProps = js.native
    @scala.inline
    def defaultProps_=(x: IDatePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime", "DatePicker.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/datetime", "DateRangeInput")
  @js.native
  class DateRangeInput protected ()
    extends typings.blueprintjsDatetime.dateRangeInputMod.DateRangeInput {
    def this(props: IDateRangeInputProps) = this()
    def this(props: IDateRangeInputProps, context: js.Any) = this()
  }
  /* static members */
  object DateRangeInput {
    
    @JSImport("@blueprintjs/datetime", "DateRangeInput")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime", "DateRangeInput.defaultProps")
    @js.native
    def defaultProps: PartialIDateRangeInputPro = js.native
    @scala.inline
    def defaultProps_=(x: PartialIDateRangeInputPro): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime", "DateRangeInput.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/datetime", "DateRangePicker")
  @js.native
  class DateRangePicker protected ()
    extends typings.blueprintjsDatetime.dateRangePickerMod.DateRangePicker {
    def this(props: IDateRangePickerProps) = this()
    def this(props: IDateRangePickerProps, context: js.Any) = this()
  }
  /* static members */
  object DateRangePicker {
    
    @JSImport("@blueprintjs/datetime", "DateRangePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime", "DateRangePicker.defaultProps")
    @js.native
    def defaultProps: IDateRangePickerProps = js.native
    @scala.inline
    def defaultProps_=(x: IDateRangePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime", "DateRangePicker.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/datetime", "DateTimePicker")
  @js.native
  class DateTimePicker ()
    extends typings.blueprintjsDatetime.dateTimePickerMod.DateTimePicker {
    def this(props: IDateTimePickerProps) = this()
    def this(props: Unit, context: js.Any) = this()
    def this(props: IDateTimePickerProps, context: js.Any) = this()
  }
  /* static members */
  object DateTimePicker {
    
    @JSImport("@blueprintjs/datetime", "DateTimePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime", "DateTimePicker.defaultProps")
    @js.native
    def defaultProps: IDateTimePickerProps = js.native
    @scala.inline
    def defaultProps_=(x: IDateTimePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime", "DateTimePicker.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  object DateUtils {
    
    @JSImport("@blueprintjs/datetime", "DateUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def areEqual(date1: Date, date2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areEqual")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def areRangesEqual(dateRange1: DateRange, dateRange2: DateRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areRangesEqual")(dateRange1.asInstanceOf[js.Any], dateRange2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def areSameDay(date1: Date, date2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areSameDay")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def areSameMonth(date1: Date, date2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areSameMonth")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def areSameTime(date1: Date, date2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areSameTime")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def clone_(d: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(d.asInstanceOf[js.Any]).asInstanceOf[Date]
    
    @scala.inline
    def convert24HourMeridiem(hour: Double, toPm: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convert24HourMeridiem")(hour.asInstanceOf[js.Any], toPm.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def get12HourFrom24Hour(hour: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get12HourFrom24Hour")(hour.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def get24HourFrom12Hour(hour: Double, isPm: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get24HourFrom12Hour")(hour.asInstanceOf[js.Any], isPm.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def getDateBetween(dateRange: DateRange): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDateBetween")(dateRange.asInstanceOf[js.Any]).asInstanceOf[Date]
    
    @scala.inline
    def getDateNextMonth(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDateNextMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
    
    @scala.inline
    def getDateOnlyWithTime(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDateOnlyWithTime")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
    
    @scala.inline
    def getDatePreviousMonth(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatePreviousMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
    
    @scala.inline
    def getDateTime(): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDateTime")().asInstanceOf[Date]
    @scala.inline
    def getDateTime(date: Null, time: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateTime")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def getDateTime(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDateTime")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
    @scala.inline
    def getDateTime(date: Date, time: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateTime")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @scala.inline
    def getIsPmFrom24Hour(hour: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getIsPmFrom24Hour")(hour.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def getTimeInRange(time: Date, minTime: Date, maxTime: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeInRange")(time.asInstanceOf[js.Any], minTime.asInstanceOf[js.Any], maxTime.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @scala.inline
    def isDateValid(): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateValid")().asInstanceOf[/* is std.Date */ Boolean]
    @scala.inline
    def isDateValid(date: Date): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateValid")(date.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
    
    @scala.inline
    def isDateValid_false(date: `false`): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateValid")(date.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
    
    @scala.inline
    def isDayInRange(date: Date, dateRange: DateRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDayInRange")(date.asInstanceOf[js.Any], dateRange.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def isDayInRange(date: Date, dateRange: DateRange, exclusive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDayInRange")(date.asInstanceOf[js.Any], dateRange.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isDayRangeInRange(innerRange: DateRange, outerRange: DateRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDayRangeInRange")(innerRange.asInstanceOf[js.Any], outerRange.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isMonthInRange(date: Date, dateRange: DateRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMonthInRange")(date.asInstanceOf[js.Any], dateRange.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isTimeEqualOrGreaterThan(time: Date, timeToCompare: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTimeEqualOrGreaterThan")(time.asInstanceOf[js.Any], timeToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isTimeEqualOrSmallerThan(time: Date, timeToCompare: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTimeEqualOrSmallerThan")(time.asInstanceOf[js.Any], timeToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isTimeInRange(date: Date, minDate: Date, maxDate: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTimeInRange")(date.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any], maxDate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isTimeSameOrAfter(date: Date, dateToCompare: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTimeSameOrAfter")(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isToday(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isToday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@blueprintjs/datetime", "Months")
  @js.native
  object Months extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.blueprintjsDatetime.monthsMod.Months & Double] = js.native
    
    /* 3 */ val APRIL: typings.blueprintjsDatetime.monthsMod.Months.APRIL & Double = js.native
    
    /* 7 */ val AUGUST: typings.blueprintjsDatetime.monthsMod.Months.AUGUST & Double = js.native
    
    /* 11 */ val DECEMBER: typings.blueprintjsDatetime.monthsMod.Months.DECEMBER & Double = js.native
    
    /* 1 */ val FEBRUARY: typings.blueprintjsDatetime.monthsMod.Months.FEBRUARY & Double = js.native
    
    /* 0 */ val JANUARY: typings.blueprintjsDatetime.monthsMod.Months.JANUARY & Double = js.native
    
    /* 6 */ val JULY: typings.blueprintjsDatetime.monthsMod.Months.JULY & Double = js.native
    
    /* 5 */ val JUNE: typings.blueprintjsDatetime.monthsMod.Months.JUNE & Double = js.native
    
    /* 2 */ val MARCH: typings.blueprintjsDatetime.monthsMod.Months.MARCH & Double = js.native
    
    /* 4 */ val MAY: typings.blueprintjsDatetime.monthsMod.Months.MAY & Double = js.native
    
    /* 10 */ val NOVEMBER: typings.blueprintjsDatetime.monthsMod.Months.NOVEMBER & Double = js.native
    
    /* 9 */ val OCTOBER: typings.blueprintjsDatetime.monthsMod.Months.OCTOBER & Double = js.native
    
    /* 8 */ val SEPTEMBER: typings.blueprintjsDatetime.monthsMod.Months.SEPTEMBER & Double = js.native
  }
  
  @JSImport("@blueprintjs/datetime", "TimePicker")
  @js.native
  class TimePicker ()
    extends typings.blueprintjsDatetime.timePickerMod.TimePicker {
    def this(props: ITimePickerProps) = this()
    def this(props: Unit, context: js.Any) = this()
    def this(props: ITimePickerProps, context: js.Any) = this()
  }
  /* static members */
  object TimePicker {
    
    @JSImport("@blueprintjs/datetime", "TimePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime", "TimePicker.defaultProps")
    @js.native
    def defaultProps: ITimePickerProps = js.native
    @scala.inline
    def defaultProps_=(x: ITimePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime", "TimePicker.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  object TimePrecision {
    
    @JSImport("@blueprintjs/datetime", "TimePrecision")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime", "TimePrecision.MILLISECOND")
    @js.native
    def MILLISECOND: millisecond = js.native
    @scala.inline
    def MILLISECOND_=(x: millisecond): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MILLISECOND")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime", "TimePrecision.MINUTE")
    @js.native
    def MINUTE: minute = js.native
    @scala.inline
    def MINUTE_=(x: minute): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime", "TimePrecision.SECOND")
    @js.native
    def SECOND: second = js.native
    @scala.inline
    def SECOND_=(x: second): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECOND")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/datetime", "TimeUnit")
  @js.native
  object TimeUnit extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.blueprintjsDatetime.timeUnitMod.TimeUnit & String] = js.native
    
    /* "hour12" */ val HOUR_12: typings.blueprintjsDatetime.timeUnitMod.TimeUnit.HOUR_12 & String = js.native
    
    /* "hour24" */ val HOUR_24: typings.blueprintjsDatetime.timeUnitMod.TimeUnit.HOUR_24 & String = js.native
    
    /* "minute" */ val MINUTE: typings.blueprintjsDatetime.timeUnitMod.TimeUnit.MINUTE & String = js.native
    
    /* "ms" */ val MS: typings.blueprintjsDatetime.timeUnitMod.TimeUnit.MS & String = js.native
    
    /* "second" */ val SECOND: typings.blueprintjsDatetime.timeUnitMod.TimeUnit.SECOND & String = js.native
  }
  
  @js.native
  trait IDatePickerLocaleUtils extends StObject {
    
    def formatDate(date: Date): String = js.native
    def formatDate(date: Date, format: String): String = js.native
    def formatDate(date: Date, format: String, locale: String): String = js.native
    def formatDate(date: Date, format: js.Array[String]): String = js.native
    def formatDate(date: Date, format: js.Array[String], locale: String): String = js.native
    def formatDate(date: Date, format: Unit, locale: String): String = js.native
    
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
    def parseDate(str: String, format: String): Date = js.native
    def parseDate(str: String, format: String, locale: String): Date = js.native
    def parseDate(str: String, format: Unit, locale: String): Date = js.native
  }
}
