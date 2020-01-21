package typings.cesium

import typings.cesium.mod.Credit
import typings.cesium.mod.Ellipsoid
import typings.cesium.mod.GetFeatureInfoFormat
import typings.cesium.mod.Rectangle
import typings.cesium.mod.TilingScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreditCrs extends js.Object {
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

object AnonCreditCrs {
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
  ): AnonCreditCrs = {
    val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (crs != null) __obj.updateDynamic("crs")(crs.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePickFeatures)) __obj.updateDynamic("enablePickFeatures")(enablePickFeatures.asInstanceOf[js.Any])
    if (getFeatureInfoFormats != null) __obj.updateDynamic("getFeatureInfoFormats")(getFeatureInfoFormats.asInstanceOf[js.Any])
    if (getFeatureInfoParameters != null) __obj.updateDynamic("getFeatureInfoParameters")(getFeatureInfoParameters.asInstanceOf[js.Any])
    if (maximumLevel != null) __obj.updateDynamic("maximumLevel")(maximumLevel.asInstanceOf[js.Any])
    if (minimumLevel != null) __obj.updateDynamic("minimumLevel")(minimumLevel.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    if (srs != null) __obj.updateDynamic("srs")(srs.asInstanceOf[js.Any])
    if (subdomains != null) __obj.updateDynamic("subdomains")(subdomains.asInstanceOf[js.Any])
    if (tileHeight != null) __obj.updateDynamic("tileHeight")(tileHeight.asInstanceOf[js.Any])
    if (tileWidth != null) __obj.updateDynamic("tileWidth")(tileWidth.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreditCrs]
  }
}

