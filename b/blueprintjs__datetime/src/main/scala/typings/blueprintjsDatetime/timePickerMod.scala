package typings.blueprintjsDatetime

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsDatetime.blueprintjsDatetimeStrings.millisecond
import typings.blueprintjsDatetime.blueprintjsDatetimeStrings.minute
import typings.blueprintjsDatetime.blueprintjsDatetimeStrings.second
import typings.blueprintjsDatetime.timeUnitMod.TimeUnit
import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.std.Date
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timePickerMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/timePicker", "TimePicker")
  @js.native
  class TimePicker ()
    extends Component[ITimePickerProps, ITimePickerState, js.Any] {
    def this(props: ITimePickerProps) = this()
    def this(props: Unit, context: js.Any) = this()
    def this(props: ITimePickerProps, context: js.Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTimePicker(prevProps: ITimePickerProps): Unit = js.native
    
    var decrementTime: js.Any = js.native
    
    /**
      * Generates a full ITimePickerState object with all text fields set to formatted strings based on value
      */
    var getFullStateFromValue: js.Any = js.native
    
    var getInputBlurHandler: js.Any = js.native
    
    var getInputChangeHandler: js.Any = js.native
    
    var getInputFocusHandler: js.Any = js.native
    
    var getInputKeyDownHandler: js.Any = js.native
    
    var getInputKeyUpHandler: js.Any = js.native
    
    var handleAmPmChange: js.Any = js.native
    
    var incrementTime: js.Any = js.native
    
    var maybeRenderAmPm: js.Any = js.native
    
    var maybeRenderArrowButton: js.Any = js.native
    
    var renderDivider: js.Any = js.native
    
    var renderInput: js.Any = js.native
    
    var shiftTime: js.Any = js.native
    
    var updateState: js.Any = js.native
    
    var updateTime: js.Any = js.native
  }
  /* static members */
  object TimePicker {
    
    @JSImport("@blueprintjs/datetime/lib/esm/timePicker", "TimePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime/lib/esm/timePicker", "TimePicker.defaultProps")
    @js.native
    def defaultProps: ITimePickerProps = js.native
    @scala.inline
    def defaultProps_=(x: ITimePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/timePicker", "TimePicker.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined {  MILLISECOND :'millisecond',   MINUTE :'minute',   SECOND :'second'}[keyof {  MILLISECOND :'millisecond',   MINUTE :'minute',   SECOND :'second'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.blueprintjsDatetime.blueprintjsDatetimeStrings.millisecond
    - typings.blueprintjsDatetime.blueprintjsDatetimeStrings.minute
    - typings.blueprintjsDatetime.blueprintjsDatetimeStrings.second
  */
  trait TimePrecision extends StObject
  object TimePrecision {
    
    @JSImport("@blueprintjs/datetime/lib/esm/timePicker", "TimePrecision")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime/lib/esm/timePicker", "TimePrecision.MILLISECOND")
    @js.native
    def MILLISECOND: millisecond = js.native
    @scala.inline
    def MILLISECOND_=(x: millisecond): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MILLISECOND")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/timePicker", "TimePrecision.MINUTE")
    @js.native
    def MINUTE: minute = js.native
    @scala.inline
    def MINUTE_=(x: minute): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/timePicker", "TimePrecision.SECOND")
    @js.native
    def SECOND: second = js.native
    @scala.inline
    def SECOND_=(x: second): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECOND")(x.asInstanceOf[js.Any])
  }
  
  trait ITimePickerProps
    extends StObject
       with IProps {
    
    /**
      * Whether to focus the first input when it opens initially.
      * @default false
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Initial time the `TimePicker` will display.
      * This should not be set if `value` is set.
      */
    var defaultValue: js.UndefOr[Date] = js.undefined
    
    /**
      * Whether the time picker is non-interactive.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The latest time the user can select. The year, month, and day parts of the `Date` object are ignored.
      * While the `maxTime` will be later than the `minTime` in the basic case,
      * it is also allowed to be earlier than the `minTime`.
      * This is useful, for example, to express a time range that extends before and after midnight.
      * If the `maxTime` and `minTime` are equal, then the valid time range is constrained to only that one value.
      */
    var maxTime: js.UndefOr[Date] = js.undefined
    
    /**
      * The earliest time the user can select. The year, month, and day parts of the `Date` object are ignored.
      * While the `minTime` will be earlier than the `maxTime` in the basic case,
      * it is also allowed to be later than the `maxTime`.
      * This is useful, for example, to express a time range that extends before and after midnight.
      * If the `maxTime` and `minTime` are equal, then the valid time range is constrained to only that one value.
      */
    var minTime: js.UndefOr[Date] = js.undefined
    
    /**
      * Callback invoked on blur event emitted by specific time unit input
      */
    var onBlur: js.UndefOr[
        js.Function2[/* event */ FocusEvent[HTMLInputElement], /* unit */ TimeUnit, Unit]
      ] = js.undefined
    
    /**
      * Callback invoked when the user changes the time.
      */
    var onChange: js.UndefOr[js.Function1[/* newTime */ Date, Unit]] = js.undefined
    
    /**
      * Callback invoked on focus event emitted by specific time unit input
      */
    var onFocus: js.UndefOr[
        js.Function2[/* event */ FocusEvent[HTMLInputElement], /* unit */ TimeUnit, Unit]
      ] = js.undefined
    
    /**
      * Callback invoked on keydown event emitted by specific time unit input
      */
    var onKeyDown: js.UndefOr[
        js.Function2[/* event */ KeyboardEvent[HTMLInputElement], /* unit */ TimeUnit, Unit]
      ] = js.undefined
    
    /**
      * Callback invoked on keyup event emitted by specific time unit input
      */
    var onKeyUp: js.UndefOr[
        js.Function2[/* event */ KeyboardEvent[HTMLInputElement], /* unit */ TimeUnit, Unit]
      ] = js.undefined
    
    /**
      * The precision of time the user can set.
      * @default TimePrecision.MINUTE
      */
    var precision: js.UndefOr[TimePrecision] = js.undefined
    
    /**
      * Whether all the text in each input should be selected on focus.
      * @default false
      */
    var selectAllOnFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to show arrows buttons for changing the time.
      * @default false
      */
    var showArrowButtons: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to use a 12 hour format with an AM/PM dropdown.
      * @default false
      */
    var useAmPm: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The currently set time.
      * If this prop is provided, the component acts in a controlled manner.
      */
    var value: js.UndefOr[Date | Null] = js.undefined
  }
  object ITimePickerProps {
    
    @scala.inline
    def apply(): ITimePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITimePickerProps]
    }
    
    @scala.inline
    implicit class ITimePickerPropsMutableBuilder[Self <: ITimePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setMaxTime(value: Date): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      @scala.inline
      def setMinTime(value: Date): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      @scala.inline
      def setOnBlur(value: (/* event */ FocusEvent[HTMLInputElement], /* unit */ TimeUnit) => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* newTime */ Date => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: (/* event */ FocusEvent[HTMLInputElement], /* unit */ TimeUnit) => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: (/* event */ KeyboardEvent[HTMLInputElement], /* unit */ TimeUnit) => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: (/* event */ KeyboardEvent[HTMLInputElement], /* unit */ TimeUnit) => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setPrecision(value: TimePrecision): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setSelectAllOnFocus(value: Boolean): Self = StObject.set(x, "selectAllOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectAllOnFocusUndefined: Self = StObject.set(x, "selectAllOnFocus", js.undefined)
      
      @scala.inline
      def setShowArrowButtons(value: Boolean): Self = StObject.set(x, "showArrowButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowArrowButtonsUndefined: Self = StObject.set(x, "showArrowButtons", js.undefined)
      
      @scala.inline
      def setUseAmPm(value: Boolean): Self = StObject.set(x, "useAmPm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseAmPmUndefined: Self = StObject.set(x, "useAmPm", js.undefined)
      
      @scala.inline
      def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ITimePickerState extends StObject {
    
    var hourText: js.UndefOr[String] = js.undefined
    
    var isPm: js.UndefOr[Boolean] = js.undefined
    
    var millisecondText: js.UndefOr[String] = js.undefined
    
    var minuteText: js.UndefOr[String] = js.undefined
    
    var secondText: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[Date] = js.undefined
  }
  object ITimePickerState {
    
    @scala.inline
    def apply(): ITimePickerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITimePickerState]
    }
    
    @scala.inline
    implicit class ITimePickerStateMutableBuilder[Self <: ITimePickerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHourText(value: String): Self = StObject.set(x, "hourText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourTextUndefined: Self = StObject.set(x, "hourText", js.undefined)
      
      @scala.inline
      def setIsPm(value: Boolean): Self = StObject.set(x, "isPm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPmUndefined: Self = StObject.set(x, "isPm", js.undefined)
      
      @scala.inline
      def setMillisecondText(value: String): Self = StObject.set(x, "millisecondText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMillisecondTextUndefined: Self = StObject.set(x, "millisecondText", js.undefined)
      
      @scala.inline
      def setMinuteText(value: String): Self = StObject.set(x, "minuteText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteTextUndefined: Self = StObject.set(x, "minuteText", js.undefined)
      
      @scala.inline
      def setSecondText(value: String): Self = StObject.set(x, "secondText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondTextUndefined: Self = StObject.set(x, "secondText", js.undefined)
      
      @scala.inline
      def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
