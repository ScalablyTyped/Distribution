package typings
package broDashFsLib.broDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", JSImport.Namespace)
@js.native
object broDashFsModMembers extends js.Object {
  def appendFile(path: filesystemLib.FileEntry, data: java.lang.String): stdLib.Promise[filesystemLib.FileSystem] = js.native
  def appendFile(path: filesystemLib.FileEntry, data: stdLib.ArrayBuffer): stdLib.Promise[filesystemLib.FileSystem] = js.native
  def appendFile(path: filesystemLib.FileEntry, data: stdLib.Blob): stdLib.Promise[filesystemLib.FileSystem] = js.native
  def appendFile(path: filesystemLib.FileEntry, data: stdLib.File): stdLib.Promise[filesystemLib.FileSystem] = js.native
  def appendFile(path: java.lang.String, data: java.lang.String): stdLib.Promise[filesystemLib.FileSystem] = js.native
  def appendFile(path: java.lang.String, data: stdLib.ArrayBuffer): stdLib.Promise[filesystemLib.FileSystem] = js.native
  def appendFile(path: java.lang.String, data: stdLib.Blob): stdLib.Promise[filesystemLib.FileSystem] = js.native
  def appendFile(path: java.lang.String, data: stdLib.File): stdLib.Promise[filesystemLib.FileSystem] = js.native
  def clear(): stdLib.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def copy(oldPath: filesystemLib.FileEntry, newPath: java.lang.String): stdLib.Promise[filesystemLib.FileEntry] = js.native
  def copy(oldPath: filesystemLib.FileEntry, newPath: java.lang.String, options: broDashFsLib.Anon_Create): stdLib.Promise[filesystemLib.FileEntry] = js.native
  def copy(oldPath: java.lang.String, newPath: java.lang.String): stdLib.Promise[filesystemLib.FileEntry] = js.native
  def copy(oldPath: java.lang.String, newPath: java.lang.String, options: broDashFsLib.Anon_Create): stdLib.Promise[filesystemLib.FileEntry] = js.native
  def exists(path: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def getEntry(path: filesystemLib.FileEntry): stdLib.Promise[filesystemLib.FileEntry] = js.native
  def getRoot(): stdLib.Promise[filesystemLib.DirectoryEntry] = js.native
  def getUrl(path: filesystemLib.FileEntry): stdLib.Promise[java.lang.String] = js.native
  def getUrl(path: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def init(): stdLib.Promise[filesystemLib.FileSystem] = js.native
  def init(options: FSOptions): stdLib.Promise[filesystemLib.FileSystem] = js.native
  def isSupported(): scala.Boolean = js.native
  def mkdir(path: java.lang.String): stdLib.Promise[filesystemLib.DirectoryEntry] = js.native
  def readFile(path: filesystemLib.FileEntry): stdLib.Promise[java.lang.String] = js.native
  def readFile(path: filesystemLib.FileEntry, options: broDashFsLib.Anon_Type): stdLib.Promise[stdLib.ArrayBuffer] = js.native
  def readFile(path: filesystemLib.FileEntry, options: broDashFsLib.Anon_TypeTextType): stdLib.Promise[java.lang.String] = js.native
  def readFile(path: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def readFile(path: java.lang.String, options: broDashFsLib.Anon_Type): stdLib.Promise[stdLib.ArrayBuffer] = js.native
  def readFile(path: java.lang.String, options: broDashFsLib.Anon_TypeTextType): stdLib.Promise[java.lang.String] = js.native
  def readdir(path: filesystemLib.DirectoryEntry): stdLib.Promise[js.Array[filesystemLib.FileEntry]] = js.native
  def readdir(path: filesystemLib.DirectoryEntry, options: broDashFsLib.Anon_Deep): stdLib.Promise[js.Array[filesystemLib.FileEntry]] = js.native
  def readdir(path: java.lang.String): stdLib.Promise[js.Array[filesystemLib.FileEntry]] = js.native
  def readdir(path: java.lang.String, options: broDashFsLib.Anon_Deep): stdLib.Promise[js.Array[filesystemLib.FileEntry]] = js.native
  def rename(oldPath: filesystemLib.FileEntry, newPath: java.lang.String): stdLib.Promise[filesystemLib.FileEntry] = js.native
  def rename(oldPath: filesystemLib.FileEntry, newPath: java.lang.String, options: broDashFsLib.Anon_Create): stdLib.Promise[filesystemLib.FileEntry] = js.native
  def rename(oldPath: java.lang.String, newPath: java.lang.String): stdLib.Promise[filesystemLib.FileEntry] = js.native
  def rename(oldPath: java.lang.String, newPath: java.lang.String, options: broDashFsLib.Anon_Create): stdLib.Promise[filesystemLib.FileEntry] = js.native
  def rmdir(path: filesystemLib.DirectoryEntry): stdLib.Promise[scala.Boolean] = js.native
  def rmdir(path: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def stat(path: filesystemLib.FileEntry): stdLib.Promise[StatObject] = js.native
  def stat(path: java.lang.String): stdLib.Promise[StatObject] = js.native
  def unlink(path: filesystemLib.FileEntry): stdLib.Promise[scala.Boolean] = js.native
  def unlink(path: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def usage(): stdLib.Promise[UsageObject] = js.native
  def writeFile(path: java.lang.String, data: java.lang.String): stdLib.Promise[filesystemLib.FileEntry] = js.native
  def writeFile(path: java.lang.String, data: stdLib.ArrayBuffer): stdLib.Promise[filesystemLib.FileEntry] = js.native
  def writeFile(path: java.lang.String, data: stdLib.Blob): stdLib.Promise[filesystemLib.FileEntry] = js.native
  def writeFile(path: java.lang.String, data: stdLib.File): stdLib.Promise[filesystemLib.FileEntry] = js.native
}

