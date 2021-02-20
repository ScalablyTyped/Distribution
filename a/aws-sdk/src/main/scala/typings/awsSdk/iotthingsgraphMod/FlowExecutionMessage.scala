package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowExecutionMessage extends StObject {
  
  /**
    * The type of flow event .
    */
  var eventType: js.UndefOr[FlowExecutionEventType] = js.native
  
  /**
    * The unique identifier of the message.
    */
  var messageId: js.UndefOr[FlowExecutionMessageId] = js.native
  
  /**
    * A string containing information about the flow event.
    */
  var payload: js.UndefOr[FlowExecutionMessagePayload] = js.native
  
  /**
    * The date and time when the message was last updated.
    */
  var timestamp: js.UndefOr[Timestamp] = js.native
}
object FlowExecutionMessage {
  
  @scala.inline
  def apply(): FlowExecutionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowExecutionMessage]
  }
  
  @scala.inline
  implicit class FlowExecutionMessageMutableBuilder[Self <: FlowExecutionMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventType(value: FlowExecutionEventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    @scala.inline
    def setMessageId(value: FlowExecutionMessageId): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    @scala.inline
    def setPayload(value: FlowExecutionMessagePayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
