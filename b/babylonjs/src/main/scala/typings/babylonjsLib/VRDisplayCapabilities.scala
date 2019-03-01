package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRDisplayCapabilities extends js.Object {
  val canPresent: scala.Boolean
  val hasExternalDisplay: scala.Boolean
  val hasOrientation: scala.Boolean
  val hasPosition: scala.Boolean
  val maxLayers: scala.Double
}

object VRDisplayCapabilities {
  @scala.inline
  def apply(
    canPresent: scala.Boolean,
    hasExternalDisplay: scala.Boolean,
    hasOrientation: scala.Boolean,
    hasPosition: scala.Boolean,
    maxLayers: scala.Double
  ): VRDisplayCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canPresent")(canPresent)
    __obj.updateDynamic("hasExternalDisplay")(hasExternalDisplay)
    __obj.updateDynamic("hasOrientation")(hasOrientation)
    __obj.updateDynamic("hasPosition")(hasPosition)
    __obj.updateDynamic("maxLayers")(maxLayers)
    __obj.asInstanceOf[VRDisplayCapabilities]
  }
}

