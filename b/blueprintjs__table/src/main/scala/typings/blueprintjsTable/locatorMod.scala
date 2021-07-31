package typings.blueprintjsTable

import typings.blueprintjsTable.anon.Col
import typings.blueprintjsTable.gridMod.Grid
import typings.blueprintjsTable.rectMod.Rect
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locatorMod {
  
  @JSImport("@blueprintjs/table/lib/esm/locator", "Locator")
  @js.native
  class Locator protected ()
    extends StObject
       with ILocator {
    def this(tableElement: HTMLElement, scrollContainerElement: HTMLElement, cellContainerElement: HTMLElement) = this()
    
    var cellContainerElement: js.Any = js.native
    
    var convertCellIndexToClientX: js.Any = js.native
    
    var convertCellIndexToClientY: js.Any = js.native
    
    var convertCellMidpointToClientX: js.Any = js.native
    
    var convertCellMidpointToClientY: js.Any = js.native
    
    var getColumnCellSelector: js.Any = js.native
    
    var getTableRect: js.Any = js.native
    
    def getViewportRect(): Rect = js.native
    
    var grid: js.Any = js.native
    
    var numFrozenColumns: js.Any = js.native
    
    var numFrozenRows: js.Any = js.native
    
    var scrollContainerElement: js.Any = js.native
    
    def setGrid(grid: Grid): this.type = js.native
    
    def setNumFrozenColumns(numFrozenColumns: Double): this.type = js.native
    
    def setNumFrozenRows(numFrozenRows: Double): this.type = js.native
    
    var tableElement: js.Any = js.native
    
    var toGridX: js.Any = js.native
    
    var toGridY: js.Any = js.native
  }
  /* static members */
  object Locator {
    
    @JSImport("@blueprintjs/table/lib/esm/locator", "Locator")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/locator", "Locator.CELL_HORIZONTAL_PADDING")
    @js.native
    def CELL_HORIZONTAL_PADDING: Double = js.native
    @scala.inline
    def CELL_HORIZONTAL_PADDING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CELL_HORIZONTAL_PADDING")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ILocator extends StObject {
    
    /**
      * Locates a cell's row and column index given the client X
      * coordinate. Returns -1 if the coordinate is not over a table cell.
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
