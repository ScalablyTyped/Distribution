package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CascadesEnabled extends js.Object {
  var cascadesEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var darkness: js.UndefOr[scala.Double] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var isPointLight: js.UndefOr[scala.Boolean] = js.undefined
  var lightCamera: cesiumLib.cesiumMod.CesiumNs.Camera
  var maximumDistance: js.UndefOr[scala.Double] = js.undefined
  var normalOffset: js.UndefOr[scala.Boolean] = js.undefined
  var numberOfCascades: js.UndefOr[scala.Double] = js.undefined
  var pointLightRadius: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var softShadows: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_CascadesEnabled {
  @scala.inline
  def apply(
    lightCamera: cesiumLib.cesiumMod.CesiumNs.Camera,
    cascadesEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    darkness: scala.Int | scala.Double = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    isPointLight: js.UndefOr[scala.Boolean] = js.undefined,
    maximumDistance: scala.Int | scala.Double = null,
    normalOffset: js.UndefOr[scala.Boolean] = js.undefined,
    numberOfCascades: scala.Int | scala.Double = null,
    pointLightRadius: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    softShadows: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CascadesEnabled = {
    val __obj = js.Dynamic.literal(lightCamera = lightCamera)
    if (!js.isUndefined(cascadesEnabled)) __obj.updateDynamic("cascadesEnabled")(cascadesEnabled)
    if (darkness != null) __obj.updateDynamic("darkness")(darkness.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(isPointLight)) __obj.updateDynamic("isPointLight")(isPointLight)
    if (maximumDistance != null) __obj.updateDynamic("maximumDistance")(maximumDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(normalOffset)) __obj.updateDynamic("normalOffset")(normalOffset)
    if (numberOfCascades != null) __obj.updateDynamic("numberOfCascades")(numberOfCascades.asInstanceOf[js.Any])
    if (pointLightRadius != null) __obj.updateDynamic("pointLightRadius")(pointLightRadius.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(softShadows)) __obj.updateDynamic("softShadows")(softShadows)
    __obj.asInstanceOf[Anon_CascadesEnabled]
  }
}

