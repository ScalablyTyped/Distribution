package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EllipsoidEnablePickFeatures extends js.Object {
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.Ellipsoid] = js.undefined
  var enablePickFeatures: js.UndefOr[scala.Boolean] = js.undefined
  var maximumLevel: js.UndefOr[scala.Double] = js.undefined
  var proxy: js.UndefOr[cesiumLib.cesiumMod.Proxy] = js.undefined
  var rectangle: js.UndefOr[cesiumLib.cesiumMod.Rectangle] = js.undefined
  var tileDiscardPolicy: js.UndefOr[cesiumLib.cesiumMod.TileDiscardPolicy] = js.undefined
  var tileHeight: js.UndefOr[scala.Double] = js.undefined
  var tileWidth: js.UndefOr[scala.Double] = js.undefined
  var tilingScheme: js.UndefOr[cesiumLib.cesiumMod.TilingScheme] = js.undefined
  var url: java.lang.String
  var usePreCachedTilesIfAvailable: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_EllipsoidEnablePickFeatures {
  @scala.inline
  def apply(
    url: java.lang.String,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid = null,
    enablePickFeatures: js.UndefOr[scala.Boolean] = js.undefined,
    maximumLevel: scala.Int | scala.Double = null,
    proxy: cesiumLib.cesiumMod.Proxy = null,
    rectangle: cesiumLib.cesiumMod.Rectangle = null,
    tileDiscardPolicy: cesiumLib.cesiumMod.TileDiscardPolicy = null,
    tileHeight: scala.Int | scala.Double = null,
    tileWidth: scala.Int | scala.Double = null,
    tilingScheme: cesiumLib.cesiumMod.TilingScheme = null,
    usePreCachedTilesIfAvailable: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_EllipsoidEnablePickFeatures = {
    val __obj = js.Dynamic.literal(url = url)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (!js.isUndefined(enablePickFeatures)) __obj.updateDynamic("enablePickFeatures")(enablePickFeatures)
    if (maximumLevel != null) __obj.updateDynamic("maximumLevel")(maximumLevel.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle)
    if (tileDiscardPolicy != null) __obj.updateDynamic("tileDiscardPolicy")(tileDiscardPolicy)
    if (tileHeight != null) __obj.updateDynamic("tileHeight")(tileHeight.asInstanceOf[js.Any])
    if (tileWidth != null) __obj.updateDynamic("tileWidth")(tileWidth.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme)
    if (!js.isUndefined(usePreCachedTilesIfAvailable)) __obj.updateDynamic("usePreCachedTilesIfAvailable")(usePreCachedTilesIfAvailable)
    __obj.asInstanceOf[Anon_EllipsoidEnablePickFeatures]
  }
}

