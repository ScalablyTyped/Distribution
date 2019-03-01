package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "ajax-settings"
//#region "colunm-settings"
trait ColumnSettings extends js.Object {
  /**
    * Cell type to be created for a column. th/td Since: 1.10
    */
  var cellType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Class to assign to each cell in the column. Since: 1.10
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Add padding to the text content used when calculating the optimal with for a table. Since: 1.10
    */
  var contentPadding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Cell created callback to allow DOM manipulation. Since: 1.10
    */
  var createdCell: js.UndefOr[FunctionColumnCreatedCell] = js.undefined
  /**
    * Class to assign to each cell in the column. Since: 1.10
    */
  var data: js.UndefOr[
    scala.Double | java.lang.String | ObjectColumnData | FunctionColumnData | scala.Null
  ] = js.undefined
  /**
    * Set default, static, content for a column. Since: 1.10
    */
  var defaultContent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set a descriptive name for a column. Since: 1.10
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Define multiple column ordering as the default order for a column. Since: 1.10
    */
  var orderData: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  /**
    * Live DOM sorting type assignment. Since: 1.10
    */
  var orderDataType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Ordering to always be applied to the table. Since 1.10
    *
    * Array type is prefix ordering only and is a two-element array:
    * 0: Column index to order upon.
    * 1: Direction so order to apply ("asc" for ascending order or "desc" for descending order).
    */
  var orderFixed: js.UndefOr[js.Array[_] | ObjectOrderFixed] = js.undefined
  /**
    * Order direction application sequence. Since: 1.10
    */
  var orderSequence: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Enable or disable ordering on this column. Since: 1.10
    */
  var orderable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Render (process) the data for use in the table. Since: 1.10
    */
  var render: js.UndefOr[
    scala.Double | java.lang.String | ObjectColumnData | FunctionColumnRender | ObjectColumnRender
  ] = js.undefined
  /**
    * Enable or disable filtering on the data in this column. Since: 1.10
    */
  var searchable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the column title. Since: 1.10
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the column type - used for filtering and sorting string processing. Since: 1.10
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Enable or disable the display of this column. Since: 1.10
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Column width assignment. Since: 1.10
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object ColumnSettings {
  @scala.inline
  def apply(
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
  ): ColumnSettings = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[ColumnSettings]
  }
}

