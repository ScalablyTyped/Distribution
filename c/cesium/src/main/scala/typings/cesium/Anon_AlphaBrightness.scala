package typings.cesium

import typings.cesium.cesiumMod.ImageryLayerNs.ValueFunc
import typings.cesium.cesiumMod.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlphaBrightness extends js.Object {
  var alpha: js.UndefOr[Double | ValueFunc] = js.undefined
  var brightness: js.UndefOr[Double | ValueFunc] = js.undefined
  var contrast: js.UndefOr[Double | ValueFunc] = js.undefined
  var gamma: js.UndefOr[Double | ValueFunc] = js.undefined
  var hue: js.UndefOr[Double | ValueFunc] = js.undefined
  var maximumAnisotropy: js.UndefOr[Double] = js.undefined
  var maximumTerrainLevel: js.UndefOr[Double] = js.undefined
  var minimumTerrainLevel: js.UndefOr[Double] = js.undefined
  var rectangle: js.UndefOr[Rectangle] = js.undefined
  var saturation: js.UndefOr[Double | ValueFunc] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object Anon_AlphaBrightness {
  @scala.inline
  def apply(
    alpha: Double | ValueFunc = null,
    brightness: Double | ValueFunc = null,
    contrast: Double | ValueFunc = null,
    gamma: Double | ValueFunc = null,
    hue: Double | ValueFunc = null,
    maximumAnisotropy: Int | Double = null,
    maximumTerrainLevel: Int | Double = null,
    minimumTerrainLevel: Int | Double = null,
    rectangle: Rectangle = null,
    saturation: Double | ValueFunc = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): Anon_AlphaBrightness = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (brightness != null) __obj.updateDynamic("brightness")(brightness.asInstanceOf[js.Any])
    if (contrast != null) __obj.updateDynamic("contrast")(contrast.asInstanceOf[js.Any])
    if (gamma != null) __obj.updateDynamic("gamma")(gamma.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (maximumAnisotropy != null) __obj.updateDynamic("maximumAnisotropy")(maximumAnisotropy.asInstanceOf[js.Any])
    if (maximumTerrainLevel != null) __obj.updateDynamic("maximumTerrainLevel")(maximumTerrainLevel.asInstanceOf[js.Any])
    if (minimumTerrainLevel != null) __obj.updateDynamic("minimumTerrainLevel")(minimumTerrainLevel.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle)
    if (saturation != null) __obj.updateDynamic("saturation")(saturation.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_AlphaBrightness]
  }
}

