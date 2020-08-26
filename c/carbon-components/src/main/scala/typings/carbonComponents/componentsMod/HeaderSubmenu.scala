package typings.carbonComponents.componentsMod

import typings.carbonComponents.anon.AttribExpanded
import typings.carbonComponents.anon.BACKWARD
import typings.carbonComponents.anon.CLOSESUBMENU
import typings.carbonComponents.headerSubmenuMod.default
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carbon-components/globals/js/components", "HeaderSubmenu")
@js.native
class HeaderSubmenu protected () extends default {
  def this(element: js.Any, options: js.Any) = this()
}

/* static members */
@JSImport("carbon-components/globals/js/components", "HeaderSubmenu")
@js.native
object HeaderSubmenu extends js.Object {
  var NAVIGATE: BACKWARD = js.native
  var actions: CLOSESUBMENU = js.native
  var components: WeakMap[js.Object, _] = js.native
  def options: AttribExpanded = js.native
}

