package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSOIdentity extends StObject {
  
  /**
    * The ID of the AWS SSO identity store.
    */
  var identityStoreId: IdentityStoreId
  
  /**
    * The user ID.
    */
  var userId: js.UndefOr[SSOReferenceId] = js.undefined
}
object SSOIdentity {
  
  inline def apply(identityStoreId: IdentityStoreId): SSOIdentity = {
    val __obj = js.Dynamic.literal(identityStoreId = identityStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSOIdentity]
  }
  
  extension [Self <: SSOIdentity](x: Self) {
    
    inline def setIdentityStoreId(value: IdentityStoreId): Self = StObject.set(x, "identityStoreId", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: SSOReferenceId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
