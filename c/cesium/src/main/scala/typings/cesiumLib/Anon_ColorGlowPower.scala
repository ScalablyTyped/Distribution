package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorGlowPower extends js.Object {
  var color: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var glowPower: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
}

object Anon_ColorGlowPower {
  @scala.inline
  def apply(color: cesiumLib.cesiumMod.Property = null, glowPower: cesiumLib.cesiumMod.Property = null): Anon_ColorGlowPower = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (glowPower != null) __obj.updateDynamic("glowPower")(glowPower)
    __obj.asInstanceOf[Anon_ColorGlowPower]
  }
}

