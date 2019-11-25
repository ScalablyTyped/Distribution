package typings.browserfs.distNodeBackendIndexedDBMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexedDBFileSystemOptions extends js.Object {
  var storeName: js.UndefOr[String] = js.undefined
}

object IndexedDBFileSystemOptions {
  @scala.inline
  def apply(storeName: String = null): IndexedDBFileSystemOptions = {
    val __obj = js.Dynamic.literal()
    if (storeName != null) __obj.updateDynamic("storeName")(storeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedDBFileSystemOptions]
  }
}

