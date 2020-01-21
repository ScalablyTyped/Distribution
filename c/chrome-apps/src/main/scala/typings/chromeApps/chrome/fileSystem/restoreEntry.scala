package typings.chromeApps.chrome.fileSystem

import typings.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.fileSystem.restoreEntry")
@js.native
object restoreEntry extends js.Object {
  /** Returns the file entry with the given id if it can be restored. This call will fail with a runtime error otherwise. */
  def apply(id: String, callback: js.Function1[/* entry */ FileEntry, Unit]): Unit = js.native
}

