package typings
package d3DashHierarchyLib.d3DashHierarchyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackRadius extends js.Object {
  /**
    * The radius of the circle.
    */
  var r: scala.Double
  /**
    * The x-coordinate of the circle’s center.
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * The y-coordinate of the circle’s center.
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object PackRadius {
  @scala.inline
  def apply(r: scala.Double, x: scala.Int | scala.Double = null, y: scala.Int | scala.Double = null): PackRadius = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("r")(r)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackRadius]
  }
}

