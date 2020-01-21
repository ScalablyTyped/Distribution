package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTranscriptionJobResponse extends js.Object {
  /**
    * An object containing details of the asynchronous transcription job.
    */
  var TranscriptionJob: js.UndefOr[typings.awsSdk.transcribeserviceMod.TranscriptionJob] = js.native
}

object StartTranscriptionJobResponse {
  @scala.inline
  def apply(TranscriptionJob: TranscriptionJob = null): StartTranscriptionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (TranscriptionJob != null) __obj.updateDynamic("TranscriptionJob")(TranscriptionJob.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTranscriptionJobResponse]
  }
}

