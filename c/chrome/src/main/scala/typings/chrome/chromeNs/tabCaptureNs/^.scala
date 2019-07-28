package typings.chrome.chromeNs.tabCaptureNs

import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabCapture")
@js.native
object ^ extends js.Object {
  var onStatusChanged: CaptureStatusChangedEvent = js.native
  def capture(options: CaptureOptions, callback: js.Function1[/* stream */ MediaStream | Null, Unit]): Unit = js.native
  def getCapturedTabs(callback: js.Function1[/* result */ js.Array[CaptureInfo], Unit]): Unit = js.native
}

