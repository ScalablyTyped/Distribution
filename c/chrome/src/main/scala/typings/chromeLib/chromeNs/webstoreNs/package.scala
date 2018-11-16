package typings
package chromeLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webstoreNs {
  type DownloadProgressEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* percentDownloaded */ scala.Double, scala.Unit]]
  type InstallationStageEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* stage */ java.lang.String, scala.Unit]]
}
