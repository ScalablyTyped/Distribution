package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.baseInputMod.default
import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.input
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.none
import typings.baseui.inputTypesMod.MaskedInputProps
import typings.baseui.inputTypesMod.SharedProps
import typings.baseui.inputTypesMod.StateReducer
import typings.baseui.inputTypesMod.StatefulInputProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("baseui/input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ADJOINED {
    
    @JSImport("baseui/input", "ADJOINED.both")
    @js.native
    val both: typings.baseui.baseuiStrings.both = js.native
    
    @JSImport("baseui/input", "ADJOINED.left")
    @js.native
    val left: typings.baseui.baseuiStrings.left = js.native
    
    @JSImport("baseui/input", "ADJOINED.none")
    @js.native
    val none: typings.baseui.baseuiStrings.none = js.native
    
    @JSImport("baseui/input", "ADJOINED.right")
    @js.native
    val right: typings.baseui.baseuiStrings.right = js.native
  }
  
  @JSImport("baseui/input", "BaseInput")
  @js.native
  open class BaseInput[T /* <: HTMLInputElement | HTMLTextAreaElement */] () extends default[T]
  object BaseInput {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/input", "BaseInput.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/input", "BaseInput.defaultProps.adjoined")
      @js.native
      def adjoined: none = js.native
      inline def adjoined_=(x: none): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("adjoined")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.aria-activedescendant")
      @js.native
      def ariaActivedescendant: Any = js.native
      
      inline def ariaActivedescendant_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-activedescendant")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.aria-autocomplete")
      @js.native
      def ariaAutocomplete: Any = js.native
      
      inline def ariaAutocomplete_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-autocomplete")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.aria-controls")
      @js.native
      def ariaControls: Any = js.native
      
      inline def ariaControls_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-controls")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.aria-describedby")
      @js.native
      def ariaDescribedby: Any = js.native
      
      inline def ariaDescribedby_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-describedby")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.aria-errormessage")
      @js.native
      def ariaErrormessage: Any = js.native
      
      inline def ariaErrormessage_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-errormessage")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.aria-haspopup")
      @js.native
      def ariaHaspopup: Any = js.native
      
      inline def ariaHaspopup_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-haspopup")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.aria-label")
      @js.native
      def ariaLabel: Any = js.native
      
      inline def ariaLabel_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.aria-labelledby")
      @js.native
      def ariaLabelledby: Any = js.native
      
      inline def ariaLabelledby_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-labelledby")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.autoComplete")
      @js.native
      def autoComplete: String = js.native
      inline def autoComplete_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.autoFocus")
      @js.native
      def autoFocus: Boolean = js.native
      inline def autoFocus_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.clearOnEscape")
      @js.native
      def clearOnEscape: Boolean = js.native
      inline def clearOnEscape_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearOnEscape")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.clearable")
      @js.native
      def clearable: Boolean = js.native
      inline def clearable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearable")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.error")
      @js.native
      def error: Boolean = js.native
      inline def error_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.inputMode")
      @js.native
      def inputMode: String = js.native
      inline def inputMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputMode")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.name")
      @js.native
      def name: String = js.native
      inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      inline def onBlur(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBlur")().asInstanceOf[Unit]
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      inline def onClear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClear")().asInstanceOf[Unit]
      
      inline def onFocus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFocus")().asInstanceOf[Unit]
      
      inline def onKeyDown(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onKeyDown")().asInstanceOf[Unit]
      
      inline def onKeyPress(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onKeyPress")().asInstanceOf[Unit]
      
      inline def onKeyUp(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onKeyUp")().asInstanceOf[Unit]
      
      @JSImport("baseui/input", "BaseInput.defaultProps.pattern")
      @js.native
      def pattern: Any = js.native
      inline def pattern_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pattern")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.placeholder")
      @js.native
      def placeholder: String = js.native
      inline def placeholder_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.positive")
      @js.native
      def positive: Boolean = js.native
      inline def positive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positive")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.readOnly")
      @js.native
      def readOnly: Boolean = js.native
      inline def readOnly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.required")
      @js.native
      def required: Boolean = js.native
      inline def required_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.role")
      @js.native
      def role: Any = js.native
      inline def role_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.size")
      @js.native
      def size: default_ = js.native
      inline def size_=(x: default_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "BaseInput.defaultProps.type")
      @js.native
      val `type`: String = js.native
    }
  }
  
  object CUSTOM_INPUT_TYPE {
    
    @JSImport("baseui/input", "CUSTOM_INPUT_TYPE.textarea")
    @js.native
    val textarea: typings.baseui.baseuiStrings.textarea = js.native
  }
  
  @JSImport("baseui/input", "Input")
  @js.native
  open class Input ()
    extends typings.baseui.inputInputMod.default
  object Input {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/input", "Input.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/input", "Input.defaultProps.autoComplete")
      @js.native
      def autoComplete: String = js.native
      inline def autoComplete_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "Input.defaultProps.autoFocus")
      @js.native
      def autoFocus: Boolean = js.native
      inline def autoFocus_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "Input.defaultProps.clearable")
      @js.native
      def clearable: Boolean = js.native
      inline def clearable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearable")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "Input.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "Input.defaultProps.endEnhancer")
      @js.native
      def endEnhancer: Any = js.native
      inline def endEnhancer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endEnhancer")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "Input.defaultProps.name")
      @js.native
      def name: String = js.native
      inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      inline def onBlur(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBlur")().asInstanceOf[Unit]
      
      inline def onFocus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFocus")().asInstanceOf[Unit]
      
      @JSImport("baseui/input", "Input.defaultProps.readOnly")
      @js.native
      def readOnly: Boolean = js.native
      inline def readOnly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "Input.defaultProps.required")
      @js.native
      def required: Boolean = js.native
      inline def required_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "Input.defaultProps.size")
      @js.native
      def size: default_ = js.native
      inline def size_=(x: default_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "Input.defaultProps.startEnhancer")
      @js.native
      def startEnhancer: Any = js.native
      inline def startEnhancer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startEnhancer")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input", "Input.defaultProps.type")
      @js.native
      val `type`: String = js.native
    }
  }
  
  object MaskedInput {
    
    inline def apply(hasMaskMaskCharHasInputOverrideRestOverridesRestProps: MaskedInputProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasMaskMaskCharHasInputOverrideRestOverridesRestProps.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/input", "MaskedInput")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/input", "MaskedInput.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/input", "MaskedInput.defaultProps.maskChar")
      @js.native
      def maskChar: String = js.native
      inline def maskChar_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maskChar")(x.asInstanceOf[js.Any])
    }
  }
  
  object SIZE extends Shortcut {
    
    @JSImport("baseui/input", "SIZE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/input", "SIZE.compact")
    @js.native
    val compact: typings.baseui.baseuiStrings.compact = js.native
    
    @JSImport("baseui/input", "SIZE.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/input", "SIZE.mini")
    @js.native
    val mini: typings.baseui.baseuiStrings.mini = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SIZE.foo` */
    override def _to: default_ = default
  }
  
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/input", "STATE_CHANGE_TYPE.change")
    @js.native
    val change: change_ = js.native
  }
  
  @JSImport("baseui/input", "StatefulContainer")
  @js.native
  open class StatefulContainer[T /* <: HTMLInputElement | HTMLTextAreaElement */] ()
    extends typings.baseui.inputStatefulContainerMod.default[T]
  object StatefulContainer {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/input", "StatefulContainer.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      inline def onClear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClear")().asInstanceOf[Unit]
      
      @JSImport("baseui/input", "StatefulContainer.defaultProps.stateReducer")
      @js.native
      def stateReducer: StateReducer = js.native
      inline def stateReducer_=(x: StateReducer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def StatefulInput(props: StatefulInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StatefulInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/input", "StyledEndEnhancer")
  @js.native
  val StyledEndEnhancer: StyletronComponent[div, SharedProps] = js.native
  
  @JSImport("baseui/input", "StyledInput")
  @js.native
  val StyledInput: StyletronComponent[input, SharedProps] = js.native
  
  @JSImport("baseui/input", "StyledInputContainer")
  @js.native
  val StyledInputContainer: StyletronComponent[div, SharedProps] = js.native
  
  @JSImport("baseui/input", "StyledInputEnhancer")
  @js.native
  val StyledInputEnhancer: StyletronComponent[div, SharedProps] = js.native
  
  @JSImport("baseui/input", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, SharedProps] = js.native
  
  @JSImport("baseui/input", "StyledStartEnhancer")
  @js.native
  val StyledStartEnhancer: StyletronComponent[div, SharedProps] = js.native
}
