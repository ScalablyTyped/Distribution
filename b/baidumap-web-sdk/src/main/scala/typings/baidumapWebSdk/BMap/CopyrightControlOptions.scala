package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyrightControlOptions extends js.Object {
  var anchor: js.UndefOr[ControlAnchor] = js.undefined
  var offset: js.UndefOr[Size] = js.undefined
}

object CopyrightControlOptions {
  @scala.inline
  def apply(anchor: js.UndefOr[ControlAnchor] = js.undefined, offset: Size = null): CopyrightControlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anchor)) __obj.updateDynamic("anchor")(anchor.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyrightControlOptions]
  }
}

