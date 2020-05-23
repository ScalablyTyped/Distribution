package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attenuation extends js.Object {
  var attenuation: js.UndefOr[Boolean] = js.undefined
  var backFaceCulling: js.UndefOr[Boolean] = js.undefined
  var baseResolution: js.UndefOr[Double] = js.undefined
  var eyeDomeLighting: js.UndefOr[Boolean] = js.undefined
  var eyeDomeLightingRadius: js.UndefOr[Double] = js.undefined
  var eyeDomeLightingStrength: js.UndefOr[Double] = js.undefined
  var geometricErrorScale: js.UndefOr[Double] = js.undefined
  var maximumAttenuation: js.UndefOr[Double] = js.undefined
  var normalShading: js.UndefOr[Boolean] = js.undefined
}

object Attenuation {
  @scala.inline
  def apply(
    attenuation: js.UndefOr[Boolean] = js.undefined,
    backFaceCulling: js.UndefOr[Boolean] = js.undefined,
    baseResolution: js.UndefOr[Double] = js.undefined,
    eyeDomeLighting: js.UndefOr[Boolean] = js.undefined,
    eyeDomeLightingRadius: js.UndefOr[Double] = js.undefined,
    eyeDomeLightingStrength: js.UndefOr[Double] = js.undefined,
    geometricErrorScale: js.UndefOr[Double] = js.undefined,
    maximumAttenuation: js.UndefOr[Double] = js.undefined,
    normalShading: js.UndefOr[Boolean] = js.undefined
  ): Attenuation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attenuation)) __obj.updateDynamic("attenuation")(attenuation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(backFaceCulling)) __obj.updateDynamic("backFaceCulling")(backFaceCulling.get.asInstanceOf[js.Any])
    if (!js.isUndefined(baseResolution)) __obj.updateDynamic("baseResolution")(baseResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(eyeDomeLighting)) __obj.updateDynamic("eyeDomeLighting")(eyeDomeLighting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(eyeDomeLightingRadius)) __obj.updateDynamic("eyeDomeLightingRadius")(eyeDomeLightingRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(eyeDomeLightingStrength)) __obj.updateDynamic("eyeDomeLightingStrength")(eyeDomeLightingStrength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(geometricErrorScale)) __obj.updateDynamic("geometricErrorScale")(geometricErrorScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumAttenuation)) __obj.updateDynamic("maximumAttenuation")(maximumAttenuation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(normalShading)) __obj.updateDynamic("normalShading")(normalShading.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attenuation]
  }
}

