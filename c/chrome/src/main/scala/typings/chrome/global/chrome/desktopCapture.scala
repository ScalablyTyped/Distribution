package typings.chrome.global.chrome

import typings.chrome.chrome.tabs.Tab
import org.scalablytyped.runtime.StObject
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
object desktopCapture {
  
  @JSGlobal("chrome.desktopCapture.cancelChooseDesktopMedia")
  @js.native
  def cancelChooseDesktopMedia(desktopMediaRequestId: Double): Unit = js.native
  
  @JSGlobal("chrome.desktopCapture.chooseDesktopMedia")
  @js.native
  def chooseDesktopMedia(sources: js.Array[String], callback: js.Function1[/* streamId */ String, Unit]): Double = js.native
  @JSGlobal("chrome.desktopCapture.chooseDesktopMedia")
  @js.native
  def chooseDesktopMedia(sources: js.Array[String], targetTab: Tab, callback: js.Function1[/* streamId */ String, Unit]): Double = js.native
}
