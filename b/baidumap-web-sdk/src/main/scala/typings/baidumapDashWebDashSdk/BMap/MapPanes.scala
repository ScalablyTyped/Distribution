package typings.baidumapDashWebDashSdk.BMap

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapPanes extends js.Object {
  var floatPane: js.UndefOr[HTMLElement] = js.undefined
  var floatShadow: js.UndefOr[HTMLElement] = js.undefined
  var labelPane: js.UndefOr[HTMLElement] = js.undefined
  var mapPane: js.UndefOr[HTMLElement] = js.undefined
  var markerMouseTarget: js.UndefOr[HTMLElement] = js.undefined
  var markerPane: js.UndefOr[HTMLElement] = js.undefined
  var markerShadow: js.UndefOr[HTMLElement] = js.undefined
}

object MapPanes {
  @scala.inline
  def apply(
    floatPane: HTMLElement = null,
    floatShadow: HTMLElement = null,
    labelPane: HTMLElement = null,
    mapPane: HTMLElement = null,
    markerMouseTarget: HTMLElement = null,
    markerPane: HTMLElement = null,
    markerShadow: HTMLElement = null
  ): MapPanes = {
    val __obj = js.Dynamic.literal()
    if (floatPane != null) __obj.updateDynamic("floatPane")(floatPane.asInstanceOf[js.Any])
    if (floatShadow != null) __obj.updateDynamic("floatShadow")(floatShadow.asInstanceOf[js.Any])
    if (labelPane != null) __obj.updateDynamic("labelPane")(labelPane.asInstanceOf[js.Any])
    if (mapPane != null) __obj.updateDynamic("mapPane")(mapPane.asInstanceOf[js.Any])
    if (markerMouseTarget != null) __obj.updateDynamic("markerMouseTarget")(markerMouseTarget.asInstanceOf[js.Any])
    if (markerPane != null) __obj.updateDynamic("markerPane")(markerPane.asInstanceOf[js.Any])
    if (markerShadow != null) __obj.updateDynamic("markerShadow")(markerShadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapPanes]
  }
}

