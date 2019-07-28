package typings.backlogDashJs.backlogDashJsMod.EntityNs.FileNs

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserFileData extends FileData {
  var blob: js.UndefOr[js.Function0[js.Promise[Blob]]] = js.undefined
  var body: js.Any
  var url: String
}

object BrowserFileData {
  @scala.inline
  def apply(body: js.Any, url: String, blob: () => js.Promise[Blob] = null): BrowserFileData = {
    val __obj = js.Dynamic.literal(body = body, url = url)
    if (blob != null) __obj.updateDynamic("blob")(js.Any.fromFunction0(blob))
    __obj.asInstanceOf[BrowserFileData]
  }
}

