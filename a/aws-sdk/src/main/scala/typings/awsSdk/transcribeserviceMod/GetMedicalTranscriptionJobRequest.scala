package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMedicalTranscriptionJobRequest extends StObject {
  
  /**
    * The name of the medical transcription job.
    */
  var MedicalTranscriptionJobName: TranscriptionJobName
}
object GetMedicalTranscriptionJobRequest {
  
  inline def apply(MedicalTranscriptionJobName: TranscriptionJobName): GetMedicalTranscriptionJobRequest = {
    val __obj = js.Dynamic.literal(MedicalTranscriptionJobName = MedicalTranscriptionJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMedicalTranscriptionJobRequest]
  }
  
  extension [Self <: GetMedicalTranscriptionJobRequest](x: Self) {
    
    inline def setMedicalTranscriptionJobName(value: TranscriptionJobName): Self = StObject.set(x, "MedicalTranscriptionJobName", value.asInstanceOf[js.Any])
  }
}
