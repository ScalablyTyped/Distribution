package typings.crossfilter

import typings.crossfilter.CrossFilter.HeapSelect
import typings.crossfilter.CrossFilter.Selector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArrayBy extends js.Object {
  def apply[T](array: js.Array[T], lo: Double, hi: Double, k: Double): js.Array[T] = js.native
  def by[T](value: Selector[T]): HeapSelect[T] = js.native
}

