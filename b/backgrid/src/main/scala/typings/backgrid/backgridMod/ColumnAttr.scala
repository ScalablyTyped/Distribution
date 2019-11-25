package typings.backgrid.backgridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnAttr extends js.Object {
  var cell: String
  var editable: Boolean
  var formater: String
  var headerCell: String
  var label: String
  var name: String
  var renderable: Boolean
  var sortable: Boolean
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
}

