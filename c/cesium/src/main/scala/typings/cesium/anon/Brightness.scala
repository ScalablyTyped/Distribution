package typings.cesium.anon

import typings.cesium.mod.ImageryLayer.ValueFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Brightness extends js.Object {
  var alpha: js.UndefOr[Double | ValueFunc] = js.undefined
  var brightness: js.UndefOr[Double | ValueFunc] = js.undefined
  var contrast: js.UndefOr[Double | ValueFunc] = js.undefined
  var gamma: js.UndefOr[Double | ValueFunc] = js.undefined
  var hue: js.UndefOr[Double | ValueFunc] = js.undefined
  var maximumAnisotropy: js.UndefOr[Double] = js.undefined
  var maximumTerrainLevel: js.UndefOr[Double] = js.undefined
  var minimumTerrainLevel: js.UndefOr[Double] = js.undefined
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.undefined
  var saturation: js.UndefOr[Double | ValueFunc] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object Brightness {
  @scala.inline
  def apply(
    alpha: Double | ValueFunc = null,
    brightness: Double | ValueFunc = null,
    contrast: Double | ValueFunc = null,
    gamma: Double | ValueFunc = null,
    hue: Double | ValueFunc = null,
    maximumAnisotropy: js.UndefOr[Double] = js.undefined,
    maximumTerrainLevel: js.UndefOr[Double] = js.undefined,
    minimumTerrainLevel: js.UndefOr[Double] = js.undefined,
    rectangle: typings.cesium.mod.Rectangle = null,
    saturation: Double | ValueFunc = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): Brightness = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (brightness != null) __obj.updateDynamic("brightness")(brightness.asInstanceOf[js.Any])
    if (contrast != null) __obj.updateDynamic("contrast")(contrast.asInstanceOf[js.Any])
    if (gamma != null) __obj.updateDynamic("gamma")(gamma.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumAnisotropy)) __obj.updateDynamic("maximumAnisotropy")(maximumAnisotropy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumTerrainLevel)) __obj.updateDynamic("maximumTerrainLevel")(maximumTerrainLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumTerrainLevel)) __obj.updateDynamic("minimumTerrainLevel")(minimumTerrainLevel.get.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    if (saturation != null) __obj.updateDynamic("saturation")(saturation.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brightness]
  }
}

