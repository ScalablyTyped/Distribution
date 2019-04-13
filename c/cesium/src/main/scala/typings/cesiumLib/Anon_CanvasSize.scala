package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanvasSize extends js.Object {
  var canvasSize: js.UndefOr[scala.Double] = js.undefined
  var cells: js.UndefOr[scala.Double] = js.undefined
  var color: js.UndefOr[cesiumLib.cesiumMod.Color] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.Ellipsoid] = js.undefined
  var glowColor: js.UndefOr[cesiumLib.cesiumMod.Color] = js.undefined
  var glowWidth: js.UndefOr[scala.Double] = js.undefined
  var tileHeight: js.UndefOr[scala.Double] = js.undefined
  var tileWidth: js.UndefOr[scala.Double] = js.undefined
  var tilingScheme: js.UndefOr[cesiumLib.cesiumMod.TilingScheme] = js.undefined
}

object Anon_CanvasSize {
  @scala.inline
  def apply(
    canvasSize: scala.Int | scala.Double = null,
    cells: scala.Int | scala.Double = null,
    color: cesiumLib.cesiumMod.Color = null,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid = null,
    glowColor: cesiumLib.cesiumMod.Color = null,
    glowWidth: scala.Int | scala.Double = null,
    tileHeight: scala.Int | scala.Double = null,
    tileWidth: scala.Int | scala.Double = null,
    tilingScheme: cesiumLib.cesiumMod.TilingScheme = null
  ): Anon_CanvasSize = {
    val __obj = js.Dynamic.literal()
    if (canvasSize != null) __obj.updateDynamic("canvasSize")(canvasSize.asInstanceOf[js.Any])
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (glowColor != null) __obj.updateDynamic("glowColor")(glowColor)
    if (glowWidth != null) __obj.updateDynamic("glowWidth")(glowWidth.asInstanceOf[js.Any])
    if (tileHeight != null) __obj.updateDynamic("tileHeight")(tileHeight.asInstanceOf[js.Any])
    if (tileWidth != null) __obj.updateDynamic("tileWidth")(tileWidth.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme)
    __obj.asInstanceOf[Anon_CanvasSize]
  }
}

