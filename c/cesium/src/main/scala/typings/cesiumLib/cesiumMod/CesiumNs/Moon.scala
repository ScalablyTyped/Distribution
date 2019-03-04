package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Moon extends js.Object {
  var ellipsoid: Ellipsoid
  var onlySunLighting: scala.Boolean
  var show: scala.Boolean
  var textureUrl: java.lang.String
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
}

object Moon {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    ellipsoid: Ellipsoid,
    isDestroyed: js.Function0[scala.Boolean],
    onlySunLighting: scala.Boolean,
    show: scala.Boolean,
    textureUrl: java.lang.String
  ): Moon = {
    val __obj = js.Dynamic.literal(destroy = destroy, ellipsoid = ellipsoid, isDestroyed = isDestroyed, onlySunLighting = onlySunLighting, show = show, textureUrl = textureUrl)
  
    __obj.asInstanceOf[Moon]
  }
}

