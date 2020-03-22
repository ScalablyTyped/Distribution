package typings.cesium

import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGlowPower extends js.Object {
  var color: js.UndefOr[Property] = js.undefined
  var glowPower: js.UndefOr[Property] = js.undefined
}

object AnonGlowPower {
  @scala.inline
  def apply(color: Property = null, glowPower: Property = null): AnonGlowPower = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (glowPower != null) __obj.updateDynamic("glowPower")(glowPower.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGlowPower]
  }
}

