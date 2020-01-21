package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePipelineInput extends js.Object {
  /**
    * Represents the structure of actions and stages to be performed in the pipeline. 
    */
  var pipeline: PipelineDeclaration = js.native
  /**
    * The tags for the pipeline.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreatePipelineInput {
  @scala.inline
  def apply(pipeline: PipelineDeclaration, tags: TagList = null): CreatePipelineInput = {
    val __obj = js.Dynamic.literal(pipeline = pipeline.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePipelineInput]
  }
}

