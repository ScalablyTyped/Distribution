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
  def apply(r: Double, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): PackRadius = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackRadius]
  }
}

