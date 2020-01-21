package typings.baseui

import typings.baseui.layerMod.PopperOffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArrow extends js.Object {
  var arrow: js.UndefOr[PopperOffset] = js.undefined
  var popper: PopperOffset
}

object AnonArrow {
  @scala.inline
  def apply(popper: PopperOffset, arrow: PopperOffset = null): AnonArrow = {
    val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any])
    if (arrow != null) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArrow]
  }
}

