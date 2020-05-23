package typings.cesium.anon

import typings.cesium.mod.GetFeatureInfoFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFeatureInfoFormats extends js.Object {
  var credit: js.UndefOr[typings.cesium.mod.Credit | String] = js.undefined
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var enablePickFeatures: js.UndefOr[Boolean] = js.undefined
  var getFeatureInfoFormats: js.UndefOr[js.Array[GetFeatureInfoFormat]] = js.undefined
  var hasAlphaChannel: js.UndefOr[Boolean] = js.undefined
  var maximumLevel: js.UndefOr[Double] = js.undefined
  var minimumLevel: js.UndefOr[Double] = js.undefined
  var pickFeaturesUrl: js.UndefOr[String] = js.undefined
  var proxy: js.UndefOr[js.Object] = js.undefined
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.undefined
  var subdomains: js.UndefOr[String | js.Array[String]] = js.undefined
  var tileHeight: js.UndefOr[Double] = js.undefined
  var tileWidth: js.UndefOr[Double] = js.undefined
  var tilingScheme: js.UndefOr[typings.cesium.mod.TilingScheme] = js.undefined
  var url: String
  var urlSchemeZeroPadding: js.UndefOr[js.Object] = js.undefined
}

object GetFeatureInfoFormats {
  @scala.inline
  def apply(
    url: String,
    credit: typings.cesium.mod.Credit | String = null,
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    enablePickFeatures: js.UndefOr[Boolean] = js.undefined,
    getFeatureInfoFormats: js.Array[GetFeatureInfoFormat] = null,
    hasAlphaChannel: js.UndefOr[Boolean] = js.undefined,
    maximumLevel: js.UndefOr[Double] = js.undefined,
    minimumLevel: js.UndefOr[Double] = js.undefined,
    pickFeaturesUrl: String = null,
    proxy: js.Object = null,
    rectangle: typings.cesium.mod.Rectangle = null,
    subdomains: String | js.Array[String] = null,
    tileHeight: js.UndefOr[Double] = js.undefined,
    tileWidth: js.UndefOr[Double] = js.undefined,
    tilingScheme: typings.cesium.mod.TilingScheme = null,
    urlSchemeZeroPadding: js.Object = null
  ): GetFeatureInfoFormats = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePickFeatures)) __obj.updateDynamic("enablePickFeatures")(enablePickFeatures.get.asInstanceOf[js.Any])
    if (getFeatureInfoFormats != null) __obj.updateDynamic("getFeatureInfoFormats")(getFeatureInfoFormats.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAlphaChannel)) __obj.updateDynamic("hasAlphaChannel")(hasAlphaChannel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumLevel)) __obj.updateDynamic("maximumLevel")(maximumLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumLevel)) __obj.updateDynamic("minimumLevel")(minimumLevel.get.asInstanceOf[js.Any])
    if (pickFeaturesUrl != null) __obj.updateDynamic("pickFeaturesUrl")(pickFeaturesUrl.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    if (subdomains != null) __obj.updateDynamic("subdomains")(subdomains.asInstanceOf[js.Any])
    if (!js.isUndefined(tileHeight)) __obj.updateDynamic("tileHeight")(tileHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileWidth)) __obj.updateDynamic("tileWidth")(tileWidth.get.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme.asInstanceOf[js.Any])
    if (urlSchemeZeroPadding != null) __obj.updateDynamic("urlSchemeZeroPadding")(urlSchemeZeroPadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFeatureInfoFormats]
  }
}

