package typings.bootstrap.mod

import typings.bootstrap.anon.PartialOptionsMethod
import typings.bootstrap.baseComponentMod.GetInstanceFactory
import typings.bootstrap.baseComponentMod.GetOrCreateInstanceFactory
import typings.bootstrap.mod.global.Element
import typings.bootstrap.scrollspyMod.ScrollSpy.Options
import typings.bootstrap.scrollspyMod.ScrollSpy.jQueryInterface
import typings.bootstrap.scrollspyMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap", "ScrollSpy")
@js.native
open class ScrollSpy protected () extends default {
  def this(element: String) = this()
  def this(element: Element) = this()
  def this(element: String, options: PartialOptionsMethod) = this()
  def this(element: Element, options: PartialOptionsMethod) = this()
}
object ScrollSpy {
  
  @JSImport("bootstrap", "ScrollSpy")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default settings of this plugin
    *
    * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
    */
  /* static member */
  @JSImport("bootstrap", "ScrollSpy.Default")
  @js.native
  def Default: Options = js.native
  inline def Default_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
  
  @JSImport("bootstrap", "ScrollSpy.Events")
  @js.native
  object Events extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.bootstrap.scrollspyMod.ScrollSpy.Events & String] = js.native
    
    /* "activate.bs.scrollspy" */ val activate: typings.bootstrap.scrollspyMod.ScrollSpy.Events.activate & String = js.native
  }
  
  /**
    * Static method which allows you to get the scrollspy instance associated
    * with a DOM element
    */
  /* static member */
  @JSImport("bootstrap", "ScrollSpy.getInstance")
  @js.native
  def getInstance: GetInstanceFactory[typings.bootstrap.scrollspyMod.ScrollSpy] = js.native
  inline def getInstance_=(x: GetInstanceFactory[typings.bootstrap.scrollspyMod.ScrollSpy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
  
  /**
    * Static method which allows you to get the scrollspy instance associated with
    * a DOM element, or create a new one in case it wasn’t initialised
    */
  /* static member */
  @JSImport("bootstrap", "ScrollSpy.getOrCreateInstance")
  @js.native
  def getOrCreateInstance: GetOrCreateInstanceFactory[typings.bootstrap.scrollspyMod.ScrollSpy, PartialOptionsMethod] = js.native
  inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[typings.bootstrap.scrollspyMod.ScrollSpy, PartialOptionsMethod]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("bootstrap", "ScrollSpy.jQueryInterface")
  @js.native
  def jQueryInterface: typings.bootstrap.scrollspyMod.ScrollSpy.jQueryInterface = js.native
  inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
}
