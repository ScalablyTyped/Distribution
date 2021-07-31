package typings.blueprintjsTable

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsTable.cellMod.ICellRenderer
import typings.blueprintjsTable.columnHeaderCellMod.IColumnNameProps
import typings.blueprintjsTable.columnHeaderMod.IColumnHeaderRenderer
import typings.blueprintjsTable.esmRegionsMod.ColumnLoadingOption
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnMod {
  
  @JSImport("@blueprintjs/table/lib/esm/column", "Column")
  @js.native
  class Column protected ()
    extends PureComponent[IColumnProps, js.Object, js.Any] {
    def this(props: IColumnProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IColumnProps, context: js.Any) = this()
  }
  /* static members */
  object Column {
    
    @JSImport("@blueprintjs/table/lib/esm/column", "Column")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/column", "Column.defaultProps")
    @js.native
    def defaultProps: IColumnProps = js.native
    @scala.inline
    def defaultProps_=(x: IColumnProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/column", "Column.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait IColumnProps
    extends StObject
       with IColumnNameProps
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
    def apply(): IColumnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColumnProps]
    }
    
    @scala.inline
    implicit class IColumnPropsMutableBuilder[Self <: IColumnProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellRenderer(value: (/* rowIndex */ Double, /* columnIndex */ Double) => ReactElement): Self = StObject.set(x, "cellRenderer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellRendererUndefined: Self = StObject.set(x, "cellRenderer", js.undefined)
      
      @scala.inline
      def setColumnHeaderCellRenderer(value: /* columnIndex */ Double => ReactElement): Self = StObject.set(x, "columnHeaderCellRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColumnHeaderCellRendererUndefined: Self = StObject.set(x, "columnHeaderCellRenderer", js.undefined)
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLoadingOptions(value: js.Array[ColumnLoadingOption]): Self = StObject.set(x, "loadingOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingOptionsUndefined: Self = StObject.set(x, "loadingOptions", js.undefined)
      
      @scala.inline
      def setLoadingOptionsVarargs(value: ColumnLoadingOption*): Self = StObject.set(x, "loadingOptions", js.Array(value :_*))
    }
  }
}
