package typings.carbonComponents

import typings.carbonComponents.anon.PartialProductSwitcherOpt
import typings.carbonComponents.navigationMenuPanelMod.NavigationMenuPanelOptions
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.Set
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object productSwitcherMod {
  
  @JSImport("carbon-components/components/ui-shell/product-switcher", JSImport.Default)
  @js.native
  open class default protected () extends ProductSwitcher {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialProductSwitcherOpt) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/ui-shell/product-switcher", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/ui-shell/product-switcher", "default.SELECT_NONE")
    @js.native
    def SELECT_NONE: String = js.native
    inline def SELECT_NONE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECT_NONE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("carbon-components/components/ui-shell/product-switcher", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ProductSwitcher
    extends typings.carbonComponents.navigationMenuPanelMod.default {
    
    def _changeState(state: Any, callback: Any): Unit = js.native
    
    def _handleFocusOut(event: FocusEvent): Unit = js.native
    
    def _handleKeyDown(event: KeyboardEvent): Unit = js.native
    
    def createdByLauncher(event: Any): Unit = js.native
    
    var current: String = js.native
    
    def release(): Any = js.native
    
    def shouldStateBeChanged(current: Any): Boolean = js.native
    
    var triggerButtonIds: Set[Any] = js.native
  }
  
  trait ProductSwitcherOptions
    extends StObject
       with NavigationMenuPanelOptions {
    
    var attribInitTarget: String
    
    var classProductSwitcherExpanded: String
    
    var selectorFloatingMenus: String
    
    var selectorInit: String
  }
  object ProductSwitcherOptions {
    
    inline def apply(
      attribInitTarget: String,
      attribLabelCollapse: String,
      attribLabelExpand: String,
      classNavigationMenuPanelHeaderActionActive: String,
      classProductSwitcherExpanded: String,
      eventAfterCollapsed: String,
      eventAfterExpanded: String,
      eventBeforeCollapsed: String,
      eventBeforeExpanded: String,
      initEventNames: js.Array[String],
      selectorFloatingMenus: String,
      selectorFocusableMenuItem: String,
      selectorInit: String
    ): ProductSwitcherOptions = {
      val __obj = js.Dynamic.literal(attribInitTarget = attribInitTarget.asInstanceOf[js.Any], attribLabelCollapse = attribLabelCollapse.asInstanceOf[js.Any], attribLabelExpand = attribLabelExpand.asInstanceOf[js.Any], classNavigationMenuPanelHeaderActionActive = classNavigationMenuPanelHeaderActionActive.asInstanceOf[js.Any], classProductSwitcherExpanded = classProductSwitcherExpanded.asInstanceOf[js.Any], eventAfterCollapsed = eventAfterCollapsed.asInstanceOf[js.Any], eventAfterExpanded = eventAfterExpanded.asInstanceOf[js.Any], eventBeforeCollapsed = eventBeforeCollapsed.asInstanceOf[js.Any], eventBeforeExpanded = eventBeforeExpanded.asInstanceOf[js.Any], initEventNames = initEventNames.asInstanceOf[js.Any], selectorFloatingMenus = selectorFloatingMenus.asInstanceOf[js.Any], selectorFocusableMenuItem = selectorFocusableMenuItem.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProductSwitcherOptions]
    }
    
    extension [Self <: ProductSwitcherOptions](x: Self) {
      
      inline def setAttribInitTarget(value: String): Self = StObject.set(x, "attribInitTarget", value.asInstanceOf[js.Any])
      
      inline def setClassProductSwitcherExpanded(value: String): Self = StObject.set(x, "classProductSwitcherExpanded", value.asInstanceOf[js.Any])
      
      inline def setSelectorFloatingMenus(value: String): Self = StObject.set(x, "selectorFloatingMenus", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    }
  }
}
