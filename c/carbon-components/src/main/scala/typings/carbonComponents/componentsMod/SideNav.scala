package typings.carbonComponents.componentsMod

import typings.carbonComponents.anon.PartialSideNavOptions
import typings.carbonComponents.sideNavMod.SideNavOptions
import typings.carbonComponents.sideNavMod.default
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components/globals/js/components", "SideNav")
@js.native
open class SideNav protected () extends default {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialSideNavOptions) = this()
}
object SideNav {
  
  @JSImport("carbon-components/globals/js/components", "SideNav")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components/globals/js/components", "SideNav.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("carbon-components/globals/js/components", "SideNav.options")
  @js.native
  def options: SideNavOptions = js.native
  inline def options_=(x: SideNavOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  
  /* static member */
  object state {
    
    @JSImport("carbon-components/globals/js/components", "SideNav.state")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components/globals/js/components", "SideNav.state.COLLAPSED")
    @js.native
    def COLLAPSED: String = js.native
    inline def COLLAPSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLLAPSED")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/components", "SideNav.state.EXPANDED")
    @js.native
    def EXPANDED: String = js.native
    inline def EXPANDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXPANDED")(x.asInstanceOf[js.Any])
  }
}
