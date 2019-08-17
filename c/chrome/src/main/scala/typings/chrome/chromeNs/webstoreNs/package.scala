package typings.chrome.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webstoreNs {
  import typings.chrome.chromeNs.eventsNs.Event

  type DownloadProgressEvent = Event[js.Function1[/* percentDownloaded */ Double, Unit]]
  type InstallationStageEvent = Event[js.Function1[/* stage */ String, Unit]]
}
