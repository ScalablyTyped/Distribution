package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationRecord extends StObject {
  
  /**
    * The associated authority, if used.
    */
  var authority: String
  
  /**
    * The associated client ID.
    */
  var clientId: String
  
  /**
    * The home account Id.
    */
  var homeAccountId: String
  
  /**
    * The associated tenant ID.
    */
  var tenantId: String
  
  /**
    * The username of the logged in account.
    */
  var username: String
}
object AuthenticationRecord {
  
  inline def apply(authority: String, clientId: String, homeAccountId: String, tenantId: String, username: String): AuthenticationRecord = {
    val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], homeAccountId = homeAccountId.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationRecord]
  }
  
  extension [Self <: AuthenticationRecord](x: Self) {
    
    inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setHomeAccountId(value: String): Self = StObject.set(x, "homeAccountId", value.asInstanceOf[js.Any])
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
