package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleControlOptions extends js.Object {
  var anchor: js.UndefOr[ControlAnchor] = js.undefined
  var offset: js.UndefOr[Size] = js.undefined
}

object ScaleControlOptions {
  @scala.inline
  def apply(anchor: Int | Double = null, offset: Size = null): ScaleControlOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleControlOptions]
  }
}

