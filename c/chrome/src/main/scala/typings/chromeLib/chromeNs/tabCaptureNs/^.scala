package typings
package chromeLib.chromeNs.tabCaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabCapture")
@js.native
object ^ extends js.Object {
  var onStatusChanged: chromeLib.chromeNs.tabCaptureNs.CaptureStatusChangedEvent = js.native
  def capture(
    options: chromeLib.chromeNs.tabCaptureNs.CaptureOptions,
    callback: js.Function1[/* stream */ stdLib.MediaStream | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def getCapturedTabs(
    callback: js.Function1[/* result */ js.Array[chromeLib.chromeNs.tabCaptureNs.CaptureInfo], scala.Unit]
  ): scala.Unit = js.native
}

