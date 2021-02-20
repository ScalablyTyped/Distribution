package typings.blueprintjsTable

import typings.blueprintjsTable.anon.ChildrenArray
import typings.blueprintjsTable.anon.Col
import typings.blueprintjsTable.anon.PartialIDragSelectablePro
import typings.blueprintjsTable.anon.PreventDefault
import typings.blueprintjsTable.anon.Truncated
import typings.blueprintjsTable.anon.ValidationMapIColumnInter
import typings.blueprintjsTable.cellMod.ICellProps
import typings.blueprintjsTable.columnHeaderCellMod.IColumnHeaderCellProps
import typings.blueprintjsTable.columnMod.IColumnProps
import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.copyCellsMenuItemMod.ICopyCellsMenuItemProps
import typings.blueprintjsTable.draggableMod.IDraggableProps
import typings.blueprintjsTable.editableCellMod.IEditableCellProps
import typings.blueprintjsTable.editableNameMod.IEditableNameProps
import typings.blueprintjsTable.esmRegionsMod.ICellCoordinate
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.blueprintjsTable.esmRegionsMod.IStyledRegionGroup
import typings.blueprintjsTable.esmRegionsMod.RegionCardinality
import typings.blueprintjsTable.jsonFormatMod.IJSONFormatProps
import typings.blueprintjsTable.rectMod.AnyRect
import typings.blueprintjsTable.resizeHandleMod.IResizeHandleProps
import typings.blueprintjsTable.rowHeaderCellMod.IRowHeaderCellProps
import typings.blueprintjsTable.selectableMod.IDragSelectableProps
import typings.blueprintjsTable.tableMod.ITableProps
import typings.blueprintjsTable.tableMod.ITableState
import typings.blueprintjsTable.truncatedFormatMod.ITruncatedFormatProps
import typings.react.mod.CSSProperties
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TextMetrics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@blueprintjs/table", "Cell")
  @js.native
  class Cell protected ()
    extends typings.blueprintjsTable.cellMod.Cell {
    def this(props: ICellProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ICellProps, context: js.Any) = this()
  }
  /* static members */
  object Cell {
    
    @JSImport("@blueprintjs/table", "Cell")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table", "Cell.defaultProps")
    @js.native
    def defaultProps: Truncated = js.native
    @scala.inline
    def defaultProps_=(x: Truncated): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "Cell.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  object Clipboard {
    
    /**
      * Overrides the inherited CSS of the element to make sure it is
      * selectable. This method also makes the element pseudo-invisible.
      */
    @JSImport("@blueprintjs/table", "Clipboard.applySelectableStyles")
    @js.native
    def applySelectableStyles(elem: HTMLElement): HTMLElement = js.native
    
    /**
      * Copies table cells to the clipboard. The parameter is a row-major
      * 2-dimensional `Array` of strings and can contain nulls. We assume all
      * rows are the same length. If not, the cells will still be copied, but
      * the columns may not align. Returns a boolean indicating whether the
      * copy succeeded.
      *
      * See `Clipboard.copy`
      */
    @JSImport("@blueprintjs/table", "Clipboard.copyCells")
    @js.native
    def copyCells(cells: js.Array[js.Array[String]]): Boolean = js.native
    
    /**
      * Copies the element and its children to the clipboard. Returns a boolean
      * indicating whether the copy succeeded.
      *
      * If a plaintext argument is supplied, we add both the text/html and
      * text/plain mime types to the clipboard. This preserves the built in
      * semantics of copying elements to the clipboard while allowing custom
      * plaintext output for programs that can't cope with HTML data in the
      * clipboard.
      *
      * Verified on Firefox 47, Chrome 51.
      *
      * Note: Sometimes the copy does not succeed. Presumably, in order to
      * prevent memory issues, browsers will limit the total amount of data you
      * can copy to the clipboard. Based on ad hoc testing, we found an
      * inconsistent limit at about 300KB or 40,000 cells. Depending on the on
      * the content of cells, your limits may vary.
      */
    @JSImport("@blueprintjs/table", "Clipboard.copyElement")
    @js.native
    def copyElement(elem: HTMLElement): Boolean = js.native
    @JSImport("@blueprintjs/table", "Clipboard.copyElement")
    @js.native
    def copyElement(elem: HTMLElement, plaintext: String): Boolean = js.native
    
    /**
      * Copies the text to the clipboard. Returns a boolean
      * indicating whether the copy succeeded.
      *
      * See `Clipboard.copy`
      */
    @JSImport("@blueprintjs/table", "Clipboard.copyString")
    @js.native
    def copyString(value: String): Boolean = js.native
    
    /**
      * Returns a boolean indicating whether the current browser nominally
      * supports the `copy` operation using the `execCommand` API.
      */
    @JSImport("@blueprintjs/table", "Clipboard.isCopySupported")
    @js.native
    def isCopySupported(): Boolean = js.native
  }
  
  @JSImport("@blueprintjs/table", "Column")
  @js.native
  class Column protected ()
    extends typings.blueprintjsTable.columnMod.Column {
    def this(props: IColumnProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IColumnProps, context: js.Any) = this()
  }
  /* static members */
  object Column {
    
    @JSImport("@blueprintjs/table", "Column")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table", "Column.defaultProps")
    @js.native
    def defaultProps: IColumnProps = js.native
    @scala.inline
    def defaultProps_=(x: IColumnProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "Column.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/table", "ColumnHeaderCell")
  @js.native
  class ColumnHeaderCell protected ()
    extends typings.blueprintjsTable.columnHeaderCellMod.ColumnHeaderCell {
    def this(props: IColumnHeaderCellProps) = this()
    def this(props: IColumnHeaderCellProps, context: js.Any) = this()
  }
  /* static members */
  object ColumnHeaderCell {
    
    @JSImport("@blueprintjs/table", "ColumnHeaderCell")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table", "ColumnHeaderCell.contextTypes")
    @js.native
    def contextTypes: ValidationMapIColumnInter = js.native
    @scala.inline
    def contextTypes_=(x: ValidationMapIColumnInter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "ColumnHeaderCell.defaultProps")
    @js.native
    def defaultProps: IColumnHeaderCellProps = js.native
    @scala.inline
    def defaultProps_=(x: IColumnHeaderCellProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    /**
      * This method determines if a `MouseEvent` was triggered on a target that
      * should be used as the header click/drag target. This enables users of
      * this component to render fully interactive components in their header
      * cells without worry of selection or resize operations from capturing
      * their mouse events.
      */
    @JSImport("@blueprintjs/table", "ColumnHeaderCell.isHeaderMouseTarget")
    @js.native
    def isHeaderMouseTarget(target: HTMLElement): Boolean = js.native
  }
  
  @JSImport("@blueprintjs/table", "ColumnLoadingOption")
  @js.native
  object ColumnLoadingOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.blueprintjsTable.esmRegionsMod.ColumnLoadingOption with String] = js.native
    
    /* "cells" */ val CELLS: typings.blueprintjsTable.esmRegionsMod.ColumnLoadingOption.CELLS with String = js.native
    
    /* "column-header" */ val HEADER: typings.blueprintjsTable.esmRegionsMod.ColumnLoadingOption.HEADER with String = js.native
  }
  
  @JSImport("@blueprintjs/table", "CopyCellsMenuItem")
  @js.native
  class CopyCellsMenuItem protected ()
    extends typings.blueprintjsTable.menusMod.CopyCellsMenuItem {
    def this(props: ICopyCellsMenuItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ICopyCellsMenuItemProps, context: js.Any) = this()
  }
  
  @JSImport("@blueprintjs/table", "DragSelectable")
  @js.native
  class DragSelectable protected ()
    extends typings.blueprintjsTable.selectableMod.DragSelectable {
    def this(props: IDragSelectableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IDragSelectableProps, context: js.Any) = this()
  }
  /* static members */
  object DragSelectable {
    
    @JSImport("@blueprintjs/table", "DragSelectable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table", "DragSelectable.defaultProps")
    @js.native
    def defaultProps: PartialIDragSelectablePro = js.native
    @scala.inline
    def defaultProps_=(x: PartialIDragSelectablePro): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/table", "Draggable")
  @js.native
  class Draggable protected ()
    extends typings.blueprintjsTable.draggableMod.Draggable {
    def this(props: IDraggableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IDraggableProps, context: js.Any) = this()
  }
  /* static members */
  object Draggable {
    
    @JSImport("@blueprintjs/table", "Draggable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table", "Draggable.defaultProps")
    @js.native
    def defaultProps: PreventDefault = js.native
    @scala.inline
    def defaultProps_=(x: PreventDefault): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/table", "EditableCell")
  @js.native
  class EditableCell protected ()
    extends typings.blueprintjsTable.editableCellMod.EditableCell {
    def this(props: IEditableCellProps) = this()
    def this(props: IEditableCellProps, context: js.Any) = this()
  }
  /* static members */
  object EditableCell {
    
    @JSImport("@blueprintjs/table", "EditableCell")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table", "EditableCell.defaultProps")
    @js.native
    def defaultProps: Truncated = js.native
    @scala.inline
    def defaultProps_=(x: Truncated): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "EditableCell.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/table", "EditableName")
  @js.native
  class EditableName protected ()
    extends typings.blueprintjsTable.editableNameMod.EditableName {
    def this(props: IEditableNameProps) = this()
    def this(props: IEditableNameProps, context: js.Any) = this()
  }
  
  @JSImport("@blueprintjs/table", "Grid")
  @js.native
  class Grid protected ()
    extends typings.blueprintjsTable.commonMod.Grid {
    /**
      * This constructor accumulates the heights and widths in `O(n)`, saving
      * time in later calculations.
      *
      * @param bleed - The number of rows/cols that we expand beyond the
      *     viewport (on all sides). This helps avoid displaying an empty
      *     viewport when the user scrolls quickly.
      */
    def this(rowHeights: js.Array[Double], columnWidths: js.Array[Double]) = this()
    def this(rowHeights: js.Array[Double], columnWidths: js.Array[Double], bleed: Double) = this()
    def this(
      rowHeights: js.Array[Double],
      columnWidths: js.Array[Double],
      bleed: js.UndefOr[scala.Nothing],
      ghostHeight: Double
    ) = this()
    def this(rowHeights: js.Array[Double], columnWidths: js.Array[Double], bleed: Double, ghostHeight: Double) = this()
    def this(
      rowHeights: js.Array[Double],
      columnWidths: js.Array[Double],
      bleed: js.UndefOr[scala.Nothing],
      ghostHeight: js.UndefOr[scala.Nothing],
      ghostWidth: Double
    ) = this()
    def this(
      rowHeights: js.Array[Double],
      columnWidths: js.Array[Double],
      bleed: js.UndefOr[scala.Nothing],
      ghostHeight: Double,
      ghostWidth: Double
    ) = this()
    def this(
      rowHeights: js.Array[Double],
      columnWidths: js.Array[Double],
      bleed: Double,
      ghostHeight: js.UndefOr[scala.Nothing],
      ghostWidth: Double
    ) = this()
    def this(
      rowHeights: js.Array[Double],
      columnWidths: js.Array[Double],
      bleed: Double,
      ghostHeight: Double,
      ghostWidth: Double
    ) = this()
  }
  /* static members */
  object Grid {
    
    @JSImport("@blueprintjs/table", "Grid")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table", "Grid.DEFAULT_BLEED")
    @js.native
    def DEFAULT_BLEED: Double = js.native
    @scala.inline
    def DEFAULT_BLEED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_BLEED")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "Grid.DEFAULT_GHOST_HEIGHT")
    @js.native
    def DEFAULT_GHOST_HEIGHT: Double = js.native
    @scala.inline
    def DEFAULT_GHOST_HEIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_GHOST_HEIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "Grid.DEFAULT_GHOST_WIDTH")
    @js.native
    def DEFAULT_GHOST_WIDTH: Double = js.native
    @scala.inline
    def DEFAULT_GHOST_WIDTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_GHOST_WIDTH")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "Grid.DEFAULT_MAX_COLUMNS")
    @js.native
    def DEFAULT_MAX_COLUMNS: Double = js.native
    @scala.inline
    def DEFAULT_MAX_COLUMNS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAX_COLUMNS")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "Grid.DEFAULT_MAX_ROWS")
    @js.native
    def DEFAULT_MAX_ROWS: Double = js.native
    @scala.inline
    def DEFAULT_MAX_ROWS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAX_ROWS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/table", "HorizontalCellDivider")
  @js.native
  def HorizontalCellDivider(): Element = js.native
  
  @JSImport("@blueprintjs/table", "JSONFormat")
  @js.native
  class JSONFormat protected ()
    extends typings.blueprintjsTable.jsonFormatMod.JSONFormat {
    def this(props: IJSONFormatProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IJSONFormatProps, context: js.Any) = this()
  }
  /* static members */
  object JSONFormat {
    
    @JSImport("@blueprintjs/table", "JSONFormat")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table", "JSONFormat.defaultProps")
    @js.native
    def defaultProps: IJSONFormatProps = js.native
    @scala.inline
    def defaultProps_=(x: IJSONFormatProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "JSONFormat.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/table", "Orientation")
  @js.native
  object Orientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.blueprintjsTable.resizeHandleMod.Orientation with Double] = js.native
    
    /* 1 */ val HORIZONTAL: typings.blueprintjsTable.resizeHandleMod.Orientation.HORIZONTAL with Double = js.native
    
    /* 0 */ val VERTICAL: typings.blueprintjsTable.resizeHandleMod.Orientation.VERTICAL with Double = js.native
  }
  
  @JSImport("@blueprintjs/table", "Rect")
  @js.native
  class Rect protected ()
    extends typings.blueprintjsTable.commonMod.Rect {
    def this(left: Double, top: Double, width: Double, height: Double) = this()
  }
  /* static members */
  object Rect {
    
    @JSImport("@blueprintjs/table", "Rect")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table", "Rect.ORIGIN")
    @js.native
    def ORIGIN: typings.blueprintjsTable.rectMod.Rect = js.native
    @scala.inline
    def ORIGIN_=(x: typings.blueprintjsTable.rectMod.Rect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORIGIN")(x.asInstanceOf[js.Any])
    
    /**
      * Returns the CSS properties representing the absolute positioning of
      * this Rect.
      */
    @JSImport("@blueprintjs/table", "Rect.style")
    @js.native
    def style(rect: AnyRect): CSSProperties = js.native
    
    /**
      * Returns a new Rect that subtracts the origin of the second argument
      * from the first.
      */
    @JSImport("@blueprintjs/table", "Rect.subtractOrigin")
    @js.native
    def subtractOrigin(anyRect0: AnyRect, anyRect1: AnyRect): typings.blueprintjsTable.rectMod.Rect = js.native
    
    /**
      * Returns the smallest Rect that entirely contains the supplied rects
      */
    @JSImport("@blueprintjs/table", "Rect.union")
    @js.native
    def union(anyRect0: AnyRect, anyRect1: AnyRect): typings.blueprintjsTable.rectMod.Rect = js.native
    
    /**
      * Given a ClientRect or Rect object, returns a Rect object.
      */
    @JSImport("@blueprintjs/table", "Rect.wrap")
    @js.native
    def wrap(rect: AnyRect): typings.blueprintjsTable.rectMod.Rect = js.native
  }
  
  @JSImport("@blueprintjs/table", "RegionCardinality")
  @js.native
  object RegionCardinality extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.blueprintjsTable.esmRegionsMod.RegionCardinality with String] = js.native
    
    /* "cells" */ val CELLS: typings.blueprintjsTable.esmRegionsMod.RegionCardinality.CELLS with String = js.native
    
    /* "full-columns" */ val FULL_COLUMNS: typings.blueprintjsTable.esmRegionsMod.RegionCardinality.FULL_COLUMNS with String = js.native
    
    /* "full-rows" */ val FULL_ROWS: typings.blueprintjsTable.esmRegionsMod.RegionCardinality.FULL_ROWS with String = js.native
    
    /* "full-table" */ val FULL_TABLE: typings.blueprintjsTable.esmRegionsMod.RegionCardinality.FULL_TABLE with String = js.native
  }
  
  @JSImport("@blueprintjs/table", "Regions")
  @js.native
  class Regions ()
    extends typings.blueprintjsTable.esmRegionsMod.Regions
  /* static members */
  object Regions {
    
    @JSImport("@blueprintjs/table", "Regions")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Adds the region to the end of a cloned copy of the supplied region
      * array.
      */
    @JSImport("@blueprintjs/table", "Regions.add")
    @js.native
    def add(regions: js.Array[IRegion], region: IRegion): js.Array[IRegion] = js.native
    
    /**
      * Returns a region containing one or more cells.
      */
    @JSImport("@blueprintjs/table", "Regions.cell")
    @js.native
    def cell(row: Double, col: Double): IRegion = js.native
    @JSImport("@blueprintjs/table", "Regions.cell")
    @js.native
    def cell(row: Double, col: Double, row2: js.UndefOr[scala.Nothing], col2: Double): IRegion = js.native
    @JSImport("@blueprintjs/table", "Regions.cell")
    @js.native
    def cell(row: Double, col: Double, row2: Double): IRegion = js.native
    @JSImport("@blueprintjs/table", "Regions.cell")
    @js.native
    def cell(row: Double, col: Double, row2: Double, col2: Double): IRegion = js.native
    
    /**
      * Clamps the region's start and end indices between 0 and the provided
      * maximum values.
      */
    @JSImport("@blueprintjs/table", "Regions.clampRegion")
    @js.native
    def clampRegion(region: IRegion, maxRowIndex: Double, maxColumnIndex: Double): IRegion = js.native
    
    /**
      * Returns a region containing one or more full columns.
      */
    @JSImport("@blueprintjs/table", "Regions.column")
    @js.native
    def column(col: Double): IRegion = js.native
    @JSImport("@blueprintjs/table", "Regions.column")
    @js.native
    def column(col: Double, col2: Double): IRegion = js.native
    
    /**
      * Returns true if the regions fully contain the query region.
      */
    @JSImport("@blueprintjs/table", "Regions.containsRegion")
    @js.native
    def containsRegion(regions: js.Array[IRegion], query: IRegion): Boolean = js.native
    
    /**
      * Returns a deep copy of the provided region.
      */
    @JSImport("@blueprintjs/table", "Regions.copy")
    @js.native
    def copy(region: IRegion): IRegion = js.native
    
    /**
      * Iterates over the cells within an `IRegion`, invoking the callback with
      * each cell's coordinates.
      */
    @JSImport("@blueprintjs/table", "Regions.eachCellInRegion")
    @js.native
    def eachCellInRegion: js.Any = js.native
    @scala.inline
    def eachCellInRegion_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eachCellInRegion")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "Regions.eachUniqueFullColumn")
    @js.native
    def eachUniqueFullColumn(regions: js.Array[IRegion], iteratee: js.Function1[/* col */ Double, Unit]): Unit = js.native
    
    @JSImport("@blueprintjs/table", "Regions.eachUniqueFullRow")
    @js.native
    def eachUniqueFullRow(regions: js.Array[IRegion], iteratee: js.Function1[/* row */ Double, Unit]): Unit = js.native
    
    /**
      * Using the supplied array of non-contiguous `IRegion`s, this method
      * returns an ordered array of every unique cell that exists in those
      * regions.
      */
    @JSImport("@blueprintjs/table", "Regions.enumerateUniqueCells")
    @js.native
    def enumerateUniqueCells(regions: js.Array[IRegion], numRows: Double, numCols: Double): js.Array[ICellCoordinate] = js.native
    
    /**
      * Expands an old region to the minimal bounding region that also contains
      * the new region. If the regions have different cardinalities, then the new
      * region is returned. Useful for expanding a selected region on
      * shift+click, for instance.
      */
    @JSImport("@blueprintjs/table", "Regions.expandRegion")
    @js.native
    def expandRegion(oldRegion: IRegion, newRegion: IRegion): IRegion = js.native
    
    /**
      * Returns the index of the region that wholly contains the supplied
      * parameter. Returns -1 if no such region is found.
      */
    @JSImport("@blueprintjs/table", "Regions.findContainingRegion")
    @js.native
    def findContainingRegion(regions: js.Array[IRegion], region: IRegion): Double = js.native
    
    /**
      * Returns the index of the region that is equal to the supplied
      * parameter. Returns -1 if no such region is found.
      */
    @JSImport("@blueprintjs/table", "Regions.findMatchingRegion")
    @js.native
    def findMatchingRegion(regions: js.Array[IRegion], region: IRegion): Double = js.native
    
    /**
      * Returns the smallest single contiguous `IRegion` that contains all cells in the
      * supplied array.
      */
    @JSImport("@blueprintjs/table", "Regions.getBoundingRegion")
    @js.native
    def getBoundingRegion(cells: js.Array[ICellCoordinate]): IRegion = js.native
    
    /**
      * Using the supplied region, returns an "equivalent" region of
      * type CELLS that define the bounds of the given region
      */
    @JSImport("@blueprintjs/table", "Regions.getCellRegionFromRegion")
    @js.native
    def getCellRegionFromRegion(region: IRegion, numRows: Double, numCols: Double): IRegion = js.native
    
    @JSImport("@blueprintjs/table", "Regions.getFocusCellCoordinatesFromRegion")
    @js.native
    def getFocusCellCoordinatesFromRegion(region: IRegion): Col = js.native
    
    /**
      * Determines the cardinality of a region. We use null values to indicate
      * an unbounded interval. Therefore, an example of a region containing the
      * second and third columns would be:
      *
      * ```js
      * { rows: null, cols: [1, 2] }
      * ```
      *
      * In this case, this method would return `RegionCardinality.FULL_COLUMNS`.
      *
      * If both rows and columns are unbounded, then the region covers the
      * entire table. Therefore, a region like this:
      *
      * ```js
      * { rows: null, cols: null }
      * ```
      *
      * will return `RegionCardinality.FULL_TABLE`.
      *
      * An example of a region containing a single cell in the table would be:
      *
      * ```js
      * { rows: [5, 5], cols: [2, 2] }
      * ```
      *
      * In this case, this method would return `RegionCardinality.CELLS`.
      */
    @JSImport("@blueprintjs/table", "Regions.getRegionCardinality")
    @js.native
    def getRegionCardinality(region: IRegion): RegionCardinality = js.native
    
    /**
      * Returns true if the regions contain a region that has FULL_COLUMNS
      * cardinality and contains the specified column index.
      */
    @JSImport("@blueprintjs/table", "Regions.hasFullColumn")
    @js.native
    def hasFullColumn(regions: js.Array[IRegion], col: Double): Boolean = js.native
    
    /**
      * Returns true if the regions contain a region that has FULL_ROWS
      * cardinality and contains the specified row index.
      */
    @JSImport("@blueprintjs/table", "Regions.hasFullRow")
    @js.native
    def hasFullRow(regions: js.Array[IRegion], row: Double): Boolean = js.native
    
    /**
      * Returns true if the regions contain a region that has FULL_TABLE cardinality
      */
    @JSImport("@blueprintjs/table", "Regions.hasFullTable")
    @js.native
    def hasFullTable(regions: js.Array[IRegion]): Boolean = js.native
    
    @JSImport("@blueprintjs/table", "Regions.intervalContains")
    @js.native
    def intervalContains: js.Any = js.native
    
    @JSImport("@blueprintjs/table", "Regions.intervalContainsIndex")
    @js.native
    def intervalContainsIndex: js.Any = js.native
    @scala.inline
    def intervalContainsIndex_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalContainsIndex")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def intervalContains_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalContains")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "Regions.intervalOverlaps")
    @js.native
    def intervalOverlaps: js.Any = js.native
    @scala.inline
    def intervalOverlaps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalOverlaps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "Regions.intervalsEqual")
    @js.native
    def intervalsEqual: js.Any = js.native
    @scala.inline
    def intervalsEqual_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalsEqual")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "Regions.isRegionValidForTable")
    @js.native
    def isRegionValidForTable(region: IRegion, numRows: Double, numCols: Double): Boolean = js.native
    
    @JSImport("@blueprintjs/table", "Regions.isValid")
    @js.native
    def isValid(region: IRegion): Boolean = js.native
    
    @JSImport("@blueprintjs/table", "Regions.joinStyledRegionGroups")
    @js.native
    def joinStyledRegionGroups(
      selectedRegions: js.Array[IRegion],
      otherRegions: js.Array[IStyledRegionGroup],
      focusedCell: IFocusedCellCoordinates
    ): js.Array[IStyledRegionGroup] = js.native
    
    /**
      * Returns true iff the specified region is equal to the last region in
      * the region list. This allows us to avoid immediate additive re-selection.
      */
    @JSImport("@blueprintjs/table", "Regions.lastRegionIsEqual")
    @js.native
    def lastRegionIsEqual(regions: js.Array[IRegion], region: IRegion): Boolean = js.native
    
    @JSImport("@blueprintjs/table", "Regions.normalizeInterval")
    @js.native
    def normalizeInterval: js.Any = js.native
    @scala.inline
    def normalizeInterval_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normalizeInterval")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "Regions.numericalComparator")
    @js.native
    def numericalComparator: js.Any = js.native
    @scala.inline
    def numericalComparator_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("numericalComparator")(x.asInstanceOf[js.Any])
    
    /**
      * Returns true if the regions at least partially overlap the query region.
      */
    @JSImport("@blueprintjs/table", "Regions.overlapsRegion")
    @js.native
    def overlapsRegion(regions: js.Array[IRegion], query: IRegion): Boolean = js.native
    @JSImport("@blueprintjs/table", "Regions.overlapsRegion")
    @js.native
    def overlapsRegion(regions: js.Array[IRegion], query: IRegion, allowPartialOverlap: Boolean): Boolean = js.native
    
    @JSImport("@blueprintjs/table", "Regions.regionContains")
    @js.native
    def regionContains: js.Any = js.native
    @scala.inline
    def regionContains_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regionContains")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "Regions.regionsEqual")
    @js.native
    def regionsEqual(regionA: IRegion, regionB: IRegion): Boolean = js.native
    
    /**
      * Returns a region containing one or more full rows.
      */
    @JSImport("@blueprintjs/table", "Regions.row")
    @js.native
    def row(row: Double): IRegion = js.native
    @JSImport("@blueprintjs/table", "Regions.row")
    @js.native
    def row(row: Double, row2: Double): IRegion = js.native
    
    @JSImport("@blueprintjs/table", "Regions.rowFirstComparator")
    @js.native
    def rowFirstComparator: js.Any = js.native
    @scala.inline
    def rowFirstComparator_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rowFirstComparator")(x.asInstanceOf[js.Any])
    
    /**
      * Maps a dense array of cell coordinates to a sparse 2-dimensional array
      * of cell values.
      *
      * We create a new 2-dimensional array representing the smallest single
      * contiguous `IRegion` that contains all cells in the supplied array. We
      * invoke the mapper callback only on the cells in the supplied coordinate
      * array and store the result. Returns the resulting 2-dimensional array.
      */
    @JSImport("@blueprintjs/table", "Regions.sparseMapCells")
    @js.native
    def sparseMapCells[T](cells: js.Array[ICellCoordinate], mapper: js.Function2[/* row */ Double, /* col */ Double, T]): js.Array[js.Array[T]] = js.native
    
    /**
      * Returns a region containing the entire table.
      */
    @JSImport("@blueprintjs/table", "Regions.table")
    @js.native
    def table(): IRegion = js.native
    
    /**
      * Replaces the region at the end of a cloned copy of the supplied region
      * array, or at the specific index if one is provided.
      */
    @JSImport("@blueprintjs/table", "Regions.update")
    @js.native
    def update(regions: js.Array[IRegion], region: IRegion): js.Array[IRegion] = js.native
    @JSImport("@blueprintjs/table", "Regions.update")
    @js.native
    def update(regions: js.Array[IRegion], region: IRegion, index: Double): js.Array[IRegion] = js.native
  }
  
  @JSImport("@blueprintjs/table", "RenderMode")
  @js.native
  object RenderMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.blueprintjsTable.renderModeMod.RenderMode with String] = js.native
    
    /* "batch" */ val BATCH: typings.blueprintjsTable.renderModeMod.RenderMode.BATCH with String = js.native
    
    /* "batch-on-update" */ val BATCH_ON_UPDATE: typings.blueprintjsTable.renderModeMod.RenderMode.BATCH_ON_UPDATE with String = js.native
    
    /* "none" */ val NONE: typings.blueprintjsTable.renderModeMod.RenderMode.NONE with String = js.native
  }
  
  @JSImport("@blueprintjs/table", "ResizeHandle")
  @js.native
  class ResizeHandle protected ()
    extends typings.blueprintjsTable.resizeHandleMod.ResizeHandle {
    def this(props: IResizeHandleProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IResizeHandleProps, context: js.Any) = this()
  }
  
  @JSImport("@blueprintjs/table", "RowHeaderCell")
  @js.native
  class RowHeaderCell protected ()
    extends typings.blueprintjsTable.rowHeaderCellMod.RowHeaderCell {
    def this(props: IRowHeaderCellProps) = this()
    def this(props: IRowHeaderCellProps, context: js.Any) = this()
  }
  
  @JSImport("@blueprintjs/table", "RowLoadingOption")
  @js.native
  object RowLoadingOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.blueprintjsTable.esmRegionsMod.RowLoadingOption with String] = js.native
    
    /* "cells" */ val CELLS: typings.blueprintjsTable.esmRegionsMod.RowLoadingOption.CELLS with String = js.native
    
    /* "row-header" */ val HEADER: typings.blueprintjsTable.esmRegionsMod.RowLoadingOption.HEADER with String = js.native
  }
  
  object SelectionModes {
    
    @JSImport("@blueprintjs/table", "SelectionModes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table", "SelectionModes.ALL")
    @js.native
    def ALL: js.Array[RegionCardinality] = js.native
    @scala.inline
    def ALL_=(x: js.Array[RegionCardinality]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "SelectionModes.COLUMNS_AND_CELLS")
    @js.native
    def COLUMNS_AND_CELLS: js.Array[RegionCardinality] = js.native
    @scala.inline
    def COLUMNS_AND_CELLS_=(x: js.Array[RegionCardinality]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMNS_AND_CELLS")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "SelectionModes.COLUMNS_ONLY")
    @js.native
    def COLUMNS_ONLY: js.Array[RegionCardinality] = js.native
    @scala.inline
    def COLUMNS_ONLY_=(x: js.Array[RegionCardinality]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMNS_ONLY")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "SelectionModes.NONE")
    @js.native
    def NONE: js.Array[RegionCardinality] = js.native
    @scala.inline
    def NONE_=(x: js.Array[RegionCardinality]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "SelectionModes.ROWS_AND_CELLS")
    @js.native
    def ROWS_AND_CELLS: js.Array[RegionCardinality] = js.native
    @scala.inline
    def ROWS_AND_CELLS_=(x: js.Array[RegionCardinality]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROWS_AND_CELLS")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "SelectionModes.ROWS_ONLY")
    @js.native
    def ROWS_ONLY: js.Array[RegionCardinality] = js.native
    @scala.inline
    def ROWS_ONLY_=(x: js.Array[RegionCardinality]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROWS_ONLY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/table", "Table")
  @js.native
  class Table protected ()
    extends typings.blueprintjsTable.tableMod.Table {
    def this(props: ITableProps) = this()
    def this(props: ITableProps, context: js.Any) = this()
  }
  /* static members */
  object Table {
    
    @JSImport("@blueprintjs/table", "Table")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table", "Table.SHALLOW_COMPARE_PROP_KEYS_DENYLIST")
    @js.native
    def SHALLOW_COMPARE_PROP_KEYS_DENYLIST: js.Any = js.native
    @scala.inline
    def SHALLOW_COMPARE_PROP_KEYS_DENYLIST_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHALLOW_COMPARE_PROP_KEYS_DENYLIST")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "Table.SHALLOW_COMPARE_STATE_KEYS_DENYLIST")
    @js.native
    def SHALLOW_COMPARE_STATE_KEYS_DENYLIST: js.Any = js.native
    @scala.inline
    def SHALLOW_COMPARE_STATE_KEYS_DENYLIST_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHALLOW_COMPARE_STATE_KEYS_DENYLIST")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "Table.childContextTypes")
    @js.native
    def childContextTypes: ValidationMapIColumnInter = js.native
    @scala.inline
    def childContextTypes_=(x: ValidationMapIColumnInter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "Table.createColumnIdIndex")
    @js.native
    def createColumnIdIndex: js.Any = js.native
    @scala.inline
    def createColumnIdIndex_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createColumnIdIndex")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "Table.defaultProps")
    @js.native
    def defaultProps: ITableProps = js.native
    @scala.inline
    def defaultProps_=(x: ITableProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "Table.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "Table.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: ITableProps, state: ITableState): ChildrenArray = js.native
    
    @JSImport("@blueprintjs/table", "Table.isSelectionModeEnabled")
    @js.native
    def isSelectionModeEnabled: js.Any = js.native
    @scala.inline
    def isSelectionModeEnabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSelectionModeEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "Table.resizeRowsByApproximateHeightDefaults")
    @js.native
    def resizeRowsByApproximateHeightDefaults: js.Any = js.native
    @scala.inline
    def resizeRowsByApproximateHeightDefaults_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resizeRowsByApproximateHeightDefaults")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/table", "TableLoadingOption")
  @js.native
  object TableLoadingOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.blueprintjsTable.esmRegionsMod.TableLoadingOption with String] = js.native
    
    /* "cells" */ val CELLS: typings.blueprintjsTable.esmRegionsMod.TableLoadingOption.CELLS with String = js.native
    
    /* "column-header" */ val COLUMN_HEADERS: typings.blueprintjsTable.esmRegionsMod.TableLoadingOption.COLUMN_HEADERS with String = js.native
    
    /* "row-header" */ val ROW_HEADERS: typings.blueprintjsTable.esmRegionsMod.TableLoadingOption.ROW_HEADERS with String = js.native
  }
  
  @JSImport("@blueprintjs/table", "TruncatedFormat")
  @js.native
  class TruncatedFormat protected ()
    extends typings.blueprintjsTable.truncatedFormatMod.TruncatedFormat {
    def this(props: ITruncatedFormatProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ITruncatedFormatProps, context: js.Any) = this()
  }
  /* static members */
  object TruncatedFormat {
    
    @JSImport("@blueprintjs/table", "TruncatedFormat")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table", "TruncatedFormat.defaultProps")
    @js.native
    def defaultProps: ITruncatedFormatProps = js.native
    @scala.inline
    def defaultProps_=(x: ITruncatedFormatProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table", "TruncatedFormat.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/table", "TruncatedPopoverMode")
  @js.native
  object TruncatedPopoverMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.blueprintjsTable.truncatedFormatMod.TruncatedPopoverMode with String] = js.native
    
    /* "always" */ val ALWAYS: typings.blueprintjsTable.truncatedFormatMod.TruncatedPopoverMode.ALWAYS with String = js.native
    
    /* "never" */ val NEVER: typings.blueprintjsTable.truncatedFormatMod.TruncatedPopoverMode.NEVER with String = js.native
    
    /* "when-truncated" */ val WHEN_TRUNCATED: typings.blueprintjsTable.truncatedFormatMod.TruncatedPopoverMode.WHEN_TRUNCATED with String = js.native
    
    /* "when-truncated-approx" */ val WHEN_TRUNCATED_APPROX: typings.blueprintjsTable.truncatedFormatMod.TruncatedPopoverMode.WHEN_TRUNCATED_APPROX with String = js.native
  }
  
  object Utils {
    
    /**
      * Takes an array of numbers, returns an array of numbers of the same length in which each
      * value is the sum of current and previous values in the input array.
      *
      * Example input:  [10, 20, 50]
      *         output: [10, 30, 80]
      */
    @JSImport("@blueprintjs/table", "Utils.accumulate")
    @js.native
    def accumulate(numbers: js.Array[Double]): js.Array[Double] = js.native
    
    /**
      * Returns a copy of the array that will have a length of the supplied parameter.
      * If the array is too long, it will be truncated. If it is too short, it will be
      * filled with the suppleid `fillValue` argument.
      *
      * @param array - the `Array` to copy and adjust
      * @param length - the target length of the array
      * @param fillValue - the value to add to the array if it is too short
      */
    @JSImport("@blueprintjs/table", "Utils.arrayOfLength")
    @js.native
    def arrayOfLength[T_1](array: js.Array[T_1], length: Double, fillValue: T_1): js.Array[T_1] = js.native
    
    /**
      * Takes in one full array of values and one sparse array of the same
      * length and type. Returns a copy of the `defaults` array, where each
      * value is replaced with the corresponding non-null value at the same
      * index in `sparseOverrides`.
      *
      * @param defaults - the full array of default values
      * @param sparseOverrides - the sparse array of override values
      */
    @JSImport("@blueprintjs/table", "Utils.assignSparseValues")
    @js.native
    def assignSparseValues[T_2](defaults: js.Array[T_2], sparseOverrides: js.Array[T_2]): js.Array[T_2] = js.native
    
    /**
      * Performs the binary search algorithm to find the index of the `value`
      * parameter in a sorted list of numbers. If `value` is not in the list, the
      * index where `value` can be inserted to maintain the sort is returned.
      *
      * Unlike a typical binary search implementation, we use a `lookup`
      * callback to access the sorted list of numbers instead of an array. This
      * avoids additional storage overhead.
      *
      * We use this to, for example, find the index of a row/col given its client
      * coordinate.
      *
      * Adapted from lodash https://github.com/lodash/lodash/blob/4.11.2/lodash.js#L3579
      *
      * @param value - the query value
      * @param high - the length of the sorted list of numbers
      * @param lookup - returns the number from the list at the supplied index
      */
    @JSImport("@blueprintjs/table", "Utils.binarySearch")
    @js.native
    def binarySearch(value: Double, high: Double, lookup: js.Function1[/* index */ Double, Double]): Double = js.native
    
    /**
      * Given a number, returns a value that is clamped within a
      * minimum/maximum bounded range. The minimum and maximum are optional. If
      * either is missing, that extrema limit is not applied.
      *
      * Assumes max >= min.
      */
    @JSImport("@blueprintjs/table", "Utils.clamp")
    @js.native
    def clamp(value: Double): Double = js.native
    @JSImport("@blueprintjs/table", "Utils.clamp")
    @js.native
    def clamp(value: Double, min: js.UndefOr[scala.Nothing], max: Double): Double = js.native
    @JSImport("@blueprintjs/table", "Utils.clamp")
    @js.native
    def clamp(value: Double, min: Double): Double = js.native
    @JSImport("@blueprintjs/table", "Utils.clamp")
    @js.native
    def clamp(value: Double, min: Double, max: Double): Double = js.native
    
    @JSImport("@blueprintjs/table", "Utils.getApproxCellHeight")
    @js.native
    def getApproxCellHeight(
      cellText: String,
      columnWidth: Double,
      approxCharWidth: Double,
      approxLineHeight: Double,
      horizontalPadding: Double,
      numBufferLines: Double
    ): Double = js.native
    
    /**
      * When reordering a contiguous block of rows or columns to a new index, we show a preview guide
      * at the absolute index in the original ordering but emit the new index in the reordered list.
      * This function converts an absolute "guide" index to a relative "reordered" index.
      *
      * Example: Say we want to move the first three columns two spots to the right. While we drag, a
      * vertical guide is shown to preview where we'll be dropping the columns. (In the following
      * ASCII art, `*` denotes a selected column, `·` denotes a cell border, and `|` denotes a
      * vertical guide).
      *
      *     Before mousedown:
      *     · 0 · 1 · 2 · 3 · 4 · 5 ·
      *       *   *   *
      *
      *     During mousemove two spots to the right:
      *     · 0 · 1 · 2 · 3 · 4 | 5 ·
      *       *   *   *
      *
      *     After mouseup:
      *     · 3 · 4 · 0 · 1 · 2 · 5 ·
      *               *   *   *
      *
      * Note that moving the three columns beyond index 4 effectively moves them two spots rightward.
      *
      * In this case, the inputs to this function would be:
      *     - oldIndex: 0 (the left-most index of the selected column range in the original ordering)
      *     - newIndex: 5 (the index on whose left boundary the guide appears in the original ordering)
      *     - length: 3 (the number of columns to move)
      *
      * The return value will then be 2, the left-most index of the columns in the new ordering.
      */
    @JSImport("@blueprintjs/table", "Utils.guideIndexToReorderedIndex")
    @js.native
    def guideIndexToReorderedIndex(oldIndex: Double, newIndex: Double, length: Double): Double = js.native
    
    /**
      * Returns true if the mouse event was triggered by the left mouse button.
      */
    @JSImport("@blueprintjs/table", "Utils.isLeftClick")
    @js.native
    def isLeftClick(event: MouseEvent): Boolean = js.native
    
    /**
      * Measures the bounds of supplied element's textContent.
      * We use the computed font from the supplied element and a non-DOM canvas
      * context to measure the text.
      */
    @JSImport("@blueprintjs/table", "Utils.measureElementTextContent")
    @js.native
    def measureElementTextContent(element: typings.std.Element): TextMetrics = js.native
    
    /**
      * Returns a copy of the provided array with the `length` contiguous elements starting at the
      * `from` index reordered to start at the `to` index.
      *
      * For example, given the array [A,B,C,D,E,F], reordering the 3 contiguous elements starting at
      * index 1 (B, C, and D) to start at index 2 would yield [A,E,B,C,D,F].
      */
    @JSImport("@blueprintjs/table", "Utils.reorderArray")
    @js.native
    def reorderArray[T_3](array: js.Array[T_3], from: Double, to: Double): js.Array[T_3] = js.native
    @JSImport("@blueprintjs/table", "Utils.reorderArray")
    @js.native
    def reorderArray[T_3](array: js.Array[T_3], from: Double, to: Double, length: Double): js.Array[T_3] = js.native
    
    /**
      * When reordering a contiguous block of rows or columns to a new index, we show a preview guide
      * at the absolute index in the original ordering but emit the new index in the reordered list.
      * This function converts a relative "reordered"" index to an absolute "guide" index.
      *
      * For the scenario in the example above, the inputs to this function would be:
      *     - oldIndex: 0 (the left-most index of the selected column range in the original ordering)
      *     - newIndex: 2 (the left-most index of the selected column range in the new ordering)
      *     - length: 3 (the number of columns to move)
      *
      * The return value will then be 5, the index on whose left boundary the guide should appear in
      * the original ordering.
      */
    @JSImport("@blueprintjs/table", "Utils.reorderedIndexToGuideIndex")
    @js.native
    def reorderedIndexToGuideIndex(oldIndex: Double, newIndex: Double, length: Double): Double = js.native
    
    /**
      * Invokes the callback `n` times, collecting the results in an array, which
      * is the return value. Similar to _.times
      */
    @JSImport("@blueprintjs/table", "Utils.times")
    @js.native
    def times[T](n: Double, callback: js.Function1[/* i */ Double, T]): js.Array[T] = js.native
    
    /**
      * Returns traditional spreadsheet-style column names
      * e.g. (A, B, ..., Z, AA, AB, ..., ZZ, AAA, AAB, ...).
      *
      * Note that this isn't technically mathematically equivalent to base 26 since
      * there is no zero element.
      */
    @JSImport("@blueprintjs/table", "Utils.toBase26Alpha")
    @js.native
    def toBase26Alpha(num: Double): String = js.native
    
    /**
      * Returns traditional spreadsheet-style cell names
      * e.g. (A1, B2, ..., Z44, AA1) with rows 1-indexed.
      */
    @JSImport("@blueprintjs/table", "Utils.toBase26CellName")
    @js.native
    def toBase26CellName(rowIndex: Double, columnIndex: Double): String = js.native
  }
}
