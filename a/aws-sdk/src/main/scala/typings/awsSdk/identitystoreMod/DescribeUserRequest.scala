package typings.awsSdk.identitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserRequest extends StObject {
  
  /**
    * The globally unique identifier for the identity store, such as d-1234567890. In this example, d- is a fixed prefix, and 1234567890 is a randomly generated string which contains number and lower case letters. This value is generated at the time that a new identity store is created.
    */
  var IdentityStoreId: typings.awsSdk.identitystoreMod.IdentityStoreId
  
  /**
    * The identifier for a user in the identity store.
    */
  var UserId: ResourceId
}
object DescribeUserRequest {
  
  @scala.inline
  def apply(IdentityStoreId: IdentityStoreId, UserId: ResourceId): DescribeUserRequest = {
    val __obj = js.Dynamic.literal(IdentityStoreId = IdentityStoreId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserRequest]
  }
  
  @scala.inline
  implicit class DescribeUserRequestMutableBuilder[Self <: DescribeUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityStoreId(value: IdentityStoreId): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: ResourceId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
