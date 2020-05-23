package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroundOverlayOptions extends js.Object {
  var displayOnMaxLevel: js.UndefOr[Double] = js.undefined
  var displayOnMinLevel: js.UndefOr[Double] = js.undefined
  var imageURL: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object GroundOverlayOptions {
  @scala.inline
  def apply(
    displayOnMaxLevel: js.UndefOr[Double] = js.undefined,
    displayOnMinLevel: js.UndefOr[Double] = js.undefined,
    imageURL: String = null,
    opacity: js.UndefOr[Double] = js.undefined
  ): GroundOverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displayOnMaxLevel)) __obj.updateDynamic("displayOnMaxLevel")(displayOnMaxLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayOnMinLevel)) __obj.updateDynamic("displayOnMinLevel")(displayOnMinLevel.get.asInstanceOf[js.Any])
    if (imageURL != null) __obj.updateDynamic("imageURL")(imageURL.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroundOverlayOptions]
  }
}

