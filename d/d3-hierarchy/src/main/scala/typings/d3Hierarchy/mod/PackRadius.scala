package typings.d3Hierarchy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackRadius extends js.Object {
  /**
    * The radius of the circle.
    */
  var r: Double
  /**
    * The x-coordinate of the circle’s center.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The y-coordinate of the circle’s center.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object PackRadius {
  @scala.inline
  def apply(r: Double, x: Int | Double = null, y: Int | Double = null): PackRadius = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackRadius]
  }
}

