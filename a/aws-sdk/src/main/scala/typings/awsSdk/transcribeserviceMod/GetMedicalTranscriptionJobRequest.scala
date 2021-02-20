package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMedicalTranscriptionJobRequest extends StObject {
  
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
  implicit class GetMedicalTranscriptionJobRequestMutableBuilder[Self <: GetMedicalTranscriptionJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedicalTranscriptionJobName(value: TranscriptionJobName): Self = StObject.set(x, "MedicalTranscriptionJobName", value.asInstanceOf[js.Any])
  }
}
