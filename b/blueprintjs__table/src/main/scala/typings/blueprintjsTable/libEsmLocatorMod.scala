package typings.blueprintjsTable

import typings.blueprintjsTable.anon.Col
import typings.blueprintjsTable.libEsmCommonGridMod.Grid
import typings.blueprintjsTable.libEsmCommonRectMod.Rect
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmLocatorMod {
  
  @JSImport("@blueprintjs/table/lib/esm/locator", "Locator")
  @js.native
  open class Locator protected ()
    extends StObject
       with ILocator {
    def this(tableElement: HTMLElement, scrollContainerElement: HTMLElement, cellContainerElement: HTMLElement) = this()
    
    /* private */ var cellContainerElement: Any = js.native
    
    /* private */ var convertCellIndexToClientX: Any = js.native
    
    /* private */ var convertCellIndexToClientY: Any = js.native
    
    /* private */ var convertCellMidpointToClientX: Any = js.native
    
    /* private */ var convertCellMidpointToClientY: Any = js.native
    
    /* private */ var getColumnCellSelector: Any = js.native
    
    /* private */ var getTableRect: Any = js.native
    
    def getViewportRect(): Rect = js.native
    
    /* private */ var grid: Any = js.native
    
    /**
      * Pass in an already-computed viewport rect here, if available, to reduce DOM reads.
      *
      * @returns whether the rendered columns overflow or exactly fit the visible viewport horizontally, helpful for scrolling calculations
      */
    def hasHorizontalOverflowOrExactFit(): Boolean = js.native
    def hasHorizontalOverflowOrExactFit(rowHeaderWidth: Double): Boolean = js.native
    def hasHorizontalOverflowOrExactFit(rowHeaderWidth: Double, viewportRect: Rect): Boolean = js.native
    def hasHorizontalOverflowOrExactFit(rowHeaderWidth: Unit, viewportRect: Rect): Boolean = js.native
    
    /**
      * Pass in an already-computed viewport rect here, if available, to reduce DOM reads.
      *
      * @returns whether the rendered rows overflow or exactly fit the visible viewport vertically, helpful for scrolling calculations
      */
    def hasVerticalOverflowOrExactFit(): Boolean = js.native
    def hasVerticalOverflowOrExactFit(columnHeaderHeight: Double): Boolean = js.native
    def hasVerticalOverflowOrExactFit(columnHeaderHeight: Double, viewportRect: Rect): Boolean = js.native
    def hasVerticalOverflowOrExactFit(columnHeaderHeight: Unit, viewportRect: Rect): Boolean = js.native
    
    /* private */ var numFrozenColumns: Any = js.native
    
    /* private */ var numFrozenRows: Any = js.native
    
    /* private */ var scrollContainerElement: Any = js.native
    
    def setGrid(grid: Grid): this.type = js.native
    
    def setNumFrozenColumns(numFrozenColumns: Double): this.type = js.native
    
    def setNumFrozenRows(numFrozenRows: Double): this.type = js.native
    
    /* private */ var tableElement: Any = js.native
    
    /* private */ var toGridX: Any = js.native
    
    /* private */ var toGridY: Any = js.native
  }
  /* static members */
  object Locator {
    
    @JSImport("@blueprintjs/table/lib/esm/locator", "Locator")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/locator", "Locator.CELL_HORIZONTAL_PADDING")
    @js.native
    def CELL_HORIZONTAL_PADDING: Double = js.native
    inline def CELL_HORIZONTAL_PADDING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CELL_HORIZONTAL_PADDING")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ILocator extends StObject {
    
    /**
      * Locates a cell's row and column index given the client X and Y
      * coordinates.
      */
    def convertPointToCell(clientX: Double, clientY: Double): Col = js.native
    
    /**
      * Locates a column's index given the client X coordinate. Returns -1 if
      * the coordinate is not over a column.
      * If `useMidpoint` is `true`, returns the index of the column whose left
      * edge is closest, splitting on the midpoint of each column.
      */
    def convertPointToColumn(clientX: Double): Double = js.native
    def convertPointToColumn(clientX: Double, useMidpoint: Boolean): Double = js.native
    
    /**
      * Locates a row's index given the client Y coordinate. Returns -1 if
      * the coordinate is not over a row.
      * If `useMidpoint` is `true`, returns the index of the row whose top
      * edge is closest, splitting on the midpoint of each row.
      */
    def convertPointToRow(clientY: Double): Double = js.native
    def convertPointToRow(clientY: Double, useMidpoint: Boolean): Double = js.native
    
    /**
      * Returns the height of the tallest cell in a given column -- specifically,
      * tallest as in how tall the cell would have to be to display all the content in it
      */
    def getTallestVisibleCellInColumn(columnIndex: Double): Double = js.native
    
    /**
      * Returns the width that a column must be to contain all the content of
      * its cells without truncating or wrapping.
      */
    def getWidestVisibleCellInColumn(columnIndex: Double): Double = js.native
  }
}
