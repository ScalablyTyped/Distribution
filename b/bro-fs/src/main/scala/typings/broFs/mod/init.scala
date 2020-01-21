package typings.broFs.mod

import typings.filesystem.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", "init")
@js.native
object init extends js.Object {
  def apply(): js.Promise[FileSystem] = js.native
  def apply(options: FSOptions): js.Promise[FileSystem] = js.native
}

