package typings.bootstrap.mod

import typings.bootstrap.bootstrapStrings.alert
import typings.bootstrap.jsDistAlertMod.Alert.jQueryInterface
import typings.bootstrap.jsDistAlertMod.default
import typings.bootstrap.jsDistBaseComponentMod.ComponentOptions
import typings.bootstrap.jsDistBaseComponentMod.GetInstanceFactory
import typings.bootstrap.jsDistBaseComponentMod.GetOrCreateInstanceFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap", "Alert")
@js.native
open class Alert () extends default
object Alert {
  
  @JSImport("bootstrap", "Alert")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bootstrap", "Alert.Events")
  @js.native
  object Events extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.bootstrap.jsDistAlertMod.Alert.Events & String] = js.native
    
    /* "close.bs.alert" */ val close: typings.bootstrap.jsDistAlertMod.Alert.Events.close & String = js.native
    
    /* "closed.bs.alert" */ val closed: typings.bootstrap.jsDistAlertMod.Alert.Events.closed & String = js.native
  }
  
  /* static member */
  @JSImport("bootstrap", "Alert.NAME")
  @js.native
  def NAME: alert = js.native
  inline def NAME_=(x: alert): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Static method which allows you to get the alert instance associated to a
    * DOM element, you can use it like this: getInstance(alert)
    */
  /* static member */
  @JSImport("bootstrap", "Alert.getInstance")
  @js.native
  def getInstance: GetInstanceFactory[typings.bootstrap.jsDistAlertMod.Alert] = js.native
  inline def getInstance_=(x: GetInstanceFactory[typings.bootstrap.jsDistAlertMod.Alert]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
  
  /**
    * Static method which returns an alert instance associated to a DOM element
    *  or create a new one in case it wasn't initialised.
    * You can use it like this: bootstrap.Alert.getOrCreateInstance(element)
    */
  /* static member */
  @JSImport("bootstrap", "Alert.getOrCreateInstance")
  @js.native
  def getOrCreateInstance: GetOrCreateInstanceFactory[typings.bootstrap.jsDistAlertMod.Alert, ComponentOptions] = js.native
  inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[typings.bootstrap.jsDistAlertMod.Alert, ComponentOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("bootstrap", "Alert.jQueryInterface")
  @js.native
  def jQueryInterface: typings.bootstrap.jsDistAlertMod.Alert.jQueryInterface = js.native
  inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
}
