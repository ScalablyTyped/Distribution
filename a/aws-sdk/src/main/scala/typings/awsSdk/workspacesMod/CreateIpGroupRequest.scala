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
  
  @scala.inline
  def apply(GroupName: IpGroupName): CreateIpGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIpGroupRequest]
  }
  
  @scala.inline
  implicit class CreateIpGroupRequestMutableBuilder[Self <: CreateIpGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupDesc(value: IpGroupDesc): Self = StObject.set(x, "GroupDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupDescUndefined: Self = StObject.set(x, "GroupDesc", js.undefined)
    
    @scala.inline
    def setGroupName(value: IpGroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setUserRules(value: IpRuleList): Self = StObject.set(x, "UserRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRulesUndefined: Self = StObject.set(x, "UserRules", js.undefined)
    
    @scala.inline
    def setUserRulesVarargs(value: IpRuleItem*): Self = StObject.set(x, "UserRules", js.Array(value :_*))
  }
}
