package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEntryRequestedEventOptions
  extends chromeDashAppsLib.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs.EntryPathRequestedEventOptions {
  /** Whether the operation is recursive (for directories only). */
  var recursive: scala.Boolean
}

object DeleteEntryRequestedEventOptions {
  @scala.inline
  def apply(
    entryPath: java.lang.String,
    fileSystemId: java.lang.String,
    recursive: scala.Boolean,
    requestId: chromeDashAppsLib.chromeNs.integer
  ): DeleteEntryRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath, fileSystemId = fileSystemId, recursive = recursive, requestId = requestId)
  
    __obj.asInstanceOf[DeleteEntryRequestedEventOptions]
  }
}

