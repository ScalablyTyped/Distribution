package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTranscriptionJobsResponse extends js.Object {
  
  /**
    * The ListTranscriptionJobs operation returns a page of jobs at a time. The maximum size of the page is set by the MaxResults parameter. If there are more jobs in the list than the page size, Amazon Transcribe returns the NextPage token. Include the token in the next request to the ListTranscriptionJobs operation to return in the next page of jobs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.native
  
  /**
    * The requested status of the jobs returned.
    */
  var Status: js.UndefOr[TranscriptionJobStatus] = js.native
  
  /**
    * A list of objects containing summary information for a transcription job.
    */
  var TranscriptionJobSummaries: js.UndefOr[typings.awsSdk.transcribeserviceMod.TranscriptionJobSummaries] = js.native
}
object ListTranscriptionJobsResponse {
  
  @scala.inline
  def apply(): ListTranscriptionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTranscriptionJobsResponse]
  }
  
  @scala.inline
  implicit class ListTranscriptionJobsResponseOps[Self <: ListTranscriptionJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setStatus(value: TranscriptionJobStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTranscriptionJobSummariesVarargs(value: TranscriptionJobSummary*): Self = this.set("TranscriptionJobSummaries", js.Array(value :_*))
    
    @scala.inline
    def setTranscriptionJobSummaries(value: TranscriptionJobSummaries): Self = this.set("TranscriptionJobSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscriptionJobSummaries: Self = this.set("TranscriptionJobSummaries", js.undefined)
  }
}
