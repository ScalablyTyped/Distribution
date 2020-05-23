package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaximumLevel extends js.Object {
  var credit: js.UndefOr[typings.cesium.mod.Credit | String] = js.undefined
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var fileExtension: js.UndefOr[String] = js.undefined
  var maximumLevel: js.UndefOr[Double] = js.undefined
  var minimumLevel: js.UndefOr[Double] = js.undefined
  var proxy: js.UndefOr[js.Any] = js.undefined
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object MaximumLevel {
  @scala.inline
  def apply(
    credit: typings.cesium.mod.Credit | String = null,
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    fileExtension: String = null,
    maximumLevel: js.UndefOr[Double] = js.undefined,
    minimumLevel: js.UndefOr[Double] = js.undefined,
    proxy: js.Any = null,
    rectangle: typings.cesium.mod.Rectangle = null,
    url: String = null
  ): MaximumLevel = {
    val __obj = js.Dynamic.literal()
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (fileExtension != null) __obj.updateDynamic("fileExtension")(fileExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumLevel)) __obj.updateDynamic("maximumLevel")(maximumLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumLevel)) __obj.updateDynamic("minimumLevel")(minimumLevel.get.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumLevel]
  }
}

