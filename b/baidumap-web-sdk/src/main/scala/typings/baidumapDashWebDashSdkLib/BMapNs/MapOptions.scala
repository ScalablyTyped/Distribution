package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var enableAutoResize: js.UndefOr[scala.Boolean] = js.undefined
  var enableHighResolution: js.UndefOr[scala.Boolean] = js.undefined
  var enableMapClick: js.UndefOr[scala.Boolean] = js.undefined
  var mapType: js.UndefOr[MapType] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    enableAutoResize: js.UndefOr[scala.Boolean] = js.undefined,
    enableHighResolution: js.UndefOr[scala.Boolean] = js.undefined,
    enableMapClick: js.UndefOr[scala.Boolean] = js.undefined,
    mapType: MapType = null,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableAutoResize)) __obj.updateDynamic("enableAutoResize")(enableAutoResize)
    if (!js.isUndefined(enableHighResolution)) __obj.updateDynamic("enableHighResolution")(enableHighResolution)
    if (!js.isUndefined(enableMapClick)) __obj.updateDynamic("enableMapClick")(enableMapClick)
    if (mapType != null) __obj.updateDynamic("mapType")(mapType)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

