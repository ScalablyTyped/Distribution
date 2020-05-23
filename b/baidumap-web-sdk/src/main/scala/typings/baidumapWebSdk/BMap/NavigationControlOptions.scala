package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationControlOptions extends js.Object {
  var anchor: js.UndefOr[ControlAnchor] = js.undefined
  var enableGeolocation: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Size] = js.undefined
  var showZoomInfo: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[NavigationControlType] = js.undefined
}

object NavigationControlOptions {
  @scala.inline
  def apply(
    anchor: js.UndefOr[ControlAnchor] = js.undefined,
    enableGeolocation: js.UndefOr[Boolean] = js.undefined,
    offset: Size = null,
    showZoomInfo: js.UndefOr[Boolean] = js.undefined,
    `type`: js.UndefOr[NavigationControlType] = js.undefined
  ): NavigationControlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anchor)) __obj.updateDynamic("anchor")(anchor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGeolocation)) __obj.updateDynamic("enableGeolocation")(enableGeolocation.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(showZoomInfo)) __obj.updateDynamic("showZoomInfo")(showZoomInfo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationControlOptions]
  }
}

