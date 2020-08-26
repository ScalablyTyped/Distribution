package typings.carbonComponents.mod

import typings.carbonComponents.anon.COLLAPSED
import typings.carbonComponents.anon.ClassSideNavExpanded
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carbon-components", "SideNav")
@js.native
class SideNav protected ()
  extends typings.carbonComponents.componentsMod.SideNav {
  def this(element: js.Any, options: js.Any) = this()
}

/* static members */
@JSImport("carbon-components", "SideNav")
@js.native
object SideNav extends js.Object {
  var components: WeakMap[js.Object, _] = js.native
  var options: ClassSideNavExpanded = js.native
  var state: COLLAPSED = js.native
}

