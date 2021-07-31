package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartPipelineReprocessingRequest extends StObject {
  
  /**
    * The end time (exclusive) of raw message data that is reprocessed.
    */
  var endTime: js.UndefOr[EndTime] = js.undefined
  
  /**
    * The name of the pipeline on which to start reprocessing.
    */
  var pipelineName: PipelineName
  
  /**
    * The start time (inclusive) of raw message data that is reprocessed.
    */
  var startTime: js.UndefOr[StartTime] = js.undefined
}
object StartPipelineReprocessingRequest {
  
  @scala.inline
  def apply(pipelineName: PipelineName): StartPipelineReprocessingRequest = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartPipelineReprocessingRequest]
  }
  
  @scala.inline
  implicit class StartPipelineReprocessingRequestMutableBuilder[Self <: StartPipelineReprocessingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: EndTime): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: StartTime): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
