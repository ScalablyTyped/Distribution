package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEventStreamResponse extends StObject {
  
  var EventStream: typings.awsSdk.pinpointMod.EventStream = js.native
}
object DeleteEventStreamResponse {
  
  @scala.inline
  def apply(EventStream: EventStream): DeleteEventStreamResponse = {
    val __obj = js.Dynamic.literal(EventStream = EventStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventStreamResponse]
  }
  
  @scala.inline
  implicit class DeleteEventStreamResponseMutableBuilder[Self <: DeleteEventStreamResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventStream(value: EventStream): Self = StObject.set(x, "EventStream", value.asInstanceOf[js.Any])
  }
}
