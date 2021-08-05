package typings.baseui

import typings.baseui.anon.Values
import typings.baseui.baseuiStrings.both
import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.mini
import typings.baseui.baseuiStrings.none
import typings.baseui.baseuiStrings.right
import typings.baseui.inputMod.InputOverrides
import typings.baseui.inputMod.SharedProps
import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.Exclude
import typings.std.HTMLInputElement
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinCodeMod {
  
  @JSImport("baseui/pin-code", "PinCode")
  @js.native
  class PinCode protected ()
    extends Component[PinCodeProps, js.Object, js.Any] {
    def this(props: PinCodeProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PinCodeProps, context: js.Any) = this()
  }
  
  @JSImport("baseui/pin-code", "SIZE")
  @js.native
  val SIZE: typings.baseui.inputMod.SIZE = js.native
  
  @JSImport("baseui/pin-code", "StatefulContainer")
  @js.native
  val StatefulContainer: FC[StatefulContainerProps] = js.native
  
  @JSImport("baseui/pin-code", "StatefulPinCode")
  @js.native
  val StatefulPinCode: FC[StatefulPinCodeProps] = js.native
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  /* Inlined baseui.baseui/input.InputOverrides & {  Root :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> * / any | undefined,   Input :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> * / any | undefined} */
  trait PinCodeOverrides extends StObject {
    
    var After: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
    
    var Before: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
    
    var ClearIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.undefined
    
    var ClearIconContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.undefined
    
    var EndEnhancer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.undefined
    
    var Input: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
    
    var InputContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
    
    var MaskToggleButton: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.undefined
    
    var MaskToggleHideIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.undefined
    
    var MaskToggleShowIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.undefined
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.undefined
    
    var StartEnhancer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.undefined
  }
  object PinCodeOverrides {
    
    inline def apply(): PinCodeOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PinCodeOverrides]
    }
    
    extension [Self <: PinCodeOverrides](x: Self) {
      
      inline def setAfter(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "After", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "After", js.undefined)
      
      inline def setBefore(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "Before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "Before", js.undefined)
      
      inline def setClearIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "ClearIcon", value.asInstanceOf[js.Any])
      
      inline def setClearIconContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "ClearIconContainer", value.asInstanceOf[js.Any])
      
      inline def setClearIconContainerUndefined: Self = StObject.set(x, "ClearIconContainer", js.undefined)
      
      inline def setClearIconUndefined: Self = StObject.set(x, "ClearIcon", js.undefined)
      
      inline def setEndEnhancer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "EndEnhancer", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerUndefined: Self = StObject.set(x, "EndEnhancer", js.undefined)
      
      inline def setInput(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      inline def setInputContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "InputContainer", value.asInstanceOf[js.Any])
      
      inline def setInputContainerUndefined: Self = StObject.set(x, "InputContainer", js.undefined)
      
      inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
      
      inline def setMaskToggleButton(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "MaskToggleButton", value.asInstanceOf[js.Any])
      
      inline def setMaskToggleButtonUndefined: Self = StObject.set(x, "MaskToggleButton", js.undefined)
      
      inline def setMaskToggleHideIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "MaskToggleHideIcon", value.asInstanceOf[js.Any])
      
      inline def setMaskToggleHideIconUndefined: Self = StObject.set(x, "MaskToggleHideIcon", js.undefined)
      
      inline def setMaskToggleShowIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "MaskToggleShowIcon", value.asInstanceOf[js.Any])
      
      inline def setMaskToggleShowIconUndefined: Self = StObject.set(x, "MaskToggleShowIcon", js.undefined)
      
      inline def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setStartEnhancer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "StartEnhancer", value.asInstanceOf[js.Any])
      
      inline def setStartEnhancerUndefined: Self = StObject.set(x, "StartEnhancer", js.undefined)
    }
  }
  
  /* Inlined baseui.baseui/pin-code.Omit<baseui.baseui/input.InputProps, 'onChange' | 'value'> & {  overrides :baseui.baseui/pin-code.PinCodeOverrides | undefined,   values :std.Array<string>,   manageFocus :boolean | undefined,   mask :boolean | string | undefined, onChange (args : {  values :std.Array<string>,   event :react.react.FormEvent<std.HTMLInputElement>}): void} */
  trait PinCodeProps extends StObject {
    
    var adjoined: js.UndefOr[none | left | right | both] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var clearOnEscape: js.UndefOr[Boolean] = js.undefined
    
    var clearable: js.UndefOr[Boolean] = js.undefined
    
    var `data-baseweb`: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var endEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inputMode: js.UndefOr[String] = js.undefined
    
    var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
    
    var manageFocus: js.UndefOr[Boolean] = js.undefined
    
    var mask: js.UndefOr[Boolean | String] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    def onChange(args: Values): Unit
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var overrides: js.UndefOr[InputOverrides] & js.UndefOr[PinCodeOverrides]
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var positive: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[mini | default_ | compact | large_] = js.undefined
    
    var startEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var values: js.Array[String]
  }
  object PinCodeProps {
    
    inline def apply(
      onChange: Values => Unit,
      overrides: js.UndefOr[InputOverrides] & js.UndefOr[PinCodeOverrides],
      values: js.Array[String]
    ): PinCodeProps = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), overrides = overrides.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[PinCodeProps]
    }
    
    extension [Self <: PinCodeProps](x: Self) {
      
      inline def setAdjoined(value: none | left | right | both): Self = StObject.set(x, "adjoined", value.asInstanceOf[js.Any])
      
      inline def setAdjoinedUndefined: Self = StObject.set(x, "adjoined", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
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
      
      inline def setEndEnhancer(value: (js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerFunction1(value: /* args */ SharedProps => ReactNode): Self = StObject.set(x, "endEnhancer", js.Any.fromFunction1(value))
      
      inline def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputMode(value: String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setManageFocus(value: Boolean): Self = StObject.set(x, "manageFocus", value.asInstanceOf[js.Any])
      
      inline def setManageFocusUndefined: Self = StObject.set(x, "manageFocus", js.undefined)
      
      inline def setMask(value: Boolean | String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: Values => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOverrides(value: js.UndefOr[InputOverrides] & js.UndefOr[PinCodeOverrides]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setSize(value: mini | default_ | compact | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStartEnhancer(value: (js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
      
      inline def setStartEnhancerFunction1(value: /* args */ SharedProps => ReactNode): Self = StObject.set(x, "startEnhancer", js.Any.fromFunction1(value))
      
      inline def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait State extends StObject {
    
    var values: js.Array[String]
  }
  object State {
    
    inline def apply(values: js.Array[String]): State = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait StatefulContainerProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var initialState: js.UndefOr[State] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* args */ Values, Unit]] = js.undefined
    
    var stateReducer: js.UndefOr[js.Function3[change_, /* nextState */ State, /* currentState */ State, State]] = js.undefined
  }
  object StatefulContainerProps {
    
    inline def apply(): StatefulContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulContainerProps]
    }
    
    extension [Self <: StatefulContainerProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setOnChange(value: /* args */ Values => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setStateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  /* Inlined std.Partial<baseui.baseui/pin-code.PinCodeProps> & baseui.baseui/pin-code.StatefulContainerProps & {  children :never | undefined,   overrides :baseui.baseui/pin-code.PinCodeOverrides | undefined} */
  trait StatefulPinCodeProps extends StObject {
    
    var adjoined: js.UndefOr[none | left | right | both] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] & js.UndefOr[scala.Nothing]
    
    var clearOnEscape: js.UndefOr[Boolean] = js.undefined
    
    var clearable: js.UndefOr[Boolean] = js.undefined
    
    var `data-baseweb`: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var endEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var initialState: js.UndefOr[State] = js.undefined
    
    var inputMode: js.UndefOr[String] = js.undefined
    
    var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
    
    var manageFocus: js.UndefOr[Boolean] = js.undefined
    
    var mask: js.UndefOr[Boolean | String] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* args */ Values, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var overrides: js.UndefOr[InputOverrides] & js.UndefOr[PinCodeOverrides]
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var positive: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[mini | default_ | compact | large_] = js.undefined
    
    var startEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode] = js.undefined
    
    var stateReducer: js.UndefOr[js.Function3[change_, /* nextState */ State, /* currentState */ State, State]] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var values: js.UndefOr[js.Array[String]] = js.undefined
  }
  object StatefulPinCodeProps {
    
    inline def apply(
      children: js.UndefOr[ReactNode] & js.UndefOr[scala.Nothing],
      overrides: js.UndefOr[InputOverrides] & js.UndefOr[PinCodeOverrides]
    ): StatefulPinCodeProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulPinCodeProps]
    }
    
    extension [Self <: StatefulPinCodeProps](x: Self) {
      
      inline def setAdjoined(value: none | left | right | both): Self = StObject.set(x, "adjoined", value.asInstanceOf[js.Any])
      
      inline def setAdjoinedUndefined: Self = StObject.set(x, "adjoined", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: js.UndefOr[ReactNode] & js.UndefOr[scala.Nothing]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setClearOnEscape(value: Boolean): Self = StObject.set(x, "clearOnEscape", value.asInstanceOf[js.Any])
      
      inline def setClearOnEscapeUndefined: Self = StObject.set(x, "clearOnEscape", js.undefined)
      
      inline def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      inline def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
      
      inline def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
      
      inline def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEndEnhancer(value: (js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerFunction1(value: /* args */ SharedProps => ReactNode): Self = StObject.set(x, "endEnhancer", js.Any.fromFunction1(value))
      
      inline def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setInputMode(value: String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setManageFocus(value: Boolean): Self = StObject.set(x, "manageFocus", value.asInstanceOf[js.Any])
      
      inline def setManageFocusUndefined: Self = StObject.set(x, "manageFocus", js.undefined)
      
      inline def setMask(value: Boolean | String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* args */ Values => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOverrides(value: js.UndefOr[InputOverrides] & js.UndefOr[PinCodeOverrides]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setSize(value: mini | default_ | compact | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStartEnhancer(value: (js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
      
      inline def setStartEnhancerFunction1(value: /* args */ SharedProps => ReactNode): Self = StObject.set(x, "startEnhancer", js.Any.fromFunction1(value))
      
      inline def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
      
      inline def setStateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
