package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyEventSubscriptionMessage extends StObject {
  
  /**
    *  A Boolean value; set to true to activate the subscription. 
    */
  var Enabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    *  A list of event categories for a source type that you want to subscribe to. Use the DescribeEventCategories action to see a list of event categories. 
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the Amazon SNS topic created for event notification. The ARN is created by Amazon SNS when you create a topic and subscribe to it.
    */
  var SnsTopicArn: js.UndefOr[String] = js.undefined
  
  /**
    *  The type of AWS DMS resource that generates the events you want to subscribe to.  Valid values: replication-instance | replication-task
    */
  var SourceType: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the AWS DMS event notification subscription to be modified.
    */
  var SubscriptionName: String
}
object ModifyEventSubscriptionMessage {
  
  inline def apply(SubscriptionName: String): ModifyEventSubscriptionMessage = {
    val __obj = js.Dynamic.literal(SubscriptionName = SubscriptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyEventSubscriptionMessage]
  }
  
  extension [Self <: ModifyEventSubscriptionMessage](x: Self) {
    
    inline def setEnabled(value: BooleanOptional): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setEventCategories(value: EventCategoriesList): Self = StObject.set(x, "EventCategories", value.asInstanceOf[js.Any])
    
    inline def setEventCategoriesUndefined: Self = StObject.set(x, "EventCategories", js.undefined)
    
    inline def setEventCategoriesVarargs(value: String*): Self = StObject.set(x, "EventCategories", js.Array(value :_*))
    
    inline def setSnsTopicArn(value: String): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArnUndefined: Self = StObject.set(x, "SnsTopicArn", js.undefined)
    
    inline def setSourceType(value: String): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    inline def setSubscriptionName(value: String): Self = StObject.set(x, "SubscriptionName", value.asInstanceOf[js.Any])
  }
}
