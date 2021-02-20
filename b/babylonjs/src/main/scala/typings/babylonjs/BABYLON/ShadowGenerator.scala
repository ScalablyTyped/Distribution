package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShadowGenerator extends IShadowGenerator {
  
  /* protected */ def _applyFilterValues(): Unit = js.native
  
  var _bias: Double = js.native
  
  /* protected */ def _bindCustomEffectForRenderSubMeshForShadowMap(subMesh: SubMesh, effect: Effect, matriceNames: js.Any, mesh: AbstractMesh): Unit = js.native
  
  var _blurBoxOffset: Double = js.native
  
  var _blurKernel: Double = js.native
  
  var _blurPostProcesses: js.Array[PostProcess] = js.native
  
  var _blurScale: Double = js.native
  
  var _boxBlurPostprocess: Nullable[PostProcess] = js.native
  
  var _cachedDefines: String = js.native
  
  var _cachedDirection: Vector3 = js.native
  
  var _cachedPosition: Vector3 = js.native
  
  var _contactHardeningLightSizeUVRatio: Double = js.native
  
  /* protected */ def _createTargetRenderTexture(): Unit = js.native
  
  var _currentFaceIndex: Double = js.native
  
  var _currentFaceIndexCache: Double = js.native
  
  var _currentRenderID: Double = js.native
  
  var _darkness: Double = js.native
  
  var _defaultTextureMatrix: Matrix = js.native
  
  var _depthScale: Double = js.native
  
  /* protected */ def _disposeBlurPostProcesses(): Unit = js.native
  
  /* protected */ def _disposeRTTandPostProcesses(): Unit = js.native
  
  var _effect: Effect = js.native
  
  var _filter: Double = js.native
  
  var _filteringQuality: Double = js.native
  
  /* protected */ def _initializeBlurRTTAndPostProcesses(): Unit = js.native
  
  /* protected */ def _initializeGenerator(): Unit = js.native
  
  /* protected */ def _initializeShadowMap(): Unit = js.native
  
  /* protected */ def _isReadyCustomDefines(defines: js.Any, subMesh: SubMesh, useInstances: Boolean): Unit = js.native
  
  var _kernelBlurXPostprocess: Nullable[PostProcess] = js.native
  
  var _kernelBlurYPostprocess: Nullable[PostProcess] = js.native
  
  var _light: IShadowLight = js.native
  
  var _lightDirection: Vector3 = js.native
  
  var _mapSize: Double = js.native
  
  var _normalBias: Double = js.native
  
  var _prepareShadowDefines: js.Any = js.native
  
  var _projectionMatrix: Matrix = js.native
  
  /* protected */ def _renderForShadowMap(
    opaqueSubMeshes: SmartArray[SubMesh],
    alphaTestSubMeshes: SmartArray[SubMesh],
    transparentSubMeshes: SmartArray[SubMesh],
    depthOnlySubMeshes: SmartArray[SubMesh]
  ): Unit = js.native
  
  /* protected */ def _renderSubMeshForShadowMap(subMesh: SubMesh): Unit = js.native
  /* protected */ def _renderSubMeshForShadowMap(subMesh: SubMesh, isTransparent: Boolean): Unit = js.native
  
  var _scene: Scene = js.native
  
  var _shadowMap: Nullable[RenderTargetTexture] = js.native
  
  var _shadowMap2: Nullable[RenderTargetTexture] = js.native
  
  var _storedUniqueId: Nullable[Double] = js.native
  
  var _textureType: Double = js.native
  
  var _transformMatrix: Matrix = js.native
  
  var _transparencyShadow: Boolean = js.native
  
  var _useKernelBlur: Boolean = js.native
  
  /* protected */ def _validateFilter(filter: Double): Double = js.native
  
  var _viewMatrix: Matrix = js.native
  
  /**
    * Helper function to add a mesh and its descendants to the list of shadow casters.
    * @param mesh Mesh to add
    * @param includeDescendants boolean indicating if the descendants should be added. Default to true
    * @returns the Shadow Generator itself
    */
  def addShadowCaster(mesh: AbstractMesh): ShadowGenerator = js.native
  def addShadowCaster(mesh: AbstractMesh, includeDescendants: Boolean): ShadowGenerator = js.native
  
  /**
    * Gets the bias: offset applied on the depth preventing acnea (in light direction).
    */
  def bias: Double = js.native
  /**
    * Sets the bias: offset applied on the depth preventing acnea (in light direction).
    */
  def bias_=(bias: Double): Unit = js.native
  
  /**
    * Gets the blur box offset: offset applied during the blur pass.
    * Only useful if useKernelBlur = false
    */
  def blurBoxOffset: Double = js.native
  /**
    * Sets the blur box offset: offset applied during the blur pass.
    * Only useful if useKernelBlur = false
    */
  def blurBoxOffset_=(value: Double): Unit = js.native
  
  /**
    * Gets the blur kernel: kernel size of the blur pass.
    * Only useful if useKernelBlur = true
    */
  def blurKernel: Double = js.native
  /**
    * Sets the blur kernel: kernel size of the blur pass.
    * Only useful if useKernelBlur = true
    */
  def blurKernel_=(value: Double): Unit = js.native
  
  /**
    * Gets the blur scale: scale of the blurred texture compared to the main shadow map.
    * 2 means half of the size.
    */
  def blurScale: Double = js.native
  /**
    * Sets the blur scale: scale of the blurred texture compared to the main shadow map.
    * 2 means half of the size.
    */
  def blurScale_=(value: Double): Unit = js.native
  
  /**
    * Gets the Light Size (in shadow map uv unit) used in PCSS to determine the blocker search area and the penumbra size.
    * Using a ratio helps keeping shape stability independently of the map size.
    *
    * It does not account for the light projection as it was having too much
    * instability during the light setup or during light position changes.
    *
    * Only valid if useContactHardeningShadow is true.
    */
  def contactHardeningLightSizeUVRatio: Double = js.native
  /**
    * Sets the Light Size (in shadow map uv unit) used in PCSS to determine the blocker search area and the penumbra size.
    * Using a ratio helps keeping shape stability independently of the map size.
    *
    * It does not account for the light projection as it was having too much
    * instability during the light setup or during light position changes.
    *
    * Only valid if useContactHardeningShadow is true.
    */
  def contactHardeningLightSizeUVRatio_=(contactHardeningLightSizeUVRatio: Double): Unit = js.native
  
  /** Gets or sets a custom function to allow/disallow rendering a sub mesh in the shadow map */
  def customAllowRendering(subMesh: SubMesh): Boolean = js.native
  
  /** Gets or sets the custom shader name to use */
  var customShaderOptions: ICustomShaderOptions = js.native
  
  /** Gets or sets the actual darkness of a shadow */
  def darkness: Double = js.native
  def darkness_=(value: Double): Unit = js.native
  
  /**
    * Gets the depth scale used in ESM mode.
    */
  def depthScale: Double = js.native
  /**
    * Sets the depth scale used in ESM mode.
    * This can override the scale stored on the light.
    */
  def depthScale_=(value: Double): Unit = js.native
  
  /**
    * Enables or disables shadows with varying strength based on the transparency
    * When it is enabled, the strength of the shadow is taken equal to mesh.visibility
    * If you enabled an alpha texture on your material, the alpha value red from the texture is also combined to compute the strength:
    *          mesh.visibility * alphaTexture.a
    * Note that by definition transparencyShadow must be set to true for enableSoftTransparentShadow to work!
    */
  var enableSoftTransparentShadow: Boolean = js.native
  
  /**
    * Gets the current mode of the shadow generator (normal, PCF, ESM...).
    * The returned value is a number equal to one of the available mode defined in ShadowMap.FILTER_x like _FILTER_NONE
    */
  def filter: Double = js.native
  /**
    * Sets the current mode of the shadow generator (normal, PCF, ESM...).
    * The returned value is a number equal to one of the available mode defined in ShadowMap.FILTER_x like _FILTER_NONE
    */
  def filter_=(value: Double): Unit = js.native
  
  /**
    * Gets the PCF or PCSS Quality.
    * Only valid if usePercentageCloserFiltering or usePercentageCloserFiltering is true.
    */
  def filteringQuality: Double = js.native
  /**
    * Sets the PCF or PCSS Quality.
    * Only valid if usePercentageCloserFiltering or usePercentageCloserFiltering is true.
    */
  def filteringQuality_=(filteringQuality: Double): Unit = js.native
  
  /**
    * If true the shadow map is generated by rendering the back face of the mesh instead of the front face.
    * This can help with self-shadowing as the geometry making up the back of objects is slightly offset.
    * It might on the other hand introduce peter panning.
    */
  var forceBackFacesOnly: Boolean = js.native
  
  /**
    * Controls the extent to which the shadows fade out at the edge of the frustum
    */
  var frustumEdgeFalloff: Double = js.native
  
  /**
    * Gets the class name of that object
    * @returns "ShadowGenerator"
    */
  def getClassName(): String = js.native
  
  /**
    * Returns the darkness value (float). This can only decrease the actual darkness of a shadow.
    * 0 means strongest and 1 would means no shadow.
    * @returns the darkness.
    */
  def getDarkness(): Double = js.native
  
  /**
    * Returns the associated light object.
    * @returns the light generating the shadow
    */
  def getLight(): IShadowLight = js.native
  
  /**
    * Gets the RTT used during rendering (can be a blurred version of the shadow map or the shadow map itself).
    * @returns The render target texture if the shadow map is present otherwise, null
    */
  def getShadowMapForRendering(): Nullable[RenderTargetTexture] = js.native
  
  /**
    * Gets or sets the size of the texture what stores the shadows
    */
  def mapSize: Double = js.native
  def mapSize_=(size: Double): Unit = js.native
  
  /**
    * Gets the normalBias: offset applied on the depth preventing acnea (along side the normal direction and proportinal to the light/normal angle).
    */
  def normalBias: Double = js.native
  /**
    * Sets the normalBias: offset applied on the depth preventing acnea (along side the normal direction and proportinal to the light/normal angle).
    */
  def normalBias_=(normalBias: Double): Unit = js.native
  
  /**
    * Observable triggered after a mesh is rendered in the shadow map.
    * Can be used to update internal effect state (that you can get from the onAfterShadowMapRenderObservable)
    */
  var onAfterShadowMapRenderMeshObservable: Observable[Mesh] = js.native
  
  /**
    * Observable triggered after the shadow is rendered. Can be used to restore internal effect state
    */
  var onAfterShadowMapRenderObservable: Observable[Effect] = js.native
  
  /**
    * Observable triggered before a mesh is rendered in the shadow map.
    * Can be used to update internal effect state (that you can get from the onBeforeShadowMapRenderObservable)
    */
  var onBeforeShadowMapRenderMeshObservable: Observable[Mesh] = js.native
  
  /**
    * Observable triggered before the shadow is rendered. Can be used to update internal effect state
    */
  var onBeforeShadowMapRenderObservable: Observable[Effect] = js.native
  
  /**
    * Prepare all the defines in a material relying on a shadow map at the specified light index.
    * @param defines Defines of the material we want to update
    * @param lightIndex Index of the light in the enabled light list of the material
    */
  def prepareDefines(defines: js.Any, lightIndex: Double): Unit = js.native
  
  /**
    * Helper function to remove a mesh and its descendants from the list of shadow casters
    * @param mesh Mesh to remove
    * @param includeDescendants boolean indicating if the descendants should be removed. Default to true
    * @returns the Shadow Generator itself
    */
  def removeShadowCaster(mesh: AbstractMesh): ShadowGenerator = js.native
  def removeShadowCaster(mesh: AbstractMesh, includeDescendants: Boolean): ShadowGenerator = js.native
  
  /**
    * Sets the darkness value (float). This can only decrease the actual darkness of a shadow.
    * @param darkness The darkness value 0 means strongest and 1 would means no shadow.
    * @returns the shadow generator allowing fluent coding.
    */
  def setDarkness(darkness: Double): ShadowGenerator = js.native
  
  /**
    * Sets the ability to have transparent shadow (boolean).
    * @param transparent True if transparent else False
    * @returns the shadow generator allowing fluent coding
    */
  def setTransparencyShadow(transparent: Boolean): ShadowGenerator = js.native
  
  /** Gets or sets the ability to have transparent shadow  */
  def transparencyShadow: Boolean = js.native
  def transparencyShadow_=(value: Boolean): Unit = js.native
  
  /**
    * Gets if the current filter is set to filtered "close ESM" (using the inverse of the
    * exponential to prevent steep falloff artifacts).
    */
  def useBlurCloseExponentialShadowMap: Boolean = js.native
  /**
    * Sets the current filter to filtered "close ESM" (using the inverse of the
    * exponential to prevent steep falloff artifacts).
    */
  def useBlurCloseExponentialShadowMap_=(value: Boolean): Unit = js.native
  
  /**
    * Gets if the current filter is set to filtered ESM.
    */
  def useBlurExponentialShadowMap: Boolean = js.native
  /**
    * Gets if the current filter is set to filtered  ESM.
    */
  def useBlurExponentialShadowMap_=(value: Boolean): Unit = js.native
  
  /**
    * Gets if the current filter is set to "close ESM" (using the inverse of the
    * exponential to prevent steep falloff artifacts).
    */
  def useCloseExponentialShadowMap: Boolean = js.native
  /**
    * Sets the current filter to "close ESM" (using the inverse of the
    * exponential to prevent steep falloff artifacts).
    */
  def useCloseExponentialShadowMap_=(value: Boolean): Unit = js.native
  
  /**
    * Gets if the current filter is set to "PCSS" (contact hardening).
    */
  def useContactHardeningShadow: Boolean = js.native
  /**
    * Sets the current filter to "PCSS" (contact hardening).
    */
  def useContactHardeningShadow_=(value: Boolean): Unit = js.native
  
  /**
    * Gets if the current filter is set to ESM.
    */
  def useExponentialShadowMap: Boolean = js.native
  /**
    * Sets the current filter is to ESM.
    */
  def useExponentialShadowMap_=(value: Boolean): Unit = js.native
  
  /**
    * Gets whether the blur pass is a kernel blur (if true) or box blur.
    * Only useful in filtered mode (useBlurExponentialShadowMap...)
    */
  def useKernelBlur: Boolean = js.native
  /**
    * Sets whether the blur pass is a kernel blur (if true) or box blur.
    * Only useful in filtered mode (useBlurExponentialShadowMap...)
    */
  def useKernelBlur_=(value: Boolean): Unit = js.native
  
  /**
    * Gets if the current filter is set to "PCF" (percentage closer filtering).
    */
  def usePercentageCloserFiltering: Boolean = js.native
  /**
    * Sets the current filter to "PCF" (percentage closer filtering).
    */
  def usePercentageCloserFiltering_=(value: Boolean): Unit = js.native
  
  /**
    * Gets if the current filter is set to Poisson Sampling.
    */
  def usePoissonSampling: Boolean = js.native
  /**
    * Sets the current filter to Poisson Sampling.
    */
  def usePoissonSampling_=(value: Boolean): Unit = js.native
}
