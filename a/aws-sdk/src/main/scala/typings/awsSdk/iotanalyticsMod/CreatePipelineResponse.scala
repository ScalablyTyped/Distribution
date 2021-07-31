package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePipelineResponse extends StObject {
  
  /**
    * The ARN of the pipeline.
    */
  var pipelineArn: js.UndefOr[PipelineArn] = js.undefined
  
  /**
    * The name of the pipeline.
    */
  var pipelineName: js.UndefOr[PipelineName] = js.undefined
}
object CreatePipelineResponse {
  
  @scala.inline
  def apply(): CreatePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePipelineResponse]
  }
  
  @scala.inline
  implicit class CreatePipelineResponseMutableBuilder[Self <: CreatePipelineResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipelineArn(value: PipelineArn): Self = StObject.set(x, "pipelineArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineArnUndefined: Self = StObject.set(x, "pipelineArn", js.undefined)
    
    @scala.inline
    def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineNameUndefined: Self = StObject.set(x, "pipelineName", js.undefined)
  }
}
