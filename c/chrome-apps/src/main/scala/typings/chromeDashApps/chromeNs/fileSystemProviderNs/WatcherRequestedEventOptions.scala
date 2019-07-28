package typings.chromeDashApps.chromeNs.fileSystemProviderNs

import typings.chromeDashApps.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs.EntryPathRequestedEventOptions
import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatcherRequestedEventOptions extends EntryPathRequestedEventOptions {
  /**
    * Mode of the watcher.
    * Whether observing should include all child entries recursively.
    * It can be true for directories only.
    */
  var recursive: Boolean
}

object WatcherRequestedEventOptions {
  @scala.inline
  def apply(entryPath: String, fileSystemId: String, recursive: Boolean, requestId: integer): WatcherRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath, fileSystemId = fileSystemId, recursive = recursive, requestId = requestId)
  
    __obj.asInstanceOf[WatcherRequestedEventOptions]
  }
}

