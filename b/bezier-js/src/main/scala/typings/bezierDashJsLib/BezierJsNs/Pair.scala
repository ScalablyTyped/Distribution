package typings
package bezierDashJsLib.BezierJsNs

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
    val __obj = js.Dynamic.literal(left = left, right = right)
  
    __obj.asInstanceOf[Pair]
  }
}

