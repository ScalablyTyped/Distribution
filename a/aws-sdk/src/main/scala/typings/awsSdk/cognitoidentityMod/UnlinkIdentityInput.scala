package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnlinkIdentityInput extends StObject {
  
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: typings.awsSdk.cognitoidentityMod.IdentityId
  
  /**
    * A set of optional name-value pairs that map provider names to provider tokens.
    */
  var Logins: LoginsMap
  
  /**
    * Provider names to unlink from this identity.
    */
  var LoginsToRemove: LoginsList
}
object UnlinkIdentityInput {
  
  inline def apply(IdentityId: IdentityId, Logins: LoginsMap, LoginsToRemove: LoginsList): UnlinkIdentityInput = {
    val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any], Logins = Logins.asInstanceOf[js.Any], LoginsToRemove = LoginsToRemove.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnlinkIdentityInput]
  }
  
  extension [Self <: UnlinkIdentityInput](x: Self) {
    
    inline def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    inline def setLogins(value: LoginsMap): Self = StObject.set(x, "Logins", value.asInstanceOf[js.Any])
    
    inline def setLoginsToRemove(value: LoginsList): Self = StObject.set(x, "LoginsToRemove", value.asInstanceOf[js.Any])
    
    inline def setLoginsToRemoveVarargs(value: IdentityProviderName*): Self = StObject.set(x, "LoginsToRemove", js.Array(value :_*))
  }
}
