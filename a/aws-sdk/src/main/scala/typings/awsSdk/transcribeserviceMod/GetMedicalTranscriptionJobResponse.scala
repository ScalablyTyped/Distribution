package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMedicalTranscriptionJobResponse extends js.Object {
  /**
    * An object that contains the results of the medical transcription job.
    */
  var MedicalTranscriptionJob: js.UndefOr[typings.awsSdk.transcribeserviceMod.MedicalTranscriptionJob] = js.native
}

object GetMedicalTranscriptionJobResponse {
  @scala.inline
  def apply(MedicalTranscriptionJob: MedicalTranscriptionJob = null): GetMedicalTranscriptionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (MedicalTranscriptionJob != null) __obj.updateDynamic("MedicalTranscriptionJob")(MedicalTranscriptionJob.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMedicalTranscriptionJobResponse]
  }
}

