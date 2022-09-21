package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNotificationRuleRequest extends StObject {
  
  /**
    * A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request with the same parameters is received and a token is included, the request returns information about the initial request that used that token.  The Amazon Web Services SDKs prepopulate client request tokens. If you are using an Amazon Web Services SDK, an idempotency token is created for you. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.codestarnotificationsMod.ClientRequestToken] = js.undefined
  
  /**
    * The level of detail to include in the notifications for this resource. BASIC will include only the contents of the event as it would appear in Amazon CloudWatch. FULL will include any supplemental information provided by AWS CodeStar Notifications and/or the service for the resource for which the notification is created.
    */
  var DetailType: typings.awsSdk.codestarnotificationsMod.DetailType
  
  /**
    * A list of event types associated with this notification rule. For a list of allowed events, see EventTypeSummary.
    */
  var EventTypeIds: typings.awsSdk.codestarnotificationsMod.EventTypeIds
  
  /**
    * The name for the notification rule. Notification rule names must be unique in your Amazon Web Services account.
    */
  var Name: NotificationRuleName
  
  /**
    * The Amazon Resource Name (ARN) of the resource to associate with the notification rule. Supported resources include pipelines in CodePipeline, repositories in CodeCommit, and build projects in CodeBuild.
    */
  var Resource: NotificationRuleResource
  
  /**
    * The status of the notification rule. The default value is ENABLED. If the status is set to DISABLED, notifications aren't sent for the notification rule.
    */
  var Status: js.UndefOr[NotificationRuleStatus] = js.undefined
  
  /**
    * A list of tags to apply to this notification rule. Key names cannot start with "aws". 
    */
  var Tags: js.UndefOr[typings.awsSdk.codestarnotificationsMod.Tags] = js.undefined
  
  /**
    * A list of Amazon Resource Names (ARNs) of Amazon Simple Notification Service topics and Chatbot clients to associate with the notification rule.
    */
  var Targets: typings.awsSdk.codestarnotificationsMod.Targets
}
object CreateNotificationRuleRequest {
  
  inline def apply(
    DetailType: DetailType,
    EventTypeIds: EventTypeIds,
    Name: NotificationRuleName,
    Resource: NotificationRuleResource,
    Targets: Targets
  ): CreateNotificationRuleRequest = {
    val __obj = js.Dynamic.literal(DetailType = DetailType.asInstanceOf[js.Any], EventTypeIds = EventTypeIds.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Resource = Resource.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNotificationRuleRequest]
  }
  
  extension [Self <: CreateNotificationRuleRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDetailType(value: DetailType): Self = StObject.set(x, "DetailType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeIds(value: EventTypeIds): Self = StObject.set(x, "EventTypeIds", value.asInstanceOf[js.Any])
    
    inline def setEventTypeIdsVarargs(value: EventTypeId*): Self = StObject.set(x, "EventTypeIds", js.Array(value*))
    
    inline def setName(value: NotificationRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setResource(value: NotificationRuleResource): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: NotificationRuleStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value*))
  }
}
