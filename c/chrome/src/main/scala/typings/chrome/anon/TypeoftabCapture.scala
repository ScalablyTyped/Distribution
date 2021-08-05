package typings.chrome.anon

import typings.chrome.chrome.tabCapture.CaptureInfo
import typings.chrome.chrome.tabCapture.CaptureOptions
import typings.chrome.chrome.tabCapture.CaptureStatusChangedEvent
import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeoftabCapture extends StObject {
  
  def capture(options: CaptureOptions, callback: js.Function1[/* stream */ MediaStream | Null, Unit]): Unit
  
  def getCapturedTabs(callback: js.Function1[/* result */ js.Array[CaptureInfo], Unit]): Unit
  
  var onStatusChanged: CaptureStatusChangedEvent
}
object TypeoftabCapture {
  
  inline def apply(
    capture: (CaptureOptions, js.Function1[/* stream */ MediaStream | Null, Unit]) => Unit,
    getCapturedTabs: js.Function1[/* result */ js.Array[CaptureInfo], Unit] => Unit,
    onStatusChanged: CaptureStatusChangedEvent
  ): TypeoftabCapture = {
    val __obj = js.Dynamic.literal(capture = js.Any.fromFunction2(capture), getCapturedTabs = js.Any.fromFunction1(getCapturedTabs), onStatusChanged = onStatusChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeoftabCapture]
  }
  
  extension [Self <: TypeoftabCapture](x: Self) {
    
    inline def setCapture(value: (CaptureOptions, js.Function1[/* stream */ MediaStream | Null, Unit]) => Unit): Self = StObject.set(x, "capture", js.Any.fromFunction2(value))
    
    inline def setGetCapturedTabs(value: js.Function1[/* result */ js.Array[CaptureInfo], Unit] => Unit): Self = StObject.set(x, "getCapturedTabs", js.Any.fromFunction1(value))
    
    inline def setOnStatusChanged(value: CaptureStatusChangedEvent): Self = StObject.set(x, "onStatusChanged", value.asInstanceOf[js.Any])
  }
}
