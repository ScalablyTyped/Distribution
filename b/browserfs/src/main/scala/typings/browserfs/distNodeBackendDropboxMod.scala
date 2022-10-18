package typings.browserfs

import org.scalablytyped.runtime.StringDictionary
import typings.browserfs.distNodeCoreFileFlagMod.FileFlag
import typings.browserfs.distNodeCoreFileMod.File
import typings.browserfs.distNodeCoreFileSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileSystemMod.BFSOneArgCallback
import typings.browserfs.distNodeCoreFileSystemMod.BFSThreeArgCallback
import typings.browserfs.distNodeCoreFileSystemMod.BaseFileSystem
import typings.browserfs.distNodeCoreFileSystemMod.FileSystem
import typings.browserfs.distNodeCoreFileSystemMod.FileSystemOptions
import typings.browserfs.distNodeCoreNodeFsStatsMod.FileType
import typings.dropboxjs.Dropbox.ApiError
import typings.dropboxjs.Dropbox.Client
import typings.dropboxjs.Dropbox.File.Stat
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeBackendDropboxMod {
  
  @JSImport("browserfs/dist/node/backend/Dropbox", JSImport.Default)
  @js.native
  open class default protected () extends DropboxFileSystem {
    /**
      * **Deprecated. Please use Dropbox.Create() method instead.**
      *
      * Constructs a Dropbox-backed file system using the *authenticated* DropboxJS client.
      *
      * Note that you must use the old v0.10 version of the Dropbox JavaScript SDK.
      */
    def this(client: Client) = this()
    def this(client: Client, deprecateMsg: Boolean) = this()
  }
  /* static members */
  object default {
    
    @JSImport("browserfs/dist/node/backend/Dropbox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new DropboxFileSystem instance with the given options.
      * Must be given an *authenticated* DropboxJS client from the old v0.10 version of the Dropbox JS SDK.
      */
    inline def Create(opts: DropboxFileSystemOptions, cb: BFSCallback[DropboxFileSystem]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("browserfs/dist/node/backend/Dropbox", "default.Name")
    @js.native
    val Name: String = js.native
    
    @JSImport("browserfs/dist/node/backend/Dropbox", "default.Options")
    @js.native
    val Options: FileSystemOptions = js.native
    
    inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  }
  
  @JSImport("browserfs/dist/node/backend/Dropbox", "DropboxFile")
  @js.native
  open class DropboxFile protected ()
    extends typings.browserfs.distNodeGenericPreloadFileMod.default[DropboxFileSystem]
       with File {
    def this(
      _fs: DropboxFileSystem,
      _path: String,
      _flag: FileFlag,
      _stat: typings.browserfs.distNodeCoreNodeFsStatsMod.default
    ) = this()
    def this(
      _fs: DropboxFileSystem,
      _path: String,
      _flag: FileFlag,
      _stat: typings.browserfs.distNodeCoreNodeFsStatsMod.default,
      contents: Buffer
    ) = this()
    
    /* InferMemberOverrides */
    override def chmod(mode: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chmodSync(mode: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def chown(uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chownSync(uid: Double, gid: Double): Unit = js.native
    
    /**
      * **Core**: Asynchronous close. Must be implemented by subclasses of this
      * class.
      * @param [Function(BrowserFS.ApiError)] cb
      */
    /* InferMemberOverrides */
    override def close(cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * **Core**: Synchronous close.
      */
    /* InferMemberOverrides */
    override def closeSync(): Unit = js.native
    
    /* InferMemberOverrides */
    override def datasync(cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def datasyncSync(): Unit = js.native
    
    /**
      * Get the current file position.
      *
      * We emulate the following bug mentioned in the Node documentation:
      * > On Linux, positional writes don't work when the file is opened in append
      *   mode. The kernel ignores the position argument and always appends the data
      *   to the end of the file.
      * @return [Number] The current file position.
      */
    /* InferMemberOverrides */
    override def getPos(): Double & js.UndefOr[Double] = js.native
    
    /**
      * Read data from the file.
      * @param [BrowserFS.node.Buffer] buffer The buffer that the data will be
      *   written to.
      * @param [Number] offset The offset within the buffer where writing will
      *   start.
      * @param [Number] length An integer specifying the number of bytes to read.
      * @param [Number] position An integer specifying where to begin reading from
      *   in the file. If position is null, data will be read from the current file
      *   position.
      * @param [Function(BrowserFS.ApiError, Number, BrowserFS.node.Buffer)] cb The
      *   number is the number of bytes read
      */
    /* InferMemberOverrides */
    override def read(
      buffer: Buffer,
      offset: Double,
      length: Double,
      position: Double,
      cb: BFSThreeArgCallback[Double, Buffer]
    ): Unit = js.native
    
    /**
      * Read data from the file.
      * @param [BrowserFS.node.Buffer] buffer The buffer that the data will be
      *   written to.
      * @param [Number] offset The offset within the buffer where writing will
      *   start.
      * @param [Number] length An integer specifying the number of bytes to read.
      * @param [Number] position An integer specifying where to begin reading from
      *   in the file. If position is null, data will be read from the current file
      *   position.
      * @return [Number]
      */
    /* InferMemberOverrides */
    override def readSync(buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
    
    /**
      * Asynchronous `stat`.
      * @param [Function(BrowserFS.ApiError, BrowserFS.node.fs.Stats)] cb
      */
    /* InferMemberOverrides */
    override def stat(cb: BFSCallback[typings.browserfs.distNodeCoreNodeFsStatsMod.default]): Unit = js.native
    
    /**
      * Synchronous `stat`.
      */
    /* InferMemberOverrides */
    override def statSync(): typings.browserfs.distNodeCoreNodeFsStatsMod.default = js.native
    
    /* InferMemberOverrides */
    override def sync(cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def syncSync(): Unit = js.native
    
    /**
      * Asynchronous truncate.
      * @param [Number] len
      * @param [Function(BrowserFS.ApiError)] cb
      */
    /* InferMemberOverrides */
    override def truncate(len: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Synchronous truncate.
      * @param [Number] len
      */
    /* InferMemberOverrides */
    override def truncateSync(len: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimes(atime: js.Date, mtime: js.Date, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimesSync(atime: js.Date, mtime: js.Date): Unit = js.native
    
    /**
      * Write buffer to the file.
      * Note that it is unsafe to use fs.write multiple times on the same file
      * without waiting for the callback.
      * @param [BrowserFS.node.Buffer] buffer Buffer containing the data to write to
      *  the file.
      * @param [Number] offset Offset in the buffer to start reading data from.
      * @param [Number] length The amount of bytes to write to the file.
      * @param [Number] position Offset from the beginning of the file where this
      *   data should be written. If position is null, the data will be written at
      *   the current position.
      * @param [Function(BrowserFS.ApiError, Number, BrowserFS.node.Buffer)]
      *   cb The number specifies the number of bytes written into the file.
      */
    /* InferMemberOverrides */
    override def write(
      buffer: Buffer,
      offset: Double,
      length: Double,
      position: Double,
      cb: BFSThreeArgCallback[Double, Buffer]
    ): Unit = js.native
    
    /**
      * Write buffer to the file.
      * Note that it is unsafe to use fs.writeSync multiple times on the same file
      * without waiting for the callback.
      * @param [BrowserFS.node.Buffer] buffer Buffer containing the data to write to
      *  the file.
      * @param [Number] offset Offset in the buffer to start reading data from.
      * @param [Number] length The amount of bytes to write to the file.
      * @param [Number] position Offset from the beginning of the file where this
      *   data should be written. If position is null, the data will be written at
      *   the current position.
      * @return [Number]
      */
    /* InferMemberOverrides */
    override def writeSync(buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
  }
  
  @js.native
  trait DropboxFileSystem
    extends BaseFileSystem
       with FileSystem {
    
    /* private */ var _client: Any = js.native
    
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
    
    def _writeFileStrict(p: String, data: js.typedarray.ArrayBuffer, cb: BFSCallback[Stat]): Unit = js.native
    
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
    def convert(err: ApiError): typings.browserfs.distNodeCoreApiErrorMod.ApiError = js.native
    def convert(err: ApiError, path: String): typings.browserfs.distNodeCoreApiErrorMod.ApiError = js.native
    
    /* InferMemberOverrides */
    override def diskSpace(p: String, cb: js.Function2[/* total */ Double, /* free */ Double, Any]): Unit = js.native
    
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
    override def readFileSync(fname: String, encoding: String, flag: FileFlag): Any = js.native
    /* InferMemberOverrides */
    override def readFileSync(fname: String, encoding: Null, flag: FileFlag): Any = js.native
    
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
    override def stat(p: String, isLstat: Boolean, cb: BFSCallback[typings.browserfs.distNodeCoreNodeFsStatsMod.default]): Unit = js.native
    /* InferMemberOverrides */
    override def stat(p: String, isLstat: Null, cb: BFSCallback[typings.browserfs.distNodeCoreNodeFsStatsMod.default]): Unit = js.native
    
    /* InferMemberOverrides */
    override def statSync(p: String): typings.browserfs.distNodeCoreNodeFsStatsMod.default = js.native
    /* InferMemberOverrides */
    override def statSync(p: String, isLstat: Boolean): typings.browserfs.distNodeCoreNodeFsStatsMod.default = js.native
    
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
    override def utimes(p: String, atime: js.Date, mtime: js.Date, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimesSync(p: String, atime: js.Date, mtime: js.Date): Unit = js.native
    
    /* InferMemberOverrides */
    override def writeFile(fname: String, data: Any, encoding: String, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    /* InferMemberOverrides */
    override def writeFile(fname: String, data: Any, encoding: Null, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  }
  
  trait DropboxFileSystemOptions extends StObject {
    
    var client: Client
  }
  object DropboxFileSystemOptions {
    
    inline def apply(client: Client): DropboxFileSystemOptions = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropboxFileSystemOptions]
    }
    
    extension [Self <: DropboxFileSystemOptions](x: Self) {
      
      inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
}
