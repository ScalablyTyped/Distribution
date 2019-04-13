package typings
package atBlueprintjsTableLib.libEsmCommonUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/common/utils", "Utils")
@js.native
object Utils extends js.Object {
  def accumulate(numbers: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def arrayOfLength[T](array: js.Array[T], length: scala.Double, fillValue: T): js.Array[T] = js.native
  def assignSparseValues[T](defaults: js.Array[T], sparseOverrides: js.Array[T]): js.Array[T] = js.native
  def binarySearch(
    value: scala.Double,
    high: scala.Double,
    lookup: js.Function1[/* index */ scala.Double, scala.Double]
  ): scala.Double = js.native
  def clamp(value: scala.Double): scala.Double = js.native
  def clamp(value: scala.Double, min: scala.Double): scala.Double = js.native
  def clamp(value: scala.Double, min: scala.Double, max: scala.Double): scala.Double = js.native
  def getApproxCellHeight(
    cellText: java.lang.String,
    columnWidth: scala.Double,
    approxCharWidth: scala.Double,
    approxLineHeight: scala.Double,
    horizontalPadding: scala.Double,
    numBufferLines: scala.Double
  ): scala.Double = js.native
  def guideIndexToReorderedIndex(oldIndex: scala.Double, newIndex: scala.Double, length: scala.Double): scala.Double = js.native
  def isLeftClick(event: stdLib.MouseEvent): scala.Boolean = js.native
  def measureElementTextContent(element: stdLib.Element): stdLib.TextMetrics = js.native
  def reorderArray[T](array: js.Array[T], from: scala.Double, to: scala.Double): js.Array[T] = js.native
  def reorderArray[T](array: js.Array[T], from: scala.Double, to: scala.Double, length: scala.Double): js.Array[T] = js.native
  def reorderedIndexToGuideIndex(oldIndex: scala.Double, newIndex: scala.Double, length: scala.Double): scala.Double = js.native
  def times[T](n: scala.Double, callback: js.Function1[/* i */ scala.Double, T]): js.Array[T] = js.native
  def toBase26Alpha(num: scala.Double): java.lang.String = js.native
  def toBase26CellName(rowIndex: scala.Double, columnIndex: scala.Double): java.lang.String = js.native
}

