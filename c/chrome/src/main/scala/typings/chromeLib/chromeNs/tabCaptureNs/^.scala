package typings
package chromeLib.chromeNs.tabCaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabCapture")
@js.native
object ^ extends js.Object {
  var onStatusChanged: CaptureStatusChangedEvent = js.native
  def capture(
    options: CaptureOptions,
    callback: js.Function1[/* stream */ stdLib.MediaStream | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def getCapturedTabs(callback: js.Function1[/* result */ js.Array[CaptureInfo], scala.Unit]): scala.Unit = js.native
}

