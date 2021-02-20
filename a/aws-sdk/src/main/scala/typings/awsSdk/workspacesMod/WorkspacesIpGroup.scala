package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspacesIpGroup extends StObject {
  
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
  implicit class WorkspacesIpGroupMutableBuilder[Self <: WorkspacesIpGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupDesc(value: IpGroupDesc): Self = StObject.set(x, "groupDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupDescUndefined: Self = StObject.set(x, "groupDesc", js.undefined)
    
    @scala.inline
    def setGroupId(value: IpGroupId): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    @scala.inline
    def setGroupName(value: IpGroupName): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    @scala.inline
    def setUserRules(value: IpRuleList): Self = StObject.set(x, "userRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRulesUndefined: Self = StObject.set(x, "userRules", js.undefined)
    
    @scala.inline
    def setUserRulesVarargs(value: IpRuleItem*): Self = StObject.set(x, "userRules", js.Array(value :_*))
  }
}
