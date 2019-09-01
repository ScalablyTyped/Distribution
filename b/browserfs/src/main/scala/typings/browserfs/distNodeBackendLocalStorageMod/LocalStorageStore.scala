package typings.browserfs.distNodeBackendLocalStorageMod

import typings.browserfs.distNodeGenericKeyUnderscoreValueUnderscoreFilesystemMod.SimpleSyncStore
import typings.browserfs.distNodeGenericKeyUnderscoreValueUnderscoreFilesystemMod.SyncKeyValueStore
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/LocalStorage", "LocalStorageStore")
@js.native
class LocalStorageStore ()
  extends SyncKeyValueStore
     with SimpleSyncStore {
  /* CompleteClass */
  override def del(key: String): Unit = js.native
  /* CompleteClass */
  override def get(key: String): js.UndefOr[Buffer] = js.native
  /* CompleteClass */
  override def put(key: String, data: Buffer, overwrite: Boolean): Boolean = js.native
}

