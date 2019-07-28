package typings.baidumapDashWebDashSdk.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverviewMapControlOptions extends js.Object {
  var anchor: js.UndefOr[ControlAnchor] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Size] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
}

object OverviewMapControlOptions {
  @scala.inline
  def apply(
    anchor: js.UndefOr[ControlAnchor] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    offset: Size = null,
    size: Size = null
  ): OverviewMapControlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anchor)) __obj.updateDynamic("anchor")(anchor)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[OverviewMapControlOptions]
  }
}

