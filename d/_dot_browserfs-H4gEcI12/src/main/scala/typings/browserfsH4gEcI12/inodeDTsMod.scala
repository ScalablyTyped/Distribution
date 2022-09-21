package typings.browserfsH4gEcI12

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inodeDTsMod {
  
  @JSImport(".browserfs-H4gEcI12/dist/node/generic/inode.d.ts", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Inode {
    def this(id: String, size: Double, mode: Double, atime: Double, mtime: Double, ctime: Double) = this()
  }
  /* static members */
  object default {
    
    @JSImport(".browserfs-H4gEcI12/dist/node/generic/inode.d.ts", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Converts the buffer into an Inode.
      */
    inline def fromBuffer(buffer: Buffer): Inode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Inode]
  }
  
  @js.native
  trait Inode extends StObject {
    
    var atime: Double = js.native
    
    var ctime: Double = js.native
    
    /**
      * Get the size of this Inode, in bytes.
      */
    def getSize(): Double = js.native
    
    var id: String = js.native
    
    /**
      * @return [Boolean] True if this item is a directory.
      */
    def isDirectory(): Boolean = js.native
    
    /**
      * @return [Boolean] True if this item is a file.
      */
    def isFile(): Boolean = js.native
    
    var mode: Double = js.native
    
    var mtime: Double = js.native
    
    var size: Double = js.native
    
    /**
      * Writes the inode into the start of the buffer.
      */
    def toBuffer(): Buffer = js.native
    def toBuffer(buff: Buffer): Buffer = js.native
    
    /**
      * Handy function that converts the Inode to a Node Stats object.
      */
    def toStats(): typings.browserfsH4gEcI12.nodeFsStatsDTsMod.default = js.native
    
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
    def update(stats: typings.browserfsH4gEcI12.nodeFsStatsDTsMod.default): Boolean = js.native
  }
}
