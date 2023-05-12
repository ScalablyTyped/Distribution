package typings.chrome.chrome.downloads

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DownloadChangedEvent = Event[js.Function1[/* downloadDelta */ DownloadDelta, Unit]]

type DownloadCreatedEvent = Event[js.Function1[/* downloadItem */ DownloadItem, Unit]]

type DownloadDeterminingFilenameEvent = Event[
js.Function2[
  /* downloadItem */ DownloadItem, 
  /* suggest */ js.Function1[/* suggestion */ js.UndefOr[DownloadFilenameSuggestion], Unit], 
  Unit
]]

type DownloadErasedEvent = Event[js.Function1[/* downloadId */ Double, Unit]]
