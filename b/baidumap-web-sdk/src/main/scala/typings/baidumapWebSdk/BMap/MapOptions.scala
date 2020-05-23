package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var enableAutoResize: js.UndefOr[Boolean] = js.undefined
  var enableHighResolution: js.UndefOr[Boolean] = js.undefined
  var enableMapClick: js.UndefOr[Boolean] = js.undefined
  var mapType: js.UndefOr[MapType] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    enableAutoResize: js.UndefOr[Boolean] = js.undefined,
    enableHighResolution: js.UndefOr[Boolean] = js.undefined,
    enableMapClick: js.UndefOr[Boolean] = js.undefined,
    mapType: MapType = null,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableAutoResize)) __obj.updateDynamic("enableAutoResize")(enableAutoResize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHighResolution)) __obj.updateDynamic("enableHighResolution")(enableHighResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMapClick)) __obj.updateDynamic("enableMapClick")(enableMapClick.get.asInstanceOf[js.Any])
    if (mapType != null) __obj.updateDynamic("mapType")(mapType.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

