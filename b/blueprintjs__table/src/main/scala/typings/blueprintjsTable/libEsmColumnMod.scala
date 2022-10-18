package typings.blueprintjsTable

import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.blueprintjsTable.libEsmCellCellMod.CellRenderer
import typings.blueprintjsTable.libEsmHeadersColumnHeaderCellMod.IColumnNameProps
import typings.blueprintjsTable.libEsmHeadersColumnHeaderMod.ColumnHeaderRenderer
import typings.blueprintjsTable.libEsmRegionsMod.ColumnLoadingOption
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmColumnMod {
  
  @JSImport("@blueprintjs/table/lib/esm/column", "Column")
  @js.native
  open class Column protected ()
    extends PureComponent[IColumnProps, js.Object, Any] {
    def this(props: IColumnProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IColumnProps, context: Any) = this()
  }
  /* static members */
  object Column {
    
    @JSImport("@blueprintjs/table/lib/esm/column", "Column")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/column", "Column.defaultProps")
    @js.native
    def defaultProps: IColumnProps = js.native
    inline def defaultProps_=(x: IColumnProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/column", "Column.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type ColumnProps = IColumnProps
  
  trait IColumnProps
    extends StObject
       with IColumnNameProps
       with IProps {
    
    /**
      * An instance of `CellRenderer`, a function that takes a row and column
      * index, and returns a `Cell` React element.
      */
    var cellRenderer: js.UndefOr[CellRenderer] = js.undefined
    
    /**
      * An instance of `ColumnHeaderRenderer`, a function that takes a column
      * index and returns a `ColumnHeaderCell2` React element.
      */
    var columnHeaderCellRenderer: js.UndefOr[ColumnHeaderRenderer] = js.undefined
    
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
    
    inline def apply(): IColumnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColumnProps]
    }
    
    extension [Self <: IColumnProps](x: Self) {
      
      inline def setCellRenderer(value: (/* rowIndex */ Double, /* columnIndex */ Double) => js.UndefOr[ReactElement]): Self = StObject.set(x, "cellRenderer", js.Any.fromFunction2(value))
      
      inline def setCellRendererUndefined: Self = StObject.set(x, "cellRenderer", js.undefined)
      
      inline def setColumnHeaderCellRenderer(value: /* columnIndex */ Double => ReactElement | Null): Self = StObject.set(x, "columnHeaderCellRenderer", js.Any.fromFunction1(value))
      
      inline def setColumnHeaderCellRendererUndefined: Self = StObject.set(x, "columnHeaderCellRenderer", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLoadingOptions(value: js.Array[ColumnLoadingOption]): Self = StObject.set(x, "loadingOptions", value.asInstanceOf[js.Any])
      
      inline def setLoadingOptionsUndefined: Self = StObject.set(x, "loadingOptions", js.undefined)
      
      inline def setLoadingOptionsVarargs(value: ColumnLoadingOption*): Self = StObject.set(x, "loadingOptions", js.Array(value*))
    }
  }
}
