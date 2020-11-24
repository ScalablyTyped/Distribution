package typings.crossfilter.CrossFilter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bisector[T, U] extends Bisection[T, U] {
  
  def left(array: js.Array[T], value: U, lo: Double, hi: Double): Double = js.native
  @JSName("left")
  var left_Original: Bisection[T, U] = js.native
  
  def right(array: js.Array[T], value: U, lo: Double, hi: Double): Double = js.native
  @JSName("right")
  var right_Original: Bisection[T, U] = js.native
}
