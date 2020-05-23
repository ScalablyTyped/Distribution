package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.Cartesian3
import typings.cesium.mod.ClippingPlaneCollection
import typings.cesium.mod.HeightReference
import typings.cesium.mod.Matrix4
import typings.cesium.mod.Property
import typings.cesium.mod.ShadowMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowPicking extends js.Object {
  var allowPicking: js.UndefOr[Boolean] = js.undefined
  var asynchronous: js.UndefOr[Boolean] = js.undefined
  var basePath: js.UndefOr[String] = js.undefined
  var clampAnimations: js.UndefOr[Boolean] = js.undefined
  var clippingPlanes: js.UndefOr[ClippingPlaneCollection] = js.undefined
  var color: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  var colorBlendAmount: js.UndefOr[Double] = js.undefined
  var colorBlendMode: js.UndefOr[Property] = js.undefined
  var credit: js.UndefOr[typings.cesium.mod.Credit | String] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  var debugWireframe: js.UndefOr[Boolean] = js.undefined
  var dequantizeInShader: js.UndefOr[Boolean] = js.undefined
  var distanceDisplayCondition: js.UndefOr[typings.cesium.mod.DistanceDisplayCondition] = js.undefined
  var gltf: js.UndefOr[js.Any] = js.undefined
  var heightReference: js.UndefOr[HeightReference] = js.undefined
  var id: js.UndefOr[js.Any] = js.undefined
  var imageBasedLightingFactor: js.UndefOr[Cartesian2] = js.undefined
  var incrementallyLoadTextures: js.UndefOr[Boolean] = js.undefined
  var lightColor: js.UndefOr[Cartesian3] = js.undefined
  var luminanceAtZenith: js.UndefOr[Double] = js.undefined
  var maximumScale: js.UndefOr[Double] = js.undefined
  var minimumPixelSize: js.UndefOr[Double] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var scene: js.UndefOr[typings.cesium.mod.Scene] = js.undefined
  var shadows: js.UndefOr[ShadowMode] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var silhouetteColor: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  var silhouetteSize: js.UndefOr[Double] = js.undefined
  var specularEnvironmentMaps: js.UndefOr[String] = js.undefined
  var sphericalHarmonicCoefficients: js.UndefOr[js.Array[Cartesian3]] = js.undefined
}

object AllowPicking {
  @scala.inline
  def apply(
    allowPicking: js.UndefOr[Boolean] = js.undefined,
    asynchronous: js.UndefOr[Boolean] = js.undefined,
    basePath: String = null,
    clampAnimations: js.UndefOr[Boolean] = js.undefined,
    clippingPlanes: ClippingPlaneCollection = null,
    color: typings.cesium.mod.Color = null,
    colorBlendAmount: js.UndefOr[Double] = js.undefined,
    colorBlendMode: Property = null,
    credit: typings.cesium.mod.Credit | String = null,
    debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined,
    debugWireframe: js.UndefOr[Boolean] = js.undefined,
    dequantizeInShader: js.UndefOr[Boolean] = js.undefined,
    distanceDisplayCondition: typings.cesium.mod.DistanceDisplayCondition = null,
    gltf: js.Any = null,
    heightReference: HeightReference = null,
    id: js.Any = null,
    imageBasedLightingFactor: Cartesian2 = null,
    incrementallyLoadTextures: js.UndefOr[Boolean] = js.undefined,
    lightColor: Cartesian3 = null,
    luminanceAtZenith: js.UndefOr[Double] = js.undefined,
    maximumScale: js.UndefOr[Double] = js.undefined,
    minimumPixelSize: js.UndefOr[Double] = js.undefined,
    modelMatrix: Matrix4 = null,
    scale: js.UndefOr[Double] = js.undefined,
    scene: typings.cesium.mod.Scene = null,
    shadows: ShadowMode = null,
    show: js.UndefOr[Boolean] = js.undefined,
    silhouetteColor: typings.cesium.mod.Color = null,
    silhouetteSize: js.UndefOr[Double] = js.undefined,
    specularEnvironmentMaps: String = null,
    sphericalHarmonicCoefficients: js.Array[Cartesian3] = null
  ): AllowPicking = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPicking)) __obj.updateDynamic("allowPicking")(allowPicking.get.asInstanceOf[js.Any])
    if (!js.isUndefined(asynchronous)) __obj.updateDynamic("asynchronous")(asynchronous.get.asInstanceOf[js.Any])
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (!js.isUndefined(clampAnimations)) __obj.updateDynamic("clampAnimations")(clampAnimations.get.asInstanceOf[js.Any])
    if (clippingPlanes != null) __obj.updateDynamic("clippingPlanes")(clippingPlanes.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colorBlendAmount)) __obj.updateDynamic("colorBlendAmount")(colorBlendAmount.get.asInstanceOf[js.Any])
    if (colorBlendMode != null) __obj.updateDynamic("colorBlendMode")(colorBlendMode.asInstanceOf[js.Any])
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debugWireframe)) __obj.updateDynamic("debugWireframe")(debugWireframe.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dequantizeInShader)) __obj.updateDynamic("dequantizeInShader")(dequantizeInShader.get.asInstanceOf[js.Any])
    if (distanceDisplayCondition != null) __obj.updateDynamic("distanceDisplayCondition")(distanceDisplayCondition.asInstanceOf[js.Any])
    if (gltf != null) __obj.updateDynamic("gltf")(gltf.asInstanceOf[js.Any])
    if (heightReference != null) __obj.updateDynamic("heightReference")(heightReference.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imageBasedLightingFactor != null) __obj.updateDynamic("imageBasedLightingFactor")(imageBasedLightingFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(incrementallyLoadTextures)) __obj.updateDynamic("incrementallyLoadTextures")(incrementallyLoadTextures.get.asInstanceOf[js.Any])
    if (lightColor != null) __obj.updateDynamic("lightColor")(lightColor.asInstanceOf[js.Any])
    if (!js.isUndefined(luminanceAtZenith)) __obj.updateDynamic("luminanceAtZenith")(luminanceAtZenith.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumScale)) __obj.updateDynamic("maximumScale")(maximumScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumPixelSize)) __obj.updateDynamic("minimumPixelSize")(minimumPixelSize.get.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (scene != null) __obj.updateDynamic("scene")(scene.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (silhouetteColor != null) __obj.updateDynamic("silhouetteColor")(silhouetteColor.asInstanceOf[js.Any])
    if (!js.isUndefined(silhouetteSize)) __obj.updateDynamic("silhouetteSize")(silhouetteSize.get.asInstanceOf[js.Any])
    if (specularEnvironmentMaps != null) __obj.updateDynamic("specularEnvironmentMaps")(specularEnvironmentMaps.asInstanceOf[js.Any])
    if (sphericalHarmonicCoefficients != null) __obj.updateDynamic("sphericalHarmonicCoefficients")(sphericalHarmonicCoefficients.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowPicking]
  }
}

