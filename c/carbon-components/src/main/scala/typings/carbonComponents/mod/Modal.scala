package typings.carbonComponents.mod

import typings.carbonComponents.anon.AttribInitTarget
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carbon-components", "Modal")
@js.native
class Modal protected ()
  extends typings.carbonComponents.componentsMod.Modal {
  def this(element: js.Any, options: js.Any) = this()
}

/* static members */
@JSImport("carbon-components", "Modal")
@js.native
object Modal extends js.Object {
  var components: WeakMap[js.Object, _] = js.native
  def options: AttribInitTarget = js.native
}

