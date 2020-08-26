package typings.carbonComponents.componentsMod

import typings.carbonComponents.anon.BACKWARD
import typings.carbonComponents.anon.ClassDisabled
import typings.carbonComponents.dropdownMod.default
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carbon-components/globals/js/components", "Dropdown")
@js.native
class Dropdown protected () extends default {
  def this(element: js.Any, options: js.Any) = this()
}

/* static members */
@JSImport("carbon-components/globals/js/components", "Dropdown")
@js.native
object Dropdown extends js.Object {
  var NAVIGATE: BACKWARD = js.native
  var components: WeakMap[js.Object, _] = js.native
  def options: ClassDisabled = js.native
}

