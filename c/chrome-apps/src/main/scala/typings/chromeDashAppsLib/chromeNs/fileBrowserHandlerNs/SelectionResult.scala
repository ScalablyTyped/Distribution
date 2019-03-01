package typings
package chromeDashAppsLib.chromeNs.fileBrowserHandlerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionResult extends js.Object {
  /** Selected file entry. It will be null if a file hasn't been selected. */
  var entry: filesystemLib.FileEntry | scala.Null
  /** Whether the file has been selected. */
  var success: scala.Boolean
}

object SelectionResult {
  @scala.inline
  def apply(success: scala.Boolean, entry: filesystemLib.FileEntry = null): SelectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(success)
    if (entry != null) __obj.updateDynamic("entry")(entry)
    __obj.asInstanceOf[SelectionResult]
  }
}

