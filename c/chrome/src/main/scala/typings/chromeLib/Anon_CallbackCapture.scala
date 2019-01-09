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

