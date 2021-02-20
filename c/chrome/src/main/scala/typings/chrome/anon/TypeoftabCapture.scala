package typings.chrome.anon

import typings.chrome.chrome.tabCapture.CaptureInfo
import typings.chrome.chrome.tabCapture.CaptureOptions
import typings.chrome.chrome.tabCapture.CaptureStatusChangedEvent
import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeoftabCapture extends StObject {
  
  def capture(options: CaptureOptions, callback: js.Function1[/* stream */ MediaStream | Null, Unit]): Unit = js.native
  
  def getCapturedTabs(callback: js.Function1[/* result */ js.Array[CaptureInfo], Unit]): Unit = js.native
  
  var onStatusChanged: CaptureStatusChangedEvent = js.native
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
  implicit class TypeoftabCaptureMutableBuilder[Self <: TypeoftabCapture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapture(value: (CaptureOptions, js.Function1[/* stream */ MediaStream | Null, Unit]) => Unit): Self = StObject.set(x, "capture", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetCapturedTabs(value: js.Function1[/* result */ js.Array[CaptureInfo], Unit] => Unit): Self = StObject.set(x, "getCapturedTabs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStatusChanged(value: CaptureStatusChangedEvent): Self = StObject.set(x, "onStatusChanged", value.asInstanceOf[js.Any])
  }
}
