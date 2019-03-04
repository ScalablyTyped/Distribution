package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sun extends js.Object {
  var glowFactor: scala.Double
  var show: scala.Boolean
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
}

object Sun {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    glowFactor: scala.Double,
    isDestroyed: js.Function0[scala.Boolean],
    show: scala.Boolean
  ): Sun = {
    val __obj = js.Dynamic.literal(destroy = destroy, glowFactor = glowFactor, isDestroyed = isDestroyed, show = show)
  
    __obj.asInstanceOf[Sun]
  }
}

