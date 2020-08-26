package typings.browserfs.keyValueFilesystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/generic/key_value_filesystem", "SimpleSyncRWTransaction")
@js.native
class SimpleSyncRWTransaction protected () extends SyncKeyValueRWTransaction {
  def this(store: SimpleSyncStore) = this()
  /**
    * List of keys modified in this transaction, if any.
    */
  var modifiedKeys: js.Any = js.native
  /**
    * Stores data in the keys we modify prior to modifying them.
    * Allows us to roll back commits.
    */
  var originalData: js.Any = js.native
  var store: js.Any = js.native
  /**
    * Marks the given key as modified, and stashes its value if it has not been
    * stashed already.
    */
  /* private */ def markModified(key: js.Any): js.Any = js.native
  /**
    * Stashes given key value pair into `originalData` if it doesn't already
    * exist. Allows us to stash values the program is requesting anyway to
    * prevent needless `get` requests if the program modifies the data later
    * on during the transaction.
    */
  /* private */ def stashOldValue(key: js.Any, value: js.Any): js.Any = js.native
}

