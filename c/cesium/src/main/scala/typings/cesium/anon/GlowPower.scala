package typings.cesium.anon

import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlowPower extends js.Object {
  var color: js.UndefOr[Property] = js.undefined
  var glowPower: js.UndefOr[Property] = js.undefined
}

object GlowPower {
  @scala.inline
  def apply(color: Property = null, glowPower: Property = null): GlowPower = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (glowPower != null) __obj.updateDynamic("glowPower")(glowPower.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlowPower]
  }
}

