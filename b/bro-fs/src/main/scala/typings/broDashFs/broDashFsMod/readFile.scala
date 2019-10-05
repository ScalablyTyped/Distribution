package typings.broDashFs.broDashFsMod

import typings.broDashFs.Anon_ArrayBuffer
import typings.broDashFs.Anon_Blob
import typings.broDashFs.Anon_File
import typings.broDashFs.Anon_Type
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
  def apply(path: String, options: Anon_ArrayBuffer): js.Promise[ArrayBuffer] = js.native
  def apply(path: String, options: Anon_Blob): js.Promise[Blob] = js.native
  def apply(path: String, options: Anon_File): js.Promise[File] = js.native
  def apply(path: String, options: Anon_Type): js.Promise[String] = js.native
  def apply(path: FileEntry): js.Promise[String] = js.native
  def apply(path: FileEntry, options: Anon_ArrayBuffer): js.Promise[ArrayBuffer] = js.native
  def apply(path: FileEntry, options: Anon_Blob): js.Promise[Blob] = js.native
  def apply(path: FileEntry, options: Anon_File): js.Promise[File] = js.native
  def apply(path: FileEntry, options: Anon_Type): js.Promise[String] = js.native
}

