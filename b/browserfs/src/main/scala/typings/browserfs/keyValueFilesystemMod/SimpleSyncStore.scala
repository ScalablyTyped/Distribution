package typings.browserfs.keyValueFilesystemMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleSyncStore extends js.Object {
  def del(key: String): Unit
  def get(key: String): js.UndefOr[Buffer]
  def put(key: String, data: Buffer, overwrite: Boolean): Boolean
}

object SimpleSyncStore {
  @scala.inline
  def apply(del: String => Unit, get: String => js.UndefOr[Buffer], put: (String, Buffer, Boolean) => Boolean): SimpleSyncStore = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), get = js.Any.fromFunction1(get), put = js.Any.fromFunction3(put))
    __obj.asInstanceOf[SimpleSyncStore]
  }
}

