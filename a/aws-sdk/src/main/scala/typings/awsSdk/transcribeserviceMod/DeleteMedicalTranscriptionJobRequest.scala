package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMedicalTranscriptionJobRequest extends StObject {
  
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
  implicit class DeleteMedicalTranscriptionJobRequestMutableBuilder[Self <: DeleteMedicalTranscriptionJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedicalTranscriptionJobName(value: TranscriptionJobName): Self = StObject.set(x, "MedicalTranscriptionJobName", value.asInstanceOf[js.Any])
  }
}
