package typings.browserfs.fileSystemMod

import org.scalablytyped.runtime.StringDictionary
import typings.browserfs.fileFlagMod.FileFlag
import typings.browserfs.fileMod.File
import typings.browserfs.nodeFsStatsMod.default
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/file_system", "BaseFileSystem")
@js.native
class BaseFileSystem () extends js.Object {
  def appendFile(fname: String, data: js.Any, encoding: String, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  def appendFile(fname: String, data: js.Any, encoding: Null, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  def appendFileSync(fname: String, data: js.Any, encoding: String, flag: FileFlag, mode: Double): Unit = js.native
  def appendFileSync(fname: String, data: js.Any, encoding: Null, flag: FileFlag, mode: Double): Unit = js.native
  def chmod(p: String, isLchmod: Boolean, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  def chmodSync(p: String, isLchmod: Boolean, mode: Double): Unit = js.native
  def chown(p: String, isLchown: Boolean, uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
  def chownSync(p: String, isLchown: Boolean, uid: Double, gid: Double): Unit = js.native
  /**
    * Create the file at path p with the given mode. Then, open it with the given
    * flag.
    */
  def createFile(p: String, flag: FileFlag, mode: Double, cb: BFSCallback[File]): Unit = js.native
  /**
    * Create the file at path p with the given mode. Then, open it with the given
    * flag.
    */
  def createFileSync(p: String, flag: FileFlag, mode: Double): File = js.native
  def diskSpace(p: String, cb: js.Function2[/* total */ Double, /* free */ Double, _]): Unit = js.native
  def exists(p: String, cb: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
  def existsSync(p: String): Boolean = js.native
  def link(srcpath: String, dstpath: String, cb: BFSOneArgCallback): Unit = js.native
  def linkSync(srcpath: String, dstpath: String): Unit = js.native
  def mkdir(p: String, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  def mkdirSync(p: String, mode: Double): Unit = js.native
  def open(p: String, flag: FileFlag, mode: Double, cb: BFSCallback[File]): Unit = js.native
  /**
    * Opens the file at path p with the given flag. The file must exist.
    * @param p The path to open.
    * @param flag The flag to use when opening the file.
    */
  def openFile(p: String, flag: FileFlag, cb: BFSCallback[File]): Unit = js.native
  /**
    * Opens the file at path p with the given flag. The file must exist.
    * @param p The path to open.
    * @param flag The flag to use when opening the file.
    * @return A File object corresponding to the opened file.
    */
  def openFileSync(p: String, flag: FileFlag, mode: Double): File = js.native
  def openSync(p: String, flag: FileFlag, mode: Double): File = js.native
  def readFile(fname: String, encoding: String, flag: FileFlag, cb: BFSCallback[String | Buffer]): Unit = js.native
  def readFile(fname: String, encoding: Null, flag: FileFlag, cb: BFSCallback[String | Buffer]): Unit = js.native
  def readFileSync(fname: String, encoding: String, flag: FileFlag): js.Any = js.native
  def readFileSync(fname: String, encoding: Null, flag: FileFlag): js.Any = js.native
  def readdir(p: String, cb: BFSCallback[js.Array[String]]): Unit = js.native
  def readdirSync(p: String): js.Array[String] = js.native
  def readlink(p: String, cb: BFSOneArgCallback): Unit = js.native
  def readlinkSync(p: String): String = js.native
  def realpath(p: String, cache: StringDictionary[String], cb: BFSCallback[String]): Unit = js.native
  def realpathSync(p: String, cache: StringDictionary[String]): String = js.native
  def rename(oldPath: String, newPath: String, cb: BFSOneArgCallback): Unit = js.native
  def renameSync(oldPath: String, newPath: String): Unit = js.native
  def rmdir(p: String, cb: BFSOneArgCallback): Unit = js.native
  def rmdirSync(p: String): Unit = js.native
  def stat(p: String, isLstat: Boolean, cb: BFSCallback[default]): Unit = js.native
  def stat(p: String, isLstat: Null, cb: BFSCallback[default]): Unit = js.native
  def statSync(p: String): default = js.native
  def statSync(p: String, isLstat: Boolean): default = js.native
  def supportsLinks(): Boolean = js.native
  def symlink(srcpath: String, dstpath: String, `type`: String, cb: BFSOneArgCallback): Unit = js.native
  def symlinkSync(srcpath: String, dstpath: String, `type`: String): Unit = js.native
  def truncate(p: String, len: Double, cb: BFSOneArgCallback): Unit = js.native
  def truncateSync(p: String, len: Double): Unit = js.native
  def unlink(p: String, cb: BFSOneArgCallback): Unit = js.native
  def unlinkSync(p: String): Unit = js.native
  def utimes(p: String, atime: Date, mtime: Date, cb: BFSOneArgCallback): Unit = js.native
  def utimesSync(p: String, atime: Date, mtime: Date): Unit = js.native
  def writeFile(fname: String, data: js.Any, encoding: String, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  def writeFile(fname: String, data: js.Any, encoding: Null, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  def writeFileSync(fname: String, data: js.Any, encoding: String, flag: FileFlag, mode: Double): Unit = js.native
  def writeFileSync(fname: String, data: js.Any, encoding: Null, flag: FileFlag, mode: Double): Unit = js.native
}

