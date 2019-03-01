package typings
package chromeLib.chromeNs.systemNs.displayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  /** The x-coordinate of the point. */
  var x: scala.Double
  /** The y-coordinate of the point. */
  var y: scala.Double
}

object Point {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): Point = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Point]
  }
}

