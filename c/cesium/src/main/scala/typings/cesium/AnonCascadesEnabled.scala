package typings.cesium

import typings.cesium.mod.Camera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCascadesEnabled extends js.Object {
  var cascadesEnabled: js.UndefOr[Boolean] = js.undefined
  var darkness: js.UndefOr[Double] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var isPointLight: js.UndefOr[Boolean] = js.undefined
  var lightCamera: Camera
  var maximumDistance: js.UndefOr[Double] = js.undefined
  var normalOffset: js.UndefOr[Boolean] = js.undefined
  var numberOfCascades: js.UndefOr[Double] = js.undefined
  var pointLightRadius: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var softShadows: js.UndefOr[Boolean] = js.undefined
}

object AnonCascadesEnabled {
  @scala.inline
  def apply(
    lightCamera: Camera,
    cascadesEnabled: js.UndefOr[Boolean] = js.undefined,
    darkness: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    isPointLight: js.UndefOr[Boolean] = js.undefined,
    maximumDistance: Int | Double = null,
    normalOffset: js.UndefOr[Boolean] = js.undefined,
    numberOfCascades: Int | Double = null,
    pointLightRadius: Int | Double = null,
    size: Int | Double = null,
    softShadows: js.UndefOr[Boolean] = js.undefined
  ): AnonCascadesEnabled = {
    val __obj = js.Dynamic.literal(lightCamera = lightCamera.asInstanceOf[js.Any])
    if (!js.isUndefined(cascadesEnabled)) __obj.updateDynamic("cascadesEnabled")(cascadesEnabled.asInstanceOf[js.Any])
    if (darkness != null) __obj.updateDynamic("darkness")(darkness.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isPointLight)) __obj.updateDynamic("isPointLight")(isPointLight.asInstanceOf[js.Any])
    if (maximumDistance != null) __obj.updateDynamic("maximumDistance")(maximumDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(normalOffset)) __obj.updateDynamic("normalOffset")(normalOffset.asInstanceOf[js.Any])
    if (numberOfCascades != null) __obj.updateDynamic("numberOfCascades")(numberOfCascades.asInstanceOf[js.Any])
    if (pointLightRadius != null) __obj.updateDynamic("pointLightRadius")(pointLightRadius.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(softShadows)) __obj.updateDynamic("softShadows")(softShadows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCascadesEnabled]
  }
}

