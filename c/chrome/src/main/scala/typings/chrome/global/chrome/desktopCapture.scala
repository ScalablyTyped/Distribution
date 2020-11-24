package typings.chrome.global.chrome

import typings.chrome.chrome.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// DesktopCapture
////////////////////
/**
  * Desktop Capture API that can be used to capture content of screen, individual windows or tabs.
  * Availability: Since Chrome 34.
  * Permissions:  "desktopCapture"
  */
@JSGlobal("chrome.desktopCapture")
@js.native
object desktopCapture extends js.Object {
  
  def cancelChooseDesktopMedia(desktopMediaRequestId: Double): Unit = js.native
  
  def chooseDesktopMedia(sources: js.Array[String], callback: js.Function1[/* streamId */ String, Unit]): Double = js.native
  def chooseDesktopMedia(sources: js.Array[String], targetTab: Tab, callback: js.Function1[/* streamId */ String, Unit]): Double = js.native
}
