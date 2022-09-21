package typings.chrome.anon

import typings.chrome.chrome.desktopCapture.StreamOptions
import typings.chrome.chrome.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofdesktopCapture extends StObject {
  
  def cancelChooseDesktopMedia(desktopMediaRequestId: Double): Unit = js.native
  
  def chooseDesktopMedia(
    sources: js.Array[String],
    callback: js.Function2[/* streamId */ String, /* options */ StreamOptions, Unit]
  ): Double = js.native
  def chooseDesktopMedia(
    sources: js.Array[String],
    targetTab: Tab,
    callback: js.Function2[/* streamId */ String, /* options */ StreamOptions, Unit]
  ): Double = js.native
}
