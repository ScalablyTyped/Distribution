package typings.bootstrap

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabMod {
  
  @JSImport("bootstrap/js/dist/tab", JSImport.Default)
  @js.native
  class default protected () extends Tab {
    def this(element: Element) = this()
  }
  object default {
    
    @JSImport("bootstrap/js/dist/tab", "default.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.bootstrap.tabMod.Tab.Events with String] = js.native
      
      /* "hidden.bs.tab" */ val hidden: typings.bootstrap.tabMod.Tab.Events.hidden with String = js.native
      
      /* "hide.bs.tab" */ val hide: typings.bootstrap.tabMod.Tab.Events.hide with String = js.native
      
      /* "show.bs.tab" */ val show: typings.bootstrap.tabMod.Tab.Events.show with String = js.native
      
      /* "shown.bs.tab" */ val shown: typings.bootstrap.tabMod.Tab.Events.shown with String = js.native
    }
    
    /**
      * Static method which allows you to get the tab instance associated with a
      * DOM element
      */
    /* static member */
    @JSImport("bootstrap/js/dist/tab", "default.getInstance")
    @js.native
    def getInstance(element: Element): Tab = js.native
  }
  
  @js.native
  trait Tab extends StObject {
    
    /**
      * Destroys an element’s tab.
      */
    def dispose(): Unit = js.native
    
    /**
      * Selects the given list item and shows its associated pane. Any other
      * list item that was previously selected becomes unselected and its
      * associated pane is hidden. Returns to the caller before the tab pane
      * has actually been shown (for example, before the shown.bs.tab event
      * occurs).
      */
    def show(): Unit = js.native
  }
  object Tab {
    
    @scala.inline
    def apply(dispose: () => Unit, show: () => Unit): Tab = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[Tab]
    }
    
    @js.native
    sealed trait Events extends StObject
    @JSImport("bootstrap/js/dist/tab", "Tab.Events")
    @js.native
    object Events extends StObject {
      
      /**
        * This event fires after a new tab is shown (and thus the previous
        * active tab is hidden). Use event.target and event.relatedTarget to
        * target the previous active tab and the new active tab, respectively.
        */
      @js.native
      sealed trait hidden extends Events
      
      /**
        * This event fires when a new tab is to be shown (and thus the previous
        * active tab is to be hidden). Use event.target and event.relatedTarget
        * to target the current active tab and the new soon-to-be-active tab,
        * respectively.
        */
      @js.native
      sealed trait hide extends Events
      
      /**
        * This event fires on tab show, but before the new tab has been shown.
        * Use event.target and event.relatedTarget to target the active tab and
        * the previous active tab (if available) respectively.
        */
      @js.native
      sealed trait show extends Events
      
      /**
        * This event fires on tab show after a tab has been shown. Use
        * event.target and event.relatedTarget to target the active tab and the
        * previous active tab (if available) respectively.
        */
      @js.native
      sealed trait shown extends Events
    }
    
    @scala.inline
    implicit class TabMutableBuilder[Self <: Tab] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
}
