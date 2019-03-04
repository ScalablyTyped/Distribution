package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowMap extends js.Object {
  var darkness: scala.Double
  var enabled: scala.Boolean
  var maximumDistance: scala.Double
  var normalOffset: scala.Boolean
  var size: scala.Double
  var softShadows: scala.Boolean
}

object ShadowMap {
  @scala.inline
  def apply(
    darkness: scala.Double,
    enabled: scala.Boolean,
    maximumDistance: scala.Double,
    normalOffset: scala.Boolean,
    size: scala.Double,
    softShadows: scala.Boolean
  ): ShadowMap = {
    val __obj = js.Dynamic.literal(darkness = darkness, enabled = enabled, maximumDistance = maximumDistance, normalOffset = normalOffset, size = size, softShadows = softShadows)
  
    __obj.asInstanceOf[ShadowMap]
  }
}

