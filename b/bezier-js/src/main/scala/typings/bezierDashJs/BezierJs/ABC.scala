package typings.bezierDashJs.BezierJs

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
    val __obj = js.Dynamic.literal(A = A, B = B, C = C)
  
    __obj.asInstanceOf[ABC]
  }
}

