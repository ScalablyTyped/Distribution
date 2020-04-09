package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    MedicalTranscriptionJobSummaries: MedicalTranscriptionJobSummaries = null,
    NextToken: NextToken = null,
    Status: TranscriptionJobStatus = null
  ): ListMedicalTranscriptionJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (MedicalTranscriptionJobSummaries != null) __obj.updateDynamic("MedicalTranscriptionJobSummaries")(MedicalTranscriptionJobSummaries.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMedicalTranscriptionJobsResponse]
  }
}

