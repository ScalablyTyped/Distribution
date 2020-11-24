package typings.browserfs.keyValueFilesystemMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncKeyValueRWTransaction extends SyncKeyValueROTransaction {
  
  /**
    * Aborts and rolls back the transaction.
    */
  def abort(): Unit = js.native
  
  /**
    * Commits the transaction.
    */
  def commit(): Unit = js.native
  
  /**
    * Deletes the data at the given key.
    * @param key The key to delete from the store.
    */
  def del(key: String): Unit = js.native
  
  /**
    * Adds the data to the store under the given key.
    * @param key The key to add the data under.
    * @param data The data to add to the store.
    * @param overwrite If 'true', overwrite any existing data. If 'false',
    *   avoids storing the data if the key exists.
    * @return True if storage succeeded, false otherwise.
    */
  def put(key: String, data: Buffer, overwrite: Boolean): Boolean = js.native
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
  
  @scala.inline
  implicit class SyncKeyValueRWTransactionOps[Self <: SyncKeyValueRWTransaction] (val x: Self) extends AnyVal {
    
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
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCommit(value: () => Unit): Self = this.set("commit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDel(value: String => Unit): Self = this.set("del", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPut(value: (String, Buffer, Boolean) => Boolean): Self = this.set("put", js.Any.fromFunction3(value))
  }
}
