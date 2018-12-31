package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default implementation IShadowGenerator.
  * This is the main object responsible of generating shadows in the framework.
  * Documentation: https://doc.babylonjs.com/babylon101/shadows
  */
@JSGlobal("BABYLON.ShadowGenerator")
@js.native
class ShadowGenerator protected () extends IShadowGenerator {
  /**
    * Creates a ShadowGenerator object.
    * A ShadowGenerator is the required tool to use the shadows.
    * Each light casting shadows needs to use its own ShadowGenerator.
    * Documentation : http://doc.babylonjs.com/tutorials/shadows
    * @param mapSize The size of the texture what stores the shadows. Example : 1024.
    * @param light The light object generating the shadows.
    * @param useFullFloatFirst By default the generator will try to use half float textures but if you need precision (for self shadowing for instance), you can use this option to enforce full float texture.
    */
  def this(mapSize: scala.Double, light: IShadowLight) = this()
  def this(mapSize: scala.Double, light: IShadowLight, useFullFloatFirst: scala.Boolean) = this()
  var _applyFilterValues: js.Any = js.native
  var _bias: js.Any = js.native
  var _blurBoxOffset: js.Any = js.native
  var _blurKernel: js.Any = js.native
  var _blurPostProcesses: js.Any = js.native
  var _blurScale: js.Any = js.native
  var _boxBlurPostprocess: js.Any = js.native
  var _cachedDefines: js.Any = js.native
  var _cachedDirection: js.Any = js.native
  var _cachedPosition: js.Any = js.native
  var _contactHardeningLightSizeUVRatio: js.Any = js.native
  var _currentFaceIndex: js.Any = js.native
  var _currentFaceIndexCache: js.Any = js.native
  var _currentRenderID: js.Any = js.native
  var _darkness: js.Any = js.native
  var _defaultTextureMatrix: js.Any = js.native
  var _depthScale: js.Any = js.native
  var _disposeBlurPostProcesses: js.Any = js.native
  var _disposeRTTandPostProcesses: js.Any = js.native
  var _effect: js.Any = js.native
  var _filter: js.Any = js.native
  var _filteringQuality: js.Any = js.native
  var _initializeBlurRTTAndPostProcesses: js.Any = js.native
  var _initializeGenerator: js.Any = js.native
  var _initializeShadowMap: js.Any = js.native
  var _kernelBlurXPostprocess: js.Any = js.native
  var _kernelBlurYPostprocess: js.Any = js.native
  var _light: js.Any = js.native
  var _lightDirection: js.Any = js.native
  var _mapSize: js.Any = js.native
  var _normalBias: js.Any = js.native
  var _projectionMatrix: js.Any = js.native
  var _renderForShadowMap: js.Any = js.native
  var _renderSubMeshForShadowMap: js.Any = js.native
  var _scene: js.Any = js.native
  var _shadowMap: js.Any = js.native
  var _shadowMap2: js.Any = js.native
  var _textureType: js.Any = js.native
  var _transformMatrix: js.Any = js.native
  var _transparencyShadow: js.Any = js.native
  var _useKernelBlur: js.Any = js.native
  var _viewMatrix: js.Any = js.native
  /**
    * Gets the bias: offset applied on the depth preventing acnea (in light direction).
    */
  /**
    * Sets the bias: offset applied on the depth preventing acnea (in light direction).
    */
  var bias: scala.Double = js.native
  /**
    * Gets the blur box offset: offset applied during the blur pass.
    * Only usefull if useKernelBlur = false
    */
  /**
    * Sets the blur box offset: offset applied during the blur pass.
    * Only usefull if useKernelBlur = false
    */
  var blurBoxOffset: scala.Double = js.native
  /**
    * Gets the blur kernel: kernel size of the blur pass.
    * Only usefull if useKernelBlur = true
    */
  /**
    * Sets the blur kernel: kernel size of the blur pass.
    * Only usefull if useKernelBlur = true
    */
  var blurKernel: scala.Double = js.native
  /**
    * Gets the blur scale: scale of the blurred texture compared to the main shadow map.
    * 2 means half of the size.
    */
  /**
    * Sets the blur scale: scale of the blurred texture compared to the main shadow map.
    * 2 means half of the size.
    */
  var blurScale: scala.Double = js.native
  /**
    * Gets the Light Size (in shadow map uv unit) used in PCSS to determine the blocker search area and the penumbra size.
    * Using a ratio helps keeping shape stability independently of the map size.
    *
    * It does not account for the light projection as it was having too much
    * instability during the light setup or during light position changes.
    *
    * Only valid if useContactHardeningShadow is true.
    */
  /**
    * Sets the Light Size (in shadow map uv unit) used in PCSS to determine the blocker search area and the penumbra size.
    * Using a ratio helps keeping shape stability independently of the map size.
    *
    * It does not account for the light projection as it was having too much
    * instability during the light setup or during light position changes.
    *
    * Only valid if useContactHardeningShadow is true.
    */
  var contactHardeningLightSizeUVRatio: scala.Double = js.native
  /**
    * Gets the depth scale used in ESM mode.
    */
  /**
    * Sets the depth scale used in ESM mode.
    * This can override the scale stored on the light.
    */
  var depthScale: scala.Double = js.native
  /**
    * Gets the current mode of the shadow generator (normal, PCF, ESM...).
    * The returned value is a number equal to one of the available mode defined in ShadowMap.FILTER_x like _FILTER_NONE
    */
  /**
    * Sets the current mode of the shadow generator (normal, PCF, ESM...).
    * The returned value is a number equal to one of the available mode defined in ShadowMap.FILTER_x like _FILTER_NONE
    */
  var filter: scala.Double = js.native
  /**
    * Gets the PCF or PCSS Quality.
    * Only valid if usePercentageCloserFiltering or usePercentageCloserFiltering is true.
    */
  /**
    * Sets the PCF or PCSS Quality.
    * Only valid if usePercentageCloserFiltering or usePercentageCloserFiltering is true.
    */
  var filteringQuality: scala.Double = js.native
  /**
    * If true the shadow map is generated by rendering the back face of the mesh instead of the front face.
    * This can help with self-shadowing as the geometry making up the back of objects is slightly offset.
    * It might on the other hand introduce peter panning.
    */
  var forceBackFacesOnly: scala.Boolean = js.native
  /**
    * Controls the extent to which the shadows fade out at the edge of the frustum
    * Used only by directionals and spots
    */
  var frustumEdgeFalloff: scala.Double = js.native
  /**
    * Gets the normalBias: offset applied on the depth preventing acnea (along side the normal direction and proportinal to the light/normal angle).
    */
  /**
    * Sets the normalBias: offset applied on the depth preventing acnea (along side the normal direction and proportinal to the light/normal angle).
    */
  var normalBias: scala.Double = js.native
  /**
    * Gets if the current filter is set to filtered "close ESM" (using the inverse of the
    * exponential to prevent steep falloff artifacts).
    */
  /**
    * Sets the current filter to filtered "close ESM" (using the inverse of the
    * exponential to prevent steep falloff artifacts).
    */
  var useBlurCloseExponentialShadowMap: scala.Boolean = js.native
  /**
    * Gets if the current filter is set to filtered ESM.
    */
  /**
    * Gets if the current filter is set to filtered  ESM.
    */
  var useBlurExponentialShadowMap: scala.Boolean = js.native
  /**
    * Gets if the current filter is set to blurred VSM.
    * DEPRECATED. Should use useBlurExponentialShadowMap instead.
    */
  /**
    * Sets the current filter is to blurred VSM.
    * DEPRECATED. Should use useBlurExponentialShadowMap instead.
    */
  var useBlurVarianceShadowMap: scala.Boolean = js.native
  /**
    * Gets if the current filter is set to "close ESM" (using the inverse of the
    * exponential to prevent steep falloff artifacts).
    */
  /**
    * Sets the current filter to "close ESM" (using the inverse of the
    * exponential to prevent steep falloff artifacts).
    */
  var useCloseExponentialShadowMap: scala.Boolean = js.native
  /**
    * Gets if the current filter is set to "PCSS" (contact hardening).
    */
  /**
    * Sets the current filter to "PCSS" (contact hardening).
    */
  var useContactHardeningShadow: scala.Boolean = js.native
  /**
    * Gets if the current filter is set to ESM.
    */
  /**
    * Sets the current filter is to ESM.
    */
  var useExponentialShadowMap: scala.Boolean = js.native
  /**
    * Gets whether the blur pass is a kernel blur (if true) or box blur.
    * Only usefull in filtered mode (useBlurExponentialShadowMap...)
    */
  /**
    * Sets whether the blur pass is a kernel blur (if true) or box blur.
    * Only usefull in filtered mode (useBlurExponentialShadowMap...)
    */
  var useKernelBlur: scala.Boolean = js.native
  /**
    * Gets if the current filter is set to "PCF" (percentage closer filtering).
    */
  /**
    * Sets the current filter to "PCF" (percentage closer filtering).
    */
  var usePercentageCloserFiltering: scala.Boolean = js.native
  /**
    * Gets if the current filter is set to Poisson Sampling.
    */
  /**
    * Sets the current filter to Poisson Sampling.
    */
  var usePoissonSampling: scala.Boolean = js.native
  /**
    * Gets if the current filter is set to VSM.
    * DEPRECATED. Should use useExponentialShadowMap instead.
    */
  /**
    * Sets the current filter is to VSM.
    * DEPRECATED. Should use useExponentialShadowMap instead.
    */
  var useVarianceShadowMap: scala.Boolean = js.native
  /**
    * Helper function to add a mesh and its descendants to the list of shadow casters.
    * @param mesh Mesh to add
    * @param includeDescendants boolean indicating if the descendants should be added. Default to true
    * @returns the Shadow Generator itself
    */
  def addShadowCaster(mesh: AbstractMesh): ShadowGenerator = js.native
  def addShadowCaster(mesh: AbstractMesh, includeDescendants: scala.Boolean): ShadowGenerator = js.native
  /**
    * Returns the darkness value (float). This can only decrease the actual darkness of a shadow.
    * 0 means strongest and 1 would means no shadow.
    * @returns the darkness.
    */
  def getDarkness(): scala.Double = js.native
  /**
    * Returns the associated light object.
    * @returns the light generating the shadow
    */
  def getLight(): IShadowLight = js.native
  /**
    * Prepare all the defines in a material relying on a shadow map at the specified light index.
    * @param defines Defines of the material we want to update
    * @param lightIndex Index of the light in the enabled light list of the material
    */
  def prepareDefines(defines: js.Any, lightIndex: scala.Double): scala.Unit = js.native
  /**
    * Helper function to remove a mesh and its descendants from the list of shadow casters
    * @param mesh Mesh to remove
    * @param includeDescendants boolean indicating if the descendants should be removed. Default to true
    * @returns the Shadow Generator itself
    */
  def removeShadowCaster(mesh: AbstractMesh): ShadowGenerator = js.native
  def removeShadowCaster(mesh: AbstractMesh, includeDescendants: scala.Boolean): ShadowGenerator = js.native
  /**
    * Sets the darkness value (float). This can only decrease the actual darkness of a shadow.
    * @param darkness The darkness value 0 means strongest and 1 would means no shadow.
    * @returns the shadow generator allowing fluent coding.
    */
  def setDarkness(darkness: scala.Double): ShadowGenerator = js.native
  /**
    * Sets the ability to have transparent shadow (boolean).
    * @param transparent True if transparent else False
    * @returns the shadow generator allowing fluent coding
    */
  def setTransparencyShadow(transparent: scala.Boolean): ShadowGenerator = js.native
}

