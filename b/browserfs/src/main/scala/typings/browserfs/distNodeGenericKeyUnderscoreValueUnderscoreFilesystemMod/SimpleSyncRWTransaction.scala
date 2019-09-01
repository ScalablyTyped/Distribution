package typings.browserfs.distNodeGenericKeyUnderscoreValueUnderscoreFilesystemMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/generic/key_value_filesystem", "SimpleSyncRWTransaction")
@js.native
class SimpleSyncRWTransaction protected () extends SyncKeyValueRWTransaction {
  def this(store: SimpleSyncStore) = this()
  /**
    * List of keys modified in this transaction, if any.
    */
  var modifiedKeys: js.Any = js.native
  /**
    * Stores data in the keys we modify prior to modifying them.
    * Allows us to roll back commits.
    */
  var originalData: js.Any = js.native
  var store: js.Any = js.native
  /**
    * Aborts and rolls back the transaction.
    */
  /* CompleteClass */
  override def abort(): Unit = js.native
  /**
    * Commits the transaction.
    */
  /* CompleteClass */
  override def commit(): Unit = js.native
  /**
    * Deletes the data at the given key.
    * @param key The key to delete from the store.
    */
  /* CompleteClass */
  override def del(key: String): Unit = js.native
  /**
    * Retrieves the data at the given key. Throws an ApiError if an error occurs
    * or if the key does not exist.
    * @param key The key to look under for data.
    * @return The data stored under the key, or undefined if not present.
    */
  /* CompleteClass */
  override def get(key: String): js.UndefOr[Buffer] = js.native
  /**
    * Marks the given key as modified, and stashes its value if it has not been
    * stashed already.
    */
  /* private */ def markModified(key: js.Any): js.Any = js.native
  /**
    * Adds the data to the store under the given key.
    * @param key The key to add the data under.
    * @param data The data to add to the store.
    * @param overwrite If 'true', overwrite any existing data. If 'false',
    *   avoids storing the data if the key exists.
    * @return True if storage succeeded, false otherwise.
    */
  /* CompleteClass */
  override def put(key: String, data: Buffer, overwrite: Boolean): Boolean = js.native
  /**
    * Stashes given key value pair into `originalData` if it doesn't already
    * exist. Allows us to stash values the program is requesting anyway to
    * prevent needless `get` requests if the program modifies the data later
    * on during the transaction.
    */
  /* private */ def stashOldValue(key: js.Any, value: js.Any): js.Any = js.native
}

