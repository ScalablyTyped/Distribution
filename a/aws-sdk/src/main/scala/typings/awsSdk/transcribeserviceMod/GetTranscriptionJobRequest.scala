package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTranscriptionJobRequest extends StObject {
  
  /**
    * The name of the job.
    */
  var TranscriptionJobName: typings.awsSdk.transcribeserviceMod.TranscriptionJobName
}
object GetTranscriptionJobRequest {
  
  @scala.inline
  def apply(TranscriptionJobName: TranscriptionJobName): GetTranscriptionJobRequest = {
    val __obj = js.Dynamic.literal(TranscriptionJobName = TranscriptionJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTranscriptionJobRequest]
  }
  
  @scala.inline
  implicit class GetTranscriptionJobRequestMutableBuilder[Self <: GetTranscriptionJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTranscriptionJobName(value: TranscriptionJobName): Self = StObject.set(x, "TranscriptionJobName", value.asInstanceOf[js.Any])
  }
}
