package typings.blueprintjsDatetime

import typings.blueprintjsCore.inputGroupMod.IInputGroupProps
import typings.blueprintjsCore.popoverMod.PopoverInteractionKind
import typings.blueprintjsCore.popoverSharedPropsMod.PopoverPosition
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typings.blueprintjsDatetime.blueprintjsDatetimeBooleans.`true`
import typings.blueprintjsDatetime.datePickerCoreMod.IDatePickerModifiers
import typings.blueprintjsDatetime.dateRangeMod.DateRange
import typings.blueprintjsDatetime.shortcutsMod.IDatePickerShortcut
import typings.blueprintjsDatetime.shortcutsMod.IDateRangeShortcut
import typings.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typings.blueprintjsDatetime.timePickerMod.TimePrecision
import typings.popperJs.mod.Boundary
import typings.popperJs.mod.Modifiers
import typings.react.mod.HTMLAttributes
import typings.react.mod.HTMLProps
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.propsMod.DayPickerProps
import typings.std.Date
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@blueprintjs/datetime.@blueprintjs/datetime/lib/esm/dateInput.IDateInputProps> */
  @js.native
  trait PartialIDateInputProps extends StObject {
    
    var canClearSelection: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var clearButtonText: js.UndefOr[String] = js.native
    
    var closeOnSelection: js.UndefOr[Boolean] = js.native
    
    var dayPickerProps: js.UndefOr[DayPickerProps] = js.native
    
    var defaultValue: js.UndefOr[Date] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var fill: js.UndefOr[Boolean] = js.native
    
    var formatDate: js.UndefOr[js.Function2[/* date */ Date, /* locale */ js.UndefOr[String], String]] = js.native
    
    var highlightCurrentDay: js.UndefOr[Boolean] = js.native
    
    var initialMonth: js.UndefOr[Date] = js.native
    
    var inputProps: js.UndefOr[HTMLInputProps with IInputGroupProps] = js.native
    
    var invalidDateMessage: js.UndefOr[String] = js.native
    
    var locale: js.UndefOr[String] = js.native
    
    var localeUtils: js.UndefOr[TypeofLocaleUtils] = js.native
    
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
    implicit class PartialIDateInputPropsMutableBuilder[Self <: PartialIDateInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanClearSelection(value: Boolean): Self = StObject.set(x, "canClearSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanClearSelectionUndefined: Self = StObject.set(x, "canClearSelection", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearButtonText(value: String): Self = StObject.set(x, "clearButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearButtonTextUndefined: Self = StObject.set(x, "clearButtonText", js.undefined)
      
      @scala.inline
      def setCloseOnSelection(value: Boolean): Self = StObject.set(x, "closeOnSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnSelectionUndefined: Self = StObject.set(x, "closeOnSelection", js.undefined)
      
      @scala.inline
      def setDayPickerProps(value: DayPickerProps): Self = StObject.set(x, "dayPickerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayPickerPropsUndefined: Self = StObject.set(x, "dayPickerProps", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFormatDate(value: (/* date */ Date, /* locale */ js.UndefOr[String]) => String): Self = StObject.set(x, "formatDate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatDateUndefined: Self = StObject.set(x, "formatDate", js.undefined)
      
      @scala.inline
      def setHighlightCurrentDay(value: Boolean): Self = StObject.set(x, "highlightCurrentDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightCurrentDayUndefined: Self = StObject.set(x, "highlightCurrentDay", js.undefined)
      
      @scala.inline
      def setInitialMonth(value: Date): Self = StObject.set(x, "initialMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialMonthUndefined: Self = StObject.set(x, "initialMonth", js.undefined)
      
      @scala.inline
      def setInputProps(value: HTMLInputProps with IInputGroupProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setInvalidDateMessage(value: String): Self = StObject.set(x, "invalidDateMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidDateMessageUndefined: Self = StObject.set(x, "invalidDateMessage", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setLocaleUtils(value: TypeofLocaleUtils): Self = StObject.set(x, "localeUtils", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUtilsUndefined: Self = StObject.set(x, "localeUtils", js.undefined)
      
      @scala.inline
      def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setModifiers(value: IDatePickerModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* selectedDate */ Date, /* isUserChange */ Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnError(value: /* errorDate */ Date => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOutOfRangeMessage(value: String): Self = StObject.set(x, "outOfRangeMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutOfRangeMessageUndefined: Self = StObject.set(x, "outOfRangeMessage", js.undefined)
      
      @scala.inline
      def setParseDate(value: (/* str */ String, /* locale */ js.UndefOr[String]) => Date | `false` | Null): Self = StObject.set(x, "parseDate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setParseDateUndefined: Self = StObject.set(x, "parseDate", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPopoverProps(value: PartialIPopoverProps with js.Object): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      @scala.inline
      def setReverseMonthAndYearMenus(value: Boolean): Self = StObject.set(x, "reverseMonthAndYearMenus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseMonthAndYearMenusUndefined: Self = StObject.set(x, "reverseMonthAndYearMenus", js.undefined)
      
      @scala.inline
      def setRightElement(value: Element): Self = StObject.set(x, "rightElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightElementUndefined: Self = StObject.set(x, "rightElement", js.undefined)
      
      @scala.inline
      def setShortcuts(value: Boolean | js.Array[IDatePickerShortcut]): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
      
      @scala.inline
      def setShortcutsVarargs(value: IDatePickerShortcut*): Self = StObject.set(x, "shortcuts", js.Array(value :_*))
      
      @scala.inline
      def setShowActionsBar(value: Boolean): Self = StObject.set(x, "showActionsBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowActionsBarUndefined: Self = StObject.set(x, "showActionsBar", js.undefined)
      
      @scala.inline
      def setTimePickerProps(value: ITimePickerProps): Self = StObject.set(x, "timePickerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePickerPropsUndefined: Self = StObject.set(x, "timePickerProps", js.undefined)
      
      @scala.inline
      def setTimePrecision(value: TimePrecision): Self = StObject.set(x, "timePrecision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePrecisionUndefined: Self = StObject.set(x, "timePrecision", js.undefined)
      
      @scala.inline
      def setTodayButtonText(value: String): Self = StObject.set(x, "todayButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayButtonTextUndefined: Self = StObject.set(x, "todayButtonText", js.undefined)
      
      @scala.inline
      def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@blueprintjs/datetime.@blueprintjs/datetime/lib/esm/dateRangeInput.IDateRangeInputProps> */
  @js.native
  trait PartialIDateRangeInputPro extends StObject {
    
    var allowSingleDayRange: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var closeOnSelection: js.UndefOr[Boolean] = js.native
    
    var contiguousCalendarMonths: js.UndefOr[Boolean] = js.native
    
    var dayPickerProps: js.UndefOr[DayPickerProps] = js.native
    
    var defaultValue: js.UndefOr[DateRange] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var endInputProps: js.UndefOr[HTMLInputProps with IInputGroupProps] = js.native
    
    var formatDate: js.UndefOr[js.Function2[/* date */ Date, /* locale */ js.UndefOr[String], String]] = js.native
    
    var highlightCurrentDay: js.UndefOr[Boolean] = js.native
    
    var initialMonth: js.UndefOr[Date] = js.native
    
    var invalidDateMessage: js.UndefOr[String] = js.native
    
    var locale: js.UndefOr[String] = js.native
    
    var localeUtils: js.UndefOr[TypeofLocaleUtils] = js.native
    
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
    implicit class PartialIDateRangeInputProMutableBuilder[Self <: PartialIDateRangeInputPro] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowSingleDayRange(value: Boolean): Self = StObject.set(x, "allowSingleDayRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSingleDayRangeUndefined: Self = StObject.set(x, "allowSingleDayRange", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCloseOnSelection(value: Boolean): Self = StObject.set(x, "closeOnSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnSelectionUndefined: Self = StObject.set(x, "closeOnSelection", js.undefined)
      
      @scala.inline
      def setContiguousCalendarMonths(value: Boolean): Self = StObject.set(x, "contiguousCalendarMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContiguousCalendarMonthsUndefined: Self = StObject.set(x, "contiguousCalendarMonths", js.undefined)
      
      @scala.inline
      def setDayPickerProps(value: DayPickerProps): Self = StObject.set(x, "dayPickerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayPickerPropsUndefined: Self = StObject.set(x, "dayPickerProps", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: DateRange): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEndInputProps(value: HTMLInputProps with IInputGroupProps): Self = StObject.set(x, "endInputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndInputPropsUndefined: Self = StObject.set(x, "endInputProps", js.undefined)
      
      @scala.inline
      def setFormatDate(value: (/* date */ Date, /* locale */ js.UndefOr[String]) => String): Self = StObject.set(x, "formatDate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatDateUndefined: Self = StObject.set(x, "formatDate", js.undefined)
      
      @scala.inline
      def setHighlightCurrentDay(value: Boolean): Self = StObject.set(x, "highlightCurrentDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightCurrentDayUndefined: Self = StObject.set(x, "highlightCurrentDay", js.undefined)
      
      @scala.inline
      def setInitialMonth(value: Date): Self = StObject.set(x, "initialMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialMonthUndefined: Self = StObject.set(x, "initialMonth", js.undefined)
      
      @scala.inline
      def setInvalidDateMessage(value: String): Self = StObject.set(x, "invalidDateMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidDateMessageUndefined: Self = StObject.set(x, "invalidDateMessage", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setLocaleUtils(value: TypeofLocaleUtils): Self = StObject.set(x, "localeUtils", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUtilsUndefined: Self = StObject.set(x, "localeUtils", js.undefined)
      
      @scala.inline
      def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setModifiers(value: IDatePickerModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* selectedRange */ DateRange => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnError(value: /* errorRange */ DateRange => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOutOfRangeMessage(value: String): Self = StObject.set(x, "outOfRangeMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutOfRangeMessageUndefined: Self = StObject.set(x, "outOfRangeMessage", js.undefined)
      
      @scala.inline
      def setOverlappingDatesMessage(value: String): Self = StObject.set(x, "overlappingDatesMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlappingDatesMessageUndefined: Self = StObject.set(x, "overlappingDatesMessage", js.undefined)
      
      @scala.inline
      def setParseDate(value: (/* str */ String, /* locale */ js.UndefOr[String]) => Date | `false` | Null): Self = StObject.set(x, "parseDate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setParseDateUndefined: Self = StObject.set(x, "parseDate", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPopoverProps(value: PartialIPopoverProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      @scala.inline
      def setReverseMonthAndYearMenus(value: Boolean): Self = StObject.set(x, "reverseMonthAndYearMenus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseMonthAndYearMenusUndefined: Self = StObject.set(x, "reverseMonthAndYearMenus", js.undefined)
      
      @scala.inline
      def setSelectAllOnFocus(value: Boolean): Self = StObject.set(x, "selectAllOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectAllOnFocusUndefined: Self = StObject.set(x, "selectAllOnFocus", js.undefined)
      
      @scala.inline
      def setShortcuts(value: Boolean | js.Array[IDateRangeShortcut]): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
      
      @scala.inline
      def setShortcutsVarargs(value: IDateRangeShortcut*): Self = StObject.set(x, "shortcuts", js.Array(value :_*))
      
      @scala.inline
      def setSingleMonthOnly(value: Boolean): Self = StObject.set(x, "singleMonthOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleMonthOnlyUndefined: Self = StObject.set(x, "singleMonthOnly", js.undefined)
      
      @scala.inline
      def setStartInputProps(value: HTMLInputProps with IInputGroupProps): Self = StObject.set(x, "startInputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartInputPropsUndefined: Self = StObject.set(x, "startInputProps", js.undefined)
      
      @scala.inline
      def setTimePickerProps(value: ITimePickerProps): Self = StObject.set(x, "timePickerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePickerPropsUndefined: Self = StObject.set(x, "timePickerProps", js.undefined)
      
      @scala.inline
      def setTimePrecision(value: TimePrecision): Self = StObject.set(x, "timePrecision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePrecisionUndefined: Self = StObject.set(x, "timePrecision", js.undefined)
      
      @scala.inline
      def setValue(value: DateRange): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core.IPopoverProps> */
  @js.native
  trait PartialIPopoverProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.native
    
    var boundary: js.UndefOr[Boundary] = js.native
    
    var canEscapeKeyClose: js.UndefOr[Boolean] = js.native
    
    var captureDismiss: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var content: js.UndefOr[String | Element] = js.native
    
    var defaultIsOpen: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var enforceFocus: js.UndefOr[Boolean] = js.native
    
    var fill: js.UndefOr[Boolean] = js.native
    
    var hasBackdrop: js.UndefOr[Boolean] = js.native
    
    var hoverCloseDelay: js.UndefOr[Double] = js.native
    
    var hoverOpenDelay: js.UndefOr[Double] = js.native
    
    var inheritDarkTheme: js.UndefOr[Boolean] = js.native
    
    var interactionKind: js.UndefOr[PopoverInteractionKind] = js.native
    
    var isOpen: js.UndefOr[Boolean] = js.native
    
    var `lazy`: js.UndefOr[Boolean] = js.native
    
    var minimal: js.UndefOr[Boolean] = js.native
    
    var modifiers: js.UndefOr[Modifiers] = js.native
    
    var onClose: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLElement, Event], Unit]] = js.native
    
    var onClosed: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
    
    var onClosing: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
    
    var onInteraction: js.UndefOr[
        js.Function2[
          /* nextOpenState */ Boolean, 
          /* e */ js.UndefOr[SyntheticEvent[HTMLElement, Event]], 
          Unit
        ]
      ] = js.native
    
    var onOpened: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
    
    var onOpening: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
    
    var openOnTargetFocus: js.UndefOr[Boolean] = js.native
    
    var popoverClassName: js.UndefOr[String] = js.native
    
    var popoverRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, Unit]] = js.native
    
    var portalClassName: js.UndefOr[String] = js.native
    
    var portalContainer: js.UndefOr[HTMLElement] = js.native
    
    var position: js.UndefOr[PopoverPosition] = js.native
    
    var target: js.UndefOr[String | Element] = js.native
    
    var targetClassName: js.UndefOr[String] = js.native
    
    var targetProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.native
    
    var targetTagName: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
      ] = js.native
    
    var transitionDuration: js.UndefOr[Double] = js.native
    
    var usePortal: js.UndefOr[Boolean] = js.native
    
    var wrapperTagName: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
      ] = js.native
  }
  object PartialIPopoverProps {
    
    @scala.inline
    def apply(): PartialIPopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIPopoverProps]
    }
    
    @scala.inline
    implicit class PartialIPopoverPropsMutableBuilder[Self <: PartialIPopoverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setBackdropProps(value: HTMLProps[HTMLDivElement]): Self = StObject.set(x, "backdropProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropPropsUndefined: Self = StObject.set(x, "backdropProps", js.undefined)
      
      @scala.inline
      def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      @scala.inline
      def setCanEscapeKeyClose(value: Boolean): Self = StObject.set(x, "canEscapeKeyClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanEscapeKeyCloseUndefined: Self = StObject.set(x, "canEscapeKeyClose", js.undefined)
      
      @scala.inline
      def setCaptureDismiss(value: Boolean): Self = StObject.set(x, "captureDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureDismissUndefined: Self = StObject.set(x, "captureDismiss", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: String | Element): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDefaultIsOpen(value: Boolean): Self = StObject.set(x, "defaultIsOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultIsOpenUndefined: Self = StObject.set(x, "defaultIsOpen", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEnforceFocus(value: Boolean): Self = StObject.set(x, "enforceFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnforceFocusUndefined: Self = StObject.set(x, "enforceFocus", js.undefined)
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasBackdropUndefined: Self = StObject.set(x, "hasBackdrop", js.undefined)
      
      @scala.inline
      def setHoverCloseDelay(value: Double): Self = StObject.set(x, "hoverCloseDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverCloseDelayUndefined: Self = StObject.set(x, "hoverCloseDelay", js.undefined)
      
      @scala.inline
      def setHoverOpenDelay(value: Double): Self = StObject.set(x, "hoverOpenDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverOpenDelayUndefined: Self = StObject.set(x, "hoverOpenDelay", js.undefined)
      
      @scala.inline
      def setInheritDarkTheme(value: Boolean): Self = StObject.set(x, "inheritDarkTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInheritDarkThemeUndefined: Self = StObject.set(x, "inheritDarkTheme", js.undefined)
      
      @scala.inline
      def setInteractionKind(value: PopoverInteractionKind): Self = StObject.set(x, "interactionKind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractionKindUndefined: Self = StObject.set(x, "interactionKind", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      @scala.inline
      def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
      
      @scala.inline
      def setModifiers(value: Modifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* event */ SyntheticEvent[HTMLElement, Event] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnClosed(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onClosed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
      
      @scala.inline
      def setOnClosing(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onClosing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClosingUndefined: Self = StObject.set(x, "onClosing", js.undefined)
      
      @scala.inline
      def setOnInteraction(
        value: (/* nextOpenState */ Boolean, /* e */ js.UndefOr[SyntheticEvent[HTMLElement, Event]]) => Unit
      ): Self = StObject.set(x, "onInteraction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnInteractionUndefined: Self = StObject.set(x, "onInteraction", js.undefined)
      
      @scala.inline
      def setOnOpened(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onOpened", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
      
      @scala.inline
      def setOnOpening(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onOpening", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpeningUndefined: Self = StObject.set(x, "onOpening", js.undefined)
      
      @scala.inline
      def setOpenOnTargetFocus(value: Boolean): Self = StObject.set(x, "openOnTargetFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnTargetFocusUndefined: Self = StObject.set(x, "openOnTargetFocus", js.undefined)
      
      @scala.inline
      def setPopoverClassName(value: String): Self = StObject.set(x, "popoverClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverClassNameUndefined: Self = StObject.set(x, "popoverClassName", js.undefined)
      
      @scala.inline
      def setPopoverRef(value: /* ref */ HTMLElement | Null => Unit): Self = StObject.set(x, "popoverRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPopoverRefUndefined: Self = StObject.set(x, "popoverRef", js.undefined)
      
      @scala.inline
      def setPortalClassName(value: String): Self = StObject.set(x, "portalClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalClassNameUndefined: Self = StObject.set(x, "portalClassName", js.undefined)
      
      @scala.inline
      def setPortalContainer(value: HTMLElement): Self = StObject.set(x, "portalContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalContainerUndefined: Self = StObject.set(x, "portalContainer", js.undefined)
      
      @scala.inline
      def setPosition(value: PopoverPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setTarget(value: String | Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetClassName(value: String): Self = StObject.set(x, "targetClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetClassNameUndefined: Self = StObject.set(x, "targetClassName", js.undefined)
      
      @scala.inline
      def setTargetProps(value: HTMLAttributes[HTMLElement]): Self = StObject.set(x, "targetProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPropsUndefined: Self = StObject.set(x, "targetProps", js.undefined)
      
      @scala.inline
      def setTargetTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "targetTagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTagNameUndefined: Self = StObject.set(x, "targetTagName", js.undefined)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      @scala.inline
      def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
      
      @scala.inline
      def setWrapperTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "wrapperTagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperTagNameUndefined: Self = StObject.set(x, "wrapperTagName", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@blueprintjs/datetime.@blueprintjs/datetime/lib/esm/shortcuts.IShortcutsProps> */
  @js.native
  trait PartialIShortcutsProps extends StObject {
    
    var allowSingleDayRange: js.UndefOr[Boolean] = js.native
    
    var maxDate: js.UndefOr[Date] = js.native
    
    var minDate: js.UndefOr[Date] = js.native
    
    var onShortcutClick: js.UndefOr[js.Function2[/* shortcut */ IDateRangeShortcut, /* index */ Double, Unit]] = js.native
    
    var selectedShortcutIndex: js.UndefOr[Double] = js.native
    
    var shortcuts: js.UndefOr[js.Array[IDateRangeShortcut] | `true`] = js.native
    
    var timePrecision: js.UndefOr[TimePrecision] = js.native
    
    var useSingleDateShortcuts: js.UndefOr[Boolean] = js.native
  }
  object PartialIShortcutsProps {
    
    @scala.inline
    def apply(): PartialIShortcutsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIShortcutsProps]
    }
    
    @scala.inline
    implicit class PartialIShortcutsPropsMutableBuilder[Self <: PartialIShortcutsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowSingleDayRange(value: Boolean): Self = StObject.set(x, "allowSingleDayRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSingleDayRangeUndefined: Self = StObject.set(x, "allowSingleDayRange", js.undefined)
      
      @scala.inline
      def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setOnShortcutClick(value: (/* shortcut */ IDateRangeShortcut, /* index */ Double) => Unit): Self = StObject.set(x, "onShortcutClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnShortcutClickUndefined: Self = StObject.set(x, "onShortcutClick", js.undefined)
      
      @scala.inline
      def setSelectedShortcutIndex(value: Double): Self = StObject.set(x, "selectedShortcutIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedShortcutIndexUndefined: Self = StObject.set(x, "selectedShortcutIndex", js.undefined)
      
      @scala.inline
      def setShortcuts(value: js.Array[IDateRangeShortcut] | `true`): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
      
      @scala.inline
      def setShortcutsVarargs(value: IDateRangeShortcut*): Self = StObject.set(x, "shortcuts", js.Array(value :_*))
      
      @scala.inline
      def setTimePrecision(value: TimePrecision): Self = StObject.set(x, "timePrecision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePrecisionUndefined: Self = StObject.set(x, "timePrecision", js.undefined)
      
      @scala.inline
      def setUseSingleDateShortcuts(value: Boolean): Self = StObject.set(x, "useSingleDateShortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseSingleDateShortcutsUndefined: Self = StObject.set(x, "useSingleDateShortcuts", js.undefined)
    }
  }
  
  @js.native
  trait TypeofLocaleUtils extends StObject {
    
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
}
