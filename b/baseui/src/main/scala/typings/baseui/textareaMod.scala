package typings.baseui

import typings.baseui.baseuiStrings.both
import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.mini
import typings.baseui.baseuiStrings.none
import typings.baseui.baseuiStrings.right
import typings.baseui.inputMod.BaseInputOverrides
import typings.baseui.inputMod.BaseInputProps
import typings.baseui.inputMod.SharedProps
import typings.baseui.inputMod.State
import typings.baseui.inputMod.StatefulContainerProps
import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textareaMod {
  
  @js.native
  trait ADJOINED extends StObject {
    
    var both: typings.baseui.baseuiStrings.both = js.native
    
    var left: typings.baseui.baseuiStrings.left = js.native
    
    var none: typings.baseui.baseuiStrings.none = js.native
    
    var right: typings.baseui.baseuiStrings.right = js.native
  }
  object ADJOINED {
    
    @JSImport("baseui/textarea", "ADJOINED")
    @js.native
    val ^ : ADJOINED = js.native
    
    @scala.inline
    implicit class ADJOINEDMutableBuilder[Self <: ADJOINED] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoth(value: both): Self = StObject.set(x, "both", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: left): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNone(value: none): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: right): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SIZE extends StObject {
    
    var default: default_ = js.native
    
    var compact: typings.baseui.baseuiStrings.compact = js.native
    
    var large: large_ = js.native
  }
  object SIZE {
    
    @JSImport("baseui/textarea", "SIZE")
    @js.native
    val ^ : SIZE = js.native
    
    @scala.inline
    implicit class SIZEMutableBuilder[Self <: SIZE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompact(value: compact): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault(value: default_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLarge(value: large_): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/textarea", "STATE_CHANGE_TYPE")
  @js.native
  val STATE_CHANGE_TYPE: typings.baseui.inputMod.STATE_CHANGE_TYPE = js.native
  
  @JSImport("baseui/textarea", "StatefulContainer")
  @js.native
  val StatefulContainer: FC[StatefulContainerProps] = js.native
  
  @JSImport("baseui/textarea", "StatefulTextarea")
  @js.native
  val StatefulTextarea: FC[StatefulTextareaProps] = js.native
  
  @JSImport("baseui/textarea", "StyledTextarea")
  @js.native
  val StyledTextarea: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/textarea", "StyledTextareaContainer")
  @js.native
  val StyledTextareaContainer: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/textarea", "Textarea")
  @js.native
  class Textarea protected ()
    extends Component[TextareaProps, js.Object, js.Any] {
    def this(props: TextareaProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TextareaProps, context: js.Any) = this()
  }
  
  /* Inlined baseui.baseui/textarea.TextareaProps & baseui.baseui/input.StatefulContainerProps & {  children :never | undefined} */
  @js.native
  trait StatefulTextareaProps extends StObject {
    
    var adjoined: js.UndefOr[none | left | right | both] = js.native
    
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var autoComplete: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactNode] with js.UndefOr[scala.Nothing] = js.native
    
    var clearOnEscape: js.UndefOr[Boolean] = js.native
    
    var clearable: js.UndefOr[Boolean] = js.native
    
    var `data-baseweb`: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var error: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var initialState: js.UndefOr[State] = js.native
    
    var inputMode: js.UndefOr[String] = js.native
    
    var inputRef: js.UndefOr[Ref[HTMLTextAreaElement]] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] = js.native
    
    var onChange: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.native
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.native
    
    var overrides: js.UndefOr[BaseInputOverrides[SharedProps]] = js.native
    
    var pattern: js.UndefOr[String] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var positive: js.UndefOr[Boolean] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[mini | default_ | compact | large_] = js.native
    
    var stateReducer: js.UndefOr[js.Function3[change_, /* nextState */ State, /* currentState */ State, State]] = js.native
    
    var step: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String | Double] = js.native
  }
  object StatefulTextareaProps {
    
    @scala.inline
    def apply(
      children: js.UndefOr[ReactNode] with js.UndefOr[scala.Nothing],
      onChange: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]]
    ): StatefulTextareaProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulTextareaProps]
    }
    
    @scala.inline
    implicit class StatefulTextareaPropsMutableBuilder[Self <: StatefulTextareaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjoined(value: none | left | right | both): Self = StObject.set(x, "adjoined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjoinedUndefined: Self = StObject.set(x, "adjoined", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setChildren(value: js.UndefOr[ReactNode] with js.UndefOr[scala.Nothing]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearOnEscape(value: Boolean): Self = StObject.set(x, "clearOnEscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearOnEscapeUndefined: Self = StObject.set(x, "clearOnEscape", js.undefined)
      
      @scala.inline
      def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
      
      @scala.inline
      def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setInputMode(value: String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      @scala.inline
      def setInputRef(value: Ref[HTMLTextAreaElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRefFunction1(value: /* instance */ HTMLTextAreaElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      @scala.inline
      def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnBlur(value: FocusEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]]
      ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFocus(value: FocusEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: KeyboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: KeyboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOverrides(value: BaseInputOverrides[SharedProps]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setSize(value: mini | default_ | compact | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait TextareaProps extends BaseInputProps[HTMLTextAreaElement]
  object TextareaProps {
    
    @scala.inline
    def apply(): TextareaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextareaProps]
    }
  }
}
