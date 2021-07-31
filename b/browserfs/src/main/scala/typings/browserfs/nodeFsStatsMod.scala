package typings.browserfs

import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    def this(itemType: FileType, size: Double, mode: Double, atime: Date) = this()
    def this(itemType: FileType, size: Double, mode: Unit, atime: Date) = this()
    def this(itemType: FileType, size: Double, mode: Double, atime: Unit, mtime: Date) = this()
    def this(itemType: FileType, size: Double, mode: Double, atime: Date, mtime: Date) = this()
    def this(itemType: FileType, size: Double, mode: Unit, atime: Unit, mtime: Date) = this()
    def this(itemType: FileType, size: Double, mode: Unit, atime: Date, mtime: Date) = this()
    def this(itemType: FileType, size: Double, mode: Double, atime: Unit, mtime: Unit, ctime: Date) = this()
    def this(itemType: FileType, size: Double, mode: Double, atime: Unit, mtime: Date, ctime: Date) = this()
    def this(itemType: FileType, size: Double, mode: Double, atime: Date, mtime: Unit, ctime: Date) = this()
    def this(itemType: FileType, size: Double, mode: Double, atime: Date, mtime: Date, ctime: Date) = this()
    def this(itemType: FileType, size: Double, mode: Unit, atime: Unit, mtime: Unit, ctime: Date) = this()
    def this(itemType: FileType, size: Double, mode: Unit, atime: Unit, mtime: Date, ctime: Date) = this()
    def this(itemType: FileType, size: Double, mode: Unit, atime: Date, mtime: Unit, ctime: Date) = this()
    def this(itemType: FileType, size: Double, mode: Unit, atime: Date, mtime: Date, ctime: Date) = this()
  }
  /* static members */
  object default {
    
    @JSImport("browserfs/dist/node/core/node_fs_stats", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fromBuffer(buffer: Buffer): Stats = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Stats]
  }
  
  @js.native
  sealed trait FileType extends StObject
  @JSImport("browserfs/dist/node/core/node_fs_stats", "FileType")
  @js.native
  object FileType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FileType & Double] = js.native
    
    @js.native
    sealed trait DIRECTORY
      extends StObject
         with FileType
    /* 16384 */ val DIRECTORY: typings.browserfs.nodeFsStatsMod.FileType.DIRECTORY & Double = js.native
    
    @js.native
    sealed trait FILE
      extends StObject
         with FileType
    /* 32768 */ val FILE: typings.browserfs.nodeFsStatsMod.FileType.FILE & Double = js.native
    
    @js.native
    sealed trait SYMLINK
      extends StObject
         with FileType
    /* 40960 */ val SYMLINK: typings.browserfs.nodeFsStatsMod.FileType.SYMLINK & Double = js.native
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
