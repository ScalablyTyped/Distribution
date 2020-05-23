package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CascadesEnabled extends js.Object {
  var cascadesEnabled: js.UndefOr[Boolean] = js.undefined
  var darkness: js.UndefOr[Double] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var isPointLight: js.UndefOr[Boolean] = js.undefined
  var lightCamera: typings.cesium.mod.Camera
  var maximumDistance: js.UndefOr[Double] = js.undefined
  var normalOffset: js.UndefOr[Boolean] = js.undefined
  var numberOfCascades: js.UndefOr[Double] = js.undefined
  var pointLightRadius: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var softShadows: js.UndefOr[Boolean] = js.undefined
}

object CascadesEnabled {
  @scala.inline
  def apply(
    lightCamera: typings.cesium.mod.Camera,
    cascadesEnabled: js.UndefOr[Boolean] = js.undefined,
    darkness: js.UndefOr[Double] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    isPointLight: js.UndefOr[Boolean] = js.undefined,
    maximumDistance: js.UndefOr[Double] = js.undefined,
    normalOffset: js.UndefOr[Boolean] = js.undefined,
    numberOfCascades: js.UndefOr[Double] = js.undefined,
    pointLightRadius: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    softShadows: js.UndefOr[Boolean] = js.undefined
  ): CascadesEnabled = {
    val __obj = js.Dynamic.literal(lightCamera = lightCamera.asInstanceOf[js.Any])
    if (!js.isUndefined(cascadesEnabled)) __obj.updateDynamic("cascadesEnabled")(cascadesEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(darkness)) __obj.updateDynamic("darkness")(darkness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPointLight)) __obj.updateDynamic("isPointLight")(isPointLight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumDistance)) __obj.updateDynamic("maximumDistance")(maximumDistance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(normalOffset)) __obj.updateDynamic("normalOffset")(normalOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfCascades)) __obj.updateDynamic("numberOfCascades")(numberOfCascades.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pointLightRadius)) __obj.updateDynamic("pointLightRadius")(pointLightRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(softShadows)) __obj.updateDynamic("softShadows")(softShadows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascadesEnabled]
  }
}

