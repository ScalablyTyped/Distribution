package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMedicalTranscriptionJobResponse extends StObject {
  
  /**
    * Provides detailed information about the specified medical transcription job, including job status and, if applicable, failure reason.
    */
  var MedicalTranscriptionJob: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.MedicalTranscriptionJob] = js.undefined
}
object GetMedicalTranscriptionJobResponse {
  
  inline def apply(): GetMedicalTranscriptionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMedicalTranscriptionJobResponse]
  }
  
  extension [Self <: GetMedicalTranscriptionJobResponse](x: Self) {
    
    inline def setMedicalTranscriptionJob(value: MedicalTranscriptionJob): Self = StObject.set(x, "MedicalTranscriptionJob", value.asInstanceOf[js.Any])
    
    inline def setMedicalTranscriptionJobUndefined: Self = StObject.set(x, "MedicalTranscriptionJob", js.undefined)
  }
}
