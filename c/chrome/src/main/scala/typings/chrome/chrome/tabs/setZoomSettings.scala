package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.setZoomSettings")
@js.native
object setZoomSettings extends js.Object {
  def apply(tabId: Double, zoomSettings: ZoomSettings): Unit = js.native
  def apply(tabId: Double, zoomSettings: ZoomSettings, callback: js.Function0[Unit]): Unit = js.native
  def apply(zoomSettings: ZoomSettings): Unit = js.native
  def apply(zoomSettings: ZoomSettings, callback: js.Function0[Unit]): Unit = js.native
}

