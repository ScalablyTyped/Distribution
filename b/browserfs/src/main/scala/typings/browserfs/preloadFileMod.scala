package typings.browserfs

import typings.browserfs.fileFlagMod.FileFlag
import typings.browserfs.fileMod.BaseFile
import typings.browserfs.fileMod.File
import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.BFSOneArgCallback
import typings.browserfs.fileSystemMod.BFSThreeArgCallback
import typings.browserfs.fileSystemMod.FileSystem
import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preloadFileMod {
  
  @JSImport("browserfs/dist/node/generic/preload_file", JSImport.Default)
  @js.native
  class default[T /* <: FileSystem */] protected () extends PreloadFile[T] {
    /**
      * Creates a file with the given path and, optionally, the given contents. Note
      * that, if contents is specified, it will be mutated by the file!
      * @param _fs The file system that created the file.
      * @param _path
      * @param _mode The mode that the file was opened using.
      *   Dictates permissions and where the file pointer starts.
      * @param _stat The stats object for the given file.
      *   PreloadFile will mutate this object. Note that this object must contain
      *   the appropriate mode that the file was opened as.
      * @param contents A buffer containing the entire
      *   contents of the file. PreloadFile will mutate this buffer. If not
      *   specified, we assume it is a new file.
      */
    def this(_fs: T, _path: String, _flag: FileFlag, _stat: typings.browserfs.nodeFsStatsMod.default) = this()
    def this(
      _fs: T,
      _path: String,
      _flag: FileFlag,
      _stat: typings.browserfs.nodeFsStatsMod.default,
      contents: Buffer
    ) = this()
  }
  
  @JSImport("browserfs/dist/node/generic/preload_file", "NoSyncFile")
  @js.native
  class NoSyncFile[T /* <: FileSystem */] protected ()
    extends PreloadFile[T]
       with File {
    def this(_fs: T, _path: String, _flag: FileFlag, _stat: typings.browserfs.nodeFsStatsMod.default) = this()
    def this(
      _fs: T,
      _path: String,
      _flag: FileFlag,
      _stat: typings.browserfs.nodeFsStatsMod.default,
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
  trait PreloadFile[T /* <: FileSystem */] extends BaseFile {
    
    /* private */ var _buffer: js.Any = js.native
    
    /* private */ var _dirty: js.Any = js.native
    
    /* private */ var _flag: js.Any = js.native
    
    /* protected */ var _fs: T = js.native
    
    /* private */ var _path: js.Any = js.native
    
    /* private */ var _pos: js.Any = js.native
    
    /* private */ var _stat: js.Any = js.native
    
    /**
      * Advance the current file position by the indicated number of positions.
      * @param [Number] delta
      */
    def advancePos(delta: Double): Double = js.native
    
    /**
      * **Core**: Asynchronous close. Must be implemented by subclasses of this
      * class.
      * @param [Function(BrowserFS.ApiError)] cb
      */
    def close(cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * **Core**: Synchronous close.
      */
    def closeSync(): Unit = js.native
    
    /**
      * NONSTANDARD: Get the underlying buffer for this file. !!DO NOT MUTATE!! Will mess up dirty tracking.
      */
    def getBuffer(): Buffer = js.native
    
    def getFlag(): FileFlag = js.native
    
    /**
      * Get the path to this file.
      * @return [String] The path to the file.
      */
    def getPath(): String = js.native
    
    /**
      * Get the current file position.
      *
      * We emulate the following bug mentioned in the Node documentation:
      * > On Linux, positional writes don't work when the file is opened in append
      *   mode. The kernel ignores the position argument and always appends the data
      *   to the end of the file.
      * @return [Number] The current file position.
      */
    def getPos(): Double = js.native
    
    /**
      * NONSTANDARD: Get underlying stats for this file. !!DO NOT MUTATE!!
      */
    def getStats(): typings.browserfs.nodeFsStatsMod.default = js.native
    
    /* protected */ def isDirty(): Boolean = js.native
    
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
    def read(
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
    def readSync(buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
    
    /**
      * Resets the dirty bit. Should only be called after a sync has completed successfully.
      */
    /* protected */ def resetDirty(): Unit = js.native
    
    /**
      * Set the file position.
      * @param [Number] newPos
      */
    def setPos(newPos: Double): Double = js.native
    
    /**
      * Asynchronous `stat`.
      * @param [Function(BrowserFS.ApiError, BrowserFS.node.fs.Stats)] cb
      */
    def stat(cb: BFSCallback[typings.browserfs.nodeFsStatsMod.default]): Unit = js.native
    
    /**
      * Synchronous `stat`.
      */
    def statSync(): typings.browserfs.nodeFsStatsMod.default = js.native
    
    /**
      * Asynchronous truncate.
      * @param [Number] len
      * @param [Function(BrowserFS.ApiError)] cb
      */
    def truncate(len: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Synchronous truncate.
      * @param [Number] len
      */
    def truncateSync(len: Double): Unit = js.native
    
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
    def write(
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
    def writeSync(buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
  }
}
