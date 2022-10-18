package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMedicalTranscriptionJobsRequest extends StObject {
  
  /**
    * Returns only the medical transcription jobs that contain the specified string. The search is not case sensitive.
    */
  var JobNameContains: js.UndefOr[TranscriptionJobName] = js.undefined
  
  /**
    * The maximum number of medical transcription jobs to return in each page of results. If there are fewer results than the value you specify, only the actual results are returned. If you don't specify a value, a default of 5 is used.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.MaxResults] = js.undefined
  
  /**
    * If your ListMedicalTranscriptionJobs request returns more results than can be displayed, NextToken is displayed in the response with an associated string. To get the next page of results, copy this string and repeat your request, including NextToken with the value of the copied string. Repeat as needed to view all your results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.NextToken] = js.undefined
  
  /**
    * Returns only medical transcription jobs with the specified status. Jobs are ordered by creation date, with the newest job first. If you don't include Status, all medical transcription jobs are returned.
    */
  var Status: js.UndefOr[TranscriptionJobStatus] = js.undefined
}
object ListMedicalTranscriptionJobsRequest {
  
  inline def apply(): ListMedicalTranscriptionJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMedicalTranscriptionJobsRequest]
  }
  
  extension [Self <: ListMedicalTranscriptionJobsRequest](x: Self) {
    
    inline def setJobNameContains(value: TranscriptionJobName): Self = StObject.set(x, "JobNameContains", value.asInstanceOf[js.Any])
    
    inline def setJobNameContainsUndefined: Self = StObject.set(x, "JobNameContains", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatus(value: TranscriptionJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
