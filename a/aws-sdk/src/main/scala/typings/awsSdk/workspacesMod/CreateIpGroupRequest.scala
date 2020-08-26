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
  def apply(GroupName: IpGroupName): CreateIpGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIpGroupRequest]
  }
  @scala.inline
  implicit class CreateIpGroupRequestOps[Self <: CreateIpGroupRequest] (val x: Self) extends AnyVal {
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
    def setGroupName(value: IpGroupName): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupDesc(value: IpGroupDesc): Self = this.set("GroupDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupDesc: Self = this.set("GroupDesc", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setUserRulesVarargs(value: IpRuleItem*): Self = this.set("UserRules", js.Array(value :_*))
    @scala.inline
    def setUserRules(value: IpRuleList): Self = this.set("UserRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserRules: Self = this.set("UserRules", js.undefined)
  }
  
}

