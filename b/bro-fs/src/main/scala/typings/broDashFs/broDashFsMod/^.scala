package typings.broDashFs.broDashFsMod

import typings.broDashFs.Anon_ArrayBuffer
import typings.broDashFs.Anon_Blob
import typings.broDashFs.Anon_Create
import typings.broDashFs.Anon_Deep
import typings.broDashFs.Anon_File
import typings.broDashFs.Anon_Type
import typings.filesystem.DirectoryEntry
import typings.filesystem.FileEntry
import typings.filesystem.FileSystem
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def appendFile(path: String, data: String): js.Promise[FileSystem] = js.native
  def appendFile(path: String, data: ArrayBuffer): js.Promise[FileSystem] = js.native
  def appendFile(path: String, data: Blob): js.Promise[FileSystem] = js.native
  def appendFile(path: String, data: File): js.Promise[FileSystem] = js.native
  def appendFile(path: FileEntry, data: String): js.Promise[FileSystem] = js.native
  def appendFile(path: FileEntry, data: ArrayBuffer): js.Promise[FileSystem] = js.native
  def appendFile(path: FileEntry, data: Blob): js.Promise[FileSystem] = js.native
  def appendFile(path: FileEntry, data: File): js.Promise[FileSystem] = js.native
  def clear(): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def copy(oldPath: String, newPath: String): js.Promise[FileEntry] = js.native
  def copy(oldPath: String, newPath: String, options: Anon_Create): js.Promise[FileEntry] = js.native
  def copy(oldPath: FileEntry, newPath: String): js.Promise[FileEntry] = js.native
  def copy(oldPath: FileEntry, newPath: String, options: Anon_Create): js.Promise[FileEntry] = js.native
  def exists(path: String): js.Promise[Boolean] = js.native
  def getEntry(path: FileEntry): js.Promise[FileEntry] = js.native
  def getRoot(): js.Promise[DirectoryEntry] = js.native
  def getUrl(path: String): js.Promise[String] = js.native
  def getUrl(path: FileEntry): js.Promise[String] = js.native
  def init(): js.Promise[FileSystem] = js.native
  def init(options: FSOptions): js.Promise[FileSystem] = js.native
  def isSupported(): Boolean = js.native
  def mkdir(path: String): js.Promise[DirectoryEntry] = js.native
  def readFile(path: String): js.Promise[String] = js.native
  def readFile(path: String, options: Anon_ArrayBuffer): js.Promise[ArrayBuffer] = js.native
  def readFile(path: String, options: Anon_Blob): js.Promise[Blob] = js.native
  def readFile(path: String, options: Anon_File): js.Promise[File] = js.native
  def readFile(path: String, options: Anon_Type): js.Promise[String] = js.native
  def readFile(path: FileEntry): js.Promise[String] = js.native
  def readFile(path: FileEntry, options: Anon_ArrayBuffer): js.Promise[ArrayBuffer] = js.native
  def readFile(path: FileEntry, options: Anon_Blob): js.Promise[Blob] = js.native
  def readFile(path: FileEntry, options: Anon_File): js.Promise[File] = js.native
  def readFile(path: FileEntry, options: Anon_Type): js.Promise[String] = js.native
  def readdir(path: String): js.Promise[js.Array[FileEntry]] = js.native
  def readdir(path: String, options: Anon_Deep): js.Promise[js.Array[FileEntry]] = js.native
  def readdir(path: DirectoryEntry): js.Promise[js.Array[FileEntry]] = js.native
  def readdir(path: DirectoryEntry, options: Anon_Deep): js.Promise[js.Array[FileEntry]] = js.native
  def rename(oldPath: String, newPath: String): js.Promise[FileEntry] = js.native
  def rename(oldPath: String, newPath: String, options: Anon_Create): js.Promise[FileEntry] = js.native
  def rename(oldPath: FileEntry, newPath: String): js.Promise[FileEntry] = js.native
  def rename(oldPath: FileEntry, newPath: String, options: Anon_Create): js.Promise[FileEntry] = js.native
  def rmdir(path: String): js.Promise[Boolean] = js.native
  def rmdir(path: DirectoryEntry): js.Promise[Boolean] = js.native
  def stat(path: String): js.Promise[StatObject] = js.native
  def stat(path: FileEntry): js.Promise[StatObject] = js.native
  def unlink(path: String): js.Promise[Boolean] = js.native
  def unlink(path: FileEntry): js.Promise[Boolean] = js.native
  def usage(): js.Promise[UsageObject] = js.native
  def writeFile(path: String, data: String): js.Promise[FileEntry] = js.native
  def writeFile(path: String, data: ArrayBuffer): js.Promise[FileEntry] = js.native
  def writeFile(path: String, data: Blob): js.Promise[FileEntry] = js.native
  def writeFile(path: String, data: File): js.Promise[FileEntry] = js.native
}

