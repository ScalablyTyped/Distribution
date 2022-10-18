package typings.bootstrap.mod

import typings.bootstrap.anon.PartialOptionsAnimation
import typings.bootstrap.jsDistBaseComponentMod.GetInstanceFactory
import typings.bootstrap.jsDistBaseComponentMod.GetOrCreateInstanceFactory
import typings.bootstrap.jsDistToastMod.Toast.Options
import typings.bootstrap.jsDistToastMod.Toast.jQueryInterface
import typings.bootstrap.jsDistToastMod.default
import typings.bootstrap.mod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap", "Toast")
@js.native
open class Toast protected () extends default {
  def this(element: String) = this()
  def this(element: Element) = this()
  def this(element: String, options: PartialOptionsAnimation) = this()
  def this(element: Element, options: PartialOptionsAnimation) = this()
}
object Toast {
  
  @JSImport("bootstrap", "Toast")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default settings of this plugin
    *
    * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
    */
  /* static member */
  @JSImport("bootstrap", "Toast.Default")
  @js.native
  def Default: Options = js.native
  inline def Default_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
  
  @JSImport("bootstrap", "Toast.Events")
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
  @JSImport("bootstrap", "Toast.getInstance")
  @js.native
  def getInstance: GetInstanceFactory[typings.bootstrap.jsDistToastMod.Toast] = js.native
  inline def getInstance_=(x: GetInstanceFactory[typings.bootstrap.jsDistToastMod.Toast]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
  
  /**
    * Static method which allows you to get the scrollspy instance associated with a
    * DOM element, or create a new one in case it wasn’t initialised
    */
  /* static member */
  @JSImport("bootstrap", "Toast.getOrCreateInstance")
  @js.native
  def getOrCreateInstance: GetOrCreateInstanceFactory[typings.bootstrap.jsDistToastMod.Toast, PartialOptionsAnimation] = js.native
  inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[typings.bootstrap.jsDistToastMod.Toast, PartialOptionsAnimation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("bootstrap", "Toast.jQueryInterface")
  @js.native
  def jQueryInterface: typings.bootstrap.jsDistToastMod.Toast.jQueryInterface = js.native
  inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
}
