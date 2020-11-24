package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object downloads {
  
  type DownloadChangedEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* downloadDelta */ typings.chrome.chrome.downloads.DownloadDelta, scala.Unit]
  ]
  
  type DownloadCreatedEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* downloadItem */ typings.chrome.chrome.downloads.DownloadItem, scala.Unit]
  ]
  
  type DownloadDeterminingFilenameEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* downloadItem */ typings.chrome.chrome.downloads.DownloadItem, 
      /* suggest */ js.Function1[
        /* suggestion */ js.UndefOr[typings.chrome.chrome.downloads.DownloadFilenameSuggestion], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ]
  
  type DownloadErasedEvent = typings.chrome.chrome.events.Event[js.Function1[/* downloadId */ scala.Double, scala.Unit]]
}
