package typings.chrome.global.chrome

import typings.chrome.chrome.topSites.MostVisitedURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Top Sites
////////////////////
/**
  * Use the chrome.topSites API to access the top sites that are displayed on the new tab page.
  * Permissions:  "topSites"
  * @since Chrome 19.
  */
object topSites {
  
  @JSGlobal("chrome.topSites")
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(callback: js.Function1[/* data */ js.Array[MostVisitedURL], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
