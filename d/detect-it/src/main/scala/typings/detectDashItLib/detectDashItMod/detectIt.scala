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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deviceType")(deviceType.asInstanceOf[js.Any])
    __obj.updateDynamic("hasMouse")(hasMouse)
    __obj.updateDynamic("hasTouch")(hasTouch)
    __obj.updateDynamic("maxTouchPoints")(maxTouchPoints)
    __obj.updateDynamic("passiveEvents")(passiveEvents)
    __obj.updateDynamic("primaryHover")(primaryHover.asInstanceOf[js.Any])
    __obj.updateDynamic("primaryPointer")(primaryPointer.asInstanceOf[js.Any])
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[detectIt]
  }
}

