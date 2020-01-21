package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWorkteamRequest extends js.Object {
  /**
    * A description of the work team.
    */
  var Description: String200 = js.native
  /**
    * A list of MemberDefinition objects that contains objects that identify the Amazon Cognito user pool that makes up the work team. For more information, see Amazon Cognito User Pools. All of the CognitoMemberDefinition objects that make up the member definition must have the same ClientId and UserPool values.
    */
  var MemberDefinitions: typings.awsSdk.sagemakerMod.MemberDefinitions = js.native
  /**
    * Configures notification of workers regarding available or expiring work items.
    */
  var NotificationConfiguration: js.UndefOr[typings.awsSdk.sagemakerMod.NotificationConfiguration] = js.native
  /**
    * An array of key-value pairs. For more information, see Resource Tag and Using Cost Allocation Tags in the  AWS Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The name of the work team. Use this name to identify the work team.
    */
  var WorkteamName: typings.awsSdk.sagemakerMod.WorkteamName = js.native
}

object CreateWorkteamRequest {
  @scala.inline
  def apply(
    Description: String200,
    MemberDefinitions: MemberDefinitions,
    WorkteamName: WorkteamName,
    NotificationConfiguration: NotificationConfiguration = null,
    Tags: TagList = null
  ): CreateWorkteamRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], MemberDefinitions = MemberDefinitions.asInstanceOf[js.Any], WorkteamName = WorkteamName.asInstanceOf[js.Any])
    if (NotificationConfiguration != null) __obj.updateDynamic("NotificationConfiguration")(NotificationConfiguration.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkteamRequest]
  }
}

