package typings.babylonjs

import typings.babylonjs.postProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessRenderPipelineManagerSceneComponentMod {
  
  @JSImport("babylonjs/PostProcesses/RenderPipeline/postProcessRenderPipelineManagerSceneComponent", "PostProcessRenderPipelineManagerSceneComponent")
  @js.native
  class PostProcessRenderPipelineManagerSceneComponent protected () extends ISceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    var _gatherRenderTargets: js.Any = js.native
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @hidden (Backing field) */
      var _postProcessRenderPipelineManager: PostProcessRenderPipelineManager = js.native
      
      /**
        * Gets the postprocess render pipeline manager
        * @see https://doc.babylonjs.com/how_to/how_to_use_postprocessrenderpipeline
        * @see https://doc.babylonjs.com/how_to/using_default_rendering_pipeline
        */
      val postProcessRenderPipelineManager: PostProcessRenderPipelineManager = js.native
    }
    object Scene {
      
      @scala.inline
      def apply(
        _postProcessRenderPipelineManager: PostProcessRenderPipelineManager,
        postProcessRenderPipelineManager: PostProcessRenderPipelineManager
      ): typings.babylonjs.postProcessRenderPipelineManagerSceneComponentMod.babylonjsSceneAugmentingMod.Scene = {
        val __obj = js.Dynamic.literal(_postProcessRenderPipelineManager = _postProcessRenderPipelineManager.asInstanceOf[js.Any], postProcessRenderPipelineManager = postProcessRenderPipelineManager.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.babylonjs.postProcessRenderPipelineManagerSceneComponentMod.babylonjsSceneAugmentingMod.Scene]
      }
      
      @scala.inline
      implicit class SceneMutableBuilder[Self <: typings.babylonjs.postProcessRenderPipelineManagerSceneComponentMod.babylonjsSceneAugmentingMod.Scene] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPostProcessRenderPipelineManager(value: PostProcessRenderPipelineManager): Self = StObject.set(x, "postProcessRenderPipelineManager", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_postProcessRenderPipelineManager(value: PostProcessRenderPipelineManager): Self = StObject.set(x, "_postProcessRenderPipelineManager", value.asInstanceOf[js.Any])
      }
    }
  }
}
