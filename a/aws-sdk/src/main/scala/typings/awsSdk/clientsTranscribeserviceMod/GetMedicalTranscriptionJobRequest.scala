package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMedicalTranscriptionJobRequest extends StObject {
  
  /**
    * The name of the medical transcription job you want information about. Job names are case sensitive.
    */
  var MedicalTranscriptionJobName: TranscriptionJobName
}
object GetMedicalTranscriptionJobRequest {
  
  inline def apply(MedicalTranscriptionJobName: TranscriptionJobName): GetMedicalTranscriptionJobRequest = {
    val __obj = js.Dynamic.literal(MedicalTranscriptionJobName = MedicalTranscriptionJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMedicalTranscriptionJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMedicalTranscriptionJobRequest] (val x: Self) extends AnyVal {
    
    inline def setMedicalTranscriptionJobName(value: TranscriptionJobName): Self = StObject.set(x, "MedicalTranscriptionJobName", value.asInstanceOf[js.Any])
  }
}
