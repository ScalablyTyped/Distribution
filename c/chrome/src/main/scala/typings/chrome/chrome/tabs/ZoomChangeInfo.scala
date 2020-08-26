package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomChangeInfo extends js.Object {
  var newZoomFactor: Double = js.native
  var oldZoomFactor: Double = js.native
  var tabId: Double = js.native
  var zoomSettings: ZoomSettings = js.native
}

object ZoomChangeInfo {
  @scala.inline
  def apply(newZoomFactor: Double, oldZoomFactor: Double, tabId: Double, zoomSettings: ZoomSettings): ZoomChangeInfo = {
    val __obj = js.Dynamic.literal(newZoomFactor = newZoomFactor.asInstanceOf[js.Any], oldZoomFactor = oldZoomFactor.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], zoomSettings = zoomSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomChangeInfo]
  }
  @scala.inline
  implicit class ZoomChangeInfoOps[Self <: ZoomChangeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNewZoomFactor(value: Double): Self = this.set("newZoomFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldZoomFactor(value: Double): Self = this.set("oldZoomFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomSettings(value: ZoomSettings): Self = this.set("zoomSettings", value.asInstanceOf[js.Any])
  }
  
}

