package typings.bootstrapMultiselect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Templates extends js.Object {
  var button: js.UndefOr[String] = js.native
  var divider: js.UndefOr[String] = js.native
  var filter: js.UndefOr[String] = js.native
  var filterClearBtn: js.UndefOr[String] = js.native
  var li: js.UndefOr[String] = js.native
  var liGroup: js.UndefOr[String] = js.native
  var ul: js.UndefOr[String] = js.native
}

object Templates {
  @scala.inline
  def apply(): Templates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Templates]
  }
  @scala.inline
  implicit class TemplatesOps[Self <: Templates] (val x: Self) extends AnyVal {
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
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setDivider(value: String): Self = this.set("divider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDivider: Self = this.set("divider", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFilterClearBtn(value: String): Self = this.set("filterClearBtn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterClearBtn: Self = this.set("filterClearBtn", js.undefined)
    @scala.inline
    def setLi(value: String): Self = this.set("li", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLi: Self = this.set("li", js.undefined)
    @scala.inline
    def setLiGroup(value: String): Self = this.set("liGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiGroup: Self = this.set("liGroup", js.undefined)
    @scala.inline
    def setUl(value: String): Self = this.set("ul", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUl: Self = this.set("ul", js.undefined)
  }
  
}

