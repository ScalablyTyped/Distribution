package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttenuation extends js.Object {
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

object AnonAttenuation {
  @scala.inline
  def apply(
    attenuation: js.UndefOr[Boolean] = js.undefined,
    backFaceCulling: js.UndefOr[Boolean] = js.undefined,
    baseResolution: Int | Double = null,
    eyeDomeLighting: js.UndefOr[Boolean] = js.undefined,
    eyeDomeLightingRadius: Int | Double = null,
    eyeDomeLightingStrength: Int | Double = null,
    geometricErrorScale: Int | Double = null,
    maximumAttenuation: Int | Double = null,
    normalShading: js.UndefOr[Boolean] = js.undefined
  ): AnonAttenuation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attenuation)) __obj.updateDynamic("attenuation")(attenuation.asInstanceOf[js.Any])
    if (!js.isUndefined(backFaceCulling)) __obj.updateDynamic("backFaceCulling")(backFaceCulling.asInstanceOf[js.Any])
    if (baseResolution != null) __obj.updateDynamic("baseResolution")(baseResolution.asInstanceOf[js.Any])
    if (!js.isUndefined(eyeDomeLighting)) __obj.updateDynamic("eyeDomeLighting")(eyeDomeLighting.asInstanceOf[js.Any])
    if (eyeDomeLightingRadius != null) __obj.updateDynamic("eyeDomeLightingRadius")(eyeDomeLightingRadius.asInstanceOf[js.Any])
    if (eyeDomeLightingStrength != null) __obj.updateDynamic("eyeDomeLightingStrength")(eyeDomeLightingStrength.asInstanceOf[js.Any])
    if (geometricErrorScale != null) __obj.updateDynamic("geometricErrorScale")(geometricErrorScale.asInstanceOf[js.Any])
    if (maximumAttenuation != null) __obj.updateDynamic("maximumAttenuation")(maximumAttenuation.asInstanceOf[js.Any])
    if (!js.isUndefined(normalShading)) __obj.updateDynamic("normalShading")(normalShading.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttenuation]
  }
}

