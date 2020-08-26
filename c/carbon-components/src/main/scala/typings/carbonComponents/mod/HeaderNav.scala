package typings.carbonComponents.mod

import typings.carbonComponents.anon.BACKWARD
import typings.carbonComponents.anon.SelectorNavKind
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carbon-components", "HeaderNav")
@js.native
class HeaderNav protected ()
  extends typings.carbonComponents.componentsMod.HeaderNav {
  def this(element: js.Any, options: js.Any) = this()
}

/* static members */
@JSImport("carbon-components", "HeaderNav")
@js.native
object HeaderNav extends js.Object {
  var NAVIGATE: BACKWARD = js.native
  var components: WeakMap[js.Object, _] = js.native
  def options: SelectorNavKind = js.native
}

