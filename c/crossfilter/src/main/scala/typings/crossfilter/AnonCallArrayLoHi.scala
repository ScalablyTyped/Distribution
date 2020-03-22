package typings.crossfilter

import typings.crossfilter.CrossFilter.Selector
import typings.crossfilter.CrossFilter.Sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallArrayLoHi extends js.Object {
  def apply[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
  def by[T](value: Selector[T]): Sort[T] = js.native
}

