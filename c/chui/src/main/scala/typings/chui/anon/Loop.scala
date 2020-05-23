package typings.chui.anon

import typings.chui.ChocolateChipElementArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loop extends js.Object {
  var loop: js.UndefOr[Boolean] = js.undefined
  var pagination: js.UndefOr[Boolean] = js.undefined
  var panels: ChocolateChipElementArray
  var target: js.Any
}

object Loop {
  @scala.inline
  def apply(
    panels: ChocolateChipElementArray,
    target: js.Any,
    loop: js.UndefOr[Boolean] = js.undefined,
    pagination: js.UndefOr[Boolean] = js.undefined
  ): Loop = {
    val __obj = js.Dynamic.literal(panels = panels.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loop]
  }
}

