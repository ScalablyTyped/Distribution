package typings.awsSdk.identitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupIdRequest extends StObject {
  
  /**
    * A unique identifier for a user or group that is not the primary identifier. This value can be an identifier from an external identity provider (IdP) that is associated with the user, the group, or a unique attribute. For example, a unique GroupDisplayName.
    */
  var AlternateIdentifier: typings.awsSdk.identitystoreMod.AlternateIdentifier
  
  /**
    * The globally unique identifier for the identity store.
    */
  var IdentityStoreId: typings.awsSdk.identitystoreMod.IdentityStoreId
}
object GetGroupIdRequest {
  
  inline def apply(AlternateIdentifier: AlternateIdentifier, IdentityStoreId: IdentityStoreId): GetGroupIdRequest = {
    val __obj = js.Dynamic.literal(AlternateIdentifier = AlternateIdentifier.asInstanceOf[js.Any], IdentityStoreId = IdentityStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupIdRequest]
  }
  
  extension [Self <: GetGroupIdRequest](x: Self) {
    
    inline def setAlternateIdentifier(value: AlternateIdentifier): Self = StObject.set(x, "AlternateIdentifier", value.asInstanceOf[js.Any])
    
    inline def setIdentityStoreId(value: IdentityStoreId): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
  }
}
