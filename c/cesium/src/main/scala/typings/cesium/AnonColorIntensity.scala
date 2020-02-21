package typings.cesium

import typings.cesium.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorIntensity extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var intensity: js.UndefOr[Double] = js.undefined
}

object AnonColorIntensity {
  @scala.inline
  def apply(color: Color = null, intensity: Int | Double = null): AnonColorIntensity = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (intensity != null) __obj.updateDynamic("intensity")(intensity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorIntensity]
  }
}

