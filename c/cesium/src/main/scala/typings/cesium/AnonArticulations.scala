package typings.cesium

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.Cartesian3
import typings.cesium.mod.ClippingPlaneCollection
import typings.cesium.mod.Color
import typings.cesium.mod.ColorBlendMode
import typings.cesium.mod.DistanceDisplayCondition
import typings.cesium.mod.HeightReference
import typings.cesium.mod.Property
import typings.cesium.mod.PropertyBag
import typings.cesium.mod.ShadowMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArticulations extends js.Object {
  var articulations: js.UndefOr[PropertyBag] = js.undefined
  var clampAnimations: js.UndefOr[Property | Boolean] = js.undefined
  var clippingPlanes: js.UndefOr[Property | ClippingPlaneCollection] = js.undefined
  var color: js.UndefOr[Property | Color] = js.undefined
  var colorBlendAmount: js.UndefOr[Property | Double] = js.undefined
  var colorBlendMode: js.UndefOr[Property | ColorBlendMode] = js.undefined
  var distanceDisplayCondition: js.UndefOr[Property | DistanceDisplayCondition] = js.undefined
  var heightReference: js.UndefOr[Property | HeightReference] = js.undefined
  var imageBasedLightingFactor: js.UndefOr[Property | Cartesian2] = js.undefined
  var incrementallyLoadTextures: js.UndefOr[Property | Boolean] = js.undefined
  var lightColor: js.UndefOr[Property | Cartesian3] = js.undefined
  var maximumScale: js.UndefOr[Property | Double] = js.undefined
  var minimumPixelSize: js.UndefOr[Property | Double] = js.undefined
  var nodeTransformations: js.UndefOr[PropertyBag] = js.undefined
  var runAnimations: js.UndefOr[Property | Boolean] = js.undefined
  var scale: js.UndefOr[Property | Double] = js.undefined
  var shadows: js.UndefOr[Property | ShadowMode] = js.undefined
  var show: js.UndefOr[Property | Boolean] = js.undefined
  var silhouetteColor: js.UndefOr[Property | Color] = js.undefined
  var silhouetteSize: js.UndefOr[Property | Double] = js.undefined
  var uri: js.UndefOr[Property | String] = js.undefined
}

object AnonArticulations {
  @scala.inline
  def apply(
    articulations: PropertyBag = null,
    clampAnimations: Property | Boolean = null,
    clippingPlanes: Property | ClippingPlaneCollection = null,
    color: Property | Color = null,
    colorBlendAmount: Property | Double = null,
    colorBlendMode: Property | ColorBlendMode = null,
    distanceDisplayCondition: Property | DistanceDisplayCondition = null,
    heightReference: Property | HeightReference = null,
    imageBasedLightingFactor: Property | Cartesian2 = null,
    incrementallyLoadTextures: Property | Boolean = null,
    lightColor: Property | Cartesian3 = null,
    maximumScale: Property | Double = null,
    minimumPixelSize: Property | Double = null,
    nodeTransformations: PropertyBag = null,
    runAnimations: Property | Boolean = null,
    scale: Property | Double = null,
    shadows: Property | ShadowMode = null,
    show: Property | Boolean = null,
    silhouetteColor: Property | Color = null,
    silhouetteSize: Property | Double = null,
    uri: Property | String = null
  ): AnonArticulations = {
    val __obj = js.Dynamic.literal()
    if (articulations != null) __obj.updateDynamic("articulations")(articulations.asInstanceOf[js.Any])
    if (clampAnimations != null) __obj.updateDynamic("clampAnimations")(clampAnimations.asInstanceOf[js.Any])
    if (clippingPlanes != null) __obj.updateDynamic("clippingPlanes")(clippingPlanes.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorBlendAmount != null) __obj.updateDynamic("colorBlendAmount")(colorBlendAmount.asInstanceOf[js.Any])
    if (colorBlendMode != null) __obj.updateDynamic("colorBlendMode")(colorBlendMode.asInstanceOf[js.Any])
    if (distanceDisplayCondition != null) __obj.updateDynamic("distanceDisplayCondition")(distanceDisplayCondition.asInstanceOf[js.Any])
    if (heightReference != null) __obj.updateDynamic("heightReference")(heightReference.asInstanceOf[js.Any])
    if (imageBasedLightingFactor != null) __obj.updateDynamic("imageBasedLightingFactor")(imageBasedLightingFactor.asInstanceOf[js.Any])
    if (incrementallyLoadTextures != null) __obj.updateDynamic("incrementallyLoadTextures")(incrementallyLoadTextures.asInstanceOf[js.Any])
    if (lightColor != null) __obj.updateDynamic("lightColor")(lightColor.asInstanceOf[js.Any])
    if (maximumScale != null) __obj.updateDynamic("maximumScale")(maximumScale.asInstanceOf[js.Any])
    if (minimumPixelSize != null) __obj.updateDynamic("minimumPixelSize")(minimumPixelSize.asInstanceOf[js.Any])
    if (nodeTransformations != null) __obj.updateDynamic("nodeTransformations")(nodeTransformations.asInstanceOf[js.Any])
    if (runAnimations != null) __obj.updateDynamic("runAnimations")(runAnimations.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (silhouetteColor != null) __obj.updateDynamic("silhouetteColor")(silhouetteColor.asInstanceOf[js.Any])
    if (silhouetteSize != null) __obj.updateDynamic("silhouetteSize")(silhouetteSize.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArticulations]
  }
}

