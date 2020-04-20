package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePipelineRequest extends js.Object {
  /**
    * The name of the pipeline whose information is retrieved.
    */
  var pipelineName: PipelineName = js.native
}

object DescribePipelineRequest {
  @scala.inline
  def apply(pipelineName: PipelineName): DescribePipelineRequest = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePipelineRequest]
  }
}

