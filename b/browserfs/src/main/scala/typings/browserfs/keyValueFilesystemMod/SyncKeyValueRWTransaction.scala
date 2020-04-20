package typings.browserfs.keyValueFilesystemMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncKeyValueRWTransaction extends SyncKeyValueROTransaction {
  /**
    * Aborts and rolls back the transaction.
    */
  def abort(): Unit
  /**
    * Commits the transaction.
    */
  def commit(): Unit
  /**
    * Deletes the data at the given key.
    * @param key The key to delete from the store.
    */
  def del(key: String): Unit
  /**
    * Adds the data to the store under the given key.
    * @param key The key to add the data under.
    * @param data The data to add to the store.
    * @param overwrite If 'true', overwrite any existing data. If 'false',
    *   avoids storing the data if the key exists.
    * @return True if storage succeeded, false otherwise.
    */
  def put(key: String, data: Buffer, overwrite: Boolean): Boolean
}

object SyncKeyValueRWTransaction {
  @scala.inline
  def apply(
    abort: () => Unit,
    commit: () => Unit,
    del: String => Unit,
    get: String => js.UndefOr[Buffer],
    put: (String, Buffer, Boolean) => Boolean
  ): SyncKeyValueRWTransaction = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), commit = js.Any.fromFunction0(commit), del = js.Any.fromFunction1(del), get = js.Any.fromFunction1(get), put = js.Any.fromFunction3(put))
    __obj.asInstanceOf[SyncKeyValueRWTransaction]
  }
}

