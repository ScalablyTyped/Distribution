package typings.bootstrap

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabMod {
  
  @JSImport("bootstrap/js/dist/tab", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Tab {
    def this(element: Element) = this()
    
    /**
      * Destroys an element’s tab.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Selects the given list item and shows its associated pane. Any other
      * list item that was previously selected becomes unselected and its
      * associated pane is hidden. Returns to the caller before the tab pane
      * has actually been shown (for example, before the shown.bs.tab event
      * occurs).
      */
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  object default {
    
    @JSImport("bootstrap/js/dist/tab", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bootstrap/js/dist/tab", "default.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.bootstrap.tabMod.Tab.Events & String] = js.native
      
      /* "hidden.bs.tab" */ val hidden: typings.bootstrap.tabMod.Tab.Events.hidden & String = js.native
      
      /* "hide.bs.tab" */ val hide: typings.bootstrap.tabMod.Tab.Events.hide & String = js.native
      
      /* "show.bs.tab" */ val show: typings.bootstrap.tabMod.Tab.Events.show & String = js.native
      
      /* "shown.bs.tab" */ val shown: typings.bootstrap.tabMod.Tab.Events.shown & String = js.native
    }
    
    /**
      * Static method which allows you to get the tab instance associated with a
      * DOM element
      */
    /* static member */
    inline def getInstance(element: Element): Tab = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any]).asInstanceOf[Tab]
  }
  
  trait Tab extends StObject {
    
    /**
      * Destroys an element’s tab.
      */
    def dispose(): Unit
    
    /**
      * Selects the given list item and shows its associated pane. Any other
      * list item that was previously selected becomes unselected and its
      * associated pane is hidden. Returns to the caller before the tab pane
      * has actually been shown (for example, before the shown.bs.tab event
      * occurs).
      */
    def show(): Unit
  }
  object Tab {
    
    inline def apply(dispose: () => Unit, show: () => Unit): Tab = {
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
      sealed trait hidden
        extends StObject
           with Events
      
      /**
        * This event fires when a new tab is to be shown (and thus the previous
        * active tab is to be hidden). Use event.target and event.relatedTarget
        * to target the current active tab and the new soon-to-be-active tab,
        * respectively.
        */
      @js.native
      sealed trait hide
        extends StObject
           with Events
      
      /**
        * This event fires on tab show, but before the new tab has been shown.
        * Use event.target and event.relatedTarget to target the active tab and
        * the previous active tab (if available) respectively.
        */
      @js.native
      sealed trait show
        extends StObject
           with Events
      
      /**
        * This event fires on tab show after a tab has been shown. Use
        * event.target and event.relatedTarget to target the active tab and the
        * previous active tab (if available) respectively.
        */
      @js.native
      sealed trait shown
        extends StObject
           with Events
    }
    
    extension [Self <: Tab](x: Self) {
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
}
