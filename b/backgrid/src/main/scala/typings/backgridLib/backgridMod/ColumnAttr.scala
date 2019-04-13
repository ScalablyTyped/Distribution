package typings
package backgridLib.backgridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnAttr extends js.Object {
  var cell: java.lang.String
  var editable: scala.Boolean
  var formater: java.lang.String
  var headerCell: java.lang.String
  var label: java.lang.String
  var name: java.lang.String
  var renderable: scala.Boolean
  var sortable: scala.Boolean
}

object ColumnAttr {
  @scala.inline
  def apply(
    cell: java.lang.String,
    editable: scala.Boolean,
    formater: java.lang.String,
    headerCell: java.lang.String,
    label: java.lang.String,
    name: java.lang.String,
    renderable: scala.Boolean,
    sortable: scala.Boolean
  ): ColumnAttr = {
    val __obj = js.Dynamic.literal(cell = cell, editable = editable, formater = formater, headerCell = headerCell, label = label, name = name, renderable = renderable, sortable = sortable)
  
    __obj.asInstanceOf[ColumnAttr]
  }
}

