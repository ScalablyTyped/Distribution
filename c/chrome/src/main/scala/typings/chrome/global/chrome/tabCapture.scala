package typings.chrome.global.chrome

import typings.chrome.chrome.tabCapture.CaptureInfo
import typings.chrome.chrome.tabCapture.CaptureOptions
import typings.chrome.chrome.tabCapture.CaptureStatusChangedEvent
import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @JSGlobal("chrome.tabCapture.capture")
  @js.native
  def capture(options: CaptureOptions, callback: js.Function1[/* stream */ MediaStream | Null, Unit]): Unit = js.native
  
  @JSGlobal("chrome.tabCapture.getCapturedTabs")
  @js.native
  def getCapturedTabs(callback: js.Function1[/* result */ js.Array[CaptureInfo], Unit]): Unit = js.native
  
  @JSGlobal("chrome.tabCapture.onStatusChanged")
  @js.native
  def onStatusChanged: CaptureStatusChangedEvent = js.native
  @scala.inline
  def onStatusChanged_=(x: CaptureStatusChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStatusChanged")(x.asInstanceOf[js.Any])
}
