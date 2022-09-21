package typings.blueprintjsCore

import typings.blueprintjsCore.anon.PrevMaxProp
import typings.blueprintjsCore.blueprintjsCoreStrings.left
import typings.blueprintjsCore.blueprintjsCoreStrings.none
import typings.blueprintjsCore.blueprintjsCoreStrings.right
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.inputSharedPropsMod.InputSharedProps
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numericInputMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput")
  @js.native
  open class NumericInput protected ()
    extends AbstractPureComponent2[HTMLInputProps & NumericInputProps, INumericInputState, js.Object] {
    def this(props: HTMLInputProps & NumericInputProps) = this()
    def this(props: HTMLInputProps & NumericInputProps, context: Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MNumericInput(prevProps: NumericInputProps, prevState: INumericInputState): Unit = js.native
    
    /* private */ var decrementButtonHandlers: Any = js.native
    
    /* private */ var delta: Any = js.native
    
    /* private */ var didPasteEventJustOccur: Any = js.native
    
    /* private */ var getButtonEventHandlers: Any = js.native
    
    /* private */ var getCurrentValueAsNumber: Any = js.native
    
    /* private */ var getIncrementDelta: Any = js.native
    
    /* private */ var handleButtonClick: Any = js.native
    
    /* private */ var handleCompositionEnd: Any = js.native
    
    /* private */ var handleCompositionUpdate: Any = js.native
    
    /* private */ var handleContinuousChange: Any = js.native
    
    /* private */ var handleInputBlur: Any = js.native
    
    /* private */ var handleInputChange: Any = js.native
    
    /* private */ var handleInputFocus: Any = js.native
    
    /* private */ var handleInputKeyDown: Any = js.native
    
    /* private */ var handleInputKeyPress: Any = js.native
    
    /* private */ var handleInputPaste: Any = js.native
    
    /* private */ var handleNextValue: Any = js.native
    
    /* private */ var incrementButtonHandlers: Any = js.native
    
    /* private */ var incrementValue: Any = js.native
    
    var inputElement: HTMLInputElement | Null = js.native
    
    /* private */ var inputRef: Any = js.native
    
    /* private */ var intervalId: Any = js.native
    
    /* private */ var numericInputId: Any = js.native
    
    /* private */ var renderButtons: Any = js.native
    
    /* private */ var renderInput: Any = js.native
    
    /* private */ var roundAndClampValue: Any = js.native
    
    /* private */ var startContinuousChange: Any = js.native
    
    /* private */ var stopContinuousChange: Any = js.native
    
    /* private */ var updateDelta: Any = js.native
  }
  /* static members */
  object NumericInput {
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput.CONTINUOUS_CHANGE_DELAY")
    @js.native
    def CONTINUOUS_CHANGE_DELAY: Any = js.native
    inline def CONTINUOUS_CHANGE_DELAY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTINUOUS_CHANGE_DELAY")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput.CONTINUOUS_CHANGE_INTERVAL")
    @js.native
    def CONTINUOUS_CHANGE_INTERVAL: Any = js.native
    inline def CONTINUOUS_CHANGE_INTERVAL_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTINUOUS_CHANGE_INTERVAL")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput.VALUE_EMPTY")
    @js.native
    def VALUE_EMPTY: String = js.native
    inline def VALUE_EMPTY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALUE_EMPTY")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput.VALUE_ZERO")
    @js.native
    def VALUE_ZERO: String = js.native
    inline def VALUE_ZERO_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALUE_ZERO")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput.defaultProps")
    @js.native
    def defaultProps: NumericInputProps = js.native
    inline def defaultProps_=(x: NumericInputProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(props: NumericInputProps, state: INumericInputState): PrevMaxProp = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PrevMaxProp]
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput.getStepMaxPrecision")
    @js.native
    def getStepMaxPrecision: Any = js.native
    inline def getStepMaxPrecision_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getStepMaxPrecision")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput.roundAndClampValue")
    @js.native
    def roundAndClampValue: Any = js.native
    inline def roundAndClampValue_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roundAndClampValue")(x.asInstanceOf[js.Any])
  }
  
  trait INumericInputProps
    extends StObject
       with InputSharedProps {
    
    /**
      * Whether to allow only floating-point number characters in the field,
      * mimicking the native `input[type="number"]`.
      *
      * @default true
      */
    var allowNumericCharactersOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set this to `true` if you will be controlling the `value` of this input with asynchronous updates.
      * These may occur if you do not immediately call setState in a parent component with the value from
      * the `onChange` handler.
      */
    var asyncControl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The position of the buttons with respect to the input field.
      *
      * @default Position.RIGHT
      */
    var buttonPosition: js.UndefOr[left | right | none] = js.undefined
    
    /**
      * Whether the value should be clamped to `[min, max]` on blur.
      * The value will be clamped to each bound only if the bound is defined.
      * Note that native `input[type="number"]` controls do *NOT* clamp on blur.
      *
      * @default false
      */
    var clampValueOnBlur: js.UndefOr[Boolean] = js.undefined
    
    /**
      * In uncontrolled mode, this sets the default value of the input.
      * Note that this value is only used upon component instantiation and changes to this prop
      * during the component lifecycle will be ignored.
      *
      * @default ""
      */
    var defaultValue: js.UndefOr[Double | String] = js.undefined
    
    /**
      * If set to `true`, the input will display with larger styling.
      * This is equivalent to setting `Classes.LARGE` via className on the
      * parent control group and on the child input group.
      *
      * @default false
      */
    var large: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The locale name, which is passed to the component to format the number and allowing to type the number in the specific locale.
      * [See MDN documentation for more info about browser locale identification](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_identification_and_negotiation).
      *
      * @default ""
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /**
      * The increment between successive values when <kbd>shift</kbd> is held.
      * Pass explicit `null` value to disable this interaction.
      *
      * @default 10
      */
    var majorStepSize: js.UndefOr[Double | Null] = js.undefined
    
    /** The maximum value of the input. */
    var max: js.UndefOr[Double] = js.undefined
    
    /** The minimum value of the input. */
    var min: js.UndefOr[Double] = js.undefined
    
    /**
      * The increment between successive values when <kbd>alt</kbd> is held.
      * Pass explicit `null` value to disable this interaction.
      *
      * @default 0.1
      */
    var minorStepSize: js.UndefOr[Double | Null] = js.undefined
    
    /** The callback invoked when the value changes due to a button click. */
    var onButtonClick: js.UndefOr[js.Function2[/* valueAsNumber */ Double, /* valueAsString */ String, Unit]] = js.undefined
    
    /** The callback invoked when the value changes due to typing, arrow keys, or button clicks. */
    var onValueChange: js.UndefOr[
        js.Function3[
          /* valueAsNumber */ Double, 
          /* valueAsString */ String, 
          /* inputElement */ HTMLInputElement | Null, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Whether the entire text field should be selected on focus.
      *
      * @default false
      */
    var selectAllOnFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the entire text field should be selected on increment.
      *
      * @default false
      */
    var selectAllOnIncrement: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The increment between successive values when no modifier keys are held.
      *
      * @default 1
      */
    var stepSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The value to display in the input field.
      */
    var value: js.UndefOr[Double | String] = js.undefined
  }
  object INumericInputProps {
    
    inline def apply(): INumericInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INumericInputProps]
    }
    
    extension [Self <: INumericInputProps](x: Self) {
      
      inline def setAllowNumericCharactersOnly(value: Boolean): Self = StObject.set(x, "allowNumericCharactersOnly", value.asInstanceOf[js.Any])
      
      inline def setAllowNumericCharactersOnlyUndefined: Self = StObject.set(x, "allowNumericCharactersOnly", js.undefined)
      
      inline def setAsyncControl(value: Boolean): Self = StObject.set(x, "asyncControl", value.asInstanceOf[js.Any])
      
      inline def setAsyncControlUndefined: Self = StObject.set(x, "asyncControl", js.undefined)
      
      inline def setButtonPosition(value: left | right | none): Self = StObject.set(x, "buttonPosition", value.asInstanceOf[js.Any])
      
      inline def setButtonPositionUndefined: Self = StObject.set(x, "buttonPosition", js.undefined)
      
      inline def setClampValueOnBlur(value: Boolean): Self = StObject.set(x, "clampValueOnBlur", value.asInstanceOf[js.Any])
      
      inline def setClampValueOnBlurUndefined: Self = StObject.set(x, "clampValueOnBlur", js.undefined)
      
      inline def setDefaultValue(value: Double | String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMajorStepSize(value: Double): Self = StObject.set(x, "majorStepSize", value.asInstanceOf[js.Any])
      
      inline def setMajorStepSizeNull: Self = StObject.set(x, "majorStepSize", null)
      
      inline def setMajorStepSizeUndefined: Self = StObject.set(x, "majorStepSize", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMinorStepSize(value: Double): Self = StObject.set(x, "minorStepSize", value.asInstanceOf[js.Any])
      
      inline def setMinorStepSizeNull: Self = StObject.set(x, "minorStepSize", null)
      
      inline def setMinorStepSizeUndefined: Self = StObject.set(x, "minorStepSize", js.undefined)
      
      inline def setOnButtonClick(value: (/* valueAsNumber */ Double, /* valueAsString */ String) => Unit): Self = StObject.set(x, "onButtonClick", js.Any.fromFunction2(value))
      
      inline def setOnButtonClickUndefined: Self = StObject.set(x, "onButtonClick", js.undefined)
      
      inline def setOnValueChange(
        value: (/* valueAsNumber */ Double, /* valueAsString */ String, /* inputElement */ HTMLInputElement | Null) => Unit
      ): Self = StObject.set(x, "onValueChange", js.Any.fromFunction3(value))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setSelectAllOnFocus(value: Boolean): Self = StObject.set(x, "selectAllOnFocus", value.asInstanceOf[js.Any])
      
      inline def setSelectAllOnFocusUndefined: Self = StObject.set(x, "selectAllOnFocus", js.undefined)
      
      inline def setSelectAllOnIncrement(value: Boolean): Self = StObject.set(x, "selectAllOnIncrement", value.asInstanceOf[js.Any])
      
      inline def setSelectAllOnIncrementUndefined: Self = StObject.set(x, "selectAllOnIncrement", js.undefined)
      
      inline def setStepSize(value: Double): Self = StObject.set(x, "stepSize", value.asInstanceOf[js.Any])
      
      inline def setStepSizeUndefined: Self = StObject.set(x, "stepSize", js.undefined)
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait INumericInputState extends StObject {
    
    var currentImeInputInvalid: Boolean
    
    var prevMaxProp: js.UndefOr[Double] = js.undefined
    
    var prevMinProp: js.UndefOr[Double] = js.undefined
    
    var shouldSelectAfterUpdate: Boolean
    
    var stepMaxPrecision: Double
    
    var value: String
  }
  object INumericInputState {
    
    inline def apply(
      currentImeInputInvalid: Boolean,
      shouldSelectAfterUpdate: Boolean,
      stepMaxPrecision: Double,
      value: String
    ): INumericInputState = {
      val __obj = js.Dynamic.literal(currentImeInputInvalid = currentImeInputInvalid.asInstanceOf[js.Any], shouldSelectAfterUpdate = shouldSelectAfterUpdate.asInstanceOf[js.Any], stepMaxPrecision = stepMaxPrecision.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[INumericInputState]
    }
    
    extension [Self <: INumericInputState](x: Self) {
      
      inline def setCurrentImeInputInvalid(value: Boolean): Self = StObject.set(x, "currentImeInputInvalid", value.asInstanceOf[js.Any])
      
      inline def setPrevMaxProp(value: Double): Self = StObject.set(x, "prevMaxProp", value.asInstanceOf[js.Any])
      
      inline def setPrevMaxPropUndefined: Self = StObject.set(x, "prevMaxProp", js.undefined)
      
      inline def setPrevMinProp(value: Double): Self = StObject.set(x, "prevMinProp", value.asInstanceOf[js.Any])
      
      inline def setPrevMinPropUndefined: Self = StObject.set(x, "prevMinProp", js.undefined)
      
      inline def setShouldSelectAfterUpdate(value: Boolean): Self = StObject.set(x, "shouldSelectAfterUpdate", value.asInstanceOf[js.Any])
      
      inline def setStepMaxPrecision(value: Double): Self = StObject.set(x, "stepMaxPrecision", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type NumericInputProps = INumericInputProps
}
