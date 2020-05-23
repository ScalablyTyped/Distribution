package typings.cesium.anon

import typings.cesium.mod.TimeIntervalCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clock extends js.Object {
  var clock: js.UndefOr[typings.cesium.mod.Clock] = js.undefined
  var credit: js.UndefOr[typings.cesium.mod.Credit | String] = js.undefined
  var dimensions: js.UndefOr[js.Any] = js.undefined
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var layer: String
  var maximumLevel: js.UndefOr[Double] = js.undefined
  var minimumLevel: js.UndefOr[Double] = js.undefined
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.undefined
  var style: String
  var subdomains: js.UndefOr[String | js.Array[String]] = js.undefined
  var tileHeight: js.UndefOr[Double] = js.undefined
  var tileMatrixLabels: js.UndefOr[js.Array[_]] = js.undefined
  var tileMatrixSetID: String
  var tileWidth: js.UndefOr[Double] = js.undefined
  var tilingScheme: js.UndefOr[typings.cesium.mod.TilingScheme] = js.undefined
  var times: js.UndefOr[TimeIntervalCollection] = js.undefined
  var url: String
}

object Clock {
  @scala.inline
  def apply(
    layer: String,
    style: String,
    tileMatrixSetID: String,
    url: String,
    clock: typings.cesium.mod.Clock = null,
    credit: typings.cesium.mod.Credit | String = null,
    dimensions: js.Any = null,
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    format: String = null,
    maximumLevel: js.UndefOr[Double] = js.undefined,
    minimumLevel: js.UndefOr[Double] = js.undefined,
    rectangle: typings.cesium.mod.Rectangle = null,
    subdomains: String | js.Array[String] = null,
    tileHeight: js.UndefOr[Double] = js.undefined,
    tileMatrixLabels: js.Array[_] = null,
    tileWidth: js.UndefOr[Double] = js.undefined,
    tilingScheme: typings.cesium.mod.TilingScheme = null,
    times: TimeIntervalCollection = null
  ): Clock = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tileMatrixSetID = tileMatrixSetID.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (clock != null) __obj.updateDynamic("clock")(clock.asInstanceOf[js.Any])
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumLevel)) __obj.updateDynamic("maximumLevel")(maximumLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumLevel)) __obj.updateDynamic("minimumLevel")(minimumLevel.get.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    if (subdomains != null) __obj.updateDynamic("subdomains")(subdomains.asInstanceOf[js.Any])
    if (!js.isUndefined(tileHeight)) __obj.updateDynamic("tileHeight")(tileHeight.get.asInstanceOf[js.Any])
    if (tileMatrixLabels != null) __obj.updateDynamic("tileMatrixLabels")(tileMatrixLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(tileWidth)) __obj.updateDynamic("tileWidth")(tileWidth.get.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme.asInstanceOf[js.Any])
    if (times != null) __obj.updateDynamic("times")(times.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clock]
  }
}

