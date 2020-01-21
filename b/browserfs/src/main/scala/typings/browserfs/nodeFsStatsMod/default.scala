package typings.browserfs.nodeFsStatsMod

import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/node_fs_stats", JSImport.Default)
@js.native
class default protected () extends Stats {
  /**
    * Provides information about a particular entry in the file system.
    * @param [Number] item_type type of the item (FILE, DIRECTORY, SYMLINK, or SOCKET)
    * @param [Number] size Size of the item in bytes. For directories/symlinks,
    *   this is normally the size of the struct that represents the item.
    * @param [Number] mode Unix-style file mode (e.g. 0o644)
    * @param [Date?] atime time of last access
    * @param [Date?] mtime time of last modification
    * @param [Date?] ctime time of creation
    */
  def this(itemType: FileType, size: Double) = this()
  def this(itemType: FileType, size: Double, mode: Double) = this()
  def this(itemType: FileType, size: Double, mode: Double, atime: Date) = this()
  def this(itemType: FileType, size: Double, mode: Double, atime: Date, mtime: Date) = this()
  def this(itemType: FileType, size: Double, mode: Double, atime: Date, mtime: Date, ctime: Date) = this()
  /* CompleteClass */
  override var atime: Date = js.native
  /* CompleteClass */
  override var atimeMs: Double = js.native
  /* CompleteClass */
  override var birthtime: Date = js.native
  /* CompleteClass */
  override var birthtimeMs: Double = js.native
  /* CompleteClass */
  override var blksize: Double = js.native
  /* CompleteClass */
  override var blocks: Double = js.native
  /* CompleteClass */
  override var ctime: Date = js.native
  /* CompleteClass */
  override var ctimeMs: Double = js.native
  /* CompleteClass */
  override var dev: Double = js.native
  /* CompleteClass */
  override var fileData: Buffer | Null = js.native
  /* CompleteClass */
  override var gid: Double = js.native
  /* CompleteClass */
  override var ino: Double = js.native
  /* CompleteClass */
  override var mode: Double = js.native
  /* CompleteClass */
  override var mtime: Date = js.native
  /* CompleteClass */
  override var mtimeMs: Double = js.native
  /* CompleteClass */
  override var nlink: Double = js.native
  /* CompleteClass */
  override var rdev: Double = js.native
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override var uid: Double = js.native
  /**
    * Change the mode of the file. We use this helper function to prevent messing
    * up the type of the file, which is encoded in mode.
    */
  /* CompleteClass */
  override def chmod(mode: Double): Unit = js.native
  /* CompleteClass */
  override def isBlockDevice(): Boolean = js.native
  /* CompleteClass */
  override def isCharacterDevice(): Boolean = js.native
  /* CompleteClass */
  override def isDirectory(): Boolean = js.native
  /* CompleteClass */
  override def isFIFO(): Boolean = js.native
  /* CompleteClass */
  override def isFile(): Boolean = js.native
  /* CompleteClass */
  override def isSocket(): Boolean = js.native
  /* CompleteClass */
  override def isSymbolicLink(): Boolean = js.native
  /* CompleteClass */
  override def toBuffer(): Buffer = js.native
}

/* static members */
@JSImport("browserfs/dist/node/core/node_fs_stats", JSImport.Default)
@js.native
object default extends js.Object {
  def fromBuffer(buffer: Buffer): Stats = js.native
}

