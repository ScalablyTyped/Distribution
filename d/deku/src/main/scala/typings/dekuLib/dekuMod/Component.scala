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

object Component {
  @scala.inline
  def apply(
    render: js.Function1[Model, dekuLib.dekuMod.dekuNs.VirtualElement],
    onCreate: js.Function1[/* model */ Model, _] = null,
    onRemove: js.Function1[/* model */ Model, _] = null,
    onUpdate: js.Function1[/* model */ Model, _] = null
  ): Component = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("render")(render)
    if (onCreate != null) __obj.updateDynamic("onCreate")(onCreate)
    if (onRemove != null) __obj.updateDynamic("onRemove")(onRemove)
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate)
    __obj.asInstanceOf[Component]
  }
}

