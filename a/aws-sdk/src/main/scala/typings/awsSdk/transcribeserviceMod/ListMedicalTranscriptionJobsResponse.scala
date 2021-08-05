package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMedicalTranscriptionJobsResponse extends StObject {
  
  /**
    * A list of objects containing summary information for a transcription job.
    */
  var MedicalTranscriptionJobSummaries: js.UndefOr[typings.awsSdk.transcribeserviceMod.MedicalTranscriptionJobSummaries] = js.undefined
  
  /**
    * The ListMedicalTranscriptionJobs operation returns a page of jobs at a time. The maximum size of the page is set by the MaxResults parameter. If the number of jobs exceeds what can fit on a page, Amazon Transcribe Medical returns the NextPage token. Include the token in the next request to the ListMedicalTranscriptionJobs operation to return in the next page of jobs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.undefined
  
  /**
    * The requested status of the medical transcription jobs returned.
    */
  var Status: js.UndefOr[TranscriptionJobStatus] = js.undefined
}
object ListMedicalTranscriptionJobsResponse {
  
  inline def apply(): ListMedicalTranscriptionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMedicalTranscriptionJobsResponse]
  }
  
  extension [Self <: ListMedicalTranscriptionJobsResponse](x: Self) {
    
    inline def setMedicalTranscriptionJobSummaries(value: MedicalTranscriptionJobSummaries): Self = StObject.set(x, "MedicalTranscriptionJobSummaries", value.asInstanceOf[js.Any])
    
    inline def setMedicalTranscriptionJobSummariesUndefined: Self = StObject.set(x, "MedicalTranscriptionJobSummaries", js.undefined)
    
    inline def setMedicalTranscriptionJobSummariesVarargs(value: MedicalTranscriptionJobSummary*): Self = StObject.set(x, "MedicalTranscriptionJobSummaries", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatus(value: TranscriptionJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
