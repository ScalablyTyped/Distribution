package typings.baseui

import typings.baseui.anon.InitialType
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.none
import typings.baseui.inputTypesMod.BaseInputProps
import typings.baseui.inputTypesMod.InternalState
import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.react.mod.RefObject
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputBaseInputMod {
  
  @JSImport("baseui/input/base-input", JSImport.Default)
  @js.native
  open class default[T /* <: HTMLInputElement | HTMLTextAreaElement */] () extends BaseInput[T]
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/input/base-input", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/input/base-input", "default.defaultProps.adjoined")
      @js.native
      def adjoined: none = js.native
      inline def adjoined_=(x: none): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("adjoined")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.aria-activedescendant")
      @js.native
      def ariaActivedescendant: Any = js.native
      
      inline def ariaActivedescendant_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-activedescendant")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.aria-autocomplete")
      @js.native
      def ariaAutocomplete: Any = js.native
      
      inline def ariaAutocomplete_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-autocomplete")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.aria-controls")
      @js.native
      def ariaControls: Any = js.native
      
      inline def ariaControls_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-controls")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.aria-describedby")
      @js.native
      def ariaDescribedby: Any = js.native
      
      inline def ariaDescribedby_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-describedby")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.aria-errormessage")
      @js.native
      def ariaErrormessage: Any = js.native
      
      inline def ariaErrormessage_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-errormessage")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.aria-haspopup")
      @js.native
      def ariaHaspopup: Any = js.native
      
      inline def ariaHaspopup_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-haspopup")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.aria-label")
      @js.native
      def ariaLabel: Any = js.native
      
      inline def ariaLabel_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.aria-labelledby")
      @js.native
      def ariaLabelledby: Any = js.native
      
      inline def ariaLabelledby_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-labelledby")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.autoComplete")
      @js.native
      def autoComplete: String = js.native
      inline def autoComplete_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.autoFocus")
      @js.native
      def autoFocus: Boolean = js.native
      inline def autoFocus_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.clearOnEscape")
      @js.native
      def clearOnEscape: Boolean = js.native
      inline def clearOnEscape_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearOnEscape")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.clearable")
      @js.native
      def clearable: Boolean = js.native
      inline def clearable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearable")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.error")
      @js.native
      def error: Boolean = js.native
      inline def error_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.inputMode")
      @js.native
      def inputMode: String = js.native
      inline def inputMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputMode")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.name")
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
      
      @JSImport("baseui/input/base-input", "default.defaultProps.pattern")
      @js.native
      def pattern: Any = js.native
      inline def pattern_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pattern")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.placeholder")
      @js.native
      def placeholder: String = js.native
      inline def placeholder_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.positive")
      @js.native
      def positive: Boolean = js.native
      inline def positive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positive")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.readOnly")
      @js.native
      def readOnly: Boolean = js.native
      inline def readOnly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.required")
      @js.native
      def required: Boolean = js.native
      inline def required_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.role")
      @js.native
      def role: Any = js.native
      inline def role_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.size")
      @js.native
      def size: default_ = js.native
      inline def size_=(x: default_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/base-input", "default.defaultProps.type")
      @js.native
      val `type`: String = js.native
    }
  }
  
  @js.native
  trait BaseInput[T /* <: HTMLInputElement | HTMLTextAreaElement */] extends Component[BaseInputProps[T], InternalState, Any] {
    
    def clearValue(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MBaseInput(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MBaseInput(): Unit = js.native
    
    def getInputType(): String = js.native
    
    def handleBlurForClear(event: SyntheticEvent[Element, Event]): Unit = js.native
    
    def handleBlurForMaskToggle(event: SyntheticEvent[Element, Event]): Unit = js.native
    
    def handleFocusForClear(event: SyntheticEvent[Element, Event]): Unit = js.native
    
    def handleFocusForMaskToggle(event: SyntheticEvent[Element, Event]): Unit = js.native
    
    var inputRef: RefObject[T] = js.native
    
    def onBlur(e: FocusEvent[T, Element]): Unit = js.native
    
    def onClearIconClick(): Unit = js.native
    
    def onFocus(e: FocusEvent[T, Element]): Unit = js.native
    
    def onInputKeyDown(e: KeyboardEvent): Unit = js.native
    
    def renderClear(): typings.react.mod.global.JSX.Element = js.native
    
    def renderMaskToggle(): typings.react.mod.global.JSX.Element = js.native
    
    @JSName("state")
    var state_BaseInput: InitialType = js.native
  }
}
