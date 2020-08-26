package typings.carbonComponents.componentsMod

import typings.carbonComponents.anon.AttribInitTarget
import typings.carbonComponents.modalMod.default
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carbon-components/globals/js/components", "Modal")
@js.native
class Modal protected () extends default {
  def this(element: js.Any, options: js.Any) = this()
}

/* static members */
@JSImport("carbon-components/globals/js/components", "Modal")
@js.native
object Modal extends js.Object {
  var components: WeakMap[js.Object, _] = js.native
  def options: AttribInitTarget = js.native
}

