package typings.crossfilter.CrossFilterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Heap[T] extends js.Object {
  def apply(array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
  def sort(array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
}

