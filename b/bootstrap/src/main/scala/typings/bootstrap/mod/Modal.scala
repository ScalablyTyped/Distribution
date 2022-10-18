package typings.bootstrap.mod

import typings.bootstrap.anon.PartialOptionsBackdrop
import typings.bootstrap.jsDistBaseComponentMod.GetInstanceFactory
import typings.bootstrap.jsDistBaseComponentMod.GetOrCreateInstanceFactory
import typings.bootstrap.jsDistModalMod.Modal.Options
import typings.bootstrap.jsDistModalMod.Modal.jQueryInterface
import typings.bootstrap.jsDistModalMod.default
import typings.bootstrap.mod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap", "Modal")
@js.native
open class Modal protected () extends default {
  def this(element: String) = this()
  def this(element: Element) = this()
  def this(element: String, options: PartialOptionsBackdrop) = this()
  def this(element: Element, options: PartialOptionsBackdrop) = this()
}
object Modal {
  
  @JSImport("bootstrap", "Modal")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default settings of this plugin
    *
    * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
    */
  /* static member */
  @JSImport("bootstrap", "Modal.Default")
  @js.native
  def Default: Options = js.native
  inline def Default_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
  
  @JSImport("bootstrap", "Modal.Events")
  @js.native
  object Events extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.bootstrap.jsDistModalMod.Modal.Events & String] = js.native
    
    /* "hidden.bs.modal" */ val hidden: typings.bootstrap.jsDistModalMod.Modal.Events.hidden & String = js.native
    
    /* "hide.bs.modal" */ val hide: typings.bootstrap.jsDistModalMod.Modal.Events.hide & String = js.native
    
    /* "hidePrevented.bs.modal" */ val hidePrevented: typings.bootstrap.jsDistModalMod.Modal.Events.hidePrevented & String = js.native
    
    /* "show.bs.modal" */ val show: typings.bootstrap.jsDistModalMod.Modal.Events.show & String = js.native
    
    /* "shown.bs.modal" */ val shown: typings.bootstrap.jsDistModalMod.Modal.Events.shown & String = js.native
  }
  
  /**
    * Static method which allows you to get the modal instance associated with
    * a DOM element
    */
  /* static member */
  @JSImport("bootstrap", "Modal.getInstance")
  @js.native
  def getInstance: GetInstanceFactory[typings.bootstrap.jsDistModalMod.Modal] = js.native
  inline def getInstance_=(x: GetInstanceFactory[typings.bootstrap.jsDistModalMod.Modal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
  
  /**
    * Static method which allows you to get the modal instance associated with
    * a DOM element, or create a new one in case it wasn’t initialised
    */
  /* static member */
  @JSImport("bootstrap", "Modal.getOrCreateInstance")
  @js.native
  def getOrCreateInstance: GetOrCreateInstanceFactory[typings.bootstrap.jsDistModalMod.Modal, PartialOptionsBackdrop] = js.native
  inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[typings.bootstrap.jsDistModalMod.Modal, PartialOptionsBackdrop]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("bootstrap", "Modal.jQueryInterface")
  @js.native
  def jQueryInterface: typings.bootstrap.jsDistModalMod.Modal.jQueryInterface = js.native
  inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
}
