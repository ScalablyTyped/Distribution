package typings.atBlueprintjsTable.libEsmLocatorMod

import typings.atBlueprintjsTable.Anon_Col
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILocator extends js.Object {
  /**
    * Locates a cell's row and column index given the client X
    * coordinate. Returns -1 if the coordinate is not over a table cell.
    */
  def convertPointToCell(clientX: Double, clientY: Double): Anon_Col = js.native
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

