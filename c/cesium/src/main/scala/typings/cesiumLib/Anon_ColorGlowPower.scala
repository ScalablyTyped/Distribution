package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorGlowPower extends js.Object {
  var color: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var glowPower: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
}

object Anon_ColorGlowPower {
  @scala.inline
  def apply(
    color: cesiumLib.cesiumMod.CesiumNs.Property = null,
    glowPower: cesiumLib.cesiumMod.CesiumNs.Property = null
  ): Anon_ColorGlowPower = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (glowPower != null) __obj.updateDynamic("glowPower")(glowPower)
    __obj.asInstanceOf[Anon_ColorGlowPower]
  }
}

