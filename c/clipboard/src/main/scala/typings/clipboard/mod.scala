package typings.clipboard

import typings.clipboard.clipboardStrings.copy
import typings.clipboard.clipboardStrings.cut
import typings.clipboard.clipboardStrings.error
import typings.clipboard.clipboardStrings.success
import typings.std.Element
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clipboard", JSImport.Namespace)
  @js.native
  class ^ protected () extends ClipboardJS {
    def this(selector: String) = this()
    def this(selector: Element) = this()
    def this(selector: NodeListOf[Element]) = this()
    def this(selector: String, options: Options) = this()
    def this(selector: Element, options: Options) = this()
    def this(selector: NodeListOf[Element], options: Options) = this()
  }
  
  /**
    * Checks if clipboard.js is supported
    */
  /* static member */
  @JSImport("clipboard", "isSupported")
  @js.native
  def isSupported(): Boolean = js.native
  
  @js.native
  trait ClipboardJS extends StObject {
    
    /**
      * Clears all event bindings.
      */
    def destroy(): Unit = js.native
    
    def on(`type`: String, handler: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_error(`type`: error, handler: js.Function1[/* e */ Event, Unit]): this.type = js.native
    /**
      * Subscribes to events that indicate the result of a copy/cut operation.
      * @param type Event type ('success' or 'error').
      * @param handler Callback function.
      */
    @JSName("on")
    def on_success(`type`: success, handler: js.Function1[/* e */ Event, Unit]): this.type = js.native
  }
  
  @js.native
  trait Event extends StObject {
    
    var action: String = js.native
    
    def clearSelection(): Unit = js.native
    
    var text: String = js.native
    
    var trigger: Element = js.native
  }
  object Event {
    
    @scala.inline
    def apply(action: String, clearSelection: () => Unit, text: String, trigger: Element): Event = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], clearSelection = js.Any.fromFunction0(clearSelection), text = text.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearSelection(value: () => Unit): Self = StObject.set(x, "clearSelection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrigger(value: Element): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Overwrites default command ('cut' or 'copy').
      * @param elem Current element
      */
    var action: js.UndefOr[js.Function1[/* elem */ Element, cut | copy]] = js.native
    
    /**
      * For use in Bootstrap Modals or with any
      * other library that changes the focus
      * you'll want to set the focused element
      * as the container value.
      */
    var container: js.UndefOr[Element] = js.native
    
    /**
      * Overwrites default target input element.
      * @param elem Current element
      * @returns <input> element to use.
      */
    var target: js.UndefOr[js.Function1[/* elem */ Element, Element]] = js.native
    
    /**
      * Returns the explicit text to copy.
      * @param elem Current element
      * @returns Text to be copied.
      */
    var text: js.UndefOr[js.Function1[/* elem */ Element, String]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: /* elem */ Element => cut | copy): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setTarget(value: /* elem */ Element => Element): Self = StObject.set(x, "target", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setText(value: /* elem */ Element => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
