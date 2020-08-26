package typings.chrome.chrome.tabCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptureInfo extends js.Object {
  /** Whether an element in the tab being captured is in fullscreen mode. */
  var fullscreen: Boolean = js.native
  /**
    * The new capture status of the tab.
    * One of: "pending", "active", "stopped", or "error"
    */
  var status: String = js.native
  /** The id of the tab whose status changed. */
  var tabId: Double = js.native
}

object CaptureInfo {
  @scala.inline
  def apply(fullscreen: Boolean, status: String, tabId: Double): CaptureInfo = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureInfo]
  }
  @scala.inline
  implicit class CaptureInfoOps[Self <: CaptureInfo] (val x: Self) extends AnyVal {
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
    def setFullscreen(value: Boolean): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
  }
  
}

