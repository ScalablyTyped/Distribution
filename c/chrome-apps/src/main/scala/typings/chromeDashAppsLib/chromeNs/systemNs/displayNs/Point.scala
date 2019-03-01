package typings
package chromeDashAppsLib.chromeNs.systemNs.displayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since Chrome 57
  */
trait Point extends js.Object {
  /** The x-coordinate of the point. */
  var x: chromeDashAppsLib.chromeNs.integer
  /** The y-coordinate of the point. */
  var y: chromeDashAppsLib.chromeNs.integer
}

object Point {
  @scala.inline
  def apply(x: chromeDashAppsLib.chromeNs.integer, y: chromeDashAppsLib.chromeNs.integer): Point = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Point]
  }
}

