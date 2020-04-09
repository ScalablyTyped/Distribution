package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMedicalTranscriptionJobResponse extends js.Object {
  /**
    * A batch job submitted to transcribe medical speech to text.
    */
  var MedicalTranscriptionJob: js.UndefOr[typings.awsSdk.transcribeserviceMod.MedicalTranscriptionJob] = js.native
}

object StartMedicalTranscriptionJobResponse {
  @scala.inline
  def apply(MedicalTranscriptionJob: MedicalTranscriptionJob = null): StartMedicalTranscriptionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (MedicalTranscriptionJob != null) __obj.updateDynamic("MedicalTranscriptionJob")(MedicalTranscriptionJob.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMedicalTranscriptionJobResponse]
  }
}

