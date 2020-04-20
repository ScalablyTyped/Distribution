package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTranscriptionJobRequest extends js.Object {
  /**
    * The name of the transcription job to be deleted.
    */
  var TranscriptionJobName: typings.awsSdk.transcribeserviceMod.TranscriptionJobName = js.native
}

object DeleteTranscriptionJobRequest {
  @scala.inline
  def apply(TranscriptionJobName: TranscriptionJobName): DeleteTranscriptionJobRequest = {
    val __obj = js.Dynamic.literal(TranscriptionJobName = TranscriptionJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTranscriptionJobRequest]
  }
}

