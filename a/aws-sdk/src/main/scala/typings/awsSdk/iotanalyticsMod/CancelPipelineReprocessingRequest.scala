package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelPipelineReprocessingRequest extends js.Object {
  /**
    * The name of pipeline for which data reprocessing is canceled.
    */
  var pipelineName: PipelineName = js.native
  /**
    * The ID of the reprocessing task (returned by "StartPipelineReprocessing").
    */
  var reprocessingId: ReprocessingId = js.native
}

object CancelPipelineReprocessingRequest {
  @scala.inline
  def apply(pipelineName: PipelineName, reprocessingId: ReprocessingId): CancelPipelineReprocessingRequest = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName.asInstanceOf[js.Any], reprocessingId = reprocessingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelPipelineReprocessingRequest]
  }
}

