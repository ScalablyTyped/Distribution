package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspacesIpGroup extends js.Object {
  
  /**
    * The description of the group.
    */
  var groupDesc: js.UndefOr[IpGroupDesc] = js.native
  
  /**
    * The identifier of the group.
    */
  var groupId: js.UndefOr[IpGroupId] = js.native
  
  /**
    * The name of the group.
    */
  var groupName: js.UndefOr[IpGroupName] = js.native
  
  /**
    * The rules.
    */
  var userRules: js.UndefOr[IpRuleList] = js.native
}
object WorkspacesIpGroup {
  
  @scala.inline
  def apply(): WorkspacesIpGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspacesIpGroup]
  }
  
  @scala.inline
  implicit class WorkspacesIpGroupOps[Self <: WorkspacesIpGroup] (val x: Self) extends AnyVal {
    
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
    def setGroupDesc(value: IpGroupDesc): Self = this.set("groupDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupDesc: Self = this.set("groupDesc", js.undefined)
    
    @scala.inline
    def setGroupId(value: IpGroupId): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    
    @scala.inline
    def setGroupName(value: IpGroupName): Self = this.set("groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("groupName", js.undefined)
    
    @scala.inline
    def setUserRulesVarargs(value: IpRuleItem*): Self = this.set("userRules", js.Array(value :_*))
    
    @scala.inline
    def setUserRules(value: IpRuleList): Self = this.set("userRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserRules: Self = this.set("userRules", js.undefined)
  }
}
