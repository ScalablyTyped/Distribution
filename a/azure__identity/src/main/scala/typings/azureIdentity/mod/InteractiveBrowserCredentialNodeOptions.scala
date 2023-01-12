package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractiveBrowserCredentialNodeOptions
  extends StObject
     with InteractiveCredentialOptions
     with CredentialPersistenceOptions {
  
  /**
    * The client (application) ID of an App Registration in the tenant.
    */
  var clientId: js.UndefOr[String] = js.undefined
  
  /**
    * loginHint allows a user name to be pre-selected for interactive logins.
    * Setting this option skips the account selection prompt and immediately attempts to login with the specified account.
    */
  var loginHint: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the redirect URI of the application. This should be same as the value
    * in the application registration portal.  Defaults to `window.location.href`.
    */
  var redirectUri: js.UndefOr[String | js.Function0[String]] = js.undefined
  
  /**
    * The Azure Active Directory tenant (directory) ID.
    */
  var tenantId: js.UndefOr[String] = js.undefined
}
object InteractiveBrowserCredentialNodeOptions {
  
  inline def apply(): InteractiveBrowserCredentialNodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractiveBrowserCredentialNodeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InteractiveBrowserCredentialNodeOptions] (val x: Self) extends AnyVal {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
    
    inline def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
    
    inline def setRedirectUri(value: String | js.Function0[String]): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriFunction0(value: () => String): Self = StObject.set(x, "redirectUri", js.Any.fromFunction0(value))
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
