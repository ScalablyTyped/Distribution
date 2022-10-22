package typings.babylonjs

import typings.babylonjs.animationsAnimatableDotinterfaceMod.IAnimatable
import typings.babylonjs.animationsAnimationMod.Animation
import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.layersGlowLayerMod.GlowLayer
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.postProcessesChromaticAberrationPostProcessMod.ChromaticAberrationPostProcess
import typings.babylonjs.postProcessesDepthOfFieldEffectMod.DepthOfFieldEffect
import typings.babylonjs.postProcessesDepthOfFieldEffectMod.DepthOfFieldEffectBlurLevel
import typings.babylonjs.postProcessesFxaaPostProcessMod.FxaaPostProcess
import typings.babylonjs.postProcessesGrainPostProcessMod.GrainPostProcess
import typings.babylonjs.postProcessesImageProcessingPostProcessMod.ImageProcessingPostProcess
import typings.babylonjs.postProcessesRenderPipelinePostProcessRenderPipelineMod.PostProcessRenderPipeline
import typings.babylonjs.postProcessesSharpenPostProcessMod.SharpenPostProcess
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessesRenderPipelinePipelinesDefaultRenderingPipelineMod {
  
  @JSImport("babylonjs/PostProcesses/RenderPipeline/Pipelines/defaultRenderingPipeline", "DefaultRenderingPipeline")
  @js.native
  /**
    * Instantiates a DefaultRenderingPipeline.
    * @param name The rendering pipeline name (default: "")
    * @param hdr If high dynamic range textures should be used (default: true)
    * @param scene The scene linked to this pipeline (default: the last created scene)
    * @param cameras The array of cameras that the rendering pipeline will be attached to (default: scene.cameras)
    * @param automaticBuild If false, you will have to manually call prepare() to update the pipeline (default: true)
    */
  open class DefaultRenderingPipeline ()
    extends PostProcessRenderPipeline
       with IDisposable
       with IAnimatable {
    def this(name: String) = this()
    def this(name: String, hdr: Boolean) = this()
    def this(name: Unit, hdr: Boolean) = this()
    def this(name: String, hdr: Boolean, scene: Scene) = this()
    def this(name: String, hdr: Unit, scene: Scene) = this()
    def this(name: Unit, hdr: Boolean, scene: Scene) = this()
    def this(name: Unit, hdr: Unit, scene: Scene) = this()
    def this(name: String, hdr: Boolean, scene: Unit, cameras: js.Array[Camera]) = this()
    def this(name: String, hdr: Boolean, scene: Scene, cameras: js.Array[Camera]) = this()
    def this(name: String, hdr: Unit, scene: Unit, cameras: js.Array[Camera]) = this()
    def this(name: String, hdr: Unit, scene: Scene, cameras: js.Array[Camera]) = this()
    def this(name: Unit, hdr: Boolean, scene: Unit, cameras: js.Array[Camera]) = this()
    def this(name: Unit, hdr: Boolean, scene: Scene, cameras: js.Array[Camera]) = this()
    def this(name: Unit, hdr: Unit, scene: Unit, cameras: js.Array[Camera]) = this()
    def this(name: Unit, hdr: Unit, scene: Scene, cameras: js.Array[Camera]) = this()
    def this(name: String, hdr: Boolean, scene: Unit, cameras: js.Array[Camera], automaticBuild: Boolean) = this()
    def this(name: String, hdr: Boolean, scene: Unit, cameras: Unit, automaticBuild: Boolean) = this()
    def this(name: String, hdr: Boolean, scene: Scene, cameras: js.Array[Camera], automaticBuild: Boolean) = this()
    def this(name: String, hdr: Boolean, scene: Scene, cameras: Unit, automaticBuild: Boolean) = this()
    def this(name: String, hdr: Unit, scene: Unit, cameras: js.Array[Camera], automaticBuild: Boolean) = this()
    def this(name: String, hdr: Unit, scene: Unit, cameras: Unit, automaticBuild: Boolean) = this()
    def this(name: String, hdr: Unit, scene: Scene, cameras: js.Array[Camera], automaticBuild: Boolean) = this()
    def this(name: String, hdr: Unit, scene: Scene, cameras: Unit, automaticBuild: Boolean) = this()
    def this(name: Unit, hdr: Boolean, scene: Unit, cameras: js.Array[Camera], automaticBuild: Boolean) = this()
    def this(name: Unit, hdr: Boolean, scene: Unit, cameras: Unit, automaticBuild: Boolean) = this()
    def this(name: Unit, hdr: Boolean, scene: Scene, cameras: js.Array[Camera], automaticBuild: Boolean) = this()
    def this(name: Unit, hdr: Boolean, scene: Scene, cameras: Unit, automaticBuild: Boolean) = this()
    def this(name: Unit, hdr: Unit, scene: Unit, cameras: js.Array[Camera], automaticBuild: Boolean) = this()
    def this(name: Unit, hdr: Unit, scene: Unit, cameras: Unit, automaticBuild: Boolean) = this()
    def this(name: Unit, hdr: Unit, scene: Scene, cameras: js.Array[Camera], automaticBuild: Boolean) = this()
    def this(name: Unit, hdr: Unit, scene: Scene, cameras: Unit, automaticBuild: Boolean) = this()
    
    /**
      * ID of the chromatic aberration post process,
      */
    /* private */ val ChromaticAberrationPostProcessId: Any = js.native
    
    /**
      * @ignore
      * ID of the Fast Approximate Anti-Aliasing post process;
      */
    val FxaaPostProcessId: String = js.native
    
    /**
      * ID of the grain post process
      */
    /* private */ val GrainPostProcessId: Any = js.native
    
    /**
      * @ignore
      * ID of the image processing post process;
      */
    val ImageProcessingPostProcessId: String = js.native
    
    /**
      * ID of the sharpen post process,
      */
    /* private */ val SharpenPostProcessId: Any = js.native
    
    /* private */ var _activeCameraChangedObserver: Any = js.native
    
    /* private */ var _activeCamerasChangedObserver: Any = js.native
    
    /* private */ var _bloomEnabled: Any = js.native
    
    /* private */ var _bloomKernel: Any = js.native
    
    /* private */ var _bloomScale: Any = js.native
    
    /**
      * Specifies the luma threshold for the area that will be blurred by the bloom
      */
    /* private */ var _bloomThreshold: Any = js.native
    
    /**
      * Specifies the weight of the bloom in the final rendering
      */
    /* private */ var _bloomWeight: Any = js.native
    
    /* private */ var _buildAllowed: Any = js.native
    
    /* private */ var _buildPipeline: Any = js.native
    
    /* private */ var _camerasToBeAttached: Any = js.native
    
    /* private */ var _chromaticAberrationEffect: Any = js.native
    
    /* private */ var _chromaticAberrationEnabled: Any = js.native
    
    /* private */ var _defaultPipelineTextureType: Any = js.native
    
    /* private */ var _depthOfFieldBlurLevel: Any = js.native
    
    /* private */ var _depthOfFieldEnabled: Any = js.native
    
    /* private */ var _depthOfFieldSceneObserver: Any = js.native
    
    /* private */ var _disposePostProcesses: Any = js.native
    
    /* private */ var _fxaaEnabled: Any = js.native
    
    /**
      * Glow post process which adds a glow to emissive areas of the image
      */
    /* private */ var _glowLayer: Any = js.native
    
    /* private */ var _grainEffect: Any = js.native
    
    /* private */ var _grainEnabled: Any = js.native
    
    /* private */ var _hardwareScaleLevel: Any = js.native
    
    /* private */ var _hasCleared: Any = js.native
    
    /* private */ var _hdr: Any = js.native
    
    /* private */ var _imageProcessingConfigurationObserver: Any = js.native
    
    /* private */ var _imageProcessingEnabled: Any = js.native
    
    /* private */ var _prevPostProcess: Any = js.native
    
    /* private */ var _prevPrevPostProcess: Any = js.native
    
    /* private */ var _rebuildBloom: Any = js.native
    
    /* private */ var _resizeObserver: Any = js.native
    
    /* private */ var _samples: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _setAutoClearAndTextureSharing: Any = js.native
    
    /* private */ var _sharpenEffect: Any = js.native
    
    /* private */ var _sharpenEnabled: Any = js.native
    
    /**
      * Adds a camera to the pipeline
      * @param camera the camera to be added
      */
    def addCamera(camera: Camera): Unit = js.native
    
    /**
      * Array of animations
      */
    /* CompleteClass */
    var animations: Nullable[js.Array[Animation]] = js.native
    /**
      * Animations which can be used to tweak settings over a period of time
      */
    @JSName("animations")
    var animations_DefaultRenderingPipeline: js.Array[Animation] = js.native
    
    /**
      * Enable or disable automatic building of the pipeline when effects are enabled and disabled.
      * If false, you will have to manually call prepare() to update the pipeline.
      */
    def automaticBuild: Boolean = js.native
    def automaticBuild_=(value: Boolean): Unit = js.native
    
    /* private */ var bloom: Any = js.native
    
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
      * The luminance threshold to find bright areas of the image to bloom.
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
      * The Fast Approximate Anti-Aliasing post process which attempts to remove aliasing from an image.
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
    def serialize(): Any = js.native
    
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
  /* static members */
  object DefaultRenderingPipeline {
    
    @JSImport("babylonjs/PostProcesses/RenderPipeline/Pipelines/defaultRenderingPipeline", "DefaultRenderingPipeline")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parse the serialized pipeline
      * @param source Source pipeline.
      * @param scene The scene to load the pipeline to.
      * @param rootUrl The URL of the serialized pipeline.
      * @returns An instantiated pipeline from the serialized object.
      */
    inline def Parse(source: Any, scene: Scene, rootUrl: String): DefaultRenderingPipeline = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[DefaultRenderingPipeline]
  }
}
