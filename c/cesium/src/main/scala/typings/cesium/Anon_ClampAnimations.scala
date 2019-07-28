package typings.cesium

import typings.cesium.cesiumMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClampAnimations extends js.Object {
  var clampAnimations: js.UndefOr[Property | Boolean] = js.undefined
  var clippingPlanes: js.UndefOr[Property] = js.undefined
  var color: js.UndefOr[Property] = js.undefined
  var colorBlendAmount: js.UndefOr[Property | Double] = js.undefined
  var colorBlendMode: js.UndefOr[Property] = js.undefined
  var distanceDisplayCondition: js.UndefOr[Property] = js.undefined
  var heightReference: js.UndefOr[Property] = js.undefined
  var incrementallyLoadTextures: js.UndefOr[Property | Boolean] = js.undefined
  var maximumScale: js.UndefOr[Property | Double] = js.undefined
  var minimumPixelSize: js.UndefOr[Property | Double] = js.undefined
  var nodeTransformations: js.UndefOr[Property] = js.undefined
  var runAnimations: js.UndefOr[Property | Boolean] = js.undefined
  var scale: js.UndefOr[Property | Double] = js.undefined
  var shadows: js.UndefOr[Property] = js.undefined
  var show: js.UndefOr[Property | Boolean] = js.undefined
  var silhouetteColor: js.UndefOr[Property] = js.undefined
  var silhouetteSize: js.UndefOr[Property | Double] = js.undefined
  var uri: js.UndefOr[Property | String] = js.undefined
}

object Anon_ClampAnimations {
  @scala.inline
  def apply(
    clampAnimations: Property | Boolean = null,
    clippingPlanes: Property = null,
    color: Property = null,
    colorBlendAmount: Property | Double = null,
    colorBlendMode: Property = null,
    distanceDisplayCondition: Property = null,
    heightReference: Property = null,
    incrementallyLoadTextures: Property | Boolean = null,
    maximumScale: Property | Double = null,
    minimumPixelSize: Property | Double = null,
    nodeTransformations: Property = null,
    runAnimations: Property | Boolean = null,
    scale: Property | Double = null,
    shadows: Property = null,
    show: Property | Boolean = null,
    silhouetteColor: Property = null,
    silhouetteSize: Property | Double = null,
    uri: Property | String = null
  ): Anon_ClampAnimations = {
    val __obj = js.Dynamic.literal()
    if (clampAnimations != null) __obj.updateDynamic("clampAnimations")(clampAnimations.asInstanceOf[js.Any])
    if (clippingPlanes != null) __obj.updateDynamic("clippingPlanes")(clippingPlanes)
    if (color != null) __obj.updateDynamic("color")(color)
    if (colorBlendAmount != null) __obj.updateDynamic("colorBlendAmount")(colorBlendAmount.asInstanceOf[js.Any])
    if (colorBlendMode != null) __obj.updateDynamic("colorBlendMode")(colorBlendMode)
    if (distanceDisplayCondition != null) __obj.updateDynamic("distanceDisplayCondition")(distanceDisplayCondition)
    if (heightReference != null) __obj.updateDynamic("heightReference")(heightReference)
    if (incrementallyLoadTextures != null) __obj.updateDynamic("incrementallyLoadTextures")(incrementallyLoadTextures.asInstanceOf[js.Any])
    if (maximumScale != null) __obj.updateDynamic("maximumScale")(maximumScale.asInstanceOf[js.Any])
    if (minimumPixelSize != null) __obj.updateDynamic("minimumPixelSize")(minimumPixelSize.asInstanceOf[js.Any])
    if (nodeTransformations != null) __obj.updateDynamic("nodeTransformations")(nodeTransformations)
    if (runAnimations != null) __obj.updateDynamic("runAnimations")(runAnimations.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (silhouetteColor != null) __obj.updateDynamic("silhouetteColor")(silhouetteColor)
    if (silhouetteSize != null) __obj.updateDynamic("silhouetteSize")(silhouetteSize.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClampAnimations]
  }
}

