package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.IBrokerProperties> */
@js.native
trait BrokerProperties extends js.Object {
  
  var CorrelationId: js.UndefOr[String] = js.native
  
  var Label: js.UndefOr[String] = js.native
  
  var MessageId: js.UndefOr[String] = js.native
  
  var PartitionKey: js.UndefOr[String] = js.native
  
  var ReplyTo: js.UndefOr[String] = js.native
  
  var ReplyToSessionId: js.UndefOr[String] = js.native
  
  var ScheduledEnqueueTimeUtc: js.UndefOr[String] = js.native
  
  var SessionId: js.UndefOr[String] = js.native
  
  var TimeToLive: js.UndefOr[String] = js.native
  
  var To: js.UndefOr[String] = js.native
}
object BrokerProperties {
  
  @scala.inline
  def apply(): BrokerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerProperties]
  }
  
  @scala.inline
  implicit class BrokerPropertiesOps[Self <: BrokerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCorrelationId(value: String): Self = this.set("CorrelationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorrelationId: Self = this.set("CorrelationId", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("Label", js.undefined)
    
    @scala.inline
    def setMessageId(value: String): Self = this.set("MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageId: Self = this.set("MessageId", js.undefined)
    
    @scala.inline
    def setPartitionKey(value: String): Self = this.set("PartitionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionKey: Self = this.set("PartitionKey", js.undefined)
    
    @scala.inline
    def setReplyTo(value: String): Self = this.set("ReplyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplyTo: Self = this.set("ReplyTo", js.undefined)
    
    @scala.inline
    def setReplyToSessionId(value: String): Self = this.set("ReplyToSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplyToSessionId: Self = this.set("ReplyToSessionId", js.undefined)
    
    @scala.inline
    def setScheduledEnqueueTimeUtc(value: String): Self = this.set("ScheduledEnqueueTimeUtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledEnqueueTimeUtc: Self = this.set("ScheduledEnqueueTimeUtc", js.undefined)
    
    @scala.inline
    def setSessionId(value: String): Self = this.set("SessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionId: Self = this.set("SessionId", js.undefined)
    
    @scala.inline
    def setTimeToLive(value: String): Self = this.set("TimeToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeToLive: Self = this.set("TimeToLive", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = this.set("To", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("To", js.undefined)
  }
}
