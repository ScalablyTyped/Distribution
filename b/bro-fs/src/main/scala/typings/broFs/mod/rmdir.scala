package typings.broFs.mod

import typings.filesystem.DirectoryEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", "rmdir")
@js.native
object rmdir extends js.Object {
  def apply(path: String): js.Promise[Boolean] = js.native
  def apply(path: DirectoryEntry): js.Promise[Boolean] = js.native
}

