package typings
package cypressLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coordinates extends js.Object {
  var left: scala.Double
  var top: scala.Double
}

object Coordinates {
  @scala.inline
  def apply(left: scala.Double, top: scala.Double): Coordinates = {
    val __obj = js.Dynamic.literal(left = left, top = top)
  
    __obj.asInstanceOf[Coordinates]
  }
}

