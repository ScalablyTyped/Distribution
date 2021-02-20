package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderPipelineIndexMod {
  
  @JSImport("babylonjs/PostProcesses/RenderPipeline/index", "DefaultRenderingPipeline")
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
    extends typings.babylonjs.pipelinesIndexMod.DefaultRenderingPipeline {
    def this(name: String) = this()
    def this(name: js.UndefOr[scala.Nothing], hdr: Boolean) = this()
    def this(name: String, hdr: Boolean) = this()
    def this(name: js.UndefOr[scala.Nothing], hdr: js.UndefOr[scala.Nothing], scene: Scene) = this()
    def this(name: js.UndefOr[scala.Nothing], hdr: Boolean, scene: Scene) = this()
    def this(name: String, hdr: js.UndefOr[scala.Nothing], scene: Scene) = this()
    def this(name: String, hdr: Boolean, scene: Scene) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      hdr: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[scala.Nothing],
      cameras: js.Array[Camera]
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      hdr: js.UndefOr[scala.Nothing],
      scene: Scene,
      cameras: js.Array[Camera]
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      hdr: Boolean,
      scene: js.UndefOr[scala.Nothing],
      cameras: js.Array[Camera]
    ) = this()
    def this(name: js.UndefOr[scala.Nothing], hdr: Boolean, scene: Scene, cameras: js.Array[Camera]) = this()
    def this(
      name: String,
      hdr: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[scala.Nothing],
      cameras: js.Array[Camera]
    ) = this()
    def this(name: String, hdr: js.UndefOr[scala.Nothing], scene: Scene, cameras: js.Array[Camera]) = this()
    def this(name: String, hdr: Boolean, scene: js.UndefOr[scala.Nothing], cameras: js.Array[Camera]) = this()
    def this(name: String, hdr: Boolean, scene: Scene, cameras: js.Array[Camera]) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      hdr: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[scala.Nothing],
      cameras: js.UndefOr[scala.Nothing],
      automaticBuild: Boolean
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      hdr: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[scala.Nothing],
      cameras: js.Array[Camera],
      automaticBuild: Boolean
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      hdr: js.UndefOr[scala.Nothing],
      scene: Scene,
      cameras: js.UndefOr[scala.Nothing],
      automaticBuild: Boolean
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      hdr: js.UndefOr[scala.Nothing],
      scene: Scene,
      cameras: js.Array[Camera],
      automaticBuild: Boolean
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      hdr: Boolean,
      scene: js.UndefOr[scala.Nothing],
      cameras: js.UndefOr[scala.Nothing],
      automaticBuild: Boolean
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      hdr: Boolean,
      scene: js.UndefOr[scala.Nothing],
      cameras: js.Array[Camera],
      automaticBuild: Boolean
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      hdr: Boolean,
      scene: Scene,
      cameras: js.UndefOr[scala.Nothing],
      automaticBuild: Boolean
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      hdr: Boolean,
      scene: Scene,
      cameras: js.Array[Camera],
      automaticBuild: Boolean
    ) = this()
    def this(
      name: String,
      hdr: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[scala.Nothing],
      cameras: js.UndefOr[scala.Nothing],
      automaticBuild: Boolean
    ) = this()
    def this(
      name: String,
      hdr: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[scala.Nothing],
      cameras: js.Array[Camera],
      automaticBuild: Boolean
    ) = this()
    def this(
      name: String,
      hdr: js.UndefOr[scala.Nothing],
      scene: Scene,
      cameras: js.UndefOr[scala.Nothing],
      automaticBuild: Boolean
    ) = this()
    def this(
      name: String,
      hdr: js.UndefOr[scala.Nothing],
      scene: Scene,
      cameras: js.Array[Camera],
      automaticBuild: Boolean
    ) = this()
    def this(
      name: String,
      hdr: Boolean,
      scene: js.UndefOr[scala.Nothing],
      cameras: js.UndefOr[scala.Nothing],
      automaticBuild: Boolean
    ) = this()
    def this(
      name: String,
      hdr: Boolean,
      scene: js.UndefOr[scala.Nothing],
      cameras: js.Array[Camera],
      automaticBuild: Boolean
    ) = this()
    def this(
      name: String,
      hdr: Boolean,
      scene: Scene,
      cameras: js.UndefOr[scala.Nothing],
      automaticBuild: Boolean
    ) = this()
    def this(name: String, hdr: Boolean, scene: Scene, cameras: js.Array[Camera], automaticBuild: Boolean) = this()
  }
  /* static members */
  object DefaultRenderingPipeline {
    
    /**
      * Parse the serialized pipeline
      * @param source Source pipeline.
      * @param scene The scene to load the pipeline to.
      * @param rootUrl The URL of the serialized pipeline.
      * @returns An instantiated pipeline from the serialized object.
      */
    @JSImport("babylonjs/PostProcesses/RenderPipeline/index", "DefaultRenderingPipeline.Parse")
    @js.native
    def Parse(source: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.defaultRenderingPipelineMod.DefaultRenderingPipeline = js.native
  }
  
  @JSImport("babylonjs/PostProcesses/RenderPipeline/index", "LensRenderingPipeline")
  @js.native
  class LensRenderingPipeline protected ()
    extends typings.babylonjs.pipelinesIndexMod.LensRenderingPipeline {
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
    def this(
      name: String,
      parameters: js.Any,
      scene: Scene,
      ratio: js.UndefOr[scala.Nothing],
      cameras: js.Array[Camera]
    ) = this()
    def this(name: String, parameters: js.Any, scene: Scene, ratio: Double, cameras: js.Array[Camera]) = this()
  }
  
  @JSImport("babylonjs/PostProcesses/RenderPipeline/index", "PostProcessRenderEffect")
  @js.native
  class PostProcessRenderEffect protected ()
    extends typings.babylonjs.postProcessRenderEffectMod.PostProcessRenderEffect {
    /**
      * Instantiates a post process render effect.
      * A post process can be used to apply a shader to a texture after it is rendered.
      * @param engine The engine the effect is tied to
      * @param name The name of the effect
      * @param getPostProcesses A function that returns a set of post processes which the effect will run in order to be run.
      * @param singleInstance False if this post process can be run on multiple cameras. (default: true)
      */
    def this(
      engine: Engine,
      name: String,
      getPostProcesses: js.Function0[Nullable[PostProcess | js.Array[PostProcess]]]
    ) = this()
    def this(
      engine: Engine,
      name: String,
      getPostProcesses: js.Function0[Nullable[PostProcess | js.Array[PostProcess]]],
      singleInstance: Boolean
    ) = this()
  }
  
  @JSImport("babylonjs/PostProcesses/RenderPipeline/index", "PostProcessRenderPipeline")
  @js.native
  class PostProcessRenderPipeline protected ()
    extends typings.babylonjs.postProcessRenderPipelineMod.PostProcessRenderPipeline {
    /**
      * Initializes a PostProcessRenderPipeline
      * @param engine engine to add the pipeline to
      * @param name name of the pipeline
      */
    def this(engine: Engine, name: String) = this()
  }
  
  @JSImport("babylonjs/PostProcesses/RenderPipeline/index", "PostProcessRenderPipelineManager")
  @js.native
  /**
    * Initializes a PostProcessRenderPipelineManager
    * @see https://doc.babylonjs.com/how_to/how_to_use_postprocessrenderpipeline
    */
  class PostProcessRenderPipelineManager ()
    extends typings.babylonjs.postProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager
  
  @JSImport("babylonjs/PostProcesses/RenderPipeline/index", "PostProcessRenderPipelineManagerSceneComponent")
  @js.native
  class PostProcessRenderPipelineManagerSceneComponent protected ()
    extends typings.babylonjs.postProcessRenderPipelineManagerSceneComponentMod.PostProcessRenderPipelineManagerSceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
  }
  
  @JSImport("babylonjs/PostProcesses/RenderPipeline/index", "SSAO2RenderingPipeline")
  @js.native
  class SSAO2RenderingPipeline protected ()
    extends typings.babylonjs.pipelinesIndexMod.SSAO2RenderingPipeline {
    /**
      * @constructor
      * @param name The rendering pipeline name
      * @param scene The scene linked to this pipeline
      * @param ratio The size of the postprocesses. Can be a number shared between passes or an object for more precision: { ssaoRatio: 0.5, blurRatio: 1.0 }
      * @param cameras The array of cameras that the rendering pipeline will be attached to
      * @param forceGeometryBuffer Set to true if you want to use the legacy geometry buffer renderer
      */
    def this(name: String, scene: Scene, ratio: js.Any) = this()
    def this(name: String, scene: Scene, ratio: js.Any, cameras: js.Array[Camera]) = this()
    def this(
      name: String,
      scene: Scene,
      ratio: js.Any,
      cameras: js.UndefOr[scala.Nothing],
      forceGeometryBuffer: Boolean
    ) = this()
    def this(name: String, scene: Scene, ratio: js.Any, cameras: js.Array[Camera], forceGeometryBuffer: Boolean) = this()
  }
  /* static members */
  object SSAO2RenderingPipeline {
    
    /**
      * Parse the serialized pipeline
      * @param source Source pipeline.
      * @param scene The scene to load the pipeline to.
      * @param rootUrl The URL of the serialized pipeline.
      * @returns An instantiated pipeline from the serialized object.
      */
    @JSImport("babylonjs/PostProcesses/RenderPipeline/index", "SSAO2RenderingPipeline.Parse")
    @js.native
    def Parse(source: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.ssao2RenderingPipelineMod.SSAO2RenderingPipeline = js.native
  }
  
  @JSImport("babylonjs/PostProcesses/RenderPipeline/index", "SSAORenderingPipeline")
  @js.native
  class SSAORenderingPipeline protected ()
    extends typings.babylonjs.pipelinesIndexMod.SSAORenderingPipeline {
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
  
  @JSImport("babylonjs/PostProcesses/RenderPipeline/index", "StandardRenderingPipeline")
  @js.native
  class StandardRenderingPipeline protected ()
    extends typings.babylonjs.pipelinesIndexMod.StandardRenderingPipeline {
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
  }
  /* static members */
  object StandardRenderingPipeline {
    
    @JSImport("babylonjs/PostProcesses/RenderPipeline/index", "StandardRenderingPipeline")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Luminance steps
      */
    @JSImport("babylonjs/PostProcesses/RenderPipeline/index", "StandardRenderingPipeline.LuminanceSteps")
    @js.native
    def LuminanceSteps: Double = js.native
    @scala.inline
    def LuminanceSteps_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LuminanceSteps")(x.asInstanceOf[js.Any])
    
    /**
      * Parse the serialized pipeline
      * @param source Source pipeline.
      * @param scene The scene to load the pipeline to.
      * @param rootUrl The URL of the serialized pipeline.
      * @returns An instantiated pipeline from the serialized object.
      */
    @JSImport("babylonjs/PostProcesses/RenderPipeline/index", "StandardRenderingPipeline.Parse")
    @js.native
    def Parse(source: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.standardRenderingPipelineMod.StandardRenderingPipeline = js.native
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @hidden (Backing field) */
      var _postProcessRenderPipelineManager: typings.babylonjs.postProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager = js.native
      
      /**
        * Gets the postprocess render pipeline manager
        * @see https://doc.babylonjs.com/how_to/how_to_use_postprocessrenderpipeline
        * @see https://doc.babylonjs.com/how_to/using_default_rendering_pipeline
        */
      val postProcessRenderPipelineManager: typings.babylonjs.postProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager = js.native
    }
    object Scene {
      
      @scala.inline
      def apply(
        _postProcessRenderPipelineManager: typings.babylonjs.postProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager,
        postProcessRenderPipelineManager: typings.babylonjs.postProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager
      ): typings.babylonjs.renderPipelineIndexMod.babylonjsSceneAugmentingMod.Scene = {
        val __obj = js.Dynamic.literal(_postProcessRenderPipelineManager = _postProcessRenderPipelineManager.asInstanceOf[js.Any], postProcessRenderPipelineManager = postProcessRenderPipelineManager.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.babylonjs.renderPipelineIndexMod.babylonjsSceneAugmentingMod.Scene]
      }
      
      @scala.inline
      implicit class SceneMutableBuilder[Self <: typings.babylonjs.renderPipelineIndexMod.babylonjsSceneAugmentingMod.Scene] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPostProcessRenderPipelineManager(value: typings.babylonjs.postProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager): Self = StObject.set(x, "postProcessRenderPipelineManager", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_postProcessRenderPipelineManager(value: typings.babylonjs.postProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager): Self = StObject.set(x, "_postProcessRenderPipelineManager", value.asInstanceOf[js.Any])
      }
    }
  }
}
