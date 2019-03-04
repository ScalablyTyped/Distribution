package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatcherRequestedEventOptions
  extends chromeDashAppsLib.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs.EntryPathRequestedEventOptions {
  /**
    * Mode of the watcher.
    * Whether observing should include all child entries recursively.
    * It can be true for directories only.
    */
  var recursive: scala.Boolean
}

object WatcherRequestedEventOptions {
  @scala.inline
  def apply(
    entryPath: java.lang.String,
    fileSystemId: java.lang.String,
    recursive: scala.Boolean,
    requestId: chromeDashAppsLib.chromeNs.integer
  ): WatcherRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath, fileSystemId = fileSystemId, recursive = recursive, requestId = requestId)
  
    __obj.asInstanceOf[WatcherRequestedEventOptions]
  }
}

