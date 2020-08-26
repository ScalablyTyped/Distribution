package typings.carbonComponents.componentsMod

import typings.carbonComponents.anon.COLLAPSED
import typings.carbonComponents.anon.ClassSideNavExpanded
import typings.carbonComponents.sideNavMod.default
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carbon-components/globals/js/components", "SideNav")
@js.native
class SideNav protected () extends default {
  def this(element: js.Any, options: js.Any) = this()
}

/* static members */
@JSImport("carbon-components/globals/js/components", "SideNav")
@js.native
object SideNav extends js.Object {
  var components: WeakMap[js.Object, _] = js.native
  var options: ClassSideNavExpanded = js.native
  var state: COLLAPSED = js.native
}

