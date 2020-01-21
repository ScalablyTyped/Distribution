package typings.broFs.mod

import typings.broFs.AnonArrayBuffer
import typings.broFs.AnonBlob
import typings.broFs.AnonFile
import typings.broFs.AnonType
import typings.filesystem.FileEntry
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", "readFile")
@js.native
object readFile extends js.Object {
  def apply(path: String): js.Promise[String] = js.native
  def apply(path: String, options: AnonArrayBuffer): js.Promise[ArrayBuffer] = js.native
  def apply(path: String, options: AnonBlob): js.Promise[Blob] = js.native
  def apply(path: String, options: AnonFile): js.Promise[File] = js.native
  def apply(path: String, options: AnonType): js.Promise[String] = js.native
  def apply(path: FileEntry): js.Promise[String] = js.native
  def apply(path: FileEntry, options: AnonArrayBuffer): js.Promise[ArrayBuffer] = js.native
  def apply(path: FileEntry, options: AnonBlob): js.Promise[Blob] = js.native
  def apply(path: FileEntry, options: AnonFile): js.Promise[File] = js.native
  def apply(path: FileEntry, options: AnonType): js.Promise[String] = js.native
}

