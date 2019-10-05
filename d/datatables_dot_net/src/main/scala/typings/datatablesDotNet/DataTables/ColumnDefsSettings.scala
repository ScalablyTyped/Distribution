package typings.datatablesDotNet.DataTables

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDefsSettings extends ColumnSettings {
  var targets: String | Double | (js.Array[Double | String])
}

object ColumnDefsSettings {
  @scala.inline
  def apply(
    targets: String | Double | (js.Array[Double | String]),
    cellType: String = null,
    className: String = null,
    contentPadding: String = null,
    createdCell: (/* cell */ Node, /* cellData */ js.Any, /* rowData */ js.Any, /* row */ Double, /* col */ Double) => Unit = null,
    data: Double | String | ObjectColumnData | FunctionColumnData = null,
    defaultContent: String = null,
    name: String = null,
    orderData: Double | js.Array[Double] = null,
    orderDataType: String = null,
    orderFixed: js.Array[_] | ObjectOrderFixed = null,
    orderSequence: js.Array[String] = null,
    orderable: js.UndefOr[Boolean] = js.undefined,
    render: Double | String | ObjectColumnData | FunctionColumnRender | ObjectColumnRender = null,
    searchable: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    `type`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: String = null
  ): ColumnDefsSettings = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    if (cellType != null) __obj.updateDynamic("cellType")(cellType)
    if (className != null) __obj.updateDynamic("className")(className)
    if (contentPadding != null) __obj.updateDynamic("contentPadding")(contentPadding)
    if (createdCell != null) __obj.updateDynamic("createdCell")(js.Any.fromFunction5(createdCell))
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

