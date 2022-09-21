package typings.blueprintjsTable

import typings.blueprintjsCore.mod.AbstractComponent2
import typings.blueprintjsTable.anon.ChildrenArray
import typings.blueprintjsTable.esmRegionsMod.Region
import typings.blueprintjsTable.gridMod.Grid
import typings.blueprintjsTable.gridMod.ICellMapper
import typings.blueprintjsTable.locatorMod.Locator
import typings.blueprintjsTable.resizeRowsMod.IResizeRowsByApproximateHeightOptions
import typings.blueprintjsTable.tablePropsMod.ITableProps
import typings.blueprintjsTable.tablePropsMod.TableProps
import typings.blueprintjsTable.tablePropsMod.TablePropsDefaults
import typings.blueprintjsTable.tablePropsMod.TablePropsWithDefaults
import typings.blueprintjsTable.tableStateMod.TableSnapshot
import typings.blueprintjsTable.tableStateMod.TableState
import typings.react.mod.DependencyList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object table2Mod {
  
  @JSImport("@blueprintjs/table/lib/esm/table2", "Table2")
  @js.native
  open class Table2 protected () extends AbstractComponent2[Table2Props, TableState, TableSnapshot] {
    def this(props: TablePropsWithDefaults) = this()
    def this(props: TablePropsWithDefaults, context: Any) = this()
    
    /* private */ var bodyCellRenderer: Any = js.native
    
    /* private */ var cellContainerElement: Any = js.native
    
    /* private */ var clearSelection: Any = js.native
    
    /* private */ var columnHeaderCellRenderer: Any = js.native
    
    /* private */ var columnHeaderElement: Any = js.native
    
    /* private */ var columnHeaderHeight: Any = js.native
    
    /**
      * When the component mounts, the HTML Element refs will be available, so
      * we constructor the Locator, which queries the elements' bounding
      * ClientRects.
      */
    @JSName("componentDidMount")
    def componentDidMount_MTable2(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTable2(prevProps: Table2Props, prevState: TableState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTable2(): Unit = js.native
    
    /* private */ var didColumnHeaderMount: Any = js.native
    
    /* private */ var didCompletelyMount: Any = js.native
    
    /* private */ var didRowHeaderMount: Any = js.native
    
    /* private */ var getColumnProps: Any = js.native
    
    /* private */ var getEnabledSelectionHandler: Any = js.native
    
    /* private */ var getMaxFrozenColumnIndex: Any = js.native
    
    /* private */ var getMaxFrozenRowIndex: Any = js.native
    
    /**
      * Normalizes RenderMode.BATCH_ON_UPDATE into RenderMode.{BATCH,NONE}. We do
      * this because there are actually multiple updates required before the
      * <Table> is considered fully "mounted," and adding that knowledge to child
      * components would lead to tight coupling. Thus, keep it simple for them.
      */
    /* private */ var getNormalizedRenderMode: Any = js.native
    
    var grid: Grid | Null = js.native
    
    /* private */ var gridDimensionsMatchProps: Any = js.native
    
    /* private */ var handleBodyScroll: Any = js.native
    
    /* private */ var handleColumnResizeGuide: Any = js.native
    
    /* private */ var handleColumnWidthChanged: Any = js.native
    
    /* private */ var handleColumnsReordered: Any = js.native
    
    /* private */ var handleColumnsReordering: Any = js.native
    
    /* private */ var handleCompleteRender: Any = js.native
    
    /* private */ var handleFocus: Any = js.native
    
    /* private */ var handleHeaderMounted: Any = js.native
    
    /* private */ var handleLayoutLock: Any = js.native
    
    /* private */ var handleMenuMouseDown: Any = js.native
    
    /* private */ var handleRootScroll: Any = js.native
    
    /* private */ var handleRowHeightChanged: Any = js.native
    
    /* private */ var handleRowResizeGuide: Any = js.native
    
    /* private */ var handleRowsReordered: Any = js.native
    
    /* private */ var handleRowsReordering: Any = js.native
    
    /* private */ var handleSelection: Any = js.native
    
    /* private */ var hotkeys: Any = js.native
    
    /* private */ var hotkeysImpl: Any = js.native
    
    /* private */ var invalidateGrid: Any = js.native
    
    /* private */ var invokeOnVisibleCellsChangeCallback: Any = js.native
    
    /* private */ var isGuideLayerShowing: Any = js.native
    
    var locator: js.UndefOr[Locator] = js.native
    
    /**
      * Renders a `RegionLayer`, applying styles to the regions using the
      * supplied `RegionStyler`. `RegionLayer` is a pure component, so
      * the `RegionStyler` should be a new instance on every render if we
      * intend to redraw the region layer.
      */
    /* private */ var maybeRenderRegions: Any = js.native
    
    /* private */ var quadrantStackInstance: Any = js.native
    
    /* private */ var refHandlers: Any = js.native
    
    /* private */ var renderBody: Any = js.native
    
    /* private */ var renderColumnHeader: Any = js.native
    
    /* private */ var renderMenu: Any = js.native
    
    /* private */ var renderRowHeader: Any = js.native
    
    /* private */ var renderTableContents: Any = js.native
    
    /**
      * __Experimental!__ Resizes all rows in the table to the approximate
      * maximum height of wrapped cell content in each row. Works best when each
      * cell contains plain text of a consistent font style (though font style
      * may vary between cells). Since this function uses approximate
      * measurements, results may not be perfect.
      *
      * Approximation parameters can be configured for the entire table or on a
      * per-cell basis. Default values are fine-tuned to work well with default
      * Table font styles.
      */
    def resizeRowsByApproximateHeight(getCellText: ICellMapper[String]): Unit = js.native
    def resizeRowsByApproximateHeight(getCellText: ICellMapper[String], options: IResizeRowsByApproximateHeightOptions): Unit = js.native
    
    /**
      * Resize all rows in the table to the height of the tallest visible cell in the specified columns.
      * If no indices are provided, default to using the tallest visible cell from all columns in view.
      */
    def resizeRowsByTallestCell(): Unit = js.native
    def resizeRowsByTallestCell(columnIndices: js.Array[Double]): Unit = js.native
    def resizeRowsByTallestCell(columnIndices: Double): Unit = js.native
    
    /* private */ var resizeSensorDetach: Any = js.native
    
    /* private */ var rootTableElement: Any = js.native
    
    /* private */ var rowHeaderElement: Any = js.native
    
    /* private */ var rowHeaderWidth: Any = js.native
    
    /* private */ var scrollContainerElement: Any = js.native
    
    /**
      * Scrolls the table to the target region in a fashion appropriate to the target region's
      * cardinality:
      *
      * - CELLS: Scroll the top-left cell in the target region to the top-left corner of the viewport.
      * - FULL_ROWS: Scroll the top-most row in the target region to the top of the viewport.
      * - FULL_COLUMNS: Scroll the left-most column in the target region to the left side of the viewport.
      * - FULL_TABLE: Scroll the top-left cell in the table to the top-left corner of the viewport.
      *
      * If there are active frozen rows and/or columns, the target region will be positioned in the
      * top-left corner of the non-frozen area (unless the target region itself is in the frozen
      * area).
      *
      * If the target region is close to the bottom-right corner of the table, this function will
      * simply scroll the target region as close to the top-left as possible until the bottom-right
      * corner is reached.
      */
    def scrollToRegion(region: Region): Unit = js.native
    
    /* private */ var selectAll: Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MTable2(nextProps: Table2Props, nextState: TableState): Boolean = js.native
    
    /* private */ var shouldDisableHorizontalScroll: Any = js.native
    
    /* private */ var shouldDisableVerticalScroll: Any = js.native
    
    /* private */ var styleBodyRegion: Any = js.native
    
    /* private */ var styleColumnHeaderRegion: Any = js.native
    
    /* private */ var styleMenuRegion: Any = js.native
    
    /* private */ var styleRowHeaderRegion: Any = js.native
    
    /* private */ var syncViewportPosition: Any = js.native
    
    /* private */ var updateLocator: Any = js.native
    
    /* private */ var updateViewportRect: Any = js.native
    
    /**
      * This method's arguments allow us to support the following use case:
      * In some cases, we want to update the grid _before_ this.setState() is called with updated
      * `columnWidths` or `rowHeights` so that when that setState update _does_ flush through the React render
      * tree, our TableQuadrantStack has the correct updated grid measurements.
      */
    /* private */ var validateGrid: Any = js.native
    
    /* protected */ def validateProps(props: TableProps): Unit = js.native
  }
  /* static members */
  object Table2 {
    
    @JSImport("@blueprintjs/table/lib/esm/table2", "Table2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/table2", "Table2.SHALLOW_COMPARE_PROP_KEYS_DENYLIST")
    @js.native
    def SHALLOW_COMPARE_PROP_KEYS_DENYLIST: Any = js.native
    inline def SHALLOW_COMPARE_PROP_KEYS_DENYLIST_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHALLOW_COMPARE_PROP_KEYS_DENYLIST")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/table2", "Table2.SHALLOW_COMPARE_STATE_KEYS_DENYLIST")
    @js.native
    def SHALLOW_COMPARE_STATE_KEYS_DENYLIST: Any = js.native
    inline def SHALLOW_COMPARE_STATE_KEYS_DENYLIST_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHALLOW_COMPARE_STATE_KEYS_DENYLIST")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/table2", "Table2.createColumnIdIndex")
    @js.native
    def createColumnIdIndex: Any = js.native
    inline def createColumnIdIndex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createColumnIdIndex")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/table2", "Table2.defaultProps")
    @js.native
    def defaultProps: TablePropsDefaults = js.native
    inline def defaultProps_=(x: TablePropsDefaults): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/table2", "Table2.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(props: TablePropsWithDefaults, state: TableState): ChildrenArray | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ChildrenArray | Null]
  }
  
  trait Table2Props
    extends StObject
       with ITableProps {
    
    /**
      * This dependency list may be used to trigger a re-render of all cells when one of its elements changes
      * (compared using shallow equality checks). This is done by invalidating the grid, which forces
      * TableQuadrantStack to re-render.
      */
    var cellRendererDependencies: js.UndefOr[DependencyList] = js.undefined
  }
  object Table2Props {
    
    inline def apply(): Table2Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Table2Props]
    }
    
    extension [Self <: Table2Props](x: Self) {
      
      inline def setCellRendererDependencies(value: DependencyList): Self = StObject.set(x, "cellRendererDependencies", value.asInstanceOf[js.Any])
      
      inline def setCellRendererDependenciesUndefined: Self = StObject.set(x, "cellRendererDependencies", js.undefined)
      
      inline def setCellRendererDependenciesVarargs(value: Any*): Self = StObject.set(x, "cellRendererDependencies", js.Array(value*))
    }
  }
}
