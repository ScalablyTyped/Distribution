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

