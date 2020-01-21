package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTranscriptionJobResponse extends js.Object {
  /**
    * An object that contains the results of the transcription job.
    */
  var TranscriptionJob: js.UndefOr[typings.awsSdk.transcribeserviceMod.TranscriptionJob] = js.native
}

object GetTranscriptionJobResponse {
  @scala.inline
  def apply(TranscriptionJob: TranscriptionJob = null): GetTranscriptionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (TranscriptionJob != null) __obj.updateDynamic("TranscriptionJob")(TranscriptionJob.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTranscriptionJobResponse]
  }
}

