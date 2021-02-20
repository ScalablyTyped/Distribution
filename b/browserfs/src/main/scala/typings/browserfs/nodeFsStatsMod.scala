package typings.browserfs

import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeFsStatsMod {
  
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
    def this(itemType: FileType, size: Double, mode: js.UndefOr[scala.Nothing], atime: Date) = this()
    def this(itemType: FileType, size: Double, mode: Double, atime: Date) = this()
    def this(
      itemType: FileType,
      size: Double,
      mode: js.UndefOr[scala.Nothing],
      atime: js.UndefOr[scala.Nothing],
      mtime: Date
    ) = this()
    def this(itemType: FileType, size: Double, mode: js.UndefOr[scala.Nothing], atime: Date, mtime: Date) = this()
    def this(itemType: FileType, size: Double, mode: Double, atime: js.UndefOr[scala.Nothing], mtime: Date) = this()
    def this(itemType: FileType, size: Double, mode: Double, atime: Date, mtime: Date) = this()
    def this(
      itemType: FileType,
      size: Double,
      mode: js.UndefOr[scala.Nothing],
      atime: js.UndefOr[scala.Nothing],
      mtime: js.UndefOr[scala.Nothing],
      ctime: Date
    ) = this()
    def this(
      itemType: FileType,
      size: Double,
      mode: js.UndefOr[scala.Nothing],
      atime: js.UndefOr[scala.Nothing],
      mtime: Date,
      ctime: Date
    ) = this()
    def this(
      itemType: FileType,
      size: Double,
      mode: js.UndefOr[scala.Nothing],
      atime: Date,
      mtime: js.UndefOr[scala.Nothing],
      ctime: Date
    ) = this()
    def this(
      itemType: FileType,
      size: Double,
      mode: js.UndefOr[scala.Nothing],
      atime: Date,
      mtime: Date,
      ctime: Date
    ) = this()
    def this(
      itemType: FileType,
      size: Double,
      mode: Double,
      atime: js.UndefOr[scala.Nothing],
      mtime: js.UndefOr[scala.Nothing],
      ctime: Date
    ) = this()
    def this(
      itemType: FileType,
      size: Double,
      mode: Double,
      atime: js.UndefOr[scala.Nothing],
      mtime: Date,
      ctime: Date
    ) = this()
    def this(
      itemType: FileType,
      size: Double,
      mode: Double,
      atime: Date,
      mtime: js.UndefOr[scala.Nothing],
      ctime: Date
    ) = this()
    def this(itemType: FileType, size: Double, mode: Double, atime: Date, mtime: Date, ctime: Date) = this()
  }
  /* static members */
  object default {
    
    @JSImport("browserfs/dist/node/core/node_fs_stats", "default.fromBuffer")
    @js.native
    def fromBuffer(buffer: Buffer): Stats = js.native
  }
  
  @js.native
  sealed trait FileType extends StObject
  @JSImport("browserfs/dist/node/core/node_fs_stats", "FileType")
  @js.native
  object FileType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FileType with Double] = js.native
    
    @js.native
    sealed trait DIRECTORY extends FileType
    /* 16384 */ val DIRECTORY: typings.browserfs.nodeFsStatsMod.FileType.DIRECTORY with Double = js.native
    
    @js.native
    sealed trait FILE extends FileType
    /* 32768 */ val FILE: typings.browserfs.nodeFsStatsMod.FileType.FILE with Double = js.native
    
    @js.native
    sealed trait SYMLINK extends FileType
    /* 40960 */ val SYMLINK: typings.browserfs.nodeFsStatsMod.FileType.SYMLINK with Double = js.native
  }
  
  @js.native
  trait Stats
    extends typings.node.fsMod.Stats {
    
    /**
      * Change the mode of the file. We use this helper function to prevent messing
      * up the type of the file, which is encoded in mode.
      */
    def chmod(mode: Double): Unit = js.native
    
    var fileData: Buffer | Null = js.native
    
    def toBuffer(): Buffer = js.native
  }
}
