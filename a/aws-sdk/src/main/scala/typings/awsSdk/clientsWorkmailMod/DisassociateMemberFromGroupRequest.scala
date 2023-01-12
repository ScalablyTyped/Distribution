package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateMemberFromGroupRequest extends StObject {
  
  /**
    * The identifier for the group from which members are removed.
    */
  var GroupId: WorkMailIdentifier
  
  /**
    * The identifier for the member to be removed to the group.
    */
  var MemberId: WorkMailIdentifier
  
  /**
    * The identifier for the organization under which the group exists.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object DisassociateMemberFromGroupRequest {
  
  inline def apply(GroupId: WorkMailIdentifier, MemberId: WorkMailIdentifier, OrganizationId: OrganizationId): DisassociateMemberFromGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], MemberId = MemberId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateMemberFromGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateMemberFromGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setGroupId(value: WorkMailIdentifier): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setMemberId(value: WorkMailIdentifier): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
