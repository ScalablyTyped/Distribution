package typings.bezierDashJs.BezierJs

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
    val __obj = js.Dynamic.literal(p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Line]
  }
}

