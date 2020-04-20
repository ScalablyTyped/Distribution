package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/PostProcesses/RenderPipeline/Pipelines/index", JSImport.Namespace)
@js.native
object pipelinesIndexMod extends js.Object {
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
    extends typings.babylonjs.defaultRenderingPipelineMod.DefaultRenderingPipeline {
    def this(name: String) = this()
    def this(name: String, hdr: Boolean) = this()
    def this(name: String, hdr: Boolean, scene: Scene) = this()
    def this(name: String, hdr: Boolean, scene: Scene, cameras: js.Array[Camera]) = this()
    def this(name: String, hdr: Boolean, scene: Scene, cameras: js.Array[Camera], automaticBuild: Boolean) = this()
  }
  
  @js.native
  class LensRenderingPipeline protected ()
    extends typings.babylonjs.lensRenderingPipelineMod.LensRenderingPipeline {
    /**
      * @constructor
      *
      * Effect parameters are as follow:
      * {
      *      chromatic_aberration: number;       // from 0 to x (1 for realism)
      *      edge_blur: number;                  // from 0 to x (1 for realism)
      *      distortion: number;                 // from 0 to x (1 for realism)
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
    def this(name: String, parameters: js.Any, scene: Scene) = this()
    def this(name: String, parameters: js.Any, scene: Scene, ratio: Double) = this()
    def this(name: String, parameters: js.Any, scene: Scene, ratio: Double, cameras: js.Array[Camera]) = this()
  }
  
  @js.native
  class SSAO2RenderingPipeline protected ()
    extends typings.babylonjs.ssao2RenderingPipelineMod.SSAO2RenderingPipeline {
    /**
      * @constructor
      * @param name The rendering pipeline name
      * @param scene The scene linked to this pipeline
      * @param ratio The size of the postprocesses. Can be a number shared between passes or an object for more precision: { ssaoRatio: 0.5, blurRatio: 1.0 }
      * @param cameras The array of cameras that the rendering pipeline will be attached to
      */
    def this(name: String, scene: Scene, ratio: js.Any) = this()
    def this(name: String, scene: Scene, ratio: js.Any, cameras: js.Array[Camera]) = this()
  }
  
  @js.native
  class SSAORenderingPipeline protected ()
    extends typings.babylonjs.ssaoRenderingPipelineMod.SSAORenderingPipeline {
    /**
      * @constructor
      * @param name - The rendering pipeline name
      * @param scene - The scene linked to this pipeline
      * @param ratio - The size of the postprocesses. Can be a number shared between passes or an object for more precision: { ssaoRatio: 0.5, combineRatio: 1.0 }
      * @param cameras - The array of cameras that the rendering pipeline will be attached to
      */
    def this(name: String, scene: Scene, ratio: js.Any) = this()
    def this(name: String, scene: Scene, ratio: js.Any, cameras: js.Array[Camera]) = this()
  }
  
  @js.native
  class StandardRenderingPipeline protected ()
    extends typings.babylonjs.standardRenderingPipelineMod.StandardRenderingPipeline {
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
      originalPostProcess: Nullable[PostProcess],
      cameras: js.Array[Camera]
    ) = this()
  }
  
  /* static members */
  @js.native
  object DefaultRenderingPipeline extends js.Object {
    /**
      * Parse the serialized pipeline
      * @param source Source pipeline.
      * @param scene The scene to load the pipeline to.
      * @param rootUrl The URL of the serialized pipeline.
      * @returns An instantiated pipeline from the serialized object.
      */
    def Parse(source: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.defaultRenderingPipelineMod.DefaultRenderingPipeline = js.native
  }
  
  /* static members */
  @js.native
  object SSAO2RenderingPipeline extends js.Object {
    /**
      *  Support test.
      */
    def IsSupported: Boolean = js.native
    /**
      * Parse the serialized pipeline
      * @param source Source pipeline.
      * @param scene The scene to load the pipeline to.
      * @param rootUrl The URL of the serialized pipeline.
      * @returns An instantiated pipeline from the serialized object.
      */
    def Parse(source: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.ssao2RenderingPipelineMod.SSAO2RenderingPipeline = js.native
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
    def Parse(source: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.standardRenderingPipelineMod.StandardRenderingPipeline = js.native
  }
  
}

