package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileHeight extends js.Object {
  var color: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var tileHeight: js.UndefOr[Double] = js.undefined
  var tileWidth: js.UndefOr[Double] = js.undefined
  var tilingScheme: js.UndefOr[typings.cesium.mod.TilingScheme] = js.undefined
}

object TileHeight {
  @scala.inline
  def apply(
    color: typings.cesium.mod.Color = null,
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    tileHeight: js.UndefOr[Double] = js.undefined,
    tileWidth: js.UndefOr[Double] = js.undefined,
    tilingScheme: typings.cesium.mod.TilingScheme = null
  ): TileHeight = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(tileHeight)) __obj.updateDynamic("tileHeight")(tileHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileWidth)) __obj.updateDynamic("tileWidth")(tileWidth.get.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileHeight]
  }
}

