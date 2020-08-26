package typings.carbonComponents.componentsMod

import typings.carbonComponents.anon.EventAfterSelected
import typings.carbonComponents.contentSwitcherMod.default
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carbon-components/globals/js/components", "ContentSwitcher")
@js.native
class ContentSwitcher protected () extends default {
  def this(element: js.Any, options: js.Any) = this()
}

/* static members */
@JSImport("carbon-components/globals/js/components", "ContentSwitcher")
@js.native
object ContentSwitcher extends js.Object {
  var components: WeakMap[js.Object, _] = js.native
  def options: EventAfterSelected = js.native
}

