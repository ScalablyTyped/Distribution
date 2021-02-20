package typings.chrome.global.chrome

import typings.chrome.chrome.topSites.MostVisitedURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @JSGlobal("chrome.topSites.get")
  @js.native
  def get(callback: js.Function1[/* data */ js.Array[MostVisitedURL], Unit]): Unit = js.native
}
