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
  def apply(left: js.UndefOr[Null | Double] = js.undefined, top: js.UndefOr[Null | Double] = js.undefined): PopperOffset = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopperOffset]
  }
}

