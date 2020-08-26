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
    * The name of the workforce.
    */
  var WorkforceName: js.UndefOr[typings.awsSdk.sagemakerMod.WorkforceName] = js.native
  /**
    * The name of the work team. Use this name to identify the work team.
    */
  var WorkteamName: typings.awsSdk.sagemakerMod.WorkteamName = js.native
}

object CreateWorkteamRequest {
  @scala.inline
  def apply(Description: String200, MemberDefinitions: MemberDefinitions, WorkteamName: WorkteamName): CreateWorkteamRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], MemberDefinitions = MemberDefinitions.asInstanceOf[js.Any], WorkteamName = WorkteamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkteamRequest]
  }
  @scala.inline
  implicit class CreateWorkteamRequestOps[Self <: CreateWorkteamRequest] (val x: Self) extends AnyVal {
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
    def setDescription(value: String200): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemberDefinitionsVarargs(value: MemberDefinition*): Self = this.set("MemberDefinitions", js.Array(value :_*))
    @scala.inline
    def setMemberDefinitions(value: MemberDefinitions): Self = this.set("MemberDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkteamName(value: WorkteamName): Self = this.set("WorkteamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotificationConfiguration(value: NotificationConfiguration): Self = this.set("NotificationConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationConfiguration: Self = this.set("NotificationConfiguration", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setWorkforceName(value: WorkforceName): Self = this.set("WorkforceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkforceName: Self = this.set("WorkforceName", js.undefined)
  }
  
}

