package typings.baidumapDashWebDashSdk.BMap

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
    displayOnMaxLevel: Int | Double = null,
    displayOnMinLevel: Int | Double = null,
    imageURL: String = null,
    opacity: Int | Double = null
  ): GroundOverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (displayOnMaxLevel != null) __obj.updateDynamic("displayOnMaxLevel")(displayOnMaxLevel.asInstanceOf[js.Any])
    if (displayOnMinLevel != null) __obj.updateDynamic("displayOnMinLevel")(displayOnMinLevel.asInstanceOf[js.Any])
    if (imageURL != null) __obj.updateDynamic("imageURL")(imageURL)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroundOverlayOptions]
  }
}

