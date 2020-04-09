package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMedicalTranscriptionJobsRequest extends js.Object {
  /**
    * When specified, the jobs returned in the list are limited to jobs whose name contains the specified string.
    */
  var JobNameContains: js.UndefOr[TranscriptionJobName] = js.native
  /**
    * The maximum number of medical transcription jobs to return in the response. IF there are fewer results in the list, this response contains only the actual results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.transcribeserviceMod.MaxResults] = js.native
  /**
    * If you a receive a truncated result in the previous request of ListMedicalTranscriptionJobs, include NextToken to fetch the next set of jobs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.native
  /**
    * When specified, returns only medical transcription jobs with the specified status. Jobs are ordered by creation date, with the newest jobs returned first. If you don't specify a status, Amazon Transcribe Medical returns all transcription jobs ordered by creation date.
    */
  var Status: js.UndefOr[TranscriptionJobStatus] = js.native
}

object ListMedicalTranscriptionJobsRequest {
  @scala.inline
  def apply(
    JobNameContains: TranscriptionJobName = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    Status: TranscriptionJobStatus = null
  ): ListMedicalTranscriptionJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (JobNameContains != null) __obj.updateDynamic("JobNameContains")(JobNameContains.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMedicalTranscriptionJobsRequest]
  }
}

