package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateMemberToGroupRequest extends StObject {
  
  /**
    * The group to which the member (user or group) is associated.
    */
  var GroupId: WorkMailIdentifier
  
  /**
    * The member (user or group) to associate to the group.
    */
  var MemberId: WorkMailIdentifier
  
  /**
    * The organization under which the group exists.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId
}
object AssociateMemberToGroupRequest {
  
  inline def apply(GroupId: WorkMailIdentifier, MemberId: WorkMailIdentifier, OrganizationId: OrganizationId): AssociateMemberToGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], MemberId = MemberId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateMemberToGroupRequest]
  }
  
  extension [Self <: AssociateMemberToGroupRequest](x: Self) {
    
    inline def setGroupId(value: WorkMailIdentifier): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setMemberId(value: WorkMailIdentifier): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
