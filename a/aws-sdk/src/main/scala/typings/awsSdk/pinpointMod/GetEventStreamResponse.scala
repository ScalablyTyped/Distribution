package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEventStreamResponse extends StObject {
  
  var EventStream: typings.awsSdk.pinpointMod.EventStream = js.native
}
object GetEventStreamResponse {
  
  @scala.inline
  def apply(EventStream: EventStream): GetEventStreamResponse = {
    val __obj = js.Dynamic.literal(EventStream = EventStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventStreamResponse]
  }
  
  @scala.inline
  implicit class GetEventStreamResponseMutableBuilder[Self <: GetEventStreamResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventStream(value: EventStream): Self = StObject.set(x, "EventStream", value.asInstanceOf[js.Any])
  }
}
