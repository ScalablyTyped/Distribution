package typings.carbonComponents

import typings.carbonComponents.anon.BACKWARD
import typings.carbonComponents.anon.MatchesNavSubmenu
import typings.carbonComponents.anon.PartialNavigationMenuOpti
import typings.carbonComponents.componentsUiShellNavigationMenuPanelMod.NavigationMenuPanelOptions
import typings.std.Element
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsUiShellNavigationMenuMod {
  
  @JSImport("carbon-components/components/ui-shell/navigation-menu", JSImport.Default)
  @js.native
  open class default protected () extends NavigationMenu {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialNavigationMenuOpti) = this()
  }
  /* static members */
  object default {
    
    @JSImport("carbon-components/components/ui-shell/navigation-menu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components/components/ui-shell/navigation-menu", "default.NAVIGATE")
    @js.native
    def NAVIGATE: BACKWARD = js.native
    inline def NAVIGATE_=(x: BACKWARD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAVIGATE")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/components/ui-shell/navigation-menu", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait NavigationMenu
    extends typings.carbonComponents.componentsUiShellNavigationMenuPanelMod.default {
    
    def _handleClick(event: MouseEvent): Unit = js.native
    
    def _handleFocusOut(event: FocusEvent): Unit = js.native
    
    def _handleKeyDown(event: KeyboardEvent): Unit = js.native
    
    def changeNavSubmenuState(param0: MatchesNavSubmenu): Unit = js.native
    
    def getCurrentNavigation(): Element = js.native
    
    def navigate(direction: Double): Unit = js.native
  }
  
  trait NavigationMenuOptions
    extends StObject
       with NavigationMenuPanelOptions {
    
    var attribInitTarget: String
    
    var classShellNavCategoryExpanded: String
    
    var classShellNavItemActive: String
    
    var classShellNavLinkCurrent: String
    
    var selectorFocusableNavItems: String
    
    var selectorInit: String
    
    var selectorShellNavCategory: String
    
    var selectorShellNavItem: String
    
    var selectorShellNavLink: String
    
    var selectorShellNavLinkCurrent: String
    
    var selectorShellNavNestedCategory: String
    
    var selectorShellNavSubmenu: String
    
    var selectorShellNestedNavLink: String
  }
  object NavigationMenuOptions {
    
    inline def apply(
      attribInitTarget: String,
      attribLabelCollapse: String,
      attribLabelExpand: String,
      classNavigationMenuPanelHeaderActionActive: String,
      classShellNavCategoryExpanded: String,
      classShellNavItemActive: String,
      classShellNavLinkCurrent: String,
      eventAfterCollapsed: String,
      eventAfterExpanded: String,
      eventBeforeCollapsed: String,
      eventBeforeExpanded: String,
      initEventNames: js.Array[String],
      selectorFocusableMenuItem: String,
      selectorFocusableNavItems: String,
      selectorInit: String,
      selectorShellNavCategory: String,
      selectorShellNavItem: String,
      selectorShellNavLink: String,
      selectorShellNavLinkCurrent: String,
      selectorShellNavNestedCategory: String,
      selectorShellNavSubmenu: String,
      selectorShellNestedNavLink: String
    ): NavigationMenuOptions = {
      val __obj = js.Dynamic.literal(attribInitTarget = attribInitTarget.asInstanceOf[js.Any], attribLabelCollapse = attribLabelCollapse.asInstanceOf[js.Any], attribLabelExpand = attribLabelExpand.asInstanceOf[js.Any], classNavigationMenuPanelHeaderActionActive = classNavigationMenuPanelHeaderActionActive.asInstanceOf[js.Any], classShellNavCategoryExpanded = classShellNavCategoryExpanded.asInstanceOf[js.Any], classShellNavItemActive = classShellNavItemActive.asInstanceOf[js.Any], classShellNavLinkCurrent = classShellNavLinkCurrent.asInstanceOf[js.Any], eventAfterCollapsed = eventAfterCollapsed.asInstanceOf[js.Any], eventAfterExpanded = eventAfterExpanded.asInstanceOf[js.Any], eventBeforeCollapsed = eventBeforeCollapsed.asInstanceOf[js.Any], eventBeforeExpanded = eventBeforeExpanded.asInstanceOf[js.Any], initEventNames = initEventNames.asInstanceOf[js.Any], selectorFocusableMenuItem = selectorFocusableMenuItem.asInstanceOf[js.Any], selectorFocusableNavItems = selectorFocusableNavItems.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorShellNavCategory = selectorShellNavCategory.asInstanceOf[js.Any], selectorShellNavItem = selectorShellNavItem.asInstanceOf[js.Any], selectorShellNavLink = selectorShellNavLink.asInstanceOf[js.Any], selectorShellNavLinkCurrent = selectorShellNavLinkCurrent.asInstanceOf[js.Any], selectorShellNavNestedCategory = selectorShellNavNestedCategory.asInstanceOf[js.Any], selectorShellNavSubmenu = selectorShellNavSubmenu.asInstanceOf[js.Any], selectorShellNestedNavLink = selectorShellNestedNavLink.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationMenuOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationMenuOptions] (val x: Self) extends AnyVal {
      
      inline def setAttribInitTarget(value: String): Self = StObject.set(x, "attribInitTarget", value.asInstanceOf[js.Any])
      
      inline def setClassShellNavCategoryExpanded(value: String): Self = StObject.set(x, "classShellNavCategoryExpanded", value.asInstanceOf[js.Any])
      
      inline def setClassShellNavItemActive(value: String): Self = StObject.set(x, "classShellNavItemActive", value.asInstanceOf[js.Any])
      
      inline def setClassShellNavLinkCurrent(value: String): Self = StObject.set(x, "classShellNavLinkCurrent", value.asInstanceOf[js.Any])
      
      inline def setSelectorFocusableNavItems(value: String): Self = StObject.set(x, "selectorFocusableNavItems", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorShellNavCategory(value: String): Self = StObject.set(x, "selectorShellNavCategory", value.asInstanceOf[js.Any])
      
      inline def setSelectorShellNavItem(value: String): Self = StObject.set(x, "selectorShellNavItem", value.asInstanceOf[js.Any])
      
      inline def setSelectorShellNavLink(value: String): Self = StObject.set(x, "selectorShellNavLink", value.asInstanceOf[js.Any])
      
      inline def setSelectorShellNavLinkCurrent(value: String): Self = StObject.set(x, "selectorShellNavLinkCurrent", value.asInstanceOf[js.Any])
      
      inline def setSelectorShellNavNestedCategory(value: String): Self = StObject.set(x, "selectorShellNavNestedCategory", value.asInstanceOf[js.Any])
      
      inline def setSelectorShellNavSubmenu(value: String): Self = StObject.set(x, "selectorShellNavSubmenu", value.asInstanceOf[js.Any])
      
      inline def setSelectorShellNestedNavLink(value: String): Self = StObject.set(x, "selectorShellNestedNavLink", value.asInstanceOf[js.Any])
    }
  }
}
