package typings.atBlueprintjsTable.libEsmTableMod

import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typings.atBlueprintjsTable.libEsmCommonCellMod.IFocusedCellCoordinates
import typings.atBlueprintjsTable.libEsmCommonGridMod.IColumnIndices
import typings.atBlueprintjsTable.libEsmCommonGridMod.IRowIndices
import typings.atBlueprintjsTable.libEsmCommonRenderModeMod.RenderMode
import typings.atBlueprintjsTable.libEsmHeadersColumnHeaderMod.IColumnWidths
import typings.atBlueprintjsTable.libEsmHeadersRowHeaderMod.IRowHeaderRenderer
import typings.atBlueprintjsTable.libEsmHeadersRowHeaderMod.IRowHeights
import typings.atBlueprintjsTable.libEsmInteractionsDraggableMod.ICoordinateData
import typings.atBlueprintjsTable.libEsmInteractionsMenusMenuContextMod.IContextMenuRenderer
import typings.atBlueprintjsTable.libEsmInteractionsMenusMenuContextMod.IMenuContext
import typings.atBlueprintjsTable.libEsmInteractionsResizableMod.IIndexedResizeCallback
import typings.atBlueprintjsTable.libEsmInteractionsSelectableMod.ISelectedRegionTransform
import typings.atBlueprintjsTable.libEsmRegionsMod.IRegion
import typings.atBlueprintjsTable.libEsmRegionsMod.IStyledRegionGroup
import typings.atBlueprintjsTable.libEsmRegionsMod.RegionCardinality
import typings.atBlueprintjsTable.libEsmRegionsMod.TableLoadingOption
import typings.react.reactMod.ReactElement
import typings.react.reactMod._Global_.JSX.Element
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var getCellClipboardData: js.UndefOr[js.Function2[/* row */ Double, /* col */ Double, _]] = js.undefined
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
  @scala.inline
  def apply(
    bodyContextMenuRenderer: /* context */ IMenuContext => Element = null,
    children: ReactElement | js.Array[ReactElement] = null,
    className: String = null,
    columnWidths: js.Array[js.UndefOr[Double | Null]] = null,
    defaultColumnWidth: Int | Double = null,
    defaultRowHeight: Int | Double = null,
    enableColumnInteractionBar: js.UndefOr[Boolean] = js.undefined,
    enableColumnReordering: js.UndefOr[Boolean] = js.undefined,
    enableColumnResizing: js.UndefOr[Boolean] = js.undefined,
    enableFocusedCell: js.UndefOr[Boolean] = js.undefined,
    enableGhostCells: js.UndefOr[Boolean] = js.undefined,
    enableMultipleSelection: js.UndefOr[Boolean] = js.undefined,
    enableRowHeader: js.UndefOr[Boolean] = js.undefined,
    enableRowReordering: js.UndefOr[Boolean] = js.undefined,
    enableRowResizing: js.UndefOr[Boolean] = js.undefined,
    focusedCell: IFocusedCellCoordinates = null,
    forceRerenderOnSelectionChange: js.UndefOr[Boolean] = js.undefined,
    getCellClipboardData: (/* row */ Double, /* col */ Double) => _ = null,
    loadingOptions: js.Array[TableLoadingOption] = null,
    maxColumnWidth: Int | Double = null,
    maxRowHeight: Int | Double = null,
    minColumnWidth: Int | Double = null,
    minRowHeight: Int | Double = null,
    numFrozenColumns: Int | Double = null,
    numFrozenRows: Int | Double = null,
    numRows: Int | Double = null,
    onColumnWidthChanged: (/* index */ Double, /* size */ Double) => Unit = null,
    onColumnsReordered: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit = null,
    onCompleteRender: () => Unit = null,
    onCopy: /* success */ Boolean => Unit = null,
    onFocusedCell: /* focusedCell */ IFocusedCellCoordinates => Unit = null,
    onRowHeightChanged: (/* index */ Double, /* size */ Double) => Unit = null,
    onRowsReordered: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit = null,
    onSelection: /* selectedRegions */ js.Array[IRegion] => Unit = null,
    onVisibleCellsChange: (/* rowIndices */ IRowIndices, /* columnIndices */ IColumnIndices) => Unit = null,
    renderMode: RenderMode = null,
    rowHeaderCellRenderer: /* rowIndex */ Double => ReactElement = null,
    rowHeights: js.Array[js.UndefOr[Double | Null]] = null,
    selectedRegionTransform: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => IRegion = null,
    selectedRegions: js.Array[IRegion] = null,
    selectionModes: js.Array[RegionCardinality] = null,
    styledRegionGroups: js.Array[IStyledRegionGroup] = null
  ): ITableProps = {
    val __obj = js.Dynamic.literal()
    if (bodyContextMenuRenderer != null) __obj.updateDynamic("bodyContextMenuRenderer")(js.Any.fromFunction1(bodyContextMenuRenderer))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnWidths != null) __obj.updateDynamic("columnWidths")(columnWidths.asInstanceOf[js.Any])
    if (defaultColumnWidth != null) __obj.updateDynamic("defaultColumnWidth")(defaultColumnWidth.asInstanceOf[js.Any])
    if (defaultRowHeight != null) __obj.updateDynamic("defaultRowHeight")(defaultRowHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnInteractionBar)) __obj.updateDynamic("enableColumnInteractionBar")(enableColumnInteractionBar.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnReordering)) __obj.updateDynamic("enableColumnReordering")(enableColumnReordering.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnResizing)) __obj.updateDynamic("enableColumnResizing")(enableColumnResizing.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFocusedCell)) __obj.updateDynamic("enableFocusedCell")(enableFocusedCell.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGhostCells)) __obj.updateDynamic("enableGhostCells")(enableGhostCells.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMultipleSelection)) __obj.updateDynamic("enableMultipleSelection")(enableMultipleSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowHeader)) __obj.updateDynamic("enableRowHeader")(enableRowHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowReordering)) __obj.updateDynamic("enableRowReordering")(enableRowReordering.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowResizing)) __obj.updateDynamic("enableRowResizing")(enableRowResizing.asInstanceOf[js.Any])
    if (focusedCell != null) __obj.updateDynamic("focusedCell")(focusedCell.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRerenderOnSelectionChange)) __obj.updateDynamic("forceRerenderOnSelectionChange")(forceRerenderOnSelectionChange.asInstanceOf[js.Any])
    if (getCellClipboardData != null) __obj.updateDynamic("getCellClipboardData")(js.Any.fromFunction2(getCellClipboardData))
    if (loadingOptions != null) __obj.updateDynamic("loadingOptions")(loadingOptions.asInstanceOf[js.Any])
    if (maxColumnWidth != null) __obj.updateDynamic("maxColumnWidth")(maxColumnWidth.asInstanceOf[js.Any])
    if (maxRowHeight != null) __obj.updateDynamic("maxRowHeight")(maxRowHeight.asInstanceOf[js.Any])
    if (minColumnWidth != null) __obj.updateDynamic("minColumnWidth")(minColumnWidth.asInstanceOf[js.Any])
    if (minRowHeight != null) __obj.updateDynamic("minRowHeight")(minRowHeight.asInstanceOf[js.Any])
    if (numFrozenColumns != null) __obj.updateDynamic("numFrozenColumns")(numFrozenColumns.asInstanceOf[js.Any])
    if (numFrozenRows != null) __obj.updateDynamic("numFrozenRows")(numFrozenRows.asInstanceOf[js.Any])
    if (numRows != null) __obj.updateDynamic("numRows")(numRows.asInstanceOf[js.Any])
    if (onColumnWidthChanged != null) __obj.updateDynamic("onColumnWidthChanged")(js.Any.fromFunction2(onColumnWidthChanged))
    if (onColumnsReordered != null) __obj.updateDynamic("onColumnsReordered")(js.Any.fromFunction3(onColumnsReordered))
    if (onCompleteRender != null) __obj.updateDynamic("onCompleteRender")(js.Any.fromFunction0(onCompleteRender))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onFocusedCell != null) __obj.updateDynamic("onFocusedCell")(js.Any.fromFunction1(onFocusedCell))
    if (onRowHeightChanged != null) __obj.updateDynamic("onRowHeightChanged")(js.Any.fromFunction2(onRowHeightChanged))
    if (onRowsReordered != null) __obj.updateDynamic("onRowsReordered")(js.Any.fromFunction3(onRowsReordered))
    if (onSelection != null) __obj.updateDynamic("onSelection")(js.Any.fromFunction1(onSelection))
    if (onVisibleCellsChange != null) __obj.updateDynamic("onVisibleCellsChange")(js.Any.fromFunction2(onVisibleCellsChange))
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (rowHeaderCellRenderer != null) __obj.updateDynamic("rowHeaderCellRenderer")(js.Any.fromFunction1(rowHeaderCellRenderer))
    if (rowHeights != null) __obj.updateDynamic("rowHeights")(rowHeights.asInstanceOf[js.Any])
    if (selectedRegionTransform != null) __obj.updateDynamic("selectedRegionTransform")(js.Any.fromFunction3(selectedRegionTransform))
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions.asInstanceOf[js.Any])
    if (selectionModes != null) __obj.updateDynamic("selectionModes")(selectionModes.asInstanceOf[js.Any])
    if (styledRegionGroups != null) __obj.updateDynamic("styledRegionGroups")(styledRegionGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableProps]
  }
}

