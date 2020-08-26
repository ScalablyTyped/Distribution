package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjaxDataRequestColumn extends js.Object {
  var data: String | Double = js.native
  var name: String = js.native
  var orderable: Boolean = js.native
  var search: AjaxDataRequestSearch = js.native
  var searchable: Boolean = js.native
}

object AjaxDataRequestColumn {
  @scala.inline
  def apply(
    data: String | Double,
    name: String,
    orderable: Boolean,
    search: AjaxDataRequestSearch,
    searchable: Boolean
  ): AjaxDataRequestColumn = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orderable = orderable.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxDataRequestColumn]
  }
  @scala.inline
  implicit class AjaxDataRequestColumnOps[Self <: AjaxDataRequestColumn] (val x: Self) extends AnyVal {
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
    def setData(value: String | Double): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrderable(value: Boolean): Self = this.set("orderable", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch(value: AjaxDataRequestSearch): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchable(value: Boolean): Self = this.set("searchable", value.asInstanceOf[js.Any])
  }
  
}

