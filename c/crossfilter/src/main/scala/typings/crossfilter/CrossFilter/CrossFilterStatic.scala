package typings.crossfilter.CrossFilter

import typings.crossfilter.AnonBy
import typings.crossfilter.AnonCall
import typings.crossfilter.AnonCallArrayLoHi
import typings.crossfilter.AnonCallBy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrossFilterStatic extends js.Object {
  @JSName("bisect")
  var bisect_Original: AnonCall = js.native
  @JSName("heap")
  var heap_Original: AnonBy = js.native
  @JSName("heapselect")
  var heapselect_Original: AnonCallBy = js.native
  @JSName("insertionsort")
  var insertionsort_Original: AnonCallArrayLoHi = js.native
  @JSName("quicksort")
  var quicksort_Original: AnonCallArrayLoHi = js.native
  var version: String = js.native
  def apply[T](data: js.Array[T]): typings.crossfilter.CrossFilter.CrossFilter[T] = js.native
  def bisect[T](array: js.Array[T], value: T, lo: Double, hi: Double): Double = js.native
  def heap[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
  def heapselect[T](array: js.Array[T], lo: Double, hi: Double, k: Double): js.Array[T] = js.native
  def insertionsort[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
  def permute[T](array: js.Array[T], index: js.Array[Double]): js.Array[T] = js.native
  def quicksort[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
}

