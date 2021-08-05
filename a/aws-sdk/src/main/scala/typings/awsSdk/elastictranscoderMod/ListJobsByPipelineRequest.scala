package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobsByPipelineRequest extends StObject {
  
  /**
    *  To list jobs in chronological order by the date and time that they were submitted, enter true. To list jobs in reverse chronological order, enter false. 
    */
  var Ascending: js.UndefOr[typings.awsSdk.elastictranscoderMod.Ascending] = js.undefined
  
  /**
    *  When Elastic Transcoder returns more than one page of results, use pageToken in subsequent GET requests to get each successive page of results. 
    */
  var PageToken: js.UndefOr[Id] = js.undefined
  
  /**
    * The ID of the pipeline for which you want to get job information.
    */
  var PipelineId: Id
}
object ListJobsByPipelineRequest {
  
  inline def apply(PipelineId: Id): ListJobsByPipelineRequest = {
    val __obj = js.Dynamic.literal(PipelineId = PipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsByPipelineRequest]
  }
  
  extension [Self <: ListJobsByPipelineRequest](x: Self) {
    
    inline def setAscending(value: Ascending): Self = StObject.set(x, "Ascending", value.asInstanceOf[js.Any])
    
    inline def setAscendingUndefined: Self = StObject.set(x, "Ascending", js.undefined)
    
    inline def setPageToken(value: Id): Self = StObject.set(x, "PageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "PageToken", js.undefined)
    
    inline def setPipelineId(value: Id): Self = StObject.set(x, "PipelineId", value.asInstanceOf[js.Any])
  }
}
