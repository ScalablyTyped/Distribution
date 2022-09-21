package typings.baseui

import typings.baseui.anon.IsFocused
import typings.baseui.baseuiStrings.default_
import typings.baseui.textareaTypesMod.TextareaProps
import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.std.Element
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textareaTextareaMod {
  
  @JSImport("baseui/textarea/textarea", JSImport.Default)
  @js.native
  open class default () extends Textarea
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/textarea/textarea", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/textarea/textarea", "default.defaultProps.autoFocus")
      @js.native
      def autoFocus: Boolean = js.native
      inline def autoFocus_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/textarea/textarea", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/textarea/textarea", "default.defaultProps.error")
      @js.native
      def error: Boolean = js.native
      inline def error_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/textarea/textarea", "default.defaultProps.name")
      @js.native
      def name: String = js.native
      inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      inline def onBlur(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBlur")().asInstanceOf[Unit]
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      inline def onFocus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFocus")().asInstanceOf[Unit]
      
      inline def onKeyDown(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onKeyDown")().asInstanceOf[Unit]
      
      inline def onKeyPress(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onKeyPress")().asInstanceOf[Unit]
      
      inline def onKeyUp(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onKeyUp")().asInstanceOf[Unit]
      
      @JSImport("baseui/textarea/textarea", "default.defaultProps.placeholder")
      @js.native
      def placeholder: String = js.native
      inline def placeholder_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/textarea/textarea", "default.defaultProps.readOnly")
      @js.native
      def readOnly: Boolean = js.native
      inline def readOnly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/textarea/textarea", "default.defaultProps.required")
      @js.native
      def required: Boolean = js.native
      inline def required_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/textarea/textarea", "default.defaultProps.rows")
      @js.native
      def rows: Double = js.native
      inline def rows_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rows")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/textarea/textarea", "default.defaultProps.size")
      @js.native
      def size: default_ = js.native
      inline def size_=(x: default_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Textarea extends Component[TextareaProps, IsFocused, Any] {
    
    def onBlur(e: FocusEvent[HTMLTextAreaElement, Element]): Unit = js.native
    
    def onFocus(e: FocusEvent[HTMLTextAreaElement, Element]): Unit = js.native
  }
}
