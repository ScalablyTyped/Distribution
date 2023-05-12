package typings.babylonjs

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.postProcessesRenderPipelinePostProcessRenderPipelineMod.PostProcessRenderPipeline
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessesRenderPipelinePipelinesSsao2RenderingPipelineMod {
  
  @JSImport("babylonjs/PostProcesses/RenderPipeline/Pipelines/ssao2RenderingPipeline", "SSAO2RenderingPipeline")
  @js.native
  open class SSAO2RenderingPipeline protected () extends PostProcessRenderPipeline {
    /**
      * @constructor
      * @param name The rendering pipeline name
      * @param scene The scene linked to this pipeline
      * @param ratio The size of the postprocesses. Can be a number shared between passes or an object for more precision: { ssaoRatio: 0.5, blurRatio: 1.0 }
      * @param cameras The array of cameras that the rendering pipeline will be attached to
      * @param forceGeometryBuffer Set to true if you want to use the legacy geometry buffer renderer
      * @param textureType The texture type used by the different post processes created by SSAO (default: Constants.TEXTURETYPE_UNSIGNED_INT)
      */
    def this(name: String, scene: Scene, ratio: Any) = this()
    def this(name: String, scene: Scene, ratio: Any, cameras: js.Array[Camera]) = this()
    def this(name: String, scene: Scene, ratio: Any, cameras: js.Array[Camera], forceGeometryBuffer: Boolean) = this()
    def this(name: String, scene: Scene, ratio: Any, cameras: Unit, forceGeometryBuffer: Boolean) = this()
    def this(
      name: String,
      scene: Scene,
      ratio: Any,
      cameras: js.Array[Camera],
      forceGeometryBuffer: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      scene: Scene,
      ratio: Any,
      cameras: js.Array[Camera],
      forceGeometryBuffer: Unit,
      textureType: Double
    ) = this()
    def this(
      name: String,
      scene: Scene,
      ratio: Any,
      cameras: Unit,
      forceGeometryBuffer: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      scene: Scene,
      ratio: Any,
      cameras: Unit,
      forceGeometryBuffer: Unit,
      textureType: Double
    ) = this()
    
    /**
      * @ignore
      * The horizontal blur PostProcess id in the pipeline
      */
    var SSAOBlurHRenderEffect: String = js.native
    
    /**
      * @ignore
      * The vertical blur PostProcess id in the pipeline
      */
    var SSAOBlurVRenderEffect: String = js.native
    
    /**
      * @ignore
      * The PostProcess id in the pipeline that combines the SSAO-Blur output with the original scene color (SSAOOriginalSceneColorEffect)
      */
    var SSAOCombineRenderEffect: String = js.native
    
    /**
      * @ignore
      * The PassPostProcess id in the pipeline that contains the original scene color
      */
    var SSAOOriginalSceneColorEffect: String = js.native
    
    /**
      * @ignore
      * The SSAO PostProcess id in the pipeline
      */
    var SSAORenderEffect: String = js.native
    
    /* private */ var _bits: Any = js.native
    
    /* private */ var _blurHPostProcess: Any = js.native
    
    /* private */ var _blurVPostProcess: Any = js.native
    
    /* private */ var _bypassBlur: Any = js.native
    
    /* private */ var _createBlurFilter: Any = js.native
    
    /* private */ var _createBlurPostProcess: Any = js.native
    
    /* private */ var _createRandomTexture: Any = js.native
    
    /* private */ var _createSSAOCombinePostProcess: Any = js.native
    
    /* private */ var _createSSAOPostProcess: Any = js.native
    
    /* private */ var _epsilon: Any = js.native
    
    /* private */ var _expensiveBlur: Any = js.native
    
    /**
      * Force rendering the geometry through geometry buffer.
      */
    /* private */ var _forceGeometryBuffer: Any = js.native
    
    /* private */ var _generateHemisphere: Any = js.native
    
    /* private */ def _geometryBufferRenderer: Any = js.native
    
    /* private */ var _getDefinesForBlur: Any = js.native
    
    /* private */ var _getDefinesForSSAO: Any = js.native
    
    /* private */ var _getSamplersForBlur: Any = js.native
    
    /* private */ var _hammersley: Any = js.native
    
    /* private */ var _hemisphereSample_uniform: Any = js.native
    
    /* private */ var _originalColorPostProcess: Any = js.native
    
    /* private */ def _prePassRenderer: Any = js.native
    
    /* private */ var _radicalInverse_VdC: Any = js.native
    
    /* private */ var _randomTexture: Any = js.native
    
    /**
      * Ratio object used for SSAO ratio and blur ratio
      */
    /* private */ var _ratio: Any = js.native
    
    /**
      * Dynamically generated sphere sampler.
      */
    /* private */ var _sampleSphere: Any = js.native
    
    /* private */ var _samples: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _ssaoCombinePostProcess: Any = js.native
    
    /* private */ var _ssaoPostProcess: Any = js.native
    
    /* private */ var _textureSamples: Any = js.native
    
    /* private */ var _textureType: Any = js.native
    
    /**
      * The base color of the SSAO post-process
      * The final result is "base + ssao" between [0, 1]
      */
    var base: Double = js.native
    
    /**
      * The number of samples the bilateral filter uses in both dimensions when denoising the SSAO calculations. Default value is 16.
      *
      * A higher value should result in smoother shadows but will use more processing time in the shaders.
      *
      * A high value can cause the shadows to get to blurry or create visible artifacts (bands) near sharp details in the geometry. The artifacts can sometimes be mitigated by increasing the bilateralSoften setting.
      */
    var bilateralSamples: Double = js.native
    
    /**
      * Controls the shape of the denoising kernel used by the bilateral filter. Default value is 0.
      *
      * By default the bilateral filter acts like a box-filter, treating all samples on the same depth with equal weights. This is effective to maximize the denoising effect given a limited set of samples. However, it also often results in visible ghosting around sharp shadow regions and can spread out lines over large areas so they are no longer visible.
      *
      * Increasing this setting will make the filter pay less attention to samples further away from the center sample, reducing many artifacts but at the same time increasing noise.
      *
      * Useful value range is [0..1].
      */
    var bilateralSoften: Double = js.native
    
    /**
      * How forgiving the bilateral denoiser should be when rejecting samples. Default value is 0.
      *
      * A higher value results in the bilateral filter being more forgiving and thus doing a better job at denoising slanted and curved surfaces, but can lead to shadows spreading out around corners or between objects that are close to each other depth wise.
      *
      * Useful value range is normally [0..1], but higher values are allowed.
      */
    var bilateralTolerance: Double = js.native
    
    def bypassBlur: Boolean = js.native
    /**
      * Skips the denoising (blur) stage of the SSAO calculations.
      *
      * Useful to temporarily set while experimenting with the other SSAO2 settings.
      */
    def bypassBlur_=(b: Boolean): Unit = js.native
    
    def dispose(disableGeometryBufferRenderer: Boolean): Unit = js.native
    
    def epsilon: Double = js.native
    /**
      * Used in SSAO calculations to compensate for accuracy issues with depth values. Default 0.02.
      *
      * Normally you do not need to change this value, but you can experiment with it if you get a lot of in false self-occlusion on flat surfaces when using fewer than 16 samples. Useful range is normally [0..0.1] but higher values is allowed.
      */
    def epsilon_=(n: Double): Unit = js.native
    
    def expensiveBlur: Boolean = js.native
    /**
      * Enables the configurable bilateral denoising (blurring) filter. Default is true.
      * Set to false to instead use a legacy bilateral filter that can't be configured.
      *
      * The denoising filter runs after the SSAO calculations and is a very important step. Both options results in a so called bilateral being used, but the "expensive" one can be
      * configured in several ways to fit your scene.
      */
    def expensiveBlur_=(b: Boolean): Unit = js.native
    
    /**
      * Maximum depth value to still render AO. A smooth falloff makes the dimming more natural, so there will be no abrupt shading change.
      */
    var maxZ: Double = js.native
    
    /**
      * In order to save performances, SSAO radius is clamped on close geometry. This ratio changes by how much.
      */
    var minZAspect: Double = js.native
    
    /**
      * The radius around the analyzed pixel used by the SSAO post-process. Default value is 2.0
      */
    var radius: Double = js.native
    
    def samples: Double = js.native
    /**
      * Number of samples used for the SSAO calculations. Default value is 8.
      */
    def samples_=(n: Double): Unit = js.native
    
    /**
      * Gets active scene
      */
    def scene: Scene = js.native
    
    /**
      * Serialize the rendering pipeline (Used when exporting)
      * @returns the serialized object
      */
    def serialize(): Any = js.native
    
    def textureSamples: Double = js.native
    /**
      * Number of samples to use for antialiasing.
      */
    def textureSamples_=(n: Double): Unit = js.native
    
    /**
      * The output strength of the SSAO post-process. Default value is 1.0.
      */
    var totalStrength: Double = js.native
  }
  /* static members */
  object SSAO2RenderingPipeline {
    
    @JSImport("babylonjs/PostProcesses/RenderPipeline/Pipelines/ssao2RenderingPipeline", "SSAO2RenderingPipeline")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/PostProcesses/RenderPipeline/Pipelines/ssao2RenderingPipeline", "SSAO2RenderingPipeline.ORTHO_DEPTH_PROJECTION")
    @js.native
    val ORTHO_DEPTH_PROJECTION: Any = js.native
    
    @JSImport("babylonjs/PostProcesses/RenderPipeline/Pipelines/ssao2RenderingPipeline", "SSAO2RenderingPipeline.PERSPECTIVE_DEPTH_PROJECTION")
    @js.native
    val PERSPECTIVE_DEPTH_PROJECTION: Any = js.native
    
    /**
      * Parse the serialized pipeline
      * @param source Source pipeline.
      * @param scene The scene to load the pipeline to.
      * @param rootUrl The URL of the serialized pipeline.
      * @returns An instantiated pipeline from the serialized object.
      */
    inline def Parse(source: Any, scene: Scene, rootUrl: String): SSAO2RenderingPipeline = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[SSAO2RenderingPipeline]
  }
}
