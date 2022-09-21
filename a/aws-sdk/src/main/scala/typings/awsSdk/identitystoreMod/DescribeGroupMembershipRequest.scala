package typings.awsSdk.identitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGroupMembershipRequest extends StObject {
  
  /**
    * The globally unique identifier for the identity store.
    */
  var IdentityStoreId: typings.awsSdk.identitystoreMod.IdentityStoreId
  
  /**
    * The identifier for a GroupMembership in an identity store.
    */
  var MembershipId: ResourceId
}
object DescribeGroupMembershipRequest {
  
  inline def apply(IdentityStoreId: IdentityStoreId, MembershipId: ResourceId): DescribeGroupMembershipRequest = {
    val __obj = js.Dynamic.literal(IdentityStoreId = IdentityStoreId.asInstanceOf[js.Any], MembershipId = MembershipId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGroupMembershipRequest]
  }
  
  extension [Self <: DescribeGroupMembershipRequest](x: Self) {
    
    inline def setIdentityStoreId(value: IdentityStoreId): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
    
    inline def setMembershipId(value: ResourceId): Self = StObject.set(x, "MembershipId", value.asInstanceOf[js.Any])
  }
}
