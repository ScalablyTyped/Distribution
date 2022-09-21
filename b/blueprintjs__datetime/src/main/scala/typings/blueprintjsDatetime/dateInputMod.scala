package typings.blueprintjsDatetime

import typings.blueprintjsCore.inputGroupMod.InputGroupProps2
import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsDatetime.anon.PartialDateInputProps
import typings.blueprintjsDatetime.anon.PartialIPopoverProps
import typings.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typings.blueprintjsDatetime.datePickerCoreMod.DatePickerBaseProps
import typings.blueprintjsDatetime.shortcutsMod.DatePickerShortcut
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateInputMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/dateInput", "DateInput")
  @js.native
  open class DateInput protected ()
    extends AbstractPureComponent2[DateInputProps, IDateInputState, js.Object] {
    def this(props: DateInputProps) = this()
    def this(props: DateInputProps, context: Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDateInput(prevProps: DateInputProps, prevState: IDateInputState): Unit = js.native
    
    /* private */ var formatDate: Any = js.native
    
    /* private */ var getKeyboardFocusableElements: Any = js.native
    
    /* private */ var getRelatedTarget: Any = js.native
    
    /* private */ var handleClosePopover: Any = js.native
    
    /* private */ var handleDateChange: Any = js.native
    
    /* private */ var handleEndFocusBoundaryFocusIn: Any = js.native
    
    /* private */ var handleInputBlur: Any = js.native
    
    /* private */ var handleInputChange: Any = js.native
    
    /* private */ var handleInputClick: Any = js.native
    
    /* private */ var handleInputFocus: Any = js.native
    
    /* private */ var handleInputKeyDown: Any = js.native
    
    /* private */ var handleInputRef: Any = js.native
    
    /* private */ var handlePopoverContentRef: Any = js.native
    
    /* private */ var handleShortcutChange: Any = js.native
    
    /* private */ var handleStartFocusBoundaryFocusIn: Any = js.native
    
    /* private */ var hasMonthChanged: Any = js.native
    
    /* private */ var hasTimeChanged: Any = js.native
    
    var inputElement: HTMLInputElement | Null = js.native
    
    /* private */ var isDateInRange: Any = js.native
    
    /* private */ var parseDate: Any = js.native
    
    var popoverContentElement: HTMLDivElement | Null = js.native
    
    /** safe wrapper around invoking input props event handler (prop defaults to undefined) */
    /* private */ var safeInvokeInputProp: Any = js.native
  }
  /* static members */
  object DateInput {
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateInput", "DateInput")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateInput", "DateInput.defaultProps")
    @js.native
    def defaultProps: PartialDateInputProps = js.native
    inline def defaultProps_=(x: PartialDateInputProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateInput", "DateInput.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type DateInputProps = IDateInputProps
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.blueprintjsDatetime.dateFormatMod.IDateFormatProps because var conflicts: locale. Inlined invalidDateMessage, outOfRangeMessage, placeholder, formatDate, formatDate, parseDate, parseDate */ @js.native
  trait IDateInputProps
    extends StObject
       with DatePickerBaseProps
       with IProps {
    
    /**
      * Allows the user to clear the selection by clicking the currently selected day.
      * Passed to `DatePicker` component.
      *
      * @default true
      */
    var canClearSelection: js.UndefOr[Boolean] = js.native
    
    /**
      * Text for the reset button in the date picker action bar.
      * Passed to `DatePicker` component.
      *
      * @default "Clear"
      */
    var clearButtonText: js.UndefOr[String] = js.native
    
    /**
      * Whether the calendar popover should close when a date is selected.
      *
      * @default true
      */
    var closeOnSelection: js.UndefOr[Boolean] = js.native
    
    /**
      * The default date to be used in the component when uncontrolled.
      */
    var defaultValue: js.UndefOr[js.Date] = js.native
    
    /**
      * Whether the date input is non-interactive.
      *
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the component should take up the full width of its container.
      */
    var fill: js.UndefOr[Boolean] = js.native
    
    /**
      * Function to render a JavaScript `Date` to a string.
      * Optional `locale` argument comes directly from the prop on this component:
      * if the prop is defined, then the argument will be too.
      */
    def formatDate(date: js.Date): String = js.native
    def formatDate(date: js.Date, locale: String): String = js.native
    
    /**
      * Props to pass to the [input group](#core/components/text-inputs.input-group).
      * `disabled` and `value` will be ignored in favor of the top-level props on this component.
      * `type` is fixed to "text".
      */
    var inputProps: js.UndefOr[InputGroupProps2] = js.native
    
    /**
      * The error message to display when the date selected is invalid.
      *
      * @default "Invalid date"
      */
    var invalidDateMessage: js.UndefOr[String] = js.native
    
    /**
      * Called when the user selects a new valid date through the DatePicker or by typing
      * in the input.
      *
      * @param newDate Date or `null` (if the date is invalid or text input has been cleared)
      * @param isUserChange `true` if the user clicked on a date in the calendar, changed the input value,
      *     or cleared the selection; `false` if the date was changed by changing the month or year.
      */
    var onChange: js.UndefOr[
        js.Function2[/* selectedDate */ js.Date | Null, /* isUserChange */ Boolean, Unit]
      ] = js.native
    
    /**
      * Called when the user finishes typing in a new date and the date causes an error state.
      * If the date is invalid, `new Date(undefined)` will be returned. If the date is out of range,
      * the out of range date will be returned (`onChange` is not called in this case).
      */
    var onError: js.UndefOr[js.Function1[/* errorDate */ js.Date, Unit]] = js.native
    
    /**
      * The error message to display when the date selected is out of range.
      *
      * @default "Out of range"
      */
    var outOfRangeMessage: js.UndefOr[String] = js.native
    
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
      * Props to pass to the `Popover`.
      * Note that `content`, `autoFocus`, and `enforceFocus` cannot be changed.
      */
    var popoverProps: js.UndefOr[PartialIPopoverProps & js.Object] = js.native
    
    /**
      * Element to render on right side of input.
      */
    var rightElement: js.UndefOr[Element] = js.native
    
    /**
      * Whether shortcuts to quickly select a date are displayed or not.
      * If `true`, preset shortcuts will be displayed.
      * If `false`, no shortcuts will be displayed.
      * If an array is provided, the custom shortcuts will be displayed.
      *
      * @default false
      */
    var shortcuts: js.UndefOr[Boolean | js.Array[DatePickerShortcut]] = js.native
    
    /**
      * Whether the bottom bar displaying "Today" and "Clear" buttons should be shown below the calendar.
      *
      * @default false
      */
    var showActionsBar: js.UndefOr[Boolean] = js.native
    
    /**
      * Text for the today button in the date picker action bar.
      * Passed to `DatePicker` component.
      *
      * @default "Today"
      */
    var todayButtonText: js.UndefOr[String] = js.native
    
    /**
      * The currently selected day. If this prop is provided, the component acts in a controlled manner.
      * To display no date in the input field, pass `null` to the value prop. To display an invalid date error
      * in the input field, pass `new Date(undefined)` to the value prop.
      */
    var value: js.UndefOr[js.Date | Null] = js.native
  }
  
  trait IDateInputState extends StObject {
    
    var isInputFocused: Boolean
    
    var isOpen: Boolean
    
    var selectedShortcutIndex: js.UndefOr[Double] = js.undefined
    
    var value: js.Date
    
    var valueString: String
  }
  object IDateInputState {
    
    inline def apply(isInputFocused: Boolean, isOpen: Boolean, value: js.Date, valueString: String): IDateInputState = {
      val __obj = js.Dynamic.literal(isInputFocused = isInputFocused.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueString = valueString.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDateInputState]
    }
    
    extension [Self <: IDateInputState](x: Self) {
      
      inline def setIsInputFocused(value: Boolean): Self = StObject.set(x, "isInputFocused", value.asInstanceOf[js.Any])
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setSelectedShortcutIndex(value: Double): Self = StObject.set(x, "selectedShortcutIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedShortcutIndexUndefined: Self = StObject.set(x, "selectedShortcutIndex", js.undefined)
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    }
  }
}
