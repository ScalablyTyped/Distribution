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
    destroy: () => scala.Unit,
    glowFactor: scala.Double,
    isDestroyed: () => scala.Boolean,
    show: scala.Boolean
  ): Sun = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), glowFactor = glowFactor, isDestroyed = js.Any.fromFunction0(isDestroyed), show = show)
  
    __obj.asInstanceOf[Sun]
  }
}

