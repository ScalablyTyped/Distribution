package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreditEllipsoidEnablePickFeatures extends js.Object {
  var credit: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Credit | java.lang.String] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Ellipsoid] = js.undefined
  var enablePickFeatures: js.UndefOr[scala.Boolean] = js.undefined
  var getFeatureInfoFormats: js.UndefOr[js.Array[cesiumLib.cesiumMod.CesiumNs.GetFeatureInfoFormat]] = js.undefined
  var hasAlphaChannel: js.UndefOr[scala.Boolean] = js.undefined
  var maximumLevel: js.UndefOr[scala.Double] = js.undefined
  var minimumLevel: js.UndefOr[scala.Double] = js.undefined
  var pickFeaturesUrl: js.UndefOr[java.lang.String] = js.undefined
  var proxy: js.UndefOr[js.Object] = js.undefined
  var rectangle: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Rectangle] = js.undefined
  var subdomains: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var tileHeight: js.UndefOr[scala.Double] = js.undefined
  var tileWidth: js.UndefOr[scala.Double] = js.undefined
  var tilingScheme: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.TilingScheme] = js.undefined
  var url: java.lang.String
  var urlSchemeZeroPadding: js.UndefOr[js.Object] = js.undefined
}

object Anon_CreditEllipsoidEnablePickFeatures {
  @scala.inline
  def apply(
    url: java.lang.String,
    credit: cesiumLib.cesiumMod.CesiumNs.Credit | java.lang.String = null,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = null,
    enablePickFeatures: js.UndefOr[scala.Boolean] = js.undefined,
    getFeatureInfoFormats: js.Array[cesiumLib.cesiumMod.CesiumNs.GetFeatureInfoFormat] = null,
    hasAlphaChannel: js.UndefOr[scala.Boolean] = js.undefined,
    maximumLevel: scala.Int | scala.Double = null,
    minimumLevel: scala.Int | scala.Double = null,
    pickFeaturesUrl: java.lang.String = null,
    proxy: js.Object = null,
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle = null,
    subdomains: java.lang.String | js.Array[java.lang.String] = null,
    tileHeight: scala.Int | scala.Double = null,
    tileWidth: scala.Int | scala.Double = null,
    tilingScheme: cesiumLib.cesiumMod.CesiumNs.TilingScheme = null,
    urlSchemeZeroPadding: js.Object = null
  ): Anon_CreditEllipsoidEnablePickFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (!js.isUndefined(enablePickFeatures)) __obj.updateDynamic("enablePickFeatures")(enablePickFeatures)
    if (getFeatureInfoFormats != null) __obj.updateDynamic("getFeatureInfoFormats")(getFeatureInfoFormats)
    if (!js.isUndefined(hasAlphaChannel)) __obj.updateDynamic("hasAlphaChannel")(hasAlphaChannel)
    if (maximumLevel != null) __obj.updateDynamic("maximumLevel")(maximumLevel.asInstanceOf[js.Any])
    if (minimumLevel != null) __obj.updateDynamic("minimumLevel")(minimumLevel.asInstanceOf[js.Any])
    if (pickFeaturesUrl != null) __obj.updateDynamic("pickFeaturesUrl")(pickFeaturesUrl)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle)
    if (subdomains != null) __obj.updateDynamic("subdomains")(subdomains.asInstanceOf[js.Any])
    if (tileHeight != null) __obj.updateDynamic("tileHeight")(tileHeight.asInstanceOf[js.Any])
    if (tileWidth != null) __obj.updateDynamic("tileWidth")(tileWidth.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme)
    if (urlSchemeZeroPadding != null) __obj.updateDynamic("urlSchemeZeroPadding")(urlSchemeZeroPadding)
    __obj.asInstanceOf[Anon_CreditEllipsoidEnablePickFeatures]
  }
}

