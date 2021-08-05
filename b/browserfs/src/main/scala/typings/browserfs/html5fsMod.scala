package typings.browserfs

import org.scalablytyped.runtime.StringDictionary
import typings.browserfs.fileFlagMod.FileFlag
import typings.browserfs.fileMod.File
import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.BFSOneArgCallback
import typings.browserfs.fileSystemMod.BFSThreeArgCallback
import typings.browserfs.fileSystemMod.BaseFileSystem
import typings.browserfs.fileSystemMod.FileSystem
import typings.browserfs.fileSystemMod.FileSystemOptions
import typings.filesystem.FileEntry
import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object html5fsMod {
  
  @JSImport("browserfs/dist/node/backend/HTML5FS", JSImport.Default)
  @js.native
  /**
    * **Deprecated. Please use HTML5FS.Create() method instead.**
    *
    * Creates a new HTML5 FileSystem-backed BrowserFS file system of the given size
    * and storage type.
    *
    * **IMPORTANT**: You must call `allocate` on the resulting object before the file system
    * can be used.
    *
    * @param size storage quota to request, in megabytes. Allocated value may be less.
    * @param type window.PERSISTENT or window.TEMPORARY. Defaults to PERSISTENT.
    */
  class default () extends HTML5FS {
    def this(size: Double) = this()
    def this(size: Double, `type`: Double) = this()
    def this(size: Unit, `type`: Double) = this()
    def this(size: Double, `type`: Double, deprecateMsg: Boolean) = this()
    def this(size: Double, `type`: Unit, deprecateMsg: Boolean) = this()
    def this(size: Unit, `type`: Double, deprecateMsg: Boolean) = this()
    def this(size: Unit, `type`: Unit, deprecateMsg: Boolean) = this()
  }
  /* static members */
  object default {
    
    @JSImport("browserfs/dist/node/backend/HTML5FS", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an HTML5FS instance with the given options.
      */
    inline def Create(opts: HTML5FSOptions, cb: BFSCallback[HTML5FS]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("browserfs/dist/node/backend/HTML5FS", "default.Name")
    @js.native
    val Name: String = js.native
    
    @JSImport("browserfs/dist/node/backend/HTML5FS", "default.Options")
    @js.native
    val Options: FileSystemOptions = js.native
    
    inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  }
  
  @JSImport("browserfs/dist/node/backend/HTML5FS", "HTML5FSFile")
  @js.native
  class HTML5FSFile protected ()
    extends typings.browserfs.preloadFileMod.default[HTML5FS]
       with File {
    def this(
      fs: HTML5FS,
      entry: FileEntry,
      path: String,
      flag: FileFlag,
      stat: typings.browserfs.nodeFsStatsMod.default
    ) = this()
    def this(
      fs: HTML5FS,
      entry: FileEntry,
      path: String,
      flag: FileFlag,
      stat: typings.browserfs.nodeFsStatsMod.default,
      contents: Buffer
    ) = this()
    
    /* private */ var _entry: js.Any = js.native
    
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
    override def stat(cb: BFSCallback[typings.browserfs.nodeFsStatsMod.default]): Unit = js.native
    
    /**
      * Synchronous `stat`.
      */
    /* InferMemberOverrides */
    override def statSync(): typings.browserfs.nodeFsStatsMod.default = js.native
    
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
    override def utimes(atime: Date, mtime: Date, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimesSync(atime: Date, mtime: Date): Unit = js.native
    
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
  trait HTML5FS
    extends BaseFileSystem
       with FileSystem {
    
    /**
      * Returns a BrowserFS object representing a File.
      */
    /* private */ def _makeFile(path: js.Any, entry: js.Any, flag: js.Any, stat: js.Any, data: js.Any): js.Any = js.native
    
    /**
      * Returns an array of `FileEntry`s. Used internally by empty and readdir.
      */
    /* private */ def _readdir(path: js.Any, cb: js.Any): js.Any = js.native
    
    /**
      * Delete a file or directory from the file system
      * isFile should reflect which call was made to remove the it (`unlink` or
      * `rmdir`). If this doesn't match what's actually at `path`, an error will be
      * returned
      */
    /* private */ def _remove(path: js.Any, cb: js.Any, isFile: js.Any): js.Any = js.native
    
    /**
      * **Deprecated. Please use Create() method instead to create and allocate an HTML5FS.**
      *
      * Requests a storage quota from the browser to back this FS.
      * Must be called before file system can be used!
      */
    def allocate(): Unit = js.native
    def allocate(cb: Unit, deprecateMsg: Boolean): Unit = js.native
    def allocate(cb: BFSOneArgCallback): Unit = js.native
    def allocate(cb: BFSOneArgCallback, deprecateMsg: Boolean): Unit = js.native
    
    /* InferMemberOverrides */
    override def chmod(p: String, isLchmod: Boolean, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chmodSync(p: String, isLchmod: Boolean, mode: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def chown(p: String, isLchown: Boolean, uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chownSync(p: String, isLchown: Boolean, uid: Double, gid: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def diskSpace(p: String, cb: js.Function2[/* total */ Double, /* free */ Double, js.Any]): Unit = js.native
    
    /**
      * Deletes everything in the FS. Used for testing.
      * Karma clears the storage after you quit it but not between runs of the test
      * suite, and the tests expect an empty FS every time.
      */
    def empty(mainCb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def exists(p: String, cb: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
    
    /* InferMemberOverrides */
    override def existsSync(p: String): Boolean = js.native
    
    var fs: typings.filesystem.FileSystem = js.native
    
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
    
    /* private */ var size: js.Any = js.native
    
    /* InferMemberOverrides */
    override def stat(p: String, isLstat: Boolean, cb: BFSCallback[typings.browserfs.nodeFsStatsMod.default]): Unit = js.native
    /* InferMemberOverrides */
    override def stat(p: String, isLstat: Null, cb: BFSCallback[typings.browserfs.nodeFsStatsMod.default]): Unit = js.native
    
    /* InferMemberOverrides */
    override def statSync(p: String): typings.browserfs.nodeFsStatsMod.default = js.native
    /* InferMemberOverrides */
    override def statSync(p: String, isLstat: Boolean): typings.browserfs.nodeFsStatsMod.default = js.native
    
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
    
    /* private */ var `type`: js.Any = js.native
    
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
  
  trait HTML5FSOptions extends StObject {
    
    var size: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[Double] = js.undefined
  }
  object HTML5FSOptions {
    
    inline def apply(): HTML5FSOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HTML5FSOptions]
    }
    
    extension [Self <: HTML5FSOptions](x: Self) {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
