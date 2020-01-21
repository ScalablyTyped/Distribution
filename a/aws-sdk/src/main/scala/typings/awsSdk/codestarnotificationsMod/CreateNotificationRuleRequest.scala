package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    Targets: Targets,
    ClientRequestToken: ClientRequestToken = null,
    Status: NotificationRuleStatus = null,
    Tags: Tags = null
  ): CreateNotificationRuleRequest = {
    val __obj = js.Dynamic.literal(DetailType = DetailType.asInstanceOf[js.Any], EventTypeIds = EventTypeIds.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Resource = Resource.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNotificationRuleRequest]
  }
}

