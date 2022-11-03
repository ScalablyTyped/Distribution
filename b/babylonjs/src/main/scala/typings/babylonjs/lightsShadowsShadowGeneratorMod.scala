package typings.babylonjs

import typings.babylonjs.anon.PartialuseInstancesboolea
import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.lightsShadowLightMod.IShadowLight
import typings.babylonjs.materialsEffectMod.Effect
import typings.babylonjs.materialsMaterialDefinesMod.MaterialDefines
import typings.babylonjs.materialsTexturesRenderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.materialsUniformBufferMod.UniformBuffer
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.meshesSubMeshMod.SubMesh
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.miscSmartArrayMod.SmartArray
import typings.babylonjs.postProcessesPostProcessMod.PostProcess
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightsShadowsShadowGeneratorMod {
  
  @JSImport("babylonjs/Lights/Shadows/shadowGenerator", "ShadowGenerator")
  @js.native
  open class ShadowGenerator protected ()
    extends StObject
       with IShadowGenerator {
    /**
      * Creates a ShadowGenerator object.
      * A ShadowGenerator is the required tool to use the shadows.
      * Each light casting shadows needs to use its own ShadowGenerator.
      * Documentation : https://doc.babylonjs.com/babylon101/shadows
      * @param mapSize The size of the texture what stores the shadows. Example : 1024.
      * @param light The light object generating the shadows.
      * @param usefullFloatFirst By default the generator will try to use half float textures but if you need precision (for self shadowing for instance), you can use this option to enforce full float texture.
      * @param camera Camera associated with this shadow generator (default: null). If null, takes the scene active camera at the time we need to access it
      */
    def this(mapSize: Double, light: IShadowLight) = this()
    def this(mapSize: Double, light: IShadowLight, usefullFloatFirst: Boolean) = this()
    def this(mapSize: Double, light: IShadowLight, usefullFloatFirst: Boolean, camera: Nullable[Camera]) = this()
    def this(mapSize: Double, light: IShadowLight, usefullFloatFirst: Unit, camera: Nullable[Camera]) = this()
    
    /* protected */ def _applyFilterValues(): Unit = js.native
    
    /* protected */ var _bias: Double = js.native
    
    /* protected */ def _bindCustomEffectForRenderSubMeshForShadowMap(subMesh: SubMesh, effect: Effect, mesh: AbstractMesh): Unit = js.native
    
    /* protected */ var _blurBoxOffset: Double = js.native
    
    /* protected */ var _blurKernel: Double = js.native
    
    /* protected */ var _blurPostProcesses: js.Array[PostProcess] = js.native
    
    /* protected */ var _blurScale: Double = js.native
    
    /* protected */ var _boxBlurPostprocess: Nullable[PostProcess] = js.native
    
    /* protected */ var _cachedDefines: String = js.native
    
    /* protected */ var _cachedDirection: Vector3 = js.native
    
    /* protected */ var _cachedPosition: Vector3 = js.native
    
    /* protected */ var _camera: Nullable[Camera] = js.native
    
    /* protected */ var _contactHardeningLightSizeUVRatio: Double = js.native
    
    /* protected */ def _createTargetRenderTexture(): Unit = js.native
    
    /* protected */ var _currentFaceIndex: Double = js.native
    
    /* protected */ var _currentFaceIndexCache: Double = js.native
    
    /* protected */ var _currentRenderId: Double = js.native
    
    /* protected */ var _currentSceneUBO: UniformBuffer = js.native
    
    /* protected */ var _darkness: Double = js.native
    
    /* protected */ var _defaultTextureMatrix: Matrix = js.native
    
    /* protected */ var _depthScale: Double = js.native
    
    /* protected */ def _disposeBlurPostProcesses(): Unit = js.native
    
    /* protected */ def _disposeRTTandPostProcesses(): Unit = js.native
    
    /* protected */ def _disposeSceneUBOs(): Unit = js.native
    
    /* protected */ var _filter: Double = js.native
    
    /* protected */ var _filteringQuality: Double = js.native
    
    /* protected */ def _getCamera(): Nullable[Camera] = js.native
    
    /* protected */ def _initializeBlurRTTAndPostProcesses(): Unit = js.native
    
    /* protected */ def _initializeGenerator(): Unit = js.native
    
    /* protected */ def _initializeShadowMap(): Unit = js.native
    
    /* protected */ def _isReadyCustomDefines(defines: Any, subMesh: SubMesh, useInstances: Boolean): Unit = js.native
    
    /* protected */ var _kernelBlurXPostprocess: Nullable[PostProcess] = js.native
    
    /* protected */ var _kernelBlurYPostprocess: Nullable[PostProcess] = js.native
    
    /* protected */ var _light: IShadowLight = js.native
    
    /* protected */ var _lightDirection: Vector3 = js.native
    
    /* protected */ var _mapSize: Double = js.native
    
    /* protected */ var _normalBias: Double = js.native
    
    /* private */ var _prepareShadowDefines: Any = js.native
    
    /* protected */ var _projectionMatrix: Matrix = js.native
    
    /* protected */ def _renderForShadowMap(
      opaqueSubMeshes: SmartArray[SubMesh],
      alphaTestSubMeshes: SmartArray[SubMesh],
      transparentSubMeshes: SmartArray[SubMesh],
      depthOnlySubMeshes: SmartArray[SubMesh]
    ): Unit = js.native
    
    /* protected */ def _renderSubMeshForShadowMap(subMesh: SubMesh): Unit = js.native
    /* protected */ def _renderSubMeshForShadowMap(subMesh: SubMesh, isTransparent: Boolean): Unit = js.native
    
    /* protected */ var _scene: Scene = js.native
    
    /* protected */ var _sceneUBOs: js.Array[UniformBuffer] = js.native
    
    /* protected */ var _shadowMap: Nullable[RenderTargetTexture] = js.native
    
    /* protected */ var _shadowMap2: Nullable[RenderTargetTexture] = js.native
    
    /* protected */ var _storedUniqueId: Nullable[Double] = js.native
    
    /* protected */ var _textureType: Double = js.native
    
    /* protected */ var _transformMatrix: Matrix = js.native
    
    /* protected */ var _transparencyShadow: Boolean = js.native
    
    /* protected */ var _useKernelBlur: Boolean = js.native
    
    /* protected */ var _useUBO: Boolean = js.native
    
    /* protected */ def _validateFilter(filter: Double): Double = js.native
    
    /* protected */ var _viewMatrix: Matrix = js.native
    
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
      * The texture used is the diffuse by default, but it can be set to the opacity by setting useOpacityTextureForTransparentShadow
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
      * Gets the normalBias: offset applied on the depth preventing acnea (along side the normal direction and proportional to the light/normal angle).
      */
    def normalBias: Double = js.native
    /**
      * Sets the normalBias: offset applied on the depth preventing acnea (along side the normal direction and proportional to the light/normal angle).
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
    def prepareDefines(defines: Any, lightIndex: Double): Unit = js.native
    
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
      * If this is true, use the opacity texture's alpha channel for transparent shadows instead of the diffuse one
      */
    var useOpacityTextureForTransparentShadow: Boolean = js.native
    
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
  /* static members */
  object ShadowGenerator {
    
    @JSImport("babylonjs/Lights/Shadows/shadowGenerator", "ShadowGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Name of the shadow generator class
      */
    @JSImport("babylonjs/Lights/Shadows/shadowGenerator", "ShadowGenerator.CLASSNAME")
    @js.native
    def CLASSNAME: String = js.native
    inline def CLASSNAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASSNAME")(x.asInstanceOf[js.Any])
    
    /**
      * Defines the default alpha cutoff value used for transparent alpha tested materials.
      */
    @JSImport("babylonjs/Lights/Shadows/shadowGenerator", "ShadowGenerator.DEFAULT_ALPHA_CUTOFF")
    @js.native
    def DEFAULT_ALPHA_CUTOFF: Double = js.native
    inline def DEFAULT_ALPHA_CUTOFF_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ALPHA_CUTOFF")(x.asInstanceOf[js.Any])
    
    /**
      * Shadow generator mode ESM: Blurred Exponential Shadow Mapping using the inverse of the exponential preventing
      * edge artifacts on steep falloff.
      * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
      */
    @JSImport("babylonjs/Lights/Shadows/shadowGenerator", "ShadowGenerator.FILTER_BLURCLOSEEXPONENTIALSHADOWMAP")
    @js.native
    val FILTER_BLURCLOSEEXPONENTIALSHADOWMAP: Double = js.native
    
    /**
      * Shadow generator mode ESM: Blurred Exponential Shadow Mapping.
      * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
      */
    @JSImport("babylonjs/Lights/Shadows/shadowGenerator", "ShadowGenerator.FILTER_BLUREXPONENTIALSHADOWMAP")
    @js.native
    val FILTER_BLUREXPONENTIALSHADOWMAP: Double = js.native
    
    /**
      * Shadow generator mode ESM: Exponential Shadow Mapping using the inverse of the exponential preventing
      * edge artifacts on steep falloff.
      * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
      */
    @JSImport("babylonjs/Lights/Shadows/shadowGenerator", "ShadowGenerator.FILTER_CLOSEEXPONENTIALSHADOWMAP")
    @js.native
    val FILTER_CLOSEEXPONENTIALSHADOWMAP: Double = js.native
    
    /**
      * Shadow generator mode ESM: Exponential Shadow Mapping.
      * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
      */
    @JSImport("babylonjs/Lights/Shadows/shadowGenerator", "ShadowGenerator.FILTER_EXPONENTIALSHADOWMAP")
    @js.native
    val FILTER_EXPONENTIALSHADOWMAP: Double = js.native
    
    /**
      * Shadow generator mode None: no filtering applied.
      */
    @JSImport("babylonjs/Lights/Shadows/shadowGenerator", "ShadowGenerator.FILTER_NONE")
    @js.native
    val FILTER_NONE: Double = js.native
    
    /**
      * Shadow generator mode PCF: Percentage Closer Filtering
      * benefits from Webgl 2 shadow samplers. Fallback to Poisson Sampling in Webgl 1
      * (https://developer.nvidia.com/gpugems/GPUGems/gpugems_ch11.html)
      */
    @JSImport("babylonjs/Lights/Shadows/shadowGenerator", "ShadowGenerator.FILTER_PCF")
    @js.native
    val FILTER_PCF: Double = js.native
    
    /**
      * Shadow generator mode PCSS: Percentage Closering Soft Shadow.
      * benefits from Webgl 2 shadow samplers. Fallback to Poisson Sampling in Webgl 1
      * Contact Hardening
      */
    @JSImport("babylonjs/Lights/Shadows/shadowGenerator", "ShadowGenerator.FILTER_PCSS")
    @js.native
    val FILTER_PCSS: Double = js.native
    
    /**
      * Shadow generator mode Poisson Sampling: Percentage Closer Filtering.
      * (Multiple Tap around evenly distributed around the pixel are used to evaluate the shadow strength)
      */
    @JSImport("babylonjs/Lights/Shadows/shadowGenerator", "ShadowGenerator.FILTER_POISSONSAMPLING")
    @js.native
    val FILTER_POISSONSAMPLING: Double = js.native
    
    /**
      * Parses a serialized ShadowGenerator and returns a new ShadowGenerator.
      * @param parsedShadowGenerator The JSON object to parse
      * @param scene The scene to create the shadow map for
      * @param constr A function that builds a shadow generator or undefined to create an instance of the default shadow generator
      * @returns The parsed shadow generator
      */
    inline def Parse(parsedShadowGenerator: Any, scene: Scene): ShadowGenerator = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedShadowGenerator.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[ShadowGenerator]
    inline def Parse(
      parsedShadowGenerator: Any,
      scene: Scene,
      constr: js.Function3[
          /* mapSize */ Double, 
          /* light */ IShadowLight, 
          /* camera */ Nullable[Camera], 
          this.type
        ]
    ): ShadowGenerator = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedShadowGenerator.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], constr.asInstanceOf[js.Any])).asInstanceOf[ShadowGenerator]
    
    /**
      * Reserved for PCF and PCSS
      * Highest Quality.
      *
      * Execute PCF on a 5*5 kernel improving a lot the shadow aliasing artifacts.
      *
      * Execute PCSS with 32 taps blocker search and 64 taps PCF.
      */
    @JSImport("babylonjs/Lights/Shadows/shadowGenerator", "ShadowGenerator.QUALITY_HIGH")
    @js.native
    val QUALITY_HIGH: Double = js.native
    
    /**
      * Reserved for PCF and PCSS
      * The lowest quality but the fastest.
      *
      * Execute PCF on a 1*1 kernel.
      *
      * Execute PCSS with 16 taps blocker search and 16 taps PCF.
      */
    @JSImport("babylonjs/Lights/Shadows/shadowGenerator", "ShadowGenerator.QUALITY_LOW")
    @js.native
    val QUALITY_LOW: Double = js.native
    
    /**
      * Reserved for PCF and PCSS
      * Good tradeoff for quality/perf cross devices
      *
      * Execute PCF on a 3*3 kernel.
      *
      * Execute PCSS with 16 taps blocker search and 32 taps PCF.
      */
    @JSImport("babylonjs/Lights/Shadows/shadowGenerator", "ShadowGenerator.QUALITY_MEDIUM")
    @js.native
    val QUALITY_MEDIUM: Double = js.native
    
    /**
      * @internal
      */
    inline def _SceneComponentInitialization(scene: Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait ICustomShaderOptions extends StObject {
    
    /**
      * The list of attribute names used in the shader
      */
    var attributes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The list of defines used in the shader
      */
    var defines: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The list of sampler names used in the shader
      */
    var samplers: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Gets or sets the custom shader name to use
      */
    var shaderName: String
    
    /**
      * The list of uniform names used in the shader
      */
    var uniforms: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ICustomShaderOptions {
    
    inline def apply(shaderName: String): ICustomShaderOptions = {
      val __obj = js.Dynamic.literal(shaderName = shaderName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICustomShaderOptions]
    }
    
    extension [Self <: ICustomShaderOptions](x: Self) {
      
      inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setDefines(value: js.Array[String]): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
      
      inline def setDefinesUndefined: Self = StObject.set(x, "defines", js.undefined)
      
      inline def setDefinesVarargs(value: String*): Self = StObject.set(x, "defines", js.Array(value*))
      
      inline def setSamplers(value: js.Array[String]): Self = StObject.set(x, "samplers", value.asInstanceOf[js.Any])
      
      inline def setSamplersUndefined: Self = StObject.set(x, "samplers", js.undefined)
      
      inline def setSamplersVarargs(value: String*): Self = StObject.set(x, "samplers", js.Array(value*))
      
      inline def setShaderName(value: String): Self = StObject.set(x, "shaderName", value.asInstanceOf[js.Any])
      
      inline def setUniforms(value: js.Array[String]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
      
      inline def setUniformsVarargs(value: String*): Self = StObject.set(x, "uniforms", js.Array(value*))
    }
  }
  
  @js.native
  trait IShadowGenerator extends StObject {
    
    /**
      * Binds the shadow related information inside of an effect (information like near, far, darkness...
      * defined in the generator but impacting the effect).
      * It implies the uniforms available on the materials are the standard BJS ones.
      * @param lightIndex Index of the light in the enabled light list of the material owning the effect
      * @param effect The effect we are binding the information for
      */
    def bindShadowLight(lightIndex: String, effect: Effect): Unit = js.native
    
    /**
      * Disposes the Shadow map and related Textures and effects.
      */
    def dispose(): Unit = js.native
    
    /**
      * Forces all the attached effect to compile to enable rendering only once ready vs. lazily compiling effects.
      * @param onCompiled Callback triggered at the and of the effects compilation
      * @param options Sets of optional options forcing the compilation with different modes
      */
    def forceCompilation(): Unit = js.native
    def forceCompilation(onCompiled: js.Function1[/* generator */ this.type, Unit]): Unit = js.native
    def forceCompilation(onCompiled: js.Function1[/* generator */ this.type, Unit], options: PartialuseInstancesboolea): Unit = js.native
    def forceCompilation(onCompiled: Unit, options: PartialuseInstancesboolea): Unit = js.native
    
    /**
      * Forces all the attached effect to compile to enable rendering only once ready vs. lazily compiling effects.
      * @param options Sets of optional options forcing the compilation with different modes
      * @returns A promise that resolves when the compilation completes
      */
    def forceCompilationAsync(): js.Promise[Unit] = js.native
    def forceCompilationAsync(options: PartialuseInstancesboolea): js.Promise[Unit] = js.native
    
    /**
      * Gets the main RTT containing the shadow map (usually storing depth from the light point of view).
      * @returns The render target texture if present otherwise, null
      */
    def getShadowMap(): Nullable[RenderTargetTexture] = js.native
    
    /**
      * Gets the transformation matrix used to project the meshes into the map from the light point of view.
      * (eq to shadow projection matrix * light transform matrix)
      * @returns The transform matrix used to create the shadow map
      */
    def getTransformMatrix(): Matrix = js.native
    
    /** Gets or set the id of the shadow generator. It will be the one from the light if not defined */
    var id: String = js.native
    
    /**
      * Determine whether the shadow generator is ready or not (mainly all effects and related post processes needs to be ready).
      * @param subMesh The submesh we want to render in the shadow map
      * @param useInstances Defines whether will draw in the map using instances
      * @param isTransparent Indicates that isReady is called for a transparent subMesh
      * @returns true if ready otherwise, false
      */
    def isReady(subMesh: SubMesh, useInstances: Boolean, isTransparent: Boolean): Boolean = js.native
    
    /**
      * Prepare all the defines in a material relying on a shadow map at the specified light index.
      * @param defines Defines of the material we want to update
      * @param lightIndex Index of the light in the enabled light list of the material
      */
    def prepareDefines(defines: MaterialDefines, lightIndex: Double): Unit = js.native
    
    /**
      * Recreates the shadow map dependencies like RTT and post processes. This can be used during the switch between
      * Cube and 2D textures for instance.
      */
    def recreateShadowMap(): Unit = js.native
    
    /**
      * Serializes the shadow generator setup to a json object.
      * @returns The serialized JSON object
      */
    def serialize(): Any = js.native
  }
}
