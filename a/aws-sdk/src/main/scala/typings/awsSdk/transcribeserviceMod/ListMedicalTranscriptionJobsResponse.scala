package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMedicalTranscriptionJobsResponse extends js.Object {
  
  /**
    * A list of objects containing summary information for a transcription job.
    */
  var MedicalTranscriptionJobSummaries: js.UndefOr[typings.awsSdk.transcribeserviceMod.MedicalTranscriptionJobSummaries] = js.native
  
  /**
    * The ListMedicalTranscriptionJobs operation returns a page of jobs at a time. The maximum size of the page is set by the MaxResults parameter. If the number of jobs exceeds what can fit on a page, Amazon Transcribe Medical returns the NextPage token. Include the token in the next request to the ListMedicalTranscriptionJobs operation to return in the next page of jobs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.native
  
  /**
    * The requested status of the medical transcription jobs returned.
    */
  var Status: js.UndefOr[TranscriptionJobStatus] = js.native
}
object ListMedicalTranscriptionJobsResponse {
  
  @scala.inline
  def apply(): ListMedicalTranscriptionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMedicalTranscriptionJobsResponse]
  }
  
  @scala.inline
  implicit class ListMedicalTranscriptionJobsResponseOps[Self <: ListMedicalTranscriptionJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setMedicalTranscriptionJobSummariesVarargs(value: MedicalTranscriptionJobSummary*): Self = this.set("MedicalTranscriptionJobSummaries", js.Array(value :_*))
    
    @scala.inline
    def setMedicalTranscriptionJobSummaries(value: MedicalTranscriptionJobSummaries): Self = this.set("MedicalTranscriptionJobSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedicalTranscriptionJobSummaries: Self = this.set("MedicalTranscriptionJobSummaries", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setStatus(value: TranscriptionJobStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
