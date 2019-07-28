package typings.crossfilter

import typings.crossfilter.CrossFilterNs.Selector
import typings.crossfilter.CrossFilterNs.Sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArrayByHi extends js.Object {
  def apply[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
  def by[T](value: Selector[T]): Sort[T] = js.native
}

