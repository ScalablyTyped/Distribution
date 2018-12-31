package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Standard rendering pipeline
  * Default pipeline should be used going forward but the standard pipeline will be kept for backwards compatibility.
  * @see https://doc.babylonjs.com/how_to/using_standard_rendering_pipeline
  */
@JSGlobal("BABYLON.StandardRenderingPipeline")
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
  def this(name: java.lang.String, scene: Scene, ratio: scala.Double) = this()
  def this(name: java.lang.String, scene: Scene, ratio: scala.Double, originalPostProcess: Nullable[PostProcess]) = this()
  def this(name: java.lang.String, scene: Scene, ratio: scala.Double, originalPostProcess: Nullable[PostProcess], cameras: js.Array[Camera]) = this()
  /**
    * @ignore
    * Specifies if the bloom pipeline is enabled
    */
  var BloomEnabled: scala.Boolean = js.native
  /**
    * @ignore
    * Specifies if the depth of field pipeline is enabed
    */
  var DepthOfFieldEnabled: scala.Boolean = js.native
  /**
    * @ignore
    * Specifies if the HDR pipeline is enabled
    */
  var HDREnabled: scala.Boolean = js.native
  /**
    * @ignore
    * Specifies if the lens flare pipeline is enabed
    */
  var LensFlareEnabled: scala.Boolean = js.native
  /**
    * @ignore
    * Specifies if the motion blur effect is enabled
    */
  var MotionBlurEnabled: scala.Boolean = js.native
  /**
    * @ignore
    * Specifies if the volumetric lights scattering effect is enabled
    */
  var VLSEnabled: scala.Boolean = js.native
  var _basePostProcess: js.Any = js.native
  var _bloomEnabled: js.Any = js.native
  var _buildPipeline: js.Any = js.native
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
  var _depthOfFieldEnabled: js.Any = js.native
  var _disposePostProcesses: js.Any = js.native
  var _floatTextureType: js.Any = js.native
  var _fxaaEnabled: js.Any = js.native
  var _getDepthTexture: js.Any = js.native
  var _hdrCurrentLuminance: js.Any = js.native
  var _hdrEnabled: js.Any = js.native
  var _lensFlareEnabled: js.Any = js.native
  var _motionBlurEnabled: js.Any = js.native
  var _motionBlurSamples: js.Any = js.native
  var _ratio: js.Any = js.native
  var _samples: js.Any = js.native
  /**
    * Private members
    */
  var _scene: js.Any = js.native
  var _vlsEnabled: js.Any = js.native
  var _volumetricLightStepsCount: js.Any = js.native
  /**
    * Array of animations
    */
  /* CompleteClass */
  override var animations: js.Array[Animation] = js.native
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
  var blurWidth: scala.Double = js.native
  /**
    * Post-process used to calculate the illuminated surfaces controlled by a threshold
    */
  var brightPassPostProcess: Nullable[PostProcess] = js.native
  /**
    * Represents the brightness threshold in order to configure the illuminated surfaces
    */
  var brightThreshold: scala.Double = js.native
  /**
    * Represents the blur intensity for the blurred part of the depth of field effect
    */
  var depthOfFieldBlurWidth: scala.Double = js.native
  /**
    * Represents the focal length for the depth of field effect
    */
  var depthOfFieldDistance: scala.Double = js.native
  /**
    * Post-process used to create a depth of field effect
    */
  var depthOfFieldPostProcess: Nullable[PostProcess] = js.native
  /**
    * Post-process used to down scale an image x4
    */
  var downSampleX4PostProcess: Nullable[PostProcess] = js.native
  /**
    * Sets the overall exposure used by the pipeline
    */
  var exposure: scala.Double = js.native
  /**
    * Specifies if anti-aliasing is enabled
    */
  var fxaaEnabled: scala.Boolean = js.native
  /**
    * The Fast Approximate Anti-Aliasing post process which attemps to remove aliasing from an image.
    */
  var fxaaPostProcess: Nullable[FxaaPostProcess] = js.native
  /**
    * For eye adaptation, represents the decrease luminance speed
    */
  var hdrDecreaseRate: scala.Double = js.native
  /**
    * Post-process used to merge the final HDR post-process and the real scene color
    */
  var hdrFinalPostProcess: Nullable[PostProcess] = js.native
  /**
    * For eye adaptation, represents the increase luminance speed
    */
  var hdrIncreaseRate: scala.Double = js.native
  /**
    * For eye adaptation, represents the minimum luminance the eye can see
    */
  var hdrMinimumLuminance: scala.Double = js.native
  /**
    * Post-process used to create a HDR effect (light adaptation)
    */
  var hdrPostProcess: Nullable[PostProcess] = js.native
  /**
    * Sets if the blur for highlighted surfaces must be only horizontal
    */
  var horizontalBlur: scala.Boolean = js.native
  /**
    * Lens color texture used by the lens flare effect. Mandatory if lens flare effect enabled
    */
  var lensColorTexture: Nullable[Texture] = js.native
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
  var lensFlareDistortionStrength: scala.Double = js.native
  /**
    * Post-process used to store the final lens flare post-process (attach/detach for debug purpose)
    */
  var lensFlareFinalPostProcess: Nullable[PostProcess] = js.native
  /**
    * Dispersion coefficient for lens flare ghosts
    */
  var lensFlareGhostDispersal: scala.Double = js.native
  /**
    * Main lens flare halo width
    */
  var lensFlareHaloWidth: scala.Double = js.native
  /**
    * Post-process used to create a lens flare effect
    */
  var lensFlarePostProcess: Nullable[PostProcess] = js.native
  /**
    * The overall strengh for the lens flare effect
    */
  var lensFlareStrength: scala.Double = js.native
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
  var motionBlurSamples: scala.Double = js.native
  /**
    * For motion blur, defines how much the image is blurred by the movement
    */
  var motionStrength: scala.Double = js.native
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
  var samples: scala.Double = js.native
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
  var volumetricLightBlurScale: scala.Double = js.native
  /**
    * Represents the offset coefficient based on Rayleigh principle. Typically in interval [-0.2, 0.2]
    */
  var volumetricLightCoefficient: scala.Double = js.native
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
  var volumetricLightPower: scala.Double = js.native
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
  var volumetricLightStepsCount: scala.Double = js.native
  /**
    * Disposes of the pipeline
    */
  /* InferMemberOverrides */
  override def dispose(): scala.Unit = js.native
  /**
    * Serialize the rendering pipeline (Used when exporting)
    * @returns the serialized object
    */
  def serialize(): js.Any = js.native
}

/**
  * Standard rendering pipeline
  * Default pipeline should be used going forward but the standard pipeline will be kept for backwards compatibility.
  * @see https://doc.babylonjs.com/how_to/using_standard_rendering_pipeline
  */
@JSGlobal("BABYLON.StandardRenderingPipeline")
@js.native
object StandardRenderingPipeline extends js.Object {
  /**
    * Luminance steps
    */
  var LuminanceSteps: scala.Double = js.native
  /**
    * Parse the serialized pipeline
    * @param source Source pipeline.
    * @param scene The scene to load the pipeline to.
    * @param rootUrl The URL of the serialized pipeline.
    * @returns An instantiated pipeline from the serialized object.
    */
  def Parse(source: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.StandardRenderingPipeline = js.native
}

