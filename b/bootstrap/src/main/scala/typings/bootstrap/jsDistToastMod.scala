package typings.bootstrap

import typings.bootstrap.anon.PartialOptionsAnimation
import typings.bootstrap.bootstrapStrings.dispose
import typings.bootstrap.bootstrapStrings.hide
import typings.bootstrap.bootstrapStrings.show
import typings.bootstrap.jsDistBaseComponentMod.GetInstanceFactory
import typings.bootstrap.jsDistBaseComponentMod.GetOrCreateInstanceFactory
import typings.bootstrap.jsDistToastMod.Toast.Options
import typings.bootstrap.jsDistToastMod.Toast.jQueryInterface
import typings.bootstrap.mod.global.Element
import typings.bootstrap.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsDistToastMod {
  
  @JSImport("bootstrap/js/dist/toast", JSImport.Default)
  @js.native
  open class default protected () extends Toast {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: String, options: PartialOptionsAnimation) = this()
    def this(element: Element, options: PartialOptionsAnimation) = this()
  }
  object default {
    
    @JSImport("bootstrap/js/dist/toast", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default settings of this plugin
      *
      * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
      */
    /* static member */
    @JSImport("bootstrap/js/dist/toast", "default.Default")
    @js.native
    def Default: Options = js.native
    inline def Default_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap/js/dist/toast", "default.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.bootstrap.jsDistToastMod.Toast.Events & String] = js.native
      
      /* "hidden.bs.toast" */ val hidden: typings.bootstrap.jsDistToastMod.Toast.Events.hidden & String = js.native
      
      /* "hide.bs.toast" */ val hide: typings.bootstrap.jsDistToastMod.Toast.Events.hide & String = js.native
      
      /* "show.bs.toast" */ val show: typings.bootstrap.jsDistToastMod.Toast.Events.show & String = js.native
      
      /* "shown.bs.toast" */ val shown: typings.bootstrap.jsDistToastMod.Toast.Events.shown & String = js.native
    }
    
    /**
      * Static method which allows you to get the toast instance associated
      * with a DOM element
      */
    /* static member */
    @JSImport("bootstrap/js/dist/toast", "default.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[Toast] = js.native
    inline def getInstance_=(x: GetInstanceFactory[Toast]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which allows you to get the scrollspy instance associated with a
      * DOM element, or create a new one in case it wasn’t initialised
      */
    /* static member */
    @JSImport("bootstrap/js/dist/toast", "default.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[Toast, PartialOptionsAnimation] = js.native
    inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[Toast, PartialOptionsAnimation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("bootstrap/js/dist/toast", "default.jQueryInterface")
    @js.native
    def jQueryInterface: typings.bootstrap.jsDistToastMod.Toast.jQueryInterface = js.native
    inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Toast
    extends typings.bootstrap.jsDistBaseComponentMod.default {
    
    /**
      * Hides an element’s toast. Returns to the caller before the toast has actually
      * been hidden (i.e. before the hidden.bs.toast event occurs).
      * You have to manually call this method if you made autohide to false.
      */
    def hide(): Unit = js.native
    
    /**
      * Reveals an element’s toast. Returns to the caller before the toast has actually
      * been shown (i.e. before the shown.bs.toast event occurs).
      * You have to manually call this method, instead your toast won’t show.
      */
    def show(): Unit = js.native
  }
  object Toast {
    
    @js.native
    sealed trait Events extends StObject
    @JSImport("bootstrap/js/dist/toast", "Toast.Events")
    @js.native
    object Events extends StObject {
      
      /**
        * This event is fired when the toast has finished being hidden from the
        * user.
        */
      @js.native
      sealed trait hidden
        extends StObject
           with Events
      
      /**
        * This event is fired immediately when the hide instance method has
        * been called.
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
        * This event is fired when the toast has been made visible to the user.
        */
      @js.native
      sealed trait shown
        extends StObject
           with Events
    }
    
    trait Options extends StObject {
      
      /**
        * Apply a CSS fade transition to the toast
        *
        * @default true
        */
      var animation: Boolean
      
      /**
        * Auto hide the toast
        *
        * @default true
        */
      var autohide: Boolean
      
      /**
        * Delay hiding the toast (ms)
        *
        * @default 5000
        */
      var delay: Double
    }
    object Options {
      
      inline def apply(animation: Boolean, autohide: Boolean, delay: Double): Options = {
        val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], autohide = autohide.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
        
        inline def setAutohide(value: Boolean): Self = StObject.set(x, "autohide", value.asInstanceOf[js.Any])
        
        inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      }
    }
    
    type jQueryInterface = js.Function1[/* config */ js.UndefOr[PartialOptionsAnimation | show | hide | dispose], JQuery]
  }
}
