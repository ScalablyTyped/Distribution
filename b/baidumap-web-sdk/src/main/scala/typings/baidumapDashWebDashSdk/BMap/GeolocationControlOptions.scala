package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationControlOptions extends js.Object {
  var anchor: js.UndefOr[ControlAnchor] = js.undefined
  var enableAutoLocation: js.UndefOr[Boolean] = js.undefined
  var locationIcon: js.UndefOr[Icon] = js.undefined
  var offset: js.UndefOr[Size] = js.undefined
  var showAddressBar: js.UndefOr[Boolean] = js.undefined
}

object GeolocationControlOptions {
  @scala.inline
  def apply(
    anchor: Int | Double = null,
    enableAutoLocation: js.UndefOr[Boolean] = js.undefined,
    locationIcon: Icon = null,
    offset: Size = null,
    showAddressBar: js.UndefOr[Boolean] = js.undefined
  ): GeolocationControlOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAutoLocation)) __obj.updateDynamic("enableAutoLocation")(enableAutoLocation.asInstanceOf[js.Any])
    if (locationIcon != null) __obj.updateDynamic("locationIcon")(locationIcon.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(showAddressBar)) __obj.updateDynamic("showAddressBar")(showAddressBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationControlOptions]
  }
}

