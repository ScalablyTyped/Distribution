package typings
package detectDashItLib.detectDashItMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait detectIt extends js.Object {
  var deviceType: detectDashItLib.detectDashItLibStrings.hybrid | detectDashItLib.detectDashItLibStrings.mouseOnly | detectDashItLib.detectDashItLibStrings.touchOnly
  var hasMouse: scala.Boolean
  var hasTouch: scala.Boolean
  var maxTouchPoints: scala.Double
  var passiveEvents: scala.Boolean
  var primaryHover: detectDashItLib.detectDashItLibStrings.hover | detectDashItLib.detectDashItLibStrings.none
  var primaryPointer: detectDashItLib.detectDashItLibStrings.coarse | detectDashItLib.detectDashItLibStrings.fine | detectDashItLib.detectDashItLibStrings.none
  var state: state
  def update(): scala.Unit
}

object detectIt {
  @scala.inline
  def apply(
    deviceType: detectDashItLib.detectDashItLibStrings.hybrid | detectDashItLib.detectDashItLibStrings.mouseOnly | detectDashItLib.detectDashItLibStrings.touchOnly,
    hasMouse: scala.Boolean,
    hasTouch: scala.Boolean,
    maxTouchPoints: scala.Double,
    passiveEvents: scala.Boolean,
    primaryHover: detectDashItLib.detectDashItLibStrings.hover | detectDashItLib.detectDashItLibStrings.none,
    primaryPointer: detectDashItLib.detectDashItLibStrings.coarse | detectDashItLib.detectDashItLibStrings.fine | detectDashItLib.detectDashItLibStrings.none,
    state: state,
    update: js.Function0[scala.Unit]
  ): detectIt = {
    val __obj = js.Dynamic.literal(deviceType = deviceType.asInstanceOf[js.Any], hasMouse = hasMouse, hasTouch = hasTouch, maxTouchPoints = maxTouchPoints, passiveEvents = passiveEvents, primaryHover = primaryHover.asInstanceOf[js.Any], primaryPointer = primaryPointer.asInstanceOf[js.Any], state = state, update = update)
  
    __obj.asInstanceOf[detectIt]
  }
}

