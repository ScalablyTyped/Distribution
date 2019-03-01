package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clock extends js.Object {
  var clock: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Clock] = js.undefined
  var credit: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Credit | java.lang.String] = js.undefined
  var dimensions: js.UndefOr[js.Any] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Ellipsoid] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var layer: java.lang.String
  var maximumLevel: js.UndefOr[scala.Double] = js.undefined
  var minimumLevel: js.UndefOr[scala.Double] = js.undefined
  var rectangle: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Rectangle] = js.undefined
  var style: java.lang.String
  var subdomains: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var tileHeight: js.UndefOr[scala.Double] = js.undefined
  var tileMatrixLabels: js.UndefOr[js.Array[_]] = js.undefined
  var tileMatrixSetID: java.lang.String
  var tileWidth: js.UndefOr[scala.Double] = js.undefined
  var tilingScheme: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.TilingScheme] = js.undefined
  var times: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.TimeIntervalCollection] = js.undefined
  var url: java.lang.String
}

object Anon_Clock {
  @scala.inline
  def apply(
    layer: java.lang.String,
    style: java.lang.String,
    tileMatrixSetID: java.lang.String,
    url: java.lang.String,
    clock: cesiumLib.cesiumMod.CesiumNs.Clock = null,
    credit: cesiumLib.cesiumMod.CesiumNs.Credit | java.lang.String = null,
    dimensions: js.Any = null,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = null,
    format: java.lang.String = null,
    maximumLevel: scala.Int | scala.Double = null,
    minimumLevel: scala.Int | scala.Double = null,
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle = null,
    subdomains: java.lang.String | js.Array[java.lang.String] = null,
    tileHeight: scala.Int | scala.Double = null,
    tileMatrixLabels: js.Array[_] = null,
    tileWidth: scala.Int | scala.Double = null,
    tilingScheme: cesiumLib.cesiumMod.CesiumNs.TilingScheme = null,
    times: cesiumLib.cesiumMod.CesiumNs.TimeIntervalCollection = null
  ): Anon_Clock = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("layer")(layer)
    __obj.updateDynamic("style")(style)
    __obj.updateDynamic("tileMatrixSetID")(tileMatrixSetID)
    __obj.updateDynamic("url")(url)
    if (clock != null) __obj.updateDynamic("clock")(clock)
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (format != null) __obj.updateDynamic("format")(format)
    if (maximumLevel != null) __obj.updateDynamic("maximumLevel")(maximumLevel.asInstanceOf[js.Any])
    if (minimumLevel != null) __obj.updateDynamic("minimumLevel")(minimumLevel.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle)
    if (subdomains != null) __obj.updateDynamic("subdomains")(subdomains.asInstanceOf[js.Any])
    if (tileHeight != null) __obj.updateDynamic("tileHeight")(tileHeight.asInstanceOf[js.Any])
    if (tileMatrixLabels != null) __obj.updateDynamic("tileMatrixLabels")(tileMatrixLabels)
    if (tileWidth != null) __obj.updateDynamic("tileWidth")(tileWidth.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme)
    if (times != null) __obj.updateDynamic("times")(times)
    __obj.asInstanceOf[Anon_Clock]
  }
}

