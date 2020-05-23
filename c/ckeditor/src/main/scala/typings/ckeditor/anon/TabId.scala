package typings.ckeditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabId extends js.Object {
  var tabId: js.UndefOr[String] = js.undefined
}

object TabId {
  @scala.inline
  def apply(tabId: String = null): TabId = {
    val __obj = js.Dynamic.literal()
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabId]
  }
}

