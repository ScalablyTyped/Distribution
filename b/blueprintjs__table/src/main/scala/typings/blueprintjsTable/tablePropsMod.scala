package typings.blueprintjsTable

import typings.blueprintjsTable.cellMod.CellRenderer
import typings.blueprintjsTable.cellTypesMod.FocusedCellCoordinates
import typings.blueprintjsTable.dragTypesMod.ICoordinateData
import typings.blueprintjsTable.esmRegionsMod.Region
import typings.blueprintjsTable.esmRegionsMod.RegionCardinality
import typings.blueprintjsTable.esmRegionsMod.StyledRegionGroup
import typings.blueprintjsTable.esmRegionsMod.TableLoadingOption
import typings.blueprintjsTable.gridMod.ColumnIndices
import typings.blueprintjsTable.gridMod.RowIndices
import typings.blueprintjsTable.menuContextMod.IContextMenuRenderer
import typings.blueprintjsTable.menuContextMod.IMenuContext
import typings.blueprintjsTable.renderModeMod.RenderMode
import typings.blueprintjsTable.resizableMod.IIndexedResizeCallback
import typings.blueprintjsTable.rowHeaderMod.RowHeaderRenderer
import typings.blueprintjsTable.selectableMod.ISelectedRegionTransform
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tablePropsMod {
  
  /* Inlined parent @blueprintjs/core.@blueprintjs/core.Props */
  /* Inlined parent std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/headers/rowHeader.IRowHeights> */
  /* Inlined parent std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/headers/columnHeader.IColumnWidths> */
  trait ITableProps extends StObject {
    
    /**
      * An optional callback for displaying a context menu when right-clicking
      * on the table body. The callback is supplied with an array of
      * `Region`s. If the mouse click was on a selection, the array will
      * contain all selected regions. Otherwise it will have one `Region` that
      * represents the clicked cell.
      */
    var bodyContextMenuRenderer: js.UndefOr[IContextMenuRenderer] = js.undefined
    
    /**
      * The children of a `Table` component, which must be React elements
      * that use `IColumnProps`.
      */
    var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.undefined
    
    /** A space-delimited list of class names to pass along to a child element. */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * A sparse number array with a length equal to the number of columns. Any
      * non-null value will be used to set the width of the column at the same
      * index. Note that if you want to update these values when the user
      * drag-resizes a column, you may define a callback for `onColumnWidthChanged`.
      */
    var columnWidths: js.UndefOr[js.Array[js.UndefOr[Double | Null]]] = js.undefined
    
    var defaultColumnWidth: js.UndefOr[Double] = js.undefined
    
    var defaultRowHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * If `false`, hides the column headers.
      *
      * @default true
      */
    var enableColumnHeader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, adds an interaction bar on top of all column header cells, and
      * moves interaction triggers into it.
      *
      * @default false
      */
    var enableColumnInteractionBar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false`, disables reordering of columns.
      *
      * @default false
      */
    var enableColumnReordering: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false`, disables resizing of columns.
      *
      * @default true
      */
    var enableColumnResizing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, there will be a single "focused" cell at all times,
      * which can be used to interact with the table as though it is a
      * spreadsheet. When false, no such cell will exist.
      *
      * @default false
      */
    var enableFocusedCell: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, empty space in the table container will be filled with empty
      * cells instead of a blank background.
      *
      * @default false
      */
    var enableGhostCells: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false`, only a single region of a single column/row/cell may be
      * selected at one time. Using `ctrl` or `meta` key will have no effect,
      * and a mouse drag will select the current column/row/cell only.
      *
      * @default true
      */
    var enableMultipleSelection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false`, hides the row headers and settings menu.
      *
      * @default true
      */
    var enableRowHeader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false`, disables reordering of rows.
      *
      * @default false
      */
    var enableRowReordering: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false`, disables resizing of rows.
      *
      * @default true
      */
    var enableRowResizing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If defined, will set the focused cell state. This changes
      * the focused cell to controlled mode, meaning you are in charge of
      * setting the focus in response to events in the `onFocusedCell` callback.
      */
    var focusedCell: js.UndefOr[FocusedCellCoordinates] = js.undefined
    
    /**
      * If `true`, selection state changes will cause the component to re-render.
      * If `false`, selection state is ignored when deciding to re-render.
      *
      * @default false
      */
    var forceRerenderOnSelectionChange: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If defined, this callback will be invoked for each cell when the user
      * attempts to copy a selection via `mod+c`. The returned data will be copied
      * to the clipboard and need not match the display value of the `<Cell>`.
      * The data will be invisibly added as `textContent` into the DOM before
      * copying. If not defined, a default implementation will be used that
      * turns the rendered cell elements into strings using 'react-innertext'.
      *
      * @param row the row index coordinate of the cell to get data for
      * @param col the col index coordinate of the cell to get data for
      * @param cellRenderer the cell renderer for this row, col coordinate in the table
      */
    var getCellClipboardData: js.UndefOr[
        js.Function3[/* row */ Double, /* col */ Double, /* celRenderer */ CellRenderer, Any]
      ] = js.undefined
    
    /**
      * A list of `TableLoadingOption`. Set this prop to specify whether to
      * render the loading state for the column header, row header, and body
      * sections of the table.
      */
    var loadingOptions: js.UndefOr[js.Array[TableLoadingOption]] = js.undefined
    
    var maxColumnWidth: js.UndefOr[Double] = js.undefined
    
    var maxRowHeight: js.UndefOr[Double] = js.undefined
    
    var minColumnWidth: js.UndefOr[Double] = js.undefined
    
    var minRowHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of columns to freeze to the left side of the table, counting
      * from the leftmost column.
      *
      * @default 0
      */
    var numFrozenColumns: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of rows to freeze to the top of the table, counting from the
      * topmost row.
      *
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
    var onFocusedCell: js.UndefOr[js.Function1[/* focusedCell */ FocusedCellCoordinates, Unit]] = js.undefined
    
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
    var onSelection: js.UndefOr[js.Function1[/* selectedRegions */ js.Array[Region], Unit]] = js.undefined
    
    /**
      * A callback called when the visible cell indices change in the table.
      */
    var onVisibleCellsChange: js.UndefOr[
        js.Function2[/* rowIndices */ RowIndices, /* columnIndices */ ColumnIndices, Unit]
      ] = js.undefined
    
    /**
      * Dictates how cells should be rendered. Supported modes are:
      * - `RenderMode.BATCH`: renders cells in batches to improve performance
      * - `RenderMode.BATCH_ON_UPDATE`: renders cells synchronously on mount and
      *   in batches on update
      * - `RenderMode.NONE`: renders cells synchronously all at once
      *
      * @default RenderMode.BATCH_ON_UPDATE
      */
    var renderMode: js.UndefOr[RenderMode] = js.undefined
    
    /**
      * Render each row's header cell.
      */
    var rowHeaderCellRenderer: js.UndefOr[RowHeaderRenderer] = js.undefined
    
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
    var selectedRegions: js.UndefOr[js.Array[Region]] = js.undefined
    
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
    var styledRegionGroups: js.UndefOr[js.Array[StyledRegionGroup]] = js.undefined
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
      
      inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColumnWidths(value: js.Array[js.UndefOr[Double | Null]]): Self = StObject.set(x, "columnWidths", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthsUndefined: Self = StObject.set(x, "columnWidths", js.undefined)
      
      inline def setColumnWidthsVarargs(value: (js.UndefOr[Double | Null])*): Self = StObject.set(x, "columnWidths", js.Array(value*))
      
      inline def setDefaultColumnWidth(value: Double): Self = StObject.set(x, "defaultColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setDefaultColumnWidthUndefined: Self = StObject.set(x, "defaultColumnWidth", js.undefined)
      
      inline def setDefaultRowHeight(value: Double): Self = StObject.set(x, "defaultRowHeight", value.asInstanceOf[js.Any])
      
      inline def setDefaultRowHeightUndefined: Self = StObject.set(x, "defaultRowHeight", js.undefined)
      
      inline def setEnableColumnHeader(value: Boolean): Self = StObject.set(x, "enableColumnHeader", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnHeaderUndefined: Self = StObject.set(x, "enableColumnHeader", js.undefined)
      
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
      
      inline def setFocusedCell(value: FocusedCellCoordinates): Self = StObject.set(x, "focusedCell", value.asInstanceOf[js.Any])
      
      inline def setFocusedCellUndefined: Self = StObject.set(x, "focusedCell", js.undefined)
      
      inline def setForceRerenderOnSelectionChange(value: Boolean): Self = StObject.set(x, "forceRerenderOnSelectionChange", value.asInstanceOf[js.Any])
      
      inline def setForceRerenderOnSelectionChangeUndefined: Self = StObject.set(x, "forceRerenderOnSelectionChange", js.undefined)
      
      inline def setGetCellClipboardData(value: (/* row */ Double, /* col */ Double, /* celRenderer */ CellRenderer) => Any): Self = StObject.set(x, "getCellClipboardData", js.Any.fromFunction3(value))
      
      inline def setGetCellClipboardDataUndefined: Self = StObject.set(x, "getCellClipboardData", js.undefined)
      
      inline def setLoadingOptions(value: js.Array[TableLoadingOption]): Self = StObject.set(x, "loadingOptions", value.asInstanceOf[js.Any])
      
      inline def setLoadingOptionsUndefined: Self = StObject.set(x, "loadingOptions", js.undefined)
      
      inline def setLoadingOptionsVarargs(value: TableLoadingOption*): Self = StObject.set(x, "loadingOptions", js.Array(value*))
      
      inline def setMaxColumnWidth(value: Double): Self = StObject.set(x, "maxColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxColumnWidthUndefined: Self = StObject.set(x, "maxColumnWidth", js.undefined)
      
      inline def setMaxRowHeight(value: Double): Self = StObject.set(x, "maxRowHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxRowHeightUndefined: Self = StObject.set(x, "maxRowHeight", js.undefined)
      
      inline def setMinColumnWidth(value: Double): Self = StObject.set(x, "minColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMinColumnWidthUndefined: Self = StObject.set(x, "minColumnWidth", js.undefined)
      
      inline def setMinRowHeight(value: Double): Self = StObject.set(x, "minRowHeight", value.asInstanceOf[js.Any])
      
      inline def setMinRowHeightUndefined: Self = StObject.set(x, "minRowHeight", js.undefined)
      
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
      
      inline def setOnFocusedCell(value: /* focusedCell */ FocusedCellCoordinates => Unit): Self = StObject.set(x, "onFocusedCell", js.Any.fromFunction1(value))
      
      inline def setOnFocusedCellUndefined: Self = StObject.set(x, "onFocusedCell", js.undefined)
      
      inline def setOnRowHeightChanged(value: (/* index */ Double, /* size */ Double) => Unit): Self = StObject.set(x, "onRowHeightChanged", js.Any.fromFunction2(value))
      
      inline def setOnRowHeightChangedUndefined: Self = StObject.set(x, "onRowHeightChanged", js.undefined)
      
      inline def setOnRowsReordered(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit): Self = StObject.set(x, "onRowsReordered", js.Any.fromFunction3(value))
      
      inline def setOnRowsReorderedUndefined: Self = StObject.set(x, "onRowsReordered", js.undefined)
      
      inline def setOnSelection(value: /* selectedRegions */ js.Array[Region] => Unit): Self = StObject.set(x, "onSelection", js.Any.fromFunction1(value))
      
      inline def setOnSelectionUndefined: Self = StObject.set(x, "onSelection", js.undefined)
      
      inline def setOnVisibleCellsChange(value: (/* rowIndices */ RowIndices, /* columnIndices */ ColumnIndices) => Unit): Self = StObject.set(x, "onVisibleCellsChange", js.Any.fromFunction2(value))
      
      inline def setOnVisibleCellsChangeUndefined: Self = StObject.set(x, "onVisibleCellsChange", js.undefined)
      
      inline def setRenderMode(value: RenderMode): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
      
      inline def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
      
      inline def setRowHeaderCellRenderer(value: /* rowIndex */ Double => ReactElement): Self = StObject.set(x, "rowHeaderCellRenderer", js.Any.fromFunction1(value))
      
      inline def setRowHeaderCellRendererUndefined: Self = StObject.set(x, "rowHeaderCellRenderer", js.undefined)
      
      inline def setRowHeights(value: js.Array[js.UndefOr[Double | Null]]): Self = StObject.set(x, "rowHeights", value.asInstanceOf[js.Any])
      
      inline def setRowHeightsUndefined: Self = StObject.set(x, "rowHeights", js.undefined)
      
      inline def setRowHeightsVarargs(value: (js.UndefOr[Double | Null])*): Self = StObject.set(x, "rowHeights", js.Array(value*))
      
      inline def setSelectedRegionTransform(
        value: (/* region */ Region, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => Region
      ): Self = StObject.set(x, "selectedRegionTransform", js.Any.fromFunction3(value))
      
      inline def setSelectedRegionTransformUndefined: Self = StObject.set(x, "selectedRegionTransform", js.undefined)
      
      inline def setSelectedRegions(value: js.Array[Region]): Self = StObject.set(x, "selectedRegions", value.asInstanceOf[js.Any])
      
      inline def setSelectedRegionsUndefined: Self = StObject.set(x, "selectedRegions", js.undefined)
      
      inline def setSelectedRegionsVarargs(value: Region*): Self = StObject.set(x, "selectedRegions", js.Array(value*))
      
      inline def setSelectionModes(value: js.Array[RegionCardinality]): Self = StObject.set(x, "selectionModes", value.asInstanceOf[js.Any])
      
      inline def setSelectionModesUndefined: Self = StObject.set(x, "selectionModes", js.undefined)
      
      inline def setSelectionModesVarargs(value: RegionCardinality*): Self = StObject.set(x, "selectionModes", js.Array(value*))
      
      inline def setStyledRegionGroups(value: js.Array[StyledRegionGroup]): Self = StObject.set(x, "styledRegionGroups", value.asInstanceOf[js.Any])
      
      inline def setStyledRegionGroupsUndefined: Self = StObject.set(x, "styledRegionGroups", js.undefined)
      
      inline def setStyledRegionGroupsVarargs(value: StyledRegionGroup*): Self = StObject.set(x, "styledRegionGroups", js.Array(value*))
    }
  }
  
  type TableProps = ITableProps
  
  /* Inlined std.Required<std.Pick<@blueprintjs/table.@blueprintjs/table/lib/esm/tableProps.TableProps, 'defaultColumnWidth' | 'defaultRowHeight' | 'enableColumnInteractionBar' | 'enableFocusedCell' | 'enableGhostCells' | 'enableMultipleSelection' | 'enableRowHeader' | 'forceRerenderOnSelectionChange' | 'getCellClipboardData' | 'loadingOptions' | 'maxColumnWidth' | 'maxRowHeight' | 'minColumnWidth' | 'minRowHeight' | 'numFrozenColumns' | 'numFrozenRows' | 'numRows' | 'renderMode' | 'rowHeaderCellRenderer' | 'selectionModes' | 'enableColumnHeader'>> */
  trait TablePropsDefaults extends StObject {
    
    var defaultColumnWidth: Double
    
    var defaultRowHeight: Double
    
    var enableColumnHeader: Boolean
    
    var enableColumnInteractionBar: Boolean
    
    var enableFocusedCell: Boolean
    
    var enableGhostCells: Boolean
    
    var enableMultipleSelection: Boolean
    
    var enableRowHeader: Boolean
    
    var forceRerenderOnSelectionChange: Boolean
    
    var getCellClipboardData: js.Function3[/* row */ Double, /* col */ Double, /* celRenderer */ CellRenderer, Any]
    
    var loadingOptions: js.Array[TableLoadingOption]
    
    var maxColumnWidth: Double
    
    var maxRowHeight: Double
    
    var minColumnWidth: Double
    
    var minRowHeight: Double
    
    var numFrozenColumns: Double
    
    var numFrozenRows: Double
    
    var numRows: Double
    
    var renderMode: RenderMode
    
    var rowHeaderCellRenderer: RowHeaderRenderer
    
    var selectionModes: js.Array[RegionCardinality]
  }
  object TablePropsDefaults {
    
    inline def apply(
      defaultColumnWidth: Double,
      defaultRowHeight: Double,
      enableColumnHeader: Boolean,
      enableColumnInteractionBar: Boolean,
      enableFocusedCell: Boolean,
      enableGhostCells: Boolean,
      enableMultipleSelection: Boolean,
      enableRowHeader: Boolean,
      forceRerenderOnSelectionChange: Boolean,
      getCellClipboardData: (/* row */ Double, /* col */ Double, /* celRenderer */ CellRenderer) => Any,
      loadingOptions: js.Array[TableLoadingOption],
      maxColumnWidth: Double,
      maxRowHeight: Double,
      minColumnWidth: Double,
      minRowHeight: Double,
      numFrozenColumns: Double,
      numFrozenRows: Double,
      numRows: Double,
      renderMode: RenderMode,
      rowHeaderCellRenderer: /* rowIndex */ Double => ReactElement,
      selectionModes: js.Array[RegionCardinality]
    ): TablePropsDefaults = {
      val __obj = js.Dynamic.literal(defaultColumnWidth = defaultColumnWidth.asInstanceOf[js.Any], defaultRowHeight = defaultRowHeight.asInstanceOf[js.Any], enableColumnHeader = enableColumnHeader.asInstanceOf[js.Any], enableColumnInteractionBar = enableColumnInteractionBar.asInstanceOf[js.Any], enableFocusedCell = enableFocusedCell.asInstanceOf[js.Any], enableGhostCells = enableGhostCells.asInstanceOf[js.Any], enableMultipleSelection = enableMultipleSelection.asInstanceOf[js.Any], enableRowHeader = enableRowHeader.asInstanceOf[js.Any], forceRerenderOnSelectionChange = forceRerenderOnSelectionChange.asInstanceOf[js.Any], getCellClipboardData = js.Any.fromFunction3(getCellClipboardData), loadingOptions = loadingOptions.asInstanceOf[js.Any], maxColumnWidth = maxColumnWidth.asInstanceOf[js.Any], maxRowHeight = maxRowHeight.asInstanceOf[js.Any], minColumnWidth = minColumnWidth.asInstanceOf[js.Any], minRowHeight = minRowHeight.asInstanceOf[js.Any], numFrozenColumns = numFrozenColumns.asInstanceOf[js.Any], numFrozenRows = numFrozenRows.asInstanceOf[js.Any], numRows = numRows.asInstanceOf[js.Any], renderMode = renderMode.asInstanceOf[js.Any], rowHeaderCellRenderer = js.Any.fromFunction1(rowHeaderCellRenderer), selectionModes = selectionModes.asInstanceOf[js.Any])
      __obj.asInstanceOf[TablePropsDefaults]
    }
    
    extension [Self <: TablePropsDefaults](x: Self) {
      
      inline def setDefaultColumnWidth(value: Double): Self = StObject.set(x, "defaultColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setDefaultRowHeight(value: Double): Self = StObject.set(x, "defaultRowHeight", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnHeader(value: Boolean): Self = StObject.set(x, "enableColumnHeader", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnInteractionBar(value: Boolean): Self = StObject.set(x, "enableColumnInteractionBar", value.asInstanceOf[js.Any])
      
      inline def setEnableFocusedCell(value: Boolean): Self = StObject.set(x, "enableFocusedCell", value.asInstanceOf[js.Any])
      
      inline def setEnableGhostCells(value: Boolean): Self = StObject.set(x, "enableGhostCells", value.asInstanceOf[js.Any])
      
      inline def setEnableMultipleSelection(value: Boolean): Self = StObject.set(x, "enableMultipleSelection", value.asInstanceOf[js.Any])
      
      inline def setEnableRowHeader(value: Boolean): Self = StObject.set(x, "enableRowHeader", value.asInstanceOf[js.Any])
      
      inline def setForceRerenderOnSelectionChange(value: Boolean): Self = StObject.set(x, "forceRerenderOnSelectionChange", value.asInstanceOf[js.Any])
      
      inline def setGetCellClipboardData(value: (/* row */ Double, /* col */ Double, /* celRenderer */ CellRenderer) => Any): Self = StObject.set(x, "getCellClipboardData", js.Any.fromFunction3(value))
      
      inline def setLoadingOptions(value: js.Array[TableLoadingOption]): Self = StObject.set(x, "loadingOptions", value.asInstanceOf[js.Any])
      
      inline def setLoadingOptionsVarargs(value: TableLoadingOption*): Self = StObject.set(x, "loadingOptions", js.Array(value*))
      
      inline def setMaxColumnWidth(value: Double): Self = StObject.set(x, "maxColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxRowHeight(value: Double): Self = StObject.set(x, "maxRowHeight", value.asInstanceOf[js.Any])
      
      inline def setMinColumnWidth(value: Double): Self = StObject.set(x, "minColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMinRowHeight(value: Double): Self = StObject.set(x, "minRowHeight", value.asInstanceOf[js.Any])
      
      inline def setNumFrozenColumns(value: Double): Self = StObject.set(x, "numFrozenColumns", value.asInstanceOf[js.Any])
      
      inline def setNumFrozenRows(value: Double): Self = StObject.set(x, "numFrozenRows", value.asInstanceOf[js.Any])
      
      inline def setNumRows(value: Double): Self = StObject.set(x, "numRows", value.asInstanceOf[js.Any])
      
      inline def setRenderMode(value: RenderMode): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
      
      inline def setRowHeaderCellRenderer(value: /* rowIndex */ Double => ReactElement): Self = StObject.set(x, "rowHeaderCellRenderer", js.Any.fromFunction1(value))
      
      inline def setSelectionModes(value: js.Array[RegionCardinality]): Self = StObject.set(x, "selectionModes", value.asInstanceOf[js.Any])
      
      inline def setSelectionModesVarargs(value: RegionCardinality*): Self = StObject.set(x, "selectionModes", js.Array(value*))
    }
  }
  
  /* Inlined std.Omit<@blueprintjs/table.@blueprintjs/table/lib/esm/tableProps.TableProps, keyof @blueprintjs/table.@blueprintjs/table/lib/esm/tableProps.TablePropsDefaults> & @blueprintjs/table.@blueprintjs/table/lib/esm/tableProps.TablePropsDefaults */
  trait TablePropsWithDefaults extends StObject {
    
    var bodyContextMenuRenderer: js.UndefOr[IContextMenuRenderer] = js.undefined
    
    var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var columnWidths: js.UndefOr[js.Array[js.UndefOr[Double | Null]]] = js.undefined
    
    var defaultColumnWidth: Double
    
    var defaultRowHeight: Double
    
    var enableColumnHeader: Boolean
    
    var enableColumnInteractionBar: Boolean
    
    var enableColumnReordering: js.UndefOr[Boolean] = js.undefined
    
    var enableColumnResizing: js.UndefOr[Boolean] = js.undefined
    
    var enableFocusedCell: Boolean
    
    var enableGhostCells: Boolean
    
    var enableMultipleSelection: Boolean
    
    var enableRowHeader: Boolean
    
    var enableRowReordering: js.UndefOr[Boolean] = js.undefined
    
    var enableRowResizing: js.UndefOr[Boolean] = js.undefined
    
    var focusedCell: js.UndefOr[FocusedCellCoordinates] = js.undefined
    
    var forceRerenderOnSelectionChange: Boolean
    
    var getCellClipboardData: js.Function3[/* row */ Double, /* col */ Double, /* celRenderer */ CellRenderer, Any]
    
    var loadingOptions: js.Array[TableLoadingOption]
    
    var maxColumnWidth: Double
    
    var maxRowHeight: Double
    
    var minColumnWidth: Double
    
    var minRowHeight: Double
    
    var numFrozenColumns: Double
    
    var numFrozenRows: Double
    
    var numRows: Double
    
    var onColumnWidthChanged: js.UndefOr[IIndexedResizeCallback] = js.undefined
    
    var onColumnsReordered: js.UndefOr[
        js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit]
      ] = js.undefined
    
    var onCompleteRender: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onCopy: js.UndefOr[js.Function1[/* success */ Boolean, Unit]] = js.undefined
    
    var onFocusedCell: js.UndefOr[js.Function1[/* focusedCell */ FocusedCellCoordinates, Unit]] = js.undefined
    
    var onRowHeightChanged: js.UndefOr[IIndexedResizeCallback] = js.undefined
    
    var onRowsReordered: js.UndefOr[
        js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit]
      ] = js.undefined
    
    var onSelection: js.UndefOr[js.Function1[/* selectedRegions */ js.Array[Region], Unit]] = js.undefined
    
    var onVisibleCellsChange: js.UndefOr[
        js.Function2[/* rowIndices */ RowIndices, /* columnIndices */ ColumnIndices, Unit]
      ] = js.undefined
    
    var renderMode: RenderMode
    
    var rowHeaderCellRenderer: RowHeaderRenderer
    
    var rowHeights: js.UndefOr[js.Array[js.UndefOr[Double | Null]]] = js.undefined
    
    var selectedRegionTransform: js.UndefOr[ISelectedRegionTransform] = js.undefined
    
    var selectedRegions: js.UndefOr[js.Array[Region]] = js.undefined
    
    var selectionModes: js.Array[RegionCardinality]
    
    var styledRegionGroups: js.UndefOr[js.Array[StyledRegionGroup]] = js.undefined
  }
  object TablePropsWithDefaults {
    
    inline def apply(
      defaultColumnWidth: Double,
      defaultRowHeight: Double,
      enableColumnHeader: Boolean,
      enableColumnInteractionBar: Boolean,
      enableFocusedCell: Boolean,
      enableGhostCells: Boolean,
      enableMultipleSelection: Boolean,
      enableRowHeader: Boolean,
      forceRerenderOnSelectionChange: Boolean,
      getCellClipboardData: (/* row */ Double, /* col */ Double, /* celRenderer */ CellRenderer) => Any,
      loadingOptions: js.Array[TableLoadingOption],
      maxColumnWidth: Double,
      maxRowHeight: Double,
      minColumnWidth: Double,
      minRowHeight: Double,
      numFrozenColumns: Double,
      numFrozenRows: Double,
      numRows: Double,
      renderMode: RenderMode,
      rowHeaderCellRenderer: /* rowIndex */ Double => ReactElement,
      selectionModes: js.Array[RegionCardinality]
    ): TablePropsWithDefaults = {
      val __obj = js.Dynamic.literal(defaultColumnWidth = defaultColumnWidth.asInstanceOf[js.Any], defaultRowHeight = defaultRowHeight.asInstanceOf[js.Any], enableColumnHeader = enableColumnHeader.asInstanceOf[js.Any], enableColumnInteractionBar = enableColumnInteractionBar.asInstanceOf[js.Any], enableFocusedCell = enableFocusedCell.asInstanceOf[js.Any], enableGhostCells = enableGhostCells.asInstanceOf[js.Any], enableMultipleSelection = enableMultipleSelection.asInstanceOf[js.Any], enableRowHeader = enableRowHeader.asInstanceOf[js.Any], forceRerenderOnSelectionChange = forceRerenderOnSelectionChange.asInstanceOf[js.Any], getCellClipboardData = js.Any.fromFunction3(getCellClipboardData), loadingOptions = loadingOptions.asInstanceOf[js.Any], maxColumnWidth = maxColumnWidth.asInstanceOf[js.Any], maxRowHeight = maxRowHeight.asInstanceOf[js.Any], minColumnWidth = minColumnWidth.asInstanceOf[js.Any], minRowHeight = minRowHeight.asInstanceOf[js.Any], numFrozenColumns = numFrozenColumns.asInstanceOf[js.Any], numFrozenRows = numFrozenRows.asInstanceOf[js.Any], numRows = numRows.asInstanceOf[js.Any], renderMode = renderMode.asInstanceOf[js.Any], rowHeaderCellRenderer = js.Any.fromFunction1(rowHeaderCellRenderer), selectionModes = selectionModes.asInstanceOf[js.Any])
      __obj.asInstanceOf[TablePropsWithDefaults]
    }
    
    extension [Self <: TablePropsWithDefaults](x: Self) {
      
      inline def setBodyContextMenuRenderer(value: /* context */ IMenuContext => Element): Self = StObject.set(x, "bodyContextMenuRenderer", js.Any.fromFunction1(value))
      
      inline def setBodyContextMenuRendererUndefined: Self = StObject.set(x, "bodyContextMenuRenderer", js.undefined)
      
      inline def setChildren(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColumnWidths(value: js.Array[js.UndefOr[Double | Null]]): Self = StObject.set(x, "columnWidths", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthsUndefined: Self = StObject.set(x, "columnWidths", js.undefined)
      
      inline def setColumnWidthsVarargs(value: (js.UndefOr[Double | Null])*): Self = StObject.set(x, "columnWidths", js.Array(value*))
      
      inline def setDefaultColumnWidth(value: Double): Self = StObject.set(x, "defaultColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setDefaultRowHeight(value: Double): Self = StObject.set(x, "defaultRowHeight", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnHeader(value: Boolean): Self = StObject.set(x, "enableColumnHeader", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnInteractionBar(value: Boolean): Self = StObject.set(x, "enableColumnInteractionBar", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnReordering(value: Boolean): Self = StObject.set(x, "enableColumnReordering", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnReorderingUndefined: Self = StObject.set(x, "enableColumnReordering", js.undefined)
      
      inline def setEnableColumnResizing(value: Boolean): Self = StObject.set(x, "enableColumnResizing", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnResizingUndefined: Self = StObject.set(x, "enableColumnResizing", js.undefined)
      
      inline def setEnableFocusedCell(value: Boolean): Self = StObject.set(x, "enableFocusedCell", value.asInstanceOf[js.Any])
      
      inline def setEnableGhostCells(value: Boolean): Self = StObject.set(x, "enableGhostCells", value.asInstanceOf[js.Any])
      
      inline def setEnableMultipleSelection(value: Boolean): Self = StObject.set(x, "enableMultipleSelection", value.asInstanceOf[js.Any])
      
      inline def setEnableRowHeader(value: Boolean): Self = StObject.set(x, "enableRowHeader", value.asInstanceOf[js.Any])
      
      inline def setEnableRowReordering(value: Boolean): Self = StObject.set(x, "enableRowReordering", value.asInstanceOf[js.Any])
      
      inline def setEnableRowReorderingUndefined: Self = StObject.set(x, "enableRowReordering", js.undefined)
      
      inline def setEnableRowResizing(value: Boolean): Self = StObject.set(x, "enableRowResizing", value.asInstanceOf[js.Any])
      
      inline def setEnableRowResizingUndefined: Self = StObject.set(x, "enableRowResizing", js.undefined)
      
      inline def setFocusedCell(value: FocusedCellCoordinates): Self = StObject.set(x, "focusedCell", value.asInstanceOf[js.Any])
      
      inline def setFocusedCellUndefined: Self = StObject.set(x, "focusedCell", js.undefined)
      
      inline def setForceRerenderOnSelectionChange(value: Boolean): Self = StObject.set(x, "forceRerenderOnSelectionChange", value.asInstanceOf[js.Any])
      
      inline def setGetCellClipboardData(value: (/* row */ Double, /* col */ Double, /* celRenderer */ CellRenderer) => Any): Self = StObject.set(x, "getCellClipboardData", js.Any.fromFunction3(value))
      
      inline def setLoadingOptions(value: js.Array[TableLoadingOption]): Self = StObject.set(x, "loadingOptions", value.asInstanceOf[js.Any])
      
      inline def setLoadingOptionsVarargs(value: TableLoadingOption*): Self = StObject.set(x, "loadingOptions", js.Array(value*))
      
      inline def setMaxColumnWidth(value: Double): Self = StObject.set(x, "maxColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxRowHeight(value: Double): Self = StObject.set(x, "maxRowHeight", value.asInstanceOf[js.Any])
      
      inline def setMinColumnWidth(value: Double): Self = StObject.set(x, "minColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMinRowHeight(value: Double): Self = StObject.set(x, "minRowHeight", value.asInstanceOf[js.Any])
      
      inline def setNumFrozenColumns(value: Double): Self = StObject.set(x, "numFrozenColumns", value.asInstanceOf[js.Any])
      
      inline def setNumFrozenRows(value: Double): Self = StObject.set(x, "numFrozenRows", value.asInstanceOf[js.Any])
      
      inline def setNumRows(value: Double): Self = StObject.set(x, "numRows", value.asInstanceOf[js.Any])
      
      inline def setOnColumnWidthChanged(value: (/* index */ Double, /* size */ Double) => Unit): Self = StObject.set(x, "onColumnWidthChanged", js.Any.fromFunction2(value))
      
      inline def setOnColumnWidthChangedUndefined: Self = StObject.set(x, "onColumnWidthChanged", js.undefined)
      
      inline def setOnColumnsReordered(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit): Self = StObject.set(x, "onColumnsReordered", js.Any.fromFunction3(value))
      
      inline def setOnColumnsReorderedUndefined: Self = StObject.set(x, "onColumnsReordered", js.undefined)
      
      inline def setOnCompleteRender(value: () => Unit): Self = StObject.set(x, "onCompleteRender", js.Any.fromFunction0(value))
      
      inline def setOnCompleteRenderUndefined: Self = StObject.set(x, "onCompleteRender", js.undefined)
      
      inline def setOnCopy(value: /* success */ Boolean => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnFocusedCell(value: /* focusedCell */ FocusedCellCoordinates => Unit): Self = StObject.set(x, "onFocusedCell", js.Any.fromFunction1(value))
      
      inline def setOnFocusedCellUndefined: Self = StObject.set(x, "onFocusedCell", js.undefined)
      
      inline def setOnRowHeightChanged(value: (/* index */ Double, /* size */ Double) => Unit): Self = StObject.set(x, "onRowHeightChanged", js.Any.fromFunction2(value))
      
      inline def setOnRowHeightChangedUndefined: Self = StObject.set(x, "onRowHeightChanged", js.undefined)
      
      inline def setOnRowsReordered(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit): Self = StObject.set(x, "onRowsReordered", js.Any.fromFunction3(value))
      
      inline def setOnRowsReorderedUndefined: Self = StObject.set(x, "onRowsReordered", js.undefined)
      
      inline def setOnSelection(value: /* selectedRegions */ js.Array[Region] => Unit): Self = StObject.set(x, "onSelection", js.Any.fromFunction1(value))
      
      inline def setOnSelectionUndefined: Self = StObject.set(x, "onSelection", js.undefined)
      
      inline def setOnVisibleCellsChange(value: (/* rowIndices */ RowIndices, /* columnIndices */ ColumnIndices) => Unit): Self = StObject.set(x, "onVisibleCellsChange", js.Any.fromFunction2(value))
      
      inline def setOnVisibleCellsChangeUndefined: Self = StObject.set(x, "onVisibleCellsChange", js.undefined)
      
      inline def setRenderMode(value: RenderMode): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
      
      inline def setRowHeaderCellRenderer(value: /* rowIndex */ Double => ReactElement): Self = StObject.set(x, "rowHeaderCellRenderer", js.Any.fromFunction1(value))
      
      inline def setRowHeights(value: js.Array[js.UndefOr[Double | Null]]): Self = StObject.set(x, "rowHeights", value.asInstanceOf[js.Any])
      
      inline def setRowHeightsUndefined: Self = StObject.set(x, "rowHeights", js.undefined)
      
      inline def setRowHeightsVarargs(value: (js.UndefOr[Double | Null])*): Self = StObject.set(x, "rowHeights", js.Array(value*))
      
      inline def setSelectedRegionTransform(
        value: (/* region */ Region, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => Region
      ): Self = StObject.set(x, "selectedRegionTransform", js.Any.fromFunction3(value))
      
      inline def setSelectedRegionTransformUndefined: Self = StObject.set(x, "selectedRegionTransform", js.undefined)
      
      inline def setSelectedRegions(value: js.Array[Region]): Self = StObject.set(x, "selectedRegions", value.asInstanceOf[js.Any])
      
      inline def setSelectedRegionsUndefined: Self = StObject.set(x, "selectedRegions", js.undefined)
      
      inline def setSelectedRegionsVarargs(value: Region*): Self = StObject.set(x, "selectedRegions", js.Array(value*))
      
      inline def setSelectionModes(value: js.Array[RegionCardinality]): Self = StObject.set(x, "selectionModes", value.asInstanceOf[js.Any])
      
      inline def setSelectionModesVarargs(value: RegionCardinality*): Self = StObject.set(x, "selectionModes", js.Array(value*))
      
      inline def setStyledRegionGroups(value: js.Array[StyledRegionGroup]): Self = StObject.set(x, "styledRegionGroups", value.asInstanceOf[js.Any])
      
      inline def setStyledRegionGroupsUndefined: Self = StObject.set(x, "styledRegionGroups", js.undefined)
      
      inline def setStyledRegionGroupsVarargs(value: StyledRegionGroup*): Self = StObject.set(x, "styledRegionGroups", js.Array(value*))
    }
  }
}
