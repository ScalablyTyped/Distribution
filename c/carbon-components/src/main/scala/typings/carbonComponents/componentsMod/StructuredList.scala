package typings.carbonComponents.componentsMod

import typings.carbonComponents.anon.SelectorListInput
import typings.carbonComponents.structuredListMod.default
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carbon-components/globals/js/components", "StructuredList")
@js.native
class StructuredList protected () extends default {
  def this(element: js.Any, options: js.Any) = this()
}

/* static members */
@JSImport("carbon-components/globals/js/components", "StructuredList")
@js.native
object StructuredList extends js.Object {
  var components: WeakMap[js.Object, _] = js.native
  def options: SelectorListInput = js.native
}

