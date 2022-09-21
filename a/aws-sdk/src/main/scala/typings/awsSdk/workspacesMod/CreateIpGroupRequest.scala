package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIpGroupRequest extends StObject {
  
  /**
    * The description of the group.
    */
  var GroupDesc: js.UndefOr[IpGroupDesc] = js.undefined
  
  /**
    * The name of the group.
    */
  var GroupName: IpGroupName
  
  /**
    * The tags. Each WorkSpaces resource can have a maximum of 50 tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The rules to add to the group.
    */
  var UserRules: js.UndefOr[IpRuleList] = js.undefined
}
object CreateIpGroupRequest {
  
  inline def apply(GroupName: IpGroupName): CreateIpGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIpGroupRequest]
  }
  
  extension [Self <: CreateIpGroupRequest](x: Self) {
    
    inline def setGroupDesc(value: IpGroupDesc): Self = StObject.set(x, "GroupDesc", value.asInstanceOf[js.Any])
    
    inline def setGroupDescUndefined: Self = StObject.set(x, "GroupDesc", js.undefined)
    
    inline def setGroupName(value: IpGroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUserRules(value: IpRuleList): Self = StObject.set(x, "UserRules", value.asInstanceOf[js.Any])
    
    inline def setUserRulesUndefined: Self = StObject.set(x, "UserRules", js.undefined)
    
    inline def setUserRulesVarargs(value: IpRuleItem*): Self = StObject.set(x, "UserRules", js.Array(value*))
  }
}
