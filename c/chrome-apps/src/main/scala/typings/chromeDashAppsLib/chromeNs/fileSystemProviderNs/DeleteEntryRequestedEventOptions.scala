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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entryPath")(entryPath)
    __obj.updateDynamic("fileSystemId")(fileSystemId)
    __obj.updateDynamic("recursive")(recursive)
    __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[DeleteEntryRequestedEventOptions]
  }
}

