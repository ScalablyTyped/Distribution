package typings.bezierJs.BezierJs

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
    val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], B = B.asInstanceOf[js.Any], C = C.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ABC]
  }
}

