package typings.cesium

import typings.cesium.mod.Ellipsoid
import typings.cesium.mod.Proxy
import typings.cesium.mod.Rectangle
import typings.cesium.mod.TileDiscardPolicy
import typings.cesium.mod.TilingScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnablePickFeatures extends js.Object {
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var enablePickFeatures: js.UndefOr[Boolean] = js.undefined
  var maximumLevel: js.UndefOr[Double] = js.undefined
  var proxy: js.UndefOr[Proxy] = js.undefined
  var rectangle: js.UndefOr[Rectangle] = js.undefined
  var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.undefined
  var tileHeight: js.UndefOr[Double] = js.undefined
  var tileWidth: js.UndefOr[Double] = js.undefined
  var tilingScheme: js.UndefOr[TilingScheme] = js.undefined
  var url: String
  var usePreCachedTilesIfAvailable: js.UndefOr[Boolean] = js.undefined
}

object AnonEnablePickFeatures {
  @scala.inline
  def apply(
    url: String,
    ellipsoid: Ellipsoid = null,
    enablePickFeatures: js.UndefOr[Boolean] = js.undefined,
    maximumLevel: Int | Double = null,
    proxy: Proxy = null,
    rectangle: Rectangle = null,
    tileDiscardPolicy: TileDiscardPolicy = null,
    tileHeight: Int | Double = null,
    tileWidth: Int | Double = null,
    tilingScheme: TilingScheme = null,
    usePreCachedTilesIfAvailable: js.UndefOr[Boolean] = js.undefined
  ): AnonEnablePickFeatures = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePickFeatures)) __obj.updateDynamic("enablePickFeatures")(enablePickFeatures.asInstanceOf[js.Any])
    if (maximumLevel != null) __obj.updateDynamic("maximumLevel")(maximumLevel.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    if (tileDiscardPolicy != null) __obj.updateDynamic("tileDiscardPolicy")(tileDiscardPolicy.asInstanceOf[js.Any])
    if (tileHeight != null) __obj.updateDynamic("tileHeight")(tileHeight.asInstanceOf[js.Any])
    if (tileWidth != null) __obj.updateDynamic("tileWidth")(tileWidth.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme.asInstanceOf[js.Any])
    if (!js.isUndefined(usePreCachedTilesIfAvailable)) __obj.updateDynamic("usePreCachedTilesIfAvailable")(usePreCachedTilesIfAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnablePickFeatures]
  }
}

