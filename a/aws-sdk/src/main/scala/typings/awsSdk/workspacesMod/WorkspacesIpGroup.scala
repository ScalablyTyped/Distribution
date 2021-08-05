package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspacesIpGroup extends StObject {
  
  /**
    * The description of the group.
    */
  var groupDesc: js.UndefOr[IpGroupDesc] = js.undefined
  
  /**
    * The identifier of the group.
    */
  var groupId: js.UndefOr[IpGroupId] = js.undefined
  
  /**
    * The name of the group.
    */
  var groupName: js.UndefOr[IpGroupName] = js.undefined
  
  /**
    * The rules.
    */
  var userRules: js.UndefOr[IpRuleList] = js.undefined
}
object WorkspacesIpGroup {
  
  inline def apply(): WorkspacesIpGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspacesIpGroup]
  }
  
  extension [Self <: WorkspacesIpGroup](x: Self) {
    
    inline def setGroupDesc(value: IpGroupDesc): Self = StObject.set(x, "groupDesc", value.asInstanceOf[js.Any])
    
    inline def setGroupDescUndefined: Self = StObject.set(x, "groupDesc", js.undefined)
    
    inline def setGroupId(value: IpGroupId): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setGroupName(value: IpGroupName): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    inline def setUserRules(value: IpRuleList): Self = StObject.set(x, "userRules", value.asInstanceOf[js.Any])
    
    inline def setUserRulesUndefined: Self = StObject.set(x, "userRules", js.undefined)
    
    inline def setUserRulesVarargs(value: IpRuleItem*): Self = StObject.set(x, "userRules", js.Array(value :_*))
  }
}
