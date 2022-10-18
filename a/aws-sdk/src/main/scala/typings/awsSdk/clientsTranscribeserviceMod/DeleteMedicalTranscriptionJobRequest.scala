package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMedicalTranscriptionJobRequest extends StObject {
  
  /**
    * The name of the medical transcription job you want to delete. Job names are case sensitive.
    */
  var MedicalTranscriptionJobName: TranscriptionJobName
}
object DeleteMedicalTranscriptionJobRequest {
  
  inline def apply(MedicalTranscriptionJobName: TranscriptionJobName): DeleteMedicalTranscriptionJobRequest = {
    val __obj = js.Dynamic.literal(MedicalTranscriptionJobName = MedicalTranscriptionJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMedicalTranscriptionJobRequest]
  }
  
  extension [Self <: DeleteMedicalTranscriptionJobRequest](x: Self) {
    
    inline def setMedicalTranscriptionJobName(value: TranscriptionJobName): Self = StObject.set(x, "MedicalTranscriptionJobName", value.asInstanceOf[js.Any])
  }
}
