package typings.chromeDashApps.chrome.fileSystem

import typings.filesystem.DirectoryEntry
import typings.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.fileSystem.getDisplayPath")
@js.native
object getDisplayPath extends js.Object {
  def apply(entry: DirectoryEntry, callback: js.Function1[/* displayPath */ String, Unit]): Unit = js.native
  /**
    * Get the display path of an Entry object.
    * The display path is based on the full path of the file or directory on the local file system, but may be made more readable for display purposes.
    */
  def apply(entry: FileEntry, callback: js.Function1[/* displayPath */ String, Unit]): Unit = js.native
}

