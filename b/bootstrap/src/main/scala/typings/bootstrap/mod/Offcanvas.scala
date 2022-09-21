package typings.bootstrap.mod

import typings.bootstrap.anon.PartialOptionsKeyboard
import typings.bootstrap.baseComponentMod.GetInstanceFactory
import typings.bootstrap.baseComponentMod.GetOrCreateInstanceFactory
import typings.bootstrap.mod.global.Element
import typings.bootstrap.offcanvasMod.Offcanvas.jQueryInterface
import typings.bootstrap.offcanvasMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap", "Offcanvas")
@js.native
open class Offcanvas protected () extends default {
  def this(element: String) = this()
  def this(element: Element) = this()
  def this(element: String, options: PartialOptionsKeyboard) = this()
  def this(element: Element, options: PartialOptionsKeyboard) = this()
}
object Offcanvas {
  
  @JSImport("bootstrap", "Offcanvas")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bootstrap", "Offcanvas.Events")
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
  @JSImport("bootstrap", "Offcanvas.getInstance")
  @js.native
  def getInstance: GetInstanceFactory[typings.bootstrap.offcanvasMod.Offcanvas] = js.native
  inline def getInstance_=(x: GetInstanceFactory[typings.bootstrap.offcanvasMod.Offcanvas]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
  
  /**
    * Static method which allows you to get the offcanvas instance associated with
    *  a DOM element, or create a new one in case it wasn’t initialised
    */
  /* static member */
  @JSImport("bootstrap", "Offcanvas.getOrCreateInstance")
  @js.native
  def getOrCreateInstance: GetOrCreateInstanceFactory[typings.bootstrap.offcanvasMod.Offcanvas, PartialOptionsKeyboard] = js.native
  inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[typings.bootstrap.offcanvasMod.Offcanvas, PartialOptionsKeyboard]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("bootstrap", "Offcanvas.jQueryInterface")
  @js.native
  def jQueryInterface: typings.bootstrap.offcanvasMod.Offcanvas.jQueryInterface = js.native
  inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
}
