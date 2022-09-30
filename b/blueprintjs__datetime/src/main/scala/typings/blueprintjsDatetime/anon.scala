package typings.blueprintjsDatetime

import typings.blueprintjsCore.inputGroupMod.InputGroupProps2
import typings.blueprintjsCore.popoverMod.PopoverInteractionKind
import typings.blueprintjsCore.popoverSharedPropsMod.PopoverPosition
import typings.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typings.blueprintjsDatetime.blueprintjsDatetimeBooleans.`true`
import typings.blueprintjsDatetime.datePickerCoreMod.DatePickerModifiers
import typings.blueprintjsDatetime.dateRangeMod.DateRange
import typings.blueprintjsDatetime.shortcutsMod.DatePickerShortcut
import typings.blueprintjsDatetime.shortcutsMod.DateRangeShortcut
import typings.blueprintjsDatetime.timePickerMod.TimePickerProps
import typings.blueprintjsDatetime.timePickerMod.TimePrecision
import typings.popperJs.mod.Boundary
import typings.popperJs.mod.Modifiers
import typings.popperJs.mod.Placement
import typings.react.mod.HTMLAttributes
import typings.react.mod.HTMLProps
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.mod.DayPickerProps
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@blueprintjs/datetime.@blueprintjs/datetime/lib/esm/dateInput.DateInputProps> */
  trait PartialDateInputProps extends StObject {
    
    var canClearSelection: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearButtonText: js.UndefOr[String] = js.undefined
    
    var closeOnSelection: js.UndefOr[Boolean] = js.undefined
    
    var dayPickerProps: js.UndefOr[DayPickerProps] = js.undefined
    
    var defaultValue: js.UndefOr[js.Date] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var fill: js.UndefOr[Boolean] = js.undefined
    
    var footerElement: js.UndefOr[Element] = js.undefined
    
    var formatDate: js.UndefOr[js.Function2[/* date */ js.Date, /* locale */ js.UndefOr[String], String]] = js.undefined
    
    var highlightCurrentDay: js.UndefOr[Boolean] = js.undefined
    
    var initialMonth: js.UndefOr[js.Date] = js.undefined
    
    var inputProps: js.UndefOr[InputGroupProps2] = js.undefined
    
    var invalidDateMessage: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var localeUtils: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ Any
      ] = js.undefined
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var modifiers: js.UndefOr[DatePickerModifiers] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[/* selectedDate */ js.Date | Null, /* isUserChange */ Boolean, Unit]
      ] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* errorDate */ js.Date, Unit]] = js.undefined
    
    var outOfRangeMessage: js.UndefOr[String] = js.undefined
    
    var parseDate: js.UndefOr[
        js.Function2[/* str */ String, /* locale */ js.UndefOr[String], js.Date | `false` | Null]
      ] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var popoverProps: js.UndefOr[PartialIPopoverProps & js.Object] = js.undefined
    
    var reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined
    
    var rightElement: js.UndefOr[Element] = js.undefined
    
    var shortcuts: js.UndefOr[Boolean | js.Array[DatePickerShortcut]] = js.undefined
    
    var showActionsBar: js.UndefOr[Boolean] = js.undefined
    
    var timePickerProps: js.UndefOr[TimePickerProps] = js.undefined
    
    var timePrecision: js.UndefOr[TimePrecision] = js.undefined
    
    var todayButtonText: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[js.Date | Null] = js.undefined
  }
  object PartialDateInputProps {
    
    inline def apply(): PartialDateInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDateInputProps]
    }
    
    extension [Self <: PartialDateInputProps](x: Self) {
      
      inline def setCanClearSelection(value: Boolean): Self = StObject.set(x, "canClearSelection", value.asInstanceOf[js.Any])
      
      inline def setCanClearSelectionUndefined: Self = StObject.set(x, "canClearSelection", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearButtonText(value: String): Self = StObject.set(x, "clearButtonText", value.asInstanceOf[js.Any])
      
      inline def setClearButtonTextUndefined: Self = StObject.set(x, "clearButtonText", js.undefined)
      
      inline def setCloseOnSelection(value: Boolean): Self = StObject.set(x, "closeOnSelection", value.asInstanceOf[js.Any])
      
      inline def setCloseOnSelectionUndefined: Self = StObject.set(x, "closeOnSelection", js.undefined)
      
      inline def setDayPickerProps(value: DayPickerProps): Self = StObject.set(x, "dayPickerProps", value.asInstanceOf[js.Any])
      
      inline def setDayPickerPropsUndefined: Self = StObject.set(x, "dayPickerProps", js.undefined)
      
      inline def setDefaultValue(value: js.Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFooterElement(value: Element): Self = StObject.set(x, "footerElement", value.asInstanceOf[js.Any])
      
      inline def setFooterElementUndefined: Self = StObject.set(x, "footerElement", js.undefined)
      
      inline def setFormatDate(value: (/* date */ js.Date, /* locale */ js.UndefOr[String]) => String): Self = StObject.set(x, "formatDate", js.Any.fromFunction2(value))
      
      inline def setFormatDateUndefined: Self = StObject.set(x, "formatDate", js.undefined)
      
      inline def setHighlightCurrentDay(value: Boolean): Self = StObject.set(x, "highlightCurrentDay", value.asInstanceOf[js.Any])
      
      inline def setHighlightCurrentDayUndefined: Self = StObject.set(x, "highlightCurrentDay", js.undefined)
      
      inline def setInitialMonth(value: js.Date): Self = StObject.set(x, "initialMonth", value.asInstanceOf[js.Any])
      
      inline def setInitialMonthUndefined: Self = StObject.set(x, "initialMonth", js.undefined)
      
      inline def setInputProps(value: InputGroupProps2): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setInvalidDateMessage(value: String): Self = StObject.set(x, "invalidDateMessage", value.asInstanceOf[js.Any])
      
      inline def setInvalidDateMessageUndefined: Self = StObject.set(x, "invalidDateMessage", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocaleUtils(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ Any): Self = StObject.set(x, "localeUtils", value.asInstanceOf[js.Any])
      
      inline def setLocaleUtilsUndefined: Self = StObject.set(x, "localeUtils", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setModifiers(value: DatePickerModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setOnChange(value: (/* selectedDate */ js.Date | Null, /* isUserChange */ Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnError(value: /* errorDate */ js.Date => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOutOfRangeMessage(value: String): Self = StObject.set(x, "outOfRangeMessage", value.asInstanceOf[js.Any])
      
      inline def setOutOfRangeMessageUndefined: Self = StObject.set(x, "outOfRangeMessage", js.undefined)
      
      inline def setParseDate(value: (/* str */ String, /* locale */ js.UndefOr[String]) => js.Date | `false` | Null): Self = StObject.set(x, "parseDate", js.Any.fromFunction2(value))
      
      inline def setParseDateUndefined: Self = StObject.set(x, "parseDate", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPopoverProps(value: PartialIPopoverProps & js.Object): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      inline def setReverseMonthAndYearMenus(value: Boolean): Self = StObject.set(x, "reverseMonthAndYearMenus", value.asInstanceOf[js.Any])
      
      inline def setReverseMonthAndYearMenusUndefined: Self = StObject.set(x, "reverseMonthAndYearMenus", js.undefined)
      
      inline def setRightElement(value: Element): Self = StObject.set(x, "rightElement", value.asInstanceOf[js.Any])
      
      inline def setRightElementUndefined: Self = StObject.set(x, "rightElement", js.undefined)
      
      inline def setShortcuts(value: Boolean | js.Array[DatePickerShortcut]): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
      
      inline def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
      
      inline def setShortcutsVarargs(value: DatePickerShortcut*): Self = StObject.set(x, "shortcuts", js.Array(value*))
      
      inline def setShowActionsBar(value: Boolean): Self = StObject.set(x, "showActionsBar", value.asInstanceOf[js.Any])
      
      inline def setShowActionsBarUndefined: Self = StObject.set(x, "showActionsBar", js.undefined)
      
      inline def setTimePickerProps(value: TimePickerProps): Self = StObject.set(x, "timePickerProps", value.asInstanceOf[js.Any])
      
      inline def setTimePickerPropsUndefined: Self = StObject.set(x, "timePickerProps", js.undefined)
      
      inline def setTimePrecision(value: TimePrecision): Self = StObject.set(x, "timePrecision", value.asInstanceOf[js.Any])
      
      inline def setTimePrecisionUndefined: Self = StObject.set(x, "timePrecision", js.undefined)
      
      inline def setTodayButtonText(value: String): Self = StObject.set(x, "todayButtonText", value.asInstanceOf[js.Any])
      
      inline def setTodayButtonTextUndefined: Self = StObject.set(x, "todayButtonText", js.undefined)
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@blueprintjs/datetime.@blueprintjs/datetime/lib/esm/dateRangeInput.DateRangeInputProps> */
  trait PartialDateRangeInputProp extends StObject {
    
    var allowSingleDayRange: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var closeOnSelection: js.UndefOr[Boolean] = js.undefined
    
    var contiguousCalendarMonths: js.UndefOr[Boolean] = js.undefined
    
    var dayPickerProps: js.UndefOr[DayPickerProps] = js.undefined
    
    var defaultValue: js.UndefOr[DateRange] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var endInputProps: js.UndefOr[InputGroupProps2] = js.undefined
    
    var footerElement: js.UndefOr[Element] = js.undefined
    
    var formatDate: js.UndefOr[js.Function2[/* date */ js.Date, /* locale */ js.UndefOr[String], String]] = js.undefined
    
    var highlightCurrentDay: js.UndefOr[Boolean] = js.undefined
    
    var initialMonth: js.UndefOr[js.Date] = js.undefined
    
    var invalidDateMessage: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var localeUtils: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ Any
      ] = js.undefined
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var modifiers: js.UndefOr[DatePickerModifiers] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* selectedRange */ DateRange, Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* errorRange */ DateRange, Unit]] = js.undefined
    
    var outOfRangeMessage: js.UndefOr[String] = js.undefined
    
    var overlappingDatesMessage: js.UndefOr[String] = js.undefined
    
    var parseDate: js.UndefOr[
        js.Function2[/* str */ String, /* locale */ js.UndefOr[String], js.Date | `false` | Null]
      ] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var popoverProps: js.UndefOr[PartialIPopoverProps] = js.undefined
    
    var reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined
    
    var selectAllOnFocus: js.UndefOr[Boolean] = js.undefined
    
    var shortcuts: js.UndefOr[Boolean | js.Array[DateRangeShortcut]] = js.undefined
    
    var singleMonthOnly: js.UndefOr[Boolean] = js.undefined
    
    var startInputProps: js.UndefOr[InputGroupProps2] = js.undefined
    
    var timePickerProps: js.UndefOr[TimePickerProps] = js.undefined
    
    var timePrecision: js.UndefOr[TimePrecision] = js.undefined
    
    var value: js.UndefOr[DateRange] = js.undefined
  }
  object PartialDateRangeInputProp {
    
    inline def apply(): PartialDateRangeInputProp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDateRangeInputProp]
    }
    
    extension [Self <: PartialDateRangeInputProp](x: Self) {
      
      inline def setAllowSingleDayRange(value: Boolean): Self = StObject.set(x, "allowSingleDayRange", value.asInstanceOf[js.Any])
      
      inline def setAllowSingleDayRangeUndefined: Self = StObject.set(x, "allowSingleDayRange", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCloseOnSelection(value: Boolean): Self = StObject.set(x, "closeOnSelection", value.asInstanceOf[js.Any])
      
      inline def setCloseOnSelectionUndefined: Self = StObject.set(x, "closeOnSelection", js.undefined)
      
      inline def setContiguousCalendarMonths(value: Boolean): Self = StObject.set(x, "contiguousCalendarMonths", value.asInstanceOf[js.Any])
      
      inline def setContiguousCalendarMonthsUndefined: Self = StObject.set(x, "contiguousCalendarMonths", js.undefined)
      
      inline def setDayPickerProps(value: DayPickerProps): Self = StObject.set(x, "dayPickerProps", value.asInstanceOf[js.Any])
      
      inline def setDayPickerPropsUndefined: Self = StObject.set(x, "dayPickerProps", js.undefined)
      
      inline def setDefaultValue(value: DateRange): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEndInputProps(value: InputGroupProps2): Self = StObject.set(x, "endInputProps", value.asInstanceOf[js.Any])
      
      inline def setEndInputPropsUndefined: Self = StObject.set(x, "endInputProps", js.undefined)
      
      inline def setFooterElement(value: Element): Self = StObject.set(x, "footerElement", value.asInstanceOf[js.Any])
      
      inline def setFooterElementUndefined: Self = StObject.set(x, "footerElement", js.undefined)
      
      inline def setFormatDate(value: (/* date */ js.Date, /* locale */ js.UndefOr[String]) => String): Self = StObject.set(x, "formatDate", js.Any.fromFunction2(value))
      
      inline def setFormatDateUndefined: Self = StObject.set(x, "formatDate", js.undefined)
      
      inline def setHighlightCurrentDay(value: Boolean): Self = StObject.set(x, "highlightCurrentDay", value.asInstanceOf[js.Any])
      
      inline def setHighlightCurrentDayUndefined: Self = StObject.set(x, "highlightCurrentDay", js.undefined)
      
      inline def setInitialMonth(value: js.Date): Self = StObject.set(x, "initialMonth", value.asInstanceOf[js.Any])
      
      inline def setInitialMonthUndefined: Self = StObject.set(x, "initialMonth", js.undefined)
      
      inline def setInvalidDateMessage(value: String): Self = StObject.set(x, "invalidDateMessage", value.asInstanceOf[js.Any])
      
      inline def setInvalidDateMessageUndefined: Self = StObject.set(x, "invalidDateMessage", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocaleUtils(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ Any): Self = StObject.set(x, "localeUtils", value.asInstanceOf[js.Any])
      
      inline def setLocaleUtilsUndefined: Self = StObject.set(x, "localeUtils", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setModifiers(value: DatePickerModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setOnChange(value: /* selectedRange */ DateRange => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnError(value: /* errorRange */ DateRange => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOutOfRangeMessage(value: String): Self = StObject.set(x, "outOfRangeMessage", value.asInstanceOf[js.Any])
      
      inline def setOutOfRangeMessageUndefined: Self = StObject.set(x, "outOfRangeMessage", js.undefined)
      
      inline def setOverlappingDatesMessage(value: String): Self = StObject.set(x, "overlappingDatesMessage", value.asInstanceOf[js.Any])
      
      inline def setOverlappingDatesMessageUndefined: Self = StObject.set(x, "overlappingDatesMessage", js.undefined)
      
      inline def setParseDate(value: (/* str */ String, /* locale */ js.UndefOr[String]) => js.Date | `false` | Null): Self = StObject.set(x, "parseDate", js.Any.fromFunction2(value))
      
      inline def setParseDateUndefined: Self = StObject.set(x, "parseDate", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPopoverProps(value: PartialIPopoverProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      inline def setReverseMonthAndYearMenus(value: Boolean): Self = StObject.set(x, "reverseMonthAndYearMenus", value.asInstanceOf[js.Any])
      
      inline def setReverseMonthAndYearMenusUndefined: Self = StObject.set(x, "reverseMonthAndYearMenus", js.undefined)
      
      inline def setSelectAllOnFocus(value: Boolean): Self = StObject.set(x, "selectAllOnFocus", value.asInstanceOf[js.Any])
      
      inline def setSelectAllOnFocusUndefined: Self = StObject.set(x, "selectAllOnFocus", js.undefined)
      
      inline def setShortcuts(value: Boolean | js.Array[DateRangeShortcut]): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
      
      inline def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
      
      inline def setShortcutsVarargs(value: DateRangeShortcut*): Self = StObject.set(x, "shortcuts", js.Array(value*))
      
      inline def setSingleMonthOnly(value: Boolean): Self = StObject.set(x, "singleMonthOnly", value.asInstanceOf[js.Any])
      
      inline def setSingleMonthOnlyUndefined: Self = StObject.set(x, "singleMonthOnly", js.undefined)
      
      inline def setStartInputProps(value: InputGroupProps2): Self = StObject.set(x, "startInputProps", value.asInstanceOf[js.Any])
      
      inline def setStartInputPropsUndefined: Self = StObject.set(x, "startInputProps", js.undefined)
      
      inline def setTimePickerProps(value: TimePickerProps): Self = StObject.set(x, "timePickerProps", value.asInstanceOf[js.Any])
      
      inline def setTimePickerPropsUndefined: Self = StObject.set(x, "timePickerProps", js.undefined)
      
      inline def setTimePrecision(value: TimePrecision): Self = StObject.set(x, "timePrecision", value.asInstanceOf[js.Any])
      
      inline def setTimePrecisionUndefined: Self = StObject.set(x, "timePrecision", js.undefined)
      
      inline def setValue(value: DateRange): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core.IPopoverProps> */
  trait PartialIPopoverProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.undefined
    
    var boundary: js.UndefOr[Boundary] = js.undefined
    
    var canEscapeKeyClose: js.UndefOr[Boolean] = js.undefined
    
    var captureDismiss: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String | Element] = js.undefined
    
    var defaultIsOpen: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var enforceFocus: js.UndefOr[Boolean] = js.undefined
    
    var fill: js.UndefOr[Boolean] = js.undefined
    
    var hasBackdrop: js.UndefOr[Boolean] = js.undefined
    
    var hoverCloseDelay: js.UndefOr[Double] = js.undefined
    
    var hoverOpenDelay: js.UndefOr[Double] = js.undefined
    
    var inheritDarkTheme: js.UndefOr[Boolean] = js.undefined
    
    var interactionKind: js.UndefOr[PopoverInteractionKind] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    var minimal: js.UndefOr[Boolean] = js.undefined
    
    var modifiers: js.UndefOr[Modifiers] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLElement, Event], Unit]] = js.undefined
    
    var onClosed: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    var onClosing: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    var onInteraction: js.UndefOr[
        js.Function2[
          /* nextOpenState */ Boolean, 
          /* e */ js.UndefOr[SyntheticEvent[HTMLElement, Event]], 
          Unit
        ]
      ] = js.undefined
    
    var onOpened: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    var onOpening: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    var openOnTargetFocus: js.UndefOr[Boolean] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var popoverClassName: js.UndefOr[String] = js.undefined
    
    var popoverRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    var portalClassName: js.UndefOr[String] = js.undefined
    
    var portalContainer: js.UndefOr[HTMLElement] = js.undefined
    
    var position: js.UndefOr[PopoverPosition] = js.undefined
    
    var shouldReturnFocusOnClose: js.UndefOr[Boolean] = js.undefined
    
    var target: js.UndefOr[String | Element] = js.undefined
    
    var targetClassName: js.UndefOr[String] = js.undefined
    
    var targetProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.undefined
    
    var targetTagName: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ Any
      ] = js.undefined
    
    var transitionDuration: js.UndefOr[Double] = js.undefined
    
    var usePortal: js.UndefOr[Boolean] = js.undefined
    
    var wrapperTagName: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ Any
      ] = js.undefined
  }
  object PartialIPopoverProps {
    
    inline def apply(): PartialIPopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIPopoverProps]
    }
    
    extension [Self <: PartialIPopoverProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setBackdropProps(value: HTMLProps[HTMLDivElement]): Self = StObject.set(x, "backdropProps", value.asInstanceOf[js.Any])
      
      inline def setBackdropPropsUndefined: Self = StObject.set(x, "backdropProps", js.undefined)
      
      inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      inline def setCanEscapeKeyClose(value: Boolean): Self = StObject.set(x, "canEscapeKeyClose", value.asInstanceOf[js.Any])
      
      inline def setCanEscapeKeyCloseUndefined: Self = StObject.set(x, "canEscapeKeyClose", js.undefined)
      
      inline def setCaptureDismiss(value: Boolean): Self = StObject.set(x, "captureDismiss", value.asInstanceOf[js.Any])
      
      inline def setCaptureDismissUndefined: Self = StObject.set(x, "captureDismiss", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: String | Element): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDefaultIsOpen(value: Boolean): Self = StObject.set(x, "defaultIsOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultIsOpenUndefined: Self = StObject.set(x, "defaultIsOpen", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEnforceFocus(value: Boolean): Self = StObject.set(x, "enforceFocus", value.asInstanceOf[js.Any])
      
      inline def setEnforceFocusUndefined: Self = StObject.set(x, "enforceFocus", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
      
      inline def setHasBackdropUndefined: Self = StObject.set(x, "hasBackdrop", js.undefined)
      
      inline def setHoverCloseDelay(value: Double): Self = StObject.set(x, "hoverCloseDelay", value.asInstanceOf[js.Any])
      
      inline def setHoverCloseDelayUndefined: Self = StObject.set(x, "hoverCloseDelay", js.undefined)
      
      inline def setHoverOpenDelay(value: Double): Self = StObject.set(x, "hoverOpenDelay", value.asInstanceOf[js.Any])
      
      inline def setHoverOpenDelayUndefined: Self = StObject.set(x, "hoverOpenDelay", js.undefined)
      
      inline def setInheritDarkTheme(value: Boolean): Self = StObject.set(x, "inheritDarkTheme", value.asInstanceOf[js.Any])
      
      inline def setInheritDarkThemeUndefined: Self = StObject.set(x, "inheritDarkTheme", js.undefined)
      
      inline def setInteractionKind(value: PopoverInteractionKind): Self = StObject.set(x, "interactionKind", value.asInstanceOf[js.Any])
      
      inline def setInteractionKindUndefined: Self = StObject.set(x, "interactionKind", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      inline def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
      
      inline def setModifiers(value: Modifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setOnClose(value: /* event */ SyntheticEvent[HTMLElement, Event] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnClosed(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onClosed", js.Any.fromFunction1(value))
      
      inline def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
      
      inline def setOnClosing(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onClosing", js.Any.fromFunction1(value))
      
      inline def setOnClosingUndefined: Self = StObject.set(x, "onClosing", js.undefined)
      
      inline def setOnInteraction(
        value: (/* nextOpenState */ Boolean, /* e */ js.UndefOr[SyntheticEvent[HTMLElement, Event]]) => Unit
      ): Self = StObject.set(x, "onInteraction", js.Any.fromFunction2(value))
      
      inline def setOnInteractionUndefined: Self = StObject.set(x, "onInteraction", js.undefined)
      
      inline def setOnOpened(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onOpened", js.Any.fromFunction1(value))
      
      inline def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
      
      inline def setOnOpening(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onOpening", js.Any.fromFunction1(value))
      
      inline def setOnOpeningUndefined: Self = StObject.set(x, "onOpening", js.undefined)
      
      inline def setOpenOnTargetFocus(value: Boolean): Self = StObject.set(x, "openOnTargetFocus", value.asInstanceOf[js.Any])
      
      inline def setOpenOnTargetFocusUndefined: Self = StObject.set(x, "openOnTargetFocus", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPopoverClassName(value: String): Self = StObject.set(x, "popoverClassName", value.asInstanceOf[js.Any])
      
      inline def setPopoverClassNameUndefined: Self = StObject.set(x, "popoverClassName", js.undefined)
      
      inline def setPopoverRef(value: Ref[HTMLElement]): Self = StObject.set(x, "popoverRef", value.asInstanceOf[js.Any])
      
      inline def setPopoverRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "popoverRef", js.Any.fromFunction1(value))
      
      inline def setPopoverRefNull: Self = StObject.set(x, "popoverRef", null)
      
      inline def setPopoverRefUndefined: Self = StObject.set(x, "popoverRef", js.undefined)
      
      inline def setPortalClassName(value: String): Self = StObject.set(x, "portalClassName", value.asInstanceOf[js.Any])
      
      inline def setPortalClassNameUndefined: Self = StObject.set(x, "portalClassName", js.undefined)
      
      inline def setPortalContainer(value: HTMLElement): Self = StObject.set(x, "portalContainer", value.asInstanceOf[js.Any])
      
      inline def setPortalContainerUndefined: Self = StObject.set(x, "portalContainer", js.undefined)
      
      inline def setPosition(value: PopoverPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setShouldReturnFocusOnClose(value: Boolean): Self = StObject.set(x, "shouldReturnFocusOnClose", value.asInstanceOf[js.Any])
      
      inline def setShouldReturnFocusOnCloseUndefined: Self = StObject.set(x, "shouldReturnFocusOnClose", js.undefined)
      
      inline def setTarget(value: String | Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetClassName(value: String): Self = StObject.set(x, "targetClassName", value.asInstanceOf[js.Any])
      
      inline def setTargetClassNameUndefined: Self = StObject.set(x, "targetClassName", js.undefined)
      
      inline def setTargetProps(value: HTMLAttributes[HTMLElement]): Self = StObject.set(x, "targetProps", value.asInstanceOf[js.Any])
      
      inline def setTargetPropsUndefined: Self = StObject.set(x, "targetProps", js.undefined)
      
      inline def setTargetTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ Any): Self = StObject.set(x, "targetTagName", value.asInstanceOf[js.Any])
      
      inline def setTargetTagNameUndefined: Self = StObject.set(x, "targetTagName", js.undefined)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
      
      inline def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
      
      inline def setWrapperTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ Any): Self = StObject.set(x, "wrapperTagName", value.asInstanceOf[js.Any])
      
      inline def setWrapperTagNameUndefined: Self = StObject.set(x, "wrapperTagName", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@blueprintjs/datetime.@blueprintjs/datetime/lib/esm/shortcuts.IShortcutsProps> */
  trait PartialIShortcutsProps extends StObject {
    
    var allowSingleDayRange: js.UndefOr[Boolean] = js.undefined
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var onShortcutClick: js.UndefOr[js.Function2[/* shortcut */ DateRangeShortcut, /* index */ Double, Unit]] = js.undefined
    
    var selectedShortcutIndex: js.UndefOr[Double] = js.undefined
    
    var shortcuts: js.UndefOr[js.Array[DateRangeShortcut] | `true`] = js.undefined
    
    var timePrecision: js.UndefOr[TimePrecision] = js.undefined
    
    var useSingleDateShortcuts: js.UndefOr[Boolean] = js.undefined
  }
  object PartialIShortcutsProps {
    
    inline def apply(): PartialIShortcutsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIShortcutsProps]
    }
    
    extension [Self <: PartialIShortcutsProps](x: Self) {
      
      inline def setAllowSingleDayRange(value: Boolean): Self = StObject.set(x, "allowSingleDayRange", value.asInstanceOf[js.Any])
      
      inline def setAllowSingleDayRangeUndefined: Self = StObject.set(x, "allowSingleDayRange", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setOnShortcutClick(value: (/* shortcut */ DateRangeShortcut, /* index */ Double) => Unit): Self = StObject.set(x, "onShortcutClick", js.Any.fromFunction2(value))
      
      inline def setOnShortcutClickUndefined: Self = StObject.set(x, "onShortcutClick", js.undefined)
      
      inline def setSelectedShortcutIndex(value: Double): Self = StObject.set(x, "selectedShortcutIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedShortcutIndexUndefined: Self = StObject.set(x, "selectedShortcutIndex", js.undefined)
      
      inline def setShortcuts(value: js.Array[DateRangeShortcut] | `true`): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
      
      inline def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
      
      inline def setShortcutsVarargs(value: DateRangeShortcut*): Self = StObject.set(x, "shortcuts", js.Array(value*))
      
      inline def setTimePrecision(value: TimePrecision): Self = StObject.set(x, "timePrecision", value.asInstanceOf[js.Any])
      
      inline def setTimePrecisionUndefined: Self = StObject.set(x, "timePrecision", js.undefined)
      
      inline def setUseSingleDateShortcuts(value: Boolean): Self = StObject.set(x, "useSingleDateShortcuts", value.asInstanceOf[js.Any])
      
      inline def setUseSingleDateShortcutsUndefined: Self = StObject.set(x, "useSingleDateShortcuts", js.undefined)
    }
  }
}
