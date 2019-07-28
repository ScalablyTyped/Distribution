package typings.crossfilter.CrossFilterNs

import typings.crossfilter.Anon_Accessor
import typings.crossfilter.Anon_Array
import typings.crossfilter.Anon_ArrayBy
import typings.crossfilter.Anon_ArrayByHi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrossFilterStatic extends js.Object {
  @JSName("bisect")
  var bisect_Original: Anon_Accessor = js.native
  @JSName("heap")
  var heap_Original: Anon_Array = js.native
  @JSName("heapselect")
  var heapselect_Original: Anon_ArrayBy = js.native
  @JSName("insertionsort")
  var insertionsort_Original: Anon_ArrayByHi = js.native
  @JSName("quicksort")
  var quicksort_Original: Anon_ArrayByHi = js.native
  var version: String = js.native
  def apply[T](data: js.Array[T]): CrossFilter[T] = js.native
  def bisect[T](array: js.Array[T], value: T, lo: Double, hi: Double): Double = js.native
  def heap[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
  def heapselect[T](array: js.Array[T], lo: Double, hi: Double, k: Double): js.Array[T] = js.native
  def insertionsort[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
  def permute[T](array: js.Array[T], index: js.Array[Double]): js.Array[T] = js.native
  def quicksort[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
}

