package typings.blueprintjsDatetime

import typings.blueprintjsCore.boundaryMod.Boundary
import typings.blueprintjsCore.inputGroupMod.IInputGroupProps
import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsDatetime.anon.PartialIDateRangeInputPro
import typings.blueprintjsDatetime.anon.PartialIPopoverProps
import typings.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typings.blueprintjsDatetime.datePickerCoreMod.IDatePickerBaseProps
import typings.blueprintjsDatetime.dateRangeMod.DateRange
import typings.blueprintjsDatetime.shortcutsMod.IDateRangeShortcut
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateRangeInputMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/dateRangeInput", "DateRangeInput")
  @js.native
  class DateRangeInput protected ()
    extends AbstractPureComponent2[IDateRangeInputProps, IDateRangeInputState, js.Object] {
    def this(props: IDateRangeInputProps) = this()
    def this(props: IDateRangeInputProps, context: js.Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDateRangeInput(prevProps: IDateRangeInputProps, prevState: IDateRangeInputState): Unit = js.native
    
    var doBoundaryDatesOverlap: js.Any = js.native
    
    /**
      * Returns true if the provided boundary is an END boundary overlapping the
      * selected start date. (If the boundaries overlap, we consider the END
      * boundary to be erroneous.)
      */
    var doesEndBoundaryOverlapStartBoundary: js.Any = js.native
    
    var endInputRef: js.Any = js.native
    
    var formatDate: js.Any = js.native
    
    var getDateRangeForCallback: js.Any = js.native
    
    var getFormattedMinMaxDateString: js.Any = js.native
    
    var getInitialRange: js.Any = js.native
    
    var getInputDisplayString: js.Any = js.native
    
    var getInputPlaceholderString: js.Any = js.native
    
    var getInputProps: js.Any = js.native
    
    var getInputRef: js.Any = js.native
    
    var getIsOpenValueWhenDateChanges: js.Any = js.native
    
    var getOtherBoundary: js.Any = js.native
    
    var getSelectedRange: js.Any = js.native
    
    var getStateKeysAndValuesForBoundary: js.Any = js.native
    
    var handleDateRangePickerChange: js.Any = js.native
    
    var handleDateRangePickerHoverChange: js.Any = js.native
    
    var handleEndInputEvent: js.Any = js.native
    
    var handleInputBlur: js.Any = js.native
    
    var handleInputChange: js.Any = js.native
    
    var handleInputClick: js.Any = js.native
    
    var handleInputEvent: js.Any = js.native
    
    var handleInputFocus: js.Any = js.native
    
    var handleInputKeyDown: js.Any = js.native
    
    var handleInputMouseDown: js.Any = js.native
    
    var handlePopoverClose: js.Any = js.native
    
    var handleShortcutChange: js.Any = js.native
    
    var handleStartInputEvent: js.Any = js.native
    
    var isControlled: js.Any = js.native
    
    var isDateValidAndInRange: js.Any = js.native
    
    var isInputEmpty: js.Any = js.native
    
    var isInputInErrorState: js.Any = js.native
    
    var isNextDateRangeValid: js.Any = js.native
    
    var parseDate: js.Any = js.native
    
    var refHandlers: js.Any = js.native
    
    var renderInputGroup: js.Any = js.native
    
    /**
      * Public method intended for unit testing only. Do not use in feature work!
      */
    def reset(): Unit = js.native
    def reset(props: IDateRangeInputProps): Unit = js.native
    
    var shouldFocusInputRef: js.Any = js.native
    
    var startInputRef: js.Any = js.native
  }
  /* static members */
  object DateRangeInput {
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeInput", "DateRangeInput")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeInput", "DateRangeInput.defaultProps")
    @js.native
    def defaultProps: PartialIDateRangeInputPro = js.native
    @scala.inline
    def defaultProps_=(x: PartialIDateRangeInputPro): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeInput", "DateRangeInput.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.blueprintjsDatetime.dateFormatMod.IDateFormatProps because var conflicts: locale. Inlined invalidDateMessage, outOfRangeMessage, placeholder, formatDate, formatDate, parseDate, parseDate */ @js.native
  trait IDateRangeInputProps
    extends StObject
       with IDatePickerBaseProps
       with IProps {
    
    /**
      * Whether the start and end dates of the range can be the same day.
      * If `true`, clicking a selected date will create a one-day range.
      * If `false`, clicking a selected date will clear the selection.
      * @default false
      */
    var allowSingleDayRange: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the calendar popover should close when a date range is fully selected.
      * @default true
      */
    var closeOnSelection: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether displayed months in the calendar are contiguous.
      * If false, each side of the calendar can move independently to non-contiguous months.
      * @default true
      */
    var contiguousCalendarMonths: js.UndefOr[Boolean] = js.native
    
    /**
      * The default date range to be used in the component when uncontrolled.
      * This will be ignored if `value` is set.
      */
    var defaultValue: js.UndefOr[DateRange] = js.native
    
    /**
      * Whether the text inputs are non-interactive.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Props to pass to the end-date [input group](#core/components/text-inputs.input-group).
      * `disabled` and `value` will be ignored in favor of the top-level props on this component.
      * `ref` is not supported; use `inputRef` instead.
      */
    var endInputProps: js.UndefOr[HTMLInputProps & IInputGroupProps] = js.native
    
    /**
      * Function to render a JavaScript `Date` to a string.
      * Optional `locale` argument comes directly from the prop on this component:
      * if the prop is defined, then the argument will be too.
      */
    def formatDate(date: Date): String = js.native
    def formatDate(date: Date, locale: String): String = js.native
    
    /**
      * The error message to display when the date selected is invalid.
      * @default "Invalid date"
      */
    var invalidDateMessage: js.UndefOr[String] = js.native
    
    /**
      * Called when the user selects a day.
      * If no days are selected, it will pass `[null, null]`.
      * If a start date is selected but not an end date, it will pass `[selectedDate, null]`.
      * If both a start and end date are selected, it will pass `[startDate, endDate]`.
      */
    var onChange: js.UndefOr[js.Function1[/* selectedRange */ DateRange, Unit]] = js.native
    
    /**
      * Called when the user finishes typing in a new date and the date causes an error state.
      * If the date is invalid, `new Date(undefined)` will be returned for the corresponding
      * boundary of the date range.
      * If the date is out of range, the out-of-range date will be returned for the corresponding
      * boundary of the date range (`onChange` is not called in this case).
      */
    var onError: js.UndefOr[js.Function1[/* errorRange */ DateRange, Unit]] = js.native
    
    /**
      * The error message to display when the date selected is out of range.
      * @default "Out of range"
      */
    var outOfRangeMessage: js.UndefOr[String] = js.native
    
    /**
      * The error message to display when the selected dates overlap.
      * This can only happen when typing dates in the input field.
      * @default "Overlapping dates"
      */
    var overlappingDatesMessage: js.UndefOr[String] = js.native
    
    /**
      * Function to deserialize user input text to a JavaScript `Date` object.
      * Return `false` if the string is an invalid date.
      * Return `null` to represent the absence of a date.
      * Optional `locale` argument comes directly from the prop on this component.
      */
    def parseDate(str: String): Date | `false` | Null = js.native
    def parseDate(str: String, locale: String): Date | `false` | Null = js.native
    
    /**
      * Placeholder text to display in empty input fields.
      * Recommended practice is to indicate the expected date format.
      */
    var placeholder: js.UndefOr[String] = js.native
    
    /**
      * The props to pass to the popover.
      * `autoFocus`, `content`, and `enforceFocus` will be ignored to avoid compromising usability.
      */
    var popoverProps: js.UndefOr[PartialIPopoverProps] = js.native
    
    /**
      * Whether the entire text field should be selected on focus.
      * @default false
      */
    var selectAllOnFocus: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether shortcuts to quickly select a range of dates are displayed or not.
      * If `true`, preset shortcuts will be displayed.
      * If `false`, no shortcuts will be displayed.
      * If an array is provided, the custom shortcuts will be displayed.
      * @default true
      */
    var shortcuts: js.UndefOr[Boolean | js.Array[IDateRangeShortcut]] = js.native
    
    /**
      * Whether to show only a single month calendar.
      * @default false
      */
    var singleMonthOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * Props to pass to the start-date [input group](#core/components/text-inputs.input-group).
      * `disabled` and `value` will be ignored in favor of the top-level props on this component.
      * `ref` is not supported; use `inputRef` instead.
      */
    var startInputProps: js.UndefOr[HTMLInputProps & IInputGroupProps] = js.native
    
    /**
      * The currently selected date range.
      * If the prop is strictly `undefined`, the component acts in an uncontrolled manner.
      * If this prop is anything else, the component acts in a controlled manner.
      * To display an empty value in the input fields in a controlled manner, pass `[null, null]`.
      * To display an invalid date error in either input field, pass `new Date(undefined)`
      * for the appropriate date in the value prop.
      */
    var value: js.UndefOr[DateRange] = js.native
  }
  
  trait IDateRangeInputState extends StObject {
    
    var boundaryToModify: js.UndefOr[Boundary] = js.undefined
    
    var endHoverString: js.UndefOr[String] = js.undefined
    
    var endInputString: js.UndefOr[String] = js.undefined
    
    var formattedMaxDateString: js.UndefOr[String] = js.undefined
    
    var formattedMinDateString: js.UndefOr[String] = js.undefined
    
    var isEndInputFocused: js.UndefOr[Boolean] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var isStartInputFocused: js.UndefOr[Boolean] = js.undefined
    
    var lastFocusedField: js.UndefOr[Boundary] = js.undefined
    
    var selectedEnd: js.UndefOr[Date] = js.undefined
    
    var selectedShortcutIndex: js.UndefOr[Double] = js.undefined
    
    var selectedStart: js.UndefOr[Date] = js.undefined
    
    var shouldSelectAfterUpdate: js.UndefOr[Boolean] = js.undefined
    
    var startHoverString: js.UndefOr[String] = js.undefined
    
    var startInputString: js.UndefOr[String] = js.undefined
    
    var wasLastFocusChangeDueToHover: js.UndefOr[Boolean] = js.undefined
  }
  object IDateRangeInputState {
    
    @scala.inline
    def apply(): IDateRangeInputState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDateRangeInputState]
    }
    
    @scala.inline
    implicit class IDateRangeInputStateMutableBuilder[Self <: IDateRangeInputState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoundaryToModify(value: Boundary): Self = StObject.set(x, "boundaryToModify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryToModifyUndefined: Self = StObject.set(x, "boundaryToModify", js.undefined)
      
      @scala.inline
      def setEndHoverString(value: String): Self = StObject.set(x, "endHoverString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndHoverStringUndefined: Self = StObject.set(x, "endHoverString", js.undefined)
      
      @scala.inline
      def setEndInputString(value: String): Self = StObject.set(x, "endInputString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndInputStringUndefined: Self = StObject.set(x, "endInputString", js.undefined)
      
      @scala.inline
      def setFormattedMaxDateString(value: String): Self = StObject.set(x, "formattedMaxDateString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormattedMaxDateStringUndefined: Self = StObject.set(x, "formattedMaxDateString", js.undefined)
      
      @scala.inline
      def setFormattedMinDateString(value: String): Self = StObject.set(x, "formattedMinDateString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormattedMinDateStringUndefined: Self = StObject.set(x, "formattedMinDateString", js.undefined)
      
      @scala.inline
      def setIsEndInputFocused(value: Boolean): Self = StObject.set(x, "isEndInputFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEndInputFocusedUndefined: Self = StObject.set(x, "isEndInputFocused", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setIsStartInputFocused(value: Boolean): Self = StObject.set(x, "isStartInputFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStartInputFocusedUndefined: Self = StObject.set(x, "isStartInputFocused", js.undefined)
      
      @scala.inline
      def setLastFocusedField(value: Boundary): Self = StObject.set(x, "lastFocusedField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastFocusedFieldUndefined: Self = StObject.set(x, "lastFocusedField", js.undefined)
      
      @scala.inline
      def setSelectedEnd(value: Date): Self = StObject.set(x, "selectedEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedEndUndefined: Self = StObject.set(x, "selectedEnd", js.undefined)
      
      @scala.inline
      def setSelectedShortcutIndex(value: Double): Self = StObject.set(x, "selectedShortcutIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedShortcutIndexUndefined: Self = StObject.set(x, "selectedShortcutIndex", js.undefined)
      
      @scala.inline
      def setSelectedStart(value: Date): Self = StObject.set(x, "selectedStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedStartUndefined: Self = StObject.set(x, "selectedStart", js.undefined)
      
      @scala.inline
      def setShouldSelectAfterUpdate(value: Boolean): Self = StObject.set(x, "shouldSelectAfterUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldSelectAfterUpdateUndefined: Self = StObject.set(x, "shouldSelectAfterUpdate", js.undefined)
      
      @scala.inline
      def setStartHoverString(value: String): Self = StObject.set(x, "startHoverString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartHoverStringUndefined: Self = StObject.set(x, "startHoverString", js.undefined)
      
      @scala.inline
      def setStartInputString(value: String): Self = StObject.set(x, "startInputString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartInputStringUndefined: Self = StObject.set(x, "startInputString", js.undefined)
      
      @scala.inline
      def setWasLastFocusChangeDueToHover(value: Boolean): Self = StObject.set(x, "wasLastFocusChangeDueToHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWasLastFocusChangeDueToHoverUndefined: Self = StObject.set(x, "wasLastFocusChangeDueToHover", js.undefined)
    }
  }
}
