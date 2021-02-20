package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTranscriptionJobRequest extends StObject {
  
  /**
    * The name of the transcription job to be deleted.
    */
  var TranscriptionJobName: typings.awsSdk.transcribeserviceMod.TranscriptionJobName = js.native
}
object DeleteTranscriptionJobRequest {
  
  @scala.inline
  def apply(TranscriptionJobName: TranscriptionJobName): DeleteTranscriptionJobRequest = {
    val __obj = js.Dynamic.literal(TranscriptionJobName = TranscriptionJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTranscriptionJobRequest]
  }
  
  @scala.inline
  implicit class DeleteTranscriptionJobRequestMutableBuilder[Self <: DeleteTranscriptionJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTranscriptionJobName(value: TranscriptionJobName): Self = StObject.set(x, "TranscriptionJobName", value.asInstanceOf[js.Any])
  }
}
