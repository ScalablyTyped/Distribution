package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTranscriptionJobsRequest extends js.Object {
  /**
    * When specified, the jobs returned in the list are limited to jobs whose name contains the specified string.
    */
  var JobNameContains: js.UndefOr[TranscriptionJobName] = js.native
  /**
    * The maximum number of jobs to return in the response. If there are fewer results in the list, this response contains only the actual results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.transcribeserviceMod.MaxResults] = js.native
  /**
    * If the result of the previous request to ListTranscriptionJobs was truncated, include the NextToken to fetch the next set of jobs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.native
  /**
    * When specified, returns only transcription jobs with the specified status. Jobs are ordered by creation date, with the newest jobs returned first. If you don’t specify a status, Amazon Transcribe returns all transcription jobs ordered by creation date. 
    */
  var Status: js.UndefOr[TranscriptionJobStatus] = js.native
}

object ListTranscriptionJobsRequest {
  @scala.inline
  def apply(): ListTranscriptionJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTranscriptionJobsRequest]
  }
  @scala.inline
  implicit class ListTranscriptionJobsRequestOps[Self <: ListTranscriptionJobsRequest] (val x: Self) extends AnyVal {
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
    def setJobNameContains(value: TranscriptionJobName): Self = this.set("JobNameContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobNameContains: Self = this.set("JobNameContains", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
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

