package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePipelineOutput extends js.Object {
  /**
    * The ID that AWS Data Pipeline assigns the newly created pipeline. For example, df-06372391ZG65EXAMPLE.
    */
  var pipelineId: id = js.native
}

object CreatePipelineOutput {
  @scala.inline
  def apply(pipelineId: id): CreatePipelineOutput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePipelineOutput]
  }
}

