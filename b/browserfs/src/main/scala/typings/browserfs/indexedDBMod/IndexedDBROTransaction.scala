package typings.browserfs.indexedDBMod

import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.keyValueFilesystemMod.AsyncKeyValueROTransaction
import typings.node.Buffer
import typings.std.IDBObjectStore
import typings.std.IDBTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/IndexedDB", "IndexedDBROTransaction")
@js.native
class IndexedDBROTransaction protected () extends AsyncKeyValueROTransaction {
  def this(tx: IDBTransaction, store: IDBObjectStore) = this()
  var store: IDBObjectStore = js.native
  var tx: IDBTransaction = js.native
  /**
    * Retrieves the data at the given key.
    * @param key The key to look under for data.
    */
  /* CompleteClass */
  override def get(key: String, cb: BFSCallback[Buffer]): Unit = js.native
}

