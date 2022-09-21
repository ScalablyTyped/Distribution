package typings.bootstrap.mod

import typings.bootstrap.anon.PartialOptionsParent
import typings.bootstrap.baseComponentMod.GetInstanceFactory
import typings.bootstrap.baseComponentMod.GetOrCreateInstanceFactory
import typings.bootstrap.collapseMod.Collapse.Options
import typings.bootstrap.collapseMod.Collapse.jQueryInterface
import typings.bootstrap.collapseMod.default
import typings.bootstrap.mod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap", "Collapse")
@js.native
open class Collapse protected () extends default {
  def this(element: String) = this()
  def this(element: Element) = this()
  def this(element: String, options: PartialOptionsParent) = this()
  def this(element: Element, options: PartialOptionsParent) = this()
}
object Collapse {
  
  @JSImport("bootstrap", "Collapse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default settings of this plugin
    *
    * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
    */
  /* static member */
  @JSImport("bootstrap", "Collapse.Default")
  @js.native
  def Default: Options = js.native
  inline def Default_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
  
  @JSImport("bootstrap", "Collapse.Events")
  @js.native
  object Events extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.bootstrap.collapseMod.Collapse.Events & String] = js.native
    
    /* "hidden.bs.collapse" */ val hidden: typings.bootstrap.collapseMod.Collapse.Events.hidden & String = js.native
    
    /* "hide.bs.collapse" */ val hide: typings.bootstrap.collapseMod.Collapse.Events.hide & String = js.native
    
    /* "show.bs.collapse" */ val show: typings.bootstrap.collapseMod.Collapse.Events.show & String = js.native
    
    /* "shown.bs.collapse" */ val shown: typings.bootstrap.collapseMod.Collapse.Events.shown & String = js.native
  }
  
  /**
    * Static method which allows you to get the collapse instance associated
    * with a DOM element.
    */
  /* static member */
  @JSImport("bootstrap", "Collapse.getInstance")
  @js.native
  def getInstance: GetInstanceFactory[typings.bootstrap.collapseMod.Collapse] = js.native
  inline def getInstance_=(x: GetInstanceFactory[typings.bootstrap.collapseMod.Collapse]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
  
  /**
    * Static method which returns a collapse instance associated to a DOM element
    *  or create a new one in case it wasn't initialised.
    * You can use it like this: bootstrap.Collapse.getOrCreateInstance(element)
    */
  /* static member */
  @JSImport("bootstrap", "Collapse.getOrCreateInstance")
  @js.native
  def getOrCreateInstance: GetOrCreateInstanceFactory[typings.bootstrap.collapseMod.Collapse, PartialOptionsParent] = js.native
  inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[typings.bootstrap.collapseMod.Collapse, PartialOptionsParent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("bootstrap", "Collapse.jQueryInterface")
  @js.native
  def jQueryInterface: typings.bootstrap.collapseMod.Collapse.jQueryInterface = js.native
  inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
}
