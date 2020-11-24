package typings.babylonjs.postProcessesIndexMod.babylonjsSceneAugmentingMod

import typings.babylonjs.postProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scene extends js.Object {
  
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
  ): Scene = {
    val __obj = js.Dynamic.literal(_postProcessRenderPipelineManager = _postProcessRenderPipelineManager.asInstanceOf[js.Any], postProcessRenderPipelineManager = postProcessRenderPipelineManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
  
  @scala.inline
  implicit class SceneOps[Self <: Scene] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_postProcessRenderPipelineManager(value: PostProcessRenderPipelineManager): Self = this.set("_postProcessRenderPipelineManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostProcessRenderPipelineManager(value: PostProcessRenderPipelineManager): Self = this.set("postProcessRenderPipelineManager", value.asInstanceOf[js.Any])
  }
}
