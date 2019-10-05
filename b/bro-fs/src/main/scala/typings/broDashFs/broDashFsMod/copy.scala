package typings.broDashFs.broDashFsMod

import typings.broDashFs.Anon_Create
import typings.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", "copy")
@js.native
object copy extends js.Object {
  def apply(oldPath: String, newPath: String): js.Promise[FileEntry] = js.native
  def apply(oldPath: String, newPath: String, options: Anon_Create): js.Promise[FileEntry] = js.native
  def apply(oldPath: FileEntry, newPath: String): js.Promise[FileEntry] = js.native
  def apply(oldPath: FileEntry, newPath: String, options: Anon_Create): js.Promise[FileEntry] = js.native
}

