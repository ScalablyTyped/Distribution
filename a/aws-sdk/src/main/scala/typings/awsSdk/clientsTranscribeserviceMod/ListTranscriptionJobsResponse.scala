package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTranscriptionJobsResponse extends StObject {
  
  /**
    * If NextToken is present in your response, it indicates that not all results are displayed. To view the next set of results, copy the string associated with the NextToken parameter in your results output, then run your request again including NextToken with the value of the copied string. Repeat as needed to view all your results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.NextToken] = js.undefined
  
  /**
    * Lists all transcription jobs that have the status specified in your request. Jobs are ordered by creation date, with the newest job first.
    */
  var Status: js.UndefOr[TranscriptionJobStatus] = js.undefined
  
  /**
    * Provides a summary of information about each result.
    */
  var TranscriptionJobSummaries: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.TranscriptionJobSummaries] = js.undefined
}
object ListTranscriptionJobsResponse {
  
  inline def apply(): ListTranscriptionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTranscriptionJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTranscriptionJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatus(value: TranscriptionJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTranscriptionJobSummaries(value: TranscriptionJobSummaries): Self = StObject.set(x, "TranscriptionJobSummaries", value.asInstanceOf[js.Any])
    
    inline def setTranscriptionJobSummariesUndefined: Self = StObject.set(x, "TranscriptionJobSummaries", js.undefined)
    
    inline def setTranscriptionJobSummariesVarargs(value: TranscriptionJobSummary*): Self = StObject.set(x, "TranscriptionJobSummaries", js.Array(value*))
  }
}
