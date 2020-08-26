package typings.datatablesNet.DataTables

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "ajax-settings"
//#region "colunm-settings"
@js.native
trait ColumnSettings extends js.Object {
  /**
    * Cell type to be created for a column. th/td Since: 1.10
    */
  var cellType: js.UndefOr[String] = js.native
  /**
    * Class to assign to each cell in the column. Since: 1.10
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Add padding to the text content used when calculating the optimal with for a table. Since: 1.10
    */
  var contentPadding: js.UndefOr[String] = js.native
  /**
    * Cell created callback to allow DOM manipulation. Since: 1.10
    */
  var createdCell: js.UndefOr[FunctionColumnCreatedCell] = js.native
  /**
    * Class to assign to each cell in the column. Since: 1.10
    */
  var data: js.UndefOr[Double | String | ObjectColumnData | FunctionColumnData | Null] = js.native
  /**
    * Set default, static, content for a column. Since: 1.10
    */
  var defaultContent: js.UndefOr[String] = js.native
  /**
    * Set a descriptive name for a column. Since: 1.10
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Define multiple column ordering as the default order for a column. Since: 1.10
    */
  var orderData: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * Live DOM sorting type assignment. Since: 1.10
    */
  var orderDataType: js.UndefOr[String] = js.native
  /**
    * Ordering to always be applied to the table. Since 1.10
    *
    * Array type is prefix ordering only and is a two-element array:
    * 0: Column index to order upon.
    * 1: Direction so order to apply ("asc" for ascending order or "desc" for descending order).
    */
  var orderFixed: js.UndefOr[js.Array[_] | ObjectOrderFixed] = js.native
  /**
    * Order direction application sequence. Since: 1.10
    */
  var orderSequence: js.UndefOr[js.Array[String]] = js.native
  /**
    * Enable or disable ordering on this column. Since: 1.10
    */
  var orderable: js.UndefOr[Boolean] = js.native
  /**
    * Render (process) the data for use in the table. Since: 1.10
    */
  var render: js.UndefOr[Double | String | ObjectColumnData | FunctionColumnRender | ObjectColumnRender] = js.native
  /**
    * Enable or disable filtering on the data in this column. Since: 1.10
    */
  var searchable: js.UndefOr[Boolean] = js.native
  /**
    * Set the column title. Since: 1.10
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Set the column type - used for filtering and sorting string processing. Since: 1.10
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Enable or disable the display of this column. Since: 1.10
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * Column width assignment. Since: 1.10
    */
  var width: js.UndefOr[String] = js.native
}

object ColumnSettings {
  @scala.inline
  def apply(): ColumnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSettings]
  }
  @scala.inline
  implicit class ColumnSettingsOps[Self <: ColumnSettings] (val x: Self) extends AnyVal {
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
    def setCellType(value: String): Self = this.set("cellType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellType: Self = this.set("cellType", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContentPadding(value: String): Self = this.set("contentPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentPadding: Self = this.set("contentPadding", js.undefined)
    @scala.inline
    def setCreatedCell(
      value: (/* cell */ Node, /* cellData */ js.Any, /* rowData */ js.Any, /* row */ Double, /* col */ Double) => Unit
    ): Self = this.set("createdCell", js.Any.fromFunction5(value))
    @scala.inline
    def deleteCreatedCell: Self = this.set("createdCell", js.undefined)
    @scala.inline
    def setData(value: Double | String | ObjectColumnData | FunctionColumnData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    @scala.inline
    def setDefaultContent(value: String): Self = this.set("defaultContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultContent: Self = this.set("defaultContent", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOrderDataVarargs(value: Double*): Self = this.set("orderData", js.Array(value :_*))
    @scala.inline
    def setOrderData(value: Double | js.Array[Double]): Self = this.set("orderData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderData: Self = this.set("orderData", js.undefined)
    @scala.inline
    def setOrderDataType(value: String): Self = this.set("orderDataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderDataType: Self = this.set("orderDataType", js.undefined)
    @scala.inline
    def setOrderFixedVarargs(value: js.Any*): Self = this.set("orderFixed", js.Array(value :_*))
    @scala.inline
    def setOrderFixed(value: js.Array[_] | ObjectOrderFixed): Self = this.set("orderFixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderFixed: Self = this.set("orderFixed", js.undefined)
    @scala.inline
    def setOrderSequenceVarargs(value: String*): Self = this.set("orderSequence", js.Array(value :_*))
    @scala.inline
    def setOrderSequence(value: js.Array[String]): Self = this.set("orderSequence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderSequence: Self = this.set("orderSequence", js.undefined)
    @scala.inline
    def setOrderable(value: Boolean): Self = this.set("orderable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderable: Self = this.set("orderable", js.undefined)
    @scala.inline
    def setRenderFunction4(
      value: (/* data */ js.Any, /* type */ js.Any, /* row */ js.Any, /* meta */ CellMetaSettings) => js.Any
    ): Self = this.set("render", js.Any.fromFunction4(value))
    @scala.inline
    def setRender(value: Double | String | ObjectColumnData | FunctionColumnRender | ObjectColumnRender): Self = this.set("render", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setSearchable(value: Boolean): Self = this.set("searchable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchable: Self = this.set("searchable", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

