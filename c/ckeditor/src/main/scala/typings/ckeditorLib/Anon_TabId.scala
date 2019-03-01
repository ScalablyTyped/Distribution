package typings
package ckeditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TabId extends js.Object {
  var tabId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_TabId {
  @scala.inline
  def apply(tabId: java.lang.String = null): Anon_TabId = {
    val __obj = js.Dynamic.literal()
    if (tabId != null) __obj.updateDynamic("tabId")(tabId)
    __obj.asInstanceOf[Anon_TabId]
  }
}

