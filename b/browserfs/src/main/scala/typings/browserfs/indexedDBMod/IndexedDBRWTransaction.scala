package typings.browserfs.indexedDBMod

import typings.browserfs.apiErrorMod.ApiError
import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.BFSOneArgCallback
import typings.browserfs.keyValueFilesystemMod.AsyncKeyValueRWTransaction
import typings.node.Buffer
import typings.std.IDBObjectStore
import typings.std.IDBTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/IndexedDB", "IndexedDBRWTransaction")
@js.native
class IndexedDBRWTransaction protected ()
  extends IndexedDBROTransaction
     with AsyncKeyValueRWTransaction {
  def this(tx: IDBTransaction, store: IDBObjectStore) = this()
  /**
    * Aborts and rolls back the transaction.
    */
  /* CompleteClass */
  override def abort(cb: BFSOneArgCallback): Unit = js.native
  /**
    * Commits the transaction.
    */
  /* CompleteClass */
  override def commit(cb: BFSOneArgCallback): Unit = js.native
  /**
    * Deletes the data at the given key.
    * @param key The key to delete from the store.
    */
  /* CompleteClass */
  override def del(key: String, cb: BFSOneArgCallback): Unit = js.native
  /**
    * Retrieves the data at the given key.
    * @param key The key to look under for data.
    */
  /* CompleteClass */
  override def get(key: String, cb: BFSCallback[Buffer]): Unit = js.native
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
  /* CompleteClass */
  override def put(
    key: String,
    data: Buffer,
    overwrite: Boolean,
    cb: js.Function2[/* e */ ApiError, /* committed */ js.UndefOr[Boolean], Unit]
  ): Unit = js.native
}

