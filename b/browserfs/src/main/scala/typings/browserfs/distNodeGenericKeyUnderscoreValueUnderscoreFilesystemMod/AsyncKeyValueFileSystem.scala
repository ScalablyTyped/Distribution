package typings.browserfs.distNodeGenericKeyUnderscoreValueUnderscoreFilesystemMod

import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSOneArgCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BaseFileSystem
import typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/generic/key_value_filesystem", "AsyncKeyValueFileSystem")
@js.native
class AsyncKeyValueFileSystem () extends BaseFileSystem {
  var store: AsyncKeyValueStore = js.native
  /**
    * Helper function for findINode.
    * @param parent The parent directory of the file we are attempting to find.
    * @param filename The filename of the inode we are attempting to find, minus
    *   the parent.
    * @param cb Passed an error or the ID of the file's inode in the file system.
    */
  /* private */ def _findINode(tx: js.Any, parent: js.Any, filename: js.Any, cb: js.Any): js.Any = js.native
  def _sync(p: String, data: Buffer, stats: default, cb: BFSOneArgCallback): Unit = js.native
  /**
    * Adds a new node under a random ID. Retries 5 times before giving up in
    * the exceedingly unlikely chance that we try to reuse a random GUID.
    * @param cb Passed an error or the GUID that the data was stored under.
    */
  /* private */ def addNewNode(tx: js.Any, data: js.Any, cb: js.Any): js.Any = js.native
  /**
    * Commits a new file (well, a FILE or a DIRECTORY) to the file system with
    * the given mode.
    * Note: This will commit the transaction.
    * @param p The path to the new file.
    * @param type The type of the new file.
    * @param mode The mode to create the new file with.
    * @param data The data to store at the file's data node.
    * @param cb Passed an error or the Inode for the new file.
    */
  /* private */ def commitNewFile(tx: js.Any, p: js.Any, `type`: js.Any, mode: js.Any, data: js.Any, cb: js.Any): js.Any = js.native
  /**
    * Delete all contents stored in the file system.
    */
  def empty(cb: BFSOneArgCallback): Unit = js.native
  /**
    * Finds the Inode of the given path.
    * @param p The path to look up.
    * @param cb Passed an error or the Inode of the path p.
    * @todo memoize/cache
    */
  /* private */ def findINode(tx: js.Any, p: js.Any, cb: js.Any): js.Any = js.native
  /**
    * Given a path to a directory, retrieves the corresponding INode and
    * directory listing.
    */
  /* private */ def findINodeAndDirListing(tx: js.Any, p: js.Any, cb: js.Any): js.Any = js.native
  /**
    * Given the Inode of a directory, retrieves the corresponding directory
    * listing.
    */
  /* private */ def getDirListing(tx: js.Any, p: js.Any, inode: js.Any, cb: js.Any): js.Any = js.native
  /**
    * Given the ID of a node, retrieves the corresponding Inode.
    * @param tx The transaction to use.
    * @param p The corresponding path to the file (used for error messages).
    * @param id The ID to look up.
    * @param cb Passed an error or the inode under the given id.
    */
  /* private */ def getINode(tx: js.Any, p: js.Any, id: js.Any, cb: js.Any): js.Any = js.native
  def getName(): String = js.native
  /**
    * Initializes the file system. Typically called by subclasses' async
    * constructors.
    */
  def init(store: AsyncKeyValueStore, cb: BFSOneArgCallback): Unit = js.native
  def isReadOnly(): Boolean = js.native
  /**
    * Checks if the root directory exists. Creates it if it doesn't.
    */
  /* private */ def makeRootDirectory(cb: js.Any): js.Any = js.native
  /**
    * Remove all traces of the given path from the file system.
    * @param p The path to remove from the file system.
    * @param isDir Does the path belong to a directory, or a file?
    * @todo Update mtime.
    */
  /* private */ def removeEntry(p: js.Any, isDir: js.Any, cb: js.Any): js.Any = js.native
  def supportsProps(): Boolean = js.native
  def supportsSymlinks(): Boolean = js.native
  def supportsSynch(): Boolean = js.native
}

/* static members */
@JSImport("browserfs/dist/node/generic/key_value_filesystem", "AsyncKeyValueFileSystem")
@js.native
object AsyncKeyValueFileSystem extends js.Object {
  def isAvailable(): Boolean = js.native
}

