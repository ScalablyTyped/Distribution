package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePipelineResponse extends js.Object {
  
  /**
    * The ARN of the pipeline.
    */
  var pipelineArn: js.UndefOr[PipelineArn] = js.native
  
  /**
    * The name of the pipeline.
    */
  var pipelineName: js.UndefOr[PipelineName] = js.native
}
object CreatePipelineResponse {
  
  @scala.inline
  def apply(): CreatePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePipelineResponse]
  }
  
  @scala.inline
  implicit class CreatePipelineResponseOps[Self <: CreatePipelineResponse] (val x: Self) extends AnyVal {
    
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
    def setPipelineArn(value: PipelineArn): Self = this.set("pipelineArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipelineArn: Self = this.set("pipelineArn", js.undefined)
    
    @scala.inline
    def setPipelineName(value: PipelineName): Self = this.set("pipelineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipelineName: Self = this.set("pipelineName", js.undefined)
  }
}
