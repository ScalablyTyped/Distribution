package typings.chromeDashApps.chromeNs.fileBrowserHandlerNs

import typings.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionResult extends js.Object {
  /** Selected file entry. It will be null if a file hasn't been selected. */
  var entry: FileEntry | Null
  /** Whether the file has been selected. */
  var success: Boolean
}

object SelectionResult {
  @scala.inline
  def apply(success: Boolean, entry: FileEntry = null): SelectionResult = {
    val __obj = js.Dynamic.literal(success = success)
    if (entry != null) __obj.updateDynamic("entry")(entry)
    __obj.asInstanceOf[SelectionResult]
  }
}

