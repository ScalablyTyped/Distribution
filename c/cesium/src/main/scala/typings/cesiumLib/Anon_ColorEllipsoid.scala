package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorEllipsoid extends js.Object {
  var color: js.UndefOr[cesiumLib.cesiumMod.Color] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.Ellipsoid] = js.undefined
  var tileHeight: js.UndefOr[scala.Double] = js.undefined
  var tileWidth: js.UndefOr[scala.Double] = js.undefined
  var tilingScheme: js.UndefOr[cesiumLib.cesiumMod.TilingScheme] = js.undefined
}

object Anon_ColorEllipsoid {
  @scala.inline
  def apply(
    color: cesiumLib.cesiumMod.Color = null,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid = null,
    tileHeight: scala.Int | scala.Double = null,
    tileWidth: scala.Int | scala.Double = null,
    tilingScheme: cesiumLib.cesiumMod.TilingScheme = null
  ): Anon_ColorEllipsoid = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (tileHeight != null) __obj.updateDynamic("tileHeight")(tileHeight.asInstanceOf[js.Any])
    if (tileWidth != null) __obj.updateDynamic("tileWidth")(tileWidth.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme)
    __obj.asInstanceOf[Anon_ColorEllipsoid]
  }
}

