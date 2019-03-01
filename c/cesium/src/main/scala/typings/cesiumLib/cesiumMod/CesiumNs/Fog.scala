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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("density")(density)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("minimumBrightness")(minimumBrightness)
    __obj.updateDynamic("screenSpaceErrorFactor")(screenSpaceErrorFactor)
    __obj.asInstanceOf[Fog]
  }
}

