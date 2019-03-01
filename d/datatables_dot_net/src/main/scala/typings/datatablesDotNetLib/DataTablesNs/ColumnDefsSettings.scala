package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDefsSettings extends ColumnSettings {
  var targets: java.lang.String | scala.Double | (js.Array[scala.Double | java.lang.String])
}

object ColumnDefsSettings {
  @scala.inline
  def apply(
    targets: java.lang.String | scala.Double | (js.Array[scala.Double | java.lang.String]),
    cellType: java.lang.String = null,
    className: java.lang.String = null,
    contentPadding: java.lang.String = null,
    createdCell: FunctionColumnCreatedCell = null,
    data: scala.Double | java.lang.String | ObjectColumnData | FunctionColumnData = null,
    defaultContent: java.lang.String = null,
    name: java.lang.String = null,
    orderData: scala.Double | js.Array[scala.Double] = null,
    orderDataType: java.lang.String = null,
    orderFixed: js.Array[_] | ObjectOrderFixed = null,
    orderSequence: js.Array[java.lang.String] = null,
    orderable: js.UndefOr[scala.Boolean] = js.undefined,
    render: scala.Double | java.lang.String | ObjectColumnData | FunctionColumnRender | ObjectColumnRender = null,
    searchable: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: java.lang.String = null
  ): ColumnDefsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (cellType != null) __obj.updateDynamic("cellType")(cellType)
    if (className != null) __obj.updateDynamic("className")(className)
    if (contentPadding != null) __obj.updateDynamic("contentPadding")(contentPadding)
    if (createdCell != null) __obj.updateDynamic("createdCell")(createdCell)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultContent != null) __obj.updateDynamic("defaultContent")(defaultContent)
    if (name != null) __obj.updateDynamic("name")(name)
    if (orderData != null) __obj.updateDynamic("orderData")(orderData.asInstanceOf[js.Any])
    if (orderDataType != null) __obj.updateDynamic("orderDataType")(orderDataType)
    if (orderFixed != null) __obj.updateDynamic("orderFixed")(orderFixed.asInstanceOf[js.Any])
    if (orderSequence != null) __obj.updateDynamic("orderSequence")(orderSequence)
    if (!js.isUndefined(orderable)) __obj.updateDynamic("orderable")(orderable)
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ColumnDefsSettings]
  }
}

