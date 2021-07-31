package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamProcessorResponse extends StObject {
  
  /**
    * ARN for the newly create stream processor.
    */
  var StreamProcessorArn: js.UndefOr[typings.awsSdk.rekognitionMod.StreamProcessorArn] = js.undefined
}
object CreateStreamProcessorResponse {
  
  @scala.inline
  def apply(): CreateStreamProcessorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStreamProcessorResponse]
  }
  
  @scala.inline
  implicit class CreateStreamProcessorResponseMutableBuilder[Self <: CreateStreamProcessorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamProcessorArn(value: StreamProcessorArn): Self = StObject.set(x, "StreamProcessorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamProcessorArnUndefined: Self = StObject.set(x, "StreamProcessorArn", js.undefined)
  }
}
