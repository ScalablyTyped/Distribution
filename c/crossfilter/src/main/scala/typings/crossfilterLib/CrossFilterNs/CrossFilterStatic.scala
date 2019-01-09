package typings
package crossfilterLib.CrossFilterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrossFilterStatic extends js.Object {
  @JSName("bisect")
  var bisect_Original: crossfilterLib.Anon_Accessor = js.native
  @JSName("heap")
  var heap_Original: crossfilterLib.Anon_Array = js.native
  @JSName("heapselect")
  var heapselect_Original: crossfilterLib.Anon_ArrayBy = js.native
  @JSName("insertionsort")
  var insertionsort_Original: crossfilterLib.Anon_ArrayByHi = js.native
  @JSName("quicksort")
  var quicksort_Original: crossfilterLib.Anon_ArrayByHi = js.native
  var version: java.lang.String = js.native
  def apply[T](data: js.Array[T]): CrossFilter[T] = js.native
  def bisect[T](array: js.Array[T], value: T, lo: scala.Double, hi: scala.Double): scala.Double = js.native
  def heap[T](array: js.Array[T], lo: scala.Double, hi: scala.Double): js.Array[T] = js.native
  def heapselect[T](array: js.Array[T], lo: scala.Double, hi: scala.Double, k: scala.Double): js.Array[T] = js.native
  def insertionsort[T](array: js.Array[T], lo: scala.Double, hi: scala.Double): js.Array[T] = js.native
  def permute[T](array: js.Array[T], index: js.Array[scala.Double]): js.Array[T] = js.native
  def quicksort[T](array: js.Array[T], lo: scala.Double, hi: scala.Double): js.Array[T] = js.native
}

