package typings.awsSdk.identitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGroupMembershipRequest extends StObject {
  
  /**
    * The identifier for a group in the identity store.
    */
  var GroupId: ResourceId
  
  /**
    * The globally unique identifier for the identity store.
    */
  var IdentityStoreId: typings.awsSdk.identitystoreMod.IdentityStoreId
  
  /**
    * An object that contains the identifier of a group member. Setting the UserID field to the specific identifier for a user indicates that the user is a member of the group.
    */
  var MemberId: typings.awsSdk.identitystoreMod.MemberId
}
object CreateGroupMembershipRequest {
  
  inline def apply(GroupId: ResourceId, IdentityStoreId: IdentityStoreId, MemberId: MemberId): CreateGroupMembershipRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], IdentityStoreId = IdentityStoreId.asInstanceOf[js.Any], MemberId = MemberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupMembershipRequest]
  }
  
  extension [Self <: CreateGroupMembershipRequest](x: Self) {
    
    inline def setGroupId(value: ResourceId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setIdentityStoreId(value: IdentityStoreId): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
    
    inline def setMemberId(value: MemberId): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
  }
}
