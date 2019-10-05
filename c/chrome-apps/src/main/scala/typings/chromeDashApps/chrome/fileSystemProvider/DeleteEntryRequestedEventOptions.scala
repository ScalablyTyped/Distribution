package typings.chromeDashApps.chrome.fileSystemProvider

import typings.chromeDashApps.chrome.fileSystemProvider._internal_.EntryPathRequestedEventOptions
import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEntryRequestedEventOptions extends EntryPathRequestedEventOptions {
  /** Whether the operation is recursive (for directories only). */
  var recursive: Boolean
}

object DeleteEntryRequestedEventOptions {
  @scala.inline
  def apply(entryPath: String, fileSystemId: String, recursive: Boolean, requestId: integer): DeleteEntryRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath, fileSystemId = fileSystemId, recursive = recursive, requestId = requestId)
  
    __obj.asInstanceOf[DeleteEntryRequestedEventOptions]
  }
}

