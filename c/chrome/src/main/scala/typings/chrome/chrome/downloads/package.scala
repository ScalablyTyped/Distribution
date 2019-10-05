package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object downloads {
  import typings.chrome.chrome.events.Event

  type DownloadChangedEvent = Event[js.Function1[/* downloadDelta */ DownloadDelta, Unit]]
  type DownloadCreatedEvent = Event[js.Function1[/* downloadItem */ DownloadItem, Unit]]
  type DownloadDeterminingFilenameEvent = Event[
    js.Function2[
      /* downloadItem */ DownloadItem, 
      /* suggest */ js.Function1[/* suggestion */ js.UndefOr[DownloadFilenameSuggestion], Unit], 
      Unit
    ]
  ]
  type DownloadErasedEvent = Event[js.Function1[/* downloadId */ Double, Unit]]
}
