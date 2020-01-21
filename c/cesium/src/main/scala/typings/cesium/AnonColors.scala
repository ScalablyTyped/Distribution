package typings.cesium

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Color
import typings.cesium.mod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColors extends js.Object {
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  var colorsPerVertex: js.UndefOr[Boolean] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var followSurface: js.UndefOr[Boolean] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var positions: js.Array[Cartesian3]
  var width: js.UndefOr[Double] = js.undefined
}

object AnonColors {
  @scala.inline
  def apply(
    positions: js.Array[Cartesian3],
    colors: js.Array[Color] = null,
    colorsPerVertex: js.UndefOr[Boolean] = js.undefined,
    ellipsoid: Ellipsoid = null,
    followSurface: js.UndefOr[Boolean] = js.undefined,
    granularity: Int | Double = null,
    width: Int | Double = null
  ): AnonColors = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(colorsPerVertex)) __obj.updateDynamic("colorsPerVertex")(colorsPerVertex.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(followSurface)) __obj.updateDynamic("followSurface")(followSurface.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColors]
  }
}

