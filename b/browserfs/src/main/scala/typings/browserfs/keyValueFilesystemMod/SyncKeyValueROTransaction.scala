package typings.browserfs.keyValueFilesystemMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncKeyValueROTransaction extends js.Object {
  /**
    * Retrieves the data at the given key. Throws an ApiError if an error occurs
    * or if the key does not exist.
    * @param key The key to look under for data.
    * @return The data stored under the key, or undefined if not present.
    */
  def get(key: String): js.UndefOr[Buffer] = js.native
}

object SyncKeyValueROTransaction {
  @scala.inline
  def apply(get: String => js.UndefOr[Buffer]): SyncKeyValueROTransaction = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[SyncKeyValueROTransaction]
  }
  @scala.inline
  implicit class SyncKeyValueROTransactionOps[Self <: SyncKeyValueROTransaction] (val x: Self) extends AnyVal {
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
    def setGet(value: String => js.UndefOr[Buffer]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

