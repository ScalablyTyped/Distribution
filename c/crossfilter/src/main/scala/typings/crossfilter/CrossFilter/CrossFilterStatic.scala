package typings.crossfilter.CrossFilter

import typings.crossfilter.anon.By
import typings.crossfilter.anon.Call
import typings.crossfilter.anon.CallArrayLoHi
import typings.crossfilter.anon.CallBy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrossFilterStatic extends js.Object {
  
  def apply[T](data: js.Array[T]): typings.crossfilter.CrossFilter.CrossFilter[T] = js.native
  
  def bisect[T](array: js.Array[T], value: T, lo: Double, hi: Double): Double = js.native
  @JSName("bisect")
  var bisect_Original: Call = js.native
  
  def heap[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
  @JSName("heap")
  var heap_Original: By = js.native
  
  def heapselect[T](array: js.Array[T], lo: Double, hi: Double, k: Double): js.Array[T] = js.native
  @JSName("heapselect")
  var heapselect_Original: CallBy = js.native
  
  def insertionsort[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
  @JSName("insertionsort")
  var insertionsort_Original: CallArrayLoHi = js.native
  
  def permute[T](array: js.Array[T], index: js.Array[Double]): js.Array[T] = js.native
  
  def quicksort[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
  @JSName("quicksort")
  var quicksort_Original: CallArrayLoHi = js.native
  
  var version: String = js.native
}
