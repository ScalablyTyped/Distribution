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
    anchor: Int | Double = null,
    enableGeolocation: js.UndefOr[Boolean] = js.undefined,
    offset: Size = null,
    showZoomInfo: js.UndefOr[Boolean] = js.undefined,
    `type`: Int | Double = null
  ): NavigationControlOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGeolocation)) __obj.updateDynamic("enableGeolocation")(enableGeolocation.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(showZoomInfo)) __obj.updateDynamic("showZoomInfo")(showZoomInfo.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationControlOptions]
  }
}

