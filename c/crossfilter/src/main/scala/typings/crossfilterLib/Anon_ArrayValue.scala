package typings
package crossfilterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArrayValue extends js.Object {
  def apply[T](array: js.Array[T], value: T, lo: scala.Double, hi: scala.Double): scala.Double = js.native
  def by[T, U](accessor: js.Function1[/* x */ T, U]): crossfilterLib.CrossFilterNs.Bisector[T, U] = js.native
}

