package typings.browserfs.indexedDBMod

import typings.browserfs.keyValueFilesystemMod.AsyncKeyValueRWTransaction
import typings.std.IDBObjectStore
import typings.std.IDBTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/IndexedDB", "IndexedDBRWTransaction")
@js.native
class IndexedDBRWTransaction protected ()
  extends IndexedDBROTransaction
     with AsyncKeyValueRWTransaction {
  def this(tx: IDBTransaction, store: IDBObjectStore) = this()
}