/**
  * Default implementation IShadowGenerator.
  * This is the main object responsible of generating shadows in the framework.
  * Documentation: https://doc.babylonjs.com/babylon101/shadows
  */
@JSGlobal("BABYLON.ShadowGenerator")
@js.native
object ShadowGenerator extends js.Object {
  /**
    * Shadow generator mode ESM: Blurred Exponential Shadow Mapping using the inverse of the exponential preventing
    * edge artifacts on steep falloff.
    * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
    */
  val FILTER_BLURCLOSEEXPONENTIALSHADOWMAP: scala.Double = js.native
  /**
    * Shadow generator mode ESM: Blurred Exponential Shadow Mapping.
    * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
    */
  val FILTER_BLUREXPONENTIALSHADOWMAP: scala.Double = js.native
  /**
    * Shadow generator mode ESM: Exponential Shadow Mapping using the inverse of the exponential preventing
    * edge artifacts on steep falloff.
    * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
    */
  val FILTER_CLOSEEXPONENTIALSHADOWMAP: scala.Double = js.native
  /**
    * Shadow generator mode ESM: Exponential Shadow Mapping.
    * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
    */
  val FILTER_EXPONENTIALSHADOWMAP: scala.Double = js.native
  /**
    * Shadow generator mode None: no filtering applied.
    */
  val FILTER_NONE: scala.Double = js.native
  /**
    * Shadow generator mode PCF: Percentage Closer Filtering
    * benefits from Webgl 2 shadow samplers. Fallback to Poisson Sampling in Webgl 1
    * (https://developer.nvidia.com/gpugems/GPUGems/gpugems_ch11.html)
    */
  val FILTER_PCF: scala.Double = js.native
  /**
    * Shadow generator mode PCSS: Percentage Closering Soft Shadow.
    * benefits from Webgl 2 shadow samplers. Fallback to Poisson Sampling in Webgl 1
    * Contact Hardening
    */
  val FILTER_PCSS: scala.Double = js.native
  /**
    * Shadow generator mode Poisson Sampling: Percentage Closer Filtering.
    * (Multiple Tap around evenly distributed around the pixel are used to evaluate the shadow strength)
    */
  val FILTER_POISSONSAMPLING: scala.Double = js.native
  /**
    * Reserved for PCF and PCSS
    * Highest Quality.
    *
    * Execute PCF on a 5*5 kernel improving a lot the shadow aliasing artifacts.
    *
    * Execute PCSS with 32 taps blocker search and 64 taps PCF.
    */
  val QUALITY_HIGH: scala.Double = js.native
  /**
    * Reserved for PCF and PCSS
    * The lowest quality but the fastest.
    *
    * Execute PCF on a 1*1 kernel.
    *
    * Execute PCSS with 16 taps blocker search and 16 taps PCF.
    */
  val QUALITY_LOW: scala.Double = js.native
  /**
    * Reserved for PCF and PCSS
    * Good tradeoff for quality/perf cross devices
    *
    * Execute PCF on a 3*3 kernel.
    *
    * Execute PCSS with 16 taps blocker search and 32 taps PCF.
    */
  val QUALITY_MEDIUM: scala.Double = js.native
  /**
    * Parses a serialized ShadowGenerator and returns a new ShadowGenerator.
    * @param parsedShadowGenerator The JSON object to parse
    * @param scene The scene to create the shadow map for
    * @returns The parsed shadow generator
    */
  def Parse(parsedShadowGenerator: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.ShadowGenerator = js.native
}

