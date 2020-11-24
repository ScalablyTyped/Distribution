package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelPipelineReprocessingRequest extends js.Object {
  
  /**
    * The name of pipeline for which data reprocessing is canceled.
    */
  var pipelineName: PipelineName = js.native
  
  /**
    * The ID of the reprocessing task (returned by StartPipelineReprocessing).
    */
  var reprocessingId: ReprocessingId = js.native
}
object CancelPipelineReprocessingRequest {
  
  @scala.inline
  def apply(pipelineName: PipelineName, reprocessingId: ReprocessingId): CancelPipelineReprocessingRequest = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName.asInstanceOf[js.Any], reprocessingId = reprocessingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelPipelineReprocessingRequest]
  }
  
  @scala.inline
  implicit class CancelPipelineReprocessingRequestOps[Self <: CancelPipelineReprocessingRequest] (val x: Self) extends AnyVal {
    
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
    def setPipelineName(value: PipelineName): Self = this.set("pipelineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReprocessingId(value: ReprocessingId): Self = this.set("reprocessingId", value.asInstanceOf[js.Any])
  }
}
