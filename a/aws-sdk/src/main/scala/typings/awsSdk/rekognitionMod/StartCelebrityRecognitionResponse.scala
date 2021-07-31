package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartCelebrityRecognitionResponse extends StObject {
  
  /**
    * The identifier for the celebrity recognition analysis job. Use JobId to identify the job in a subsequent call to GetCelebrityRecognition.
    */
  var JobId: js.UndefOr[typings.awsSdk.rekognitionMod.JobId] = js.undefined
}
object StartCelebrityRecognitionResponse {
  
  @scala.inline
  def apply(): StartCelebrityRecognitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartCelebrityRecognitionResponse]
  }
  
  @scala.inline
  implicit class StartCelebrityRecognitionResponseMutableBuilder[Self <: StartCelebrityRecognitionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
