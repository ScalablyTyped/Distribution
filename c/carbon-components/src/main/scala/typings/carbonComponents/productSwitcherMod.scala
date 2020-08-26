package typings.carbonComponents

import typings.std.Set
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carbon-components/components/ui-shell/product-switcher", JSImport.Namespace)
@js.native
object productSwitcherMod extends js.Object {
  @js.native
  trait ProductSwitcher
    extends typings.carbonComponents.navigationMenuPanelMod.default {
    var current: String = js.native
    var triggerButtonIds: Set[_] = js.native
    def _handleFocusOut(event: js.Any): Unit = js.native
    def _handleKeyDown(event: js.Any): Unit = js.native
    def release(): js.Any = js.native
  }
  
  @js.native
  class default protected () extends ProductSwitcher {
    def this(element: js.Any, options: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var SELECT_NONE: String = js.native
    var components: WeakMap[js.Object, _] = js.native
    def options: js.Any = js.native
  }
  
}

