package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreditEllipsoidFileExtensionFlipXY extends js.Object {
  var credit: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Credit | java.lang.String] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Ellipsoid] = js.undefined
  var fileExtension: js.UndefOr[java.lang.String] = js.undefined
  var flipXY: js.UndefOr[scala.Boolean] = js.undefined
  var maximumLevel: js.UndefOr[scala.Double] = js.undefined
  var minimumLevel: js.UndefOr[scala.Double] = js.undefined
  var rectangle: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Rectangle] = js.undefined
  var tileHeight: js.UndefOr[scala.Double] = js.undefined
  var tileWidth: js.UndefOr[scala.Double] = js.undefined
  var tilingScheme: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.TilingScheme] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CreditEllipsoidFileExtensionFlipXY {
  @scala.inline
  def apply(
    credit: cesiumLib.cesiumMod.CesiumNs.Credit | java.lang.String = null,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = null,
    fileExtension: java.lang.String = null,
    flipXY: js.UndefOr[scala.Boolean] = js.undefined,
    maximumLevel: scala.Int | scala.Double = null,
    minimumLevel: scala.Int | scala.Double = null,
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle = null,
    tileHeight: scala.Int | scala.Double = null,
    tileWidth: scala.Int | scala.Double = null,
    tilingScheme: cesiumLib.cesiumMod.CesiumNs.TilingScheme = null,
    url: java.lang.String = null
  ): Anon_CreditEllipsoidFileExtensionFlipXY = {
    val __obj = js.Dynamic.literal()
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (fileExtension != null) __obj.updateDynamic("fileExtension")(fileExtension)
    if (!js.isUndefined(flipXY)) __obj.updateDynamic("flipXY")(flipXY)
    if (maximumLevel != null) __obj.updateDynamic("maximumLevel")(maximumLevel.asInstanceOf[js.Any])
    if (minimumLevel != null) __obj.updateDynamic("minimumLevel")(minimumLevel.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle)
    if (tileHeight != null) __obj.updateDynamic("tileHeight")(tileHeight.asInstanceOf[js.Any])
    if (tileWidth != null) __obj.updateDynamic("tileWidth")(tileWidth.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_CreditEllipsoidFileExtensionFlipXY]
  }
}

