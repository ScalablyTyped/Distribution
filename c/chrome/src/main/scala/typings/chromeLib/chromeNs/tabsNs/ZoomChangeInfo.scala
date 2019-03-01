package typings
package chromeLib.chromeNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomChangeInfo extends js.Object {
  var newZoomFactor: scala.Double
  var oldZoomFactor: scala.Double
  var tabId: scala.Double
  var zoomSettings: ZoomSettings
}

object ZoomChangeInfo {
  @scala.inline
  def apply(
    newZoomFactor: scala.Double,
    oldZoomFactor: scala.Double,
    tabId: scala.Double,
    zoomSettings: ZoomSettings
  ): ZoomChangeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newZoomFactor")(newZoomFactor)
    __obj.updateDynamic("oldZoomFactor")(oldZoomFactor)
    __obj.updateDynamic("tabId")(tabId)
    __obj.updateDynamic("zoomSettings")(zoomSettings)
    __obj.asInstanceOf[ZoomChangeInfo]
  }
}

