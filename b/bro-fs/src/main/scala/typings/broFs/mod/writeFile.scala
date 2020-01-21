package typings.broFs.mod

import typings.filesystem.FileEntry
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", "writeFile")
@js.native
object writeFile extends js.Object {
  def apply(path: String, data: String): js.Promise[FileEntry] = js.native
  def apply(path: String, data: ArrayBuffer): js.Promise[FileEntry] = js.native
  def apply(path: String, data: Blob): js.Promise[FileEntry] = js.native
  def apply(path: String, data: File): js.Promise[FileEntry] = js.native
}

