package typings.baseui

import typings.baseui.anon.Root
import typings.baseui.baseuiStrings.any
import typings.baseui.baseuiStrings.both
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.none
import typings.baseui.baseuiStrings.right
import typings.baseui.inputTypesMod.Adjoined
import typings.baseui.inputTypesMod.BaseInputOverrides
import typings.baseui.inputTypesMod.BaseInputProps
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
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textareaTypesMod {
  
  type BaseTextAreaProps = BaseInputProps[HTMLTextAreaElement]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.baseui.textareaTypesMod.StatefulContainerProps because var conflicts: onChange, onKeyDown, onKeyPress, onKeyUp. Inlined children, initialState, stateReducer */ trait FullStProps
    extends StObject
       with TextareaProps {
    
    def children(props: Any): ReactNode
    
    var initialState: js.UndefOr[State] = js.undefined
    
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
  }
  object FullStProps {
    
    inline def apply(children: Any => ReactNode): FullStProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[FullStProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FullStProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: Any => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setStateReducer(value: (/* stateType */ StateType, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  trait OmitProps extends StObject {
    
    def children(props: Any): ReactNode
  }
  object OmitProps {
    
    inline def apply(children: Any => ReactNode): OmitProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[OmitProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: Any => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait SharedStyleProps extends StObject {
    
    @JSName("$adjoined")
    var $adjoined: /* keyof baseui.anon.Both */ none | left | right | both
    
    @JSName("$disabled")
    var $disabled: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$error")
    var $error: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$isFocused")
    var $isFocused: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$isReadOnly")
    var $isReadOnly: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$positive")
    var $positive: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$required")
    var $required: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$resize")
    var $resize: js.UndefOr[Resize] = js.undefined
    
    @JSName("$size")
    var $size: Size
  }
  object SharedStyleProps {
    
    inline def apply($adjoined: /* keyof baseui.anon.Both */ none | left | right | both, $size: Size): SharedStyleProps = {
      val __obj = js.Dynamic.literal($adjoined = $adjoined.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SharedStyleProps] (val x: Self) extends AnyVal {
      
      inline def set$adjoined(value: /* keyof baseui.anon.Both */ none | left | right | both): Self = StObject.set(x, "$adjoined", value.asInstanceOf[js.Any])
      
      inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
      
      inline def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
      
      inline def set$error(value: Boolean): Self = StObject.set(x, "$error", value.asInstanceOf[js.Any])
      
      inline def set$errorUndefined: Self = StObject.set(x, "$error", js.undefined)
      
      inline def set$isFocused(value: Boolean): Self = StObject.set(x, "$isFocused", value.asInstanceOf[js.Any])
      
      inline def set$isFocusedUndefined: Self = StObject.set(x, "$isFocused", js.undefined)
      
      inline def set$isReadOnly(value: Boolean): Self = StObject.set(x, "$isReadOnly", value.asInstanceOf[js.Any])
      
      inline def set$isReadOnlyUndefined: Self = StObject.set(x, "$isReadOnly", js.undefined)
      
      inline def set$positive(value: Boolean): Self = StObject.set(x, "$positive", value.asInstanceOf[js.Any])
      
      inline def set$positiveUndefined: Self = StObject.set(x, "$positive", js.undefined)
      
      inline def set$required(value: Boolean): Self = StObject.set(x, "$required", value.asInstanceOf[js.Any])
      
      inline def set$requiredUndefined: Self = StObject.set(x, "$required", js.undefined)
      
      inline def set$resize(value: Resize): Self = StObject.set(x, "$resize", value.asInstanceOf[js.Any])
      
      inline def set$resizeUndefined: Self = StObject.set(x, "$resize", js.undefined)
      
      inline def set$size(value: Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    }
  }
  
  /* keyof baseui.anon.Compact */ /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.mini
    - typings.baseui.baseuiStrings.default_
    - typings.baseui.baseuiStrings.compact
    - typings.baseui.baseuiStrings.large_
  */
  trait Size extends StObject
  
  trait StatefulContainerProps extends StObject {
    
    def children(props: Any): ReactNode
    
    var initialState: js.UndefOr[State] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ SyntheticTextareaEvent, Any]] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function1[/* e */ SyntheticTextareaEvent, Any]] = js.undefined
    
    var onKeyPress: js.UndefOr[js.Function1[/* e */ SyntheticTextareaEvent, Any]] = js.undefined
    
    var onKeyUp: js.UndefOr[js.Function1[/* e */ SyntheticTextareaEvent, Any]] = js.undefined
    
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
  }
  object StatefulContainerProps {
    
    inline def apply(children: Any => ReactNode): StatefulContainerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[StatefulContainerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatefulContainerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: Any => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setOnChange(value: /* e */ SyntheticTextareaEvent => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnKeyDown(value: /* e */ SyntheticTextareaEvent => Any): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: /* e */ SyntheticTextareaEvent => Any): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: /* e */ SyntheticTextareaEvent => Any): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setStateReducer(value: (/* stateType */ StateType, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Omit<baseui.baseui/textarea/types.FullStProps, keyof baseui.baseui/textarea/types.OmitProps>> */
  trait StatefulTextareaProps extends StObject {
    
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
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var initialState: js.UndefOr[State] = js.undefined
    
    var inputMode: js.UndefOr[String] = js.undefined
    
    var inputRef: js.UndefOr[RefObject[HTMLTextAreaElement]] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLTextAreaElement, Element], Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLTextAreaElement], Unit]] = js.undefined
    
    var onClear: js.UndefOr[js.Function1[/* e */ SyntheticEvent[HTMLTextAreaElement, Event], Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLTextAreaElement, Element], Unit]] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLTextAreaElement], Unit]] = js.undefined
    
    var onKeyPress: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLTextAreaElement], Unit]] = js.undefined
    
    var onKeyUp: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLTextAreaElement], Unit]] = js.undefined
    
    var overrides: js.UndefOr[TextareaOverrides] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var positive: js.UndefOr[Boolean] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resize: js.UndefOr[Resize] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[typings.baseui.inputTypesMod.Size] = js.undefined
    
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
    
    var step: js.UndefOr[Double | any] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object StatefulTextareaProps {
    
    inline def apply(): StatefulTextareaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulTextareaProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatefulTextareaProps] (val x: Self) extends AnyVal {
      
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
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setInputMode(value: String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setInputRef(value: RefObject[HTMLTextAreaElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: /* e */ FocusEvent[HTMLTextAreaElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* e */ ChangeEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClear(value: /* e */ SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnFocus(value: /* e */ FocusEvent[HTMLTextAreaElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: /* e */ KeyboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: /* e */ KeyboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: /* e */ KeyboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOverrides(value: TextareaOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
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
      
      inline def setSize(value: typings.baseui.inputTypesMod.Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
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
  
  type SyntheticTextareaEvent = SyntheticEvent[HTMLTextAreaElement, Event]
  
  type TextareaOverrides = Root & js.UndefOr[BaseInputOverrides]
  
  trait TextareaProps
    extends StObject
       with BaseInputProps[HTMLTextAreaElement] {
    
    @JSName("overrides")
    var overrides_TextareaProps: js.UndefOr[TextareaOverrides] = js.undefined
  }
  object TextareaProps {
    
    inline def apply(): TextareaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextareaProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextareaProps] (val x: Self) extends AnyVal {
      
      inline def setOverrides(value: TextareaOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
}
