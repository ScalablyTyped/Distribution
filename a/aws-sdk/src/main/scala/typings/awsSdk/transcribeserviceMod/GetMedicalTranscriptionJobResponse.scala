package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMedicalTranscriptionJobResponse extends js.Object {
  
  /**
    * An object that contains the results of the medical transcription job.
    */
  var MedicalTranscriptionJob: js.UndefOr[typings.awsSdk.transcribeserviceMod.MedicalTranscriptionJob] = js.native
}
object GetMedicalTranscriptionJobResponse {
  
  @scala.inline
  def apply(): GetMedicalTranscriptionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMedicalTranscriptionJobResponse]
  }
  
  @scala.inline
  implicit class GetMedicalTranscriptionJobResponseOps[Self <: GetMedicalTranscriptionJobResponse] (val x: Self) extends AnyVal {
    
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
    def setMedicalTranscriptionJob(value: MedicalTranscriptionJob): Self = this.set("MedicalTranscriptionJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedicalTranscriptionJob: Self = this.set("MedicalTranscriptionJob", js.undefined)
  }
}
