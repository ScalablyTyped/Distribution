package typings.broFs.mod

import typings.broFs.anon.Type
import typings.broFs.anon.`0`
import typings.broFs.anon.`1`
import typings.broFs.anon.`2`
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
  def apply(path: String, options: Type): js.Promise[ArrayBuffer] = js.native
  def apply(path: String, options: `0`): js.Promise[Blob] = js.native
  def apply(path: String, options: `1`): js.Promise[File] = js.native
  def apply(path: String, options: `2`): js.Promise[String] = js.native
  def apply(path: FileEntry): js.Promise[String] = js.native
  def apply(path: FileEntry, options: Type): js.Promise[ArrayBuffer] = js.native
  def apply(path: FileEntry, options: `0`): js.Promise[Blob] = js.native
  def apply(path: FileEntry, options: `1`): js.Promise[File] = js.native
  def apply(path: FileEntry, options: `2`): js.Promise[String] = js.native
}

