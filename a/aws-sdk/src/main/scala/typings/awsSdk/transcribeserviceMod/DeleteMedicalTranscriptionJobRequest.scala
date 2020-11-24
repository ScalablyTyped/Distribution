package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class DeleteMedicalTranscriptionJobRequestOps[Self <: DeleteMedicalTranscriptionJobRequest] (val x: Self) extends AnyVal {
    
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
