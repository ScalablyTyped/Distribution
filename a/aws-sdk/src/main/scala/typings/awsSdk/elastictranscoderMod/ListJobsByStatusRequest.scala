package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobsByStatusRequest extends StObject {
  
  /**
    *  To list jobs in chronological order by the date and time that they were submitted, enter true. To list jobs in reverse chronological order, enter false. 
    */
  var Ascending: js.UndefOr[typings.awsSdk.elastictranscoderMod.Ascending] = js.undefined
  
  /**
    *  When Elastic Transcoder returns more than one page of results, use pageToken in subsequent GET requests to get each successive page of results. 
    */
  var PageToken: js.UndefOr[Id] = js.undefined
  
  /**
    * To get information about all of the jobs associated with the current AWS account that have a given status, specify the following status: Submitted, Progressing, Complete, Canceled, or Error.
    */
  var Status: JobStatus
}
object ListJobsByStatusRequest {
  
  inline def apply(Status: JobStatus): ListJobsByStatusRequest = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsByStatusRequest]
  }
  
  extension [Self <: ListJobsByStatusRequest](x: Self) {
    
    inline def setAscending(value: Ascending): Self = StObject.set(x, "Ascending", value.asInstanceOf[js.Any])
    
    inline def setAscendingUndefined: Self = StObject.set(x, "Ascending", js.undefined)
    
    inline def setPageToken(value: Id): Self = StObject.set(x, "PageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "PageToken", js.undefined)
    
    inline def setStatus(value: JobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
