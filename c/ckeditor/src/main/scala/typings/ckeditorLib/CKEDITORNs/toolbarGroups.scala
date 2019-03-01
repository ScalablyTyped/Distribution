package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait toolbarGroups extends js.Object {
  var groups: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object toolbarGroups {
  @scala.inline
  def apply(groups: js.Array[java.lang.String] = null, name: java.lang.String = null): toolbarGroups = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[toolbarGroups]
  }
}

