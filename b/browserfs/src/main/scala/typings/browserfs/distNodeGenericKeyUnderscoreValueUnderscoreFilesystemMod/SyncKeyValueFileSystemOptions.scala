package typings.browserfs.distNodeGenericKeyUnderscoreValueUnderscoreFilesystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncKeyValueFileSystemOptions extends js.Object {
  /**
    * The actual key-value store to read from/write to.
    */
  var store: SyncKeyValueStore
}

object SyncKeyValueFileSystemOptions {
  @scala.inline
  def apply(store: SyncKeyValueStore): SyncKeyValueFileSystemOptions = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SyncKeyValueFileSystemOptions]
  }
}

