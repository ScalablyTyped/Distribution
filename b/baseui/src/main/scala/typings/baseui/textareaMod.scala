package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.textarea
import typings.baseui.inputTypesMod.StateReducer
import typings.baseui.textareaStatefulContainerMod.default
import typings.baseui.textareaTypesMod.SharedStyleProps
import typings.baseui.textareaTypesMod.StatefulTextareaProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textareaMod {
  
  @JSImport("baseui/textarea", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object SIZE extends Shortcut {
    
    @JSImport("baseui/textarea", "SIZE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/textarea", "SIZE.compact")
    @js.native
    val compact: typings.baseui.baseuiStrings.compact = js.native
    
    @JSImport("baseui/textarea", "SIZE.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/textarea", "SIZE.mini")
    @js.native
    val mini: typings.baseui.baseuiStrings.mini = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SIZE.foo` */
    override def _to: default_ = default
  }
  
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/textarea", "STATE_CHANGE_TYPE.change")
    @js.native
    val change: change_ = js.native
  }
  
  @JSImport("baseui/textarea", "StatefulContainer")
  @js.native
  open class StatefulContainer[T /* <: HTMLInputElement | HTMLTextAreaElement */] () extends default[T]
  object StatefulContainer {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/textarea", "StatefulContainer.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      inline def onClear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClear")().asInstanceOf[Unit]
      
      @JSImport("baseui/textarea", "StatefulContainer.defaultProps.stateReducer")
      @js.native
      def stateReducer: StateReducer = js.native
      inline def stateReducer_=(x: StateReducer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def StatefulTextarea(props: StatefulTextareaProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StatefulTextarea")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/textarea", "StyledTextarea")
  @js.native
  val StyledTextarea: StyletronComponent[textarea, SharedStyleProps] = js.native
  
  @JSImport("baseui/textarea", "StyledTextareaContainer")
  @js.native
  val StyledTextareaContainer: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/textarea", "Textarea")
  @js.native
  open class Textarea ()
    extends typings.baseui.textareaTextareaMod.default
  object Textarea {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/textarea", "Textarea.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/textarea", "Textarea.defaultProps.autoFocus")
      @js.native
      def autoFocus: Boolean = js.native
      inline def autoFocus_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/textarea", "Textarea.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/textarea", "Textarea.defaultProps.error")
      @js.native
      def error: Boolean = js.native
      inline def error_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/textarea", "Textarea.defaultProps.name")
      @js.native
      def name: String = js.native
      inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      inline def onBlur(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBlur")().asInstanceOf[Unit]
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      inline def onFocus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFocus")().asInstanceOf[Unit]
      
      inline def onKeyDown(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onKeyDown")().asInstanceOf[Unit]
      
      inline def onKeyPress(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onKeyPress")().asInstanceOf[Unit]
      
      inline def onKeyUp(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onKeyUp")().asInstanceOf[Unit]
      
      @JSImport("baseui/textarea", "Textarea.defaultProps.placeholder")
      @js.native
      def placeholder: String = js.native
      inline def placeholder_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/textarea", "Textarea.defaultProps.readOnly")
      @js.native
      def readOnly: Boolean = js.native
      inline def readOnly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/textarea", "Textarea.defaultProps.required")
      @js.native
      def required: Boolean = js.native
      inline def required_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/textarea", "Textarea.defaultProps.rows")
      @js.native
      def rows: Double = js.native
      inline def rows_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rows")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/textarea", "Textarea.defaultProps.size")
      @js.native
      def size: default_ = js.native
      inline def size_=(x: default_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
  }
}
