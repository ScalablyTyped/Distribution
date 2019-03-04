package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreditCrs extends js.Object {
  var credit: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Credit | java.lang.String] = js.undefined
  var crs: js.UndefOr[java.lang.String] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Ellipsoid] = js.undefined
  var enablePickFeatures: js.UndefOr[scala.Boolean] = js.undefined
  var getFeatureInfoFormats: js.UndefOr[js.Array[cesiumLib.cesiumMod.CesiumNs.GetFeatureInfoFormat]] = js.undefined
  var getFeatureInfoParameters: js.UndefOr[js.Any] = js.undefined
  var layers: java.lang.String
  var maximumLevel: js.UndefOr[scala.Double] = js.undefined
  var minimumLevel: js.UndefOr[scala.Double] = js.undefined
  var parameters: js.UndefOr[js.Any] = js.undefined
  var rectangle: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Rectangle] = js.undefined
  var srs: js.UndefOr[java.lang.String] = js.undefined
  var subdomains: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var tileHeight: js.UndefOr[scala.Double] = js.undefined
  var tileWidth: js.UndefOr[scala.Double] = js.undefined
  var tilingScheme: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.TilingScheme] = js.undefined
  var url: java.lang.String
}

object Anon_CreditCrs {
  @scala.inline
  def apply(
    layers: java.lang.String,
    url: java.lang.String,
    credit: cesiumLib.cesiumMod.CesiumNs.Credit | java.lang.String = null,
    crs: java.lang.String = null,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = null,
    enablePickFeatures: js.UndefOr[scala.Boolean] = js.undefined,
    getFeatureInfoFormats: js.Array[cesiumLib.cesiumMod.CesiumNs.GetFeatureInfoFormat] = null,
    getFeatureInfoParameters: js.Any = null,
    maximumLevel: scala.Int | scala.Double = null,
    minimumLevel: scala.Int | scala.Double = null,
    parameters: js.Any = null,
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle = null,
    srs: java.lang.String = null,
    subdomains: java.lang.String | js.Array[java.lang.String] = null,
    tileHeight: scala.Int | scala.Double = null,
    tileWidth: scala.Int | scala.Double = null,
    tilingScheme: cesiumLib.cesiumMod.CesiumNs.TilingScheme = null
  ): Anon_CreditCrs = {
    val __obj = js.Dynamic.literal(layers = layers, url = url)
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (crs != null) __obj.updateDynamic("crs")(crs)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (!js.isUndefined(enablePickFeatures)) __obj.updateDynamic("enablePickFeatures")(enablePickFeatures)
    if (getFeatureInfoFormats != null) __obj.updateDynamic("getFeatureInfoFormats")(getFeatureInfoFormats)
    if (getFeatureInfoParameters != null) __obj.updateDynamic("getFeatureInfoParameters")(getFeatureInfoParameters)
    if (maximumLevel != null) __obj.updateDynamic("maximumLevel")(maximumLevel.asInstanceOf[js.Any])
    if (minimumLevel != null) __obj.updateDynamic("minimumLevel")(minimumLevel.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle)
    if (srs != null) __obj.updateDynamic("srs")(srs)
    if (subdomains != null) __obj.updateDynamic("subdomains")(subdomains.asInstanceOf[js.Any])
    if (tileHeight != null) __obj.updateDynamic("tileHeight")(tileHeight.asInstanceOf[js.Any])
    if (tileWidth != null) __obj.updateDynamic("tileWidth")(tileWidth.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme)
    __obj.asInstanceOf[Anon_CreditCrs]
  }
}

