package typings.blueprintjsDatetime.anon

import typings.blueprintjsCore.inputGroupMod.IInputGroupProps
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typings.blueprintjsDatetime.datePickerCoreMod.IDatePickerModifiers
import typings.blueprintjsDatetime.shortcutsMod.IDatePickerShortcut
import typings.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typings.blueprintjsDatetime.timePickerMod.TimePrecision
import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.propsMod.DayPickerProps
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/datetime.@blueprintjs/datetime/lib/esm/dateInput.IDateInputProps> */
@js.native
trait PartialIDateInputProps extends js.Object {
  var canClearSelection: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var clearButtonText: js.UndefOr[String] = js.native
  var closeOnSelection: js.UndefOr[Boolean] = js.native
  var dayPickerProps: js.UndefOr[DayPickerProps] = js.native
  var defaultValue: js.UndefOr[Date] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var fill: js.UndefOr[Boolean] = js.native
  var formatDate: js.UndefOr[js.Function2[/* date */ Date, /* locale */ js.UndefOr[String], String]] = js.native
  var initialMonth: js.UndefOr[Date] = js.native
  var inputProps: js.UndefOr[HTMLInputProps with IInputGroupProps] = js.native
  var invalidDateMessage: js.UndefOr[String] = js.native
  var locale: js.UndefOr[String] = js.native
  var localeUtils: js.UndefOr[FormatDate] = js.native
  var maxDate: js.UndefOr[Date] = js.native
  var minDate: js.UndefOr[Date] = js.native
  var modifiers: js.UndefOr[IDatePickerModifiers] = js.native
  var onChange: js.UndefOr[js.Function2[/* selectedDate */ Date, /* isUserChange */ Boolean, Unit]] = js.native
  var onError: js.UndefOr[js.Function1[/* errorDate */ Date, Unit]] = js.native
  var outOfRangeMessage: js.UndefOr[String] = js.native
  var parseDate: js.UndefOr[
    js.Function2[/* str */ String, /* locale */ js.UndefOr[String], Date | `false` | Null]
  ] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var popoverProps: js.UndefOr[PartialIPopoverProps with js.Object] = js.native
  var reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.native
  var rightElement: js.UndefOr[Element] = js.native
  var shortcuts: js.UndefOr[Boolean | js.Array[IDatePickerShortcut]] = js.native
  var showActionsBar: js.UndefOr[Boolean] = js.native
  var timePickerProps: js.UndefOr[ITimePickerProps] = js.native
  var timePrecision: js.UndefOr[TimePrecision] = js.native
  var todayButtonText: js.UndefOr[String] = js.native
  var value: js.UndefOr[Date | Null] = js.native
}

object PartialIDateInputProps {
  @scala.inline
  def apply(): PartialIDateInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIDateInputProps]
  }
  @scala.inline
  implicit class PartialIDateInputPropsOps[Self <: PartialIDateInputProps] (val x: Self) extends AnyVal {
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
    def setCanClearSelection(value: Boolean): Self = this.set("canClearSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanClearSelection: Self = this.set("canClearSelection", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClearButtonText(value: String): Self = this.set("clearButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearButtonText: Self = this.set("clearButtonText", js.undefined)
    @scala.inline
    def setCloseOnSelection(value: Boolean): Self = this.set("closeOnSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnSelection: Self = this.set("closeOnSelection", js.undefined)
    @scala.inline
    def setDayPickerProps(value: DayPickerProps): Self = this.set("dayPickerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayPickerProps: Self = this.set("dayPickerProps", js.undefined)
    @scala.inline
    def setDefaultValue(value: Date): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFormatDate(value: (/* date */ Date, /* locale */ js.UndefOr[String]) => String): Self = this.set("formatDate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormatDate: Self = this.set("formatDate", js.undefined)
    @scala.inline
    def setInitialMonth(value: Date): Self = this.set("initialMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialMonth: Self = this.set("initialMonth", js.undefined)
    @scala.inline
    def setInputProps(value: HTMLInputProps with IInputGroupProps): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
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
    def setOnChange(value: (/* selectedDate */ Date, /* isUserChange */ Boolean) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnError(value: /* errorDate */ Date => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOutOfRangeMessage(value: String): Self = this.set("outOfRangeMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutOfRangeMessage: Self = this.set("outOfRangeMessage", js.undefined)
    @scala.inline
    def setParseDate(value: (/* str */ String, /* locale */ js.UndefOr[String]) => Date | `false` | Null): Self = this.set("parseDate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteParseDate: Self = this.set("parseDate", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPopoverProps(value: PartialIPopoverProps with js.Object): Self = this.set("popoverProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopoverProps: Self = this.set("popoverProps", js.undefined)
    @scala.inline
    def setReverseMonthAndYearMenus(value: Boolean): Self = this.set("reverseMonthAndYearMenus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverseMonthAndYearMenus: Self = this.set("reverseMonthAndYearMenus", js.undefined)
    @scala.inline
    def setRightElement(value: Element): Self = this.set("rightElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightElement: Self = this.set("rightElement", js.undefined)
    @scala.inline
    def setShortcutsVarargs(value: IDatePickerShortcut*): Self = this.set("shortcuts", js.Array(value :_*))
    @scala.inline
    def setShortcuts(value: Boolean | js.Array[IDatePickerShortcut]): Self = this.set("shortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortcuts: Self = this.set("shortcuts", js.undefined)
    @scala.inline
    def setShowActionsBar(value: Boolean): Self = this.set("showActionsBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowActionsBar: Self = this.set("showActionsBar", js.undefined)
    @scala.inline
    def setTimePickerProps(value: ITimePickerProps): Self = this.set("timePickerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePickerProps: Self = this.set("timePickerProps", js.undefined)
    @scala.inline
    def setTimePrecision(value: TimePrecision): Self = this.set("timePrecision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePrecision: Self = this.set("timePrecision", js.undefined)
    @scala.inline
    def setTodayButtonText(value: String): Self = this.set("todayButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTodayButtonText: Self = this.set("todayButtonText", js.undefined)
    @scala.inline
    def setValue(value: Date): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

