package typings
package chromeDashAppsLib.chromeNs.systemNs.displayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since Chrome 57
  */
trait TouchCalibrationPair extends js.Object {
  /** The coordinates of the display point. */
  var displayPoint: Point
  /** The coordinates of the touch point corresponding to the display point. */
  var touchPoint: Point
}

object TouchCalibrationPair {
  @scala.inline
  def apply(displayPoint: Point, touchPoint: Point): TouchCalibrationPair = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayPoint")(displayPoint)
    __obj.updateDynamic("touchPoint")(touchPoint)
    __obj.asInstanceOf[TouchCalibrationPair]
  }
}

