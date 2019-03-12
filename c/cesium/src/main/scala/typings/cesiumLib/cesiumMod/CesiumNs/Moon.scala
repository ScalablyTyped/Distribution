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
    destroy: () => scala.Unit,
    ellipsoid: Ellipsoid,
    isDestroyed: () => scala.Boolean,
    onlySunLighting: scala.Boolean,
    show: scala.Boolean,
    textureUrl: java.lang.String
  ): Moon = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), ellipsoid = ellipsoid, isDestroyed = js.Any.fromFunction0(isDestroyed), onlySunLighting = onlySunLighting, show = show, textureUrl = textureUrl)
  
    __obj.asInstanceOf[Moon]
  }
}

