package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartMedicalTranscriptionJobResponse extends StObject {
  
  /**
    * A batch job submitted to transcribe medical speech to text.
    */
  var MedicalTranscriptionJob: js.UndefOr[typings.awsSdk.transcribeserviceMod.MedicalTranscriptionJob] = js.native
}
object StartMedicalTranscriptionJobResponse {
  
  @scala.inline
  def apply(): StartMedicalTranscriptionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartMedicalTranscriptionJobResponse]
  }
  
  @scala.inline
  implicit class StartMedicalTranscriptionJobResponseMutableBuilder[Self <: StartMedicalTranscriptionJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedicalTranscriptionJob(value: MedicalTranscriptionJob): Self = StObject.set(x, "MedicalTranscriptionJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedicalTranscriptionJobUndefined: Self = StObject.set(x, "MedicalTranscriptionJob", js.undefined)
  }
}
