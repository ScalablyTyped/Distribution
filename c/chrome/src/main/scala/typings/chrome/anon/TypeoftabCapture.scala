package typings.chrome.anon

import typings.chrome.chrome.tabCapture.CaptureInfo
import typings.chrome.chrome.tabCapture.CaptureOptions
import typings.chrome.chrome.tabCapture.CaptureStatusChangedEvent
import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeoftabCapture extends js.Object {
  var onStatusChanged: CaptureStatusChangedEvent = js.native
  def capture(options: CaptureOptions, callback: js.Function1[/* stream */ MediaStream | Null, Unit]): Unit = js.native
  def getCapturedTabs(callback: js.Function1[/* result */ js.Array[CaptureInfo], Unit]): Unit = js.native
}

object TypeoftabCapture {
  @scala.inline
  def apply(
    capture: (CaptureOptions, js.Function1[/* stream */ MediaStream | Null, Unit]) => Unit,
    getCapturedTabs: js.Function1[/* result */ js.Array[CaptureInfo], Unit] => Unit,
    onStatusChanged: CaptureStatusChangedEvent
  ): TypeoftabCapture = {
    val __obj = js.Dynamic.literal(capture = js.Any.fromFunction2(capture), getCapturedTabs = js.Any.fromFunction1(getCapturedTabs), onStatusChanged = onStatusChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeoftabCapture]
  }
  @scala.inline
  implicit class TypeoftabCaptureOps[Self <: TypeoftabCapture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCapture(value: (CaptureOptions, js.Function1[/* stream */ MediaStream | Null, Unit]) => Unit): Self = this.set("capture", js.Any.fromFunction2(value))
    @scala.inline
    def setGetCapturedTabs(value: js.Function1[/* result */ js.Array[CaptureInfo], Unit] => Unit): Self = this.set("getCapturedTabs", js.Any.fromFunction1(value))
    @scala.inline
    def setOnStatusChanged(value: CaptureStatusChangedEvent): Self = this.set("onStatusChanged", value.asInstanceOf[js.Any])
  }
  
}

