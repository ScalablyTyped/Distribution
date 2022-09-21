package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartPipelineReprocessingRequest extends StObject {
  
  /**
    * Specifies one or more sets of channel messages that you want to reprocess. If you use the channelMessages object, you must not specify a value for startTime and endTime.
    */
  var channelMessages: js.UndefOr[ChannelMessages] = js.undefined
  
  /**
    * The end time (exclusive) of raw message data that is reprocessed. If you specify a value for the endTime parameter, you must not use the channelMessages object.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the pipeline on which to start reprocessing.
    */
  var pipelineName: PipelineName
  
  /**
    * The start time (inclusive) of raw message data that is reprocessed. If you specify a value for the startTime parameter, you must not use the channelMessages object.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
}
object StartPipelineReprocessingRequest {
  
  inline def apply(pipelineName: PipelineName): StartPipelineReprocessingRequest = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartPipelineReprocessingRequest]
  }
  
  extension [Self <: StartPipelineReprocessingRequest](x: Self) {
    
    inline def setChannelMessages(value: ChannelMessages): Self = StObject.set(x, "channelMessages", value.asInstanceOf[js.Any])
    
    inline def setChannelMessagesUndefined: Self = StObject.set(x, "channelMessages", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
