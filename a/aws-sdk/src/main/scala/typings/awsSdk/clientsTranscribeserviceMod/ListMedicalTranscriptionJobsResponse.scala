package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMedicalTranscriptionJobsResponse extends StObject {
  
  /**
    * Provides a summary of information about each result.
    */
  var MedicalTranscriptionJobSummaries: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.MedicalTranscriptionJobSummaries] = js.undefined
  
  /**
    * If NextToken is present in your response, it indicates that not all results are displayed. To view the next set of results, copy the string associated with the NextToken parameter in your results output, then run your request again including NextToken with the value of the copied string. Repeat as needed to view all your results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.NextToken] = js.undefined
  
  /**
    * Lists all medical transcription jobs that have the status specified in your request. Jobs are ordered by creation date, with the newest job first.
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
    
    inline def setMedicalTranscriptionJobSummariesVarargs(value: MedicalTranscriptionJobSummary*): Self = StObject.set(x, "MedicalTranscriptionJobSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatus(value: TranscriptionJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
