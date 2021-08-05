package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicalTranscript extends StObject {
  
  /**
    * The S3 object location of the medical transcript. Use this URI to access the medical transcript. This URI points to the S3 bucket you created to store the medical transcript.
    */
  var TranscriptFileUri: js.UndefOr[Uri] = js.undefined
}
object MedicalTranscript {
  
  inline def apply(): MedicalTranscript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicalTranscript]
  }
  
  extension [Self <: MedicalTranscript](x: Self) {
    
    inline def setTranscriptFileUri(value: Uri): Self = StObject.set(x, "TranscriptFileUri", value.asInstanceOf[js.Any])
    
    inline def setTranscriptFileUriUndefined: Self = StObject.set(x, "TranscriptFileUri", js.undefined)
  }
}
