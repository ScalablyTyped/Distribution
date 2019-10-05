package typings.broDashFs.broDashFsMod

import typings.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", "stat")
@js.native
object stat extends js.Object {
  def apply(path: String): js.Promise[StatObject] = js.native
  def apply(path: FileEntry): js.Promise[StatObject] = js.native
}

