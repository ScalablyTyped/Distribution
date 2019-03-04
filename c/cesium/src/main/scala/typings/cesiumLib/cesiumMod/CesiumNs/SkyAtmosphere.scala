package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkyAtmosphere extends js.Object {
  var ellipsoid: Ellipsoid
  var show: scala.Boolean
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
}

object SkyAtmosphere {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    ellipsoid: Ellipsoid,
    isDestroyed: js.Function0[scala.Boolean],
    show: scala.Boolean
  ): SkyAtmosphere = {
    val __obj = js.Dynamic.literal(destroy = destroy, ellipsoid = ellipsoid, isDestroyed = isDestroyed, show = show)
  
    __obj.asInstanceOf[SkyAtmosphere]
  }
}

