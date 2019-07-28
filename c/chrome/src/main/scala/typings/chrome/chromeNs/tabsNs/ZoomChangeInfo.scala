package typings.chrome.chromeNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomChangeInfo extends js.Object {
  var newZoomFactor: Double
  var oldZoomFactor: Double
  var tabId: Double
  var zoomSettings: ZoomSettings
}

object ZoomChangeInfo {
  @scala.inline
  def apply(newZoomFactor: Double, oldZoomFactor: Double, tabId: Double, zoomSettings: ZoomSettings): ZoomChangeInfo = {
    val __obj = js.Dynamic.literal(newZoomFactor = newZoomFactor, oldZoomFactor = oldZoomFactor, tabId = tabId, zoomSettings = zoomSettings)
  
    __obj.asInstanceOf[ZoomChangeInfo]
  }
}

