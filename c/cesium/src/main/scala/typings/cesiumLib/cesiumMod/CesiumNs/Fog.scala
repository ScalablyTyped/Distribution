package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fog extends js.Object {
  var density: scala.Double
  var enabled: scala.Boolean
  var minimumBrightness: scala.Double
  var screenSpaceErrorFactor: scala.Double
}

object Fog {
  @scala.inline
  def apply(
    density: scala.Double,
    enabled: scala.Boolean,
    minimumBrightness: scala.Double,
    screenSpaceErrorFactor: scala.Double
  ): Fog = {
    val __obj = js.Dynamic.literal(density = density, enabled = enabled, minimumBrightness = minimumBrightness, screenSpaceErrorFactor = screenSpaceErrorFactor)
  
    __obj.asInstanceOf[Fog]
  }
}

