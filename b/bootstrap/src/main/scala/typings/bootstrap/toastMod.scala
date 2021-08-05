package typings.bootstrap

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastMod {
  
  @JSImport("bootstrap/js/dist/toast", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Toast {
    def this(element: Element) = this()
    
    /**
      * Destroys an element’s scrollspy.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * When using scrollspy in conjunction with adding or removing of
      * elements from the DOM, you’ll need to call the refresh method like
      * so:
      */
    /* CompleteClass */
    override def refresh(): Unit = js.native
  }
  object default {
    
    @JSImport("bootstrap/js/dist/toast", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bootstrap/js/dist/toast", "default.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.bootstrap.toastMod.Toast.Events & String] = js.native
      
      /* "hidden.bs.toast" */ val hidden: typings.bootstrap.toastMod.Toast.Events.hidden & String = js.native
      
      /* "hide.bs.toast" */ val hide: typings.bootstrap.toastMod.Toast.Events.hide & String = js.native
      
      /* "show.bs.toast" */ val show: typings.bootstrap.toastMod.Toast.Events.show & String = js.native
      
      /* "shown.bs.toast" */ val shown: typings.bootstrap.toastMod.Toast.Events.shown & String = js.native
    }
    
    /**
      * Static method which allows you to get the scrollspy instance associated
      * with a DOM element
      */
    /* static member */
    inline def getInstance(element: Element): Toast = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any]).asInstanceOf[Toast]
  }
  
  trait Toast extends StObject {
    
    /**
      * Destroys an element’s scrollspy.
      */
    def dispose(): Unit
    
    /**
      * When using scrollspy in conjunction with adding or removing of
      * elements from the DOM, you’ll need to call the refresh method like
      * so:
      */
    def refresh(): Unit
  }
  object Toast {
    
    inline def apply(dispose: () => Unit, refresh: () => Unit): Toast = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), refresh = js.Any.fromFunction0(refresh))
      __obj.asInstanceOf[Toast]
    }
    
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
        * @default 500
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
    
    extension [Self <: Toast](x: Self) {
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    }
  }
}
