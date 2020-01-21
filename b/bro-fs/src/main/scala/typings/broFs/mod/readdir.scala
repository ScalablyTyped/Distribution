package typings.broFs.mod

import typings.broFs.AnonDeep
import typings.filesystem.DirectoryEntry
import typings.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", "readdir")
@js.native
object readdir extends js.Object {
  def apply(path: String): js.Promise[js.Array[FileEntry]] = js.native
  def apply(path: String, options: AnonDeep): js.Promise[js.Array[FileEntry]] = js.native
  def apply(path: DirectoryEntry): js.Promise[js.Array[FileEntry]] = js.native
  def apply(path: DirectoryEntry, options: AnonDeep): js.Promise[js.Array[FileEntry]] = js.native
}

