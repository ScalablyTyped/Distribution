package typings.cesium

import typings.cesium.cesiumMod.Credit
import typings.cesium.cesiumMod.Ellipsoid
import typings.cesium.cesiumMod.GetFeatureInfoFormat
import typings.cesium.cesiumMod.Rectangle
import typings.cesium.cesiumMod.TilingScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreditEllipsoidEnablePickFeatures extends js.Object {
  var credit: js.UndefOr[Credit | String] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var enablePickFeatures: js.UndefOr[Boolean] = js.undefined
  var getFeatureInfoFormats: js.UndefOr[js.Array[GetFeatureInfoFormat]] = js.undefined
  var hasAlphaChannel: js.UndefOr[Boolean] = js.undefined
  var maximumLevel: js.UndefOr[Double] = js.undefined
  var minimumLevel: js.UndefOr[Double] = js.undefined
  var pickFeaturesUrl: js.UndefOr[String] = js.undefined
  var proxy: js.UndefOr[js.Object] = js.undefined
  var rectangle: js.UndefOr[Rectangle] = js.undefined
  var subdomains: js.UndefOr[String | js.Array[String]] = js.undefined
  var tileHeight: js.UndefOr[Double] = js.undefined
  var tileWidth: js.UndefOr[Double] = js.undefined
  var tilingScheme: js.UndefOr[TilingScheme] = js.undefined
  var url: String
  var urlSchemeZeroPadding: js.UndefOr[js.Object] = js.undefined
}

object Anon_CreditEllipsoidEnablePickFeatures {
  @scala.inline
  def apply(
    url: String,
    credit: Credit | String = null,
    ellipsoid: Ellipsoid = null,
    enablePickFeatures: js.UndefOr[Boolean] = js.undefined,
    getFeatureInfoFormats: js.Array[GetFeatureInfoFormat] = null,
    hasAlphaChannel: js.UndefOr[Boolean] = js.undefined,
    maximumLevel: Int | Double = null,
    minimumLevel: Int | Double = null,
    pickFeaturesUrl: String = null,
    proxy: js.Object = null,
    rectangle: Rectangle = null,
    subdomains: String | js.Array[String] = null,
    tileHeight: Int | Double = null,
    tileWidth: Int | Double = null,
    tilingScheme: TilingScheme = null,
    urlSchemeZeroPadding: js.Object = null
  ): Anon_CreditEllipsoidEnablePickFeatures = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePickFeatures)) __obj.updateDynamic("enablePickFeatures")(enablePickFeatures.asInstanceOf[js.Any])
    if (getFeatureInfoFormats != null) __obj.updateDynamic("getFeatureInfoFormats")(getFeatureInfoFormats.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAlphaChannel)) __obj.updateDynamic("hasAlphaChannel")(hasAlphaChannel.asInstanceOf[js.Any])
    if (maximumLevel != null) __obj.updateDynamic("maximumLevel")(maximumLevel.asInstanceOf[js.Any])
    if (minimumLevel != null) __obj.updateDynamic("minimumLevel")(minimumLevel.asInstanceOf[js.Any])
    if (pickFeaturesUrl != null) __obj.updateDynamic("pickFeaturesUrl")(pickFeaturesUrl.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    if (subdomains != null) __obj.updateDynamic("subdomains")(subdomains.asInstanceOf[js.Any])
    if (tileHeight != null) __obj.updateDynamic("tileHeight")(tileHeight.asInstanceOf[js.Any])
    if (tileWidth != null) __obj.updateDynamic("tileWidth")(tileWidth.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme.asInstanceOf[js.Any])
    if (urlSchemeZeroPadding != null) __obj.updateDynamic("urlSchemeZeroPadding")(urlSchemeZeroPadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CreditEllipsoidEnablePickFeatures]
  }
}

