package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroundOverlayOptions extends js.Object {
  var displayOnMaxLevel: js.UndefOr[scala.Double] = js.undefined
  var displayOnMinLevel: js.UndefOr[scala.Double] = js.undefined
  var imageURL: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object GroundOverlayOptions {
  @scala.inline
  def apply(
    displayOnMaxLevel: scala.Int | scala.Double = null,
    displayOnMinLevel: scala.Int | scala.Double = null,
    imageURL: java.lang.String = null,
    opacity: scala.Int | scala.Double = null
  ): GroundOverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (displayOnMaxLevel != null) __obj.updateDynamic("displayOnMaxLevel")(displayOnMaxLevel.asInstanceOf[js.Any])
    if (displayOnMinLevel != null) __obj.updateDynamic("displayOnMinLevel")(displayOnMinLevel.asInstanceOf[js.Any])
    if (imageURL != null) __obj.updateDynamic("imageURL")(imageURL)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroundOverlayOptions]
  }
}

