package typings
package bezierDashJsLib.BezierJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends js.Object {
  var p1: Point
  var p2: Point
}

object Line {
  @scala.inline
  def apply(p1: Point, p2: Point): Line = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("p1")(p1)
    __obj.updateDynamic("p2")(p2)
    __obj.asInstanceOf[Line]
  }
}

