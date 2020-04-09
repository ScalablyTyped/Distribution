package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMedicalTranscriptionJobRequest extends js.Object {
  /**
    * The name you provide to the DeleteMedicalTranscriptionJob object to delete a transcription job.
    */
  var MedicalTranscriptionJobName: TranscriptionJobName = js.native
}

object DeleteMedicalTranscriptionJobRequest {
  @scala.inline
  def apply(MedicalTranscriptionJobName: TranscriptionJobName): DeleteMedicalTranscriptionJobRequest = {
    val __obj = js.Dynamic.literal(MedicalTranscriptionJobName = MedicalTranscriptionJobName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteMedicalTranscriptionJobRequest]
  }
}

