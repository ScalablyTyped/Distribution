package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRDisplayCapabilities extends js.Object {
  val canPresent: Boolean
  val hasExternalDisplay: Boolean
  val hasOrientation: Boolean
  val hasPosition: Boolean
  val maxLayers: Double
}

object VRDisplayCapabilities {
  @scala.inline
  def apply(
    canPresent: Boolean,
    hasExternalDisplay: Boolean,
    hasOrientation: Boolean,
    hasPosition: Boolean,
    maxLayers: Double
  ): VRDisplayCapabilities = {
    val __obj = js.Dynamic.literal(canPresent = canPresent.asInstanceOf[js.Any], hasExternalDisplay = hasExternalDisplay.asInstanceOf[js.Any], hasOrientation = hasOrientation.asInstanceOf[js.Any], hasPosition = hasPosition.asInstanceOf[js.Any], maxLayers = maxLayers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VRDisplayCapabilities]
  }
}

