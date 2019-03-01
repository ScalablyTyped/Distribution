package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleControlOptions extends js.Object {
  var anchor: js.UndefOr[ControlAnchor] = js.undefined
  var offset: js.UndefOr[Size] = js.undefined
}

object ScaleControlOptions {
  @scala.inline
  def apply(anchor: js.UndefOr[ControlAnchor] = js.undefined, offset: Size = null): ScaleControlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anchor)) __obj.updateDynamic("anchor")(anchor)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[ScaleControlOptions]
  }
}

