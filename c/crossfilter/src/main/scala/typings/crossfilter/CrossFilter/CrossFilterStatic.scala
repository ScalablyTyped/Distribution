package typings.crossfilter.CrossFilter

import typings.crossfilter.AnonAccessor
import typings.crossfilter.AnonArray
import typings.crossfilter.AnonArrayBy
import typings.crossfilter.AnonArrayByHi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrossFilterStatic extends js.Object {
  @JSName("bisect")
  var bisect_Original: AnonAccessor = js.native
  @JSName("heap")
  var heap_Original: AnonArray = js.native
  @JSName("heapselect")
  var heapselect_Original: AnonArrayBy = js.native
  @JSName("insertionsort")
  var insertionsort_Original: AnonArrayByHi = js.native
  @JSName("quicksort")
  var quicksort_Original: AnonArrayByHi = js.native
  var version: String = js.native
  def apply[T](data: js.Array[T]): typings.crossfilter.CrossFilter.CrossFilter[T] = js.native
  def bisect[T](array: js.Array[T], value: T, lo: Double, hi: Double): Double = js.native
  def heap[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
  def heapselect[T](array: js.Array[T], lo: Double, hi: Double, k: Double): js.Array[T] = js.native
  def insertionsort[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
  def permute[T](array: js.Array[T], index: js.Array[Double]): js.Array[T] = js.native
  def quicksort[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
}

