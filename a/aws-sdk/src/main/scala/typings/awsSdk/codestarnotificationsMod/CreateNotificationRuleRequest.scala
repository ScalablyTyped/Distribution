package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNotificationRuleRequest extends js.Object {
  
  /**
    * A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request with the same parameters is received and a token is included, the request returns information about the initial request that used that token.  The AWS SDKs prepopulate client request tokens. If you are using an AWS SDK, an idempotency token is created for you. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.codestarnotificationsMod.ClientRequestToken] = js.native
  
  /**
    * The level of detail to include in the notifications for this resource. BASIC will include only the contents of the event as it would appear in AWS CloudWatch. FULL will include any supplemental information provided by AWS CodeStar Notifications and/or the service for the resource for which the notification is created.
    */
  var DetailType: typings.awsSdk.codestarnotificationsMod.DetailType = js.native
  
  /**
    * A list of event types associated with this notification rule. For a list of allowed events, see EventTypeSummary.
    */
  var EventTypeIds: typings.awsSdk.codestarnotificationsMod.EventTypeIds = js.native
  
  /**
    * The name for the notification rule. Notifictaion rule names must be unique in your AWS account.
    */
  var Name: NotificationRuleName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the resource to associate with the notification rule. Supported resources include pipelines in AWS CodePipeline, repositories in AWS CodeCommit, and build projects in AWS CodeBuild.
    */
  var Resource: NotificationRuleResource = js.native
  
  /**
    * The status of the notification rule. The default value is ENABLED. If the status is set to DISABLED, notifications aren't sent for the notification rule.
    */
  var Status: js.UndefOr[NotificationRuleStatus] = js.native
  
  /**
    * A list of tags to apply to this notification rule. Key names cannot start with "aws". 
    */
  var Tags: js.UndefOr[typings.awsSdk.codestarnotificationsMod.Tags] = js.native
  
  /**
    * A list of Amazon Resource Names (ARNs) of SNS topics to associate with the notification rule.
    */
  var Targets: typings.awsSdk.codestarnotificationsMod.Targets = js.native
}
object CreateNotificationRuleRequest {
  
  @scala.inline
  def apply(
    DetailType: DetailType,
    EventTypeIds: EventTypeIds,
    Name: NotificationRuleName,
    Resource: NotificationRuleResource,
    Targets: Targets
  ): CreateNotificationRuleRequest = {
    val __obj = js.Dynamic.literal(DetailType = DetailType.asInstanceOf[js.Any], EventTypeIds = EventTypeIds.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Resource = Resource.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNotificationRuleRequest]
  }
  
  @scala.inline
  implicit class CreateNotificationRuleRequestOps[Self <: CreateNotificationRuleRequest] (val x: Self) extends AnyVal {
    
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
    def setDetailType(value: DetailType): Self = this.set("DetailType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeIdsVarargs(value: EventTypeId*): Self = this.set("EventTypeIds", js.Array(value :_*))
    
    @scala.inline
    def setEventTypeIds(value: EventTypeIds): Self = this.set("EventTypeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NotificationRuleName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: NotificationRuleResource): Self = this.set("Resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = this.set("Targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: Targets): Self = this.set("Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
    
    @scala.inline
    def setStatus(value: NotificationRuleStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
