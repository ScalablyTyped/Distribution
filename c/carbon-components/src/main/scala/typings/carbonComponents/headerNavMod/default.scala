package typings.carbonComponents.headerNavMod

import typings.carbonComponents.anon.BACKWARD
import typings.carbonComponents.anon.SelectorNavKind
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carbon-components/components/ui-shell/header-nav", JSImport.Default)
@js.native
class default protected () extends HeaderNav {
  def this(element: js.Any, options: js.Any) = this()
}

/* static members */
@JSImport("carbon-components/components/ui-shell/header-nav", JSImport.Default)
@js.native
object default extends js.Object {
  var NAVIGATE: BACKWARD = js.native
  var components: WeakMap[js.Object, _] = js.native
  def options: SelectorNavKind = js.native
}

