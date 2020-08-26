package typings.blueprintjsTable.tableMod

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsTable.columnHeaderMod.IColumnWidths
import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.dragTypesMod.ICoordinateData
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.blueprintjsTable.esmRegionsMod.IStyledRegionGroup
import typings.blueprintjsTable.esmRegionsMod.RegionCardinality
import typings.blueprintjsTable.esmRegionsMod.TableLoadingOption
import typings.blueprintjsTable.gridMod.IColumnIndices
import typings.blueprintjsTable.gridMod.IRowIndices
import typings.blueprintjsTable.menuContextMod.IContextMenuRenderer
import typings.blueprintjsTable.menuContextMod.IMenuContext
import typings.blueprintjsTable.renderModeMod.RenderMode
import typings.blueprintjsTable.resizableMod.IIndexedResizeCallback
import typings.blueprintjsTable.rowHeaderMod.IRowHeaderRenderer
import typings.blueprintjsTable.rowHeaderMod.IRowHeights
import typings.blueprintjsTable.selectableMod.ISelectedRegionTransform
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITableProps
  extends IProps
     with IRowHeights
     with IColumnWidths {
  /**
    * An optional callback for displaying a context menu when right-clicking
    * on the table body. The callback is supplied with an array of
    * `IRegion`s. If the mouse click was on a selection, the array will
    * contain all selected regions. Otherwise it will have one `IRegion` that
    * represents the clicked cell.
    */
  var bodyContextMenuRenderer: js.UndefOr[IContextMenuRenderer] = js.native
  /**
    * The children of a `Table` component, which must be React elements
    * that use `IColumnProps`.
    */
  var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.native
  /**
    * A sparse number array with a length equal to the number of columns. Any
    * non-null value will be used to set the width of the column at the same
    * index. Note that if you want to update these values when the user
    * drag-resizes a column, you may define a callback for `onColumnWidthChanged`.
    */
  var columnWidths: js.UndefOr[js.Array[js.UndefOr[Double | Null]]] = js.native
  /**
    * If `true`, adds an interaction bar on top of all column header cells, and
    * moves interaction triggers into it.
    * @default false
    */
  var enableColumnInteractionBar: js.UndefOr[Boolean] = js.native
  /**
    * If `false`, disables reordering of columns.
    * @default false
    */
  var enableColumnReordering: js.UndefOr[Boolean] = js.native
  /**
    * If `false`, disables resizing of columns.
    * @default true
    */
  var enableColumnResizing: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, there will be a single "focused" cell at all times,
    * which can be used to interact with the table as though it is a
    * spreadsheet. When false, no such cell will exist.
    * @default false
    */
  var enableFocusedCell: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, empty space in the table container will be filled with empty
    * cells instead of a blank background.
    * @default false
    */
  var enableGhostCells: js.UndefOr[Boolean] = js.native
  /**
    * If `false`, only a single region of a single column/row/cell may be
    * selected at one time. Using `ctrl` or `meta` key will have no effect,
    * and a mouse drag will select the current column/row/cell only.
    * @default true
    */
  var enableMultipleSelection: js.UndefOr[Boolean] = js.native
  /**
    * If `false`, hides the row headers and settings menu.
    * @default true
    */
  var enableRowHeader: js.UndefOr[Boolean] = js.native
  /**
    * If `false`, disables reordering of rows.
    * @default false
    */
  var enableRowReordering: js.UndefOr[Boolean] = js.native
  /**
    * If `false`, disables resizing of rows.
    * @default true
    */
  var enableRowResizing: js.UndefOr[Boolean] = js.native
  /**
    * If defined, will set the focused cell state. This changes
    * the focused cell to controlled mode, meaning you are in charge of
    * setting the focus in response to events in the `onFocusedCell` callback.
    */
  var focusedCell: js.UndefOr[IFocusedCellCoordinates] = js.native
  /**
    * If `true`, selection state changes will cause the component to re-render.
    * If `false`, selection state is ignored when deciding to re-render.
    * @default false
    */
  var forceRerenderOnSelectionChange: js.UndefOr[Boolean] = js.native
  /**
    * If defined, this callback will be invoked for each cell when the user
    * attempts to copy a selection via `mod+c`. The returned data will be copied
    * to the clipboard and need not match the display value of the `<Cell>`.
    * The data will be invisibly added as `textContent` into the DOM before
    * copying. If not defined, keyboard copying via `mod+c` will be disabled.
    */
  var getCellClipboardData: js.UndefOr[js.Function2[/* row */ Double, /* col */ Double, _]] = js.native
  /**
    * A list of `TableLoadingOption`. Set this prop to specify whether to
    * render the loading state for the column header, row header, and body
    * sections of the table.
    */
  var loadingOptions: js.UndefOr[js.Array[TableLoadingOption]] = js.native
  /**
    * The number of columns to freeze to the left side of the table, counting
    * from the leftmost column.
    * @default 0
    */
  var numFrozenColumns: js.UndefOr[Double] = js.native
  /**
    * The number of rows to freeze to the top of the table, counting from the
    * topmost row.
    * @default 0
    */
  var numFrozenRows: js.UndefOr[Double] = js.native
  /**
    * The number of rows in the table.
    */
  var numRows: js.UndefOr[Double] = js.native
  /**
    * If resizing is enabled, this callback will be invoked when the user
    * finishes drag-resizing a column.
    */
  var onColumnWidthChanged: js.UndefOr[IIndexedResizeCallback] = js.native
  /**
    * If reordering is enabled, this callback will be invoked when the user finishes
    * drag-reordering one or more columns.
    */
  var onColumnsReordered: js.UndefOr[
    js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit]
  ] = js.native
  /**
    * An optional callback invoked when all cells in view have completely rendered.
    * Will be invoked on initial mount and whenever cells update (e.g., on scroll).
    */
  var onCompleteRender: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * If you want to do something after the copy or if you want to notify the
    * user if a copy fails, you may provide this optional callback.
    *
    * Due to browser limitations, the copy can fail. This usually occurs if
    * the selection is too large, like 20,000+ cells. The copy will also fail
    * if the browser does not support the copy method (see
    * `Clipboard.isCopySupported`).
    */
  var onCopy: js.UndefOr[js.Function1[/* success */ Boolean, Unit]] = js.native
  /**
    * A callback called when the focus is changed in the table.
    */
  var onFocusedCell: js.UndefOr[js.Function1[/* focusedCell */ IFocusedCellCoordinates, Unit]] = js.native
  /**
    * If resizing is enabled, this callback will be invoked when the user
    * finishes drag-resizing a row.
    */
  var onRowHeightChanged: js.UndefOr[IIndexedResizeCallback] = js.native
  /**
    * If reordering is enabled, this callback will be invoked when the user finishes
    * drag-reordering one or more rows.
    */
  var onRowsReordered: js.UndefOr[
    js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit]
  ] = js.native
  /**
    * A callback called when the selection is changed in the table.
    */
  var onSelection: js.UndefOr[js.Function1[/* selectedRegions */ js.Array[IRegion], Unit]] = js.native
  /**
    * A callback called when the visible cell indices change in the table.
    */
  var onVisibleCellsChange: js.UndefOr[
    js.Function2[/* rowIndices */ IRowIndices, /* columnIndices */ IColumnIndices, Unit]
  ] = js.native
  /**
    * Dictates how cells should be rendered. Supported modes are:
    * - `RenderMode.BATCH`: renders cells in batches to improve performance
    * - `RenderMode.BATCH_ON_UPDATE`: renders cells synchronously on mount and
    *   in batches on update
    * - `RenderMode.NONE`: renders cells synchronously all at once
    * @default RenderMode.BATCH_ON_UPDATE
    */
  var renderMode: js.UndefOr[RenderMode] = js.native
  /**
    * Render each row's header cell.
    */
  var rowHeaderCellRenderer: js.UndefOr[IRowHeaderRenderer] = js.native
  /**
    * A sparse number array with a length equal to the number of rows. Any
    * non-null value will be used to set the height of the row at the same
    * index. Note that if you want to update these values when the user
    * drag-resizes a row, you may define a callback for `onRowHeightChanged`.
    */
  var rowHeights: js.UndefOr[js.Array[js.UndefOr[Double | Null]]] = js.native
  /**
    * An optional transform function that will be applied to the located
    * `Region`.
    *
    * This allows you to, for example, convert cell `Region`s into row
    * `Region`s while maintaining the existing multi-select and meta-click
    * functionality.
    */
  var selectedRegionTransform: js.UndefOr[ISelectedRegionTransform] = js.native
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
  var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.native
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
  var selectionModes: js.UndefOr[js.Array[RegionCardinality]] = js.native
  /**
    * Styled region groups are rendered as overlays above the table and are
    * marked with their own `className` for custom styling.
    */
  var styledRegionGroups: js.UndefOr[js.Array[IStyledRegionGroup]] = js.native
}

