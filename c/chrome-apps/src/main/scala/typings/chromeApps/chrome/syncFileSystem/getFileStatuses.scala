package typings.chromeApps.chrome.syncFileSystem

import typings.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.syncFileSystem.getFileStatuses")
@js.native
object getFileStatuses extends js.Object {
  /** Returns each FileStatus for the given fileEntry array. Typically called with the result from dirReader.readEntries(). */
  def apply(
    fileEntries: js.Array[FileEntry],
    callback: js.Function1[/* status */ js.Array[FileStatusInfo], Unit]
  ): Unit = js.native
}

