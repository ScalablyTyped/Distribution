package typings.browserfs

import org.scalablytyped.runtime.StringDictionary
import typings.browserfs.anon.AutoClose
import typings.browserfs.anon.Encoding
import typings.browserfs.anon.EncodingFlag
import typings.browserfs.anon.Fd
import typings.browserfs.anon.Flag
import typings.browserfs.anon.Interval
import typings.browserfs.anon.Mode
import typings.browserfs.anon.Persistent
import typings.browserfs.anon.TypeofFS
import typings.browserfs.anon.TypeofStats
import typings.browserfs.apiErrorMod.ApiError
import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.BFSOneArgCallback
import typings.browserfs.fileSystemMod.BFSThreeArgCallback
import typings.browserfs.fileSystemMod.FileSystem
import typings.node.Buffer
import typings.node.fsMod.FSWatcher
import typings.node.fsMod.ReadStream
import typings.node.fsMod.WriteStream
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fSMod {
  
  @JSImport("browserfs/dist/node/core/FS", JSImport.Default)
  @js.native
  class default () extends FS
  /* static members */
  object default {
    
    @JSImport("browserfs/dist/node/core/FS", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("browserfs/dist/node/core/FS", "default.Stats")
    @js.native
    def Stats: TypeofStats = js.native
    @scala.inline
    def Stats_=(x: TypeofStats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stats")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait FS extends StObject {
    
    var F_OK: Double = js.native
    
    var R_OK: Double = js.native
    
    var W_OK: Double = js.native
    
    var X_OK: Double = js.native
    
    def _toUnixTimestamp(time: Double): Double = js.native
    /**
      * converts Date or number to a fractional UNIX timestamp
      * Grabbed from NodeJS sources (lib/fs.js)
      */
    def _toUnixTimestamp(time: Date): Double = js.native
    
    def access(path: String, callback: js.Function1[/* err */ ApiError, Unit]): Unit = js.native
    def access(path: String, mode: Double, callback: js.Function1[/* err */ ApiError, Unit]): Unit = js.native
    
    def accessSync(path: String): Unit = js.native
    def accessSync(path: String, mode: Double): Unit = js.native
    
    /**
      * Asynchronously append data to a file, creating the file if it not yet
      * exists.
      *
      * @example Usage example
      *   fs.appendFile('message.txt', 'data to append', function (err) {
      *     if (err) throw err;
      *     console.log('The "data to append" was appended to file!');
      *   });
      * @param filename
      * @param data
      * @param options
      * @option options [String] encoding Defaults to `'utf8'`.
      * @option options [Number] mode Defaults to `0644`.
      * @option options [String] flag Defaults to `'a'`.
      * @param callback
      */
    def appendFile(filename: String, data: js.Any): Unit = js.native
    def appendFile(filename: String, data: js.Any, cb: BFSOneArgCallback): Unit = js.native
    def appendFile(filename: String, data: js.Any, encoding: String): Unit = js.native
    def appendFile(filename: String, data: js.Any, encoding: String, cb: BFSOneArgCallback): Unit = js.native
    def appendFile(filename: String, data: js.Any, options: js.UndefOr[scala.Nothing], cb: BFSOneArgCallback): Unit = js.native
    def appendFile(filename: String, data: js.Any, options: EncodingFlag): Unit = js.native
    def appendFile(filename: String, data: js.Any, options: EncodingFlag, cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Asynchronously append data to a file, creating the file if it not yet
      * exists.
      *
      * @example Usage example
      *   fs.appendFile('message.txt', 'data to append', function (err) {
      *     if (err) throw err;
      *     console.log('The "data to append" was appended to file!');
      *   });
      * @param filename
      * @param data
      * @param options
      * @option options [String] encoding Defaults to `'utf8'`.
      * @option options [Number] mode Defaults to `0644`.
      * @option options [String] flag Defaults to `'a'`.
      */
    def appendFileSync(filename: String, data: js.Any): Unit = js.native
    def appendFileSync(filename: String, data: js.Any, encoding: String): Unit = js.native
    def appendFileSync(filename: String, data: js.Any, options: EncodingFlag): Unit = js.native
    
    def chmod(path: String, mode: String): Unit = js.native
    def chmod(path: String, mode: String, cb: BFSOneArgCallback): Unit = js.native
    /**
      * Asynchronous `chmod`.
      * @param path
      * @param mode
      * @param callback
      */
    def chmod(path: String, mode: Double): Unit = js.native
    def chmod(path: String, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Synchronous `chmod`.
      * @param path
      * @param mode
      */
    def chmodSync(path: String, mode: String): Unit = js.native
    def chmodSync(path: String, mode: Double): Unit = js.native
    
    /**
      * Asynchronous `chown`.
      * @param path
      * @param uid
      * @param gid
      * @param callback
      */
    def chown(path: String, uid: Double, gid: Double): Unit = js.native
    def chown(path: String, uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Synchronous `chown`.
      * @param path
      * @param uid
      * @param gid
      */
    def chownSync(path: String, uid: Double, gid: Double): Unit = js.native
    
    /**
      * Asynchronous close.
      * @param fd
      * @param callback
      */
    def close(fd: Double): Unit = js.native
    def close(fd: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* private */ def closeFd(fd: js.Any): js.Any = js.native
    
    /**
      * Synchronous close.
      * @param fd
      */
    def closeSync(fd: Double): Unit = js.native
    
    def createReadStream(path: String): ReadStream = js.native
    def createReadStream(path: String, options: AutoClose): ReadStream = js.native
    
    def createWriteStream(path: String): WriteStream = js.native
    def createWriteStream(path: String, options: Fd): WriteStream = js.native
    
    /**
      * Test whether or not the given path exists by checking with the file system.
      * Then call the callback argument with either true or false.
      * @example Sample invocation
      *   fs.exists('/etc/passwd', function (exists) {
      *     util.debug(exists ? "it's there" : "no passwd!");
      *   });
      * @param path
      * @param callback
      */
    def exists(path: String): Unit = js.native
    def exists(path: String, cb: js.Function1[/* exists */ Boolean, _]): Unit = js.native
    
    /**
      * Test whether or not the given path exists by checking with the file system.
      * @param path
      * @return [boolean]
      */
    def existsSync(path: String): Boolean = js.native
    
    /**
      * Asynchronous `fchmod`.
      * @param fd
      * @param mode
      * @param callback
      */
    def fchmod(fd: Double, mode: String, cb: BFSOneArgCallback): Unit = js.native
    def fchmod(fd: Double, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    
    def fchmodSync(fd: Double, mode: String): Unit = js.native
    /**
      * Synchronous `fchmod`.
      * @param fd
      * @param mode
      */
    def fchmodSync(fd: Double, mode: Double): Unit = js.native
    
    /**
      * Asynchronous `fchown`.
      * @param fd
      * @param uid
      * @param gid
      * @param callback
      */
    def fchown(fd: Double, uid: Double, gid: Double): Unit = js.native
    def fchown(fd: Double, uid: Double, gid: Double, callback: BFSOneArgCallback): Unit = js.native
    
    /**
      * Synchronous `fchown`.
      * @param fd
      * @param uid
      * @param gid
      */
    def fchownSync(fd: Double, uid: Double, gid: Double): Unit = js.native
    
    /* private */ def fd2file(fd: js.Any): js.Any = js.native
    
    var fdMap: js.Any = js.native
    
    /**
      * Asynchronous fdatasync.
      * @param fd
      * @param callback
      */
    def fdatasync(fd: Double): Unit = js.native
    def fdatasync(fd: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Synchronous fdatasync.
      * @param fd
      */
    def fdatasyncSync(fd: Double): Unit = js.native
    
    /**
      * Asynchronous `fstat`.
      * `fstat()` is identical to `stat()`, except that the file to be stat-ed is
      * specified by the file descriptor `fd`.
      * @param fd
      * @param callback
      */
    def fstat(fd: Double): Unit = js.native
    def fstat(fd: Double, cb: BFSCallback[typings.browserfs.nodeFsStatsMod.default]): Unit = js.native
    
    /**
      * Synchronous `fstat`.
      * `fstat()` is identical to `stat()`, except that the file to be stat-ed is
      * specified by the file descriptor `fd`.
      * @param fd
      * @return [BrowserFS.node.fs.Stats]
      */
    def fstatSync(fd: Double): typings.browserfs.nodeFsStatsMod.default = js.native
    
    /**
      * Asynchronous fsync.
      * @param fd
      * @param callback
      */
    def fsync(fd: Double): Unit = js.native
    def fsync(fd: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Synchronous fsync.
      * @param fd
      */
    def fsyncSync(fd: Double): Unit = js.native
    
    /**
      * Asynchronous ftruncate.
      * @param fd
      * @param len
      * @param callback
      */
    def ftruncate(fd: Double): Unit = js.native
    def ftruncate(fd: Double, cb: BFSOneArgCallback): Unit = js.native
    def ftruncate(fd: Double, len: js.UndefOr[scala.Nothing], cb: BFSOneArgCallback): Unit = js.native
    def ftruncate(fd: Double, len: Double): Unit = js.native
    def ftruncate(fd: Double, len: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Synchronous ftruncate.
      * @param fd
      * @param len
      */
    def ftruncateSync(fd: Double): Unit = js.native
    def ftruncateSync(fd: Double, len: Double): Unit = js.native
    
    /**
      * Change the file timestamps of a file referenced by the supplied file
      * descriptor.
      * @param fd
      * @param atime
      * @param mtime
      * @param callback
      */
    def futimes(fd: Double, atime: Double, mtime: Double): Unit = js.native
    def futimes(fd: Double, atime: Double, mtime: Double, cb: BFSOneArgCallback): Unit = js.native
    def futimes(fd: Double, atime: Double, mtime: Date): Unit = js.native
    def futimes(fd: Double, atime: Double, mtime: Date, cb: BFSOneArgCallback): Unit = js.native
    def futimes(fd: Double, atime: Date, mtime: Double): Unit = js.native
    def futimes(fd: Double, atime: Date, mtime: Double, cb: BFSOneArgCallback): Unit = js.native
    def futimes(fd: Double, atime: Date, mtime: Date): Unit = js.native
    def futimes(fd: Double, atime: Date, mtime: Date, cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Change the file timestamps of a file referenced by the supplied file
      * descriptor.
      * @param fd
      * @param atime
      * @param mtime
      */
    def futimesSync(fd: Double, atime: Double, mtime: Double): Unit = js.native
    def futimesSync(fd: Double, atime: Double, mtime: Date): Unit = js.native
    def futimesSync(fd: Double, atime: Date, mtime: Double): Unit = js.native
    def futimesSync(fd: Double, atime: Date, mtime: Date): Unit = js.native
    
    /* private */ def getFdForFile(file: js.Any): js.Any = js.native
    
    /**
      * **NONSTANDARD**: Grab the FileSystem instance that backs this API.
      * @return [BrowserFS.FileSystem | null] Returns null if the file system has
      *   not been initialized.
      */
    def getRootFS(): FileSystem | Null = js.native
    
    def initialize(rootFS: FileSystem): FileSystem = js.native
    
    def lchmod(path: String, mode: String): Unit = js.native
    def lchmod(path: String, mode: String, cb: BFSOneArgCallback): Unit = js.native
    /**
      * Asynchronous `lchmod`.
      * @param path
      * @param mode
      * @param callback
      */
    def lchmod(path: String, mode: Double): Unit = js.native
    def lchmod(path: String, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    
    def lchmodSync(path: String, mode: String): Unit = js.native
    /**
      * Synchronous `lchmod`.
      * @param path
      * @param mode
      */
    def lchmodSync(path: String, mode: Double): Unit = js.native
    
    /**
      * Asynchronous `lchown`.
      * @param path
      * @param uid
      * @param gid
      * @param callback
      */
    def lchown(path: String, uid: Double, gid: Double): Unit = js.native
    def lchown(path: String, uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Synchronous `lchown`.
      * @param path
      * @param uid
      * @param gid
      */
    def lchownSync(path: String, uid: Double, gid: Double): Unit = js.native
    
    /**
      * Asynchronous `link`.
      * @param srcpath
      * @param dstpath
      * @param callback
      */
    def link(srcpath: String, dstpath: String): Unit = js.native
    def link(srcpath: String, dstpath: String, cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Synchronous `link`.
      * @param srcpath
      * @param dstpath
      */
    def linkSync(srcpath: String, dstpath: String): Unit = js.native
    
    /**
      * Asynchronous `lstat`.
      * `lstat()` is identical to `stat()`, except that if path is a symbolic link,
      * then the link itself is stat-ed, not the file that it refers to.
      * @param path
      * @param callback
      */
    def lstat(path: String): Unit = js.native
    def lstat(path: String, cb: BFSCallback[typings.browserfs.nodeFsStatsMod.default]): Unit = js.native
    
    /**
      * Synchronous `lstat`.
      * `lstat()` is identical to `stat()`, except that if path is a symbolic link,
      * then the link itself is stat-ed, not the file that it refers to.
      * @param path
      * @return [BrowserFS.node.fs.Stats]
      */
    def lstatSync(path: String): typings.browserfs.nodeFsStatsMod.default = js.native
    
    /**
      * Asynchronous `mkdir`.
      * @param path
      * @param mode defaults to `0777`
      * @param callback
      */
    def mkdir(path: String): Unit = js.native
    def mkdir(path: String, mode: js.UndefOr[scala.Nothing], cb: BFSOneArgCallback): Unit = js.native
    def mkdir(path: String, mode: js.Any): Unit = js.native
    def mkdir(path: String, mode: js.Any, cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Synchronous `mkdir`.
      * @param path
      * @param mode defaults to `0777`
      */
    def mkdirSync(path: String): Unit = js.native
    def mkdirSync(path: String, mode: String): Unit = js.native
    def mkdirSync(path: String, mode: Double): Unit = js.native
    
    var nextFd: js.Any = js.native
    
    /**
      * Asynchronous file open.
      * Exclusive mode ensures that path is newly created.
      *
      * `flags` can be:
      *
      * * `'r'` - Open file for reading. An exception occurs if the file does not exist.
      * * `'r+'` - Open file for reading and writing. An exception occurs if the file does not exist.
      * * `'rs'` - Open file for reading in synchronous mode. Instructs the filesystem to not cache writes.
      * * `'rs+'` - Open file for reading and writing, and opens the file in synchronous mode.
      * * `'w'` - Open file for writing. The file is created (if it does not exist) or truncated (if it exists).
      * * `'wx'` - Like 'w' but opens the file in exclusive mode.
      * * `'w+'` - Open file for reading and writing. The file is created (if it does not exist) or truncated (if it exists).
      * * `'wx+'` - Like 'w+' but opens the file in exclusive mode.
      * * `'a'` - Open file for appending. The file is created if it does not exist.
      * * `'ax'` - Like 'a' but opens the file in exclusive mode.
      * * `'a+'` - Open file for reading and appending. The file is created if it does not exist.
      * * `'ax+'` - Like 'a+' but opens the file in exclusive mode.
      *
      * @see http://www.manpagez.com/man/2/open/
      * @param path
      * @param flags
      * @param mode defaults to `0644`
      * @param callback
      */
    def open(path: String, flag: String): Unit = js.native
    def open(path: String, flag: String, cb: BFSCallback[Double]): Unit = js.native
    def open(path: String, flag: String, mode: String): Unit = js.native
    def open(path: String, flag: String, mode: String, cb: BFSCallback[Double]): Unit = js.native
    def open(path: String, flag: String, mode: Double): Unit = js.native
    def open(path: String, flag: String, mode: Double, cb: BFSCallback[Double]): Unit = js.native
    
    /**
      * Synchronous file open.
      * @see http://www.manpagez.com/man/2/open/
      * @param path
      * @param flags
      * @param mode defaults to `0644`
      * @return [BrowserFS.File]
      */
    def openSync(path: String, flag: String): Double = js.native
    def openSync(path: String, flag: String, mode: String): Double = js.native
    def openSync(path: String, flag: String, mode: Double): Double = js.native
    
    def read(fd: Double, buffer: Buffer, offset: Double, length: Double): Unit = js.native
    def read(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Unit = js.native
    def read(
      fd: Double,
      buffer: Buffer,
      offset: Double,
      length: Double,
      position: Double,
      cb: BFSThreeArgCallback[Double, Buffer]
    ): Unit = js.native
    def read(
      fd: Double,
      buffer: Buffer,
      offset: Double,
      length: Double,
      position: Null,
      cb: BFSThreeArgCallback[Double, Buffer]
    ): Unit = js.native
    /**
      * Read data from the file specified by `fd`.
      * @param buffer The buffer that the data will be
      *   written to.
      * @param offset The offset within the buffer where writing will
      *   start.
      * @param length An integer specifying the number of bytes to read.
      * @param position An integer specifying where to begin reading from
      *   in the file. If position is null, data will be read from the current file
      *   position.
      * @param callback The number is the number of bytes read
      */
    def read(fd: Double, length: Double, position: Double, encoding: String): Unit = js.native
    def read(
      fd: Double,
      length: Double,
      position: Double,
      encoding: String,
      cb: BFSThreeArgCallback[String, Double]
    ): Unit = js.native
    def read(fd: Double, length: Double, position: Null, encoding: String): Unit = js.native
    def read(
      fd: Double,
      length: Double,
      position: Null,
      encoding: String,
      cb: BFSThreeArgCallback[String, Double]
    ): Unit = js.native
    
    /**
      * Asynchronously reads the entire contents of a file.
      * @example Usage example
      *   fs.readFile('/etc/passwd', function (err, data) {
      *     if (err) throw err;
      *     console.log(data);
      *   });
      * @param filename
      * @param options
      * @option options [String] encoding The string encoding for the file contents. Defaults to `null`.
      * @option options [String] flag Defaults to `'r'`.
      * @param callback If no encoding is specified, then the raw buffer is returned.
      */
    def readFile(filename: String, cb: BFSCallback[Buffer]): Unit = js.native
    def readFile(filename: String, encoding: String): Unit = js.native
    def readFile(filename: String, encoding: String, cb: BFSCallback[String]): Unit = js.native
    def readFile(filename: String, options: Encoding, callback: BFSCallback[String]): Unit = js.native
    def readFile(filename: String, options: Flag, callback: BFSCallback[Buffer]): Unit = js.native
    
    /**
      * Synchronously reads the entire contents of a file.
      * @param filename
      * @param options
      * @option options [String] encoding The string encoding for the file contents. Defaults to `null`.
      * @option options [String] flag Defaults to `'r'`.
      * @return [String | BrowserFS.node.Buffer]
      */
    def readFileSync(filename: String): Buffer = js.native
    def readFileSync(filename: String, encoding: String): String = js.native
    def readFileSync(filename: String, options: Encoding): String = js.native
    def readFileSync(filename: String, options: Flag): Buffer = js.native
    
    def readSync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
    /**
      * Read data from the file specified by `fd`.
      * @param fd
      * @param buffer The buffer that the data will be
      *   written to.
      * @param offset The offset within the buffer where writing will
      *   start.
      * @param length An integer specifying the number of bytes to read.
      * @param position An integer specifying where to begin reading from
      *   in the file. If position is null, data will be read from the current file
      *   position.
      * @return [Number]
      */
    def readSync(fd: Double, length: Double, position: Double, encoding: String): String = js.native
    
    /**
      * Asynchronous `readdir`. Reads the contents of a directory.
      * The callback gets two arguments `(err, files)` where `files` is an array of
      * the names of the files in the directory excluding `'.'` and `'..'`.
      * @param path
      * @param callback
      */
    def readdir(path: String): Unit = js.native
    def readdir(path: String, cb: BFSCallback[js.Array[String]]): Unit = js.native
    
    /**
      * Synchronous `readdir`. Reads the contents of a directory.
      * @param path
      * @return [String[]]
      */
    def readdirSync(path: String): js.Array[String] = js.native
    
    /**
      * Asynchronous readlink.
      * @param path
      * @param callback
      */
    def readlink(path: String): Unit = js.native
    def readlink(path: String, cb: BFSCallback[String]): Unit = js.native
    
    /**
      * Synchronous readlink.
      * @param path
      * @return [String]
      */
    def readlinkSync(path: String): String = js.native
    
    /**
      * Asynchronous `realpath`. The callback gets two arguments
      * `(err, resolvedPath)`. May use `process.cwd` to resolve relative paths.
      *
      * @example Usage example
      *   let cache = {'/etc':'/private/etc'};
      *   fs.realpath('/etc/passwd', cache, function (err, resolvedPath) {
      *     if (err) throw err;
      *     console.log(resolvedPath);
      *   });
      *
      * @param path
      * @param cache An object literal of mapped paths that can be used to
      *   force a specific path resolution or avoid additional `fs.stat` calls for
      *   known real paths.
      * @param callback
      */
    def realpath(path: String): Unit = js.native
    def realpath(path: String, cache: StringDictionary[String], cb: BFSCallback[String]): Unit = js.native
    def realpath(path: String, cb: BFSCallback[String]): Unit = js.native
    
    /**
      * Synchronous `realpath`.
      * @param path
      * @param cache An object literal of mapped paths that can be used to
      *   force a specific path resolution or avoid additional `fs.stat` calls for
      *   known real paths.
      * @return [String]
      */
    def realpathSync(path: String): String = js.native
    def realpathSync(path: String, cache: StringDictionary[String]): String = js.native
    
    /**
      * Asynchronous rename. No arguments other than a possible exception are given
      * to the completion callback.
      * @param oldPath
      * @param newPath
      * @param callback
      */
    def rename(oldPath: String, newPath: String): Unit = js.native
    def rename(oldPath: String, newPath: String, cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Synchronous rename.
      * @param oldPath
      * @param newPath
      */
    def renameSync(oldPath: String, newPath: String): Unit = js.native
    
    /**
      * Asynchronous `rmdir`.
      * @param path
      * @param callback
      */
    def rmdir(path: String): Unit = js.native
    def rmdir(path: String, cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Synchronous `rmdir`.
      * @param path
      */
    def rmdirSync(path: String): Unit = js.native
    
    var root: js.Any = js.native
    
    /**
      * Asynchronous `stat`.
      * @param path
      * @param callback
      */
    def stat(path: String): Unit = js.native
    def stat(path: String, cb: BFSCallback[typings.browserfs.nodeFsStatsMod.default]): Unit = js.native
    
    /**
      * Synchronous `stat`.
      * @param path
      * @return [BrowserFS.node.fs.Stats]
      */
    def statSync(path: String): typings.browserfs.nodeFsStatsMod.default = js.native
    
    /**
      * Asynchronous `symlink`.
      * @param srcpath
      * @param dstpath
      * @param type can be either `'dir'` or `'file'` (default is `'file'`)
      * @param callback
      */
    def symlink(srcpath: String, dstpath: String): Unit = js.native
    def symlink(srcpath: String, dstpath: String, cb: BFSOneArgCallback): Unit = js.native
    def symlink(srcpath: String, dstpath: String, `type`: js.UndefOr[scala.Nothing], cb: BFSOneArgCallback): Unit = js.native
    def symlink(srcpath: String, dstpath: String, `type`: String): Unit = js.native
    def symlink(srcpath: String, dstpath: String, `type`: String, cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Synchronous `symlink`.
      * @param srcpath
      * @param dstpath
      * @param type can be either `'dir'` or `'file'` (default is `'file'`)
      */
    def symlinkSync(srcpath: String, dstpath: String): Unit = js.native
    def symlinkSync(srcpath: String, dstpath: String, `type`: String): Unit = js.native
    
    /**
      * Asynchronous `truncate`.
      * @param path
      * @param len
      * @param callback
      */
    def truncate(path: String): Unit = js.native
    def truncate(path: String, cb: BFSOneArgCallback): Unit = js.native
    def truncate(path: String, len: Double): Unit = js.native
    def truncate(path: String, len: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Synchronous `truncate`.
      * @param path
      * @param len
      */
    def truncateSync(path: String): Unit = js.native
    def truncateSync(path: String, len: Double): Unit = js.native
    
    /**
      * Asynchronous `unlink`.
      * @param path
      * @param callback
      */
    def unlink(path: String): Unit = js.native
    def unlink(path: String, cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Synchronous `unlink`.
      * @param path
      */
    def unlinkSync(path: String): Unit = js.native
    
    def unwatchFile(filename: String): Unit = js.native
    def unwatchFile(
      filename: String,
      listener: js.Function2[
          /* curr */ typings.browserfs.nodeFsStatsMod.default, 
          /* prev */ typings.browserfs.nodeFsStatsMod.default, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Change file timestamps of the file referenced by the supplied path.
      * @param path
      * @param atime
      * @param mtime
      * @param callback
      */
    def utimes(path: String, atime: Double, mtime: Double): Unit = js.native
    def utimes(path: String, atime: Double, mtime: Double, cb: BFSOneArgCallback): Unit = js.native
    def utimes(path: String, atime: Double, mtime: Date): Unit = js.native
    def utimes(path: String, atime: Double, mtime: Date, cb: BFSOneArgCallback): Unit = js.native
    def utimes(path: String, atime: Date, mtime: Double): Unit = js.native
    def utimes(path: String, atime: Date, mtime: Double, cb: BFSOneArgCallback): Unit = js.native
    def utimes(path: String, atime: Date, mtime: Date): Unit = js.native
    def utimes(path: String, atime: Date, mtime: Date, cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Change file timestamps of the file referenced by the supplied path.
      * @param path
      * @param atime
      * @param mtime
      */
    def utimesSync(path: String, atime: Double, mtime: Double): Unit = js.native
    def utimesSync(path: String, atime: Double, mtime: Date): Unit = js.native
    def utimesSync(path: String, atime: Date, mtime: Double): Unit = js.native
    def utimesSync(path: String, atime: Date, mtime: Date): Unit = js.native
    
    def watch(filename: String): FSWatcher = js.native
    def watch(filename: String, listener: js.Function2[/* event */ String, /* filename */ String, _]): FSWatcher = js.native
    def watch(filename: String, options: Persistent): FSWatcher = js.native
    def watch(
      filename: String,
      options: Persistent,
      listener: js.Function2[/* event */ String, /* filename */ String, _]
    ): FSWatcher = js.native
    
    def watchFile(
      filename: String,
      listener: js.Function2[
          /* curr */ typings.browserfs.nodeFsStatsMod.default, 
          /* prev */ typings.browserfs.nodeFsStatsMod.default, 
          Unit
        ]
    ): Unit = js.native
    def watchFile(
      filename: String,
      options: Interval,
      listener: js.Function2[
          /* curr */ typings.browserfs.nodeFsStatsMod.default, 
          /* prev */ typings.browserfs.nodeFsStatsMod.default, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * For unit testing. Passes all incoming callbacks to cbWrapper for wrapping.
      */
    def wrapCallbacks(cbWrapper: js.Function2[/* cb */ js.Function, /* args */ Double, js.Function]): Unit = js.native
    
    /**
      * Write buffer to the file specified by `fd`.
      * Note that it is unsafe to use fs.write multiple times on the same file
      * without waiting for the callback.
      * @param fd
      * @param buffer Buffer containing the data to write to
      *   the file.
      * @param offset Offset in the buffer to start reading data from.
      * @param length The amount of bytes to write to the file.
      * @param position Offset from the beginning of the file where this
      *   data should be written. If position is null, the data will be written at
      *   the current position.
      * @param callback The number specifies the number of bytes written into the file.
      */
    def write(fd: Double, buffer: Buffer, offset: Double, length: Double): Unit = js.native
    def write(
      fd: Double,
      buffer: Buffer,
      offset: Double,
      length: Double,
      cb: BFSThreeArgCallback[Double, Buffer]
    ): Unit = js.native
    def write(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Unit = js.native
    def write(
      fd: Double,
      buffer: Buffer,
      offset: Double,
      length: Double,
      position: Double,
      cb: BFSThreeArgCallback[Double, Buffer]
    ): Unit = js.native
    def write(
      fd: Double,
      buffer: Buffer,
      offset: Double,
      length: Double,
      position: Null,
      cb: BFSThreeArgCallback[Double, Buffer]
    ): Unit = js.native
    def write(fd: Double, data: js.Any): Unit = js.native
    def write(fd: Double, data: js.Any, cb: BFSThreeArgCallback[Double, String]): Unit = js.native
    def write(fd: Double, data: js.Any, position: Double): Unit = js.native
    def write(fd: Double, data: js.Any, position: Double, cb: BFSThreeArgCallback[Double, String]): Unit = js.native
    def write(fd: Double, data: js.Any, position: Double, encoding: String): Unit = js.native
    def write(
      fd: Double,
      data: js.Any,
      position: Double,
      encoding: String,
      cb: BFSThreeArgCallback[Double, String]
    ): Unit = js.native
    def write(fd: Double, data: js.Any, position: Null, cb: BFSThreeArgCallback[Double, String]): Unit = js.native
    def write(fd: Double, data: js.Any, position: Null, encoding: String): Unit = js.native
    def write(
      fd: Double,
      data: js.Any,
      position: Null,
      encoding: String,
      cb: BFSThreeArgCallback[Double, String]
    ): Unit = js.native
    
    /**
      * Asynchronously writes data to a file, replacing the file if it already
      * exists.
      *
      * The encoding option is ignored if data is a buffer.
      *
      * @example Usage example
      *   fs.writeFile('message.txt', 'Hello Node', function (err) {
      *     if (err) throw err;
      *     console.log('It\'s saved!');
      *   });
      * @param filename
      * @param data
      * @param options
      * @option options [String] encoding Defaults to `'utf8'`.
      * @option options [Number] mode Defaults to `0644`.
      * @option options [String] flag Defaults to `'w'`.
      * @param callback
      */
    def writeFile(filename: String, data: js.Any): Unit = js.native
    def writeFile(filename: String, data: js.Any, cb: BFSOneArgCallback): Unit = js.native
    def writeFile(filename: String, data: js.Any, encoding: js.UndefOr[scala.Nothing], cb: BFSOneArgCallback): Unit = js.native
    def writeFile(filename: String, data: js.Any, encoding: String): Unit = js.native
    def writeFile(filename: String, data: js.Any, encoding: String, cb: BFSOneArgCallback): Unit = js.native
    def writeFile(filename: String, data: js.Any, options: Mode): Unit = js.native
    def writeFile(filename: String, data: js.Any, options: Mode, cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Synchronously writes data to a file, replacing the file if it already
      * exists.
      *
      * The encoding option is ignored if data is a buffer.
      * @param filename
      * @param data
      * @param options
      * @option options [String] encoding Defaults to `'utf8'`.
      * @option options [Number] mode Defaults to `0644`.
      * @option options [String] flag Defaults to `'w'`.
      */
    def writeFileSync(filename: String, data: js.Any): Unit = js.native
    def writeFileSync(filename: String, data: js.Any, encoding: String): Unit = js.native
    def writeFileSync(filename: String, data: js.Any, options: EncodingFlag): Unit = js.native
    
    /**
      * Write buffer to the file specified by `fd`.
      * Note that it is unsafe to use fs.write multiple times on the same file
      * without waiting for it to return.
      * @param fd
      * @param buffer Buffer containing the data to write to
      *   the file.
      * @param offset Offset in the buffer to start reading data from.
      * @param length The amount of bytes to write to the file.
      * @param position Offset from the beginning of the file where this
      *   data should be written. If position is null, the data will be written at
      *   the current position.
      */
    def writeSync(fd: Double, buffer: Buffer, offset: Double, length: Double): Double = js.native
    def writeSync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
    def writeSync(fd: Double, data: String): Double = js.native
    def writeSync(fd: Double, data: String, position: js.UndefOr[scala.Nothing], encoding: String): Double = js.native
    def writeSync(fd: Double, data: String, position: Double): Double = js.native
    def writeSync(fd: Double, data: String, position: Double, encoding: String): Double = js.native
    def writeSync(fd: Double, data: String, position: Null, encoding: String): Double = js.native
  }
  
  @js.native
  trait FSModule extends FS {
    
    /**
      * The FS constructor.
      */
    var FS: TypeofFS = js.native
    
    /**
      * Set the FS object backing the fs module.
      */
    def changeFSModule(newFs: FS): Unit = js.native
    
    /**
      * Retrieve the FS object backing the fs module.
      */
    def getFSModule(): FS = js.native
  }
}
