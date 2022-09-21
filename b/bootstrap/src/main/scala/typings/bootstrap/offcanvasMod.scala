package typings.bootstrap

import typings.bootstrap.anon.PartialOptionsKeyboard
import typings.bootstrap.baseComponentMod.GetInstanceFactory
import typings.bootstrap.baseComponentMod.GetOrCreateInstanceFactory
import typings.bootstrap.bootstrapStrings.hide
import typings.bootstrap.bootstrapStrings.show
import typings.bootstrap.bootstrapStrings.toggle
import typings.bootstrap.mod.global.Element
import typings.bootstrap.mod.global.JQuery
import typings.bootstrap.offcanvasMod.Offcanvas.jQueryInterface
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object offcanvasMod {
  
  @JSImport("bootstrap/js/dist/offcanvas", JSImport.Default)
  @js.native
  open class default protected () extends Offcanvas {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: String, options: PartialOptionsKeyboard) = this()
    def this(element: Element, options: PartialOptionsKeyboard) = this()
  }
  object default {
    
    @JSImport("bootstrap/js/dist/offcanvas", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bootstrap/js/dist/offcanvas", "default.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.bootstrap.offcanvasMod.Offcanvas.Events & String] = js.native
      
      /* "hidden.bs.offcanvas" */ val hidden: typings.bootstrap.offcanvasMod.Offcanvas.Events.hidden & String = js.native
      
      /* "hide.bs.offcanvas" */ val hide: typings.bootstrap.offcanvasMod.Offcanvas.Events.hide & String = js.native
      
      /* "show.bs.offcanvas" */ val show: typings.bootstrap.offcanvasMod.Offcanvas.Events.show & String = js.native
      
      /* "shown.bs.offcanvas" */ val shown: typings.bootstrap.offcanvasMod.Offcanvas.Events.shown & String = js.native
    }
    
    /**
      * Static method which allows you to get the offcanvas instance associated with a DOM element
      */
    /* static member */
    @JSImport("bootstrap/js/dist/offcanvas", "default.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[Offcanvas] = js.native
    inline def getInstance_=(x: GetInstanceFactory[Offcanvas]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which allows you to get the offcanvas instance associated with
      *  a DOM element, or create a new one in case it wasn’t initialised
      */
    /* static member */
    @JSImport("bootstrap/js/dist/offcanvas", "default.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[Offcanvas, PartialOptionsKeyboard] = js.native
    inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[Offcanvas, PartialOptionsKeyboard]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("bootstrap/js/dist/offcanvas", "default.jQueryInterface")
    @js.native
    def jQueryInterface: typings.bootstrap.offcanvasMod.Offcanvas.jQueryInterface = js.native
    inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Offcanvas
    extends typings.bootstrap.baseComponentMod.default {
    
    /**
      * Hides an offcanvas element. Returns to the caller before the offcanvas element has actually been hidden
      * (i.e. before the hidden.bs.offcanvas event occurs).
      */
    def hide(): Unit = js.native
    
    /**
      * Shows an offcanvas element. Returns to the caller before the offcanvas element has actually been shown
      * (i.e. before the shown.bs.offcanvas event occurs).
      */
    def show(): Unit = js.native
    def show(relatedTarget: HTMLElement): Unit = js.native
    
    /**
      * Toggles an offcanvas element to shown or hidden. Returns to the caller before the offcanvas element has actually
      * been shown or hidden (i.e. before the shown.bs.offcanvas or hidden.bs.offcanvas event occurs).
      */
    def toggle(): Unit = js.native
    def toggle(relatedTarget: HTMLElement): Unit = js.native
  }
  object Offcanvas {
    
    @js.native
    sealed trait Events extends StObject
    @JSImport("bootstrap/js/dist/offcanvas", "Offcanvas.Events")
    @js.native
    object Events extends StObject {
      
      /**
        * This event is fired when an offcanvas element has been hidden from the user (will wait for CSS transitions to complete).
        */
      @js.native
      sealed trait hidden
        extends StObject
           with Events
      
      /**
        * This event is fired immediately when the hide method has been called.
        */
      @js.native
      sealed trait hide
        extends StObject
           with Events
      
      /**
        * This event fires immediately when the show instance method is called.
        */
      @js.native
      sealed trait show
        extends StObject
           with Events
      
      /**
        * This event is fired when an offcanvas element has been made visible to the user (will wait for CSS transitions to complete).
        */
      @js.native
      sealed trait shown
        extends StObject
           with Events
    }
    
    trait Options extends StObject {
      
      /**
        * Apply a backdrop on body while offcanvas is open
        *
        * @default true
        */
      var backdrop: Boolean
      
      /**
        * Closes the offcanvas when escape key is pressed
        *
        * @default true
        */
      var keyboard: Boolean
      
      /**
        * Allow body scrolling while offcanvas is open
        *
        * @default false
        */
      var scroll: Boolean
    }
    object Options {
      
      inline def apply(backdrop: Boolean, keyboard: Boolean, scroll: Boolean): Options = {
        val __obj = js.Dynamic.literal(backdrop = backdrop.asInstanceOf[js.Any], keyboard = keyboard.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setBackdrop(value: Boolean): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
        
        inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
        
        inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      }
    }
    
    type jQueryInterface = js.Function1[/* config */ js.UndefOr[toggle | show | hide], JQuery]
  }
}
