package typings.bootstrap

import typings.bootstrap.baseComponentMod.ComponentOptions
import typings.bootstrap.baseComponentMod.GetInstanceFactory
import typings.bootstrap.baseComponentMod.GetOrCreateInstanceFactory
import typings.bootstrap.bootstrapStrings.dispose
import typings.bootstrap.bootstrapStrings.show
import typings.bootstrap.mod.global.JQuery
import typings.bootstrap.tabMod.Tab.jQueryInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabMod {
  
  @JSImport("bootstrap/js/dist/tab", JSImport.Default)
  @js.native
  open class default () extends Tab
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
    @JSImport("bootstrap/js/dist/tab", "default.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[Tab] = js.native
    inline def getInstance_=(x: GetInstanceFactory[Tab]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which allows you to get the tab instance associated with a
      * DOM element, or create a new one in case it wasn’t initialised
      */
    /* static member */
    @JSImport("bootstrap/js/dist/tab", "default.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[Tab, ComponentOptions] = js.native
    inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[Tab, ComponentOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("bootstrap/js/dist/tab", "default.jQueryInterface")
    @js.native
    def jQueryInterface: typings.bootstrap.tabMod.Tab.jQueryInterface = js.native
    inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Tab
    extends typings.bootstrap.baseComponentMod.default {
    
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
    
    type jQueryInterface = js.Function1[/* config */ js.UndefOr[show | dispose], JQuery]
  }
}
