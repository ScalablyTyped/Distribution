package typings.babylonjs.postProcessesIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsSceneAugmentingMod {
  
  trait Scene extends StObject {
    
    /** @internal (Backing field) */
    var _postProcessRenderPipelineManager: typings.babylonjs.postProcessesRenderPipelinePostProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager
    
    /**
      * Gets the postprocess render pipeline manager
      * @see https://doc.babylonjs.com/how_to/how_to_use_postprocessrenderpipeline
      * @see https://doc.babylonjs.com/how_to/using_default_rendering_pipeline
      */
    val postProcessRenderPipelineManager: typings.babylonjs.postProcessesRenderPipelinePostProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager
  }
  object Scene {
    
    inline def apply(
      _postProcessRenderPipelineManager: typings.babylonjs.postProcessesRenderPipelinePostProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager,
      postProcessRenderPipelineManager: typings.babylonjs.postProcessesRenderPipelinePostProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager
    ): Scene = {
      val __obj = js.Dynamic.literal(_postProcessRenderPipelineManager = _postProcessRenderPipelineManager.asInstanceOf[js.Any], postProcessRenderPipelineManager = postProcessRenderPipelineManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scene]
    }
    
    extension [Self <: Scene](x: Self) {
      
      inline def setPostProcessRenderPipelineManager(
        value: typings.babylonjs.postProcessesRenderPipelinePostProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager
      ): Self = StObject.set(x, "postProcessRenderPipelineManager", value.asInstanceOf[js.Any])
      
      inline def set_postProcessRenderPipelineManager(
        value: typings.babylonjs.postProcessesRenderPipelinePostProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager
      ): Self = StObject.set(x, "_postProcessRenderPipelineManager", value.asInstanceOf[js.Any])
    }
  }
}
