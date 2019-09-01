package typings.browserfs.distNodeBackendIndexedDBMod

import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeGenericKeyUnderscoreValueUnderscoreFilesystemMod.AsyncKeyValueStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/IndexedDB", "IndexedDBStore")
@js.native
class IndexedDBStore protected () extends AsyncKeyValueStore {
  def this(cb: BFSCallback[IndexedDBStore]) = this()
  def this(cb: BFSCallback[IndexedDBStore], storeName: String) = this()
  var db: js.Any = js.native
  var storeName: js.Any = js.native
}

