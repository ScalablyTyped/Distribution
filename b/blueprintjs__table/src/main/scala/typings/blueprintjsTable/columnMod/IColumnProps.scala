package typings.blueprintjsTable.columnMod

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsTable.cellMod.ICellRenderer
import typings.blueprintjsTable.columnHeaderCellMod.IColumnNameProps
import typings.blueprintjsTable.columnHeaderMod.IColumnHeaderRenderer
import typings.blueprintjsTable.esmRegionsMod.ColumnLoadingOption
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColumnProps
  extends IColumnNameProps
     with IProps {
  
  /**
    * An instance of `ICellRenderer`, a function that takes a row and column
    * index, and returns a `Cell` React element.
    */
  var cellRenderer: js.UndefOr[ICellRenderer] = js.native
  
  /**
    * An instance of `IColumnHeaderRenderer`, a function that takes a column
    * index and returns a `ColumnHeaderCell` React element.
    */
  var columnHeaderCellRenderer: js.UndefOr[IColumnHeaderRenderer] = js.native
  
  /**
    * A unique ID, similar to React's `key`. This is used, for example, to
    * maintain the width of a column between re-ordering and rendering. If no
    * IDs are provided, widths will be persisted across renders using a
    * column's index only. Columns widths can also be persisted outside the
    * `Table` component, then passed in with the `columnWidths` prop.
    */
  var id: js.UndefOr[String | Double] = js.native
  
  /**
    * Set this prop to specify whether to render the loading state of the
    * column header and cells in this column. Column-level `loadingOptions`
    * override `Table`-level `loadingOptions`. For example, if you set
    * `loadingOptions=[ TableLoadingOption.CELLS ]` on `Table` and
    * `loadingOptions=[ ColumnLoadingOption.HEADER ]` on a `Column`, the cells
    * in that column will _not_ show their loading state.
    */
  var loadingOptions: js.UndefOr[js.Array[ColumnLoadingOption]] = js.native
}
object IColumnProps {
  
  @scala.inline
  def apply(): IColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnProps]
  }
  
  @scala.inline
  implicit class IColumnPropsOps[Self <: IColumnProps] (val x: Self) extends AnyVal {
    
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
    def setCellRenderer(value: (/* rowIndex */ Double, /* columnIndex */ Double) => ReactElement): Self = this.set("cellRenderer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCellRenderer: Self = this.set("cellRenderer", js.undefined)
    
    @scala.inline
    def setColumnHeaderCellRenderer(value: /* columnIndex */ Double => ReactElement): Self = this.set("columnHeaderCellRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnHeaderCellRenderer: Self = this.set("columnHeaderCellRenderer", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLoadingOptionsVarargs(value: ColumnLoadingOption*): Self = this.set("loadingOptions", js.Array(value :_*))
    
    @scala.inline
    def setLoadingOptions(value: js.Array[ColumnLoadingOption]): Self = this.set("loadingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingOptions: Self = this.set("loadingOptions", js.undefined)
  }
}
