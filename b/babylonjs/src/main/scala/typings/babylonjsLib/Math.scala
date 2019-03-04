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
  def apply(
    fround: js.Function1[scala.Double, scala.Double],
    imul: js.Function2[scala.Double, scala.Double, scala.Double]
  ): Math = {
    val __obj = js.Dynamic.literal(fround = fround, imul = imul)
  
    __obj.asInstanceOf[Math]
  }
}

