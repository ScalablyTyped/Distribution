package typings.browserfs.keyValueFilesystemMod

import typings.browserfs.apiErrorMod.ApiError
import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.BFSOneArgCallback
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncKeyValueRWTransaction extends AsyncKeyValueROTransaction {
  /**
    * Aborts and rolls back the transaction.
    */
  def abort(cb: BFSOneArgCallback): Unit
  /**
    * Commits the transaction.
    */
  def commit(cb: BFSOneArgCallback): Unit
  /**
    * Deletes the data at the given key.
    * @param key The key to delete from the store.
    */
  def del(key: String, cb: BFSOneArgCallback): Unit
  /**
    * Adds the data to the store under the given key. Overwrites any existing
    * data.
    * @param key The key to add the data under.
    * @param data The data to add to the store.
    * @param overwrite If 'true', overwrite any existing data. If 'false',
    *   avoids writing the data if the key exists.
    * @param cb Triggered with an error and whether or not the value was
    *   committed.
    */
  def put(
    key: String,
    data: Buffer,
    overwrite: Boolean,
    cb: js.Function2[/* e */ ApiError, /* committed */ js.UndefOr[Boolean], Unit]
  ): Unit
}

object AsyncKeyValueRWTransaction {
  @scala.inline
  def apply(
    abort: BFSOneArgCallback => Unit,
    commit: BFSOneArgCallback => Unit,
    del: (String, BFSOneArgCallback) => Unit,
    get: (String, BFSCallback[Buffer]) => Unit,
    put: (String, Buffer, Boolean, js.Function2[/* e */ ApiError, /* committed */ js.UndefOr[Boolean], Unit]) => Unit
  ): AsyncKeyValueRWTransaction = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction1(abort), commit = js.Any.fromFunction1(commit), del = js.Any.fromFunction2(del), get = js.Any.fromFunction2(get), put = js.Any.fromFunction4(put))
  
    __obj.asInstanceOf[AsyncKeyValueRWTransaction]
  }
}

