package typings.blueprintjsTable

import typings.blueprintjsCore.mod.AbstractComponent2
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsTable.anon.RenderMode
import typings.blueprintjsTable.cellMod.ICellRenderer
import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.gridMod.Grid
import typings.blueprintjsTable.gridMod.IColumnIndices
import typings.blueprintjsTable.gridMod.IRowIndices
import typings.blueprintjsTable.rectMod.Rect
import typings.blueprintjsTable.renderModeMod.RenderMode.BATCH
import typings.blueprintjsTable.renderModeMod.RenderMode.NONE
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableBodyCellsMod {
  
  @JSImport("@blueprintjs/table/lib/esm/tableBodyCells", "TableBodyCells")
  @js.native
  class TableBodyCells protected ()
    extends AbstractComponent2[ITableBodyCellsProps, js.Object, js.Object] {
    def this(props: ITableBodyCellsProps) = this()
    def this(props: ITableBodyCellsProps, context: js.Any) = this()
    
    var batcher: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MTableBodyCells(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTableBodyCells(prevProps: ITableBodyCellsProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTableBodyCells(): Unit = js.native
    
    var didViewportRectChange: js.Any = js.native
    
    var maybeInvokeOnCompleteRender: js.Any = js.native
    
    var renderAllCells: js.Any = js.native
    
    var renderBatchedCells: js.Any = js.native
    
    var renderCell: js.Any = js.native
    
    var renderNewCell: js.Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MTableBodyCells(): Boolean = js.native
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MTableBodyCells(nextProps: ITableBodyCellsProps): Boolean = js.native
  }
  /* static members */
  object TableBodyCells {
    
    @JSImport("@blueprintjs/table/lib/esm/tableBodyCells", "TableBodyCells")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/tableBodyCells", "TableBodyCells.cellReactKey")
    @js.native
    def cellReactKey: js.Any = js.native
    @scala.inline
    def cellReactKey_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cellReactKey")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/tableBodyCells", "TableBodyCells.defaultProps")
    @js.native
    def defaultProps: RenderMode = js.native
    @scala.inline
    def defaultProps_=(x: RenderMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/table/lib/esm/tableBodyCells", "cellClassNames")
  @js.native
  def cellClassNames(rowIndex: Double, columnIndex: Double): js.Array[String] = js.native
  
  @js.native
  trait ITableBodyCellsProps
    extends IRowIndices
       with IColumnIndices
       with IProps {
    
    /**
      * A cell renderer for the cells in the body.
      */
    var cellRenderer: ICellRenderer = js.native
    
    /**
      * The coordinates of the currently focused cell, for setting the "isFocused" prop on cells.
      */
    var focusedCell: js.UndefOr[IFocusedCellCoordinates] = js.native
    
    /**
      * The grid computes sizes of cells, rows, or columns from the
      * configurable `columnWidths` and `rowHeights`.
      */
    var grid: Grid = js.native
    
    /**
      * If true, all `Cell`s render their loading state except for those who have
      * their `loading` prop explicitly set to false.
      */
    var loading: Boolean = js.native
    
    /**
      * An optional callback invoked when all cells in view have completely rendered.
      */
    var onCompleteRender: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Dictates how cells should be rendered. This component doesn't support
      * `RenderMode.BATCH_ON_UPDATE`, because there are actually multiple updates
      * that need to happen at higher levels before the table is considered fully
      * "mounted"; thus, we let higher components tell us when to switch modes.
      * @default RenderMode.BATCH
      */
    var renderMode: js.UndefOr[BATCH | NONE] = js.native
    
    /**
      * The `Rect` bounds of the visible viewport with respect to its parent
      * scrollable pane. While not directly used by the component, this prop is
      * necessary for shouldComponentUpdate logic to run properly.
      */
    var viewportRect: Rect = js.native
  }
  object ITableBodyCellsProps {
    
    @scala.inline
    def apply(
      cellRenderer: (/* rowIndex */ Double, /* columnIndex */ Double) => ReactElement,
      columnIndexEnd: Double,
      columnIndexStart: Double,
      grid: Grid,
      loading: Boolean,
      rowIndexEnd: Double,
      rowIndexStart: Double,
      viewportRect: Rect
    ): ITableBodyCellsProps = {
      val __obj = js.Dynamic.literal(cellRenderer = js.Any.fromFunction2(cellRenderer), columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], rowIndexEnd = rowIndexEnd.asInstanceOf[js.Any], rowIndexStart = rowIndexStart.asInstanceOf[js.Any], viewportRect = viewportRect.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITableBodyCellsProps]
    }
    
    @scala.inline
    implicit class ITableBodyCellsPropsMutableBuilder[Self <: ITableBodyCellsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellRenderer(value: (/* rowIndex */ Double, /* columnIndex */ Double) => ReactElement): Self = StObject.set(x, "cellRenderer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFocusedCell(value: IFocusedCellCoordinates): Self = StObject.set(x, "focusedCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedCellUndefined: Self = StObject.set(x, "focusedCell", js.undefined)
      
      @scala.inline
      def setGrid(value: Grid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompleteRender(value: () => Unit): Self = StObject.set(x, "onCompleteRender", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCompleteRenderUndefined: Self = StObject.set(x, "onCompleteRender", js.undefined)
      
      @scala.inline
      def setRenderMode(value: BATCH | NONE): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
      
      @scala.inline
      def setViewportRect(value: Rect): Self = StObject.set(x, "viewportRect", value.asInstanceOf[js.Any])
    }
  }
}
