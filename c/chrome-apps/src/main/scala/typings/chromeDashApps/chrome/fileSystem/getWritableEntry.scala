package typings.chromeDashApps.chrome.fileSystem

import typings.filesystem.DirectoryEntry
import typings.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.fileSystem.getWritableEntry")
@js.native
object getWritableEntry extends js.Object {
  def apply(entry: DirectoryEntry, callback: js.Function1[/* entry */ DirectoryEntry, Unit]): Unit = js.native
  /**
    * Get a writable Entry from another Entry. This call will fail with a runtime error if the application does not have the 'write' permission under 'fileSystem'.
    * If entry is a DirectoryEntry, this call will fail if the application does not have the 'directory' permission under 'fileSystem'.
    */
  def apply(entry: FileEntry, callback: js.Function1[/* entry */ FileEntry, Unit]): Unit = js.native
}

