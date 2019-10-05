package typings.browserfs

import typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.FileType
import typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.Stats
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/node_fs_stats", JSImport.Namespace)
@js.native
object distNodeCoreNodeUnderscoreFsUnderscoreStatsMod extends js.Object {
  @js.native
  sealed trait FileType extends js.Object
  
  @js.native
  trait Stats
    extends typings.node.fsMod.Stats {
    var fileData: Buffer | Null = js.native
    /**
      * Change the mode of the file. We use this helper function to prevent messing
      * up the type of the file, which is encoded in mode.
      */
    def chmod(mode: Double): Unit = js.native
    def toBuffer(): Buffer = js.native
  }
  
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
  }
  
  @js.native
  object FileType extends js.Object {
    @js.native
    sealed trait DIRECTORY extends FileType
    
    @js.native
    sealed trait FILE extends FileType
    
    @js.native
    sealed trait SYMLINK extends FileType
    
    /* 16384 */ val DIRECTORY: typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.FileType.DIRECTORY with Double = js.native
    /* 32768 */ val FILE: typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.FileType.FILE with Double = js.native
    /* 40960 */ val SYMLINK: typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.FileType.SYMLINK with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FileType with Double] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def fromBuffer(buffer: Buffer): Stats = js.native
  }
  
}

