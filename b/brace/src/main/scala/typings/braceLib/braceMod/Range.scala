package typings
package braceLib.braceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("brace", "Range")
@js.native
class RangeCls protected ()
  extends braceLib.braceMod.AceAjaxNs.Range {
  def this(startRow: scala.Double, startColumn: scala.Double, endRow: scala.Double, endColumn: scala.Double) = this()
  /* CompleteClass */
  override var end: braceLib.braceMod.AceAjaxNs.Position = js.native
  /* CompleteClass */
  override var endColumn: scala.Double = js.native
  /* CompleteClass */
  override var endRow: scala.Double = js.native
  /* CompleteClass */
  override var start: braceLib.braceMod.AceAjaxNs.Position = js.native
  /* CompleteClass */
  override var startColumn: scala.Double = js.native
  /* CompleteClass */
  override var startRow: scala.Double = js.native
  /**
    * Returns the part of the current `Range` that occurs within the boundaries of `firstRow` and `lastRow` as a new `Range` object.
    * @param firstRow The starting row
    * @param lastRow The ending row
    **/
  /* CompleteClass */
  override def clipRows(firstRow: scala.Double, lastRow: scala.Double): braceLib.braceMod.AceAjaxNs.Range = js.native
  /**
    * Returns a range containing the starting and ending rows of the original range, but with a column value of `0`.
    **/
  /* CompleteClass */
  override def collapseRows(): braceLib.braceMod.AceAjaxNs.Range = js.native
  /**
    * Checks the row and column points with the row and column points of the calling range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  /* CompleteClass */
  override def compare(row: scala.Double, column: scala.Double): scala.Double = js.native
  /**
    * Checks the row and column points with the row and column points of the calling range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  /* CompleteClass */
  override def compareEnd(row: scala.Double, column: scala.Double): scala.Double = js.native
  /**
    * Checks the row and column points with the row and column points of the calling range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  /* CompleteClass */
  override def compareInside(row: scala.Double, column: scala.Double): scala.Double = js.native
  /**
    * Checks the row and column points of `p` with the row and column points of the calling range.
    * @param p A point to compare with
    **/
  /* CompleteClass */
  override def comparePoint(p: braceLib.braceMod.AceAjaxNs.Range): scala.Double = js.native
  /**
    * Compares `this` range (A) with another range (B).
    * @param range A range to compare with
    **/
  /* CompleteClass */
  override def compareRange(range: braceLib.braceMod.AceAjaxNs.Range): scala.Double = js.native
  /**
    * Checks the row and column points with the row and column points of the calling range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  /* CompleteClass */
  override def compareStart(row: scala.Double, column: scala.Double): scala.Double = js.native
  /**
    * Returns `true` if the `row` and `column` provided are within the given range. This can better be expressed as returning `true` if:
    * ```javascript
    * this.start.row <= row <= this.end.row &&
    * this.start.column <= column <= this.end.column
    * ```
    * @param row A row to check for
    * @param column A column to check for
    **/
  /* CompleteClass */
  override def contains(row: scala.Double, column: scala.Double): scala.Boolean = js.native
  /**
    * Checks the start and end points of `range` and compares them to the calling range. Returns `true` if the `range` is contained within the caller's range.
    * @param range A range to compare with
    **/
  /* CompleteClass */
  override def containsRange(range: braceLib.braceMod.AceAjaxNs.Range): scala.Boolean = js.native
  /**
    * Changes the row and column points for the calling range for both the starting and ending points.
    * @param row A new row to extend to
    * @param column A new column to extend to
    **/
  /* CompleteClass */
  override def extend(row: scala.Double, column: scala.Double): braceLib.braceMod.AceAjaxNs.Range = js.native
  /**
    * Creates and returns a new `Range` based on the row and column of the given parameters.
    * @param start A starting point to use
    * @param end An ending point to use
    **/
  /* CompleteClass */
  override def fromPoints(start: braceLib.braceMod.AceAjaxNs.Range, end: braceLib.braceMod.AceAjaxNs.Range): braceLib.braceMod.AceAjaxNs.Range = js.native
  /**
    * Returns `true` if the `row` and `column` are within the given range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  /* CompleteClass */
  override def inside(row: scala.Double, column: scala.Double): scala.Boolean = js.native
  /**
    * Returns `true` if the `row` and `column` are within the given range's ending points.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  /* CompleteClass */
  override def insideEnd(row: scala.Double, column: scala.Double): scala.Boolean = js.native
  /**
    * Returns `true` if the `row` and `column` are within the given range's starting points.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  /* CompleteClass */
  override def insideStart(row: scala.Double, column: scala.Double): scala.Boolean = js.native
  /**
    * Returns `true` if passed in `range` intersects with the one calling this method.
    * @param range A range to compare with
    **/
  /* CompleteClass */
  override def intersects(range: braceLib.braceMod.AceAjaxNs.Range): scala.Boolean = js.native
  /* CompleteClass */
  override def isEmpty(): scala.Boolean = js.native
  /**
    * Returns `true` if the caller's ending row point is the same as `row`, and if the caller's ending column is the same as `column`.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  /* CompleteClass */
  override def isEnd(row: scala.Double, column: scala.Double): scala.Boolean = js.native
  /**
    * Returns `true` if and only if the starting row and column, and ending row and column, are equivalent to those given by `range`.
    * @param range A range to check against
    **/
  /* CompleteClass */
  override def isEqual(range: braceLib.braceMod.AceAjaxNs.Range): scala.Unit = js.native
  /**
    * Returns `true` if the range spans across multiple lines.
    **/
  /* CompleteClass */
  override def isMultiLine(): scala.Boolean = js.native
  /**
    * Returns `true` if the caller's starting row point is the same as `row`, and if the caller's starting column is the same as `column`.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  /* CompleteClass */
  override def isStart(row: scala.Double, column: scala.Double): scala.Boolean = js.native
  /**
    * Sets the starting row and column for the range.
    * @param row A row point to set
    * @param column A column point to set
    **/
  /* CompleteClass */
  override def setEnd(row: scala.Double, column: scala.Double): scala.Unit = js.native
  /**
    * Sets the starting row and column for the range.
    * @param row A row point to set
    * @param column A column point to set
    **/
  /* CompleteClass */
  override def setStart(row: scala.Double, column: scala.Double): scala.Unit = js.native
  /**
    * Given the current `Range`, this function converts those starting and ending points into screen positions, and then returns a new `Range` object.
    * @param session The `EditSession` to retrieve coordinates from
    **/
  /* CompleteClass */
  override def toScreenRange(session: braceLib.braceMod.AceAjaxNs.IEditSession): braceLib.braceMod.AceAjaxNs.Range = js.native
}

