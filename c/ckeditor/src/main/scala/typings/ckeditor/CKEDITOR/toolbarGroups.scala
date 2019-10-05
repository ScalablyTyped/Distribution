package typings.ckeditor.CKEDITOR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait toolbarGroups extends js.Object {
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object toolbarGroups {
  @scala.inline
  def apply(groups: js.Array[String] = null, name: String = null): toolbarGroups = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[toolbarGroups]
  }
}

