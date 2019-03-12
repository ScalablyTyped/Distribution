package typings
package broDashFsLib.broDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def appendFile(path: filesystemLib.FileEntry, data: java.lang.String): js.Promise[filesystemLib.FileSystem] = js.native
  def appendFile(path: filesystemLib.FileEntry, data: stdLib.ArrayBuffer): js.Promise[filesystemLib.FileSystem] = js.native
  def appendFile(path: filesystemLib.FileEntry, data: stdLib.Blob): js.Promise[filesystemLib.FileSystem] = js.native
  def appendFile(path: filesystemLib.FileEntry, data: stdLib.File): js.Promise[filesystemLib.FileSystem] = js.native
  def appendFile(path: java.lang.String, data: java.lang.String): js.Promise[filesystemLib.FileSystem] = js.native
  def appendFile(path: java.lang.String, data: stdLib.ArrayBuffer): js.Promise[filesystemLib.FileSystem] = js.native
  def appendFile(path: java.lang.String, data: stdLib.Blob): js.Promise[filesystemLib.FileSystem] = js.native
  def appendFile(path: java.lang.String, data: stdLib.File): js.Promise[filesystemLib.FileSystem] = js.native
  def clear(): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def copy(oldPath: filesystemLib.FileEntry, newPath: java.lang.String): js.Promise[filesystemLib.FileEntry] = js.native
  def copy(oldPath: filesystemLib.FileEntry, newPath: java.lang.String, options: broDashFsLib.Anon_Create): js.Promise[filesystemLib.FileEntry] = js.native
  def copy(oldPath: java.lang.String, newPath: java.lang.String): js.Promise[filesystemLib.FileEntry] = js.native
  def copy(oldPath: java.lang.String, newPath: java.lang.String, options: broDashFsLib.Anon_Create): js.Promise[filesystemLib.FileEntry] = js.native
  def exists(path: java.lang.String): js.Promise[scala.Boolean] = js.native
  def getEntry(path: filesystemLib.FileEntry): js.Promise[filesystemLib.FileEntry] = js.native
  def getRoot(): js.Promise[filesystemLib.DirectoryEntry] = js.native
  def getUrl(path: filesystemLib.FileEntry): js.Promise[java.lang.String] = js.native
  def getUrl(path: java.lang.String): js.Promise[java.lang.String] = js.native
  def init(): js.Promise[filesystemLib.FileSystem] = js.native
  def init(options: FSOptions): js.Promise[filesystemLib.FileSystem] = js.native
  def isSupported(): scala.Boolean = js.native
  def mkdir(path: java.lang.String): js.Promise[filesystemLib.DirectoryEntry] = js.native
  def readFile(path: filesystemLib.FileEntry): js.Promise[java.lang.String] = js.native
  def readFile(path: filesystemLib.FileEntry, options: broDashFsLib.Anon_ArrayBuffer): js.Promise[stdLib.ArrayBuffer] = js.native
  def readFile(path: filesystemLib.FileEntry, options: broDashFsLib.Anon_Type): js.Promise[java.lang.String] = js.native
  def readFile(path: java.lang.String): js.Promise[java.lang.String] = js.native
  def readFile(path: java.lang.String, options: broDashFsLib.Anon_ArrayBuffer): js.Promise[stdLib.ArrayBuffer] = js.native
  def readFile(path: java.lang.String, options: broDashFsLib.Anon_Type): js.Promise[java.lang.String] = js.native
  def readdir(path: filesystemLib.DirectoryEntry): js.Promise[js.Array[filesystemLib.FileEntry]] = js.native
  def readdir(path: filesystemLib.DirectoryEntry, options: broDashFsLib.Anon_Deep): js.Promise[js.Array[filesystemLib.FileEntry]] = js.native
  def readdir(path: java.lang.String): js.Promise[js.Array[filesystemLib.FileEntry]] = js.native
  def readdir(path: java.lang.String, options: broDashFsLib.Anon_Deep): js.Promise[js.Array[filesystemLib.FileEntry]] = js.native
  def rename(oldPath: filesystemLib.FileEntry, newPath: java.lang.String): js.Promise[filesystemLib.FileEntry] = js.native
  def rename(oldPath: filesystemLib.FileEntry, newPath: java.lang.String, options: broDashFsLib.Anon_Create): js.Promise[filesystemLib.FileEntry] = js.native
  def rename(oldPath: java.lang.String, newPath: java.lang.String): js.Promise[filesystemLib.FileEntry] = js.native
  def rename(oldPath: java.lang.String, newPath: java.lang.String, options: broDashFsLib.Anon_Create): js.Promise[filesystemLib.FileEntry] = js.native
  def rmdir(path: filesystemLib.DirectoryEntry): js.Promise[scala.Boolean] = js.native
  def rmdir(path: java.lang.String): js.Promise[scala.Boolean] = js.native
  def stat(path: filesystemLib.FileEntry): js.Promise[StatObject] = js.native
  def stat(path: java.lang.String): js.Promise[StatObject] = js.native
  def unlink(path: filesystemLib.FileEntry): js.Promise[scala.Boolean] = js.native
  def unlink(path: java.lang.String): js.Promise[scala.Boolean] = js.native
  def usage(): js.Promise[UsageObject] = js.native
  def writeFile(path: java.lang.String, data: java.lang.String): js.Promise[filesystemLib.FileEntry] = js.native
  def writeFile(path: java.lang.String, data: stdLib.ArrayBuffer): js.Promise[filesystemLib.FileEntry] = js.native
  def writeFile(path: java.lang.String, data: stdLib.Blob): js.Promise[filesystemLib.FileEntry] = js.native
  def writeFile(path: java.lang.String, data: stdLib.File): js.Promise[filesystemLib.FileEntry] = js.native
}

