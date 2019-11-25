package typings.bezierDashJs.BezierJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pair extends js.Object {
  var left: Bezier
  var right: Bezier
}

object Pair {
  @scala.inline
  def apply(left: Bezier, right: Bezier): Pair = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Pair]
  }
}

