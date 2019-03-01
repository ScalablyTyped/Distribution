package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlphaBrightness extends js.Object {
  var alpha: js.UndefOr[scala.Double | cesiumLib.cesiumMod.CesiumNs.ImageryLayerNs.ValueFunc] = js.undefined
  var brightness: js.UndefOr[scala.Double | cesiumLib.cesiumMod.CesiumNs.ImageryLayerNs.ValueFunc] = js.undefined
  var contrast: js.UndefOr[scala.Double | cesiumLib.cesiumMod.CesiumNs.ImageryLayerNs.ValueFunc] = js.undefined
  var gamma: js.UndefOr[scala.Double | cesiumLib.cesiumMod.CesiumNs.ImageryLayerNs.ValueFunc] = js.undefined
  var hue: js.UndefOr[scala.Double | cesiumLib.cesiumMod.CesiumNs.ImageryLayerNs.ValueFunc] = js.undefined
  var maximumAnisotropy: js.UndefOr[scala.Double] = js.undefined
  var maximumTerrainLevel: js.UndefOr[scala.Double] = js.undefined
  var minimumTerrainLevel: js.UndefOr[scala.Double] = js.undefined
  var rectangle: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Rectangle] = js.undefined
  var saturation: js.UndefOr[scala.Double | cesiumLib.cesiumMod.CesiumNs.ImageryLayerNs.ValueFunc] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AlphaBrightness {
  @scala.inline
  def apply(
    alpha: scala.Double | cesiumLib.cesiumMod.CesiumNs.ImageryLayerNs.ValueFunc = null,
    brightness: scala.Double | cesiumLib.cesiumMod.CesiumNs.ImageryLayerNs.ValueFunc = null,
    contrast: scala.Double | cesiumLib.cesiumMod.CesiumNs.ImageryLayerNs.ValueFunc = null,
    gamma: scala.Double | cesiumLib.cesiumMod.CesiumNs.ImageryLayerNs.ValueFunc = null,
    hue: scala.Double | cesiumLib.cesiumMod.CesiumNs.ImageryLayerNs.ValueFunc = null,
    maximumAnisotropy: scala.Int | scala.Double = null,
    maximumTerrainLevel: scala.Int | scala.Double = null,
    minimumTerrainLevel: scala.Int | scala.Double = null,
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle = null,
    saturation: scala.Double | cesiumLib.cesiumMod.CesiumNs.ImageryLayerNs.ValueFunc = null,
    show: js.UndefOr[scala.Boolean] = js.undefined
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

