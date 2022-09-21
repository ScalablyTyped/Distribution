package typings.chrome.global.chrome

import typings.chrome.chrome.desktopCapture.StreamOptions
import typings.chrome.chrome.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSGlobal("chrome.desktopCapture")
  @js.native
  val ^ : js.Any = js.native
  
  inline def cancelChooseDesktopMedia(desktopMediaRequestId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelChooseDesktopMedia")(desktopMediaRequestId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def chooseDesktopMedia(
    sources: js.Array[String],
    callback: js.Function2[/* streamId */ String, /* options */ StreamOptions, Unit]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("chooseDesktopMedia")(sources.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def chooseDesktopMedia(
    sources: js.Array[String],
    targetTab: Tab,
    callback: js.Function2[/* streamId */ String, /* options */ StreamOptions, Unit]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("chooseDesktopMedia")(sources.asInstanceOf[js.Any], targetTab.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Double]
}
