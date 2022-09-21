package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartMedicalTranscriptionJobResponse extends StObject {
  
  /**
    * Provides detailed information about the current medical transcription job, including job status and, if applicable, failure reason.
    */
  var MedicalTranscriptionJob: js.UndefOr[typings.awsSdk.transcribeserviceMod.MedicalTranscriptionJob] = js.undefined
}
object StartMedicalTranscriptionJobResponse {
  
  inline def apply(): StartMedicalTranscriptionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartMedicalTranscriptionJobResponse]
  }
  
  extension [Self <: StartMedicalTranscriptionJobResponse](x: Self) {
    
    inline def setMedicalTranscriptionJob(value: MedicalTranscriptionJob): Self = StObject.set(x, "MedicalTranscriptionJob", value.asInstanceOf[js.Any])
    
    inline def setMedicalTranscriptionJobUndefined: Self = StObject.set(x, "MedicalTranscriptionJob", js.undefined)
  }
}
