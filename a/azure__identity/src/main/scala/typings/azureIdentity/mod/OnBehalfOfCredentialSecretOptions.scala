package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBehalfOfCredentialSecretOptions extends StObject {
  
  /**
    * The client (application) ID of an App Registration in the tenant.
    */
  var clientId: String
  
  /**
    * A client secret that was generated for the App Registration.
    */
  var clientSecret: String
  
  /**
    * The Azure Active Directory tenant (directory) ID.
    */
  var tenantId: String
  
  /**
    * The user assertion for the On-Behalf-Of flow.
    */
  var userAssertionToken: String
}
object OnBehalfOfCredentialSecretOptions {
  
  inline def apply(clientId: String, clientSecret: String, tenantId: String, userAssertionToken: String): OnBehalfOfCredentialSecretOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], userAssertionToken = userAssertionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBehalfOfCredentialSecretOptions]
  }
  
  extension [Self <: OnBehalfOfCredentialSecretOptions](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setUserAssertionToken(value: String): Self = StObject.set(x, "userAssertionToken", value.asInstanceOf[js.Any])
  }
}
