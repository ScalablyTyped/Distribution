package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HotspotOptions extends js.Object {
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var offsets: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var userData: js.UndefOr[js.Any] = js.undefined
}

object HotspotOptions {
  @scala.inline
  def apply(
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    offsets: js.Array[scala.Double] = null,
    text: java.lang.String = null,
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

