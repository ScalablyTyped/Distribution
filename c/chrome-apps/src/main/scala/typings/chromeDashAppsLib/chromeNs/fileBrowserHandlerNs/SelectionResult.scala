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

