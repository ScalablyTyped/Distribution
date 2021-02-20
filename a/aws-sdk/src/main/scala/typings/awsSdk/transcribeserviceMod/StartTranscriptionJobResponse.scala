package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartTranscriptionJobResponse extends StObject {
  
  /**
    * An object containing details of the asynchronous transcription job.
    */
  var TranscriptionJob: js.UndefOr[typings.awsSdk.transcribeserviceMod.TranscriptionJob] = js.native
}
object StartTranscriptionJobResponse {
  
  @scala.inline
  def apply(): StartTranscriptionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTranscriptionJobResponse]
  }
  
  @scala.inline
  implicit class StartTranscriptionJobResponseMutableBuilder[Self <: StartTranscriptionJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTranscriptionJob(value: TranscriptionJob): Self = StObject.set(x, "TranscriptionJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscriptionJobUndefined: Self = StObject.set(x, "TranscriptionJob", js.undefined)
  }
}
