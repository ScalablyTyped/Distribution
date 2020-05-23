package typings.cesium.anon

import typings.cesium.mod.TileDiscardPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnablePickFeatures extends js.Object {
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var enablePickFeatures: js.UndefOr[Boolean] = js.undefined
  var maximumLevel: js.UndefOr[Double] = js.undefined
  var proxy: js.UndefOr[typings.cesium.mod.Proxy] = js.undefined
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.undefined
  var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.undefined
  var tileHeight: js.UndefOr[Double] = js.undefined
  var tileWidth: js.UndefOr[Double] = js.undefined
  var tilingScheme: js.UndefOr[typings.cesium.mod.TilingScheme] = js.undefined
  var url: String
  var usePreCachedTilesIfAvailable: js.UndefOr[Boolean] = js.undefined
}

object EnablePickFeatures {
  @scala.inline
  def apply(
    url: String,
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    enablePickFeatures: js.UndefOr[Boolean] = js.undefined,
    maximumLevel: js.UndefOr[Double] = js.undefined,
    proxy: typings.cesium.mod.Proxy = null,
    rectangle: typings.cesium.mod.Rectangle = null,
    tileDiscardPolicy: TileDiscardPolicy = null,
    tileHeight: js.UndefOr[Double] = js.undefined,
    tileWidth: js.UndefOr[Double] = js.undefined,
    tilingScheme: typings.cesium.mod.TilingScheme = null,
    usePreCachedTilesIfAvailable: js.UndefOr[Boolean] = js.undefined
  ): EnablePickFeatures = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePickFeatures)) __obj.updateDynamic("enablePickFeatures")(enablePickFeatures.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumLevel)) __obj.updateDynamic("maximumLevel")(maximumLevel.get.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    if (tileDiscardPolicy != null) __obj.updateDynamic("tileDiscardPolicy")(tileDiscardPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(tileHeight)) __obj.updateDynamic("tileHeight")(tileHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileWidth)) __obj.updateDynamic("tileWidth")(tileWidth.get.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme.asInstanceOf[js.Any])
    if (!js.isUndefined(usePreCachedTilesIfAvailable)) __obj.updateDynamic("usePreCachedTilesIfAvailable")(usePreCachedTilesIfAvailable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnablePickFeatures]
  }
}

