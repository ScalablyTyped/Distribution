package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicalTranscript extends StObject {
  
  /**
    * The Amazon S3 location of your transcript. You can use this URI to access or download your transcript. Note that this is the Amazon S3 location you specified in your request using the OutputBucketName parameter.
    */
  var TranscriptFileUri: js.UndefOr[Uri] = js.undefined
}
object MedicalTranscript {
  
  inline def apply(): MedicalTranscript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicalTranscript]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicalTranscript] (val x: Self) extends AnyVal {
    
    inline def setTranscriptFileUri(value: Uri): Self = StObject.set(x, "TranscriptFileUri", value.asInstanceOf[js.Any])
    
    inline def setTranscriptFileUriUndefined: Self = StObject.set(x, "TranscriptFileUri", js.undefined)
  }
}
