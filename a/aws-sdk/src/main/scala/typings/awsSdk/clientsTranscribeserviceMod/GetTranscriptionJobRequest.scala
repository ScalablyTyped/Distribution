package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTranscriptionJobRequest extends StObject {
  
  /**
    * The name of the transcription job you want information about. Job names are case sensitive.
    */
  var TranscriptionJobName: typings.awsSdk.clientsTranscribeserviceMod.TranscriptionJobName
}
object GetTranscriptionJobRequest {
  
  inline def apply(TranscriptionJobName: TranscriptionJobName): GetTranscriptionJobRequest = {
    val __obj = js.Dynamic.literal(TranscriptionJobName = TranscriptionJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTranscriptionJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTranscriptionJobRequest] (val x: Self) extends AnyVal {
    
    inline def setTranscriptionJobName(value: TranscriptionJobName): Self = StObject.set(x, "TranscriptionJobName", value.asInstanceOf[js.Any])
  }
}
