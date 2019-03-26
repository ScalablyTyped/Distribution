package typings
package atBlueprintjsTableLib.libEsmCommonGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/common/grid", "Grid")
@js.native
class Grid protected () extends js.Object {
  /**
    * This constructor accumulates the heights and widths in `O(n)`, saving
    * time in later calculations.
    *
    * @param bleed - The number of rows/cols that we expand beyond the
    *     viewport (on all sides). This helps avoid displaying an empty
    *     viewport when the user scrolls quickly.
    */
  def this(rowHeights: js.Array[scala.Double], columnWidths: js.Array[scala.Double]) = this()
  def this(rowHeights: js.Array[scala.Double], columnWidths: js.Array[scala.Double], bleed: scala.Double) = this()
  def this(rowHeights: js.Array[scala.Double], columnWidths: js.Array[scala.Double], bleed: scala.Double, ghostHeight: scala.Double) = this()
  def this(rowHeights: js.Array[scala.Double], columnWidths: js.Array[scala.Double], bleed: scala.Double, ghostHeight: scala.Double, ghostWidth: scala.Double) = this()
  var bleed: js.Any = js.native
  var columnWidths: js.Any = js.native
  var cumulativeColumnWidths: js.Any = js.native
  var cumulativeRowHeights: js.Any = js.native
  var ghostHeight: js.Any = js.native
  var ghostWidth: js.Any = js.native
  var numCols: scala.Double = js.native
  var numRows: scala.Double = js.native
  var rowHeights: js.Any = js.native
  /**
    * Returns the `Rect` bounds of a cell in scrollpane client space.
    *
    * Scrollpane client coordinate space uses the origin of the scrollpane
    * client (the inside part that you're moving around).
    *
    * For example, let's say you're scrolling around a block of 1000 x 1000
    * cells. Regardless where you've scrolled, the first cell is always at
    * 0,0 in scrollpane client space. the cell to the right of it is always
    * at, e.g., 100,0.
    */
  def getCellRect(rowIndex: scala.Double, columnIndex: scala.Double): atBlueprintjsTableLib.libEsmCommonRectMod.Rect = js.native
  /**
    * Returns the start and end indices of columns that intersect with the
    * given `Rect` argument.
    */
  def getColumnIndicesInRect(rect: atBlueprintjsTableLib.libEsmCommonRectMod.Rect): IColumnIndices = js.native
  def getColumnIndicesInRect(rect: atBlueprintjsTableLib.libEsmCommonRectMod.Rect, includeGhostCells: scala.Boolean): IColumnIndices = js.native
  def getColumnIndicesInRect(
    rect: atBlueprintjsTableLib.libEsmCommonRectMod.Rect,
    includeGhostCells: scala.Boolean,
    limit: scala.Double
  ): IColumnIndices = js.native
  /**
    * Returns the `Rect` with the base coordinate and width of the specified column.
    */
  def getColumnRect(columnIndex: scala.Double): atBlueprintjsTableLib.libEsmCommonRectMod.Rect = js.native
  def getCumulativeHeightAt(index: scala.Double): scala.Double = js.native
  def getCumulativeHeightBefore(index: scala.Double): scala.Double = js.native
  def getCumulativeWidthAt(index: scala.Double): scala.Double = js.native
  def getCumulativeWidthBefore(index: scala.Double): scala.Double = js.native
  def getExtremaClasses(rowIndex: scala.Double, columnIndex: scala.Double, rowEnd: scala.Double, columnEnd: scala.Double): js.Array[java.lang.String] = js.native
  /**
    * Returns the `Rect` bounds of a cell in scrollpane client space.
    *
    * If the cell is beyond the bounds of the user-defined table cells, it is
    * considered a "ghost" cell. If a width/height is not defined for that
    * row/column, we use the default width/height.
    */
  def getGhostCellRect(rowIndex: scala.Double, columnIndex: scala.Double): atBlueprintjsTableLib.libEsmCommonRectMod.Rect = js.native
  /**
    * Returns the total width of the entire grid
    */
  def getHeight(): scala.Double = js.native
  /* private */ def getIndicesInInterval(min: js.Any, max: js.Any, count: js.Any, useEndBleed: js.Any, lookup: js.Any): js.Any = js.native
  /**
    * Returns the `Rect` bounds of entire grid
    */
  def getRect(): atBlueprintjsTableLib.libEsmCommonRectMod.Rect = js.native
  def getRegionStyle(region: atBlueprintjsTableLib.libEsmRegionsMod.IRegion): reactLib.reactMod.ReactNs.CSSProperties = js.native
  /**
    * Returns the start and end indices of rows that intersect with the given
    * `Rect` argument.
    */
  def getRowIndicesInRect(rect: atBlueprintjsTableLib.libEsmCommonRectMod.Rect): IRowIndices = js.native
  def getRowIndicesInRect(rect: atBlueprintjsTableLib.libEsmCommonRectMod.Rect, includeGhostCells: scala.Boolean): IRowIndices = js.native
  def getRowIndicesInRect(
    rect: atBlueprintjsTableLib.libEsmCommonRectMod.Rect,
    includeGhostCells: scala.Boolean,
    limit: scala.Double
  ): IRowIndices = js.native
  /**
    * Returns the `Rect` with the base coordinate and height of the specified row.
    */
  def getRowRect(rowIndex: scala.Double): atBlueprintjsTableLib.libEsmCommonRectMod.Rect = js.native
  /**
    * Returns the total width of the entire grid
    */
  def getWidth(): scala.Double = js.native
  def isGhostColumn(columnIndex: scala.Double): scala.Boolean = js.native
  def isGhostIndex(rowIndex: scala.Double, columnIndex: scala.Double): scala.Boolean = js.native
  /**
    * Maps each cell that intersects with the given `Rect` argument. The
    * indices of iteration are extended in both directions by the integer
    * `bleed` class property, then are clamped between 0 and the number of
    * rows/columns.
    *
    * Uses a binary search for each of the 4 edges of the bounds, resulting
    * in a runtime of `O(log(rows) + log(cols))` plus the `O(irows * icols)`
    * iteration of intersecting cells.
    */
  def mapCellsInRect[T](rect: atBlueprintjsTableLib.libEsmCommonRectMod.Rect, callback: ICellMapper[T]): js.Array[T] = js.native
  /**
    * Maps each column that intersects with the given `Rect` argument.
    *
    * See Grid.mapCellsInRect for more details.
    */
  def mapColumnsInRect[T](rect: atBlueprintjsTableLib.libEsmCommonRectMod.Rect, callback: IColumnMapper[T]): js.Array[T] = js.native
  /**
    * Maps each row that intersects with the given `Rect` argument.
    *
    * See Grid.mapCellsInRect for more details.
    */
  def mapRowsInRect[T](rect: atBlueprintjsTableLib.libEsmCommonRectMod.Rect, callback: IRowMapper[T]): js.Array[T] = js.native
}

/* static members */
@JSImport("@blueprintjs/table/lib/esm/common/grid", "Grid")
@js.native
object Grid extends js.Object {
  var DEFAULT_BLEED: scala.Double = js.native
  var DEFAULT_GHOST_HEIGHT: scala.Double = js.native
  var DEFAULT_GHOST_WIDTH: scala.Double = js.native
  var DEFAULT_MAX_COLUMNS: scala.Double = js.native
  var DEFAULT_MAX_ROWS: scala.Double = js.native
}

