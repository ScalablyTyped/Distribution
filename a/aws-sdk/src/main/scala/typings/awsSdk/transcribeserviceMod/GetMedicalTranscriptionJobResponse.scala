package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMedicalTranscriptionJobResponse extends StObject {
  
  /**
    * An object that contains the results of the medical transcription job.
    */
  var MedicalTranscriptionJob: js.UndefOr[typings.awsSdk.transcribeserviceMod.MedicalTranscriptionJob] = js.undefined
}
object GetMedicalTranscriptionJobResponse {
  
  @scala.inline
  def apply(): GetMedicalTranscriptionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMedicalTranscriptionJobResponse]
  }
  
  @scala.inline
  implicit class GetMedicalTranscriptionJobResponseMutableBuilder[Self <: GetMedicalTranscriptionJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedicalTranscriptionJob(value: MedicalTranscriptionJob): Self = StObject.set(x, "MedicalTranscriptionJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedicalTranscriptionJobUndefined: Self = StObject.set(x, "MedicalTranscriptionJob", js.undefined)
  }
}
