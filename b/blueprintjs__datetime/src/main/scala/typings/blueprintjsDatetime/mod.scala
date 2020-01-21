package typings.blueprintjsDatetime

import typings.blueprintjsDatetime.blueprintjsDatetimeStrings.`DayPicker-Day`
import typings.blueprintjsDatetime.blueprintjsDatetimeStrings.millisecond
import typings.blueprintjsDatetime.blueprintjsDatetimeStrings.minute
import typings.blueprintjsDatetime.blueprintjsDatetimeStrings.second
import typings.blueprintjsDatetime.dateInputMod.IDateInputProps
import typings.blueprintjsDatetime.datePickerMod.IDatePickerProps
import typings.blueprintjsDatetime.dateRangeInputMod.IDateRangeInputProps
import typings.blueprintjsDatetime.dateRangePickerMod.IDateRangePickerProps
import typings.blueprintjsDatetime.dateTimePickerMod.IDateTimePickerProps
import typings.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/datetime", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class DateInput ()
    extends typings.blueprintjsDatetime.dateInputMod.DateInput
  
  @js.native
  class DatePicker protected ()
    extends typings.blueprintjsDatetime.datePickerMod.DatePicker {
    def this(props: IDatePickerProps) = this()
    def this(props: IDatePickerProps, context: js.Any) = this()
  }
  
  @js.native
  class DateRangeInput protected ()
    extends typings.blueprintjsDatetime.dateRangeInputMod.DateRangeInput {
    def this(props: IDateRangeInputProps) = this()
    def this(props: IDateRangeInputProps, context: js.Any) = this()
  }
  
  @js.native
  class DateRangePicker protected ()
    extends typings.blueprintjsDatetime.dateRangePickerMod.DateRangePicker {
    def this(props: IDateRangePickerProps) = this()
    def this(props: IDateRangePickerProps, context: js.Any) = this()
  }
  
  @js.native
  class DateTimePicker ()
    extends typings.blueprintjsDatetime.dateTimePickerMod.DateTimePicker {
    def this(props: IDateTimePickerProps) = this()
    def this(props: IDateTimePickerProps, context: js.Any) = this()
  }
  
  @js.native
  class TimePicker ()
    extends typings.blueprintjsDatetime.timePickerMod.TimePicker {
    def this(props: ITimePickerProps) = this()
    def this(props: ITimePickerProps, context: js.Any) = this()
  }
  
  @js.native
  object Classes extends js.Object {
    val DATEINPUT: String = js.native
    val DATEINPUT_POPOVER: String = js.native
    val DATEPICKER: String = js.native
    val DATEPICKER_CAPTION: String = js.native
    val DATEPICKER_CAPTION_CARET: String = js.native
    val DATEPICKER_CAPTION_MEASURE: String = js.native
    val DATEPICKER_CAPTION_SELECT: String = js.native
    val DATEPICKER_DAY: `DayPicker-Day` = js.native
    val DATEPICKER_DAY_DISABLED: String = js.native
    val DATEPICKER_DAY_IS_TODAY: String = js.native
    val DATEPICKER_DAY_OUTSIDE: String = js.native
    val DATEPICKER_DAY_SELECTED: String = js.native
    val DATEPICKER_DAY_WRAPPER: String = js.native
    val DATEPICKER_FOOTER: String = js.native
    val DATEPICKER_MONTH_SELECT: String = js.native
    val DATEPICKER_NAVBAR: String = js.native
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
  
  /* static members */
  @js.native
  object DateInput extends js.Object {
    var defaultProps: Partial[IDateInputProps] = js.native
    var displayName: String = js.native
  }
  
  /* static members */
  @js.native
  object DatePicker extends js.Object {
    var defaultProps: IDatePickerProps = js.native
    var displayName: String = js.native
  }
  
  /* static members */
  @js.native
  object DateRangeInput extends js.Object {
    var defaultProps: Partial[IDateRangeInputProps] = js.native
    var displayName: String = js.native
  }
  
  /* static members */
  @js.native
  object DateRangePicker extends js.Object {
    var defaultProps: IDateRangePickerProps = js.native
    var displayName: String = js.native
  }
  
  /* static members */
  @js.native
  object DateTimePicker extends js.Object {
    var defaultProps: IDateTimePickerProps = js.native
    var displayName: String = js.native
  }
  
  @js.native
  object Months extends js.Object {
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
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.blueprintjsDatetime.monthsMod.Months with Double] = js.native
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
  
  type IDatePickerLocaleUtils = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any
}

