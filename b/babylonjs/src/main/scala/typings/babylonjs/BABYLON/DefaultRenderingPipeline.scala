package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultRenderingPipeline
  extends StObject
     with PostProcessRenderPipeline
     with IDisposable
     with IAnimatable {
  
  /**
    * ID of the chromatic aberration post process,
    */
  /* private */ val ChromaticAberrationPostProcessId: js.Any = js.native
  
  /**
    * @ignore
    * ID of the Fast Approximate Anti-Aliasing post process;
    */
  val FxaaPostProcessId: String = js.native
  
  /**
    * ID of the grain post process
    */
  /* private */ val GrainPostProcessId: js.Any = js.native
  
  /**
    * @ignore
    * ID of the image processing post process;
    */
  val ImageProcessingPostProcessId: String = js.native
  
  /**
    * ID of the sharpen post process,
    */
  /* private */ val SharpenPostProcessId: js.Any = js.native
  
  /* private */ var _bloomEnabled: js.Any = js.native
  
  /* private */ var _bloomKernel: js.Any = js.native
  
  /* private */ var _bloomScale: js.Any = js.native
  
  /**
    * Specifies the luma threshold for the area that will be blurred by the bloom
    */
  /* private */ var _bloomThreshold: js.Any = js.native
  
  /**
    * Specifies the weight of the bloom in the final rendering
    */
  /* private */ var _bloomWeight: js.Any = js.native
  
  /* private */ var _buildAllowed: js.Any = js.native
  
  /* private */ var _buildPipeline: js.Any = js.native
  
  /* private */ var _camerasToBeAttached: js.Any = js.native
  
  /* private */ var _chromaticAberrationEffect: js.Any = js.native
  
  /* private */ var _chromaticAberrationEnabled: js.Any = js.native
  
  /* private */ var _defaultPipelineTextureType: js.Any = js.native
  
  /* private */ var _depthOfFieldBlurLevel: js.Any = js.native
  
  /* private */ var _depthOfFieldEnabled: js.Any = js.native
  
  /* private */ var _depthOfFieldSceneObserver: js.Any = js.native
  
  /* private */ var _disposePostProcesses: js.Any = js.native
  
  /* private */ var _fxaaEnabled: js.Any = js.native
  
  /**
    * Glow post process which adds a glow to emissive areas of the image
    */
  /* private */ var _glowLayer: js.Any = js.native
  
  /* private */ var _grainEffect: js.Any = js.native
  
  /* private */ var _grainEnabled: js.Any = js.native
  
  /* private */ var _hardwareScaleLevel: js.Any = js.native
  
  /* private */ var _hasCleared: js.Any = js.native
  
  /* private */ var _hdr: js.Any = js.native
  
  /* private */ var _imageProcessingConfigurationObserver: js.Any = js.native
  
  /* private */ var _imageProcessingEnabled: js.Any = js.native
  
  /* private */ var _prevPostProcess: js.Any = js.native
  
  /* private */ var _prevPrevPostProcess: js.Any = js.native
  
  /* private */ var _rebuildBloom: js.Any = js.native
  
  /* private */ var _resizeObserver: js.Any = js.native
  
  /* private */ var _samples: js.Any = js.native
  
  /* private */ var _scene: js.Any = js.native
  
  /* private */ var _setAutoClearAndTextureSharing: js.Any = js.native
  
  /* private */ var _sharpenEffect: js.Any = js.native
  
  /* private */ var _sharpenEnabled: js.Any = js.native
  
  /**
    * Adds a camera to the pipeline
    * @param camera the camera to be added
    */
  def addCamera(camera: Camera): Unit = js.native
  
  /**
    * Animations which can be used to tweak settings over a period of time
    */
  @JSName("animations")
  var animations_DefaultRenderingPipeline: js.Array[Animation] = js.native
  
  /* private */ var bloom: js.Any = js.native
  
  def bloomEnabled: Boolean = js.native
  /**
    * Enable or disable the bloom from the pipeline
    */
  def bloomEnabled_=(enabled: Boolean): Unit = js.native
  
  /**
    * Specifies the size of the bloom blur kernel, relative to the final output size
    */
  def bloomKernel: Double = js.native
  def bloomKernel_=(value: Double): Unit = js.native
  
  def bloomScale: Double = js.native
  /**
    * The scale of the bloom, lower value will provide better performance.
    */
  def bloomScale_=(value: Double): Unit = js.native
  
  def bloomThreshold: Double = js.native
  /**
    * The strength of the bloom.
    */
  def bloomThreshold_=(value: Double): Unit = js.native
  
  def bloomWeight: Double = js.native
  /**
    * The strength of the bloom.
    */
  def bloomWeight_=(value: Double): Unit = js.native
  
  /**
    * Chromatic aberration post process which will shift rgb colors in the image
    */
  var chromaticAberration: ChromaticAberrationPostProcess = js.native
  
  def chromaticAberrationEnabled: Boolean = js.native
  /**
    * Enable or disable the chromaticAberration process from the pipeline
    */
  def chromaticAberrationEnabled_=(enabled: Boolean): Unit = js.native
  
  /**
    * Depth of field effect, applies a blur based on how far away objects are from the focus distance.
    */
  var depthOfField: DepthOfFieldEffect = js.native
  
  /**
    * Blur level of the depth of field effect. (Higher blur will effect performance)
    */
  def depthOfFieldBlurLevel: DepthOfFieldEffectBlurLevel = js.native
  def depthOfFieldBlurLevel_=(value: DepthOfFieldEffectBlurLevel): Unit = js.native
  
  /**
    * If the depth of field is enabled.
    */
  def depthOfFieldEnabled: Boolean = js.native
  def depthOfFieldEnabled_=(enabled: Boolean): Unit = js.native
  
  /**
    * Disposes of the pipeline
    */
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  
  /**
    * The Fast Approximate Anti-Aliasing post process which attemps to remove aliasing from an image.
    */
  var fxaa: FxaaPostProcess = js.native
  
  def fxaaEnabled: Boolean = js.native
  /**
    * If the anti aliasing is enabled.
    */
  def fxaaEnabled_=(enabled: Boolean): Unit = js.native
  
  /**
    * Gets the glow layer (or null if not defined)
    */
  def glowLayer: Nullable[GlowLayer] = js.native
  
  def glowLayerEnabled: Boolean = js.native
  /**
    * If glow layer is enabled. (Adds a glow effect to emmissive materials)
    */
  def glowLayerEnabled_=(enabled: Boolean): Unit = js.native
  
  /**
    * Grain post process which add noise to the image
    */
  var grain: GrainPostProcess = js.native
  
  def grainEnabled: Boolean = js.native
  /**
    * Enable or disable the grain process from the pipeline
    */
  def grainEnabled_=(enabled: Boolean): Unit = js.native
  
  /**
    * Image post processing pass used to perform operations such as tone mapping or color grading.
    */
  var imageProcessing: ImageProcessingPostProcess = js.native
  
  def imageProcessingEnabled: Boolean = js.native
  /**
    * If image processing is enabled.
    */
  def imageProcessingEnabled_=(enabled: Boolean): Unit = js.native
  
  /**
    * This is triggered each time the pipeline has been built.
    */
  var onBuildObservable: Observable[DefaultRenderingPipeline] = js.native
  
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
  def samples_=(sampleCount: Double): Unit = js.native
  
  /**
    * Gets active scene
    */
  def scene: Scene = js.native
  
  /**
    * Serialize the rendering pipeline (Used when exporting)
    * @returns the serialized object
    */
  def serialize(): js.Any = js.native
  
  /**
    * Sharpen post process which will apply a sharpen convolution to enhance edges
    */
  var sharpen: SharpenPostProcess = js.native
  
  def sharpenEnabled: Boolean = js.native
  /**
    * Enable or disable the sharpen process from the pipeline
    */
  def sharpenEnabled_=(enabled: Boolean): Unit = js.native
}
