package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTranscriptionJobResponse extends StObject {
  
  /**
    * Provides detailed information about the specified transcription job, including job status and, if applicable, failure reason.
    */
  var TranscriptionJob: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.TranscriptionJob] = js.undefined
}
object GetTranscriptionJobResponse {
  
  inline def apply(): GetTranscriptionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTranscriptionJobResponse]
  }
  
  extension [Self <: GetTranscriptionJobResponse](x: Self) {
    
    inline def setTranscriptionJob(value: TranscriptionJob): Self = StObject.set(x, "TranscriptionJob", value.asInstanceOf[js.Any])
    
    inline def setTranscriptionJobUndefined: Self = StObject.set(x, "TranscriptionJob", js.undefined)
  }
}
