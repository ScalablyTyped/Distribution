package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.postProcessRenderPipelineMod.PostProcessRenderPipeline
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ssao2RenderingPipelineMod {
  
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
    
    /* private */ var _createBlurPostProcess: Any = js.native
    
    /* private */ var _createRandomTexture: Any = js.native
    
    /* private */ var _createSSAOCombinePostProcess: Any = js.native
    
    /* private */ var _createSSAOPostProcess: Any = js.native
    
    /* private */ var _expensiveBlur: Any = js.native
    
    /**
      * Force rendering the geometry through geometry buffer
      */
    /* private */ var _forceGeometryBuffer: Any = js.native
    
    /* private */ var _generateHemisphere: Any = js.native
    
    /* private */ def _geometryBufferRenderer: Any = js.native
    
    /* private */ var _getDefinesForSSAO: Any = js.native
    
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
    
    /**
      * Blur filter offsets
      */
    /* private */ var _samplerOffsets: Any = js.native
    
    /* private */ var _samples: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _ssaoCombinePostProcess: Any = js.native
    
    /* private */ var _ssaoPostProcess: Any = js.native
    
    /* private */ var _textureSamples: Any = js.native
    
    /**
      * The base color of the SSAO post-process
      * The final result is "base + ssao" between [0, 1]
      */
    var base: Double = js.native
    
    def dispose(disableGeometryBufferRenderer: Boolean): Unit = js.native
    
    def expensiveBlur: Boolean = js.native
    /**
      * If bilateral blur should be used
      */
    def expensiveBlur_=(b: Boolean): Unit = js.native
    
    /**
      * Maximum depth value to still render AO. A smooth falloff makes the dimming more natural, so there will be no abrupt shading change.
      */
    var maxZ: Double = js.native
    
    /**
      * In order to save performances, SSAO radius is clamped on close geometry. This ratio changes by how much
      */
    var minZAspect: Double = js.native
    
    /**
      * The radius around the analyzed pixel used by the SSAO post-process. Default value is 2.0
      */
    var radius: Double = js.native
    
    def samples: Double = js.native
    /**
      * Number of samples used for the SSAO calculations. Default value is 8
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
      * Number of samples to use for antialiasing
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
