package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.setZoom")
@js.native
object setZoom extends js.Object {
  def apply(tabId: Double, zoomFactor: Double): Unit = js.native
  def apply(tabId: Double, zoomFactor: Double, callback: js.Function0[Unit]): Unit = js.native
  def apply(zoomFactor: Double): Unit = js.native
  def apply(zoomFactor: Double, callback: js.Function0[Unit]): Unit = js.native
}

