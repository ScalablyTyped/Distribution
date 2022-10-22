package typings.babylonjs

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.postProcessesPostProcessMod.PostProcess
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessesRenderPipelinePipelinesIndexMod {
  
  @JSImport("babylonjs/PostProcesses/RenderPipeline/Pipelines/index", "DefaultRenderingPipeline")
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
    extends typings.babylonjs.postProcessesRenderPipelinePipelinesDefaultRenderingPipelineMod.DefaultRenderingPipeline {
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
  }
  /* static members */
  object DefaultRenderingPipeline {
    
    @JSImport("babylonjs/PostProcesses/RenderPipeline/Pipelines/index", "DefaultRenderingPipeline")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parse the serialized pipeline
      * @param source Source pipeline.
      * @param scene The scene to load the pipeline to.
      * @param rootUrl The URL of the serialized pipeline.
      * @returns An instantiated pipeline from the serialized object.
      */
    inline def Parse(source: Any, scene: Scene, rootUrl: String): typings.babylonjs.postProcessesRenderPipelinePipelinesDefaultRenderingPipelineMod.DefaultRenderingPipeline = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.postProcessesRenderPipelinePipelinesDefaultRenderingPipelineMod.DefaultRenderingPipeline]
  }
  
  @JSImport("babylonjs/PostProcesses/RenderPipeline/Pipelines/index", "LensRenderingPipeline")
  @js.native
  open class LensRenderingPipeline protected ()
    extends typings.babylonjs.postProcessesRenderPipelinePipelinesLensRenderingPipelineMod.LensRenderingPipeline {
    /**
      * @constructor
      *
      * Effect parameters are as follow:
      * {
      *      chromatic_aberration: number;       // from 0 to x (1 for realism)
      *      edge_blur: number;                  // from 0 to x (1 for realism)
      *      distortion: number;                 // from 0 to x (1 for realism), note that this will effect the pointer position precision
      *      grain_amount: number;               // from 0 to 1
      *      grain_texture: BABYLON.Texture;     // texture to use for grain effect; if unset, use random B&W noise
      *      dof_focus_distance: number;         // depth-of-field: focus distance; unset to disable (disabled by default)
      *      dof_aperture: number;               // depth-of-field: focus blur bias (default: 1)
      *      dof_darken: number;                 // depth-of-field: darken that which is out of focus (from 0 to 1, disabled by default)
      *      dof_pentagon: boolean;              // depth-of-field: makes a pentagon-like "bokeh" effect
      *      dof_gain: number;                   // depth-of-field: highlights gain; unset to disable (disabled by default)
      *      dof_threshold: number;              // depth-of-field: highlights threshold (default: 1)
      *      blur_noise: boolean;                // add a little bit of noise to the blur (default: true)
      * }
      * Note: if an effect parameter is unset, effect is disabled
      *
      * @param name The rendering pipeline name
      * @param parameters - An object containing all parameters (see above)
      * @param scene The scene linked to this pipeline
      * @param ratio The size of the postprocesses (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
      * @param cameras The array of cameras that the rendering pipeline will be attached to
      */
    def this(name: String, parameters: Any, scene: Scene) = this()
    def this(name: String, parameters: Any, scene: Scene, ratio: Double) = this()
    def this(name: String, parameters: Any, scene: Scene, ratio: Double, cameras: js.Array[Camera]) = this()
    def this(name: String, parameters: Any, scene: Scene, ratio: Unit, cameras: js.Array[Camera]) = this()
  }
  
  @JSImport("babylonjs/PostProcesses/RenderPipeline/Pipelines/index", "SSAO2RenderingPipeline")
  @js.native
  open class SSAO2RenderingPipeline protected ()
    extends typings.babylonjs.postProcessesRenderPipelinePipelinesSsao2RenderingPipelineMod.SSAO2RenderingPipeline {
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
  }
  /* static members */
  object SSAO2RenderingPipeline {
    
    @JSImport("babylonjs/PostProcesses/RenderPipeline/Pipelines/index", "SSAO2RenderingPipeline")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/PostProcesses/RenderPipeline/Pipelines/index", "SSAO2RenderingPipeline.ORTHO_DEPTH_PROJECTION")
    @js.native
    val ORTHO_DEPTH_PROJECTION: Any = js.native
    
    @JSImport("babylonjs/PostProcesses/RenderPipeline/Pipelines/index", "SSAO2RenderingPipeline.PERSPECTIVE_DEPTH_PROJECTION")
    @js.native
    val PERSPECTIVE_DEPTH_PROJECTION: Any = js.native
    
    /**
      * Parse the serialized pipeline
      * @param source Source pipeline.
      * @param scene The scene to load the pipeline to.
      * @param rootUrl The URL of the serialized pipeline.
      * @returns An instantiated pipeline from the serialized object.
      */
    inline def Parse(source: Any, scene: Scene, rootUrl: String): typings.babylonjs.postProcessesRenderPipelinePipelinesSsao2RenderingPipelineMod.SSAO2RenderingPipeline = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.postProcessesRenderPipelinePipelinesSsao2RenderingPipelineMod.SSAO2RenderingPipeline]
  }
  
  @JSImport("babylonjs/PostProcesses/RenderPipeline/Pipelines/index", "SSAORenderingPipeline")
  @js.native
  open class SSAORenderingPipeline protected ()
    extends typings.babylonjs.postProcessesRenderPipelinePipelinesSsaoRenderingPipelineMod.SSAORenderingPipeline {
    /**
      * @constructor
      * @param name - The rendering pipeline name
      * @param scene - The scene linked to this pipeline
      * @param ratio - The size of the postprocesses. Can be a number shared between passes or an object for more precision: { ssaoRatio: 0.5, combineRatio: 1.0 }
      * @param cameras - The array of cameras that the rendering pipeline will be attached to
      */
    def this(name: String, scene: Scene, ratio: Any) = this()
    def this(name: String, scene: Scene, ratio: Any, cameras: js.Array[Camera]) = this()
  }
  
  @JSImport("babylonjs/PostProcesses/RenderPipeline/Pipelines/index", "StandardRenderingPipeline")
  @js.native
  open class StandardRenderingPipeline protected ()
    extends typings.babylonjs.postProcessesRenderPipelinePipelinesStandardRenderingPipelineMod.StandardRenderingPipeline {
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
    def this(name: String, scene: Scene, ratio: Double, originalPostProcess: Unit, cameras: js.Array[Camera]) = this()
    def this(
      name: String,
      scene: Scene,
      ratio: Double,
      originalPostProcess: Nullable[PostProcess],
      cameras: js.Array[Camera]
    ) = this()
  }
  /* static members */
  object StandardRenderingPipeline {
    
    @JSImport("babylonjs/PostProcesses/RenderPipeline/Pipelines/index", "StandardRenderingPipeline")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Luminance steps
      */
    @JSImport("babylonjs/PostProcesses/RenderPipeline/Pipelines/index", "StandardRenderingPipeline.LuminanceSteps")
    @js.native
    def LuminanceSteps: Double = js.native
    inline def LuminanceSteps_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LuminanceSteps")(x.asInstanceOf[js.Any])
    
    /**
      * Parse the serialized pipeline
      * @param source Source pipeline.
      * @param scene The scene to load the pipeline to.
      * @param rootUrl The URL of the serialized pipeline.
      * @returns An instantiated pipeline from the serialized object.
      */
    inline def Parse(source: Any, scene: Scene, rootUrl: String): typings.babylonjs.postProcessesRenderPipelinePipelinesStandardRenderingPipelineMod.StandardRenderingPipeline = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.postProcessesRenderPipelinePipelinesStandardRenderingPipelineMod.StandardRenderingPipeline]
  }
}
