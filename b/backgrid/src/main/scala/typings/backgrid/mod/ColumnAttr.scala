package typings.backgrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnAttr extends js.Object {
  var cell: String = js.native
  var editable: Boolean = js.native
  var formater: String = js.native
  var headerCell: String = js.native
  var label: String = js.native
  var name: String = js.native
  var renderable: Boolean = js.native
  var sortable: Boolean = js.native
}

object ColumnAttr {
  @scala.inline
  def apply(
    cell: String,
    editable: Boolean,
    formater: String,
    headerCell: String,
    label: String,
    name: String,
    renderable: Boolean,
    sortable: Boolean
  ): ColumnAttr = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], formater = formater.asInstanceOf[js.Any], headerCell = headerCell.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], renderable = renderable.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnAttr]
  }
  @scala.inline
  implicit class ColumnAttrOps[Self <: ColumnAttr] (val x: Self) extends AnyVal {
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
    def setCell(value: String): Self = this.set("cell", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormater(value: String): Self = this.set("formater", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderCell(value: String): Self = this.set("headerCell", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderable(value: Boolean): Self = this.set("renderable", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
  }
  
}

