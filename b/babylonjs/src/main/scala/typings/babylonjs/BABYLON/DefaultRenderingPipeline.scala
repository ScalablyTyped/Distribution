package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.DefaultRenderingPipeline")
@js.native
/**
  * @constructor
  * @param name - The rendering pipeline name (default: "")
  * @param hdr - If high dynamic range textures should be used (default: true)
  * @param scene - The scene linked to this pipeline (default: the last created scene)
  * @param cameras - The array of cameras that the rendering pipeline will be attached to (default: scene.cameras)
  * @param automaticBuild - if false, you will have to manually call prepare() to update the pipeline (default: true)
  */
class DefaultRenderingPipeline ()
  extends PostProcessRenderPipeline
     with IDisposable
     with IAnimatable {
  def this(name: String) = this()
  def this(name: String, hdr: Boolean) = this()
  def this(name: String, hdr: Boolean, scene: Scene) = this()
  def this(name: String, hdr: Boolean, scene: Scene, cameras: js.Array[Camera]) = this()
  def this(name: String, hdr: Boolean, scene: Scene, cameras: js.Array[Camera], automaticBuild: Boolean) = this()
  /**
    * ID of the chromatic aberration post process,
    */
  val ChromaticAberrationPostProcessId: js.Any = js.native
  /**
    * @ignore
    * ID of the Fast Approximate Anti-Aliasing post process;
    */
  val FxaaPostProcessId: String = js.native
  /**
    * ID of the grain post process
    */
  val GrainPostProcessId: js.Any = js.native
  /**
    * @ignore
    * ID of the image processing post process;
    */
  val ImageProcessingPostProcessId: String = js.native
  /**
    * ID of the sharpen post process,
    */
  val SharpenPostProcessId: js.Any = js.native
  var _bloomEnabled: js.Any = js.native
  var _bloomKernel: js.Any = js.native
  var _bloomScale: js.Any = js.native
  /**
    * Specifies the luma threshold for the area that will be blurred by the bloom
    */
  var _bloomThreshold: js.Any = js.native
  /**
    * Specifies the weight of the bloom in the final rendering
    */
  var _bloomWeight: js.Any = js.native
  var _buildAllowed: js.Any = js.native
  var _buildPipeline: js.Any = js.native
  var _camerasToBeAttached: js.Any = js.native
  var _chromaticAberrationEffect: js.Any = js.native
  var _chromaticAberrationEnabled: js.Any = js.native
  var _defaultPipelineTextureType: js.Any = js.native
  var _depthOfFieldBlurLevel: js.Any = js.native
  var _depthOfFieldEnabled: js.Any = js.native
  var _depthOfFieldSceneObserver: js.Any = js.native
  var _disposePostProcesses: js.Any = js.native
  var _fxaaEnabled: js.Any = js.native
  /**
    * Glow post process which adds a glow to emissive areas of the image
    */
  var _glowLayer: js.Any = js.native
  var _grainEffect: js.Any = js.native
  var _grainEnabled: js.Any = js.native
  var _hardwareScaleLevel: js.Any = js.native
  var _hasCleared: js.Any = js.native
  var _hdr: js.Any = js.native
  var _imageProcessingConfigurationObserver: js.Any = js.native
  var _imageProcessingEnabled: js.Any = js.native
  var _prevPostProcess: js.Any = js.native
  var _prevPrevPostProcess: js.Any = js.native
  var _rebuildBloom: js.Any = js.native
  var _resizeObserver: js.Any = js.native
  var _samples: js.Any = js.native
  var _scene: js.Any = js.native
  var _setAutoClearAndTextureSharing: js.Any = js.native
  var _sharpenEffect: js.Any = js.native
  var _sharpenEnabled: js.Any = js.native
  /**
    * Array of animations
    */
  /* CompleteClass */
  override var animations: Nullable[js.Array[Animation]] = js.native
  /**
    * Animations which can be used to tweak settings over a period of time
    */
  @JSName("animations")
  var animations_DefaultRenderingPipeline: js.Array[Animation] = js.native
  var bloom: js.Any = js.native
  /**
    * Chromatic aberration post process which will shift rgb colors in the image
    */
  var chromaticAberration: ChromaticAberrationPostProcess = js.native
  /**
    * Depth of field effect, applies a blur based on how far away objects are from the focus distance.
    */
  var depthOfField: DepthOfFieldEffect = js.native
  /**
    * The Fast Approximate Anti-Aliasing post process which attemps to remove aliasing from an image.
    */
  var fxaa: FxaaPostProcess = js.native
  /**
    * Grain post process which add noise to the image
    */
  var grain: GrainPostProcess = js.native
  /**
    * Image post processing pass used to perform operations such as tone mapping or color grading.
    */
  var imageProcessing: ImageProcessingPostProcess = js.native
  /**
    * Sharpen post process which will apply a sharpen convolution to enhance edges
    */
  var sharpen: SharpenPostProcess = js.native
  /**
    * Adds a camera to the pipeline
    * @param camera the camera to be added
    */
  def addCamera(camera: Camera): Unit = js.native
  def bloomEnabled: Boolean = js.native
  /**
    * Enable or disable the bloom from the pipeline
    */
  def bloomEnabled(enabled: Boolean): js.Any = js.native
  /**
    * Specifies the size of the bloom blur kernel, relative to the final output size
    */
  def bloomKernel: Double = js.native
  def bloomKernel(value: Double): js.Any = js.native
  def bloomScale: Double = js.native
  /**
    * The scale of the bloom, lower value will provide better performance.
    */
  def bloomScale(value: Double): js.Any = js.native
  def bloomThreshold: Double = js.native
  /**
    * The strength of the bloom.
    */
  def bloomThreshold(value: Double): js.Any = js.native
  def bloomWeight: Double = js.native
  /**
    * The strength of the bloom.
    */
  def bloomWeight(value: Double): js.Any = js.native
  def chromaticAberrationEnabled: Boolean = js.native
  /**
    * Enable or disable the chromaticAberration process from the pipeline
    */
  def chromaticAberrationEnabled(enabled: Boolean): js.Any = js.native
  /**
    * Blur level of the depth of field effect. (Higher blur will effect performance)
    */
  def depthOfFieldBlurLevel: DepthOfFieldEffectBlurLevel = js.native
  def depthOfFieldBlurLevel(value: DepthOfFieldEffectBlurLevel): js.Any = js.native
  /**
    * If the depth of field is enabled.
    */
  def depthOfFieldEnabled: Boolean = js.native
  def depthOfFieldEnabled(enabled: Boolean): js.Any = js.native
  /**
    * Disposes of the pipeline
    */
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  def fxaaEnabled: Boolean = js.native
  /**
    * If the anti aliasing is enabled.
    */
  def fxaaEnabled(enabled: Boolean): js.Any = js.native
  /**
    * Gets the glow layer (or null if not defined)
    */
  def glowLayer: Nullable[GlowLayer] = js.native
  def glowLayerEnabled: Boolean = js.native
  /**
    * If glow layer is enabled. (Adds a glow effect to emmissive materials)
    */
  def glowLayerEnabled(enabled: Boolean): js.Any = js.native
  def grainEnabled: Boolean = js.native
  /**
    * Enable or disable the grain process from the pipeline
    */
  def grainEnabled(enabled: Boolean): js.Any = js.native
  def imageProcessingEnabled: Boolean = js.native
  /**
    * If image processing is enabled.
    */
  def imageProcessingEnabled(enabled: Boolean): js.Any = js.native
  /**
    * Force the compilation of the entire pipeline.
    */
  def prepare(): Unit = js.native
  /**
    * Removes a camera from the pipeline
    * @param camera the camera to remove
    */
  def removeCamera(camera: Camera): Unit = js.native
  def samples: Double = js.native
  /**
    * MSAA sample count, setting this to 4 will provide 4x anti aliasing. (default: 1)
    */
  def samples(sampleCount: Double): js.Any = js.native
  /**
    * Gets active scene
    */
  def scene: Scene = js.native
  /**
    * Serialize the rendering pipeline (Used when exporting)
    * @returns the serialized object
    */
  def serialize(): js.Any = js.native
  def sharpenEnabled: Boolean = js.native
  /**
    * Enable or disable the sharpen process from the pipeline
    */
  def sharpenEnabled(enabled: Boolean): js.Any = js.native
}

/* static members */
@JSGlobal("BABYLON.DefaultRenderingPipeline")
@js.native
object DefaultRenderingPipeline extends js.Object {
  /**
    * Parse the serialized pipeline
    * @param source Source pipeline.
    * @param scene The scene to load the pipeline to.
    * @param rootUrl The URL of the serialized pipeline.
    * @returns An instantiated pipeline from the serialized object.
    */
  def Parse(source: js.Any, scene: Scene, rootUrl: String): DefaultRenderingPipeline = js.native
}

