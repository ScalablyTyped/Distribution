package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Web Store
////////////////////
/**
  * Use the chrome.webstore API to initiate app and extension installations "inline" from your site.
  * @since Chrome 15.
  */
object webstore {
  
  type DownloadProgressEvent = Event[js.Function1[/* percentDownloaded */ Double, Unit]]
  
  type InstallationStageEvent = Event[js.Function1[/* stage */ String, Unit]]
}
