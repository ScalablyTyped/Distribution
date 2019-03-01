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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entryPath")(entryPath)
    __obj.updateDynamic("fileSystemId")(fileSystemId)
    __obj.updateDynamic("recursive")(recursive)
    __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[WatcherRequestedEventOptions]
  }
}

