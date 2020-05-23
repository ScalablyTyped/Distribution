package typings.chrome.global.chrome

import typings.chrome.chrome.tabCapture.CaptureInfo
import typings.chrome.chrome.tabCapture.CaptureOptions
import typings.chrome.chrome.tabCapture.CaptureStatusChangedEvent
import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// TabCapture
////////////////////
/**
  * Use the chrome.tabCapture API to interact with tab media streams.
  * Permissions:  "tabCapture"
  * @since Chrome 31.
  */
@JSGlobal("chrome.tabCapture")
@js.native
object tabCapture extends js.Object {
  var onStatusChanged: CaptureStatusChangedEvent = js.native
  def capture(options: CaptureOptions, callback: js.Function1[/* stream */ MediaStream | Null, Unit]): Unit = js.native
  def getCapturedTabs(callback: js.Function1[/* result */ js.Array[CaptureInfo], Unit]): Unit = js.native
}

