package typings.bootstrap

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertMod {
  
  @JSImport("bootstrap/js/dist/alert", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Alert {
    def this(element: Element) = this()
    
    /**
      * Closes an alert by removing it from the DOM. If the .fade and .show
      * classes are present on the element, the alert will fade out before it
      * is removed.
      */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * Destroys an element's alert.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  object default {
    
    @JSImport("bootstrap/js/dist/alert", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bootstrap/js/dist/alert", "default.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.bootstrap.alertMod.Alert.Events & String] = js.native
      
      /* "close.bs.alert" */ val close: typings.bootstrap.alertMod.Alert.Events.close & String = js.native
      
      /* "closed.bs.alert" */ val closed: typings.bootstrap.alertMod.Alert.Events.closed & String = js.native
    }
    
    /**
      * Static method which allows you to get the alert instance associated to a
      * DOM element, you can use it like this: getInstance(alert)
      */
    /* static member */
    @scala.inline
    def getInstance(element: Element): Alert = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any]).asInstanceOf[Alert]
  }
  
  trait Alert extends StObject {
    
    /**
      * Closes an alert by removing it from the DOM. If the .fade and .show
      * classes are present on the element, the alert will fade out before it
      * is removed.
      */
    def close(): Unit
    
    /**
      * Destroys an element's alert.
      */
    def dispose(): Unit
  }
  object Alert {
    
    @scala.inline
    def apply(close: () => Unit, dispose: () => Unit): Alert = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), dispose = js.Any.fromFunction0(dispose))
      __obj.asInstanceOf[Alert]
    }
    
    @js.native
    sealed trait Events extends StObject
    @JSImport("bootstrap/js/dist/alert", "Alert.Events")
    @js.native
    object Events extends StObject {
      
      /**
        * Fires immediately when the close instance method is called.
        */
      @js.native
      sealed trait close
        extends StObject
           with Events
      
      /**
        * Fired when the alert has been closed and CSS transitions have
        * completed.
        */
      @js.native
      sealed trait closed
        extends StObject
           with Events
    }
    
    @scala.inline
    implicit class AlertMutableBuilder[Self <: Alert] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
}
