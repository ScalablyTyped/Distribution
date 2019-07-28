package typings.deku.dekuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component extends js.Object {
  var onCreate: js.UndefOr[js.Function1[/* model */ Model, _]] = js.undefined
  var onRemove: js.UndefOr[js.Function1[/* model */ Model, _]] = js.undefined
  var onUpdate: js.UndefOr[js.Function1[/* model */ Model, _]] = js.undefined
  def render(model: Model): VirtualElement
}

object Component {
  @scala.inline
  def apply(
    render: Model => VirtualElement,
    onCreate: /* model */ Model => _ = null,
    onRemove: /* model */ Model => _ = null,
    onUpdate: /* model */ Model => _ = null
  ): Component = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    if (onCreate != null) __obj.updateDynamic("onCreate")(js.Any.fromFunction1(onCreate))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    __obj.asInstanceOf[Component]
  }
}

