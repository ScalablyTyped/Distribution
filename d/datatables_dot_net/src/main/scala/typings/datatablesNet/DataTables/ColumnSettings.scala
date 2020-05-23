package typings.datatablesNet.DataTables

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "ajax-settings"
//#region "colunm-settings"
trait ColumnSettings extends js.Object {
  /**
    * Cell type to be created for a column. th/td Since: 1.10
    */
  var cellType: js.UndefOr[String] = js.undefined
  /**
    * Class to assign to each cell in the column. Since: 1.10
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Add padding to the text content used when calculating the optimal with for a table. Since: 1.10
    */
  var contentPadding: js.UndefOr[String] = js.undefined
  /**
    * Cell created callback to allow DOM manipulation. Since: 1.10
    */
  var createdCell: js.UndefOr[FunctionColumnCreatedCell] = js.undefined
  /**
    * Class to assign to each cell in the column. Since: 1.10
    */
  var data: js.UndefOr[Double | String | ObjectColumnData | FunctionColumnData | Null] = js.undefined
  /**
    * Set default, static, content for a column. Since: 1.10
    */
  var defaultContent: js.UndefOr[String] = js.undefined
  /**
    * Set a descriptive name for a column. Since: 1.10
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Define multiple column ordering as the default order for a column. Since: 1.10
    */
  var orderData: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
    * Live DOM sorting type assignment. Since: 1.10
    */
  var orderDataType: js.UndefOr[String] = js.undefined
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
  var orderSequence: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Enable or disable ordering on this column. Since: 1.10
    */
  var orderable: js.UndefOr[Boolean] = js.undefined
  /**
    * Render (process) the data for use in the table. Since: 1.10
    */
  var render: js.UndefOr[Double | String | ObjectColumnData | FunctionColumnRender | ObjectColumnRender] = js.undefined
  /**
    * Enable or disable filtering on the data in this column. Since: 1.10
    */
  var searchable: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the column title. Since: 1.10
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Set the column type - used for filtering and sorting string processing. Since: 1.10
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Enable or disable the display of this column. Since: 1.10
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * Column width assignment. Since: 1.10
    */
  var width: js.UndefOr[String] = js.undefined
}

object ColumnSettings {
  @scala.inline
  def apply(
    cellType: String = null,
    className: String = null,
    contentPadding: String = null,
    createdCell: (/* cell */ Node, /* cellData */ js.Any, /* rowData */ js.Any, /* row */ Double, /* col */ Double) => Unit = null,
    data: js.UndefOr[Null | Double | String | ObjectColumnData | FunctionColumnData] = js.undefined,
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
  ): ColumnSettings = {
    val __obj = js.Dynamic.literal()
    if (cellType != null) __obj.updateDynamic("cellType")(cellType.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentPadding != null) __obj.updateDynamic("contentPadding")(contentPadding.asInstanceOf[js.Any])
    if (createdCell != null) __obj.updateDynamic("createdCell")(js.Any.fromFunction5(createdCell))
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultContent != null) __obj.updateDynamic("defaultContent")(defaultContent.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (orderData != null) __obj.updateDynamic("orderData")(orderData.asInstanceOf[js.Any])
    if (orderDataType != null) __obj.updateDynamic("orderDataType")(orderDataType.asInstanceOf[js.Any])
    if (orderFixed != null) __obj.updateDynamic("orderFixed")(orderFixed.asInstanceOf[js.Any])
    if (orderSequence != null) __obj.updateDynamic("orderSequence")(orderSequence.asInstanceOf[js.Any])
    if (!js.isUndefined(orderable)) __obj.updateDynamic("orderable")(orderable.get.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSettings]
  }
}

