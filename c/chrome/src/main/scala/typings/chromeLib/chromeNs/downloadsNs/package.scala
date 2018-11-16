package typings
package chromeLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object downloadsNs {
  type DownloadChangedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* downloadDelta */ DownloadDelta, scala.Unit]]
  type DownloadCreatedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* downloadItem */ DownloadItem, scala.Unit]]
  type DownloadDeterminingFilenameEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* downloadItem */ DownloadItem, 
      /* suggest */ js.Function1[/* suggestion */ js.UndefOr[DownloadFilenameSuggestion], scala.Unit], 
      scala.Unit
    ]
  ]
  type DownloadErasedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* downloadId */ scala.Double, scala.Unit]]
}
