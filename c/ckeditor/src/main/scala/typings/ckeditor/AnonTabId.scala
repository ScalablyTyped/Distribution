package typings.ckeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTabId extends js.Object {
  var tabId: js.UndefOr[String] = js.undefined
}

object AnonTabId {
  @scala.inline
  def apply(tabId: String = null): AnonTabId = {
    val __obj = js.Dynamic.literal()
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTabId]
  }
}

