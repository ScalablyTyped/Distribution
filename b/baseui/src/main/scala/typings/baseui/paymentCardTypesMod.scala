package typings.baseui

import typings.baseui.baseuiStrings.any
import typings.baseui.helpersOverridesMod.Override
import typings.baseui.inputTypesMod.Adjoined
import typings.baseui.inputTypesMod.InputOverrides
import typings.baseui.inputTypesMod.InputProps
import typings.baseui.inputTypesMod.SharedProps
import typings.baseui.inputTypesMod.Size
import typings.baseui.inputTypesMod.State
import typings.baseui.inputTypesMod.StateReducer
import typings.baseui.inputTypesMod.StateType
import typings.csstype.mod.Property.Resize
import typings.react.mod.ChangeEvent
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paymentCardTypesMod {
  
  trait PaymentCardOverrides
    extends StObject
       with InputOverrides {
    
    var IconWrapper: js.UndefOr[Override[Any]] = js.undefined
  }
  object PaymentCardOverrides {
    
    inline def apply(): PaymentCardOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaymentCardOverrides]
    }
    
    extension [Self <: PaymentCardOverrides](x: Self) {
      
      inline def setIconWrapper(value: Override[Any]): Self = StObject.set(x, "IconWrapper", value.asInstanceOf[js.Any])
      
      inline def setIconWrapperUndefined: Self = StObject.set(x, "IconWrapper", js.undefined)
    }
  }
  
  trait PaymentCardProps
    extends StObject
       with InputProps {
    
    @JSName("overrides")
    var overrides_PaymentCardProps: PaymentCardOverrides
  }
  object PaymentCardProps {
    
    inline def apply(overrides: PaymentCardOverrides): PaymentCardProps = {
      val __obj = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentCardProps]
    }
    
    extension [Self <: PaymentCardProps](x: Self) {
      
      inline def setOverrides(value: PaymentCardOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  overrides :baseui.baseui/payment-card/types.PaymentCardOverrides | undefined} & baseui.baseui/input.StInputPropsDiff */
  trait StatefulPaymentCardProps extends StObject {
    
    var adjoined: js.UndefOr[Adjoined] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[String] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var clearOnEscape: js.UndefOr[Boolean] = js.undefined
    
    var clearable: js.UndefOr[Boolean] = js.undefined
    
    var `data-baseweb`: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var endEnhancer: js.UndefOr[ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var initialState: js.UndefOr[State] = js.undefined
    
    var inputMode: js.UndefOr[String] = js.undefined
    
    var inputRef: js.UndefOr[RefObject[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[
        js.Function1[/* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element], Unit]
      ] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement], Unit]] = js.undefined
    
    var onClear: js.UndefOr[
        js.Function1[/* e */ SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event], Unit]
      ] = js.undefined
    
    var onFocus: js.UndefOr[
        js.Function1[/* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element], Unit]
      ] = js.undefined
    
    var onKeyDown: js.UndefOr[
        js.Function1[/* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
      ] = js.undefined
    
    var onKeyPress: js.UndefOr[
        js.Function1[/* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
      ] = js.undefined
    
    var onKeyUp: js.UndefOr[
        js.Function1[/* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
      ] = js.undefined
    
    var overrides: js.UndefOr[PaymentCardOverrides] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var positive: js.UndefOr[Boolean] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resize: js.UndefOr[Resize] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var startEnhancer: js.UndefOr[ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])] = js.undefined
    
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
    
    var step: js.UndefOr[Double | any] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object StatefulPaymentCardProps {
    
    inline def apply(): StatefulPaymentCardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulPaymentCardProps]
    }
    
    extension [Self <: StatefulPaymentCardProps](x: Self) {
      
      inline def setAdjoined(value: Adjoined): Self = StObject.set(x, "adjoined", value.asInstanceOf[js.Any])
      
      inline def setAdjoinedUndefined: Self = StObject.set(x, "adjoined", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-autocomplete`(value: String): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-haspopup`(value: String): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClearOnEscape(value: Boolean): Self = StObject.set(x, "clearOnEscape", value.asInstanceOf[js.Any])
      
      inline def setClearOnEscapeUndefined: Self = StObject.set(x, "clearOnEscape", js.undefined)
      
      inline def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      inline def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
      
      inline def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
      
      inline def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEndEnhancer(value: ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerFunction1(value: /* props */ SharedProps => ReactNode): Self = StObject.set(x, "endEnhancer", js.Any.fromFunction1(value))
      
      inline def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setInputMode(value: String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setInputRef(value: RefObject[HTMLInputElement | HTMLTextAreaElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: /* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* e */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClear(value: /* e */ SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnFocus(value: /* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: /* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: /* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: /* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOverrides(value: PaymentCardOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResize(value: Resize): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStartEnhancer(value: ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
      
      inline def setStartEnhancerFunction1(value: /* props */ SharedProps => ReactNode): Self = StObject.set(x, "startEnhancer", js.Any.fromFunction1(value))
      
      inline def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
      
      inline def setStateReducer(value: (/* stateType */ StateType, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
      
      inline def setStep(value: Double | any): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
