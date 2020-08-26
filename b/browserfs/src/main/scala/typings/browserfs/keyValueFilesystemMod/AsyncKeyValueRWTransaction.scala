package typings.browserfs.keyValueFilesystemMod

import typings.browserfs.apiErrorMod.ApiError
import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.BFSOneArgCallback
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncKeyValueRWTransaction extends AsyncKeyValueROTransaction {
  /**
    * Aborts and rolls back the transaction.
    */
  def abort(cb: BFSOneArgCallback): Unit = js.native
  /**
    * Commits the transaction.
    */
  def commit(cb: BFSOneArgCallback): Unit = js.native
  /**
    * Deletes the data at the given key.
    * @param key The key to delete from the store.
    */
  def del(key: String, cb: BFSOneArgCallback): Unit = js.native
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
  ): Unit = js.native
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
  @scala.inline
  implicit class AsyncKeyValueRWTransactionOps[Self <: AsyncKeyValueRWTransaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbort(value: BFSOneArgCallback => Unit): Self = this.set("abort", js.Any.fromFunction1(value))
    @scala.inline
    def setCommit(value: BFSOneArgCallback => Unit): Self = this.set("commit", js.Any.fromFunction1(value))
    @scala.inline
    def setDel(value: (String, BFSOneArgCallback) => Unit): Self = this.set("del", js.Any.fromFunction2(value))
    @scala.inline
    def setPut(
      value: (String, Buffer, Boolean, js.Function2[/* e */ ApiError, /* committed */ js.UndefOr[Boolean], Unit]) => Unit
    ): Self = this.set("put", js.Any.fromFunction4(value))
  }
  
}

