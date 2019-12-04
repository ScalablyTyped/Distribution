package typings.baseui.layerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopperOffset extends js.Object {
  var left: js.UndefOr[Double | Null] = js.undefined
  var top: js.UndefOr[Double | Null] = js.undefined
}

object PopperOffset {
  @scala.inline
  def apply(left: Int | Double = null, top: Int | Double = null): PopperOffset = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopperOffset]
  }
}

