package typings.blueprintjsDatetime

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsDatetime.blueprintjsDatetimeStrings.millisecond
import typings.blueprintjsDatetime.blueprintjsDatetimeStrings.minute
import typings.blueprintjsDatetime.blueprintjsDatetimeStrings.second
import typings.blueprintjsDatetime.timeUnitMod.TimeUnit
import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.std.Element
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timePickerMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/timePicker", "TimePicker")
  @js.native
  open class TimePicker () extends Component[TimePickerProps, ITimePickerState, Any] {
    def this(props: TimePickerProps) = this()
    def this(props: Unit, context: Any) = this()
    def this(props: TimePickerProps, context: Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTimePicker(prevProps: TimePickerProps): Unit = js.native
    
    /* private */ var decrementTime: Any = js.native
    
    /**
      * Generates a full ITimePickerState object with all text fields set to formatted strings based on value
      */
    /* private */ var getFullStateFromValue: Any = js.native
    
    /* private */ var getInitialValue: Any = js.native
    
    /* private */ var getInputBlurHandler: Any = js.native
    
    /* private */ var getInputChangeHandler: Any = js.native
    
    /* private */ var getInputFocusHandler: Any = js.native
    
    /* private */ var getInputKeyDownHandler: Any = js.native
    
    /* private */ var getInputKeyUpHandler: Any = js.native
    
    /* private */ var handleAmPmChange: Any = js.native
    
    /* private */ var incrementTime: Any = js.native
    
    /* private */ var maybeRenderAmPm: Any = js.native
    
    /* private */ var maybeRenderArrowButton: Any = js.native
    
    /* private */ var renderDivider: Any = js.native
    
    /* private */ var renderInput: Any = js.native
    
    /* private */ var shiftTime: Any = js.native
    
    /* private */ var timeInputIds: Any = js.native
    
    /* private */ var updateState: Any = js.native
    
    /* private */ var updateTime: Any = js.native
  }
  /* static members */
  object TimePicker {
    
    @JSImport("@blueprintjs/datetime/lib/esm/timePicker", "TimePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime/lib/esm/timePicker", "TimePicker.defaultProps")
    @js.native
    def defaultProps: TimePickerProps = js.native
    inline def defaultProps_=(x: TimePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/timePicker", "TimePicker.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
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
    inline def MILLISECOND_=(x: millisecond): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MILLISECOND")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/timePicker", "TimePrecision.MINUTE")
    @js.native
    def MINUTE: minute = js.native
    inline def MINUTE_=(x: minute): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/timePicker", "TimePrecision.SECOND")
    @js.native
    def SECOND: second = js.native
    inline def SECOND_=(x: second): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECOND")(x.asInstanceOf[js.Any])
  }
  
  trait ITimePickerProps
    extends StObject
       with IProps {
    
    /**
      * Whether to focus the first input when it opens initially.
      *
      * @default false
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Initial time the `TimePicker` will display.
      * This should not be set if `value` is set.
      */
    var defaultValue: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Whether the time picker is non-interactive.
      *
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
    var maxTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The earliest time the user can select. The year, month, and day parts of the `Date` object are ignored.
      * While the `minTime` will be earlier than the `maxTime` in the basic case,
      * it is also allowed to be later than the `maxTime`.
      * This is useful, for example, to express a time range that extends before and after midnight.
      * If the `maxTime` and `minTime` are equal, then the valid time range is constrained to only that one value.
      */
    var minTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Callback invoked on blur event emitted by specific time unit input
      */
    var onBlur: js.UndefOr[
        js.Function2[/* event */ FocusEvent[HTMLInputElement, Element], /* unit */ TimeUnit, Unit]
      ] = js.undefined
    
    /**
      * Callback invoked when the user changes the time.
      */
    var onChange: js.UndefOr[js.Function1[/* newTime */ js.Date, Unit]] = js.undefined
    
    /**
      * Callback invoked on focus event emitted by specific time unit input
      */
    var onFocus: js.UndefOr[
        js.Function2[/* event */ FocusEvent[HTMLInputElement, Element], /* unit */ TimeUnit, Unit]
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
      *
      * @default TimePrecision.MINUTE
      */
    var precision: js.UndefOr[TimePrecision] = js.undefined
    
    /**
      * Whether all the text in each input should be selected on focus.
      *
      * @default false
      */
    var selectAllOnFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to show arrows buttons for changing the time.
      *
      * @default false
      */
    var showArrowButtons: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to use a 12 hour format with an AM/PM dropdown.
      *
      * @default false
      */
    var useAmPm: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The currently set time.
      * If this prop is provided, the component acts in a controlled manner.
      */
    var value: js.UndefOr[js.Date | Null] = js.undefined
  }
  object ITimePickerProps {
    
    inline def apply(): ITimePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITimePickerProps]
    }
    
    extension [Self <: ITimePickerProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setDefaultValue(value: js.Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setMaxTime(value: js.Date): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      inline def setMinTime(value: js.Date): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      inline def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      inline def setOnBlur(value: (/* event */ FocusEvent[HTMLInputElement, Element], /* unit */ TimeUnit) => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction2(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* newTime */ js.Date => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: (/* event */ FocusEvent[HTMLInputElement, Element], /* unit */ TimeUnit) => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction2(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: (/* event */ KeyboardEvent[HTMLInputElement], /* unit */ TimeUnit) => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyUp(value: (/* event */ KeyboardEvent[HTMLInputElement], /* unit */ TimeUnit) => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction2(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setPrecision(value: TimePrecision): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setSelectAllOnFocus(value: Boolean): Self = StObject.set(x, "selectAllOnFocus", value.asInstanceOf[js.Any])
      
      inline def setSelectAllOnFocusUndefined: Self = StObject.set(x, "selectAllOnFocus", js.undefined)
      
      inline def setShowArrowButtons(value: Boolean): Self = StObject.set(x, "showArrowButtons", value.asInstanceOf[js.Any])
      
      inline def setShowArrowButtonsUndefined: Self = StObject.set(x, "showArrowButtons", js.undefined)
      
      inline def setUseAmPm(value: Boolean): Self = StObject.set(x, "useAmPm", value.asInstanceOf[js.Any])
      
      inline def setUseAmPmUndefined: Self = StObject.set(x, "useAmPm", js.undefined)
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ITimePickerState extends StObject {
    
    var hourText: js.UndefOr[String] = js.undefined
    
    var isPm: js.UndefOr[Boolean] = js.undefined
    
    var millisecondText: js.UndefOr[String] = js.undefined
    
    var minuteText: js.UndefOr[String] = js.undefined
    
    var secondText: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[js.Date] = js.undefined
  }
  object ITimePickerState {
    
    inline def apply(): ITimePickerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITimePickerState]
    }
    
    extension [Self <: ITimePickerState](x: Self) {
      
      inline def setHourText(value: String): Self = StObject.set(x, "hourText", value.asInstanceOf[js.Any])
      
      inline def setHourTextUndefined: Self = StObject.set(x, "hourText", js.undefined)
      
      inline def setIsPm(value: Boolean): Self = StObject.set(x, "isPm", value.asInstanceOf[js.Any])
      
      inline def setIsPmUndefined: Self = StObject.set(x, "isPm", js.undefined)
      
      inline def setMillisecondText(value: String): Self = StObject.set(x, "millisecondText", value.asInstanceOf[js.Any])
      
      inline def setMillisecondTextUndefined: Self = StObject.set(x, "millisecondText", js.undefined)
      
      inline def setMinuteText(value: String): Self = StObject.set(x, "minuteText", value.asInstanceOf[js.Any])
      
      inline def setMinuteTextUndefined: Self = StObject.set(x, "minuteText", js.undefined)
      
      inline def setSecondText(value: String): Self = StObject.set(x, "secondText", value.asInstanceOf[js.Any])
      
      inline def setSecondTextUndefined: Self = StObject.set(x, "secondText", js.undefined)
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type TimePickerProps = ITimePickerProps
}
