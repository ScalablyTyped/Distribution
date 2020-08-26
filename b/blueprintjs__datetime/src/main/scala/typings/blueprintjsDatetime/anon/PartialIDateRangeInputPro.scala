package typings.blueprintjsDatetime.anon

import typings.blueprintjsCore.inputGroupMod.IInputGroupProps
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typings.blueprintjsDatetime.datePickerCoreMod.IDatePickerModifiers
import typings.blueprintjsDatetime.dateRangeMod.DateRange
import typings.blueprintjsDatetime.shortcutsMod.IDateRangeShortcut
import typings.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typings.blueprintjsDatetime.timePickerMod.TimePrecision
import typings.reactDayPicker.propsMod.DayPickerProps
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/datetime.@blueprintjs/datetime/lib/esm/dateRangeInput.IDateRangeInputProps> */
@js.native
trait PartialIDateRangeInputPro extends js.Object {
  var allowSingleDayRange: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var closeOnSelection: js.UndefOr[Boolean] = js.native
  var contiguousCalendarMonths: js.UndefOr[Boolean] = js.native
  var dayPickerProps: js.UndefOr[DayPickerProps] = js.native
  var defaultValue: js.UndefOr[DateRange] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var endInputProps: js.UndefOr[HTMLInputProps with IInputGroupProps] = js.native
  var formatDate: js.UndefOr[js.Function2[/* date */ Date, /* locale */ js.UndefOr[String], String]] = js.native
  var initialMonth: js.UndefOr[Date] = js.native
  var invalidDateMessage: js.UndefOr[String] = js.native
  var locale: js.UndefOr[String] = js.native
  var localeUtils: js.UndefOr[FormatDate] = js.native
  var maxDate: js.UndefOr[Date] = js.native
  var minDate: js.UndefOr[Date] = js.native
  var modifiers: js.UndefOr[IDatePickerModifiers] = js.native
  var onChange: js.UndefOr[js.Function1[/* selectedRange */ DateRange, Unit]] = js.native
  var onError: js.UndefOr[js.Function1[/* errorRange */ DateRange, Unit]] = js.native
  var outOfRangeMessage: js.UndefOr[String] = js.native
  var overlappingDatesMessage: js.UndefOr[String] = js.native
  var parseDate: js.UndefOr[
    js.Function2[/* str */ String, /* locale */ js.UndefOr[String], Date | `false` | Null]
  ] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var popoverProps: js.UndefOr[PartialIPopoverProps] = js.native
  var reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.native
  var selectAllOnFocus: js.UndefOr[Boolean] = js.native
  var shortcuts: js.UndefOr[Boolean | js.Array[IDateRangeShortcut]] = js.native
  var singleMonthOnly: js.UndefOr[Boolean] = js.native
  var startInputProps: js.UndefOr[HTMLInputProps with IInputGroupProps] = js.native
  var timePickerProps: js.UndefOr[ITimePickerProps] = js.native
  var timePrecision: js.UndefOr[TimePrecision] = js.native
  var value: js.UndefOr[DateRange] = js.native
}

object PartialIDateRangeInputPro {
  @scala.inline
  def apply(): PartialIDateRangeInputPro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIDateRangeInputPro]
  }
  @scala.inline
  implicit class PartialIDateRangeInputProOps[Self <: PartialIDateRangeInputPro] (val x: Self) extends AnyVal {
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
    def setAllowSingleDayRange(value: Boolean): Self = this.set("allowSingleDayRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSingleDayRange: Self = this.set("allowSingleDayRange", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCloseOnSelection(value: Boolean): Self = this.set("closeOnSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnSelection: Self = this.set("closeOnSelection", js.undefined)
    @scala.inline
    def setContiguousCalendarMonths(value: Boolean): Self = this.set("contiguousCalendarMonths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContiguousCalendarMonths: Self = this.set("contiguousCalendarMonths", js.undefined)
    @scala.inline
    def setDayPickerProps(value: DayPickerProps): Self = this.set("dayPickerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayPickerProps: Self = this.set("dayPickerProps", js.undefined)
    @scala.inline
    def setDefaultValue(value: DateRange): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setEndInputProps(value: HTMLInputProps with IInputGroupProps): Self = this.set("endInputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndInputProps: Self = this.set("endInputProps", js.undefined)
    @scala.inline
    def setFormatDate(value: (/* date */ Date, /* locale */ js.UndefOr[String]) => String): Self = this.set("formatDate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormatDate: Self = this.set("formatDate", js.undefined)
    @scala.inline
    def setInitialMonth(value: Date): Self = this.set("initialMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialMonth: Self = this.set("initialMonth", js.undefined)
    @scala.inline
    def setInvalidDateMessage(value: String): Self = this.set("invalidDateMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidDateMessage: Self = this.set("invalidDateMessage", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setLocaleUtils(value: FormatDate): Self = this.set("localeUtils", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocaleUtils: Self = this.set("localeUtils", js.undefined)
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setModifiers(value: IDatePickerModifiers): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    @scala.inline
    def setOnChange(value: /* selectedRange */ DateRange => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnError(value: /* errorRange */ DateRange => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOutOfRangeMessage(value: String): Self = this.set("outOfRangeMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutOfRangeMessage: Self = this.set("outOfRangeMessage", js.undefined)
    @scala.inline
    def setOverlappingDatesMessage(value: String): Self = this.set("overlappingDatesMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlappingDatesMessage: Self = this.set("overlappingDatesMessage", js.undefined)
    @scala.inline
    def setParseDate(value: (/* str */ String, /* locale */ js.UndefOr[String]) => Date | `false` | Null): Self = this.set("parseDate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteParseDate: Self = this.set("parseDate", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPopoverProps(value: PartialIPopoverProps): Self = this.set("popoverProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopoverProps: Self = this.set("popoverProps", js.undefined)
    @scala.inline
    def setReverseMonthAndYearMenus(value: Boolean): Self = this.set("reverseMonthAndYearMenus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverseMonthAndYearMenus: Self = this.set("reverseMonthAndYearMenus", js.undefined)
    @scala.inline
    def setSelectAllOnFocus(value: Boolean): Self = this.set("selectAllOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectAllOnFocus: Self = this.set("selectAllOnFocus", js.undefined)
    @scala.inline
    def setShortcutsVarargs(value: IDateRangeShortcut*): Self = this.set("shortcuts", js.Array(value :_*))
    @scala.inline
    def setShortcuts(value: Boolean | js.Array[IDateRangeShortcut]): Self = this.set("shortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortcuts: Self = this.set("shortcuts", js.undefined)
    @scala.inline
    def setSingleMonthOnly(value: Boolean): Self = this.set("singleMonthOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleMonthOnly: Self = this.set("singleMonthOnly", js.undefined)
    @scala.inline
    def setStartInputProps(value: HTMLInputProps with IInputGroupProps): Self = this.set("startInputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartInputProps: Self = this.set("startInputProps", js.undefined)
    @scala.inline
    def setTimePickerProps(value: ITimePickerProps): Self = this.set("timePickerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePickerProps: Self = this.set("timePickerProps", js.undefined)
    @scala.inline
    def setTimePrecision(value: TimePrecision): Self = this.set("timePrecision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePrecision: Self = this.set("timePrecision", js.undefined)
    @scala.inline
    def setValue(value: DateRange): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

