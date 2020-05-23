package typings.babylonjs.renderPipelineIndexMod.babylonjsSceneAugmentingMod

import typings.babylonjs.postProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scene extends js.Object {
  /** @hidden (Backing field) */
  var _postProcessRenderPipelineManager: PostProcessRenderPipelineManager
  /**
    * Gets the postprocess render pipeline manager
    * @see http://doc.babylonjs.com/how_to/how_to_use_postprocessrenderpipeline
    * @see http://doc.babylonjs.com/how_to/using_default_rendering_pipeline
    */
  val postProcessRenderPipelineManager: PostProcessRenderPipelineManager
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
}

