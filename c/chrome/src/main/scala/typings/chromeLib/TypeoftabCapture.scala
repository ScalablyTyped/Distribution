package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeoftabCapture extends js.Object {
  var onStatusChanged: chromeLib.chromeNs.tabCaptureNs.CaptureStatusChangedEvent
  def capture(
    options: chromeLib.chromeNs.tabCaptureNs.CaptureOptions,
    callback: js.Function1[/* stream */ stdLib.MediaStream | scala.Null, scala.Unit]
  ): scala.Unit
  def getCapturedTabs(
    callback: js.Function1[/* result */ js.Array[chromeLib.chromeNs.tabCaptureNs.CaptureInfo], scala.Unit]
  ): scala.Unit
}

object TypeoftabCapture {
  @scala.inline
  def apply(
    capture: (chromeLib.chromeNs.tabCaptureNs.CaptureOptions, js.Function1[/* stream */ stdLib.MediaStream | scala.Null, scala.Unit]) => scala.Unit,
    getCapturedTabs: js.Function1[/* result */ js.Array[chromeLib.chromeNs.tabCaptureNs.CaptureInfo], scala.Unit] => scala.Unit,
    onStatusChanged: chromeLib.chromeNs.tabCaptureNs.CaptureStatusChangedEvent
  ): TypeoftabCapture = {
    val __obj = js.Dynamic.literal(capture = js.Any.fromFunction2(capture), getCapturedTabs = js.Any.fromFunction1(getCapturedTabs), onStatusChanged = onStatusChanged)
  
    __obj.asInstanceOf[TypeoftabCapture]
  }
}

