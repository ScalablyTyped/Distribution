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
  var data: js.UndefOr[scala.Double | java.lang.String | ObjectColumnData | FunctionColumnData] = js.undefined
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

