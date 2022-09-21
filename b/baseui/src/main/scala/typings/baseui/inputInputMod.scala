package typings.baseui

import typings.baseui.anon.IsFocused
import typings.baseui.baseuiStrings.default_
import typings.baseui.inputTypesMod.InputProps
import typings.baseui.inputTypesMod.InternalState
import typings.baseui.inputTypesMod.StateReducer
import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputInputMod {
  
  @JSImport("baseui/input/input", JSImport.Default)
  @js.native
  open class default () extends Input
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/input/input", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/input/input", "default.defaultProps.autoComplete")
      @js.native
      def autoComplete: String = js.native
      inline def autoComplete_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/input", "default.defaultProps.autoFocus")
      @js.native
      def autoFocus: Boolean = js.native
      inline def autoFocus_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/input", "default.defaultProps.clearable")
      @js.native
      def clearable: Boolean = js.native
      inline def clearable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearable")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/input", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/input", "default.defaultProps.endEnhancer")
      @js.native
      def endEnhancer: Any = js.native
      inline def endEnhancer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endEnhancer")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/input", "default.defaultProps.name")
      @js.native
      def name: String = js.native
      inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      inline def onBlur(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBlur")().asInstanceOf[Unit]
      
      inline def onFocus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFocus")().asInstanceOf[Unit]
      
      @JSImport("baseui/input/input", "default.defaultProps.readOnly")
      @js.native
      def readOnly: Boolean = js.native
      inline def readOnly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/input", "default.defaultProps.required")
      @js.native
      def required: Boolean = js.native
      inline def required_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/input", "default.defaultProps.size")
      @js.native
      def size: default_ = js.native
      inline def size_=(x: default_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/input", "default.defaultProps.startEnhancer")
      @js.native
      def startEnhancer: Any = js.native
      inline def startEnhancer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startEnhancer")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/input/input", "default.defaultProps.type")
      @js.native
      val `type`: String = js.native
    }
  }
  
  @JSImport("baseui/input/input", "StatefulContainer")
  @js.native
  open class StatefulContainer[T /* <: HTMLInputElement | HTMLTextAreaElement */] ()
    extends typings.baseui.inputStatefulContainerMod.default[T]
  object StatefulContainer {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/input/input", "StatefulContainer.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      inline def onClear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClear")().asInstanceOf[Unit]
      
      @JSImport("baseui/input/input", "StatefulContainer.defaultProps.stateReducer")
      @js.native
      def stateReducer: StateReducer = js.native
      inline def stateReducer_=(x: StateReducer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Input extends Component[InputProps, InternalState, Any] {
    
    def onBlur(e: FocusEvent[HTMLInputElement, Element]): Unit = js.native
    
    def onFocus(e: FocusEvent[HTMLInputElement, Element]): Unit = js.native
    
    /**
      * This "Stateless" input still has state. This is private state that
      * customers shouldn't have to manage themselves, such as input's focus state.
      */
    @JSName("state")
    var state_Input: IsFocused = js.native
  }
}
