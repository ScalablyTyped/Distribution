package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyrightControlOptions extends js.Object {
  var anchor: js.UndefOr[ControlAnchor] = js.undefined
  var offset: js.UndefOr[Size] = js.undefined
}

object CopyrightControlOptions {
  @scala.inline
  def apply(anchor: Int | Double = null, offset: Size = null): CopyrightControlOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[CopyrightControlOptions]
  }
}

