package typings
package atBlueprintjsTableLib.libEsmTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITableProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps
     with atBlueprintjsTableLib.libEsmHeadersRowHeaderMod.IRowHeights
     with atBlueprintjsTableLib.libEsmHeadersColumnHeaderMod.IColumnWidths {
  /**
    * An optional callback for displaying a context menu when right-clicking
    * on the table body. The callback is supplied with an array of
    * `IRegion`s. If the mouse click was on a selection, the array will
    * contain all selected regions. Otherwise it will have one `IRegion` that
    * represents the clicked cell.
    */
  var bodyContextMenuRenderer: js.UndefOr[atBlueprintjsTableLib.libEsmInteractionsMenusMenuContextMod.IContextMenuRenderer] = js.undefined
  /**
    * The children of a `Table` component, which must be React elements
    * that use `IColumnProps`.
    */
  var children: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[atBlueprintjsTableLib.libEsmColumnMod.IColumnProps] | (js.Array[
      reactLib.reactMod.ReactNs.ReactElement[atBlueprintjsTableLib.libEsmColumnMod.IColumnProps]
    ])
  ] = js.undefined
  /**
    * A sparse number array with a length equal to the number of columns. Any
    * non-null value will be used to set the width of the column at the same
    * index. Note that if you want to update these values when the user
    * drag-resizes a column, you may define a callback for `onColumnWidthChanged`.
    */
  var columnWidths: js.UndefOr[js.Array[js.UndefOr[scala.Double | scala.Null]]] = js.undefined
  /**
    * If `true`, adds an interaction bar on top of all column header cells, and
    * moves interaction triggers into it.
    * @default false
    */
  var enableColumnInteractionBar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `false`, disables reordering of columns.
    * @default false
    */
  var enableColumnReordering: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `false`, disables resizing of columns.
    * @default true
    */
  var enableColumnResizing: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, there will be a single "focused" cell at all times,
    * which can be used to interact with the table as though it is a
    * spreadsheet. When false, no such cell will exist.
    * @default false
    */
  var enableFocusedCell: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, empty space in the table container will be filled with empty
    * cells instead of a blank background.
    * @default false
    */
  var enableGhostCells: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `false`, only a single region of a single column/row/cell may be
    * selected at one time. Using `ctrl` or `meta` key will have no effect,
    * and a mouse drag will select the current column/row/cell only.
    * @default true
    */
  var enableMultipleSelection: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `false`, hides the row headers and settings menu.
    * @default true
    */
  var enableRowHeader: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `false`, disables reordering of rows.
    * @default false
    */
  var enableRowReordering: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `false`, disables resizing of rows.
    * @default false
    */
  var enableRowResizing: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If defined, will set the focused cell state. This changes
    * the focused cell to controlled mode, meaning you are in charge of
    * setting the focus in response to events in the `onFocusedCell` callback.
    */
  var focusedCell: js.UndefOr[atBlueprintjsTableLib.libEsmCommonCellMod.IFocusedCellCoordinates] = js.undefined
  /**
    * If `true`, selection state changes will cause the component to re-render.
    * If `false`, selection state is ignored when deciding to re-render.
    * @default false
    */
  var forceRerenderOnSelectionChange: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If defined, this callback will be invoked for each cell when the user
    * attempts to copy a selection via `mod+c`. The returned data will be copied
    * to the clipboard and need not match the display value of the `<Cell>`.
    * The data will be invisibly added as `textContent` into the DOM before
    * copying. If not defined, keyboard copying via `mod+c` will be disabled.
    */
  var getCellClipboardData: js.UndefOr[js.Function2[/* row */ scala.Double, /* col */ scala.Double, _]] = js.undefined
  /**
    * A list of `TableLoadingOption`. Set this prop to specify whether to
    * render the loading state for the column header, row header, and body
    * sections of the table.
    */
  var loadingOptions: js.UndefOr[js.Array[atBlueprintjsTableLib.libEsmRegionsMod.TableLoadingOption]] = js.undefined
  /**
    * The number of columns to freeze to the left side of the table, counting
    * from the leftmost column.
    * @default 0
    */
  var numFrozenColumns: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of rows to freeze to the top of the table, counting from the
    * topmost row.
    * @default 0
    */
  var numFrozenRows: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of rows in the table.
    */
  var numRows: js.UndefOr[scala.Double] = js.undefined
  /**
    * If resizing is enabled, this callback will be invoked when the user
    * finishes drag-resizing a column.
    */
  var onColumnWidthChanged: js.UndefOr[atBlueprintjsTableLib.libEsmInteractionsResizableMod.IIndexedResizeCallback] = js.undefined
  /**
    * If reordering is enabled, this callback will be invoked when the user finishes
    * drag-reordering one or more columns.
    */
  var onColumnsReordered: js.UndefOr[
    js.Function3[
      /* oldIndex */ scala.Double, 
      /* newIndex */ scala.Double, 
      /* length */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * An optional callback invoked when all cells in view have completely rendered.
    * Will be invoked on initial mount and whenever cells update (e.g., on scroll).
    */
  var onCompleteRender: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * If you want to do something after the copy or if you want to notify the
    * user if a copy fails, you may provide this optional callback.
    *
    * Due to browser limitations, the copy can fail. This usually occurs if
    * the selection is too large, like 20,000+ cells. The copy will also fail
    * if the browser does not support the copy method (see
    * `Clipboard.isCopySupported`).
    */
  var onCopy: js.UndefOr[js.Function1[/* success */ scala.Boolean, scala.Unit]] = js.undefined
  /**
    * A callback called when the focus is changed in the table.
    */
  var onFocusedCell: js.UndefOr[
    js.Function1[
      /* focusedCell */ atBlueprintjsTableLib.libEsmCommonCellMod.IFocusedCellCoordinates, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * If resizing is enabled, this callback will be invoked when the user
    * finishes drag-resizing a row.
    */
  var onRowHeightChanged: js.UndefOr[atBlueprintjsTableLib.libEsmInteractionsResizableMod.IIndexedResizeCallback] = js.undefined
  /**
    * If reordering is enabled, this callback will be invoked when the user finishes
    * drag-reordering one or more rows.
    */
  var onRowsReordered: js.UndefOr[
    js.Function3[
      /* oldIndex */ scala.Double, 
      /* newIndex */ scala.Double, 
      /* length */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * A callback called when the selection is changed in the table.
    */
  var onSelection: js.UndefOr[
    js.Function1[
      /* selectedRegions */ js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * A callback called when the visible cell indices change in the table.
    */
  var onVisibleCellsChange: js.UndefOr[
    js.Function2[
      /* rowIndices */ atBlueprintjsTableLib.libEsmCommonGridMod.IRowIndices, 
      /* columnIndices */ atBlueprintjsTableLib.libEsmCommonGridMod.IColumnIndices, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Dictates how cells should be rendered. Supported modes are:
    * - `RenderMode.BATCH`: renders cells in batches to improve performance
    * - `RenderMode.BATCH_ON_UPDATE`: renders cells synchronously on mount and
    *   in batches on update
    * - `RenderMode.NONE`: renders cells synchronously all at once
    * @default RenderMode.BATCH_ON_UPDATE
    */
  var renderMode: js.UndefOr[atBlueprintjsTableLib.libEsmCommonRenderModeMod.RenderMode] = js.undefined
  /**
    * Render each row's header cell.
    */
  var rowHeaderCellRenderer: js.UndefOr[atBlueprintjsTableLib.libEsmHeadersRowHeaderMod.IRowHeaderRenderer] = js.undefined
  /**
    * A sparse number array with a length equal to the number of rows. Any
    * non-null value will be used to set the height of the row at the same
    * index. Note that if you want to update these values when the user
    * drag-resizes a row, you may define a callback for `onRowHeightChanged`.
    */
  var rowHeights: js.UndefOr[js.Array[js.UndefOr[scala.Double | scala.Null]]] = js.undefined
  /**
    * An optional transform function that will be applied to the located
    * `Region`.
    *
    * This allows you to, for example, convert cell `Region`s into row
    * `Region`s while maintaining the existing multi-select and meta-click
    * functionality.
    */
  var selectedRegionTransform: js.UndefOr[atBlueprintjsTableLib.libEsmInteractionsSelectableMod.ISelectedRegionTransform] = js.undefined
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
  var selectedRegions: js.UndefOr[js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion]] = js.undefined
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
  var selectionModes: js.UndefOr[js.Array[atBlueprintjsTableLib.libEsmRegionsMod.RegionCardinality]] = js.undefined
  /**
    * Styled region groups are rendered as overlays above the table and are
    * marked with their own `className` for custom styling.
    */
  var styledRegionGroups: js.UndefOr[js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IStyledRegionGroup]] = js.undefined
}

object ITableProps {
  @scala.inline
  def apply(
    bodyContextMenuRenderer: atBlueprintjsTableLib.libEsmInteractionsMenusMenuContextMod.IContextMenuRenderer = null,
    children: reactLib.reactMod.ReactNs.ReactElement[atBlueprintjsTableLib.libEsmColumnMod.IColumnProps] | (js.Array[
      reactLib.reactMod.ReactNs.ReactElement[atBlueprintjsTableLib.libEsmColumnMod.IColumnProps]
    ]) = null,
    className: java.lang.String = null,
    columnWidths: js.Array[js.UndefOr[scala.Double | scala.Null]] = null,
    defaultColumnWidth: scala.Int | scala.Double = null,
    defaultRowHeight: scala.Int | scala.Double = null,
    enableColumnInteractionBar: js.UndefOr[scala.Boolean] = js.undefined,
    enableColumnReordering: js.UndefOr[scala.Boolean] = js.undefined,
    enableColumnResizing: js.UndefOr[scala.Boolean] = js.undefined,
    enableFocusedCell: js.UndefOr[scala.Boolean] = js.undefined,
    enableGhostCells: js.UndefOr[scala.Boolean] = js.undefined,
    enableMultipleSelection: js.UndefOr[scala.Boolean] = js.undefined,
    enableRowHeader: js.UndefOr[scala.Boolean] = js.undefined,
    enableRowReordering: js.UndefOr[scala.Boolean] = js.undefined,
    enableRowResizing: js.UndefOr[scala.Boolean] = js.undefined,
    focusedCell: atBlueprintjsTableLib.libEsmCommonCellMod.IFocusedCellCoordinates = null,
    forceRerenderOnSelectionChange: js.UndefOr[scala.Boolean] = js.undefined,
    getCellClipboardData: (/* row */ scala.Double, /* col */ scala.Double) => _ = null,
    loadingOptions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.TableLoadingOption] = null,
    maxColumnWidth: scala.Int | scala.Double = null,
    maxRowHeight: scala.Int | scala.Double = null,
    minColumnWidth: scala.Int | scala.Double = null,
    minRowHeight: scala.Int | scala.Double = null,
    numFrozenColumns: scala.Int | scala.Double = null,
    numFrozenRows: scala.Int | scala.Double = null,
    numRows: scala.Int | scala.Double = null,
    onColumnWidthChanged: atBlueprintjsTableLib.libEsmInteractionsResizableMod.IIndexedResizeCallback = null,
    onColumnsReordered: (/* oldIndex */ scala.Double, /* newIndex */ scala.Double, /* length */ scala.Double) => scala.Unit = null,
    onCompleteRender: () => scala.Unit = null,
    onCopy: /* success */ scala.Boolean => scala.Unit = null,
    onFocusedCell: /* focusedCell */ atBlueprintjsTableLib.libEsmCommonCellMod.IFocusedCellCoordinates => scala.Unit = null,
    onRowHeightChanged: atBlueprintjsTableLib.libEsmInteractionsResizableMod.IIndexedResizeCallback = null,
    onRowsReordered: (/* oldIndex */ scala.Double, /* newIndex */ scala.Double, /* length */ scala.Double) => scala.Unit = null,
    onSelection: /* selectedRegions */ js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion] => scala.Unit = null,
    onVisibleCellsChange: (/* rowIndices */ atBlueprintjsTableLib.libEsmCommonGridMod.IRowIndices, /* columnIndices */ atBlueprintjsTableLib.libEsmCommonGridMod.IColumnIndices) => scala.Unit = null,
    renderMode: atBlueprintjsTableLib.libEsmCommonRenderModeMod.RenderMode = null,
    rowHeaderCellRenderer: atBlueprintjsTableLib.libEsmHeadersRowHeaderMod.IRowHeaderRenderer = null,
    rowHeights: js.Array[js.UndefOr[scala.Double | scala.Null]] = null,
    selectedRegionTransform: atBlueprintjsTableLib.libEsmInteractionsSelectableMod.ISelectedRegionTransform = null,
    selectedRegions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion] = null,
    selectionModes: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.RegionCardinality] = null,
    styledRegionGroups: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IStyledRegionGroup] = null
  ): ITableProps = {
    val __obj = js.Dynamic.literal()
    if (bodyContextMenuRenderer != null) __obj.updateDynamic("bodyContextMenuRenderer")(bodyContextMenuRenderer)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (columnWidths != null) __obj.updateDynamic("columnWidths")(columnWidths)
    if (defaultColumnWidth != null) __obj.updateDynamic("defaultColumnWidth")(defaultColumnWidth.asInstanceOf[js.Any])
    if (defaultRowHeight != null) __obj.updateDynamic("defaultRowHeight")(defaultRowHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnInteractionBar)) __obj.updateDynamic("enableColumnInteractionBar")(enableColumnInteractionBar)
    if (!js.isUndefined(enableColumnReordering)) __obj.updateDynamic("enableColumnReordering")(enableColumnReordering)
    if (!js.isUndefined(enableColumnResizing)) __obj.updateDynamic("enableColumnResizing")(enableColumnResizing)
    if (!js.isUndefined(enableFocusedCell)) __obj.updateDynamic("enableFocusedCell")(enableFocusedCell)
    if (!js.isUndefined(enableGhostCells)) __obj.updateDynamic("enableGhostCells")(enableGhostCells)
    if (!js.isUndefined(enableMultipleSelection)) __obj.updateDynamic("enableMultipleSelection")(enableMultipleSelection)
    if (!js.isUndefined(enableRowHeader)) __obj.updateDynamic("enableRowHeader")(enableRowHeader)
    if (!js.isUndefined(enableRowReordering)) __obj.updateDynamic("enableRowReordering")(enableRowReordering)
    if (!js.isUndefined(enableRowResizing)) __obj.updateDynamic("enableRowResizing")(enableRowResizing)
    if (focusedCell != null) __obj.updateDynamic("focusedCell")(focusedCell)
    if (!js.isUndefined(forceRerenderOnSelectionChange)) __obj.updateDynamic("forceRerenderOnSelectionChange")(forceRerenderOnSelectionChange)
    if (getCellClipboardData != null) __obj.updateDynamic("getCellClipboardData")(js.Any.fromFunction2(getCellClipboardData))
    if (loadingOptions != null) __obj.updateDynamic("loadingOptions")(loadingOptions)
    if (maxColumnWidth != null) __obj.updateDynamic("maxColumnWidth")(maxColumnWidth.asInstanceOf[js.Any])
    if (maxRowHeight != null) __obj.updateDynamic("maxRowHeight")(maxRowHeight.asInstanceOf[js.Any])
    if (minColumnWidth != null) __obj.updateDynamic("minColumnWidth")(minColumnWidth.asInstanceOf[js.Any])
    if (minRowHeight != null) __obj.updateDynamic("minRowHeight")(minRowHeight.asInstanceOf[js.Any])
    if (numFrozenColumns != null) __obj.updateDynamic("numFrozenColumns")(numFrozenColumns.asInstanceOf[js.Any])
    if (numFrozenRows != null) __obj.updateDynamic("numFrozenRows")(numFrozenRows.asInstanceOf[js.Any])
    if (numRows != null) __obj.updateDynamic("numRows")(numRows.asInstanceOf[js.Any])
    if (onColumnWidthChanged != null) __obj.updateDynamic("onColumnWidthChanged")(onColumnWidthChanged)
    if (onColumnsReordered != null) __obj.updateDynamic("onColumnsReordered")(js.Any.fromFunction3(onColumnsReordered))
    if (onCompleteRender != null) __obj.updateDynamic("onCompleteRender")(js.Any.fromFunction0(onCompleteRender))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onFocusedCell != null) __obj.updateDynamic("onFocusedCell")(js.Any.fromFunction1(onFocusedCell))
    if (onRowHeightChanged != null) __obj.updateDynamic("onRowHeightChanged")(onRowHeightChanged)
    if (onRowsReordered != null) __obj.updateDynamic("onRowsReordered")(js.Any.fromFunction3(onRowsReordered))
    if (onSelection != null) __obj.updateDynamic("onSelection")(js.Any.fromFunction1(onSelection))
    if (onVisibleCellsChange != null) __obj.updateDynamic("onVisibleCellsChange")(js.Any.fromFunction2(onVisibleCellsChange))
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode)
    if (rowHeaderCellRenderer != null) __obj.updateDynamic("rowHeaderCellRenderer")(rowHeaderCellRenderer)
    if (rowHeights != null) __obj.updateDynamic("rowHeights")(rowHeights)
    if (selectedRegionTransform != null) __obj.updateDynamic("selectedRegionTransform")(selectedRegionTransform)
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions)
    if (selectionModes != null) __obj.updateDynamic("selectionModes")(selectionModes)
    if (styledRegionGroups != null) __obj.updateDynamic("styledRegionGroups")(styledRegionGroups)
    __obj.asInstanceOf[ITableProps]
  }
}

