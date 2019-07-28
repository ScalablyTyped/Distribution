package typings.chrome

import typings.chrome.chromeNs.tabCaptureNs.CaptureInfo
import typings.chrome.chromeNs.tabCaptureNs.CaptureOptions
import typings.chrome.chromeNs.tabCaptureNs.CaptureStatusChangedEvent
import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeoftabCapture extends js.Object {
  var onStatusChanged: CaptureStatusChangedEvent
  def capture(options: CaptureOptions, callback: js.Function1[/* stream */ MediaStream | Null, Unit]): Unit
  def getCapturedTabs(callback: js.Function1[/* result */ js.Array[CaptureInfo], Unit]): Unit
}

object TypeoftabCapture {
  @scala.inline
  def apply(
    capture: (CaptureOptions, js.Function1[/* stream */ MediaStream | Null, Unit]) => Unit,
    getCapturedTabs: js.Function1[/* result */ js.Array[CaptureInfo], Unit] => Unit,
    onStatusChanged: CaptureStatusChangedEvent
  ): TypeoftabCapture = {
    val __obj = js.Dynamic.literal(capture = js.Any.fromFunction2(capture), getCapturedTabs = js.Any.fromFunction1(getCapturedTabs), onStatusChanged = onStatusChanged)
  
    __obj.asInstanceOf[TypeoftabCapture]
  }
}

