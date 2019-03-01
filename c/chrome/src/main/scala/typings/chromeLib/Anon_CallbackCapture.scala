package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackCapture extends js.Object {
  var onStatusChanged: chromeLib.chromeNs.tabCaptureNs.CaptureStatusChangedEvent
  def capture(
    options: chromeLib.chromeNs.tabCaptureNs.CaptureOptions,
    callback: js.Function1[/* stream */ stdLib.MediaStream | scala.Null, scala.Unit]
  ): scala.Unit
  def getCapturedTabs(
    callback: js.Function1[/* result */ js.Array[chromeLib.chromeNs.tabCaptureNs.CaptureInfo], scala.Unit]
  ): scala.Unit
}

object Anon_CallbackCapture {
  @scala.inline
  def apply(
    capture: js.Function2[
      chromeLib.chromeNs.tabCaptureNs.CaptureOptions, 
      js.Function1[/* stream */ stdLib.MediaStream | scala.Null, scala.Unit], 
      scala.Unit
    ],
    getCapturedTabs: js.Function1[
      js.Function1[/* result */ js.Array[chromeLib.chromeNs.tabCaptureNs.CaptureInfo], scala.Unit], 
      scala.Unit
    ],
    onStatusChanged: chromeLib.chromeNs.tabCaptureNs.CaptureStatusChangedEvent
  ): Anon_CallbackCapture = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("capture")(capture)
    __obj.updateDynamic("getCapturedTabs")(getCapturedTabs)
    __obj.updateDynamic("onStatusChanged")(onStatusChanged)
    __obj.asInstanceOf[Anon_CallbackCapture]
  }
}

