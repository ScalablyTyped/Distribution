package typings.blueprintjsTable

import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.blueprintjsTable.rectMod.Rect
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/grid", "Grid")
  @js.native
  class Grid protected () extends StObject {
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
    def this(rowHeights: js.Array[Double], columnWidths: js.Array[Double], bleed: Double, ghostHeight: Double) = this()
    def this(rowHeights: js.Array[Double], columnWidths: js.Array[Double], bleed: Unit, ghostHeight: Double) = this()
    def this(
      rowHeights: js.Array[Double],
      columnWidths: js.Array[Double],
      bleed: Double,
      ghostHeight: Double,
      ghostWidth: Double
    ) = this()
    def this(
      rowHeights: js.Array[Double],
      columnWidths: js.Array[Double],
      bleed: Double,
      ghostHeight: Unit,
      ghostWidth: Double
    ) = this()
    def this(
      rowHeights: js.Array[Double],
      columnWidths: js.Array[Double],
      bleed: Unit,
      ghostHeight: Double,
      ghostWidth: Double
    ) = this()
    def this(
      rowHeights: js.Array[Double],
      columnWidths: js.Array[Double],
      bleed: Unit,
      ghostHeight: Unit,
      ghostWidth: Double
    ) = this()
    
    /* private */ var bleed: js.Any = js.native
    
    /* private */ var columnWidths: js.Any = js.native
    
    /* private */ var cumulativeColumnWidths: js.Any = js.native
    
    /* private */ var cumulativeRowHeights: js.Any = js.native
    
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
    def getCellRect(rowIndex: Double, columnIndex: Double): Rect = js.native
    
    /**
      * Returns the start and end indices of columns that intersect with the
      * given `Rect` argument.
      */
    def getColumnIndicesInRect(rect: Rect): IColumnIndices = js.native
    def getColumnIndicesInRect(rect: Rect, includeGhostCells: Boolean): IColumnIndices = js.native
    def getColumnIndicesInRect(rect: Rect, includeGhostCells: Boolean, limit: Double): IColumnIndices = js.native
    def getColumnIndicesInRect(rect: Rect, includeGhostCells: Unit, limit: Double): IColumnIndices = js.native
    
    /**
      * Returns the `Rect` with the base coordinate and width of the specified column.
      */
    def getColumnRect(columnIndex: Double): Rect = js.native
    
    def getCumulativeHeightAt(index: Double): Double = js.native
    
    def getCumulativeHeightBefore(index: Double): Double = js.native
    
    def getCumulativeWidthAt(index: Double): Double = js.native
    
    def getCumulativeWidthBefore(index: Double): Double = js.native
    
    def getExtremaClasses(rowIndex: Double, columnIndex: Double, rowEnd: Double, columnEnd: Double): js.Array[String] = js.native
    
    /**
      * Returns the `Rect` bounds of a cell in scrollpane client space.
      *
      * If the cell is beyond the bounds of the user-defined table cells, it is
      * considered a "ghost" cell. If a width/height is not defined for that
      * row/column, we use the default width/height.
      */
    def getGhostCellRect(rowIndex: Double, columnIndex: Double): Rect = js.native
    
    /**
      * Returns the total width of the entire grid
      */
    def getHeight(): Double = js.native
    
    /* private */ var getIndicesInInterval: js.Any = js.native
    
    /**
      * Returns the `Rect` bounds of entire grid
      */
    def getRect(): Rect = js.native
    
    def getRegionStyle(region: IRegion): CSSProperties = js.native
    
    /**
      * Returns the start and end indices of rows that intersect with the given
      * `Rect` argument.
      */
    def getRowIndicesInRect(rect: Rect): IRowIndices = js.native
    def getRowIndicesInRect(rect: Rect, includeGhostCells: Boolean): IRowIndices = js.native
    def getRowIndicesInRect(rect: Rect, includeGhostCells: Boolean, limit: Double): IRowIndices = js.native
    def getRowIndicesInRect(rect: Rect, includeGhostCells: Unit, limit: Double): IRowIndices = js.native
    
    /**
      * Returns the `Rect` with the base coordinate and height of the specified row.
      */
    def getRowRect(rowIndex: Double): Rect = js.native
    
    /**
      * Returns the total width of the entire grid
      */
    def getWidth(): Double = js.native
    
    /* private */ var ghostHeight: js.Any = js.native
    
    /* private */ var ghostWidth: js.Any = js.native
    
    def isGhostColumn(columnIndex: Double): Boolean = js.native
    
    def isGhostIndex(rowIndex: Double, columnIndex: Double): Boolean = js.native
    
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
    def mapCellsInRect[T](rect: Rect, callback: ICellMapper[T]): js.Array[T] = js.native
    
    /**
      * Maps each column that intersects with the given `Rect` argument.
      *
      * See Grid.mapCellsInRect for more details.
      */
    def mapColumnsInRect[T](rect: Rect, callback: IColumnMapper[T]): js.Array[T] = js.native
    
    /**
      * Maps each row that intersects with the given `Rect` argument.
      *
      * See Grid.mapCellsInRect for more details.
      */
    def mapRowsInRect[T](rect: Rect, callback: IRowMapper[T]): js.Array[T] = js.native
    
    var numCols: Double = js.native
    
    var numRows: Double = js.native
    
    /* private */ var rowHeights: js.Any = js.native
  }
  /* static members */
  object Grid {
    
    @JSImport("@blueprintjs/table/lib/esm/common/grid", "Grid")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/common/grid", "Grid.DEFAULT_BLEED")
    @js.native
    def DEFAULT_BLEED: Double = js.native
    inline def DEFAULT_BLEED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_BLEED")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/common/grid", "Grid.DEFAULT_GHOST_HEIGHT")
    @js.native
    def DEFAULT_GHOST_HEIGHT: Double = js.native
    inline def DEFAULT_GHOST_HEIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_GHOST_HEIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/common/grid", "Grid.DEFAULT_GHOST_WIDTH")
    @js.native
    def DEFAULT_GHOST_WIDTH: Double = js.native
    inline def DEFAULT_GHOST_WIDTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_GHOST_WIDTH")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/common/grid", "Grid.DEFAULT_MAX_COLUMNS")
    @js.native
    def DEFAULT_MAX_COLUMNS: Double = js.native
    inline def DEFAULT_MAX_COLUMNS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAX_COLUMNS")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/common/grid", "Grid.DEFAULT_MAX_ROWS")
    @js.native
    def DEFAULT_MAX_ROWS: Double = js.native
    inline def DEFAULT_MAX_ROWS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAX_ROWS")(x.asInstanceOf[js.Any])
  }
  
  type ICellMapper[T] = js.Function2[/* rowIndex */ Double, /* columnIndex */ Double, T]
  
  trait IColumnIndices extends StObject {
    
    var columnIndexEnd: Double
    
    var columnIndexStart: Double
  }
  object IColumnIndices {
    
    inline def apply(columnIndexEnd: Double, columnIndexStart: Double): IColumnIndices = {
      val __obj = js.Dynamic.literal(columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColumnIndices]
    }
    
    extension [Self <: IColumnIndices](x: Self) {
      
      inline def setColumnIndexEnd(value: Double): Self = StObject.set(x, "columnIndexEnd", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexStart(value: Double): Self = StObject.set(x, "columnIndexStart", value.asInstanceOf[js.Any])
    }
  }
  
  type IColumnMapper[T] = js.Function1[/* columnIndex */ Double, T]
  
  trait IRowIndices extends StObject {
    
    var rowIndexEnd: Double
    
    var rowIndexStart: Double
  }
  object IRowIndices {
    
    inline def apply(rowIndexEnd: Double, rowIndexStart: Double): IRowIndices = {
      val __obj = js.Dynamic.literal(rowIndexEnd = rowIndexEnd.asInstanceOf[js.Any], rowIndexStart = rowIndexStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRowIndices]
    }
    
    extension [Self <: IRowIndices](x: Self) {
      
      inline def setRowIndexEnd(value: Double): Self = StObject.set(x, "rowIndexEnd", value.asInstanceOf[js.Any])
      
      inline def setRowIndexStart(value: Double): Self = StObject.set(x, "rowIndexStart", value.asInstanceOf[js.Any])
    }
  }
  
  type IRowMapper[T] = js.Function1[/* rowIndex */ Double, T]
}
