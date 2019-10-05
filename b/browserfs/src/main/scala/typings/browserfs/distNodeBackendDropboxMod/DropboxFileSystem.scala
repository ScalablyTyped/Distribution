package typings.browserfs.distNodeBackendDropboxMod

import org.scalablytyped.runtime.StringDictionary
import typings.browserfs.distNodeCoreFileMod.File
import typings.browserfs.distNodeCoreFileUnderscoreFlagMod.FileFlag
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSOneArgCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BaseFileSystem
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystem
import typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.FileType
import typings.dropboxjs.Dropbox.ApiError
import typings.dropboxjs.Dropbox.File.Stat
import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropboxFileSystem
  extends BaseFileSystem
     with FileSystem {
  var _client: js.Any = js.native
  /**
    * Private
    * Returns a BrowserFS object representing a File, created from the data
    * returned by calls to the Dropbox API.
    */
  def _makeFile(path: String, flag: FileFlag, stat: Stat, buffer: Buffer): DropboxFile = js.native
  /**
    * Private
    * Delete a file or directory from Dropbox
    * isFile should reflect which call was made to remove the it (`unlink` or
    * `rmdir`). If this doesn't match what's actually at `path`, an error will be
    * returned
    */
  def _remove(path: String, cb: BFSOneArgCallback, isFile: Boolean): Unit = js.native
  /**
    * Private
    * Returns a BrowserFS object representing the type of a Dropbox.js stat object
    */
  def _statType(stat: Stat): FileType = js.native
  def _writeFileStrict(p: String, data: ArrayBuffer, cb: BFSCallback[Stat]): Unit = js.native
  /* InferMemberOverrides */
  override def chmod(p: String, isLchmod: Boolean, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def chmodSync(p: String, isLchmod: Boolean, mode: Double): Unit = js.native
  /* InferMemberOverrides */
  override def chown(p: String, isLchown: Boolean, uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def chownSync(p: String, isLchown: Boolean, uid: Double, gid: Double): Unit = js.native
  /**
    * Converts a Dropbox-JS error into a BFS error.
    */
  def convert(err: ApiError): typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ApiError = js.native
  def convert(err: ApiError, path: String): typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ApiError = js.native
  /* InferMemberOverrides */
  override def diskSpace(p: String, cb: js.Function2[/* total */ Double, /* free */ Double, _]): Unit = js.native
  def empty(mainCb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def exists(p: String, cb: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
  /* InferMemberOverrides */
  override def existsSync(p: String): Boolean = js.native
  /* InferMemberOverrides */
  override def link(srcpath: String, dstpath: String, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def linkSync(srcpath: String, dstpath: String): Unit = js.native
  /* InferMemberOverrides */
  override def mkdir(p: String, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def mkdirSync(p: String, mode: Double): Unit = js.native
  /* InferMemberOverrides */
  override def open(p: String, flag: FileFlag, mode: Double, cb: BFSCallback[File]): Unit = js.native
  /* InferMemberOverrides */
  override def openSync(p: String, flag: FileFlag, mode: Double): File = js.native
  /* InferMemberOverrides */
  override def readFile(fname: String, encoding: String, flag: FileFlag, cb: BFSCallback[String | Buffer]): Unit = js.native
  /* InferMemberOverrides */
  override def readFile(fname: String, encoding: Null, flag: FileFlag, cb: BFSCallback[String | Buffer]): Unit = js.native
  /* InferMemberOverrides */
  override def readFileSync(fname: String, encoding: String, flag: FileFlag): js.Any = js.native
  /* InferMemberOverrides */
  override def readFileSync(fname: String, encoding: Null, flag: FileFlag): js.Any = js.native
  /* InferMemberOverrides */
  override def readdir(p: String, cb: BFSCallback[js.Array[String]]): Unit = js.native
  /* InferMemberOverrides */
  override def readdirSync(p: String): js.Array[String] = js.native
  /* InferMemberOverrides */
  override def readlinkSync(p: String): String = js.native
  /* InferMemberOverrides */
  override def realpath(p: String, cache: StringDictionary[String], cb: BFSCallback[String]): Unit = js.native
  /* InferMemberOverrides */
  override def realpathSync(p: String, cache: StringDictionary[String]): String = js.native
  /* InferMemberOverrides */
  override def rename(oldPath: String, newPath: String, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def renameSync(oldPath: String, newPath: String): Unit = js.native
  /* InferMemberOverrides */
  override def rmdir(p: String, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def rmdirSync(p: String): Unit = js.native
  /* InferMemberOverrides */
  override def stat(
    p: String,
    isLstat: Boolean,
    cb: BFSCallback[typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default]
  ): Unit = js.native
  /* InferMemberOverrides */
  override def stat(
    p: String,
    isLstat: Null,
    cb: BFSCallback[typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default]
  ): Unit = js.native
  /* InferMemberOverrides */
  override def statSync(p: String): typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default = js.native
  /* InferMemberOverrides */
  override def statSync(p: String, isLstat: Boolean): typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default = js.native
  /* InferMemberOverrides */
  override def supportsLinks(): Boolean = js.native
  def supportsSymlinks(): Boolean = js.native
  /* InferMemberOverrides */
  override def symlink(srcpath: String, dstpath: String, `type`: String, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def symlinkSync(srcpath: String, dstpath: String, `type`: String): Unit = js.native
  /* InferMemberOverrides */
  override def truncate(p: String, len: Double, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def truncateSync(p: String, len: Double): Unit = js.native
  /* InferMemberOverrides */
  override def unlink(p: String, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def unlinkSync(p: String): Unit = js.native
  /* InferMemberOverrides */
  override def utimes(p: String, atime: Date, mtime: Date, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def utimesSync(p: String, atime: Date, mtime: Date): Unit = js.native
  /* InferMemberOverrides */
  override def writeFile(fname: String, data: js.Any, encoding: String, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def writeFile(fname: String, data: js.Any, encoding: Null, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
}

