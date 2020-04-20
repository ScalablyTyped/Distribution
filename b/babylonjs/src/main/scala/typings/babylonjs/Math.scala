package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Math extends js.Object {
  def fround(x: Double): Double
  def imul(a: Double, b: Double): Double
}

object Math {
  @scala.inline
  def apply(fround: Double => Double, imul: (Double, Double) => Double): Math = {
    val __obj = js.Dynamic.literal(fround = js.Any.fromFunction1(fround), imul = js.Any.fromFunction2(imul))
    __obj.asInstanceOf[Math]
  }
}

