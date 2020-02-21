package typings.blueprintjsTable.tableMod

import typings.blueprintjsCore.mod.AbstractComponent2
import typings.blueprintjsTable.AnonChildrenArray
import typings.blueprintjsTable.AnonNextScrollLeft
import typings.blueprintjsTable.contextMod.IColumnInteractionBarContextTypes
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.blueprintjsTable.gridMod.Grid
import typings.blueprintjsTable.gridMod.ICellMapper
import typings.blueprintjsTable.locatorMod.Locator
import typings.react.mod.ValidationMap
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/table", "Table")
@js.native
class Table protected () extends AbstractComponent2[ITableProps, ITableState, ITableSnapshot] {
  def this(props: ITableProps) = this()
  def this(props: ITableProps, context: js.Any) = this()
  var bodyCellRenderer: js.Any = js.native
  var cellContainerElement: js.Any = js.native
  var clearSelection: js.Any = js.native
  var columnHeaderCellRenderer: js.Any = js.native
  var columnHeaderElement: js.Any = js.native
  var didCompletelyMount: js.Any = js.native
  var getColumnProps: js.Any = js.native
  var getEnabledSelectionHandler: js.Any = js.native
  var getMaxFrozenColumnIndex: js.Any = js.native
  var getMaxFrozenRowIndex: js.Any = js.native
  /**
    * Normalizes RenderMode.BATCH_ON_UPDATE into RenderMode.{BATCH,NONE}. We do
    * this because there are actually multiple updates required before the
    * <Table> is considered fully "mounted," and adding that knowledge to child
    * components would lead to tight coupling. Thus, keep it simple for them.
    */
  var getNormalizedRenderMode: js.Any = js.native
  var grid: Grid = js.native
  var gridDimensionsMatchProps: js.Any = js.native
  var handleBodyScroll: js.Any = js.native
  var handleColumnResizeGuide: js.Any = js.native
  var handleColumnWidthChanged: js.Any = js.native
  var handleColumnsReordered: js.Any = js.native
  var handleColumnsReordering: js.Any = js.native
  var handleCompleteRender: js.Any = js.native
  var handleCopy: js.Any = js.native
  var handleFocus: js.Any = js.native
  var handleFocusMove: js.Any = js.native
  var handleFocusMoveDown: js.Any = js.native
  var handleFocusMoveDownInternal: js.Any = js.native
  var handleFocusMoveInternal: js.Any = js.native
  var handleFocusMoveLeft: js.Any = js.native
  var handleFocusMoveLeftInternal: js.Any = js.native
  var handleFocusMoveRight: js.Any = js.native
  var handleFocusMoveRightInternal: js.Any = js.native
  var handleFocusMoveUp: js.Any = js.native
  var handleFocusMoveUpInternal: js.Any = js.native
  var handleLayoutLock: js.Any = js.native
  var handleMenuMouseDown: js.Any = js.native
  var handleRootScroll: js.Any = js.native
  var handleRowHeightChanged: js.Any = js.native
  var handleRowResizeGuide: js.Any = js.native
  var handleRowsReordered: js.Any = js.native
  var handleRowsReordering: js.Any = js.native
  var handleSelectAllHotkey: js.Any = js.native
  var handleSelection: js.Any = js.native
  var handleSelectionResize: js.Any = js.native
  var handleSelectionResizeDown: js.Any = js.native
  var handleSelectionResizeLeft: js.Any = js.native
  var handleSelectionResizeRight: js.Any = js.native
  var handleSelectionResizeUp: js.Any = js.native
  var hasLoadingOption: js.Any = js.native
  var invalidateGrid: js.Any = js.native
  var invokeOnVisibleCellsChangeCallback: js.Any = js.native
  var isGuidesShowing: js.Any = js.native
  var locator: Locator = js.native
  var maybeRenderCopyHotkey: js.Any = js.native
  var maybeRenderFocusHotkeys: js.Any = js.native
  /**
    * Renders a `RegionLayer`, applying styles to the regions using the
    * supplied `IRegionStyler`. `RegionLayer` is a `PureRender` component, so
    * the `IRegionStyler` should be a new instance on every render if we
    * intend to redraw the region layer.
    */
  var maybeRenderRegions: js.Any = js.native
  var maybeRenderSelectAllHotkey: js.Any = js.native
  var maybeRenderSelectionResizeHotkeys: js.Any = js.native
  var moveFocusCell: js.Any = js.native
  var quadrantStackInstance: js.Any = js.native
  var refHandlers: js.Any = js.native
  var renderBody: js.Any = js.native
  var renderColumnHeader: js.Any = js.native
  var renderMenu: js.Any = js.native
  var renderRowHeader: js.Any = js.native
  var resizeSensorDetach: js.Any = js.native
  /**
    * Returns an object with option keys mapped to their resolved values
    * (falling back to default values as necessary).
    */
  var resolveResizeRowsByApproximateHeightOptions: js.Any = js.native
  var rootTableElement: js.Any = js.native
  var rowHeaderElement: js.Any = js.native
  var scrollBodyToFocusedCell: js.Any = js.native
  var scrollContainerElement: js.Any = js.native
  var selectAll: js.Any = js.native
  var shouldDisableHorizontalScroll: js.Any = js.native
  var shouldDisableVerticalScroll: js.Any = js.native
  var styleBodyRegion: js.Any = js.native
  var styleColumnHeaderRegion: js.Any = js.native
  var styleMenuRegion: js.Any = js.native
  var styleRowHeaderRegion: js.Any = js.native
  var syncViewportPosition: js.Any = js.native
  var updateLocator: js.Any = js.native
  /**
    * Replaces the selected region at the specified array index, with the
    * region provided.
    */
  var updateSelectedRegionAtIndex: js.Any = js.native
  var updateViewportRect: js.Any = js.native
  var validateGrid: js.Any = js.native
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
  def getChildContext(): IColumnInteractionBarContextTypes = js.native
  @JSName("getSnapshotBeforeUpdate")
  def getSnapshotBeforeUpdate_MTable(): AnonNextScrollLeft = js.native
  def renderHotkeys(): Element = js.native
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
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MTable(nextProps: ITableProps, nextState: ITableState): Boolean = js.native
}

/* static members */
@JSImport("@blueprintjs/table/lib/esm/table", "Table")
@js.native
object Table extends js.Object {
  var SHALLOW_COMPARE_PROP_KEYS_BLACKLIST: js.Any = js.native
  var SHALLOW_COMPARE_STATE_KEYS_BLACKLIST: js.Any = js.native
  var childContextTypes: ValidationMap[IColumnInteractionBarContextTypes] = js.native
  var createColumnIdIndex: js.Any = js.native
  var defaultProps: ITableProps = js.native
  var displayName: String = js.native
  var isSelectionModeEnabled: js.Any = js.native
  var resizeRowsByApproximateHeightDefaults: js.Any = js.native
  def getDerivedStateFromProps(props: ITableProps, state: ITableState): AnonChildrenArray = js.native
}

