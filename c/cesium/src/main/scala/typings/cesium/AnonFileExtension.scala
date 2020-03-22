package typings.cesium

import typings.cesium.mod.Credit
import typings.cesium.mod.Ellipsoid
import typings.cesium.mod.Rectangle
import typings.cesium.mod.TilingScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFileExtension extends js.Object {
  var credit: js.UndefOr[Credit | String] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var fileExtension: js.UndefOr[String] = js.undefined
  var maximumLevel: js.UndefOr[Double] = js.undefined
  var minimumLevel: js.UndefOr[Double] = js.undefined
  var proxy: js.UndefOr[js.Any] = js.undefined
  var rectangle: js.UndefOr[Rectangle] = js.undefined
  var tileHeight: js.UndefOr[Double] = js.undefined
  var tileWidth: js.UndefOr[Double] = js.undefined
  var tilingScheme: js.UndefOr[TilingScheme] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object AnonFileExtension {
  @scala.inline
  def apply(
    credit: Credit | String = null,
    ellipsoid: Ellipsoid = null,
    fileExtension: String = null,
    maximumLevel: Int | Double = null,
    minimumLevel: Int | Double = null,
    proxy: js.Any = null,
    rectangle: Rectangle = null,
    tileHeight: Int | Double = null,
    tileWidth: Int | Double = null,
    tilingScheme: TilingScheme = null,
    url: String = null
  ): AnonFileExtension = {
    val __obj = js.Dynamic.literal()
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (fileExtension != null) __obj.updateDynamic("fileExtension")(fileExtension.asInstanceOf[js.Any])
    if (maximumLevel != null) __obj.updateDynamic("maximumLevel")(maximumLevel.asInstanceOf[js.Any])
    if (minimumLevel != null) __obj.updateDynamic("minimumLevel")(minimumLevel.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    if (tileHeight != null) __obj.updateDynamic("tileHeight")(tileHeight.asInstanceOf[js.Any])
    if (tileWidth != null) __obj.updateDynamic("tileWidth")(tileWidth.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFileExtension]
  }
}

