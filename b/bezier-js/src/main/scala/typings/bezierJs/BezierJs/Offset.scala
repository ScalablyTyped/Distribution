package typings.bezierJs.BezierJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offset extends Point {
  var c: Point
  var n: Point
}

object Offset {
  @scala.inline
  def apply(c: Point, n: Point, x: Double, y: Double, z: Int | Double = null): Offset = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
}

