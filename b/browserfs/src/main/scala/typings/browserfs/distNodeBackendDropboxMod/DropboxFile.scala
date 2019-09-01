package typings.browserfs.distNodeBackendDropboxMod

import typings.browserfs.distNodeCoreFileMod.File
import typings.browserfs.distNodeCoreFileUnderscoreFlagMod.FileFlag
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSOneArgCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSThreeArgCallback
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/Dropbox", "DropboxFile")
@js.native
class DropboxFile protected ()
  extends typings.browserfs.distNodeGenericPreloadUnderscoreFileMod.default[DropboxFileSystem]
     with File {
  def this(
    _fs: DropboxFileSystem,
    _path: String,
    _flag: FileFlag,
    _stat: typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default
  ) = this()
  def this(
    _fs: DropboxFileSystem,
    _path: String,
    _flag: FileFlag,
    _stat: typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default,
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
  override def getPos(): Double with js.UndefOr[Double] = js.native
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
  override def stat(cb: BFSCallback[typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default]): Unit = js.native
  /**
    * Synchronous `stat`.
    */
  /* InferMemberOverrides */
  override def statSync(): typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default = js.native
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

