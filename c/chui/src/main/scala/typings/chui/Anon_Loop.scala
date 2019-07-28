package typings.chui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Loop extends js.Object {
  var loop: js.UndefOr[Boolean] = js.undefined
  var pagination: js.UndefOr[Boolean] = js.undefined
  var panels: ChocolateChipElementArray
  var target: js.Any
}

object Anon_Loop {
  @scala.inline
  def apply(
    panels: ChocolateChipElementArray,
    target: js.Any,
    loop: js.UndefOr[Boolean] = js.undefined,
    pagination: js.UndefOr[Boolean] = js.undefined
  ): Anon_Loop = {
    val __obj = js.Dynamic.literal(panels = panels, target = target)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination)
    __obj.asInstanceOf[Anon_Loop]
  }
}

