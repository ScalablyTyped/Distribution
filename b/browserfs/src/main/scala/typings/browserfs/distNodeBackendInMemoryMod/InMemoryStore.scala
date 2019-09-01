package typings.browserfs.distNodeBackendInMemoryMod

import typings.browserfs.distNodeGenericKeyUnderscoreValueUnderscoreFilesystemMod.SimpleSyncStore
import typings.browserfs.distNodeGenericKeyUnderscoreValueUnderscoreFilesystemMod.SyncKeyValueStore
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/InMemory", "InMemoryStore")
@js.native
class InMemoryStore ()
  extends SyncKeyValueStore
     with SimpleSyncStore {
  var store: js.Any = js.native
  /* CompleteClass */
  override def del(key: String): Unit = js.native
  /* CompleteClass */
  override def get(key: String): js.UndefOr[Buffer] = js.native
  /* CompleteClass */
  override def put(key: String, data: Buffer, overwrite: Boolean): Boolean = js.native
}

