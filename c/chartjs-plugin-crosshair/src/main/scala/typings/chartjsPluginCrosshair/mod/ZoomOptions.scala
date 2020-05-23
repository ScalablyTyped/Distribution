package typings.chartjsPluginCrosshair.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomOptions extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var zoomButtonClass: js.UndefOr[String] = js.undefined
  var zoomButtonText: js.UndefOr[String] = js.undefined
  var zoomboxBackgroundColor: js.UndefOr[String] = js.undefined
  var zoomboxBorderColor: js.UndefOr[String] = js.undefined
}

object ZoomOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    zoomButtonClass: String = null,
    zoomButtonText: String = null,
    zoomboxBackgroundColor: String = null,
    zoomboxBorderColor: String = null
  ): ZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (zoomButtonClass != null) __obj.updateDynamic("zoomButtonClass")(zoomButtonClass.asInstanceOf[js.Any])
    if (zoomButtonText != null) __obj.updateDynamic("zoomButtonText")(zoomButtonText.asInstanceOf[js.Any])
    if (zoomboxBackgroundColor != null) __obj.updateDynamic("zoomboxBackgroundColor")(zoomboxBackgroundColor.asInstanceOf[js.Any])
    if (zoomboxBorderColor != null) __obj.updateDynamic("zoomboxBorderColor")(zoomboxBorderColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomOptions]
  }
}

