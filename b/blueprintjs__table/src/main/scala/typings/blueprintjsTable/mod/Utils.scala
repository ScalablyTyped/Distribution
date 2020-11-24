package typings.blueprintjsTable.mod

import typings.std.Element
import typings.std.MouseEvent
import typings.std.TextMetrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table", "Utils")
@js.native
object Utils extends js.Object {
  
  /**
    * Takes an array of numbers, returns an array of numbers of the same length in which each
    * value is the sum of current and previous values in the input array.
    *
    * Example input:  [10, 20, 50]
    *         output: [10, 30, 80]
    */
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
  def binarySearch(value: Double, high: Double, lookup: js.Function1[/* index */ Double, Double]): Double = js.native
  
  /**
    * Given a number, returns a value that is clamped within a
    * minimum/maximum bounded range. The minimum and maximum are optional. If
    * either is missing, that extrema limit is not applied.
    *
    * Assumes max >= min.
    */
  def clamp(value: Double): Double = js.native
  def clamp(value: Double, min: js.UndefOr[scala.Nothing], max: Double): Double = js.native
  def clamp(value: Double, min: Double): Double = js.native
  def clamp(value: Double, min: Double, max: Double): Double = js.native
  
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
  def guideIndexToReorderedIndex(oldIndex: Double, newIndex: Double, length: Double): Double = js.native
  
  /**
    * Returns true if the mouse event was triggered by the left mouse button.
    */
  def isLeftClick(event: MouseEvent): Boolean = js.native
  
  /**
    * Measures the bounds of supplied element's textContent.
    * We use the computed font from the supplied element and a non-DOM canvas
    * context to measure the text.
    */
  def measureElementTextContent(element: Element): TextMetrics = js.native
  
  /**
    * Returns a copy of the provided array with the `length` contiguous elements starting at the
    * `from` index reordered to start at the `to` index.
    *
    * For example, given the array [A,B,C,D,E,F], reordering the 3 contiguous elements starting at
    * index 1 (B, C, and D) to start at index 2 would yield [A,E,B,C,D,F].
    */
  def reorderArray[T_3](array: js.Array[T_3], from: Double, to: Double): js.Array[T_3] = js.native
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
  def reorderedIndexToGuideIndex(oldIndex: Double, newIndex: Double, length: Double): Double = js.native
  
  /**
    * Invokes the callback `n` times, collecting the results in an array, which
    * is the return value. Similar to _.times
    */
  def times[T](n: Double, callback: js.Function1[/* i */ Double, T]): js.Array[T] = js.native
  
  /**
    * Returns traditional spreadsheet-style column names
    * e.g. (A, B, ..., Z, AA, AB, ..., ZZ, AAA, AAB, ...).
    *
    * Note that this isn't technically mathematically equivalent to base 26 since
    * there is no zero element.
    */
  def toBase26Alpha(num: Double): String = js.native
  
  /**
    * Returns traditional spreadsheet-style cell names
    * e.g. (A1, B2, ..., Z44, AA1) with rows 1-indexed.
    */
  def toBase26CellName(rowIndex: Double, columnIndex: Double): String = js.native
}
