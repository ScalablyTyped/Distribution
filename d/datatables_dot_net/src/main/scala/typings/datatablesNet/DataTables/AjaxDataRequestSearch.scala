package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjaxDataRequestSearch extends js.Object {
  var regex: Boolean = js.native
  var value: String = js.native
}

object AjaxDataRequestSearch {
  @scala.inline
  def apply(regex: Boolean, value: String): AjaxDataRequestSearch = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxDataRequestSearch]
  }
  @scala.inline
  implicit class AjaxDataRequestSearchOps[Self <: AjaxDataRequestSearch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRegex(value: Boolean): Self = this.set("regex", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

