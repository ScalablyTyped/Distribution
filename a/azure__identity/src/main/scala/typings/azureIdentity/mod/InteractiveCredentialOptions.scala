package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractiveCredentialOptions
  extends StObject
     with MultiTenantTokenCredentialOptions {
  
  /**
    * Result of a previous authentication that can be used to retrieve the cached credentials of each individual account.
    * This is necessary to provide in case the application wants to work with more than one account per
    * Client ID and Tenant ID pair.
    *
    * This record can be retrieved by calling to the credential's `authenticate()` method, as follows:
    *
    *     const authenticationRecord = await credential.authenticate();
    *
    */
  var authenticationRecord: js.UndefOr[AuthenticationRecord] = js.undefined
  
  /**
    * Makes getToken throw if a manual authentication is necessary.
    * Developers will need to call to `authenticate()` to control when to manually authenticate.
    */
  var disableAutomaticAuthentication: js.UndefOr[Boolean] = js.undefined
}
object InteractiveCredentialOptions {
  
  inline def apply(): InteractiveCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractiveCredentialOptions]
  }
  
  extension [Self <: InteractiveCredentialOptions](x: Self) {
    
    inline def setAuthenticationRecord(value: AuthenticationRecord): Self = StObject.set(x, "authenticationRecord", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationRecordUndefined: Self = StObject.set(x, "authenticationRecord", js.undefined)
    
    inline def setDisableAutomaticAuthentication(value: Boolean): Self = StObject.set(x, "disableAutomaticAuthentication", value.asInstanceOf[js.Any])
    
    inline def setDisableAutomaticAuthenticationUndefined: Self = StObject.set(x, "disableAutomaticAuthentication", js.undefined)
  }
}
