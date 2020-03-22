package typings.cesium

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIntensity extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var direction: Cartesian3
  var intensity: js.UndefOr[Double] = js.undefined
}

object AnonIntensity {
  @scala.inline
  def apply(direction: Cartesian3, color: Color = null, intensity: Int | Double = null): AnonIntensity = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (intensity != null) __obj.updateDynamic("intensity")(intensity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIntensity]
  }
}

