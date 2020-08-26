package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableComponentProperties extends ComponentProperties {
  var ariaColumnCount: js.UndefOr[Double] = js.native
  var ariaRowCount: js.UndefOr[Double] = js.native
  var columns: js.Array[String | TableColumn] = js.native
  var data: js.Array[js.Array[_]] = js.native
  var fontSize: js.UndefOr[Double | String] = js.native
  var forceFitColumns: js.UndefOr[ColumnSizingMode] = js.native
  var moveFocusOutWithTab: js.UndefOr[Boolean] = js.native
  var selectedRows: js.UndefOr[js.Array[Double]] = js.native
  var title: js.UndefOr[String] = js.native
  var updateCells: js.UndefOr[js.Array[TableCell]] = js.native
}

object TableComponentProperties {
  @scala.inline
  def apply(columns: js.Array[String | TableColumn], data: js.Array[js.Array[_]]): TableComponentProperties = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableComponentProperties]
  }
  @scala.inline
  implicit class TableComponentPropertiesOps[Self <: TableComponentProperties] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: (String | TableColumn)*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[String | TableColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: js.Array[js.Any]*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Array[_]]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setAriaColumnCount(value: Double): Self = this.set("ariaColumnCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaColumnCount: Self = this.set("ariaColumnCount", js.undefined)
    @scala.inline
    def setAriaRowCount(value: Double): Self = this.set("ariaRowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaRowCount: Self = this.set("ariaRowCount", js.undefined)
    @scala.inline
    def setFontSize(value: Double | String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setForceFitColumns(value: ColumnSizingMode): Self = this.set("forceFitColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceFitColumns: Self = this.set("forceFitColumns", js.undefined)
    @scala.inline
    def setMoveFocusOutWithTab(value: Boolean): Self = this.set("moveFocusOutWithTab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveFocusOutWithTab: Self = this.set("moveFocusOutWithTab", js.undefined)
    @scala.inline
    def setSelectedRowsVarargs(value: Double*): Self = this.set("selectedRows", js.Array(value :_*))
    @scala.inline
    def setSelectedRows(value: js.Array[Double]): Self = this.set("selectedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedRows: Self = this.set("selectedRows", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUpdateCellsVarargs(value: TableCell*): Self = this.set("updateCells", js.Array(value :_*))
    @scala.inline
    def setUpdateCells(value: js.Array[TableCell]): Self = this.set("updateCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateCells: Self = this.set("updateCells", js.undefined)
  }
  
}

