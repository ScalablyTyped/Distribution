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
    val __obj = js.Dynamic.literal(cell = cell, editable = editable, formater = formater, headerCell = headerCell, label = label, name = name, renderable = renderable, sortable = sortable)
  
    __obj.asInstanceOf[ColumnAttr]
  }
}

