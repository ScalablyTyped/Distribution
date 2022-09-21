package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceDetail extends StObject {
  
  /**
    * The source of the event, such as an Amazon Web Services service, that triggers Config to evaluate your Amazon Web Services resources.
    */
  var EventSource: js.UndefOr[typings.awsSdk.configserviceMod.EventSource] = js.undefined
  
  /**
    * The frequency at which you want Config to run evaluations for a custom rule with a periodic trigger. If you specify a value for MaximumExecutionFrequency, then MessageType must use the ScheduledNotification value.  By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid value for the MaximumExecutionFrequency parameter. Based on the valid value you choose, Config runs evaluations once for each valid value. For example, if you choose Three_Hours, Config runs evaluations once every three hours. In this case, Three_Hours is the frequency of this rule.  
    */
  var MaximumExecutionFrequency: js.UndefOr[typings.awsSdk.configserviceMod.MaximumExecutionFrequency] = js.undefined
  
  /**
    * The type of notification that triggers Config to run an evaluation for a rule. You can specify the following notification types:    ConfigurationItemChangeNotification - Triggers an evaluation when Config delivers a configuration item as a result of a resource change.    OversizedConfigurationItemChangeNotification - Triggers an evaluation when Config delivers an oversized configuration item. Config may generate this notification type when a resource changes and the notification exceeds the maximum size allowed by Amazon SNS.    ScheduledNotification - Triggers a periodic evaluation at the frequency specified for MaximumExecutionFrequency.    ConfigurationSnapshotDeliveryCompleted - Triggers a periodic evaluation when Config delivers a configuration snapshot.   If you want your custom rule to be triggered by configuration changes, specify two SourceDetail objects, one for ConfigurationItemChangeNotification and one for OversizedConfigurationItemChangeNotification.
    */
  var MessageType: js.UndefOr[typings.awsSdk.configserviceMod.MessageType] = js.undefined
}
object SourceDetail {
  
  inline def apply(): SourceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceDetail]
  }
  
  extension [Self <: SourceDetail](x: Self) {
    
    inline def setEventSource(value: EventSource): Self = StObject.set(x, "EventSource", value.asInstanceOf[js.Any])
    
    inline def setEventSourceUndefined: Self = StObject.set(x, "EventSource", js.undefined)
    
    inline def setMaximumExecutionFrequency(value: MaximumExecutionFrequency): Self = StObject.set(x, "MaximumExecutionFrequency", value.asInstanceOf[js.Any])
    
    inline def setMaximumExecutionFrequencyUndefined: Self = StObject.set(x, "MaximumExecutionFrequency", js.undefined)
    
    inline def setMessageType(value: MessageType): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "MessageType", js.undefined)
  }
}
