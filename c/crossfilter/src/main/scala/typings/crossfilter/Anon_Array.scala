package typings.crossfilter

import typings.crossfilter.CrossFilter.Heap
import typings.crossfilter.CrossFilter.Selector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Array extends js.Object {
  def apply[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
  def by[T](value: Selector[T]): Heap[T] = js.native
}

