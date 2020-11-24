package typings.browserfs.fileSystemMod

import org.scalablytyped.runtime.StringDictionary
import typings.browserfs.fileFlagMod.FileFlag
import typings.browserfs.fileMod.File
import typings.browserfs.nodeFsStatsMod.default
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystem extends js.Object {
  
  /**
    * **Supplemental**: Asynchronously append data to a file, creating the file if
    * it not yet exists.
    */
  def appendFile(fname: String, data: String, encoding: String, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  def appendFile(fname: String, data: String, encoding: Null, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  def appendFile(fname: String, data: Buffer, encoding: String, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  def appendFile(fname: String, data: Buffer, encoding: Null, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  
  /**
    * **Supplemental**: Synchronously append data to a file, creating the file if
    * it not yet exists.
    */
  def appendFileSync(fname: String, data: String, encoding: String, flag: FileFlag, mode: Double): Unit = js.native
  def appendFileSync(fname: String, data: String, encoding: Null, flag: FileFlag, mode: Double): Unit = js.native
  def appendFileSync(fname: String, data: Buffer, encoding: String, flag: FileFlag, mode: Double): Unit = js.native
  def appendFileSync(fname: String, data: Buffer, encoding: Null, flag: FileFlag, mode: Double): Unit = js.native
  
  /**
    * **Optional**: Asynchronous `chmod` or `lchmod`.
    * @param isLchmod `True` if `lchmod`, false if `chmod`. Has no
    *   bearing on result if links aren't supported.
    */
  def chmod(p: String, isLchmod: Boolean, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  
  /**
    * **Optional**: Synchronous `chmod` or `lchmod`.
    * @param isLchmod `True` if `lchmod`, false if `chmod`. Has no
    *   bearing on result if links aren't supported.
    */
  def chmodSync(p: String, isLchmod: Boolean, mode: Double): Unit = js.native
  
  /**
    * **Optional**: Asynchronous `chown` or `lchown`.
    * @param isLchown `True` if `lchown`, false if `chown`. Has no
    *   bearing on result if links aren't supported.
    */
  def chown(p: String, isLchown: Boolean, uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
  
  /**
    * **Optional**: Synchronous `chown` or `lchown`.
    * @param isLchown `True` if `lchown`, false if `chown`. Has no
    *   bearing on result if links aren't supported.
    */
  def chownSync(p: String, isLchown: Boolean, uid: Double, gid: Double): Unit = js.native
  
  /**
    * **Optional**: Passes the following information to the callback:
    *
    * * Total number of bytes available on this file system.
    * * number of free bytes available on this file system.
    *
    * @todo This info is not available through the Node API. Perhaps we could do a
    *   polyfill of diskspace.js, or add a new Node API function.
    * @param path The path to the location that is being queried. Only
    *   useful for filesystems that support mount points.
    */
  def diskSpace(p: String, cb: js.Function2[/* total */ Double, /* free */ Double, _]): Unit = js.native
  
  /**
    * **Supplemental**: Test whether or not the given path exists by checking with
    * the file system. Then call the callback argument with either true or false.
    */
  def exists(p: String, cb: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
  
  /**
    * **Supplemental**: Test whether or not the given path exists by checking with
    * the file system.
    */
  def existsSync(p: String): Boolean = js.native
  
  /**
    * **Optional**: Returns the name of the file system.
    */
  def getName(): String = js.native
  
  /**
    * **Core**: Is this filesystem read-only?
    * @return True if this FileSystem is inherently read-only.
    */
  def isReadOnly(): Boolean = js.native
  
  /**
    * **Optional**: Asynchronous `link`.
    */
  def link(srcpath: String, dstpath: String, cb: BFSOneArgCallback): Unit = js.native
  
  /**
    * **Optional**: Synchronous `link`.
    */
  def linkSync(srcpath: String, dstpath: String): Unit = js.native
  
  /**
    * **Core**: Asynchronous `mkdir`.
    * @param mode Mode to make the directory using. Can be ignored if
    *   the filesystem doesn't support permissions.
    */
  def mkdir(p: String, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  
  /**
    * **Core**: Synchronous `mkdir`.
    * @param mode Mode to make the directory using. Can be ignored if
    *   the filesystem doesn't support permissions.
    */
  def mkdirSync(p: String, mode: Double): Unit = js.native
  
  /**
    * **Core**: Asynchronous file open.
    * @see http://www.manpagez.com/man/2/open/
    * @param flags Handles the complexity of the various file
    *   modes. See its API for more details.
    * @param mode Mode to use to open the file. Can be ignored if the
    *   filesystem doesn't support permissions.
    */
  def open(p: String, flag: FileFlag, mode: Double, cb: BFSCallback[File]): Unit = js.native
  
  /**
    * **Core**: Synchronous file open.
    * @see http://www.manpagez.com/man/2/open/
    * @param flags Handles the complexity of the various file
    *   modes. See its API for more details.
    * @param mode Mode to use to open the file. Can be ignored if the
    *   filesystem doesn't support permissions.
    */
  def openSync(p: String, flag: FileFlag, mode: Double): File = js.native
  
  /**
    * **Supplemental**: Asynchronously reads the entire contents of a file.
    * @param encoding If non-null, the file's contents should be decoded
    *   into a string using that encoding. Otherwise, if encoding is null, fetch
    *   the file's contents as a Buffer.
    * @param cb If no encoding is specified, then the raw buffer is returned.
    */
  def readFile(fname: String, encoding: String, flag: FileFlag, cb: BFSCallback[String | Buffer]): Unit = js.native
  def readFile(fname: String, encoding: Null, flag: FileFlag, cb: BFSCallback[String | Buffer]): Unit = js.native
  
  /**
    * **Supplemental**: Synchronously reads the entire contents of a file.
    * @param encoding If non-null, the file's contents should be decoded
    *   into a string using that encoding. Otherwise, if encoding is null, fetch
    *   the file's contents as a Buffer.
    */
  def readFileSync(fname: String, encoding: String, flag: FileFlag): js.Any = js.native
  def readFileSync(fname: String, encoding: Null, flag: FileFlag): js.Any = js.native
  
  /**
    * **Core**: Asynchronous `readdir`. Reads the contents of a directory.
    *
    * The callback gets two arguments `(err, files)` where `files` is an array of
    * the names of the files in the directory excluding `'.'` and `'..'`.
    */
  def readdir(p: String, cb: BFSCallback[js.Array[String]]): Unit = js.native
  
  /**
    * **Core**: Synchronous `readdir`. Reads the contents of a directory.
    */
  def readdirSync(p: String): js.Array[String] = js.native
  
  /**
    * **Optional**: Asynchronous readlink.
    */
  def readlink(p: String, cb: BFSCallback[String]): Unit = js.native
  
  /**
    * **Optional**: Synchronous readlink.
    */
  def readlinkSync(p: String): String = js.native
  
  /**
    * **Supplemental**: Asynchronous `realpath`. The callback gets two arguments
    * `(err, resolvedPath)`.
    *
    * Note that the Node API will resolve `path` to an absolute path.
    * @param cache An object literal of mapped paths that can be used to
    *   force a specific path resolution or avoid additional `fs.stat` calls for
    *   known real paths. If not supplied by the user, it'll be an empty object.
    */
  def realpath(p: String, cache: StringDictionary[String], cb: BFSCallback[String]): Unit = js.native
  
  /**
    * **Supplemental**: Synchronous `realpath`.
    *
    * Note that the Node API will resolve `path` to an absolute path.
    * @param cache An object literal of mapped paths that can be used to
    *   force a specific path resolution or avoid additional `fs.stat` calls for
    *   known real paths. If not supplied by the user, it'll be an empty object.
    */
  def realpathSync(p: String, cache: StringDictionary[String]): String = js.native
  
  /**
    * **Core**: Asynchronous rename. No arguments other than a possible exception
    * are given to the completion callback.
    */
  def rename(oldPath: String, newPath: String, cb: BFSOneArgCallback): Unit = js.native
  
  /**
    * **Core**: Synchronous rename.
    */
  def renameSync(oldPath: String, newPath: String): Unit = js.native
  
  /**
    * **Core**: Asynchronous `rmdir`.
    */
  def rmdir(p: String, cb: BFSOneArgCallback): Unit = js.native
  
  /**
    * **Core**: Synchronous `rmdir`.
    */
  def rmdirSync(p: String): Unit = js.native
  
  /**
    * **Core**: Asynchronous `stat` or `lstat`.
    * @param isLstat True if this is `lstat`, false if this is regular
    *   `stat`.
    */
  def stat(p: String, isLstat: Boolean, cb: BFSCallback[default]): Unit = js.native
  def stat(p: String, isLstat: Null, cb: BFSCallback[default]): Unit = js.native
  
  /**
    * **Core**: Synchronous `stat` or `lstat`.
    * @param isLstat True if this is `lstat`, false if this is regular
    *   `stat`.
    */
  def statSync(p: String): default = js.native
  def statSync(p: String, isLstat: Boolean): default = js.native
  
  /**
    * **Core**: Does the filesystem support optional symlink/hardlink-related
    *   commands?
    * @return True if the FileSystem supports the optional
    *   symlink/hardlink-related commands.
    */
  def supportsLinks(): Boolean = js.native
  
  /**
    * **Core**: Does the filesystem support optional property-related commands?
    * @return True if the FileSystem supports the optional
    *   property-related commands (permissions, utimes, etc).
    */
  def supportsProps(): Boolean = js.native
  
  /**
    * **Core**: Does the filesystem support the optional synchronous interface?
    * @return True if the FileSystem supports synchronous operations.
    */
  def supportsSynch(): Boolean = js.native
  
  /**
    * **Optional**: Asynchronous `symlink`.
    * @param type can be either `'dir'` or `'file'`
    */
  def symlink(srcpath: String, dstpath: String, `type`: String, cb: BFSOneArgCallback): Unit = js.native
  
  /**
    * **Optional**: Synchronous `symlink`.
    * @param type can be either `'dir'` or `'file'`
    */
  def symlinkSync(srcpath: String, dstpath: String, `type`: String): Unit = js.native
  
  /**
    * **Supplemental**: Asynchronous `truncate`.
    */
  def truncate(p: String, len: Double, cb: BFSOneArgCallback): Unit = js.native
  
  /**
    * **Supplemental**: Synchronous `truncate`.
    */
  def truncateSync(p: String, len: Double): Unit = js.native
  
  /**
    * **Core**: Asynchronous `unlink`.
    */
  def unlink(p: String, cb: BFSOneArgCallback): Unit = js.native
  
  /**
    * **Core**: Synchronous `unlink`.
    */
  def unlinkSync(p: String): Unit = js.native
  
  /**
    * **Optional**: Change file timestamps of the file referenced by the supplied
    * path.
    */
  def utimes(p: String, atime: Date, mtime: Date, cb: BFSOneArgCallback): Unit = js.native
  
  /**
    * **Optional**: Change file timestamps of the file referenced by the supplied
    * path.
    */
  def utimesSync(p: String, atime: Date, mtime: Date): Unit = js.native
  
  /**
    * **Supplemental**: Asynchronously writes data to a file, replacing the file
    * if it already exists.
    *
    * The encoding option is ignored if data is a buffer.
    */
  def writeFile(fname: String, data: js.Any, encoding: String, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  def writeFile(fname: String, data: js.Any, encoding: Null, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  
  /**
    * **Supplemental**: Synchronously writes data to a file, replacing the file
    * if it already exists.
    *
    * The encoding option is ignored if data is a buffer.
    */
  def writeFileSync(fname: String, data: String, encoding: String, flag: FileFlag, mode: Double): Unit = js.native
  def writeFileSync(fname: String, data: String, encoding: Null, flag: FileFlag, mode: Double): Unit = js.native
  def writeFileSync(fname: String, data: Buffer, encoding: String, flag: FileFlag, mode: Double): Unit = js.native
  def writeFileSync(fname: String, data: Buffer, encoding: Null, flag: FileFlag, mode: Double): Unit = js.native
}
