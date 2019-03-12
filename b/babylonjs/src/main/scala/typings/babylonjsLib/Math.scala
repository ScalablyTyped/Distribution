package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Math extends js.Object {
  def fround(x: scala.Double): scala.Double
  def imul(a: scala.Double, b: scala.Double): scala.Double
}

object Math {
  @scala.inline
  def apply(fround: scala.Double => scala.Double, imul: (scala.Double, scala.Double) => scala.Double): Math = {
    val __obj = js.Dynamic.literal(fround = js.Any.fromFunction1(fround), imul = js.Any.fromFunction2(imul))
  
    __obj.asInstanceOf[Math]
  }
}

