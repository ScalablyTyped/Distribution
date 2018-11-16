package typings
package crossfilterLib.CrossFilterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bisector[T, U] extends Bisection[T, U] {
  @JSName("left")
  var left_Original: Bisection[T, U] = js.native
  @JSName("right")
  var right_Original: Bisection[T, U] = js.native
  def left(array: js.Array[T], value: U, lo: scala.Double, hi: scala.Double): scala.Double = js.native
  def right(array: js.Array[T], value: U, lo: scala.Double, hi: scala.Double): scala.Double = js.native
}

