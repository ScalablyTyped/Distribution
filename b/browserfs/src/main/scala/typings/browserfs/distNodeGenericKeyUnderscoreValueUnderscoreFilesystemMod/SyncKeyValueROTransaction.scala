package typings.browserfs.distNodeGenericKeyUnderscoreValueUnderscoreFilesystemMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncKeyValueROTransaction extends js.Object {
  /**
    * Retrieves the data at the given key. Throws an ApiError if an error occurs
    * or if the key does not exist.
    * @param key The key to look under for data.
    * @return The data stored under the key, or undefined if not present.
    */
  def get(key: String): js.UndefOr[Buffer]
}

object SyncKeyValueROTransaction {
  @scala.inline
  def apply(get: String => js.UndefOr[Buffer]): SyncKeyValueROTransaction = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[SyncKeyValueROTransaction]
  }
}

