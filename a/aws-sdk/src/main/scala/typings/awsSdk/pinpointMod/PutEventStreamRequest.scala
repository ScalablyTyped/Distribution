package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEventStreamRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  var WriteEventStream: typings.awsSdk.pinpointMod.WriteEventStream
}
object PutEventStreamRequest {
  
  @scala.inline
  def apply(ApplicationId: string, WriteEventStream: WriteEventStream): PutEventStreamRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteEventStream = WriteEventStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventStreamRequest]
  }
  
  @scala.inline
  implicit class PutEventStreamRequestMutableBuilder[Self <: PutEventStreamRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteEventStream(value: WriteEventStream): Self = StObject.set(x, "WriteEventStream", value.asInstanceOf[js.Any])
  }
}
