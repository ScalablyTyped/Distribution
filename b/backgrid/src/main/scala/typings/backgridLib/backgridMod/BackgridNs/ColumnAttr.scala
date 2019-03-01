package typings
package backgridLib.backgridMod.BackgridNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cell")(cell)
    __obj.updateDynamic("editable")(editable)
    __obj.updateDynamic("formater")(formater)
    __obj.updateDynamic("headerCell")(headerCell)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("renderable")(renderable)
    __obj.updateDynamic("sortable")(sortable)
    __obj.asInstanceOf[ColumnAttr]
  }
}

