package typings.carbonComponents.componentsMod

import typings.carbonComponents.sideNavMod.default
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components/globals/js/components", "SideNav")
@js.native
class SideNav protected () extends default {
  def this(element: js.Any, options: js.Any) = this()
}
object SideNav {
  
  @JSImport("carbon-components/globals/js/components", "SideNav")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components/globals/js/components", "SideNav.components")
  @js.native
  def components: WeakMap[js.Object, js.Any] = js.native
  inline def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  
  /* static member */
  object options {
    
    @JSImport("carbon-components/globals/js/components", "SideNav.options")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components/globals/js/components", "SideNav.options.classSideNavExpanded")
    @js.native
    def classSideNavExpanded: String = js.native
    inline def classSideNavExpanded_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classSideNavExpanded")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/components", "SideNav.options.classSideNavItemActive")
    @js.native
    def classSideNavItemActive: String = js.native
    inline def classSideNavItemActive_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classSideNavItemActive")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/components", "SideNav.options.classSideNavLinkCurrent")
    @js.native
    def classSideNavLinkCurrent: String = js.native
    inline def classSideNavLinkCurrent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classSideNavLinkCurrent")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/components", "SideNav.options.selectorInit")
    @js.native
    def selectorInit: String = js.native
    inline def selectorInit_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorInit")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/components", "SideNav.options.selectorSideNavItem")
    @js.native
    def selectorSideNavItem: String = js.native
    inline def selectorSideNavItem_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorSideNavItem")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/components", "SideNav.options.selectorSideNavLink")
    @js.native
    def selectorSideNavLink: String = js.native
    
    @JSImport("carbon-components/globals/js/components", "SideNav.options.selectorSideNavLinkCurrent")
    @js.native
    def selectorSideNavLinkCurrent: String = js.native
    inline def selectorSideNavLinkCurrent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorSideNavLinkCurrent")(x.asInstanceOf[js.Any])
    
    inline def selectorSideNavLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorSideNavLink")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/components", "SideNav.options.selectorSideNavSubmenu")
    @js.native
    def selectorSideNavSubmenu: String = js.native
    inline def selectorSideNavSubmenu_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorSideNavSubmenu")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/components", "SideNav.options.selectorSideNavToggle")
    @js.native
    def selectorSideNavToggle: String = js.native
    inline def selectorSideNavToggle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorSideNavToggle")(x.asInstanceOf[js.Any])
  }
  
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
