package typings.baseui

import typings.baseui.anon.IsActiveIsHovered
import typings.baseui.radioTypesMod.RadioProps
import typings.baseui.radioTypesMod.RadioState
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioRadioMod {
  
  @JSImport("baseui/radio/radio", JSImport.Default)
  @js.native
  open class default () extends Radio
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/radio/radio", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/radio/radio", "default.defaultProps.align")
      @js.native
      def align: String = js.native
      inline def align_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("align")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/radio/radio", "default.defaultProps.autoFocus")
      @js.native
      def autoFocus: Boolean = js.native
      inline def autoFocus_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/radio/radio", "default.defaultProps.checked")
      @js.native
      def checked: Boolean = js.native
      inline def checked_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checked")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/radio/radio", "default.defaultProps.containsInteractiveElement")
      @js.native
      def containsInteractiveElement: Boolean = js.native
      inline def containsInteractiveElement_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("containsInteractiveElement")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/radio/radio", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/radio/radio", "default.defaultProps.error")
      @js.native
      def error: Boolean = js.native
      inline def error_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/radio/radio", "default.defaultProps.inputRef")
      @js.native
      def inputRef: RefObject[HTMLInputElement] = js.native
      inline def inputRef_=(x: RefObject[HTMLInputElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(x.asInstanceOf[js.Any])
      
      inline def onBlur(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBlur")().asInstanceOf[Unit]
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      inline def onFocus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFocus")().asInstanceOf[Unit]
      
      inline def onMouseDown(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMouseDown")().asInstanceOf[Unit]
      
      inline def onMouseEnter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMouseEnter")().asInstanceOf[Unit]
      
      inline def onMouseLeave(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMouseLeave")().asInstanceOf[Unit]
      
      inline def onMouseUp(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMouseUp")().asInstanceOf[Unit]
    }
  }
  
  @js.native
  trait Radio extends Component[RadioProps, RadioState, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MRadio(): Unit = js.native
    
    def onMouseDown(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def onMouseEnter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def onMouseLeave(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def onMouseUp(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    @JSName("state")
    var state_Radio: IsActiveIsHovered = js.native
  }
}
