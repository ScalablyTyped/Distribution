package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colors extends js.Object {
  var colors: js.UndefOr[js.Array[typings.cesium.mod.Color]] = js.undefined
  var colorsPerVertex: js.UndefOr[Boolean] = js.undefined
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var followSurface: js.UndefOr[Boolean] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var positions: js.Array[Cartesian3]
}

object Colors {
  @scala.inline
  def apply(
    positions: js.Array[Cartesian3],
    colors: js.Array[typings.cesium.mod.Color] = null,
    colorsPerVertex: js.UndefOr[Boolean] = js.undefined,
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    followSurface: js.UndefOr[Boolean] = js.undefined,
    granularity: js.UndefOr[Double] = js.undefined
  ): Colors = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(colorsPerVertex)) __obj.updateDynamic("colorsPerVertex")(colorsPerVertex.get.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(followSurface)) __obj.updateDynamic("followSurface")(followSurface.get.asInstanceOf[js.Any])
    if (!js.isUndefined(granularity)) __obj.updateDynamic("granularity")(granularity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
}

