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
  
  @scala.inline
  def apply(SubscriptionName: String): ModifyEventSubscriptionMessage = {
    val __obj = js.Dynamic.literal(SubscriptionName = SubscriptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyEventSubscriptionMessage]
  }
  
  @scala.inline
  implicit class ModifyEventSubscriptionMessageMutableBuilder[Self <: ModifyEventSubscriptionMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: BooleanOptional): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setEventCategories(value: EventCategoriesList): Self = StObject.set(x, "EventCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventCategoriesUndefined: Self = StObject.set(x, "EventCategories", js.undefined)
    
    @scala.inline
    def setEventCategoriesVarargs(value: String*): Self = StObject.set(x, "EventCategories", js.Array(value :_*))
    
    @scala.inline
    def setSnsTopicArn(value: String): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsTopicArnUndefined: Self = StObject.set(x, "SnsTopicArn", js.undefined)
    
    @scala.inline
    def setSourceType(value: String): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    @scala.inline
    def setSubscriptionName(value: String): Self = StObject.set(x, "SubscriptionName", value.asInstanceOf[js.Any])
  }
}
