package typings.browserfs.distNodeGenericFileUnderscoreIndexMod

import typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/generic/file_index", "DirInode")
@js.native
/**
  * Constructs an inode for a directory.
  */
class DirInode[T] () extends Inode {
  def this(data: T) = this()
  var _ls: js.Any = js.native
  var data: js.Any = js.native
  /**
    * Add the given item to the directory listing. Note that the given inode is
    * not copied, and will be mutated by the DirInode if it is a DirInode.
    * @param p Item name to add to the directory listing.
    * @param inode The inode for the
    *   item to add to the directory inode.
    * @return True if it was added, false if it already existed.
    */
  def addItem(p: String, inode: Inode): Boolean = js.native
  def getData(): T | Null = js.native
  /**
    * Returns the inode for the indicated item, or null if it does not exist.
    * @param p Name of item in this directory.
    */
  def getItem(p: String): Inode | Null = js.native
  /**
    * Returns the directory listing for this directory. Paths in the directory are
    * relative to the directory's path.
    * @return The directory listing for this directory.
    */
  def getListing(): js.Array[String] = js.native
  /**
    * Return a Stats object for this inode.
    * @todo Should probably remove this at some point. This isn't the
    *       responsibility of the FileIndex.
    */
  def getStats(): default = js.native
  /* CompleteClass */
  override def isDir(): Boolean = js.native
  /* CompleteClass */
  override def isFile(): Boolean = js.native
  /**
    * Removes the given item from the directory listing.
    * @param p Name of item to remove from the directory listing.
    * @return Returns the item
    *   removed, or null if the item did not exist.
    */
  def remItem(p: String): Inode | Null = js.native
}

