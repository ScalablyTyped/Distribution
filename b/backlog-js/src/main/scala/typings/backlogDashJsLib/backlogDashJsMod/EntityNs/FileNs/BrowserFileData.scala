package typings
package backlogDashJsLib.backlogDashJsMod.EntityNs.FileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserFileData extends FileData {
  var blob: js.UndefOr[js.Function0[js.Promise[stdLib.Blob]]] = js.undefined
  var body: js.Any
  var url: java.lang.String
}

object BrowserFileData {
  @scala.inline
  def apply(body: js.Any, url: java.lang.String, blob: js.Function0[js.Promise[stdLib.Blob]] = null): BrowserFileData = {
    val __obj = js.Dynamic.literal(body = body, url = url)
    if (blob != null) __obj.updateDynamic("blob")(blob)
    __obj.asInstanceOf[BrowserFileData]
  }
}

