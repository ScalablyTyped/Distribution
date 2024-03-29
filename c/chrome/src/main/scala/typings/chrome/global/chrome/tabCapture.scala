package typings.chrome.global.chrome

import typings.chrome.chrome.tabCapture.CaptureInfo
import typings.chrome.chrome.tabCapture.CaptureOptions
import typings.chrome.chrome.tabCapture.CaptureStatusChangedEvent
import typings.chrome.chrome.tabCapture.GetMediaStreamOptions
import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// TabCapture
////////////////////
/**
  * Use the chrome.tabCapture API to interact with tab media streams.
  * Permissions:  "tabCapture"
  * @since Chrome 31.
  */
object tabCapture {
  
  @JSGlobal("chrome.tabCapture")
  @js.native
  val ^ : js.Any = js.native
  
  inline def capture(options: CaptureOptions, callback: js.Function1[/* stream */ MediaStream | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getCapturedTabs(callback: js.Function1[/* result */ js.Array[CaptureInfo], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getCapturedTabs")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getMediaStreamId(options: GetMediaStreamOptions, callback: js.Function1[/* streamId */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getMediaStreamId")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("chrome.tabCapture.onStatusChanged")
  @js.native
  def onStatusChanged: CaptureStatusChangedEvent = js.native
  inline def onStatusChanged_=(x: CaptureStatusChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStatusChanged")(x.asInstanceOf[js.Any])
}
