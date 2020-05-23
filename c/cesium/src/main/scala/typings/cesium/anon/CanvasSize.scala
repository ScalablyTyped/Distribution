package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasSize extends js.Object {
  var canvasSize: js.UndefOr[Double] = js.undefined
  var cells: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var glowColor: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  var glowWidth: js.UndefOr[Double] = js.undefined
  var tileHeight: js.UndefOr[Double] = js.undefined
  var tileWidth: js.UndefOr[Double] = js.undefined
  var tilingScheme: js.UndefOr[typings.cesium.mod.TilingScheme] = js.undefined
}

object CanvasSize {
  @scala.inline
  def apply(
    canvasSize: js.UndefOr[Double] = js.undefined,
    cells: js.UndefOr[Double] = js.undefined,
    color: typings.cesium.mod.Color = null,
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    glowColor: typings.cesium.mod.Color = null,
    glowWidth: js.UndefOr[Double] = js.undefined,
    tileHeight: js.UndefOr[Double] = js.undefined,
    tileWidth: js.UndefOr[Double] = js.undefined,
    tilingScheme: typings.cesium.mod.TilingScheme = null
  ): CanvasSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canvasSize)) __obj.updateDynamic("canvasSize")(canvasSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cells)) __obj.updateDynamic("cells")(cells.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (glowColor != null) __obj.updateDynamic("glowColor")(glowColor.asInstanceOf[js.Any])
    if (!js.isUndefined(glowWidth)) __obj.updateDynamic("glowWidth")(glowWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileHeight)) __obj.updateDynamic("tileHeight")(tileHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileWidth)) __obj.updateDynamic("tileWidth")(tileWidth.get.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasSize]
  }
}

