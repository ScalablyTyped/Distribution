package typings
package atBlueprintjsTableLib.libEsmLocatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILocator extends js.Object {
  /**
    * Locates a cell's row and column index given the client X
    * coordinate. Returns -1 if the coordinate is not over a table cell.
    */
  def convertPointToCell(clientX: scala.Double, clientY: scala.Double): atBlueprintjsTableLib.Anon_Col = js.native
  /**
    * Locates a column's index given the client X coordinate. Returns -1 if
    * the coordinate is not over a column.
    * If `useMidpoint` is `true`, returns the index of the column whose left
    * edge is closest, splitting on the midpoint of each column.
    */
  def convertPointToColumn(clientX: scala.Double): scala.Double = js.native
  def convertPointToColumn(clientX: scala.Double, useMidpoint: scala.Boolean): scala.Double = js.native
  /**
    * Locates a row's index given the client Y coordinate. Returns -1 if
    * the coordinate is not over a row.
    * If `useMidpoint` is `true`, returns the index of the row whose top
    * edge is closest, splitting on the midpoint of each row.
    */
  def convertPointToRow(clientY: scala.Double): scala.Double = js.native
  def convertPointToRow(clientY: scala.Double, useMidpoint: scala.Boolean): scala.Double = js.native
  /**
    * Returns the height of the tallest cell in a given column -- specifically,
    * tallest as in how tall the cell would have to be to display all the content in it
    */
  def getTallestVisibleCellInColumn(columnIndex: scala.Double): scala.Double = js.native
  /**
    * Returns the width that a column must be to contain all the content of
    * its cells without truncating or wrapping.
    */
  def getWidestVisibleCellInColumn(columnIndex: scala.Double): scala.Double = js.native
}

