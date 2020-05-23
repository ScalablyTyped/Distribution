package typings.cesium.anon

import typings.cesium.mod.GetFeatureInfoFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Crs extends js.Object {
  var credit: js.UndefOr[typings.cesium.mod.Credit | String] = js.undefined
  var crs: js.UndefOr[String] = js.undefined
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var enablePickFeatures: js.UndefOr[Boolean] = js.undefined
  var getFeatureInfoFormats: js.UndefOr[js.Array[GetFeatureInfoFormat]] = js.undefined
  var getFeatureInfoParameters: js.UndefOr[js.Any] = js.undefined
  var layers: String
  var maximumLevel: js.UndefOr[Double] = js.undefined
  var minimumLevel: js.UndefOr[Double] = js.undefined
  var parameters: js.UndefOr[js.Any] = js.undefined
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.undefined
  var srs: js.UndefOr[String] = js.undefined
  var subdomains: js.UndefOr[String | js.Array[String]] = js.undefined
  var tileHeight: js.UndefOr[Double] = js.undefined
  var tileWidth: js.UndefOr[Double] = js.undefined
  var tilingScheme: js.UndefOr[typings.cesium.mod.TilingScheme] = js.undefined
  var url: String
}

object Crs {
  @scala.inline
  def apply(
    layers: String,
    url: String,
    credit: typings.cesium.mod.Credit | String = null,
    crs: String = null,
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    enablePickFeatures: js.UndefOr[Boolean] = js.undefined,
    getFeatureInfoFormats: js.Array[GetFeatureInfoFormat] = null,
    getFeatureInfoParameters: js.Any = null,
    maximumLevel: js.UndefOr[Double] = js.undefined,
    minimumLevel: js.UndefOr[Double] = js.undefined,
    parameters: js.Any = null,
    rectangle: typings.cesium.mod.Rectangle = null,
    srs: String = null,
    subdomains: String | js.Array[String] = null,
    tileHeight: js.UndefOr[Double] = js.undefined,
    tileWidth: js.UndefOr[Double] = js.undefined,
    tilingScheme: typings.cesium.mod.TilingScheme = null
  ): Crs = {
    val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (crs != null) __obj.updateDynamic("crs")(crs.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePickFeatures)) __obj.updateDynamic("enablePickFeatures")(enablePickFeatures.get.asInstanceOf[js.Any])
    if (getFeatureInfoFormats != null) __obj.updateDynamic("getFeatureInfoFormats")(getFeatureInfoFormats.asInstanceOf[js.Any])
    if (getFeatureInfoParameters != null) __obj.updateDynamic("getFeatureInfoParameters")(getFeatureInfoParameters.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumLevel)) __obj.updateDynamic("maximumLevel")(maximumLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumLevel)) __obj.updateDynamic("minimumLevel")(minimumLevel.get.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    if (srs != null) __obj.updateDynamic("srs")(srs.asInstanceOf[js.Any])
    if (subdomains != null) __obj.updateDynamic("subdomains")(subdomains.asInstanceOf[js.Any])
    if (!js.isUndefined(tileHeight)) __obj.updateDynamic("tileHeight")(tileHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileWidth)) __obj.updateDynamic("tileWidth")(tileWidth.get.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crs]
  }
}

