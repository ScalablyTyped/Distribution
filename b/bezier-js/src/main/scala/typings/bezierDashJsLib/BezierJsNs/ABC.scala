package typings
package bezierDashJsLib.BezierJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ABC extends js.Object {
  var A: Point
  var B: Point
  var C: Point
}

object ABC {
  @scala.inline
  def apply(A: Point, B: Point, C: Point): ABC = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("A")(A)
    __obj.updateDynamic("B")(B)
    __obj.updateDynamic("C")(C)
    __obj.asInstanceOf[ABC]
  }
}

