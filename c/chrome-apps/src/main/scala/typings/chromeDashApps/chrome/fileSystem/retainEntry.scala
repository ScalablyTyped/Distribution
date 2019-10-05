package typings.chromeDashApps.chrome.fileSystem

import typings.filesystem.DirectoryEntry
import typings.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.fileSystem.retainEntry")
@js.native
object retainEntry extends js.Object {
  def apply(entry: DirectoryEntry): String = js.native
  /**
    * Returns an id that can be passed to restoreEntry to regain access to a given file entry.
    * Only the 500 most recently used entries are retained, where calls to retainEntry and restoreEntry count as use.
    * If the app has the 'retainEntries' permission under 'fileSystem', entries are retained indefinitely.
    * Otherwise, entries are retained only while the app is running and across restarts.
    * @since Chrome 29.
    * */
  def apply(entry: FileEntry): String = js.native
}

