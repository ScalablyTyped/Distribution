package typings
package baseuiLib.layerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopperOffset extends js.Object {
  var left: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var top: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object PopperOffset {
  @scala.inline
  def apply(left: scala.Int | scala.Double = null, top: scala.Int | scala.Double = null): PopperOffset = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopperOffset]
  }
}

