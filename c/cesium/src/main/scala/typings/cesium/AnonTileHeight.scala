package typings.cesium

import typings.cesium.mod.Color
import typings.cesium.mod.Ellipsoid
import typings.cesium.mod.TilingScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTileHeight extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var tileHeight: js.UndefOr[Double] = js.undefined
  var tileWidth: js.UndefOr[Double] = js.undefined
  var tilingScheme: js.UndefOr[TilingScheme] = js.undefined
}

object AnonTileHeight {
  @scala.inline
  def apply(
    color: Color = null,
    ellipsoid: Ellipsoid = null,
    tileHeight: Int | Double = null,
    tileWidth: Int | Double = null,
    tilingScheme: TilingScheme = null
  ): AnonTileHeight = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (tileHeight != null) __obj.updateDynamic("tileHeight")(tileHeight.asInstanceOf[js.Any])
    if (tileWidth != null) __obj.updateDynamic("tileWidth")(tileWidth.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTileHeight]
  }
}

