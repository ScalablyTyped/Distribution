package typings.baidumapDashWebDashSdk.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelOptions extends js.Object {
  var enableMassClear: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Size] = js.undefined
  var position: js.UndefOr[Point] = js.undefined
}

object LabelOptions {
  @scala.inline
  def apply(enableMassClear: js.UndefOr[Boolean] = js.undefined, offset: Size = null, position: Point = null): LabelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableMassClear)) __obj.updateDynamic("enableMassClear")(enableMassClear)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[LabelOptions]
  }
}

