package typings
package chanceLib.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegerOptions extends js.Object {
  var max: scala.Double
  var min: scala.Double
}

object IntegerOptions {
  @scala.inline
  def apply(max: scala.Double, min: scala.Double): IntegerOptions = {
    val __obj = js.Dynamic.literal(max = max, min = min)
  
    __obj.asInstanceOf[IntegerOptions]
  }
}

