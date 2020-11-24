package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSubscription extends js.Object {
  
  /**
    * The name of the Amazon Redshift event notification subscription.
    */
  var CustSubscriptionId: js.UndefOr[String] = js.native
  
  /**
    * The AWS customer account associated with the Amazon Redshift event notification subscription.
    */
  var CustomerAwsId: js.UndefOr[String] = js.native
  
  /**
    * A boolean value indicating whether the subscription is enabled; true indicates that the subscription is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The list of Amazon Redshift event categories specified in the event notification subscription. Values: Configuration, Management, Monitoring, Security
    */
  var EventCategoriesList: js.UndefOr[typings.awsSdk.redshiftMod.EventCategoriesList] = js.native
  
  /**
    * The event severity specified in the Amazon Redshift event notification subscription. Values: ERROR, INFO
    */
  var Severity: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic used by the event notification subscription.
    */
  var SnsTopicArn: js.UndefOr[String] = js.native
  
  /**
    * A list of the sources that publish events to the Amazon Redshift event notification subscription.
    */
  var SourceIdsList: js.UndefOr[typings.awsSdk.redshiftMod.SourceIdsList] = js.native
  
  /**
    * The source type of the events returned by the Amazon Redshift event notification, such as cluster, cluster-snapshot, cluster-parameter-group, cluster-security-group, or scheduled-action. 
    */
  var SourceType: js.UndefOr[String] = js.native
  
  /**
    * The status of the Amazon Redshift event notification subscription. Constraints:   Can be one of the following: active | no-permission | topic-not-exist   The status "no-permission" indicates that Amazon Redshift no longer has permission to post to the Amazon SNS topic. The status "topic-not-exist" indicates that the topic was deleted after the subscription was created.  
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * The date and time the Amazon Redshift event notification subscription was created.
    */
  var SubscriptionCreationTime: js.UndefOr[TStamp] = js.native
  
  /**
    * The list of tags for the event subscription.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object EventSubscription {
  
  @scala.inline
  def apply(): EventSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSubscription]
  }
  
  @scala.inline
  implicit class EventSubscriptionOps[Self <: EventSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCustSubscriptionId(value: String): Self = this.set("CustSubscriptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustSubscriptionId: Self = this.set("CustSubscriptionId", js.undefined)
    
    @scala.inline
    def setCustomerAwsId(value: String): Self = this.set("CustomerAwsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerAwsId: Self = this.set("CustomerAwsId", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setEventCategoriesListVarargs(value: String*): Self = this.set("EventCategoriesList", js.Array(value :_*))
    
    @scala.inline
    def setEventCategoriesList(value: EventCategoriesList): Self = this.set("EventCategoriesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventCategoriesList: Self = this.set("EventCategoriesList", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = this.set("Severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("Severity", js.undefined)
    
    @scala.inline
    def setSnsTopicArn(value: String): Self = this.set("SnsTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsTopicArn: Self = this.set("SnsTopicArn", js.undefined)
    
    @scala.inline
    def setSourceIdsListVarargs(value: String*): Self = this.set("SourceIdsList", js.Array(value :_*))
    
    @scala.inline
    def setSourceIdsList(value: SourceIdsList): Self = this.set("SourceIdsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceIdsList: Self = this.set("SourceIdsList", js.undefined)
    
    @scala.inline
    def setSourceType(value: String): Self = this.set("SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceType: Self = this.set("SourceType", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setSubscriptionCreationTime(value: TStamp): Self = this.set("SubscriptionCreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionCreationTime: Self = this.set("SubscriptionCreationTime", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
