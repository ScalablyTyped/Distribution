package typings.chrome.global.chrome

import typings.chrome.chrome.pageCapture.SaveDetails
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Page Capture
////////////////////
/**
  * Use the chrome.pageCapture API to save a tab as MHTML.
  * Permissions:  "pageCapture"
  * @since Chrome 18.
  */
object pageCapture {
  
  @JSGlobal("chrome.pageCapture")
  @js.native
  val ^ : js.Any = js.native
  
  inline def saveAsMHTML(details: SaveDetails, callback: js.Function1[/* mhtmlData */ js.UndefOr[Blob], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAsMHTML")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
