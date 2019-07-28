package typings.cesium

import typings.cesium.cesiumMod.Credit
import typings.cesium.cesiumMod.Ellipsoid
import typings.cesium.cesiumMod.GetFeatureInfoFormat
import typings.cesium.cesiumMod.Rectangle
import typings.cesium.cesiumMod.TilingScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreditCrs extends js.Object {
  var credit: js.UndefOr[Credit | String] = js.undefined
  var crs: js.UndefOr[String] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var enablePickFeatures: js.UndefOr[Boolean] = js.undefined
  var getFeatureInfoFormats: js.UndefOr[js.Array[GetFeatureInfoFormat]] = js.undefined
  var getFeatureInfoParameters: js.UndefOr[js.Any] = js.undefined
  var layers: String
  var maximumLevel: js.UndefOr[Double] = js.undefined
  var minimumLevel: js.UndefOr[Double] = js.undefined
  var parameters: js.UndefOr[js.Any] = js.undefined
  var rectangle: js.UndefOr[Rectangle] = js.undefined
  var srs: js.UndefOr[String] = js.undefined
  var subdomains: js.UndefOr[String | js.Array[String]] = js.undefined
  var tileHeight: js.UndefOr[Double] = js.undefined
  var tileWidth: js.UndefOr[Double] = js.undefined
  var tilingScheme: js.UndefOr[TilingScheme] = js.undefined
  var url: String
}

object Anon_CreditCrs {
  @scala.inline
  def apply(
    layers: String,
    url: String,
    credit: Credit | String = null,
    crs: String = null,
    ellipsoid: Ellipsoid = null,
    enablePickFeatures: js.UndefOr[Boolean] = js.undefined,
    getFeatureInfoFormats: js.Array[GetFeatureInfoFormat] = null,
    getFeatureInfoParameters: js.Any = null,
    maximumLevel: Int | Double = null,
    minimumLevel: Int | Double = null,
    parameters: js.Any = null,
    rectangle: Rectangle = null,
    srs: String = null,
    subdomains: String | js.Array[String] = null,
    tileHeight: Int | Double = null,
    tileWidth: Int | Double = null,
    tilingScheme: TilingScheme = null
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

