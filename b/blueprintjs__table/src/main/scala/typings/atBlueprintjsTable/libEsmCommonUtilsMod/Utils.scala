package typings.atBlueprintjsTable.libEsmCommonUtilsMod

import typings.std.Element
import typings.std.MouseEvent
import typings.std.TextMetrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/common/utils", "Utils")
@js.native
object Utils extends js.Object {
  def accumulate(numbers: js.Array[Double]): js.Array[Double] = js.native
  def arrayOfLength[T](array: js.Array[T], length: Double, fillValue: T): js.Array[T] = js.native
  def assignSparseValues[T](defaults: js.Array[T], sparseOverrides: js.Array[T]): js.Array[T] = js.native
  def binarySearch(value: Double, high: Double, lookup: js.Function1[/* index */ Double, Double]): Double = js.native
  def clamp(value: Double): Double = js.native
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
  def guideIndexToReorderedIndex(oldIndex: Double, newIndex: Double, length: Double): Double = js.native
  def isLeftClick(event: MouseEvent): Boolean = js.native
  def measureElementTextContent(element: Element): TextMetrics = js.native
  def reorderArray[T](array: js.Array[T], from: Double, to: Double): js.Array[T] = js.native
  def reorderArray[T](array: js.Array[T], from: Double, to: Double, length: Double): js.Array[T] = js.native
  def reorderedIndexToGuideIndex(oldIndex: Double, newIndex: Double, length: Double): Double = js.native
  def times[T](n: Double, callback: js.Function1[/* i */ Double, T]): js.Array[T] = js.native
  def toBase26Alpha(num: Double): String = js.native
  def toBase26CellName(rowIndex: Double, columnIndex: Double): String = js.native
}

