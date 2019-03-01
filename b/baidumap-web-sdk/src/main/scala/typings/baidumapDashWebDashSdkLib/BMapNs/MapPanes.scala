package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapPanes extends js.Object {
  var floatPane: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var floatShadow: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var labelPane: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var mapPane: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var markerMouseTarget: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var markerPane: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var markerShadow: js.UndefOr[stdLib.HTMLElement] = js.undefined
}

object MapPanes {
  @scala.inline
  def apply(
    floatPane: stdLib.HTMLElement = null,
    floatShadow: stdLib.HTMLElement = null,
    labelPane: stdLib.HTMLElement = null,
    mapPane: stdLib.HTMLElement = null,
    markerMouseTarget: stdLib.HTMLElement = null,
    markerPane: stdLib.HTMLElement = null,
    markerShadow: stdLib.HTMLElement = null
  ): MapPanes = {
    val __obj = js.Dynamic.literal()
    if (floatPane != null) __obj.updateDynamic("floatPane")(floatPane)
    if (floatShadow != null) __obj.updateDynamic("floatShadow")(floatShadow)
    if (labelPane != null) __obj.updateDynamic("labelPane")(labelPane)
    if (mapPane != null) __obj.updateDynamic("mapPane")(mapPane)
    if (markerMouseTarget != null) __obj.updateDynamic("markerMouseTarget")(markerMouseTarget)
    if (markerPane != null) __obj.updateDynamic("markerPane")(markerPane)
    if (markerShadow != null) __obj.updateDynamic("markerShadow")(markerShadow)
    __obj.asInstanceOf[MapPanes]
  }
}

