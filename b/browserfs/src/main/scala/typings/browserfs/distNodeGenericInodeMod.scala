package typings.browserfs

import typings.browserfs.distNodeGenericInodeMod.Inode
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/generic/inode", JSImport.Namespace)
@js.native
object distNodeGenericInodeMod extends js.Object {
  @js.native
  trait Inode extends js.Object {
    var atime: Double = js.native
    var ctime: Double = js.native
    var id: String = js.native
    var mode: Double = js.native
    var mtime: Double = js.native
    var size: Double = js.native
    /**
      * Get the size of this Inode, in bytes.
      */
    def getSize(): Double = js.native
    /**
      * @return [Boolean] True if this item is a directory.
      */
    def isDirectory(): Boolean = js.native
    /**
      * @return [Boolean] True if this item is a file.
      */
    def isFile(): Boolean = js.native
    /**
      * Writes the inode into the start of the buffer.
      */
    def toBuffer(): Buffer = js.native
    def toBuffer(buff: Buffer): Buffer = js.native
    /**
      * Handy function that converts the Inode to a Node Stats object.
      */
    def toStats(): typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default = js.native
    /**
      * Updates the Inode using information from the stats object. Used by file
      * systems at sync time, e.g.:
      * - Program opens file and gets a File object.
      * - Program mutates file. File object is responsible for maintaining
      *   metadata changes locally -- typically in a Stats object.
      * - Program closes file. File object's metadata changes are synced with the
      *   file system.
      * @return True if any changes have occurred.
      */
    def update(stats: typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends Inode {
    def this(id: String, size: Double, mode: Double, atime: Double, mtime: Double, ctime: Double) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    /**
      * Converts the buffer into an Inode.
      */
    def fromBuffer(buffer: Buffer): Inode = js.native
  }
  
}