object ITableProps {
  @scala.inline
  def apply(): ITableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITableProps]
  }
  @scala.inline
  implicit class ITablePropsOps[Self <: ITableProps] (val x: Self) extends AnyVal {
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
    def setBodyContextMenuRenderer(value: /* context */ IMenuContext => Element): Self = this.set("bodyContextMenuRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBodyContextMenuRenderer: Self = this.set("bodyContextMenuRenderer", js.undefined)
    @scala.inline
    def setChildrenVarargs(value: ReactElement*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: ReactElement | js.Array[ReactElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setColumnWidthsVarargs(value: (js.UndefOr[Double | Null])*): Self = this.set("columnWidths", js.Array(value :_*))
    @scala.inline
    def setColumnWidths(value: js.Array[js.UndefOr[Double | Null]]): Self = this.set("columnWidths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnWidths: Self = this.set("columnWidths", js.undefined)
    @scala.inline
    def setEnableColumnInteractionBar(value: Boolean): Self = this.set("enableColumnInteractionBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableColumnInteractionBar: Self = this.set("enableColumnInteractionBar", js.undefined)
    @scala.inline
    def setEnableColumnReordering(value: Boolean): Self = this.set("enableColumnReordering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableColumnReordering: Self = this.set("enableColumnReordering", js.undefined)
    @scala.inline
    def setEnableColumnResizing(value: Boolean): Self = this.set("enableColumnResizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableColumnResizing: Self = this.set("enableColumnResizing", js.undefined)
    @scala.inline
    def setEnableFocusedCell(value: Boolean): Self = this.set("enableFocusedCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableFocusedCell: Self = this.set("enableFocusedCell", js.undefined)
    @scala.inline
    def setEnableGhostCells(value: Boolean): Self = this.set("enableGhostCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableGhostCells: Self = this.set("enableGhostCells", js.undefined)
    @scala.inline
    def setEnableMultipleSelection(value: Boolean): Self = this.set("enableMultipleSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableMultipleSelection: Self = this.set("enableMultipleSelection", js.undefined)
    @scala.inline
    def setEnableRowHeader(value: Boolean): Self = this.set("enableRowHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRowHeader: Self = this.set("enableRowHeader", js.undefined)
    @scala.inline
    def setEnableRowReordering(value: Boolean): Self = this.set("enableRowReordering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRowReordering: Self = this.set("enableRowReordering", js.undefined)
    @scala.inline
    def setEnableRowResizing(value: Boolean): Self = this.set("enableRowResizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRowResizing: Self = this.set("enableRowResizing", js.undefined)
    @scala.inline
    def setFocusedCell(value: IFocusedCellCoordinates): Self = this.set("focusedCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusedCell: Self = this.set("focusedCell", js.undefined)
    @scala.inline
    def setForceRerenderOnSelectionChange(value: Boolean): Self = this.set("forceRerenderOnSelectionChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceRerenderOnSelectionChange: Self = this.set("forceRerenderOnSelectionChange", js.undefined)
    @scala.inline
    def setGetCellClipboardData(value: (/* row */ Double, /* col */ Double) => _): Self = this.set("getCellClipboardData", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetCellClipboardData: Self = this.set("getCellClipboardData", js.undefined)
    @scala.inline
    def setLoadingOptionsVarargs(value: TableLoadingOption*): Self = this.set("loadingOptions", js.Array(value :_*))
    @scala.inline
    def setLoadingOptions(value: js.Array[TableLoadingOption]): Self = this.set("loadingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingOptions: Self = this.set("loadingOptions", js.undefined)
    @scala.inline
    def setNumFrozenColumns(value: Double): Self = this.set("numFrozenColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumFrozenColumns: Self = this.set("numFrozenColumns", js.undefined)
    @scala.inline
    def setNumFrozenRows(value: Double): Self = this.set("numFrozenRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumFrozenRows: Self = this.set("numFrozenRows", js.undefined)
    @scala.inline
    def setNumRows(value: Double): Self = this.set("numRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumRows: Self = this.set("numRows", js.undefined)
    @scala.inline
    def setOnColumnWidthChanged(value: (/* index */ Double, /* size */ Double) => Unit): Self = this.set("onColumnWidthChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnColumnWidthChanged: Self = this.set("onColumnWidthChanged", js.undefined)
    @scala.inline
    def setOnColumnsReordered(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit): Self = this.set("onColumnsReordered", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnColumnsReordered: Self = this.set("onColumnsReordered", js.undefined)
    @scala.inline
    def setOnCompleteRender(value: () => Unit): Self = this.set("onCompleteRender", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCompleteRender: Self = this.set("onCompleteRender", js.undefined)
    @scala.inline
    def setOnCopy(value: /* success */ Boolean => Unit): Self = this.set("onCopy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    @scala.inline
    def setOnFocusedCell(value: /* focusedCell */ IFocusedCellCoordinates => Unit): Self = this.set("onFocusedCell", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocusedCell: Self = this.set("onFocusedCell", js.undefined)
    @scala.inline
    def setOnRowHeightChanged(value: (/* index */ Double, /* size */ Double) => Unit): Self = this.set("onRowHeightChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRowHeightChanged: Self = this.set("onRowHeightChanged", js.undefined)
    @scala.inline
    def setOnRowsReordered(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit): Self = this.set("onRowsReordered", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnRowsReordered: Self = this.set("onRowsReordered", js.undefined)
    @scala.inline
    def setOnSelection(value: /* selectedRegions */ js.Array[IRegion] => Unit): Self = this.set("onSelection", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelection: Self = this.set("onSelection", js.undefined)
    @scala.inline
    def setOnVisibleCellsChange(value: (/* rowIndices */ IRowIndices, /* columnIndices */ IColumnIndices) => Unit): Self = this.set("onVisibleCellsChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnVisibleCellsChange: Self = this.set("onVisibleCellsChange", js.undefined)
    @scala.inline
    def setRenderMode(value: RenderMode): Self = this.set("renderMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderMode: Self = this.set("renderMode", js.undefined)
    @scala.inline
    def setRowHeaderCellRenderer(value: /* rowIndex */ Double => ReactElement): Self = this.set("rowHeaderCellRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowHeaderCellRenderer: Self = this.set("rowHeaderCellRenderer", js.undefined)
    @scala.inline
    def setRowHeightsVarargs(value: (js.UndefOr[Double | Null])*): Self = this.set("rowHeights", js.Array(value :_*))
    @scala.inline
    def setRowHeights(value: js.Array[js.UndefOr[Double | Null]]): Self = this.set("rowHeights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHeights: Self = this.set("rowHeights", js.undefined)
    @scala.inline
    def setSelectedRegionTransform(
      value: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => IRegion
    ): Self = this.set("selectedRegionTransform", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSelectedRegionTransform: Self = this.set("selectedRegionTransform", js.undefined)
    @scala.inline
    def setSelectedRegionsVarargs(value: IRegion*): Self = this.set("selectedRegions", js.Array(value :_*))
    @scala.inline
    def setSelectedRegions(value: js.Array[IRegion]): Self = this.set("selectedRegions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedRegions: Self = this.set("selectedRegions", js.undefined)
    @scala.inline
    def setSelectionModesVarargs(value: RegionCardinality*): Self = this.set("selectionModes", js.Array(value :_*))
    @scala.inline
    def setSelectionModes(value: js.Array[RegionCardinality]): Self = this.set("selectionModes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionModes: Self = this.set("selectionModes", js.undefined)
    @scala.inline
    def setStyledRegionGroupsVarargs(value: IStyledRegionGroup*): Self = this.set("styledRegionGroups", js.Array(value :_*))
    @scala.inline
    def setStyledRegionGroups(value: js.Array[IStyledRegionGroup]): Self = this.set("styledRegionGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyledRegionGroups: Self = this.set("styledRegionGroups", js.undefined)
  }
  
}

