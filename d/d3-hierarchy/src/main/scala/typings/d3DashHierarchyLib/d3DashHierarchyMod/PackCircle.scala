package typings
package d3DashHierarchyLib.d3DashHierarchyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackCircle extends js.Object {
  /**
    * The radius of the circle.
    */
  var r: scala.Double
  /**
    * The x-coordinate of the circle’s center.
    */
  var x: scala.Double
  /**
    * The y-coordinate of the circle’s center.
    */
  var y: scala.Double
}

object PackCircle {
  @scala.inline
  def apply(r: scala.Double, x: scala.Double, y: scala.Double): PackCircle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("r")(r)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[PackCircle]
  }
}

