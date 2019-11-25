package typings.ckeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TabId extends js.Object {
  var tabId: js.UndefOr[String] = js.undefined
}

object Anon_TabId {
  @scala.inline
  def apply(tabId: String = null): Anon_TabId = {
    val __obj = js.Dynamic.literal()
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TabId]
  }
}

