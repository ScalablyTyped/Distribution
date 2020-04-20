package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePipelineInput extends js.Object {
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id = js.native
}

object DeletePipelineInput {
  @scala.inline
  def apply(pipelineId: id): DeletePipelineInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePipelineInput]
  }
}

