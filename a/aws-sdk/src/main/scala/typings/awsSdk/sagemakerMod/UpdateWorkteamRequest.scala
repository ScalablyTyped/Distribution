package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWorkteamRequest extends js.Object {
  /**
    * An updated description for the work team.
    */
  var Description: js.UndefOr[String200] = js.native
  /**
    * A list of MemberDefinition objects that contain the updated work team members.
    */
  var MemberDefinitions: js.UndefOr[typings.awsSdk.sagemakerMod.MemberDefinitions] = js.native
  /**
    * Configures SNS topic notifications for available or expiring work items
    */
  var NotificationConfiguration: js.UndefOr[typings.awsSdk.sagemakerMod.NotificationConfiguration] = js.native
  /**
    * The name of the work team to update.
    */
  var WorkteamName: typings.awsSdk.sagemakerMod.WorkteamName = js.native
}

object UpdateWorkteamRequest {
  @scala.inline
  def apply(WorkteamName: WorkteamName): UpdateWorkteamRequest = {
    val __obj = js.Dynamic.literal(WorkteamName = WorkteamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkteamRequest]
  }
  @scala.inline
  implicit class UpdateWorkteamRequestOps[Self <: UpdateWorkteamRequest] (val x: Self) extends AnyVal {
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
    def setWorkteamName(value: WorkteamName): Self = this.set("WorkteamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String200): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setMemberDefinitionsVarargs(value: MemberDefinition*): Self = this.set("MemberDefinitions", js.Array(value :_*))
    @scala.inline
    def setMemberDefinitions(value: MemberDefinitions): Self = this.set("MemberDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberDefinitions: Self = this.set("MemberDefinitions", js.undefined)
    @scala.inline
    def setNotificationConfiguration(value: NotificationConfiguration): Self = this.set("NotificationConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationConfiguration: Self = this.set("NotificationConfiguration", js.undefined)
  }
  
}

