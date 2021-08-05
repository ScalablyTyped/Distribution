package typings.blueprintjsTable

import org.scalablytyped.runtime.StringDictionary
import typings.blueprintjsCore.mod.AbstractComponent2
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsTable.anon.ChildrenArray
import typings.blueprintjsTable.anon.NextScrollLeft
import typings.blueprintjsTable.anon.ValidationMapIColumnInter
import typings.blueprintjsTable.columnHeaderMod.IColumnWidths
import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.contextMod.IColumnInteractionBarContextTypes
import typings.blueprintjsTable.dragTypesMod.ICoordinateData
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.blueprintjsTable.esmRegionsMod.IStyledRegionGroup
import typings.blueprintjsTable.esmRegionsMod.RegionCardinality
import typings.blueprintjsTable.esmRegionsMod.TableLoadingOption
import typings.blueprintjsTable.gridMod.Grid
import typings.blueprintjsTable.gridMod.ICellMapper
import typings.blueprintjsTable.gridMod.IColumnIndices
import typings.blueprintjsTable.gridMod.IRowIndices
import typings.blueprintjsTable.locatorMod.Locator
import typings.blueprintjsTable.menuContextMod.IContextMenuRenderer
import typings.blueprintjsTable.menuContextMod.IMenuContext
import typings.blueprintjsTable.rectMod.Rect
import typings.blueprintjsTable.renderModeMod.RenderMode
import typings.blueprintjsTable.resizableMod.IIndexedResizeCallback
import typings.blueprintjsTable.rowHeaderMod.IRowHeaderRenderer
import typings.blueprintjsTable.rowHeaderMod.IRowHeights
import typings.blueprintjsTable.selectableMod.ISelectedRegionTransform
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
  @JSImport("@blueprintjs/table/lib/esm/table", "Table")
  @js.native
  class Table protected () extends AbstractComponent2[ITableProps, ITableState, ITableSnapshot] {
    def this(props: ITableProps) = this()
    def this(props: ITableProps, context: js.Any) = this()
    
    /* private */ var bodyCellRenderer: js.Any = js.native
    
    /* private */ var cellContainerElement: js.Any = js.native
    
    /* private */ var clearSelection: js.Any = js.native
    
    /* private */ var columnHeaderCellRenderer: js.Any = js.native
    
    /* private */ var columnHeaderElement: js.Any = js.native
    
    /**
      * When the component mounts, the HTML Element refs will be available, so
      * we constructor the Locator, which queries the elements' bounding
      * ClientRects.
      */
    @JSName("componentDidMount")
    def componentDidMount_MTable(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTable(prevProps: ITableProps, prevState: ITableState, snapshot: ITableSnapshot): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTable(): Unit = js.native
    
    /* private */ var didCompletelyMount: js.Any = js.native
    
    def getChildContext(): IColumnInteractionBarContextTypes = js.native
    
    /* private */ var getColumnProps: js.Any = js.native
    
    /* private */ var getEnabledSelectionHandler: js.Any = js.native
    
    /* private */ var getMaxFrozenColumnIndex: js.Any = js.native
    
    /* private */ var getMaxFrozenRowIndex: js.Any = js.native
    
    /**
      * Normalizes RenderMode.BATCH_ON_UPDATE into RenderMode.{BATCH,NONE}. We do
      * this because there are actually multiple updates required before the
      * <Table> is considered fully "mounted," and adding that knowledge to child
      * components would lead to tight coupling. Thus, keep it simple for them.
      */
    /* private */ var getNormalizedRenderMode: js.Any = js.native
    
    @JSName("getSnapshotBeforeUpdate")
    def getSnapshotBeforeUpdate_MTable(): NextScrollLeft = js.native
    
    var grid: Grid = js.native
    
    /* private */ var gridDimensionsMatchProps: js.Any = js.native
    
    /* private */ var handleBodyScroll: js.Any = js.native
    
    /* private */ var handleColumnResizeGuide: js.Any = js.native
    
    /* private */ var handleColumnWidthChanged: js.Any = js.native
    
    /* private */ var handleColumnsReordered: js.Any = js.native
    
    /* private */ var handleColumnsReordering: js.Any = js.native
    
    /* private */ var handleCompleteRender: js.Any = js.native
    
    /* private */ var handleCopy: js.Any = js.native
    
    /* private */ var handleFocus: js.Any = js.native
    
    /* private */ var handleFocusMove: js.Any = js.native
    
    /* private */ var handleFocusMoveDown: js.Any = js.native
    
    /* private */ var handleFocusMoveDownInternal: js.Any = js.native
    
    /* private */ var handleFocusMoveInternal: js.Any = js.native
    
    /* private */ var handleFocusMoveLeft: js.Any = js.native
    
    /* private */ var handleFocusMoveLeftInternal: js.Any = js.native
    
    /* private */ var handleFocusMoveRight: js.Any = js.native
    
    /* private */ var handleFocusMoveRightInternal: js.Any = js.native
    
    /* private */ var handleFocusMoveUp: js.Any = js.native
    
    /* private */ var handleFocusMoveUpInternal: js.Any = js.native
    
    /* private */ var handleLayoutLock: js.Any = js.native
    
    /* private */ var handleMenuMouseDown: js.Any = js.native
    
    /* private */ var handleRootScroll: js.Any = js.native
    
    /* private */ var handleRowHeightChanged: js.Any = js.native
    
    /* private */ var handleRowResizeGuide: js.Any = js.native
    
    /* private */ var handleRowsReordered: js.Any = js.native
    
    /* private */ var handleRowsReordering: js.Any = js.native
    
    /* private */ var handleSelectAllHotkey: js.Any = js.native
    
    /* private */ var handleSelection: js.Any = js.native
    
    /* private */ var handleSelectionResize: js.Any = js.native
    
    /* private */ var handleSelectionResizeDown: js.Any = js.native
    
    /* private */ var handleSelectionResizeLeft: js.Any = js.native
    
    /* private */ var handleSelectionResizeRight: js.Any = js.native
    
    /* private */ var handleSelectionResizeUp: js.Any = js.native
    
    /* private */ var hasLoadingOption: js.Any = js.native
    
    /* private */ var invalidateGrid: js.Any = js.native
    
    /* private */ var invokeOnVisibleCellsChangeCallback: js.Any = js.native
    
    /* private */ var isGuidesShowing: js.Any = js.native
    
    var locator: Locator = js.native
    
    /* private */ var maybeRenderCopyHotkey: js.Any = js.native
    
    /* private */ var maybeRenderFocusHotkeys: js.Any = js.native
    
    /**
      * Renders a `RegionLayer`, applying styles to the regions using the
      * supplied `IRegionStyler`. `RegionLayer` is a `PureRender` component, so
      * the `IRegionStyler` should be a new instance on every render if we
      * intend to redraw the region layer.
      */
    /* private */ var maybeRenderRegions: js.Any = js.native
    
    /* private */ var maybeRenderSelectAllHotkey: js.Any = js.native
    
    /* private */ var maybeRenderSelectionResizeHotkeys: js.Any = js.native
    
    /* private */ var moveFocusCell: js.Any = js.native
    
    /* private */ var quadrantStackInstance: js.Any = js.native
    
    /* private */ var refHandlers: js.Any = js.native
    
    /* private */ var renderBody: js.Any = js.native
    
    /* private */ var renderColumnHeader: js.Any = js.native
    
    def renderHotkeys(): Element = js.native
    
    /* private */ var renderMenu: js.Any = js.native
    
    /* private */ var renderRowHeader: js.Any = js.native
    
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
    
    /* private */ var resizeSensorDetach: js.Any = js.native
    
    /**
      * Returns an object with option keys mapped to their resolved values
      * (falling back to default values as necessary).
      */
    /* private */ var resolveResizeRowsByApproximateHeightOptions: js.Any = js.native
    
    /* private */ var rootTableElement: js.Any = js.native
    
    /* private */ var rowHeaderElement: js.Any = js.native
    
    /* private */ var scrollBodyToFocusedCell: js.Any = js.native
    
    /* private */ var scrollContainerElement: js.Any = js.native
    
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
    def scrollToRegion(region: IRegion): Unit = js.native
    
    /* private */ var selectAll: js.Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MTable(nextProps: ITableProps, nextState: ITableState): Boolean = js.native
    
    /* private */ var shouldDisableHorizontalScroll: js.Any = js.native
    
    /* private */ var shouldDisableVerticalScroll: js.Any = js.native
    
    /* private */ var styleBodyRegion: js.Any = js.native
    
    /* private */ var styleColumnHeaderRegion: js.Any = js.native
    
    /* private */ var styleMenuRegion: js.Any = js.native
    
    /* private */ var styleRowHeaderRegion: js.Any = js.native
    
    /* private */ var syncViewportPosition: js.Any = js.native
    
    /* private */ var updateLocator: js.Any = js.native
    
    /**
      * Replaces the selected region at the specified array index, with the
      * region provided.
      */
    /* private */ var updateSelectedRegionAtIndex: js.Any = js.native
    
    /* private */ var updateViewportRect: js.Any = js.native
    
    /* private */ var validateGrid: js.Any = js.native
  }
  /* static members */
  object Table {
    
    @JSImport("@blueprintjs/table/lib/esm/table", "Table")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/table", "Table.SHALLOW_COMPARE_PROP_KEYS_DENYLIST")
    @js.native
    def SHALLOW_COMPARE_PROP_KEYS_DENYLIST: js.Any = js.native
    inline def SHALLOW_COMPARE_PROP_KEYS_DENYLIST_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHALLOW_COMPARE_PROP_KEYS_DENYLIST")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/table", "Table.SHALLOW_COMPARE_STATE_KEYS_DENYLIST")
    @js.native
    def SHALLOW_COMPARE_STATE_KEYS_DENYLIST: js.Any = js.native
    inline def SHALLOW_COMPARE_STATE_KEYS_DENYLIST_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHALLOW_COMPARE_STATE_KEYS_DENYLIST")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/table", "Table.childContextTypes")
    @js.native
    def childContextTypes: ValidationMapIColumnInter = js.native
    inline def childContextTypes_=(x: ValidationMapIColumnInter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/table", "Table.createColumnIdIndex")
    @js.native
    def createColumnIdIndex: js.Any = js.native
    inline def createColumnIdIndex_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createColumnIdIndex")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/table", "Table.defaultProps")
    @js.native
    def defaultProps: ITableProps = js.native
    inline def defaultProps_=(x: ITableProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/table", "Table.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(props: ITableProps, state: ITableState): ChildrenArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ChildrenArray]
    
    @JSImport("@blueprintjs/table/lib/esm/table", "Table.isSelectionModeEnabled")
    @js.native
    def isSelectionModeEnabled: js.Any = js.native
    inline def isSelectionModeEnabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSelectionModeEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/table", "Table.resizeRowsByApproximateHeightDefaults")
    @js.native
    def resizeRowsByApproximateHeightDefaults: js.Any = js.native
    inline def resizeRowsByApproximateHeightDefaults_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resizeRowsByApproximateHeightDefaults")(x.asInstanceOf[js.Any])
  }
  
  trait IResizeRowsByApproximateHeightOptions extends StObject {
    
    /**
      * Approximate width (in pixels) of an average character of text.
      */
    var getApproximateCharWidth: js.UndefOr[Double | ICellMapper[Double]] = js.undefined
    
    /**
      * Approximate height (in pixels) of an average line of text.
      */
    var getApproximateLineHeight: js.UndefOr[Double | ICellMapper[Double]] = js.undefined
    
    /**
      * Sum of horizontal paddings (in pixels) from the left __and__ right sides
      * of the cell.
      */
    var getCellHorizontalPadding: js.UndefOr[Double | ICellMapper[Double]] = js.undefined
    
    /**
      * Number of extra lines to add in case the calculation is imperfect.
      */
    var getNumBufferLines: js.UndefOr[Double | ICellMapper[Double]] = js.undefined
  }
  object IResizeRowsByApproximateHeightOptions {
    
    inline def apply(): IResizeRowsByApproximateHeightOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IResizeRowsByApproximateHeightOptions]
    }
    
    extension [Self <: IResizeRowsByApproximateHeightOptions](x: Self) {
      
      inline def setGetApproximateCharWidth(value: Double | ICellMapper[Double]): Self = StObject.set(x, "getApproximateCharWidth", value.asInstanceOf[js.Any])
      
      inline def setGetApproximateCharWidthFunction2(value: (/* rowIndex */ Double, /* columnIndex */ Double) => Double): Self = StObject.set(x, "getApproximateCharWidth", js.Any.fromFunction2(value))
      
      inline def setGetApproximateCharWidthUndefined: Self = StObject.set(x, "getApproximateCharWidth", js.undefined)
      
      inline def setGetApproximateLineHeight(value: Double | ICellMapper[Double]): Self = StObject.set(x, "getApproximateLineHeight", value.asInstanceOf[js.Any])
      
      inline def setGetApproximateLineHeightFunction2(value: (/* rowIndex */ Double, /* columnIndex */ Double) => Double): Self = StObject.set(x, "getApproximateLineHeight", js.Any.fromFunction2(value))
      
      inline def setGetApproximateLineHeightUndefined: Self = StObject.set(x, "getApproximateLineHeight", js.undefined)
      
      inline def setGetCellHorizontalPadding(value: Double | ICellMapper[Double]): Self = StObject.set(x, "getCellHorizontalPadding", value.asInstanceOf[js.Any])
      
      inline def setGetCellHorizontalPaddingFunction2(value: (/* rowIndex */ Double, /* columnIndex */ Double) => Double): Self = StObject.set(x, "getCellHorizontalPadding", js.Any.fromFunction2(value))
      
      inline def setGetCellHorizontalPaddingUndefined: Self = StObject.set(x, "getCellHorizontalPadding", js.undefined)
      
      inline def setGetNumBufferLines(value: Double | ICellMapper[Double]): Self = StObject.set(x, "getNumBufferLines", value.asInstanceOf[js.Any])
      
      inline def setGetNumBufferLinesFunction2(value: (/* rowIndex */ Double, /* columnIndex */ Double) => Double): Self = StObject.set(x, "getNumBufferLines", js.Any.fromFunction2(value))
      
      inline def setGetNumBufferLinesUndefined: Self = StObject.set(x, "getNumBufferLines", js.undefined)
    }
  }
  
  trait ITableProps
    extends StObject
       with IProps
       with IRowHeights
       with IColumnWidths {
    
    /**
      * An optional callback for displaying a context menu when right-clicking
      * on the table body. The callback is supplied with an array of
      * `IRegion`s. If the mouse click was on a selection, the array will
      * contain all selected regions. Otherwise it will have one `IRegion` that
      * represents the clicked cell.
      */
    var bodyContextMenuRenderer: js.UndefOr[IContextMenuRenderer] = js.undefined
    
    /**
      * The children of a `Table` component, which must be React elements
      * that use `IColumnProps`.
      */
    var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.undefined
    
    /**
      * A sparse number array with a length equal to the number of columns. Any
      * non-null value will be used to set the width of the column at the same
      * index. Note that if you want to update these values when the user
      * drag-resizes a column, you may define a callback for `onColumnWidthChanged`.
      */
    var columnWidths: js.UndefOr[js.Array[js.UndefOr[Double | Null]]] = js.undefined
    
    /**
      * If `true`, adds an interaction bar on top of all column header cells, and
      * moves interaction triggers into it.
      * @default false
      */
    var enableColumnInteractionBar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false`, disables reordering of columns.
      * @default false
      */
    var enableColumnReordering: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false`, disables resizing of columns.
      * @default true
      */
    var enableColumnResizing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, there will be a single "focused" cell at all times,
      * which can be used to interact with the table as though it is a
      * spreadsheet. When false, no such cell will exist.
      * @default false
      */
    var enableFocusedCell: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, empty space in the table container will be filled with empty
      * cells instead of a blank background.
      * @default false
      */
    var enableGhostCells: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false`, only a single region of a single column/row/cell may be
      * selected at one time. Using `ctrl` or `meta` key will have no effect,
      * and a mouse drag will select the current column/row/cell only.
      * @default true
      */
    var enableMultipleSelection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false`, hides the row headers and settings menu.
      * @default true
      */
    var enableRowHeader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false`, disables reordering of rows.
      * @default false
      */
    var enableRowReordering: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false`, disables resizing of rows.
      * @default true
      */
    var enableRowResizing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If defined, will set the focused cell state. This changes
      * the focused cell to controlled mode, meaning you are in charge of
      * setting the focus in response to events in the `onFocusedCell` callback.
      */
    var focusedCell: js.UndefOr[IFocusedCellCoordinates] = js.undefined
    
    /**
      * If `true`, selection state changes will cause the component to re-render.
      * If `false`, selection state is ignored when deciding to re-render.
      * @default false
      */
    var forceRerenderOnSelectionChange: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If defined, this callback will be invoked for each cell when the user
      * attempts to copy a selection via `mod+c`. The returned data will be copied
      * to the clipboard and need not match the display value of the `<Cell>`.
      * The data will be invisibly added as `textContent` into the DOM before
      * copying. If not defined, keyboard copying via `mod+c` will be disabled.
      */
    var getCellClipboardData: js.UndefOr[js.Function2[/* row */ Double, /* col */ Double, js.Any]] = js.undefined
    
    /**
      * A list of `TableLoadingOption`. Set this prop to specify whether to
      * render the loading state for the column header, row header, and body
      * sections of the table.
      */
    var loadingOptions: js.UndefOr[js.Array[TableLoadingOption]] = js.undefined
    
    /**
      * The number of columns to freeze to the left side of the table, counting
      * from the leftmost column.
      * @default 0
      */
    var numFrozenColumns: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of rows to freeze to the top of the table, counting from the
      * topmost row.
      * @default 0
      */
    var numFrozenRows: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of rows in the table.
      */
    var numRows: js.UndefOr[Double] = js.undefined
    
    /**
      * If resizing is enabled, this callback will be invoked when the user
      * finishes drag-resizing a column.
      */
    var onColumnWidthChanged: js.UndefOr[IIndexedResizeCallback] = js.undefined
    
    /**
      * If reordering is enabled, this callback will be invoked when the user finishes
      * drag-reordering one or more columns.
      */
    var onColumnsReordered: js.UndefOr[
        js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit]
      ] = js.undefined
    
    /**
      * An optional callback invoked when all cells in view have completely rendered.
      * Will be invoked on initial mount and whenever cells update (e.g., on scroll).
      */
    var onCompleteRender: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * If you want to do something after the copy or if you want to notify the
      * user if a copy fails, you may provide this optional callback.
      *
      * Due to browser limitations, the copy can fail. This usually occurs if
      * the selection is too large, like 20,000+ cells. The copy will also fail
      * if the browser does not support the copy method (see
      * `Clipboard.isCopySupported`).
      */
    var onCopy: js.UndefOr[js.Function1[/* success */ Boolean, Unit]] = js.undefined
    
    /**
      * A callback called when the focus is changed in the table.
      */
    var onFocusedCell: js.UndefOr[js.Function1[/* focusedCell */ IFocusedCellCoordinates, Unit]] = js.undefined
    
    /**
      * If resizing is enabled, this callback will be invoked when the user
      * finishes drag-resizing a row.
      */
    var onRowHeightChanged: js.UndefOr[IIndexedResizeCallback] = js.undefined
    
    /**
      * If reordering is enabled, this callback will be invoked when the user finishes
      * drag-reordering one or more rows.
      */
    var onRowsReordered: js.UndefOr[
        js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit]
      ] = js.undefined
    
    /**
      * A callback called when the selection is changed in the table.
      */
    var onSelection: js.UndefOr[js.Function1[/* selectedRegions */ js.Array[IRegion], Unit]] = js.undefined
    
    /**
      * A callback called when the visible cell indices change in the table.
      */
    var onVisibleCellsChange: js.UndefOr[
        js.Function2[/* rowIndices */ IRowIndices, /* columnIndices */ IColumnIndices, Unit]
      ] = js.undefined
    
    /**
      * Dictates how cells should be rendered. Supported modes are:
      * - `RenderMode.BATCH`: renders cells in batches to improve performance
      * - `RenderMode.BATCH_ON_UPDATE`: renders cells synchronously on mount and
      *   in batches on update
      * - `RenderMode.NONE`: renders cells synchronously all at once
      * @default RenderMode.BATCH_ON_UPDATE
      */
    var renderMode: js.UndefOr[RenderMode] = js.undefined
    
    /**
      * Render each row's header cell.
      */
    var rowHeaderCellRenderer: js.UndefOr[IRowHeaderRenderer] = js.undefined
    
    /**
      * A sparse number array with a length equal to the number of rows. Any
      * non-null value will be used to set the height of the row at the same
      * index. Note that if you want to update these values when the user
      * drag-resizes a row, you may define a callback for `onRowHeightChanged`.
      */
    var rowHeights: js.UndefOr[js.Array[js.UndefOr[Double | Null]]] = js.undefined
    
    /**
      * An optional transform function that will be applied to the located
      * `Region`.
      *
      * This allows you to, for example, convert cell `Region`s into row
      * `Region`s while maintaining the existing multi-select and meta-click
      * functionality.
      */
    var selectedRegionTransform: js.UndefOr[ISelectedRegionTransform] = js.undefined
    
    /**
      * If defined, will set the selected regions in the cells. If defined, this
      * changes table selection to controlled mode, meaning you in charge of
      * setting the selections in response to events in the `onSelection`
      * callback.
      *
      * Note that the `selectionModes` prop controls which types of events are
      * triggered to the `onSelection` callback, but does not restrict what
      * selection you can pass to the `selectedRegions` prop. Therefore you can,
      * for example, convert cell clicks into row selections.
      */
    var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.undefined
    
    /**
      * A `SelectionModes` enum value indicating the selection mode. You may
      * equivalently provide an array of `RegionCardinality` enum values for
      * precise configuration.
      *
      * The `SelectionModes` enum values are:
      * - `ALL`
      * - `NONE`
      * - `COLUMNS_AND_CELLS`
      * - `COLUMNS_ONLY`
      * - `ROWS_AND_CELLS`
      * - `ROWS_ONLY`
      *
      * The `RegionCardinality` enum values are:
      * - `FULL_COLUMNS`
      * - `FULL_ROWS`
      * - `FULL_TABLE`
      * - `CELLS`
      *
      * @default SelectionModes.ALL
      */
    var selectionModes: js.UndefOr[js.Array[RegionCardinality]] = js.undefined
    
    /**
      * Styled region groups are rendered as overlays above the table and are
      * marked with their own `className` for custom styling.
      */
    var styledRegionGroups: js.UndefOr[js.Array[IStyledRegionGroup]] = js.undefined
  }
  object ITableProps {
    
    inline def apply(): ITableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITableProps]
    }
    
    extension [Self <: ITableProps](x: Self) {
      
      inline def setBodyContextMenuRenderer(value: /* context */ IMenuContext => Element): Self = StObject.set(x, "bodyContextMenuRenderer", js.Any.fromFunction1(value))
      
      inline def setBodyContextMenuRendererUndefined: Self = StObject.set(x, "bodyContextMenuRenderer", js.undefined)
      
      inline def setChildren(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setColumnWidths(value: js.Array[js.UndefOr[Double | Null]]): Self = StObject.set(x, "columnWidths", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthsUndefined: Self = StObject.set(x, "columnWidths", js.undefined)
      
      inline def setColumnWidthsVarargs(value: (js.UndefOr[Double | Null])*): Self = StObject.set(x, "columnWidths", js.Array(value :_*))
      
      inline def setEnableColumnInteractionBar(value: Boolean): Self = StObject.set(x, "enableColumnInteractionBar", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnInteractionBarUndefined: Self = StObject.set(x, "enableColumnInteractionBar", js.undefined)
      
      inline def setEnableColumnReordering(value: Boolean): Self = StObject.set(x, "enableColumnReordering", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnReorderingUndefined: Self = StObject.set(x, "enableColumnReordering", js.undefined)
      
      inline def setEnableColumnResizing(value: Boolean): Self = StObject.set(x, "enableColumnResizing", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnResizingUndefined: Self = StObject.set(x, "enableColumnResizing", js.undefined)
      
      inline def setEnableFocusedCell(value: Boolean): Self = StObject.set(x, "enableFocusedCell", value.asInstanceOf[js.Any])
      
      inline def setEnableFocusedCellUndefined: Self = StObject.set(x, "enableFocusedCell", js.undefined)
      
      inline def setEnableGhostCells(value: Boolean): Self = StObject.set(x, "enableGhostCells", value.asInstanceOf[js.Any])
      
      inline def setEnableGhostCellsUndefined: Self = StObject.set(x, "enableGhostCells", js.undefined)
      
      inline def setEnableMultipleSelection(value: Boolean): Self = StObject.set(x, "enableMultipleSelection", value.asInstanceOf[js.Any])
      
      inline def setEnableMultipleSelectionUndefined: Self = StObject.set(x, "enableMultipleSelection", js.undefined)
      
      inline def setEnableRowHeader(value: Boolean): Self = StObject.set(x, "enableRowHeader", value.asInstanceOf[js.Any])
      
      inline def setEnableRowHeaderUndefined: Self = StObject.set(x, "enableRowHeader", js.undefined)
      
      inline def setEnableRowReordering(value: Boolean): Self = StObject.set(x, "enableRowReordering", value.asInstanceOf[js.Any])
      
      inline def setEnableRowReorderingUndefined: Self = StObject.set(x, "enableRowReordering", js.undefined)
      
      inline def setEnableRowResizing(value: Boolean): Self = StObject.set(x, "enableRowResizing", value.asInstanceOf[js.Any])
      
      inline def setEnableRowResizingUndefined: Self = StObject.set(x, "enableRowResizing", js.undefined)
      
      inline def setFocusedCell(value: IFocusedCellCoordinates): Self = StObject.set(x, "focusedCell", value.asInstanceOf[js.Any])
      
      inline def setFocusedCellUndefined: Self = StObject.set(x, "focusedCell", js.undefined)
      
      inline def setForceRerenderOnSelectionChange(value: Boolean): Self = StObject.set(x, "forceRerenderOnSelectionChange", value.asInstanceOf[js.Any])
      
      inline def setForceRerenderOnSelectionChangeUndefined: Self = StObject.set(x, "forceRerenderOnSelectionChange", js.undefined)
      
      inline def setGetCellClipboardData(value: (/* row */ Double, /* col */ Double) => js.Any): Self = StObject.set(x, "getCellClipboardData", js.Any.fromFunction2(value))
      
      inline def setGetCellClipboardDataUndefined: Self = StObject.set(x, "getCellClipboardData", js.undefined)
      
      inline def setLoadingOptions(value: js.Array[TableLoadingOption]): Self = StObject.set(x, "loadingOptions", value.asInstanceOf[js.Any])
      
      inline def setLoadingOptionsUndefined: Self = StObject.set(x, "loadingOptions", js.undefined)
      
      inline def setLoadingOptionsVarargs(value: TableLoadingOption*): Self = StObject.set(x, "loadingOptions", js.Array(value :_*))
      
      inline def setNumFrozenColumns(value: Double): Self = StObject.set(x, "numFrozenColumns", value.asInstanceOf[js.Any])
      
      inline def setNumFrozenColumnsUndefined: Self = StObject.set(x, "numFrozenColumns", js.undefined)
      
      inline def setNumFrozenRows(value: Double): Self = StObject.set(x, "numFrozenRows", value.asInstanceOf[js.Any])
      
      inline def setNumFrozenRowsUndefined: Self = StObject.set(x, "numFrozenRows", js.undefined)
      
      inline def setNumRows(value: Double): Self = StObject.set(x, "numRows", value.asInstanceOf[js.Any])
      
      inline def setNumRowsUndefined: Self = StObject.set(x, "numRows", js.undefined)
      
      inline def setOnColumnWidthChanged(value: (/* index */ Double, /* size */ Double) => Unit): Self = StObject.set(x, "onColumnWidthChanged", js.Any.fromFunction2(value))
      
      inline def setOnColumnWidthChangedUndefined: Self = StObject.set(x, "onColumnWidthChanged", js.undefined)
      
      inline def setOnColumnsReordered(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit): Self = StObject.set(x, "onColumnsReordered", js.Any.fromFunction3(value))
      
      inline def setOnColumnsReorderedUndefined: Self = StObject.set(x, "onColumnsReordered", js.undefined)
      
      inline def setOnCompleteRender(value: () => Unit): Self = StObject.set(x, "onCompleteRender", js.Any.fromFunction0(value))
      
      inline def setOnCompleteRenderUndefined: Self = StObject.set(x, "onCompleteRender", js.undefined)
      
      inline def setOnCopy(value: /* success */ Boolean => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnFocusedCell(value: /* focusedCell */ IFocusedCellCoordinates => Unit): Self = StObject.set(x, "onFocusedCell", js.Any.fromFunction1(value))
      
      inline def setOnFocusedCellUndefined: Self = StObject.set(x, "onFocusedCell", js.undefined)
      
      inline def setOnRowHeightChanged(value: (/* index */ Double, /* size */ Double) => Unit): Self = StObject.set(x, "onRowHeightChanged", js.Any.fromFunction2(value))
      
      inline def setOnRowHeightChangedUndefined: Self = StObject.set(x, "onRowHeightChanged", js.undefined)
      
      inline def setOnRowsReordered(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit): Self = StObject.set(x, "onRowsReordered", js.Any.fromFunction3(value))
      
      inline def setOnRowsReorderedUndefined: Self = StObject.set(x, "onRowsReordered", js.undefined)
      
      inline def setOnSelection(value: /* selectedRegions */ js.Array[IRegion] => Unit): Self = StObject.set(x, "onSelection", js.Any.fromFunction1(value))
      
      inline def setOnSelectionUndefined: Self = StObject.set(x, "onSelection", js.undefined)
      
      inline def setOnVisibleCellsChange(value: (/* rowIndices */ IRowIndices, /* columnIndices */ IColumnIndices) => Unit): Self = StObject.set(x, "onVisibleCellsChange", js.Any.fromFunction2(value))
      
      inline def setOnVisibleCellsChangeUndefined: Self = StObject.set(x, "onVisibleCellsChange", js.undefined)
      
      inline def setRenderMode(value: RenderMode): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
      
      inline def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
      
      inline def setRowHeaderCellRenderer(value: /* rowIndex */ Double => ReactElement): Self = StObject.set(x, "rowHeaderCellRenderer", js.Any.fromFunction1(value))
      
      inline def setRowHeaderCellRendererUndefined: Self = StObject.set(x, "rowHeaderCellRenderer", js.undefined)
      
      inline def setRowHeights(value: js.Array[js.UndefOr[Double | Null]]): Self = StObject.set(x, "rowHeights", value.asInstanceOf[js.Any])
      
      inline def setRowHeightsUndefined: Self = StObject.set(x, "rowHeights", js.undefined)
      
      inline def setRowHeightsVarargs(value: (js.UndefOr[Double | Null])*): Self = StObject.set(x, "rowHeights", js.Array(value :_*))
      
      inline def setSelectedRegionTransform(
        value: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => IRegion
      ): Self = StObject.set(x, "selectedRegionTransform", js.Any.fromFunction3(value))
      
      inline def setSelectedRegionTransformUndefined: Self = StObject.set(x, "selectedRegionTransform", js.undefined)
      
      inline def setSelectedRegions(value: js.Array[IRegion]): Self = StObject.set(x, "selectedRegions", value.asInstanceOf[js.Any])
      
      inline def setSelectedRegionsUndefined: Self = StObject.set(x, "selectedRegions", js.undefined)
      
      inline def setSelectedRegionsVarargs(value: IRegion*): Self = StObject.set(x, "selectedRegions", js.Array(value :_*))
      
      inline def setSelectionModes(value: js.Array[RegionCardinality]): Self = StObject.set(x, "selectionModes", value.asInstanceOf[js.Any])
      
      inline def setSelectionModesUndefined: Self = StObject.set(x, "selectionModes", js.undefined)
      
      inline def setSelectionModesVarargs(value: RegionCardinality*): Self = StObject.set(x, "selectionModes", js.Array(value :_*))
      
      inline def setStyledRegionGroups(value: js.Array[IStyledRegionGroup]): Self = StObject.set(x, "styledRegionGroups", value.asInstanceOf[js.Any])
      
      inline def setStyledRegionGroupsUndefined: Self = StObject.set(x, "styledRegionGroups", js.undefined)
      
      inline def setStyledRegionGroupsVarargs(value: IStyledRegionGroup*): Self = StObject.set(x, "styledRegionGroups", js.Array(value :_*))
    }
  }
  
  trait ITableSnapshot extends StObject {
    
    var nextScrollLeft: js.UndefOr[Double] = js.undefined
    
    var nextScrollTop: js.UndefOr[Double] = js.undefined
  }
  object ITableSnapshot {
    
    inline def apply(): ITableSnapshot = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITableSnapshot]
    }
    
    extension [Self <: ITableSnapshot](x: Self) {
      
      inline def setNextScrollLeft(value: Double): Self = StObject.set(x, "nextScrollLeft", value.asInstanceOf[js.Any])
      
      inline def setNextScrollLeftUndefined: Self = StObject.set(x, "nextScrollLeft", js.undefined)
      
      inline def setNextScrollTop(value: Double): Self = StObject.set(x, "nextScrollTop", value.asInstanceOf[js.Any])
      
      inline def setNextScrollTopUndefined: Self = StObject.set(x, "nextScrollTop", js.undefined)
    }
  }
  
  trait ITableState extends StObject {
    
    var childrenArray: js.Array[ReactElement]
    
    var columnIdToIndex: StringDictionary[Double]
    
    /**
      * An array of column widths. These are initialized from the column props
      * and updated when the user drags column header resize handles.
      */
    var columnWidths: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The coordinates of the currently focused table cell
      */
    var focusedCell: js.UndefOr[IFocusedCellCoordinates] = js.undefined
    
    /**
      * An array of pixel offsets for resize guides, which are drawn over the
      * table body when a row is being resized.
      */
    var horizontalGuides: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * If `true`, will disable updates that will cause re-renders of children
      * components. This is used, for example, to disable layout updates while
      * the user is dragging a resize handle.
      */
    var isLayoutLocked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the user is currently dragging to reorder one or more elements.
      * Can be referenced to toggle the reordering-cursor overlay, which
      * displays a `grabbing` CSS cursor wherever the mouse moves in the table
      * for the duration of the dragging interaction.
      */
    var isReordering: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of frozen columns, clamped to [0, num <Column>s].
      */
    var numFrozenColumnsClamped: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of frozen rows, clamped to [0, numRows].
      */
    var numFrozenRowsClamped: js.UndefOr[Double] = js.undefined
    
    /**
      * An array of row heights. These are initialized updated when the user
      * drags row header resize handles.
      */
    var rowHeights: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * An array of Regions representing the selections of the table.
      */
    var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.undefined
    
    /**
      * An array of pixel offsets for resize guides, which are drawn over the
      * table body when a column is being resized.
      */
    var verticalGuides: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The `Rect` bounds of the viewport used to perform virtual viewport
      * performance enhancements.
      */
    var viewportRect: js.UndefOr[Rect] = js.undefined
  }
  object ITableState {
    
    inline def apply(childrenArray: js.Array[ReactElement], columnIdToIndex: StringDictionary[Double]): ITableState = {
      val __obj = js.Dynamic.literal(childrenArray = childrenArray.asInstanceOf[js.Any], columnIdToIndex = columnIdToIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITableState]
    }
    
    extension [Self <: ITableState](x: Self) {
      
      inline def setChildrenArray(value: js.Array[ReactElement]): Self = StObject.set(x, "childrenArray", value.asInstanceOf[js.Any])
      
      inline def setChildrenArrayVarargs(value: ReactElement*): Self = StObject.set(x, "childrenArray", js.Array(value :_*))
      
      inline def setColumnIdToIndex(value: StringDictionary[Double]): Self = StObject.set(x, "columnIdToIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnWidths(value: js.Array[Double]): Self = StObject.set(x, "columnWidths", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthsUndefined: Self = StObject.set(x, "columnWidths", js.undefined)
      
      inline def setColumnWidthsVarargs(value: Double*): Self = StObject.set(x, "columnWidths", js.Array(value :_*))
      
      inline def setFocusedCell(value: IFocusedCellCoordinates): Self = StObject.set(x, "focusedCell", value.asInstanceOf[js.Any])
      
      inline def setFocusedCellUndefined: Self = StObject.set(x, "focusedCell", js.undefined)
      
      inline def setHorizontalGuides(value: js.Array[Double]): Self = StObject.set(x, "horizontalGuides", value.asInstanceOf[js.Any])
      
      inline def setHorizontalGuidesUndefined: Self = StObject.set(x, "horizontalGuides", js.undefined)
      
      inline def setHorizontalGuidesVarargs(value: Double*): Self = StObject.set(x, "horizontalGuides", js.Array(value :_*))
      
      inline def setIsLayoutLocked(value: Boolean): Self = StObject.set(x, "isLayoutLocked", value.asInstanceOf[js.Any])
      
      inline def setIsLayoutLockedUndefined: Self = StObject.set(x, "isLayoutLocked", js.undefined)
      
      inline def setIsReordering(value: Boolean): Self = StObject.set(x, "isReordering", value.asInstanceOf[js.Any])
      
      inline def setIsReorderingUndefined: Self = StObject.set(x, "isReordering", js.undefined)
      
      inline def setNumFrozenColumnsClamped(value: Double): Self = StObject.set(x, "numFrozenColumnsClamped", value.asInstanceOf[js.Any])
      
      inline def setNumFrozenColumnsClampedUndefined: Self = StObject.set(x, "numFrozenColumnsClamped", js.undefined)
      
      inline def setNumFrozenRowsClamped(value: Double): Self = StObject.set(x, "numFrozenRowsClamped", value.asInstanceOf[js.Any])
      
      inline def setNumFrozenRowsClampedUndefined: Self = StObject.set(x, "numFrozenRowsClamped", js.undefined)
      
      inline def setRowHeights(value: js.Array[Double]): Self = StObject.set(x, "rowHeights", value.asInstanceOf[js.Any])
      
      inline def setRowHeightsUndefined: Self = StObject.set(x, "rowHeights", js.undefined)
      
      inline def setRowHeightsVarargs(value: Double*): Self = StObject.set(x, "rowHeights", js.Array(value :_*))
      
      inline def setSelectedRegions(value: js.Array[IRegion]): Self = StObject.set(x, "selectedRegions", value.asInstanceOf[js.Any])
      
      inline def setSelectedRegionsUndefined: Self = StObject.set(x, "selectedRegions", js.undefined)
      
      inline def setSelectedRegionsVarargs(value: IRegion*): Self = StObject.set(x, "selectedRegions", js.Array(value :_*))
      
      inline def setVerticalGuides(value: js.Array[Double]): Self = StObject.set(x, "verticalGuides", value.asInstanceOf[js.Any])
      
      inline def setVerticalGuidesUndefined: Self = StObject.set(x, "verticalGuides", js.undefined)
      
      inline def setVerticalGuidesVarargs(value: Double*): Self = StObject.set(x, "verticalGuides", js.Array(value :_*))
      
      inline def setViewportRect(value: Rect): Self = StObject.set(x, "viewportRect", value.asInstanceOf[js.Any])
      
      inline def setViewportRectUndefined: Self = StObject.set(x, "viewportRect", js.undefined)
    }
  }
}
