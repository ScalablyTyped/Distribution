package typings.carbonComponents

import typings.std.Set
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object productSwitcherMod {
  
  @JSImport("carbon-components/components/ui-shell/product-switcher", JSImport.Default)
  @js.native
  class default protected () extends ProductSwitcher {
    def this(element: js.Any, options: js.Any) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/ui-shell/product-switcher", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/ui-shell/product-switcher", "default.SELECT_NONE")
    @js.native
    def SELECT_NONE: String = js.native
    @scala.inline
    def SELECT_NONE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECT_NONE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("carbon-components/components/ui-shell/product-switcher", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ProductSwitcher
    extends typings.carbonComponents.navigationMenuPanelMod.default {
    
    def _handleFocusOut(event: js.Any): Unit = js.native
    
    def _handleKeyDown(event: js.Any): Unit = js.native
    
    var current: String = js.native
    
    def release(): js.Any = js.native
    
    var triggerButtonIds: Set[_] = js.native
  }
}
