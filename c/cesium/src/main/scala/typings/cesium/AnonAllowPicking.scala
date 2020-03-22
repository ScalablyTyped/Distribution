package typings.cesium

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.Cartesian3
import typings.cesium.mod.ClippingPlaneCollection
import typings.cesium.mod.Color
import typings.cesium.mod.Credit
import typings.cesium.mod.DistanceDisplayCondition
import typings.cesium.mod.HeightReference
import typings.cesium.mod.Matrix4
import typings.cesium.mod.Property
import typings.cesium.mod.Scene
import typings.cesium.mod.ShadowMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowPicking extends js.Object {
  var allowPicking: js.UndefOr[Boolean] = js.undefined
  var asynchronous: js.UndefOr[Boolean] = js.undefined
  var basePath: js.UndefOr[String] = js.undefined
  var clampAnimations: js.UndefOr[Boolean] = js.undefined
  var clippingPlanes: js.UndefOr[ClippingPlaneCollection] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var colorBlendAmount: js.UndefOr[Double] = js.undefined
  var colorBlendMode: js.UndefOr[Property] = js.undefined
  var credit: js.UndefOr[Credit | String] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  var debugWireframe: js.UndefOr[Boolean] = js.undefined
  var dequantizeInShader: js.UndefOr[Boolean] = js.undefined
  var distanceDisplayCondition: js.UndefOr[DistanceDisplayCondition] = js.undefined
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
  var scene: js.UndefOr[Scene] = js.undefined
  var shadows: js.UndefOr[ShadowMode] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var silhouetteColor: js.UndefOr[Color] = js.undefined
  var silhouetteSize: js.UndefOr[Double] = js.undefined
  var specularEnvironmentMaps: js.UndefOr[String] = js.undefined
  var sphericalHarmonicCoefficients: js.UndefOr[js.Array[Cartesian3]] = js.undefined
}

object AnonAllowPicking {
  @scala.inline
  def apply(
    allowPicking: js.UndefOr[Boolean] = js.undefined,
    asynchronous: js.UndefOr[Boolean] = js.undefined,
    basePath: String = null,
    clampAnimations: js.UndefOr[Boolean] = js.undefined,
    clippingPlanes: ClippingPlaneCollection = null,
    color: Color = null,
    colorBlendAmount: Int | Double = null,
    colorBlendMode: Property = null,
    credit: Credit | String = null,
    debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined,
    debugWireframe: js.UndefOr[Boolean] = js.undefined,
    dequantizeInShader: js.UndefOr[Boolean] = js.undefined,
    distanceDisplayCondition: DistanceDisplayCondition = null,
    gltf: js.Any = null,
    heightReference: HeightReference = null,
    id: js.Any = null,
    imageBasedLightingFactor: Cartesian2 = null,
    incrementallyLoadTextures: js.UndefOr[Boolean] = js.undefined,
    lightColor: Cartesian3 = null,
    luminanceAtZenith: Int | Double = null,
    maximumScale: Int | Double = null,
    minimumPixelSize: Int | Double = null,
    modelMatrix: Matrix4 = null,
    scale: Int | Double = null,
    scene: Scene = null,
    shadows: ShadowMode = null,
    show: js.UndefOr[Boolean] = js.undefined,
    silhouetteColor: Color = null,
    silhouetteSize: Int | Double = null,
    specularEnvironmentMaps: String = null,
    sphericalHarmonicCoefficients: js.Array[Cartesian3] = null
  ): AnonAllowPicking = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPicking)) __obj.updateDynamic("allowPicking")(allowPicking.asInstanceOf[js.Any])
    if (!js.isUndefined(asynchronous)) __obj.updateDynamic("asynchronous")(asynchronous.asInstanceOf[js.Any])
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (!js.isUndefined(clampAnimations)) __obj.updateDynamic("clampAnimations")(clampAnimations.asInstanceOf[js.Any])
    if (clippingPlanes != null) __obj.updateDynamic("clippingPlanes")(clippingPlanes.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorBlendAmount != null) __obj.updateDynamic("colorBlendAmount")(colorBlendAmount.asInstanceOf[js.Any])
    if (colorBlendMode != null) __obj.updateDynamic("colorBlendMode")(colorBlendMode.asInstanceOf[js.Any])
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume.asInstanceOf[js.Any])
    if (!js.isUndefined(debugWireframe)) __obj.updateDynamic("debugWireframe")(debugWireframe.asInstanceOf[js.Any])
    if (!js.isUndefined(dequantizeInShader)) __obj.updateDynamic("dequantizeInShader")(dequantizeInShader.asInstanceOf[js.Any])
    if (distanceDisplayCondition != null) __obj.updateDynamic("distanceDisplayCondition")(distanceDisplayCondition.asInstanceOf[js.Any])
    if (gltf != null) __obj.updateDynamic("gltf")(gltf.asInstanceOf[js.Any])
    if (heightReference != null) __obj.updateDynamic("heightReference")(heightReference.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imageBasedLightingFactor != null) __obj.updateDynamic("imageBasedLightingFactor")(imageBasedLightingFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(incrementallyLoadTextures)) __obj.updateDynamic("incrementallyLoadTextures")(incrementallyLoadTextures.asInstanceOf[js.Any])
    if (lightColor != null) __obj.updateDynamic("lightColor")(lightColor.asInstanceOf[js.Any])
    if (luminanceAtZenith != null) __obj.updateDynamic("luminanceAtZenith")(luminanceAtZenith.asInstanceOf[js.Any])
    if (maximumScale != null) __obj.updateDynamic("maximumScale")(maximumScale.asInstanceOf[js.Any])
    if (minimumPixelSize != null) __obj.updateDynamic("minimumPixelSize")(minimumPixelSize.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scene != null) __obj.updateDynamic("scene")(scene.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (silhouetteColor != null) __obj.updateDynamic("silhouetteColor")(silhouetteColor.asInstanceOf[js.Any])
    if (silhouetteSize != null) __obj.updateDynamic("silhouetteSize")(silhouetteSize.asInstanceOf[js.Any])
    if (specularEnvironmentMaps != null) __obj.updateDynamic("specularEnvironmentMaps")(specularEnvironmentMaps.asInstanceOf[js.Any])
    if (sphericalHarmonicCoefficients != null) __obj.updateDynamic("sphericalHarmonicCoefficients")(sphericalHarmonicCoefficients.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowPicking]
  }
}

