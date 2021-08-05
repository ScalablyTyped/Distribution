package typings.carbonComponents

import typings.carbonComponents.anon.BACKWARD
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationMenuMod {
  
  @JSImport("carbon-components/components/ui-shell/navigation-menu", JSImport.Default)
  @js.native
  class default protected () extends NavigationMenu {
    def this(element: js.Any, options: js.Any) = this()
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
    def components: WeakMap[js.Object, js.Any] = js.native
    inline def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait NavigationMenu
    extends typings.carbonComponents.navigationMenuPanelMod.default {
    
    def _handleClick(event: js.Any): Unit = js.native
    
    def _handleFocusOut(event: js.Any): Unit = js.native
    
    def _handleKeyDown(event: js.Any): Unit = js.native
    
    def changeNavSubmenuState(hasMatchesNavSubmenuShouldBeCollapsed: js.Any): Unit = js.native
    
    def getCurrentNavigation(): js.Any = js.native
    
    def navigate(direction: js.Any): Unit = js.native
  }
}
