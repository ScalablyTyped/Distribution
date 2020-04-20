package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMedicalTranscriptionJobRequest extends js.Object {
  /**
    * The name of the medical transcription job.
    */
  var MedicalTranscriptionJobName: TranscriptionJobName = js.native
}

object GetMedicalTranscriptionJobRequest {
  @scala.inline
  def apply(MedicalTranscriptionJobName: TranscriptionJobName): GetMedicalTranscriptionJobRequest = {
    val __obj = js.Dynamic.literal(MedicalTranscriptionJobName = MedicalTranscriptionJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMedicalTranscriptionJobRequest]
  }
}

