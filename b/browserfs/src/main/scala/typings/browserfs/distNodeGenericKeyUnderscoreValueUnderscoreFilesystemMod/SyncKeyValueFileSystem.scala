package typings.browserfs.distNodeGenericKeyUnderscoreValueUnderscoreFilesystemMod

import typings.browserfs.distNodeCoreFileMod.File
import typings.browserfs.distNodeCoreFileUnderscoreFlagMod.FileFlag
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.SynchronousFileSystem
import typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/generic/key_value_filesystem", "SyncKeyValueFileSystem")
@js.native
class SyncKeyValueFileSystem protected () extends SynchronousFileSystem {
  def this(options: SyncKeyValueFileSystemOptions) = this()
  var store: js.Any = js.native
  /**
    * Helper function for findINode.
    * @param parent The parent directory of the file we are attempting to find.
    * @param filename The filename of the inode we are attempting to find, minus
    *   the parent.
    * @return string The ID of the file's inode in the file system.
    */
  /* private */ def _findINode(tx: js.Any, parent: js.Any, filename: js.Any): js.Any = js.native
  def _syncSync(p: String, data: Buffer, stats: default): Unit = js.native
  /**
    * Creates a new node under a random ID. Retries 5 times before giving up in
    * the exceedingly unlikely chance that we try to reuse a random GUID.
    * @return The GUID that the data was stored under.
    */
  /* private */ def addNewNode(tx: js.Any, data: js.Any): js.Any = js.native
  /**
    * Commits a new file (well, a FILE or a DIRECTORY) to the file system with
    * the given mode.
    * Note: This will commit the transaction.
    * @param p The path to the new file.
    * @param type The type of the new file.
    * @param mode The mode to create the new file with.
    * @param data The data to store at the file's data node.
    * @return The Inode for the new file.
    */
  /* private */ def commitNewFile(tx: js.Any, p: js.Any, `type`: js.Any, mode: js.Any, data: js.Any): js.Any = js.native
  /**
    * Delete all contents stored in the file system.
    */
  def empty(): Unit = js.native
  /**
    * Finds the Inode of the given path.
    * @param p The path to look up.
    * @return The Inode of the path p.
    * @todo memoize/cache
    */
  /* private */ def findINode(tx: js.Any, p: js.Any): js.Any = js.native
  /**
    * Given the Inode of a directory, retrieves the corresponding directory
    * listing.
    */
  /* private */ def getDirListing(tx: js.Any, p: js.Any, inode: js.Any): js.Any = js.native
  /**
    * Given the ID of a node, retrieves the corresponding Inode.
    * @param tx The transaction to use.
    * @param p The corresponding path to the file (used for error messages).
    * @param id The ID to look up.
    */
  /* private */ def getINode(tx: js.Any, p: js.Any, id: js.Any): js.Any = js.native
  def getName(): String = js.native
  def isReadOnly(): Boolean = js.native
  /**
    * Checks if the root directory exists. Creates it if it doesn't.
    */
  /* private */ def makeRootDirectory(): js.Any = js.native
  def openFileSync(p: String, flag: FileFlag): File = js.native
  /**
    * Remove all traces of the given path from the file system.
    * @param p The path to remove from the file system.
    * @param isDir Does the path belong to a directory, or a file?
    * @todo Update mtime.
    */
  /* private */ def removeEntry(p: js.Any, isDir: js.Any): js.Any = js.native
  def supportsProps(): Boolean = js.native
  def supportsSymlinks(): Boolean = js.native
}

/* static members */
@JSImport("browserfs/dist/node/generic/key_value_filesystem", "SyncKeyValueFileSystem")
@js.native
object SyncKeyValueFileSystem extends js.Object {
  def isAvailable(): Boolean = js.native
}

