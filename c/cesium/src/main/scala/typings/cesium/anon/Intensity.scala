package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Intensity extends js.Object {
  var color: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  var direction: Cartesian3
  var intensity: js.UndefOr[Double] = js.undefined
}

object Intensity {
  @scala.inline
  def apply(
    direction: Cartesian3,
    color: typings.cesium.mod.Color = null,
    intensity: js.UndefOr[Double] = js.undefined
  ): Intensity = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(intensity)) __obj.updateDynamic("intensity")(intensity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intensity]
  }
}

