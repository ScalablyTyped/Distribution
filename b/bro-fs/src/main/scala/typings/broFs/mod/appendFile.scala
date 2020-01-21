package typings.broFs.mod

import typings.filesystem.FileEntry
import typings.filesystem.FileSystem
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", "appendFile")
@js.native
object appendFile extends js.Object {
  def apply(path: String, data: String): js.Promise[FileSystem] = js.native
  def apply(path: String, data: ArrayBuffer): js.Promise[FileSystem] = js.native
  def apply(path: String, data: Blob): js.Promise[FileSystem] = js.native
  def apply(path: String, data: File): js.Promise[FileSystem] = js.native
  def apply(path: FileEntry, data: String): js.Promise[FileSystem] = js.native
  def apply(path: FileEntry, data: ArrayBuffer): js.Promise[FileSystem] = js.native
  def apply(path: FileEntry, data: Blob): js.Promise[FileSystem] = js.native
  def apply(path: FileEntry, data: File): js.Promise[FileSystem] = js.native
}

