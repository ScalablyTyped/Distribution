package typings.babylonjs

import typings.babylonjs.animatableInterfaceMod.IAnimatable
import typings.babylonjs.animationMod.Animation
import typings.babylonjs.blurPostProcessMod.BlurPostProcess
import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.directionalLightMod.DirectionalLight
import typings.babylonjs.fxaaPostProcessMod.FxaaPostProcess
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.postProcessRenderPipelineMod.PostProcessRenderPipeline
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.screenSpaceReflectionPostProcessMod.ScreenSpaceReflectionPostProcess
import typings.babylonjs.spotLightMod.SpotLight
import typings.babylonjs.textureMod.Texture
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/RenderPipeline/Pipelines/standardRenderingPipeline", JSImport.Namespace)
@js.native
object standardRenderingPipelineMod extends js.Object {
  
  @js.native
  class StandardRenderingPipeline protected ()
    extends PostProcessRenderPipeline
       with IDisposable
       with IAnimatable {
    /**
      * Default pipeline should be used going forward but the standard pipeline will be kept for backwards compatibility.
      * @constructor
      * @param name The rendering pipeline name
      * @param scene The scene linked to this pipeline
      * @param ratio The size of the postprocesses (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
      * @param originalPostProcess the custom original color post-process. Must be "reusable". Can be null.
      * @param cameras The array of cameras that the rendering pipeline will be attached to
      */
    def this(name: String, scene: Scene, ratio: Double) = this()
    def this(name: String, scene: Scene, ratio: Double, originalPostProcess: Nullable[PostProcess]) = this()
    def this(
      name: String,
      scene: Scene,
      ratio: Double,
      originalPostProcess: js.UndefOr[Nullable[PostProcess]],
      cameras: js.Array[Camera]
    ) = this()
    
    /**
      * @ignore
      * Specifies if the bloom pipeline is enabled
      */
    def BloomEnabled: Boolean = js.native
    def BloomEnabled_=(enabled: Boolean): Unit = js.native
    
    /**
      * @ignore
      * Specifies if the depth of field pipeline is enabed
      */
    def DepthOfFieldEnabled: Boolean = js.native
    def DepthOfFieldEnabled_=(enabled: Boolean): Unit = js.native
    
    /**
      * @ignore
      * Specifies if the HDR pipeline is enabled
      */
    def HDREnabled: Boolean = js.native
    def HDREnabled_=(enabled: Boolean): Unit = js.native
    
    /**
      * @ignore
      * Specifies if the lens flare pipeline is enabed
      */
    def LensFlareEnabled: Boolean = js.native
    def LensFlareEnabled_=(enabled: Boolean): Unit = js.native
    
    /**
      * @ignore
      * Specifies if the motion blur effect is enabled
      */
    def MotionBlurEnabled: Boolean = js.native
    def MotionBlurEnabled_=(enabled: Boolean): Unit = js.native
    
    /**
      * @ignore
      * Specifies if the volumetric lights scattering effect is enabled
      */
    def VLSEnabled: Boolean = js.native
    def VLSEnabled_=(enabled: Boolean): Unit = js.native
    
    var _basePostProcess: js.Any = js.native
    
    var _bloomEnabled: js.Any = js.native
    
    var _buildPipeline: js.Any = js.native
    
    var _camerasToBeAttached: js.Any = js.native
    
    var _createBlurPostProcesses: js.Any = js.native
    
    var _createBrightPassPostProcess: js.Any = js.native
    
    var _createDepthOfFieldPostProcess: js.Any = js.native
    
    var _createDownSampleX4PostProcess: js.Any = js.native
    
    var _createHdrPostProcess: js.Any = js.native
    
    var _createLensFlarePostProcess: js.Any = js.native
    
    var _createLuminancePostProcesses: js.Any = js.native
    
    var _createMotionBlurPostProcess: js.Any = js.native
    
    var _createTextureAdderPostProcess: js.Any = js.native
    
    var _createVolumetricLightPostProcess: js.Any = js.native
    
    var _currentDepthOfFieldSource: js.Any = js.native
    
    var _currentExposure: js.Any = js.native
    
    var _depthOfFieldEnabled: js.Any = js.native
    
    var _disposePostProcesses: js.Any = js.native
    
    var _fixedExposure: js.Any = js.native
    
    var _floatTextureType: js.Any = js.native
    
    var _fxaaEnabled: js.Any = js.native
    
    var _getDepthTexture: js.Any = js.native
    
    var _hdrAutoExposure: js.Any = js.native
    
    var _hdrCurrentLuminance: js.Any = js.native
    
    var _hdrEnabled: js.Any = js.native
    
    var _isObjectBasedMotionBlur: js.Any = js.native
    
    var _lensFlareEnabled: js.Any = js.native
    
    var _motionBlurEnabled: js.Any = js.native
    
    var _motionBlurSamples: js.Any = js.native
    
    var _motionStrength: js.Any = js.native
    
    var _ratio: js.Any = js.native
    
    var _samples: js.Any = js.native
    
    /**
      * Private members
      */
    var _scene: js.Any = js.native
    
    var _screenSpaceReflectionsEnabled: js.Any = js.native
    
    var _vlsEnabled: js.Any = js.native
    
    var _volumetricLightStepsCount: js.Any = js.native
    
    /**
      * List of animations for the pipeline (IAnimatable implementation)
      */
    @JSName("animations")
    var animations_StandardRenderingPipeline: js.Array[Animation] = js.native
    
    /**
      * Post-process array storing all the horizontal blur post-processes used by the pipeline
      */
    var blurHPostProcesses: js.Array[PostProcess] = js.native
    
    /**
      * Post-process array storing all the vertical blur post-processes used by the pipeline
      */
    var blurVPostProcesses: js.Array[PostProcess] = js.native
    
    /**
      * Configures the blur intensity used for surexposed surfaces are highlighted surfaces (light halo)
      */
    var blurWidth: Double = js.native
    
    /**
      * Post-process used to calculate the illuminated surfaces controlled by a threshold
      */
    var brightPassPostProcess: Nullable[PostProcess] = js.native
    
    /**
      * Represents the brightness threshold in order to configure the illuminated surfaces
      */
    var brightThreshold: Double = js.native
    
    /**
      * Represents the blur intensity for the blurred part of the depth of field effect
      */
    var depthOfFieldBlurWidth: Double = js.native
    
    /**
      * Represents the focal length for the depth of field effect
      */
    var depthOfFieldDistance: Double = js.native
    
    /**
      * Post-process used to create a depth of field effect
      */
    var depthOfFieldPostProcess: Nullable[PostProcess] = js.native
    
    /**
      * Disposes of the pipeline
      */
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    
    /**
      * Post-process used to down scale an image x4
      */
    var downSampleX4PostProcess: Nullable[PostProcess] = js.native
    
    /**
      * Gets the overall exposure used by the pipeline
      */
    def exposure: Double = js.native
    /**
      * Sets the overall exposure used by the pipeline
      */
    def exposure_=(value: Double): Unit = js.native
    
    /**
      * Specifies if anti-aliasing is enabled
      */
    def fxaaEnabled: Boolean = js.native
    def fxaaEnabled_=(enabled: Boolean): Unit = js.native
    
    /**
      * The Fast Approximate Anti-Aliasing post process which attemps to remove aliasing from an image.
      */
    var fxaaPostProcess: Nullable[FxaaPostProcess] = js.native
    
    /**
      * Gets wether or not the exposure of the overall pipeline should be automatically adjusted by the HDR post-process
      */
    def hdrAutoExposure: Boolean = js.native
    /**
      * Sets wether or not the exposure of the overall pipeline should be automatically adjusted by the HDR post-process
      */
    def hdrAutoExposure_=(value: Boolean): Unit = js.native
    
    /**
      * For eye adaptation, represents the decrease luminance speed
      */
    var hdrDecreaseRate: Double = js.native
    
    /**
      * Post-process used to merge the final HDR post-process and the real scene color
      */
    var hdrFinalPostProcess: Nullable[PostProcess] = js.native
    
    /**
      * For eye adaptation, represents the increase luminance speed
      */
    var hdrIncreaseRate: Double = js.native
    
    /**
      * For eye adaptation, represents the minimum luminance the eye can see
      */
    var hdrMinimumLuminance: Double = js.native
    
    /**
      * Post-process used to create a HDR effect (light adaptation)
      */
    var hdrPostProcess: Nullable[PostProcess] = js.native
    
    /**
      * Sets if the blur for highlighted surfaces must be only horizontal
      */
    var horizontalBlur: Boolean = js.native
    
    /**
      * Lens color texture used by the lens flare effect. Mandatory if lens flare effect enabled
      */
    var lensColorTexture: Nullable[Texture] = js.native
    
    /**
      * Configures the blur intensity used for for lens flare (halo)
      */
    var lensFlareBlurWidth: Double = js.native
    
    /**
      * Post-process that merges the result of the lens flare post-process and the real scene color
      */
    var lensFlareComposePostProcess: Nullable[PostProcess] = js.native
    
    /**
      * As the "lensTexture" (can be the same texture or different), it is used to apply the lens
      * flare effect by taking account of the dirt texture
      */
    var lensFlareDirtTexture: Nullable[Texture] = js.native
    
    /**
      * Based on the lens distortion effect, defines how much the lens flare result
      * is distorted
      */
    var lensFlareDistortionStrength: Double = js.native
    
    /**
      * Post-process used to store the final lens flare post-process (attach/detach for debug purpose)
      */
    var lensFlareFinalPostProcess: Nullable[PostProcess] = js.native
    
    /**
      * Dispersion coefficient for lens flare ghosts
      */
    var lensFlareGhostDispersal: Double = js.native
    
    /**
      * Main lens flare halo width
      */
    var lensFlareHaloWidth: Double = js.native
    
    /**
      * Post-process used to create a lens flare effect
      */
    var lensFlarePostProcess: Nullable[PostProcess] = js.native
    
    /**
      * The overall strengh for the lens flare effect
      */
    var lensFlareStrength: Double = js.native
    
    /**
      * Lens star texture must be used to simulate rays on the flares and is available
      * in the documentation
      */
    var lensStarTexture: Nullable[Texture] = js.native
    
    /**
      * Texture used typically to simulate "dirty" on camera lens
      */
    var lensTexture: Nullable[Texture] = js.native
    
    /**
      * Post-processes used to create down sample post-processes in order to get
      * the average luminance of the final image for HDR
      * Array of length "StandardRenderingPipeline.LuminanceSteps"
      */
    var luminanceDownSamplePostProcesses: js.Array[PostProcess] = js.native
    
    /**
      * Base post-process used to calculate the average luminance of the final image for HDR
      */
    var luminancePostProcess: Nullable[PostProcess] = js.native
    
    /**
      * Post-process used to create a motion blur effect
      */
    var motionBlurPostProcess: Nullable[PostProcess] = js.native
    
    /**
      * Specifies the number of samples used for the motion blur effect
      * Typically in interval [16, 64]
      */
    def motionBlurSamples: Double = js.native
    def motionBlurSamples_=(samples: Double): Unit = js.native
    
    /**
      * Gets how much the image is blurred by the movement while using the motion blur post-process
      */
    def motionStrength: Double = js.native
    /**
      * Sets how much the image is blurred by the movement while using the motion blur post-process
      */
    def motionStrength_=(strength: Double): Unit = js.native
    
    /**
      * Gets wether or not the motion blur post-process is object based or screen based.
      */
    def objectBasedMotionBlur: Boolean = js.native
    /**
      * Sets wether or not the motion blur post-process should be object based or screen based
      */
    def objectBasedMotionBlur_=(value: Boolean): Unit = js.native
    
    /**
      * Public members
      */
    /**
      * Post-process which contains the original scene color before the pipeline applies all the effects
      */
    var originalPostProcess: Nullable[PostProcess] = js.native
    
    /**
      * Specifies MSAA sample count, setting this to 4 will provide 4x anti aliasing. (default: 1)
      */
    def samples: Double = js.native
    def samples_=(sampleCount: Double): Unit = js.native
    
    /**
      * Post-process used to simulate realtime reflections using the screen space and geometry renderer.
      */
    var screenSpaceReflectionPostProcess: Nullable[ScreenSpaceReflectionPostProcess] = js.native
    
    /**
      * Specifies if screen space reflections are enabled.
      */
    def screenSpaceReflectionsEnabled: Boolean = js.native
    def screenSpaceReflectionsEnabled_=(enabled: Boolean): Unit = js.native
    
    /**
      * Serialize the rendering pipeline (Used when exporting)
      * @returns the serialized object
      */
    def serialize(): js.Any = js.native
    
    /**
      * Light (spot or directional) used to generate the volumetric lights rays
      * The source light must have a shadow generate so the pipeline can get its
      * depth map
      */
    var sourceLight: Nullable[SpotLight | DirectionalLight] = js.native
    
    /**
      * Post-process used to store the final texture adder post-process (attach/detach for debug purpose)
      */
    var textureAdderFinalPostProcess: Nullable[PostProcess] = js.native
    
    /**
      * Post-process used to add colors of 2 textures (typically brightness + real scene color)
      */
    var textureAdderPostProcess: Nullable[PostProcess] = js.native
    
    /**
      * Used the set the blur intensity to smooth the volumetric lights
      */
    var volumetricLightBlurScale: Double = js.native
    
    /**
      * Represents the offset coefficient based on Rayleigh principle. Typically in interval [-0.2, 0.2]
      */
    var volumetricLightCoefficient: Double = js.native
    
    /**
      * Post-process used to store the final volumetric light post-process (attach/detach for debug purpose)
      */
    var volumetricLightFinalPostProcess: Nullable[PostProcess] = js.native
    
    /**
      * Post-process used to merge the volumetric light effect and the real scene color
      */
    var volumetricLightMergePostProces: Nullable[PostProcess] = js.native
    
    /**
      * Post-process used to create volumetric lighting effect
      */
    var volumetricLightPostProcess: Nullable[PostProcess] = js.native
    
    /**
      * The overall power of volumetric lights, typically in interval [0, 10] maximum
      */
    var volumetricLightPower: Double = js.native
    
    /**
      * Post-process used to smooth the previous volumetric light post-process on the X axis
      */
    var volumetricLightSmoothXPostProcess: Nullable[BlurPostProcess] = js.native
    
    /**
      * Post-process used to smooth the previous volumetric light post-process on the Y axis
      */
    var volumetricLightSmoothYPostProcess: Nullable[BlurPostProcess] = js.native
    
    /**
      * Specifies the number of steps used to calculate the volumetric lights
      * Typically in interval [50, 200]
      */
    def volumetricLightStepsCount: Double = js.native
    def volumetricLightStepsCount_=(count: Double): Unit = js.native
  }
  /* static members */
  @js.native
  object StandardRenderingPipeline extends js.Object {
    
    /**
      * Luminance steps
      */
    var LuminanceSteps: Double = js.native
    
    /**
      * Parse the serialized pipeline
      * @param source Source pipeline.
      * @param scene The scene to load the pipeline to.
      * @param rootUrl The URL of the serialized pipeline.
      * @returns An instantiated pipeline from the serialized object.
      */
    def Parse(source: js.Any, scene: Scene, rootUrl: String): StandardRenderingPipeline = js.native
  }
}
