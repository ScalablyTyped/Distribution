package typings.blueprintjsTable.columnMod

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsTable.cellMod.ICellRenderer
import typings.blueprintjsTable.columnHeaderCellMod.IColumnNameProps
import typings.blueprintjsTable.columnHeaderMod.IColumnHeaderRenderer
import typings.blueprintjsTable.esmRegionsMod.ColumnLoadingOption
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnProps
  extends IColumnNameProps
     with IProps {
  /**
    * An instance of `ICellRenderer`, a function that takes a row and column
    * index, and returns a `Cell` React element.
    */
  var cellRenderer: js.UndefOr[ICellRenderer] = js.undefined
  /**
    * An instance of `IColumnHeaderRenderer`, a function that takes a column
    * index and returns a `ColumnHeaderCell` React element.
    */
  var columnHeaderCellRenderer: js.UndefOr[IColumnHeaderRenderer] = js.undefined
  /**
    * A unique ID, similar to React's `key`. This is used, for example, to
    * maintain the width of a column between re-ordering and rendering. If no
    * IDs are provided, widths will be persisted across renders using a
    * column's index only. Columns widths can also be persisted outside the
    * `Table` component, then passed in with the `columnWidths` prop.
    */
  var id: js.UndefOr[String | Double] = js.undefined
  /**
    * Set this prop to specify whether to render the loading state of the
    * column header and cells in this column. Column-level `loadingOptions`
    * override `Table`-level `loadingOptions`. For example, if you set
    * `loadingOptions=[ TableLoadingOption.CELLS ]` on `Table` and
    * `loadingOptions=[ ColumnLoadingOption.HEADER ]` on a `Column`, the cells
    * in that column will _not_ show their loading state.
    */
  var loadingOptions: js.UndefOr[js.Array[ColumnLoadingOption]] = js.undefined
}

object IColumnProps {
  @scala.inline
  def apply(
    cellRenderer: (/* rowIndex */ Double, /* columnIndex */ Double) => ReactElement = null,
    className: String = null,
    columnHeaderCellRenderer: /* columnIndex */ Double => ReactElement = null,
    id: String | Double = null,
    loadingOptions: js.Array[ColumnLoadingOption] = null,
    name: String = null,
    nameRenderer: (/* name */ String, /* index */ js.UndefOr[Double]) => ReactElement = null
  ): IColumnProps = {
    val __obj = js.Dynamic.literal()
    if (cellRenderer != null) __obj.updateDynamic("cellRenderer")(js.Any.fromFunction2(cellRenderer))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnHeaderCellRenderer != null) __obj.updateDynamic("columnHeaderCellRenderer")(js.Any.fromFunction1(columnHeaderCellRenderer))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loadingOptions != null) __obj.updateDynamic("loadingOptions")(loadingOptions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nameRenderer != null) __obj.updateDynamic("nameRenderer")(js.Any.fromFunction2(nameRenderer))
    __obj.asInstanceOf[IColumnProps]
  }
}

