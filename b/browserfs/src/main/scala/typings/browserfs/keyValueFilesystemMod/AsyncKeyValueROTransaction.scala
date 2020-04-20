package typings.browserfs.keyValueFilesystemMod

import typings.browserfs.fileSystemMod.BFSCallback
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncKeyValueROTransaction extends js.Object {
  /**
    * Retrieves the data at the given key.
    * @param key The key to look under for data.
    */
  def get(key: String, cb: BFSCallback[Buffer]): Unit
}

object AsyncKeyValueROTransaction {
  @scala.inline
  def apply(get: (String, BFSCallback[Buffer]) => Unit): AsyncKeyValueROTransaction = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
    __obj.asInstanceOf[AsyncKeyValueROTransaction]
  }
}

