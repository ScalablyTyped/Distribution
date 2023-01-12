package typings.blueprintjsTable

import typings.blueprintjsTable.libEsmCommonRectMod.Rect
import typings.blueprintjsTable.libEsmRegionsMod.Region
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonGridMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/grid", "Grid")
  @js.native
  open class Grid protected () extends StObject {
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
    
    /* private */ var bleed: Any = js.native
    
    /* private */ var columnWidths: Any = js.native
    
    /* private */ var cumulativeColumnWidths: Any = js.native
    
    /* private */ var cumulativeRowHeights: Any = js.native
    
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
    def getColumnIndicesInRect(rect: Rect): ColumnIndices = js.native
    def getColumnIndicesInRect(rect: Rect, includeGhostCells: Boolean): ColumnIndices = js.native
    def getColumnIndicesInRect(rect: Rect, includeGhostCells: Boolean, limit: Double): ColumnIndices = js.native
    def getColumnIndicesInRect(rect: Rect, includeGhostCells: Unit, limit: Double): ColumnIndices = js.native
    
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
    
    /* private */ var getIndicesInInterval: Any = js.native
    
    /**
      * Returns the `Rect` bounds of entire grid
      */
    def getRect(): Rect = js.native
    
    def getRegionStyle(region: Region): CSSProperties = js.native
    
    /**
      * Returns the start and end indices of rows that intersect with the given
      * `Rect` argument.
      */
    def getRowIndicesInRect(options: GetRowIndicesInRectOptions): RowIndices = js.native
    
    /**
      * Returns the `Rect` with the base coordinate and height of the specified row.
      */
    def getRowRect(rowIndex: Double): Rect = js.native
    
    /**
      * Returns the total width of the entire grid
      */
    def getWidth(): Double = js.native
    
    /* private */ var ghostHeight: Any = js.native
    
    /* private */ var ghostWidth: Any = js.native
    
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
    
    /* private */ var rowHeights: Any = js.native
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
    
    @JSImport("@blueprintjs/table/lib/esm/common/grid", "Grid.MIN_COLUMN_HEADER_HEIGHT")
    @js.native
    def MIN_COLUMN_HEADER_HEIGHT: Double = js.native
    inline def MIN_COLUMN_HEADER_HEIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_COLUMN_HEADER_HEIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/common/grid", "Grid.MIN_ROW_HEADER_WIDTH")
    @js.native
    def MIN_ROW_HEADER_WIDTH: Double = js.native
    inline def MIN_ROW_HEADER_WIDTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_ROW_HEADER_WIDTH")(x.asInstanceOf[js.Any])
  }
  
  trait ColumnIndices extends StObject {
    
    var columnIndexEnd: Double
    
    var columnIndexStart: Double
  }
  object ColumnIndices {
    
    inline def apply(columnIndexEnd: Double, columnIndexStart: Double): ColumnIndices = {
      val __obj = js.Dynamic.literal(columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnIndices]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnIndices] (val x: Self) extends AnyVal {
      
      inline def setColumnIndexEnd(value: Double): Self = StObject.set(x, "columnIndexEnd", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexStart(value: Double): Self = StObject.set(x, "columnIndexStart", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetRowIndicesInRectOptions extends StObject {
    
    /**
      * height to subtract from the rect height, as rows hidden behind the columnHeader should not be returned.
      */
    var columnHeaderHeight: js.UndefOr[Double] = js.undefined
    
    var includeGhostCells: js.UndefOr[Boolean] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var rect: Rect
  }
  object GetRowIndicesInRectOptions {
    
    inline def apply(rect: Rect): GetRowIndicesInRectOptions = {
      val __obj = js.Dynamic.literal(rect = rect.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRowIndicesInRectOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetRowIndicesInRectOptions] (val x: Self) extends AnyVal {
      
      inline def setColumnHeaderHeight(value: Double): Self = StObject.set(x, "columnHeaderHeight", value.asInstanceOf[js.Any])
      
      inline def setColumnHeaderHeightUndefined: Self = StObject.set(x, "columnHeaderHeight", js.undefined)
      
      inline def setIncludeGhostCells(value: Boolean): Self = StObject.set(x, "includeGhostCells", value.asInstanceOf[js.Any])
      
      inline def setIncludeGhostCellsUndefined: Self = StObject.set(x, "includeGhostCells", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setRect(value: Rect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    }
  }
  
  type ICellMapper[T] = js.Function2[/* rowIndex */ Double, /* columnIndex */ Double, T]
  
  type IColumnMapper[T] = js.Function1[/* columnIndex */ Double, T]
  
  type IRowMapper[T] = js.Function1[/* rowIndex */ Double, T]
  
  trait RowIndices extends StObject {
    
    var rowIndexEnd: Double
    
    var rowIndexStart: Double
  }
  object RowIndices {
    
    inline def apply(rowIndexEnd: Double, rowIndexStart: Double): RowIndices = {
      val __obj = js.Dynamic.literal(rowIndexEnd = rowIndexEnd.asInstanceOf[js.Any], rowIndexStart = rowIndexStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowIndices]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowIndices] (val x: Self) extends AnyVal {
      
      inline def setRowIndexEnd(value: Double): Self = StObject.set(x, "rowIndexEnd", value.asInstanceOf[js.Any])
      
      inline def setRowIndexStart(value: Double): Self = StObject.set(x, "rowIndexStart", value.asInstanceOf[js.Any])
    }
  }
}
