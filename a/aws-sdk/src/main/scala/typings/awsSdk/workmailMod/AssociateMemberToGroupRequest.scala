package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateMemberToGroupRequest extends StObject {
  
  /**
    * The group to which the member (user or group) is associated.
    */
  var GroupId: WorkMailIdentifier = js.native
  
  /**
    * The member (user or group) to associate to the group.
    */
  var MemberId: WorkMailIdentifier = js.native
  
  /**
    * The organization under which the group exists.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
}
object AssociateMemberToGroupRequest {
  
  @scala.inline
  def apply(GroupId: WorkMailIdentifier, MemberId: WorkMailIdentifier, OrganizationId: OrganizationId): AssociateMemberToGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], MemberId = MemberId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateMemberToGroupRequest]
  }
  
  @scala.inline
  implicit class AssociateMemberToGroupRequestMutableBuilder[Self <: AssociateMemberToGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: WorkMailIdentifier): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberId(value: WorkMailIdentifier): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
