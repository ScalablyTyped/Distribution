package typings.browserfs

import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.BFSOneArgCallback
import typings.browserfs.fileSystemMod.BFSThreeArgCallback
import typings.browserfs.nodeFsStatsMod.default
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/file", JSImport.Namespace)
@js.native
object fileMod extends js.Object {
  @js.native
  class BaseFile () extends js.Object {
    def chmod(mode: Double, cb: BFSOneArgCallback): Unit = js.native
    def chmodSync(mode: Double): Unit = js.native
    def chown(uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
    def chownSync(uid: Double, gid: Double): Unit = js.native
    def datasync(cb: BFSOneArgCallback): Unit = js.native
    def datasyncSync(): Unit = js.native
    def sync(cb: BFSOneArgCallback): Unit = js.native
    def syncSync(): Unit = js.native
    def utimes(atime: Date, mtime: Date, cb: BFSOneArgCallback): Unit = js.native
    def utimesSync(atime: Date, mtime: Date): Unit = js.native
  }
  
  @js.native
  trait File extends js.Object {
    /**
      * **Optional**: Asynchronous `fchmod`.
      */
    def chmod(mode: Double, cb: BFSOneArgCallback): Unit = js.native
    /**
      * **Optional**: Synchronous `fchmod`.
      */
    def chmodSync(mode: Double): Unit = js.native
    /**
      * **Optional**: Asynchronous `chown`.
      */
    def chown(uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
    /**
      * **Optional**: Synchronous `chown`.
      */
    def chownSync(uid: Double, gid: Double): Unit = js.native
    /**
      * **Core**: Asynchronous close.
      */
    def close(cb: BFSOneArgCallback): Unit = js.native
    /**
      * **Core**: Synchronous close.
      */
    def closeSync(): Unit = js.native
    /**
      * **Supplementary**: Asynchronous `datasync`.
      *
      * Default implementation maps to `sync`.
      */
    def datasync(cb: BFSOneArgCallback): Unit = js.native
    /**
      * **Supplementary**: Synchronous `datasync`.
      *
      * Default implementation maps to `syncSync`.
      */
    def datasyncSync(): Unit = js.native
    /**
      * **Core**: Get the current file position.
      */
    def getPos(): js.UndefOr[Double] = js.native
    /**
      * **Core**: Read data from the file.
      * @param buffer The buffer that the data will be
      *   written to.
      * @param offset The offset within the buffer where writing will
      *   start.
      * @param length An integer specifying the number of bytes to read.
      * @param position An integer specifying where to begin reading from
      *   in the file. If position is null, data will be read from the current file
      *   position.
      * @param cb The number is the number of bytes read
      */
    def read(
      buffer: Buffer,
      offset: Double,
      length: Double,
      position: Double,
      cb: BFSThreeArgCallback[Double, Buffer]
    ): Unit = js.native
    def read(
      buffer: Buffer,
      offset: Double,
      length: Double,
      position: Null,
      cb: BFSThreeArgCallback[Double, Buffer]
    ): Unit = js.native
    /**
      * **Core**: Read data from the file.
      * @param buffer The buffer that the data will be written to.
      * @param offset The offset within the buffer where writing will start.
      * @param length An integer specifying the number of bytes to read.
      * @param position An integer specifying where to begin reading from
      *   in the file. If position is null, data will be read from the current file
      *   position.
      */
    def readSync(buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
    /**
      * **Core**: Asynchronous `stat`.
      */
    def stat(cb: BFSCallback[default]): Unit = js.native
    /**
      * **Core**: Synchronous `stat`.
      */
    def statSync(): default = js.native
    /**
      * **Core**: Asynchronous sync.
      */
    def sync(cb: BFSOneArgCallback): Unit = js.native
    /**
      * **Core**: Synchronous sync.
      */
    def syncSync(): Unit = js.native
    /**
      * **Core**: Asynchronous truncate.
      */
    def truncate(len: Double, cb: BFSOneArgCallback): Unit = js.native
    /**
      * **Core**: Synchronous truncate.
      */
    def truncateSync(len: Double): Unit = js.native
    /**
      * **Optional**: Change the file timestamps of the file.
      */
    def utimes(atime: Date, mtime: Date, cb: BFSOneArgCallback): Unit = js.native
    /**
      * **Optional**: Change the file timestamps of the file.
      */
    def utimesSync(atime: Date, mtime: Date): Unit = js.native
    /**
      * **Core**: Write buffer to the file.
      * Note that it is unsafe to use fs.write multiple times on the same file
      * without waiting for the callback.
      * @param buffer Buffer containing the data to write to
      *  the file.
      * @param offset Offset in the buffer to start reading data from.
      * @param length The amount of bytes to write to the file.
      * @param position Offset from the beginning of the file where this
      *   data should be written. If position is null, the data will be written at
      *   the current position.
      * @param cb The number specifies the number of bytes written into the file.
      */
    def write(
      buffer: Buffer,
      offset: Double,
      length: Double,
      position: Double,
      cb: BFSThreeArgCallback[Double, Buffer]
    ): Unit = js.native
    def write(
      buffer: Buffer,
      offset: Double,
      length: Double,
      position: Null,
      cb: BFSThreeArgCallback[Double, Buffer]
    ): Unit = js.native
    def writeSync(buffer: Buffer, offset: Double, length: Double): Double = js.native
    /**
      * **Core**: Write buffer to the file.
      * Note that it is unsafe to use fs.writeSync multiple times on the same file
      * without waiting for it to return.
      * @param buffer Buffer containing the data to write to
      *  the file.
      * @param offset Offset in the buffer to start reading data from.
      * @param length The amount of bytes to write to the file.
      * @param position Offset from the beginning of the file where this
      *   data should be written. If position is null, the data will be written at
      *   the current position.
      */
    def writeSync(buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
  }
  
}

