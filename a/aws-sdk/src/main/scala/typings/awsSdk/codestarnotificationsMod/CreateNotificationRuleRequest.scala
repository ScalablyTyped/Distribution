package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNotificationRuleRequest extends StObject {
  
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
  implicit class CreateNotificationRuleRequestMutableBuilder[Self <: CreateNotificationRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    @scala.inline
    def setDetailType(value: DetailType): Self = StObject.set(x, "DetailType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeIds(value: EventTypeIds): Self = StObject.set(x, "EventTypeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeIdsVarargs(value: EventTypeId*): Self = StObject.set(x, "EventTypeIds", js.Array(value :_*))
    
    @scala.inline
    def setName(value: NotificationRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: NotificationRuleResource): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: NotificationRuleStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value :_*))
  }
}
