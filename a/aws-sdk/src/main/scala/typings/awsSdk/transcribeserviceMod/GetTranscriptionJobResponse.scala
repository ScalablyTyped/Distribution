package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTranscriptionJobResponse extends StObject {
  
  /**
    * An object that contains the results of the transcription job.
    */
  var TranscriptionJob: js.UndefOr[typings.awsSdk.transcribeserviceMod.TranscriptionJob] = js.undefined
}
object GetTranscriptionJobResponse {
  
  @scala.inline
  def apply(): GetTranscriptionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTranscriptionJobResponse]
  }
  
  @scala.inline
  implicit class GetTranscriptionJobResponseMutableBuilder[Self <: GetTranscriptionJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTranscriptionJob(value: TranscriptionJob): Self = StObject.set(x, "TranscriptionJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscriptionJobUndefined: Self = StObject.set(x, "TranscriptionJob", js.undefined)
  }
}
