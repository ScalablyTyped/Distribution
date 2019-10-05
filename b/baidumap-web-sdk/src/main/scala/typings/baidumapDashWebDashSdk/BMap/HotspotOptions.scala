package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HotspotOptions extends js.Object {
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var offsets: js.UndefOr[js.Array[Double]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var userData: js.UndefOr[js.Any] = js.undefined
}

object HotspotOptions {
  @scala.inline
  def apply(
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    offsets: js.Array[Double] = null,
    text: String = null,
    userData: js.Any = null
  ): HotspotOptions = {
    val __obj = js.Dynamic.literal()
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (offsets != null) __obj.updateDynamic("offsets")(offsets)
    if (text != null) __obj.updateDynamic("text")(text)
    if (userData != null) __obj.updateDynamic("userData")(userData)
    __obj.asInstanceOf[HotspotOptions]
  }
}

