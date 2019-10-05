package typings.broDashFs.broDashFsMod

import typings.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", "unlink")
@js.native
object unlink extends js.Object {
  def apply(path: String): js.Promise[Boolean] = js.native
  def apply(path: FileEntry): js.Promise[Boolean] = js.native
}

