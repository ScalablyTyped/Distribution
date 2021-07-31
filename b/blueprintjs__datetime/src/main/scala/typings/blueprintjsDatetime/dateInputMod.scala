package typings.blueprintjsDatetime

import typings.blueprintjsCore.inputGroupMod.IInputGroupProps
import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsDatetime.anon.PartialIDateInputProps
import typings.blueprintjsDatetime.anon.PartialIPopoverProps
import typings.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typings.blueprintjsDatetime.datePickerCoreMod.IDatePickerBaseProps
import typings.blueprintjsDatetime.shortcutsMod.IDatePickerShortcut
import typings.react.mod.global.JSX.Element
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateInputMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/dateInput", "DateInput")
  @js.native
  class DateInput protected ()
    extends AbstractPureComponent2[IDateInputProps, IDateInputState, js.Object] {
    def this(props: IDateInputProps) = this()
    def this(props: IDateInputProps, context: js.Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDateInput(prevProps: IDateInputProps, prevState: IDateInputState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDateInput(): Unit = js.native
    
    var formatDate: js.Any = js.native
    
    var getLastTabbableElement: js.Any = js.native
    
    var handleClosePopover: js.Any = js.native
    
    var handleDateChange: js.Any = js.native
    
    var handleInputBlur: js.Any = js.native
    
    var handleInputChange: js.Any = js.native
    
    var handleInputClick: js.Any = js.native
    
    var handleInputFocus: js.Any = js.native
    
    var handleInputKeyDown: js.Any = js.native
    
    var handlePopoverBlur: js.Any = js.native
    
    var handleShortcutChange: js.Any = js.native
    
    var hasMonthChanged: js.Any = js.native
    
    var hasTimeChanged: js.Any = js.native
    
    var inputEl: js.Any = js.native
    
    var isDateInRange: js.Any = js.native
    
    var lastTabbableElement: js.Any = js.native
    
    var parseDate: js.Any = js.native
    
    var popoverContentEl: js.Any = js.native
    
    var refHandlers: js.Any = js.native
    
    var registerPopoverBlurHandler: js.Any = js.native
    
    /** safe wrapper around invoking input props event handler (prop defaults to undefined) */
    var safeInvokeInputProp: js.Any = js.native
    
    var unregisterPopoverBlurHandler: js.Any = js.native
  }
  /* static members */
  object DateInput {
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateInput", "DateInput")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateInput", "DateInput.defaultProps")
    @js.native
    def defaultProps: PartialIDateInputProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialIDateInputProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateInput", "DateInput.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.blueprintjsDatetime.dateFormatMod.IDateFormatProps because var conflicts: locale. Inlined invalidDateMessage, outOfRangeMessage, placeholder, formatDate, formatDate, parseDate, parseDate */ @js.native
  trait IDateInputProps
    extends StObject
       with IDatePickerBaseProps
       with IProps {
    
    /**
      * Allows the user to clear the selection by clicking the currently selected day.
      * Passed to `DatePicker` component.
      * @default true
      */
    var canClearSelection: js.UndefOr[Boolean] = js.native
    
    /**
      * Text for the reset button in the date picker action bar.
      * Passed to `DatePicker` component.
      * @default "Clear"
      */
    var clearButtonText: js.UndefOr[String] = js.native
    
    /**
      * Whether the calendar popover should close when a date is selected.
      * @default true
      */
    var closeOnSelection: js.UndefOr[Boolean] = js.native
    
    /**
      * The default date to be used in the component when uncontrolled.
      */
    var defaultValue: js.UndefOr[Date] = js.native
    
    /**
      * Whether the date input is non-interactive.
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
    def formatDate(date: Date): String = js.native
    def formatDate(date: Date, locale: String): String = js.native
    
    /**
      * Props to pass to the [input group](#core/components/text-inputs.input-group).
      * `disabled` and `value` will be ignored in favor of the top-level props on this component.
      * `type` is fixed to "text" and `ref` is not supported; use `inputRef` instead.
      */
    var inputProps: js.UndefOr[HTMLInputProps & IInputGroupProps] = js.native
    
    /**
      * The error message to display when the date selected is invalid.
      * @default "Invalid date"
      */
    var invalidDateMessage: js.UndefOr[String] = js.native
    
    /**
      * Called when the user selects a new valid date through the `DatePicker` or by typing
      * in the input. The second argument is true if the user clicked on a date in the
      * calendar, changed the input value, or cleared the selection; it will be false if the date
      * was changed by choosing a new month or year.
      */
    var onChange: js.UndefOr[js.Function2[/* selectedDate */ Date, /* isUserChange */ Boolean, Unit]] = js.native
    
    /**
      * Called when the user finishes typing in a new date and the date causes an error state.
      * If the date is invalid, `new Date(undefined)` will be returned. If the date is out of range,
      * the out of range date will be returned (`onChange` is not called in this case).
      */
    var onError: js.UndefOr[js.Function1[/* errorDate */ Date, Unit]] = js.native
    
    /**
      * The error message to display when the date selected is out of range.
      * @default "Out of range"
      */
    var outOfRangeMessage: js.UndefOr[String] = js.native
    
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
      * @default false
      */
    var shortcuts: js.UndefOr[Boolean | js.Array[IDatePickerShortcut]] = js.native
    
    /**
      * Whether the bottom bar displaying "Today" and "Clear" buttons should be shown below the calendar.
      * @default false
      */
    var showActionsBar: js.UndefOr[Boolean] = js.native
    
    /**
      * Text for the today button in the date picker action bar.
      * Passed to `DatePicker` component.
      * @default "Today"
      */
    var todayButtonText: js.UndefOr[String] = js.native
    
    /**
      * The currently selected day. If this prop is provided, the component acts in a controlled manner.
      * To display no date in the input field, pass `null` to the value prop. To display an invalid date error
      * in the input field, pass `new Date(undefined)` to the value prop.
      */
    var value: js.UndefOr[Date | Null] = js.native
  }
  
  trait IDateInputState extends StObject {
    
    var isInputFocused: Boolean
    
    var isOpen: Boolean
    
    var selectedShortcutIndex: js.UndefOr[Double] = js.undefined
    
    var value: Date
    
    var valueString: String
  }
  object IDateInputState {
    
    @scala.inline
    def apply(isInputFocused: Boolean, isOpen: Boolean, value: Date, valueString: String): IDateInputState = {
      val __obj = js.Dynamic.literal(isInputFocused = isInputFocused.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueString = valueString.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDateInputState]
    }
    
    @scala.inline
    implicit class IDateInputStateMutableBuilder[Self <: IDateInputState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsInputFocused(value: Boolean): Self = StObject.set(x, "isInputFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedShortcutIndex(value: Double): Self = StObject.set(x, "selectedShortcutIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedShortcutIndexUndefined: Self = StObject.set(x, "selectedShortcutIndex", js.undefined)
      
      @scala.inline
      def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    }
  }
}
