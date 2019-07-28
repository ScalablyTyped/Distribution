package typings.chrome.chromeNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webstoreNs {
  type DownloadProgressEvent = Event[js.Function1[/* percentDownloaded */ Double, Unit]]
  type InstallationStageEvent = Event[js.Function1[/* stage */ String, Unit]]
}
