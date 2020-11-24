package typings.babylonjs.renderPipelineIndexMod

import typings.babylonjs.engineMod.Engine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
