package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapStyleV2 extends js.Object {
  var styleId: js.UndefOr[String] = js.undefined
  var styleJson: js.UndefOr[js.Array[MapStyleItem]] = js.undefined
}

object MapStyleV2 {
  @scala.inline
  def apply(styleId: String = null, styleJson: js.Array[MapStyleItem] = null): MapStyleV2 = {
    val __obj = js.Dynamic.literal()
    if (styleId != null) __obj.updateDynamic("styleId")(styleId)
    if (styleJson != null) __obj.updateDynamic("styleJson")(styleJson)
    __obj.asInstanceOf[MapStyleV2]
  }
}

