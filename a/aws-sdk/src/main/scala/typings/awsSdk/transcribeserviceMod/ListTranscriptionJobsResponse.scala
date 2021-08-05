package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTranscriptionJobsResponse extends StObject {
  
  /**
    * The ListTranscriptionJobs operation returns a page of jobs at a time. The maximum size of the page is set by the MaxResults parameter. If there are more jobs in the list than the page size, Amazon Transcribe returns the NextPage token. Include the token in the next request to the ListTranscriptionJobs operation to return in the next page of jobs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.undefined
  
  /**
    * The requested status of the jobs returned.
    */
  var Status: js.UndefOr[TranscriptionJobStatus] = js.undefined
  
  /**
    * A list of objects containing summary information for a transcription job.
    */
  var TranscriptionJobSummaries: js.UndefOr[typings.awsSdk.transcribeserviceMod.TranscriptionJobSummaries] = js.undefined
}
object ListTranscriptionJobsResponse {
  
  inline def apply(): ListTranscriptionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTranscriptionJobsResponse]
  }
  
  extension [Self <: ListTranscriptionJobsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatus(value: TranscriptionJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTranscriptionJobSummaries(value: TranscriptionJobSummaries): Self = StObject.set(x, "TranscriptionJobSummaries", value.asInstanceOf[js.Any])
    
    inline def setTranscriptionJobSummariesUndefined: Self = StObject.set(x, "TranscriptionJobSummaries", js.undefined)
    
    inline def setTranscriptionJobSummariesVarargs(value: TranscriptionJobSummary*): Self = StObject.set(x, "TranscriptionJobSummaries", js.Array(value :_*))
  }
}
