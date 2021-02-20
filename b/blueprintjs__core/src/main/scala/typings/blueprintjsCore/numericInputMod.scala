package typings.blueprintjsCore

import typings.blueprintjsCore.anon.PrevMaxProp
import typings.blueprintjsCore.blueprintjsCoreStrings.left
import typings.blueprintjsCore.blueprintjsCoreStrings.none
import typings.blueprintjsCore.blueprintjsCoreStrings.right
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numericInputMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput")
  @js.native
  class NumericInput protected ()
    extends AbstractPureComponent2[HTMLInputProps with INumericInputProps, INumericInputState, js.Object] {
    def this(props: HTMLInputProps with INumericInputProps) = this()
    def this(props: HTMLInputProps with INumericInputProps, context: js.Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MNumericInput(prevProps: INumericInputProps, prevState: INumericInputState): Unit = js.native
    
    var decrementButtonHandlers: js.Any = js.native
    
    var delta: js.Any = js.native
    
    var didPasteEventJustOccur: js.Any = js.native
    
    var getButtonEventHandlers: js.Any = js.native
    
    var getIncrementDelta: js.Any = js.native
    
    var handleButtonClick: js.Any = js.native
    
    var handleCompositionEnd: js.Any = js.native
    
    var handleCompositionUpdate: js.Any = js.native
    
    var handleContinuousChange: js.Any = js.native
    
    var handleInputBlur: js.Any = js.native
    
    var handleInputChange: js.Any = js.native
    
    var handleInputFocus: js.Any = js.native
    
    var handleInputKeyDown: js.Any = js.native
    
    var handleInputKeyPress: js.Any = js.native
    
    var handleInputPaste: js.Any = js.native
    
    var handleNextValue: js.Any = js.native
    
    var incrementButtonHandlers: js.Any = js.native
    
    var incrementValue: js.Any = js.native
    
    var inputElement: js.Any = js.native
    
    var inputRef: js.Any = js.native
    
    var intervalId: js.Any = js.native
    
    var renderButtons: js.Any = js.native
    
    var renderInput: js.Any = js.native
    
    var roundAndClampValue: js.Any = js.native
    
    var startContinuousChange: js.Any = js.native
    
    var stopContinuousChange: js.Any = js.native
    
    var updateDelta: js.Any = js.native
  }
  /* static members */
  object NumericInput {
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput.CONTINUOUS_CHANGE_DELAY")
    @js.native
    def CONTINUOUS_CHANGE_DELAY: js.Any = js.native
    @scala.inline
    def CONTINUOUS_CHANGE_DELAY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTINUOUS_CHANGE_DELAY")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput.CONTINUOUS_CHANGE_INTERVAL")
    @js.native
    def CONTINUOUS_CHANGE_INTERVAL: js.Any = js.native
    @scala.inline
    def CONTINUOUS_CHANGE_INTERVAL_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTINUOUS_CHANGE_INTERVAL")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput.VALUE_EMPTY")
    @js.native
    def VALUE_EMPTY: String = js.native
    @scala.inline
    def VALUE_EMPTY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALUE_EMPTY")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput.VALUE_ZERO")
    @js.native
    def VALUE_ZERO: String = js.native
    @scala.inline
    def VALUE_ZERO_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALUE_ZERO")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput.defaultProps")
    @js.native
    def defaultProps: INumericInputProps = js.native
    @scala.inline
    def defaultProps_=(x: INumericInputProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: INumericInputProps, state: INumericInputState): PrevMaxProp = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput.getStepMaxPrecision")
    @js.native
    def getStepMaxPrecision: js.Any = js.native
    @scala.inline
    def getStepMaxPrecision_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getStepMaxPrecision")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput.roundAndClampValue")
    @js.native
    def roundAndClampValue: js.Any = js.native
    @scala.inline
    def roundAndClampValue_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roundAndClampValue")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait INumericInputProps
    extends IIntentProps
       with IProps {
    
    /**
      * Whether to allow only floating-point number characters in the field,
      * mimicking the native `input[type="number"]`.
      * @default true
      */
    var allowNumericCharactersOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * Set this to `true` if you will be controlling the `value` of this input with asynchronous updates.
      * These may occur if you do not immediately call setState in a parent component with the value from
      * the `onChange` handler.
      */
    var asyncControl: js.UndefOr[Boolean] = js.native
    
    /**
      * The position of the buttons with respect to the input field.
      * @default Position.RIGHT
      */
    var buttonPosition: js.UndefOr[left | right | none] = js.native
    
    /**
      * Whether the value should be clamped to `[min, max]` on blur.
      * The value will be clamped to each bound only if the bound is defined.
      * Note that native `input[type="number"]` controls do *NOT* clamp on blur.
      * @default false
      */
    var clampValueOnBlur: js.UndefOr[Boolean] = js.native
    
    /**
      * In uncontrolled mode, this sets the default value of the input.
      * Note that this value is only used upon component instantiation and changes to this prop
      * during the component lifecycle will be ignored.
      * @default ""
      */
    var defaultValue: js.UndefOr[Double | String] = js.native
    
    /**
      * Whether the input is non-interactive.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /** Whether the numeric input should take up the full width of its container. */
    var fill: js.UndefOr[Boolean] = js.native
    
    /**
      * Ref handler that receives HTML `<input>` element backing this component.
      */
    var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLInputElement | Null, _]] = js.native
    
    /**
      * If set to `true`, the input will display with larger styling.
      * This is equivalent to setting `Classes.LARGE` via className on the
      * parent control group and on the child input group.
      * @default false
      */
    var large: js.UndefOr[Boolean] = js.native
    
    /**
      * Name of a Blueprint UI icon (or an icon element) to render on the left side of input.
      */
    var leftIcon: js.UndefOr[IconName | MaybeElement] = js.native
    
    /**
      * The locale name, which is passed to the component to format the number and allowing to type the number in the specific locale.
      * [See MDN documentation for more info about browser locale identification](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_identification_and_negotiation).
      * @default ""
      */
    var locale: js.UndefOr[String] = js.native
    
    /**
      * The increment between successive values when <kbd>shift</kbd> is held.
      * Pass explicit `null` value to disable this interaction.
      * @default 10
      */
    var majorStepSize: js.UndefOr[Double | Null] = js.native
    
    /** The maximum value of the input. */
    var max: js.UndefOr[Double] = js.native
    
    /** The minimum value of the input. */
    var min: js.UndefOr[Double] = js.native
    
    /**
      * The increment between successive values when <kbd>alt</kbd> is held.
      * Pass explicit `null` value to disable this interaction.
      * @default 0.1
      */
    var minorStepSize: js.UndefOr[Double | Null] = js.native
    
    /** The callback invoked when the value changes due to a button click. */
    var onButtonClick: js.UndefOr[js.Function2[/* valueAsNumber */ Double, /* valueAsString */ String, Unit]] = js.native
    
    /** The callback invoked when the value changes due to typing, arrow keys, or button clicks. */
    var onValueChange: js.UndefOr[
        js.Function3[
          /* valueAsNumber */ Double, 
          /* valueAsString */ String, 
          /* inputElement */ HTMLInputElement | Null, 
          Unit
        ]
      ] = js.native
    
    /** The placeholder text in the absence of any value. */
    var placeholder: js.UndefOr[String] = js.native
    
    /**
      * Element to render on right side of input.
      * For best results, use a minimal button, tag, or small spinner.
      */
    var rightElement: js.UndefOr[Element] = js.native
    
    /**
      * Whether the entire text field should be selected on focus.
      * @default false
      */
    var selectAllOnFocus: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the entire text field should be selected on increment.
      * @default false
      */
    var selectAllOnIncrement: js.UndefOr[Boolean] = js.native
    
    /**
      * The increment between successive values when no modifier keys are held.
      * @default 1
      */
    var stepSize: js.UndefOr[Double] = js.native
    
    /**
      * The value to display in the input field.
      */
    var value: js.UndefOr[Double | String] = js.native
  }
  object INumericInputProps {
    
    @scala.inline
    def apply(): INumericInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INumericInputProps]
    }
    
    @scala.inline
    implicit class INumericInputPropsMutableBuilder[Self <: INumericInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowNumericCharactersOnly(value: Boolean): Self = StObject.set(x, "allowNumericCharactersOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowNumericCharactersOnlyUndefined: Self = StObject.set(x, "allowNumericCharactersOnly", js.undefined)
      
      @scala.inline
      def setAsyncControl(value: Boolean): Self = StObject.set(x, "asyncControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncControlUndefined: Self = StObject.set(x, "asyncControl", js.undefined)
      
      @scala.inline
      def setButtonPosition(value: left | right | none): Self = StObject.set(x, "buttonPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonPositionUndefined: Self = StObject.set(x, "buttonPosition", js.undefined)
      
      @scala.inline
      def setClampValueOnBlur(value: Boolean): Self = StObject.set(x, "clampValueOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClampValueOnBlurUndefined: Self = StObject.set(x, "clampValueOnBlur", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Double | String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
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
      def setInputRef(value: /* ref */ HTMLInputElement | Null => _): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      @scala.inline
      def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      @scala.inline
      def setLeftIcon(value: IconName | MaybeElement): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftIconNull: Self = StObject.set(x, "leftIcon", null)
      
      @scala.inline
      def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMajorStepSize(value: Double): Self = StObject.set(x, "majorStepSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorStepSizeNull: Self = StObject.set(x, "majorStepSize", null)
      
      @scala.inline
      def setMajorStepSizeUndefined: Self = StObject.set(x, "majorStepSize", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setMinorStepSize(value: Double): Self = StObject.set(x, "minorStepSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorStepSizeNull: Self = StObject.set(x, "minorStepSize", null)
      
      @scala.inline
      def setMinorStepSizeUndefined: Self = StObject.set(x, "minorStepSize", js.undefined)
      
      @scala.inline
      def setOnButtonClick(value: (/* valueAsNumber */ Double, /* valueAsString */ String) => Unit): Self = StObject.set(x, "onButtonClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnButtonClickUndefined: Self = StObject.set(x, "onButtonClick", js.undefined)
      
      @scala.inline
      def setOnValueChange(
        value: (/* valueAsNumber */ Double, /* valueAsString */ String, /* inputElement */ HTMLInputElement | Null) => Unit
      ): Self = StObject.set(x, "onValueChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setRightElement(value: Element): Self = StObject.set(x, "rightElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightElementUndefined: Self = StObject.set(x, "rightElement", js.undefined)
      
      @scala.inline
      def setSelectAllOnFocus(value: Boolean): Self = StObject.set(x, "selectAllOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectAllOnFocusUndefined: Self = StObject.set(x, "selectAllOnFocus", js.undefined)
      
      @scala.inline
      def setSelectAllOnIncrement(value: Boolean): Self = StObject.set(x, "selectAllOnIncrement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectAllOnIncrementUndefined: Self = StObject.set(x, "selectAllOnIncrement", js.undefined)
      
      @scala.inline
      def setStepSize(value: Double): Self = StObject.set(x, "stepSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepSizeUndefined: Self = StObject.set(x, "stepSize", js.undefined)
      
      @scala.inline
      def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait INumericInputState extends StObject {
    
    var currentImeInputInvalid: Boolean = js.native
    
    var prevMaxProp: js.UndefOr[Double] = js.native
    
    var prevMinProp: js.UndefOr[Double] = js.native
    
    var shouldSelectAfterUpdate: Boolean = js.native
    
    var stepMaxPrecision: Double = js.native
    
    var value: String = js.native
  }
  object INumericInputState {
    
    @scala.inline
    def apply(
      currentImeInputInvalid: Boolean,
      shouldSelectAfterUpdate: Boolean,
      stepMaxPrecision: Double,
      value: String
    ): INumericInputState = {
      val __obj = js.Dynamic.literal(currentImeInputInvalid = currentImeInputInvalid.asInstanceOf[js.Any], shouldSelectAfterUpdate = shouldSelectAfterUpdate.asInstanceOf[js.Any], stepMaxPrecision = stepMaxPrecision.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[INumericInputState]
    }
    
    @scala.inline
    implicit class INumericInputStateMutableBuilder[Self <: INumericInputState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentImeInputInvalid(value: Boolean): Self = StObject.set(x, "currentImeInputInvalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevMaxProp(value: Double): Self = StObject.set(x, "prevMaxProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevMaxPropUndefined: Self = StObject.set(x, "prevMaxProp", js.undefined)
      
      @scala.inline
      def setPrevMinProp(value: Double): Self = StObject.set(x, "prevMinProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevMinPropUndefined: Self = StObject.set(x, "prevMinProp", js.undefined)
      
      @scala.inline
      def setShouldSelectAfterUpdate(value: Boolean): Self = StObject.set(x, "shouldSelectAfterUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepMaxPrecision(value: Double): Self = StObject.set(x, "stepMaxPrecision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
