package typings.blueprintjsDatetime

import typings.blueprintjsCore.libEsmCommonBoundaryMod.Boundary
import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.blueprintjsCore.libEsmComponentsFormsInputGroupMod.InputGroupProps2
import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsDatetime.anon.PartialDateRangeInputProp
import typings.blueprintjsDatetime.anon.PartialIPopoverProps
import typings.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typings.blueprintjsDatetime.libEsmCommonDateRangeMod.DateRange
import typings.blueprintjsDatetime.libEsmDatePickerCoreMod.DatePickerBaseProps
import typings.blueprintjsDatetime.libEsmShortcutsMod.DateRangeShortcut
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmDateRangeInputMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/dateRangeInput", "DateRangeInput")
  @js.native
  open class DateRangeInput protected ()
    extends AbstractPureComponent2[DateRangeInputProps, IDateRangeInputState, js.Object] {
    def this(props: DateRangeInputProps) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDateRangeInput(prevProps: DateRangeInputProps, prevState: IDateRangeInputState): Unit = js.native
    
    /* private */ var doBoundaryDatesOverlap: Any = js.native
    
    /**
      * Returns true if the provided boundary is an END boundary overlapping the
      * selected start date. (If the boundaries overlap, we consider the END
      * boundary to be erroneous.)
      */
    /* private */ var doesEndBoundaryOverlapStartBoundary: Any = js.native
    
    var endInputElement: HTMLInputElement | Null = js.native
    
    /* private */ var formatDate: Any = js.native
    
    /* private */ var getDateRangeForCallback: Any = js.native
    
    /* private */ var getFormattedMinMaxDateString: Any = js.native
    
    /* private */ var getInitialRange: Any = js.native
    
    /* private */ var getInputDisplayString: Any = js.native
    
    /* private */ var getInputPlaceholderString: Any = js.native
    
    /* private */ var getInputProps: Any = js.native
    
    /* private */ var getInputRef: Any = js.native
    
    /* private */ var getIsOpenValueWhenDateChanges: Any = js.native
    
    /* private */ var getOtherBoundary: Any = js.native
    
    /* private */ var getSelectedRange: Any = js.native
    
    /* private */ var getStateKeysAndValuesForBoundary: Any = js.native
    
    /* private */ var handleDateRangePickerChange: Any = js.native
    
    /* private */ var handleDateRangePickerHoverChange: Any = js.native
    
    /* private */ var handleEndInputEvent: Any = js.native
    
    /* private */ var handleEndInputRef: Any = js.native
    
    /* private */ var handleInputBlur: Any = js.native
    
    /* private */ var handleInputChange: Any = js.native
    
    /* private */ var handleInputClick: Any = js.native
    
    /* private */ var handleInputEvent: Any = js.native
    
    /* private */ var handleInputFocus: Any = js.native
    
    /* private */ var handleInputKeyDown: Any = js.native
    
    /* private */ var handleInputMouseDown: Any = js.native
    
    /* private */ var handlePopoverClose: Any = js.native
    
    /* private */ var handleShortcutChange: Any = js.native
    
    /* private */ var handleStartInputEvent: Any = js.native
    
    /* private */ var handleStartInputRef: Any = js.native
    
    /* private */ var isControlled: Any = js.native
    
    /* private */ var isDateValidAndInRange: Any = js.native
    
    /* private */ var isInputEmpty: Any = js.native
    
    /* private */ var isInputInErrorState: Any = js.native
    
    /* private */ var isNextDateRangeValid: Any = js.native
    
    /* private */ var parseDate: Any = js.native
    
    /* private */ var renderInputGroup: Any = js.native
    
    /**
      * Public method intended for unit testing only. Do not use in feature work!
      */
    def reset(): Unit = js.native
    def reset(props: DateRangeInputProps): Unit = js.native
    
    /* private */ var shouldFocusInputRef: Any = js.native
    
    var startInputElement: HTMLInputElement | Null = js.native
  }
  /* static members */
  object DateRangeInput {
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeInput", "DateRangeInput")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeInput", "DateRangeInput.defaultProps")
    @js.native
    def defaultProps: PartialDateRangeInputProp = js.native
    inline def defaultProps_=(x: PartialDateRangeInputProp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeInput", "DateRangeInput.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type DateRangeInputProps = IDateRangeInputProps
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.blueprintjsDatetime.libEsmDateFormatMod.IDateFormatProps because var conflicts: locale. Inlined invalidDateMessage, outOfRangeMessage, placeholder, formatDate, formatDate, parseDate, parseDate */ @js.native
  trait IDateRangeInputProps
    extends StObject
       with DatePickerBaseProps
       with IProps {
    
    /**
      * Whether the start and end dates of the range can be the same day.
      * If `true`, clicking a selected date will create a one-day range.
      * If `false`, clicking a selected date will clear the selection.
      *
      * @default false
      */
    var allowSingleDayRange: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the calendar popover should close when a date range is fully selected.
      *
      * @default true
      */
    var closeOnSelection: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether displayed months in the calendar are contiguous.
      * If false, each side of the calendar can move independently to non-contiguous months.
      *
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
      *
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Props to pass to the end-date [input group](#core/components/text-inputs.input-group).
      * `disabled` and `value` will be ignored in favor of the top-level props on this component.
      * `ref` is not supported; use `inputRef` instead.
      */
    var endInputProps: js.UndefOr[InputGroupProps2] = js.native
    
    /**
      * Function to render a JavaScript `Date` to a string.
      * Optional `locale` argument comes directly from the prop on this component:
      * if the prop is defined, then the argument will be too.
      */
    def formatDate(date: js.Date): String = js.native
    def formatDate(date: js.Date, locale: String): String = js.native
    
    /**
      * The error message to display when the date selected is invalid.
      *
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
      *
      * @default "Out of range"
      */
    var outOfRangeMessage: js.UndefOr[String] = js.native
    
    /**
      * The error message to display when the selected dates overlap.
      * This can only happen when typing dates in the input field.
      *
      * @default "Overlapping dates"
      */
    var overlappingDatesMessage: js.UndefOr[String] = js.native
    
    /**
      * Function to deserialize user input text to a JavaScript `Date` object.
      * Return `false` if the string is an invalid date.
      * Return `null` to represent the absence of a date.
      * Optional `locale` argument comes directly from the prop on this component.
      */
    def parseDate(str: String): js.Date | `false` | Null = js.native
    def parseDate(str: String, locale: String): js.Date | `false` | Null = js.native
    
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
      *
      * @default false
      */
    var selectAllOnFocus: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether shortcuts to quickly select a range of dates are displayed or not.
      * If `true`, preset shortcuts will be displayed.
      * If `false`, no shortcuts will be displayed.
      * If an array is provided, the custom shortcuts will be displayed.
      *
      * @default true
      */
    var shortcuts: js.UndefOr[Boolean | js.Array[DateRangeShortcut]] = js.native
    
    /**
      * Whether to show only a single month calendar.
      *
      * @default false
      */
    var singleMonthOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * Props to pass to the start-date [input group](#core/components/text-inputs.input-group).
      * `disabled` and `value` will be ignored in favor of the top-level props on this component.
      * `ref` is not supported; use `inputRef` instead.
      */
    var startInputProps: js.UndefOr[InputGroupProps2] = js.native
    
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
    
    var selectedEnd: js.UndefOr[js.Date] = js.undefined
    
    var selectedShortcutIndex: js.UndefOr[Double] = js.undefined
    
    var selectedStart: js.UndefOr[js.Date] = js.undefined
    
    var shouldSelectAfterUpdate: js.UndefOr[Boolean] = js.undefined
    
    var startHoverString: js.UndefOr[String] = js.undefined
    
    var startInputString: js.UndefOr[String] = js.undefined
    
    var wasLastFocusChangeDueToHover: js.UndefOr[Boolean] = js.undefined
  }
  object IDateRangeInputState {
    
    inline def apply(): IDateRangeInputState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDateRangeInputState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDateRangeInputState] (val x: Self) extends AnyVal {
      
      inline def setBoundaryToModify(value: Boundary): Self = StObject.set(x, "boundaryToModify", value.asInstanceOf[js.Any])
      
      inline def setBoundaryToModifyUndefined: Self = StObject.set(x, "boundaryToModify", js.undefined)
      
      inline def setEndHoverString(value: String): Self = StObject.set(x, "endHoverString", value.asInstanceOf[js.Any])
      
      inline def setEndHoverStringUndefined: Self = StObject.set(x, "endHoverString", js.undefined)
      
      inline def setEndInputString(value: String): Self = StObject.set(x, "endInputString", value.asInstanceOf[js.Any])
      
      inline def setEndInputStringUndefined: Self = StObject.set(x, "endInputString", js.undefined)
      
      inline def setFormattedMaxDateString(value: String): Self = StObject.set(x, "formattedMaxDateString", value.asInstanceOf[js.Any])
      
      inline def setFormattedMaxDateStringUndefined: Self = StObject.set(x, "formattedMaxDateString", js.undefined)
      
      inline def setFormattedMinDateString(value: String): Self = StObject.set(x, "formattedMinDateString", value.asInstanceOf[js.Any])
      
      inline def setFormattedMinDateStringUndefined: Self = StObject.set(x, "formattedMinDateString", js.undefined)
      
      inline def setIsEndInputFocused(value: Boolean): Self = StObject.set(x, "isEndInputFocused", value.asInstanceOf[js.Any])
      
      inline def setIsEndInputFocusedUndefined: Self = StObject.set(x, "isEndInputFocused", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setIsStartInputFocused(value: Boolean): Self = StObject.set(x, "isStartInputFocused", value.asInstanceOf[js.Any])
      
      inline def setIsStartInputFocusedUndefined: Self = StObject.set(x, "isStartInputFocused", js.undefined)
      
      inline def setLastFocusedField(value: Boundary): Self = StObject.set(x, "lastFocusedField", value.asInstanceOf[js.Any])
      
      inline def setLastFocusedFieldUndefined: Self = StObject.set(x, "lastFocusedField", js.undefined)
      
      inline def setSelectedEnd(value: js.Date): Self = StObject.set(x, "selectedEnd", value.asInstanceOf[js.Any])
      
      inline def setSelectedEndUndefined: Self = StObject.set(x, "selectedEnd", js.undefined)
      
      inline def setSelectedShortcutIndex(value: Double): Self = StObject.set(x, "selectedShortcutIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedShortcutIndexUndefined: Self = StObject.set(x, "selectedShortcutIndex", js.undefined)
      
      inline def setSelectedStart(value: js.Date): Self = StObject.set(x, "selectedStart", value.asInstanceOf[js.Any])
      
      inline def setSelectedStartUndefined: Self = StObject.set(x, "selectedStart", js.undefined)
      
      inline def setShouldSelectAfterUpdate(value: Boolean): Self = StObject.set(x, "shouldSelectAfterUpdate", value.asInstanceOf[js.Any])
      
      inline def setShouldSelectAfterUpdateUndefined: Self = StObject.set(x, "shouldSelectAfterUpdate", js.undefined)
      
      inline def setStartHoverString(value: String): Self = StObject.set(x, "startHoverString", value.asInstanceOf[js.Any])
      
      inline def setStartHoverStringUndefined: Self = StObject.set(x, "startHoverString", js.undefined)
      
      inline def setStartInputString(value: String): Self = StObject.set(x, "startInputString", value.asInstanceOf[js.Any])
      
      inline def setStartInputStringUndefined: Self = StObject.set(x, "startInputString", js.undefined)
      
      inline def setWasLastFocusChangeDueToHover(value: Boolean): Self = StObject.set(x, "wasLastFocusChangeDueToHover", value.asInstanceOf[js.Any])
      
      inline def setWasLastFocusChangeDueToHoverUndefined: Self = StObject.set(x, "wasLastFocusChangeDueToHover", js.undefined)
    }
  }
}
