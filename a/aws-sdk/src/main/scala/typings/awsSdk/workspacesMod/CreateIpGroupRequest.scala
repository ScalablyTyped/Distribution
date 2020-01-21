package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIpGroupRequest extends js.Object {
  /**
    * The description of the group.
    */
  var GroupDesc: js.UndefOr[IpGroupDesc] = js.native
  /**
    * The name of the group.
    */
  var GroupName: IpGroupName = js.native
  /**
    * The tags. Each WorkSpaces resource can have a maximum of 50 tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The rules to add to the group.
    */
  var UserRules: js.UndefOr[IpRuleList] = js.native
}

object CreateIpGroupRequest {
  @scala.inline
  def apply(
    GroupName: IpGroupName,
    GroupDesc: IpGroupDesc = null,
    Tags: TagList = null,
    UserRules: IpRuleList = null
  ): CreateIpGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any])
    if (GroupDesc != null) __obj.updateDynamic("GroupDesc")(GroupDesc.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (UserRules != null) __obj.updateDynamic("UserRules")(UserRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIpGroupRequest]
  }
}

