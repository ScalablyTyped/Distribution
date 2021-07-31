package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBrokerProperties extends StObject {
  
  var CorrelationId: String
  
  var Label: String
  
  var MessageId: String
  
  var PartitionKey: String
  
  var ReplyTo: String
  
  var ReplyToSessionId: String
  
  var ScheduledEnqueueTimeUtc: String
  
  var SessionId: String
  
  var TimeToLive: String
  
  var To: String
}
object IBrokerProperties {
  
  @scala.inline
  def apply(
    CorrelationId: String,
    Label: String,
    MessageId: String,
    PartitionKey: String,
    ReplyTo: String,
    ReplyToSessionId: String,
    ScheduledEnqueueTimeUtc: String,
    SessionId: String,
    TimeToLive: String,
    To: String
  ): IBrokerProperties = {
    val __obj = js.Dynamic.literal(CorrelationId = CorrelationId.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any], ReplyTo = ReplyTo.asInstanceOf[js.Any], ReplyToSessionId = ReplyToSessionId.asInstanceOf[js.Any], ScheduledEnqueueTimeUtc = ScheduledEnqueueTimeUtc.asInstanceOf[js.Any], SessionId = SessionId.asInstanceOf[js.Any], TimeToLive = TimeToLive.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBrokerProperties]
  }
  
  @scala.inline
  implicit class IBrokerPropertiesMutableBuilder[Self <: IBrokerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorrelationId(value: String): Self = StObject.set(x, "CorrelationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: String): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionKey(value: String): Self = StObject.set(x, "PartitionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyTo(value: String): Self = StObject.set(x, "ReplyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToSessionId(value: String): Self = StObject.set(x, "ReplyToSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledEnqueueTimeUtc(value: String): Self = StObject.set(x, "ScheduledEnqueueTimeUtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToLive(value: String): Self = StObject.set(x, "TimeToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
  }
}
