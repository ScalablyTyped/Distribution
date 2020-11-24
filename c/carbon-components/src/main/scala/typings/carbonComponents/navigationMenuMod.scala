package typings.carbonComponents

import typings.carbonComponents.anon.BACKWARD
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components/components/ui-shell/navigation-menu", JSImport.Namespace)
@js.native
object navigationMenuMod extends js.Object {
  
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
  
  @js.native
  class default protected () extends NavigationMenu {
    def this(element: js.Any, options: js.Any) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var NAVIGATE: BACKWARD = js.native
    
    var components: WeakMap[js.Object, _] = js.native
    
    def options: js.Any = js.native
  }
}
