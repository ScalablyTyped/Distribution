package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class GetMedicalTranscriptionJobRequestOps[Self <: GetMedicalTranscriptionJobRequest] (val x: Self) extends AnyVal {
    
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
    def setMedicalTranscriptionJobName(value: TranscriptionJobName): Self = this.set("MedicalTranscriptionJobName", value.asInstanceOf[js.Any])
  }
}
