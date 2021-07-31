package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMedicalTranscriptionJobsRequest extends StObject {
  
  /**
    * When specified, the jobs returned in the list are limited to jobs whose name contains the specified string.
    */
  var JobNameContains: js.UndefOr[TranscriptionJobName] = js.undefined
  
  /**
    * The maximum number of medical transcription jobs to return in the response. IF there are fewer results in the list, this response contains only the actual results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.transcribeserviceMod.MaxResults] = js.undefined
  
  /**
    * If you a receive a truncated result in the previous request of ListMedicalTranscriptionJobs, include NextToken to fetch the next set of jobs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.undefined
  
  /**
    * When specified, returns only medical transcription jobs with the specified status. Jobs are ordered by creation date, with the newest jobs returned first. If you don't specify a status, Amazon Transcribe Medical returns all transcription jobs ordered by creation date.
    */
  var Status: js.UndefOr[TranscriptionJobStatus] = js.undefined
}
object ListMedicalTranscriptionJobsRequest {
  
  @scala.inline
  def apply(): ListMedicalTranscriptionJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMedicalTranscriptionJobsRequest]
  }
  
  @scala.inline
  implicit class ListMedicalTranscriptionJobsRequestMutableBuilder[Self <: ListMedicalTranscriptionJobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobNameContains(value: TranscriptionJobName): Self = StObject.set(x, "JobNameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameContainsUndefined: Self = StObject.set(x, "JobNameContains", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStatus(value: TranscriptionJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
