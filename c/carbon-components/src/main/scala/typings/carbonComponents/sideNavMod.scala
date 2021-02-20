package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sideNavMod {
  
  @JSImport("carbon-components/components/ui-shell/side-nav", JSImport.Default)
  @js.native
  class default protected () extends SideNav {
    def this(element: js.Any, options: js.Any) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/ui-shell/side-nav", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/ui-shell/side-nav", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
    
    /* static member */
    object options {
      
      @JSImport("carbon-components/components/ui-shell/side-nav", "default.options")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("carbon-components/components/ui-shell/side-nav", "default.options.classSideNavExpanded")
      @js.native
      def classSideNavExpanded: String = js.native
      @scala.inline
      def classSideNavExpanded_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classSideNavExpanded")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/ui-shell/side-nav", "default.options.classSideNavItemActive")
      @js.native
      def classSideNavItemActive: String = js.native
      @scala.inline
      def classSideNavItemActive_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classSideNavItemActive")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/ui-shell/side-nav", "default.options.classSideNavLinkCurrent")
      @js.native
      def classSideNavLinkCurrent: String = js.native
      @scala.inline
      def classSideNavLinkCurrent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classSideNavLinkCurrent")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/ui-shell/side-nav", "default.options.selectorInit")
      @js.native
      def selectorInit: String = js.native
      @scala.inline
      def selectorInit_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorInit")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/ui-shell/side-nav", "default.options.selectorSideNavItem")
      @js.native
      def selectorSideNavItem: String = js.native
      @scala.inline
      def selectorSideNavItem_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorSideNavItem")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/ui-shell/side-nav", "default.options.selectorSideNavLink")
      @js.native
      def selectorSideNavLink: String = js.native
      
      @JSImport("carbon-components/components/ui-shell/side-nav", "default.options.selectorSideNavLinkCurrent")
      @js.native
      def selectorSideNavLinkCurrent: String = js.native
      @scala.inline
      def selectorSideNavLinkCurrent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorSideNavLinkCurrent")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def selectorSideNavLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorSideNavLink")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/ui-shell/side-nav", "default.options.selectorSideNavSubmenu")
      @js.native
      def selectorSideNavSubmenu: String = js.native
      @scala.inline
      def selectorSideNavSubmenu_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorSideNavSubmenu")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/ui-shell/side-nav", "default.options.selectorSideNavToggle")
      @js.native
      def selectorSideNavToggle: String = js.native
      @scala.inline
      def selectorSideNavToggle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorSideNavToggle")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    object state {
      
      @JSImport("carbon-components/components/ui-shell/side-nav", "default.state")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("carbon-components/components/ui-shell/side-nav", "default.state.COLLAPSED")
      @js.native
      def COLLAPSED: String = js.native
      @scala.inline
      def COLLAPSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLLAPSED")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/ui-shell/side-nav", "default.state.EXPANDED")
      @js.native
      def EXPANDED: String = js.native
      @scala.inline
      def EXPANDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXPANDED")(x.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait SideNav extends StObject {
    
    def _handleClick(evt: js.Any): Unit = js.native
    
    def changeState(state: js.Any): Unit = js.native
    
    def isNavExpanded(): js.Any = js.native
  }
  object SideNav {
    
    @scala.inline
    def apply(_handleClick: js.Any => Unit, changeState: js.Any => Unit, isNavExpanded: () => js.Any): SideNav = {
      val __obj = js.Dynamic.literal(_handleClick = js.Any.fromFunction1(_handleClick), changeState = js.Any.fromFunction1(changeState), isNavExpanded = js.Any.fromFunction0(isNavExpanded))
      __obj.asInstanceOf[SideNav]
    }
    
    @scala.inline
    implicit class SideNavMutableBuilder[Self <: SideNav] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangeState(value: js.Any => Unit): Self = StObject.set(x, "changeState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsNavExpanded(value: () => js.Any): Self = StObject.set(x, "isNavExpanded", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_handleClick(value: js.Any => Unit): Self = StObject.set(x, "_handleClick", js.Any.fromFunction1(value))
    }
  }
}
