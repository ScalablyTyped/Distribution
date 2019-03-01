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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("ellipsoid")(ellipsoid)
    __obj.updateDynamic("isDestroyed")(isDestroyed)
    __obj.updateDynamic("onlySunLighting")(onlySunLighting)
    __obj.updateDynamic("show")(show)
    __obj.updateDynamic("textureUrl")(textureUrl)
    __obj.asInstanceOf[Moon]
  }
}

