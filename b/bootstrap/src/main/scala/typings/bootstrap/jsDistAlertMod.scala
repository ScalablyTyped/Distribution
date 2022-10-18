package typings.bootstrap

import typings.bootstrap.bootstrapStrings.alert
import typings.bootstrap.bootstrapStrings.close
import typings.bootstrap.bootstrapStrings.dispose
import typings.bootstrap.jsDistAlertMod.Alert.jQueryInterface
import typings.bootstrap.jsDistBaseComponentMod.ComponentOptions
import typings.bootstrap.jsDistBaseComponentMod.GetInstanceFactory
import typings.bootstrap.jsDistBaseComponentMod.GetOrCreateInstanceFactory
import typings.bootstrap.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsDistAlertMod {
  
  @JSImport("bootstrap/js/dist/alert", JSImport.Default)
  @js.native
  open class default () extends Alert
  object default {
    
    @JSImport("bootstrap/js/dist/alert", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bootstrap/js/dist/alert", "default.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.bootstrap.jsDistAlertMod.Alert.Events & String] = js.native
      
      /* "close.bs.alert" */ val close: typings.bootstrap.jsDistAlertMod.Alert.Events.close & String = js.native
      
      /* "closed.bs.alert" */ val closed: typings.bootstrap.jsDistAlertMod.Alert.Events.closed & String = js.native
    }
    
    /* static member */
    @JSImport("bootstrap/js/dist/alert", "default.NAME")
    @js.native
    def NAME: alert = js.native
    inline def NAME_=(x: alert): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which allows you to get the alert instance associated to a
      * DOM element, you can use it like this: getInstance(alert)
      */
    /* static member */
    @JSImport("bootstrap/js/dist/alert", "default.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[Alert] = js.native
    inline def getInstance_=(x: GetInstanceFactory[Alert]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which returns an alert instance associated to a DOM element
      *  or create a new one in case it wasn't initialised.
      * You can use it like this: bootstrap.Alert.getOrCreateInstance(element)
      */
    /* static member */
    @JSImport("bootstrap/js/dist/alert", "default.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[Alert, ComponentOptions] = js.native
    inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[Alert, ComponentOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("bootstrap/js/dist/alert", "default.jQueryInterface")
    @js.native
    def jQueryInterface: typings.bootstrap.jsDistAlertMod.Alert.jQueryInterface = js.native
    inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Alert
    extends typings.bootstrap.jsDistBaseComponentMod.default {
    
    /**
      * Closes an alert by removing it from the DOM. If the .fade and .show
      * classes are present on the element, the alert will fade out before it
      * is removed.
      */
    def close(): Unit = js.native
  }
  object Alert {
    
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
    
    type jQueryInterface = js.Function1[/* config */ js.UndefOr[close | dispose], JQuery]
  }
}
