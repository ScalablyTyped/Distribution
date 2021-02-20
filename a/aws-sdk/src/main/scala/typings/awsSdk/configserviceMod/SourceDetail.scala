package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceDetail extends StObject {
  
  /**
    * The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWS resources.
    */
  var EventSource: js.UndefOr[typings.awsSdk.configserviceMod.EventSource] = js.native
  
  /**
    * The frequency at which you want AWS Config to run evaluations for a custom rule with a periodic trigger. If you specify a value for MaximumExecutionFrequency, then MessageType must use the ScheduledNotification value.  By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid value for the MaximumExecutionFrequency parameter. Based on the valid value you choose, AWS Config runs evaluations once for each valid value. For example, if you choose Three_Hours, AWS Config runs evaluations once every three hours. In this case, Three_Hours is the frequency of this rule.  
    */
  var MaximumExecutionFrequency: js.UndefOr[typings.awsSdk.configserviceMod.MaximumExecutionFrequency] = js.native
  
  /**
    * The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the following notification types:    ConfigurationItemChangeNotification - Triggers an evaluation when AWS Config delivers a configuration item as a result of a resource change.    OversizedConfigurationItemChangeNotification - Triggers an evaluation when AWS Config delivers an oversized configuration item. AWS Config may generate this notification type when a resource changes and the notification exceeds the maximum size allowed by Amazon SNS.    ScheduledNotification - Triggers a periodic evaluation at the frequency specified for MaximumExecutionFrequency.    ConfigurationSnapshotDeliveryCompleted - Triggers a periodic evaluation when AWS Config delivers a configuration snapshot.   If you want your custom rule to be triggered by configuration changes, specify two SourceDetail objects, one for ConfigurationItemChangeNotification and one for OversizedConfigurationItemChangeNotification.
    */
  var MessageType: js.UndefOr[typings.awsSdk.configserviceMod.MessageType] = js.native
}
object SourceDetail {
  
  @scala.inline
  def apply(): SourceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceDetail]
  }
  
  @scala.inline
  implicit class SourceDetailMutableBuilder[Self <: SourceDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventSource(value: EventSource): Self = StObject.set(x, "EventSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSourceUndefined: Self = StObject.set(x, "EventSource", js.undefined)
    
    @scala.inline
    def setMaximumExecutionFrequency(value: MaximumExecutionFrequency): Self = StObject.set(x, "MaximumExecutionFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumExecutionFrequencyUndefined: Self = StObject.set(x, "MaximumExecutionFrequency", js.undefined)
    
    @scala.inline
    def setMessageType(value: MessageType): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTypeUndefined: Self = StObject.set(x, "MessageType", js.undefined)
  }
}
