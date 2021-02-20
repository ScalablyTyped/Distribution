package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSubscription extends StObject {
  
  /**
    * The AWS DMS event notification subscription Id.
    */
  var CustSubscriptionId: js.UndefOr[String] = js.native
  
  /**
    * The AWS customer account associated with the AWS DMS event notification subscription.
    */
  var CustomerAwsId: js.UndefOr[String] = js.native
  
  /**
    * Boolean value that indicates if the event subscription is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A lists of event categories.
    */
  var EventCategoriesList: js.UndefOr[typings.awsSdk.dmsMod.EventCategoriesList] = js.native
  
  /**
    * The topic ARN of the AWS DMS event notification subscription.
    */
  var SnsTopicArn: js.UndefOr[String] = js.native
  
  /**
    * A list of source Ids for the event subscription.
    */
  var SourceIdsList: js.UndefOr[typings.awsSdk.dmsMod.SourceIdsList] = js.native
  
  /**
    *  The type of AWS DMS resource that generates events.  Valid values: replication-instance | replication-server | security-group | replication-task
    */
  var SourceType: js.UndefOr[String] = js.native
  
  /**
    * The status of the AWS DMS event notification subscription. Constraints: Can be one of the following: creating | modifying | deleting | active | no-permission | topic-not-exist The status "no-permission" indicates that AWS DMS no longer has permission to post to the SNS topic. The status "topic-not-exist" indicates that the topic was deleted after the subscription was created.
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * The time the AWS DMS event notification subscription was created.
    */
  var SubscriptionCreationTime: js.UndefOr[String] = js.native
}
object EventSubscription {
  
  @scala.inline
  def apply(): EventSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSubscription]
  }
  
  @scala.inline
  implicit class EventSubscriptionMutableBuilder[Self <: EventSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustSubscriptionId(value: String): Self = StObject.set(x, "CustSubscriptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustSubscriptionIdUndefined: Self = StObject.set(x, "CustSubscriptionId", js.undefined)
    
    @scala.inline
    def setCustomerAwsId(value: String): Self = StObject.set(x, "CustomerAwsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerAwsIdUndefined: Self = StObject.set(x, "CustomerAwsId", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setEventCategoriesList(value: EventCategoriesList): Self = StObject.set(x, "EventCategoriesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventCategoriesListUndefined: Self = StObject.set(x, "EventCategoriesList", js.undefined)
    
    @scala.inline
    def setEventCategoriesListVarargs(value: String*): Self = StObject.set(x, "EventCategoriesList", js.Array(value :_*))
    
    @scala.inline
    def setSnsTopicArn(value: String): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsTopicArnUndefined: Self = StObject.set(x, "SnsTopicArn", js.undefined)
    
    @scala.inline
    def setSourceIdsList(value: SourceIdsList): Self = StObject.set(x, "SourceIdsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIdsListUndefined: Self = StObject.set(x, "SourceIdsList", js.undefined)
    
    @scala.inline
    def setSourceIdsListVarargs(value: String*): Self = StObject.set(x, "SourceIdsList", js.Array(value :_*))
    
    @scala.inline
    def setSourceType(value: String): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setSubscriptionCreationTime(value: String): Self = StObject.set(x, "SubscriptionCreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionCreationTimeUndefined: Self = StObject.set(x, "SubscriptionCreationTime", js.undefined)
  }
}
