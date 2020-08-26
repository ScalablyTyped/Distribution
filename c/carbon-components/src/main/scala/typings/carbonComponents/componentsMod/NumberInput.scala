package typings.carbonComponents.componentsMod

import typings.carbonComponents.anon.SelectorInit
import typings.carbonComponents.numberInputMod.default
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carbon-components/globals/js/components", "NumberInput")
@js.native
class NumberInput protected () extends default {
  def this(element: js.Any, options: js.Any) = this()
}

/* static members */
@JSImport("carbon-components/globals/js/components", "NumberInput")
@js.native
object NumberInput extends js.Object {
  var components: WeakMap[js.Object, _] = js.native
  def options: SelectorInit = js.native
}

