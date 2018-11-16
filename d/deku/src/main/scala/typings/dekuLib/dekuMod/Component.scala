package typings
package dekuLib.dekuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Component extends js.Object {
  var onCreate: js.UndefOr[js.Function1[/* model */ Model, _]] = js.undefined
  var onRemove: js.UndefOr[js.Function1[/* model */ Model, _]] = js.undefined
  var onUpdate: js.UndefOr[js.Function1[/* model */ Model, _]] = js.undefined
  def render(model: Model): dekuLib.dekuMod.dekuNs.VirtualElement
}

