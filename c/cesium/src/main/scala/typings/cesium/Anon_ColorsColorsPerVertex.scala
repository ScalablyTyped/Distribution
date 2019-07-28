package typings.cesium

import typings.cesium.cesiumMod.Cartesian3
import typings.cesium.cesiumMod.Color
import typings.cesium.cesiumMod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorsColorsPerVertex extends js.Object {
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  var colorsPerVertex: js.UndefOr[Boolean] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var followSurface: js.UndefOr[Boolean] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var positions: js.Array[Cartesian3]
}

object Anon_ColorsColorsPerVertex {
  @scala.inline
  def apply(
    positions: js.Array[Cartesian3],
    colors: js.Array[Color] = null,
    colorsPerVertex: js.UndefOr[Boolean] = js.undefined,
    ellipsoid: Ellipsoid = null,
    followSurface: js.UndefOr[Boolean] = js.undefined,
    granularity: Int | Double = null
  ): Anon_ColorsColorsPerVertex = {
    val __obj = js.Dynamic.literal(positions = positions)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (!js.isUndefined(colorsPerVertex)) __obj.updateDynamic("colorsPerVertex")(colorsPerVertex)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (!js.isUndefined(followSurface)) __obj.updateDynamic("followSurface")(followSurface)
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorsColorsPerVertex]
  }
}

