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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("glowFactor")(glowFactor)
    __obj.updateDynamic("isDestroyed")(isDestroyed)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Sun]
  }
}

