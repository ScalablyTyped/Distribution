package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorIntensity extends js.Object {
  var color: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  var intensity: js.UndefOr[Double] = js.undefined
}

object ColorIntensity {
  @scala.inline
  def apply(color: typings.cesium.mod.Color = null, intensity: js.UndefOr[Double] = js.undefined): ColorIntensity = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(intensity)) __obj.updateDynamic("intensity")(intensity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorIntensity]
  }
}

