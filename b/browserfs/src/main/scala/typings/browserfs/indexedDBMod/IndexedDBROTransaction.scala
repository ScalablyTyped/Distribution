package typings.browserfs.indexedDBMod

import typings.browserfs.keyValueFilesystemMod.AsyncKeyValueROTransaction
import typings.std.IDBObjectStore
import typings.std.IDBTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/IndexedDB", "IndexedDBROTransaction")
@js.native
class IndexedDBROTransaction protected () extends AsyncKeyValueROTransaction {
  def this(tx: IDBTransaction, store: IDBObjectStore) = this()
  
  var store: IDBObjectStore = js.native
  
  var tx: IDBTransaction = js.native
}
