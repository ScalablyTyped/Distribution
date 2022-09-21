package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractiveBrowserCredentialInBrowserOptions
  extends StObject
     with InteractiveCredentialOptions {
  
  /**
    * The client (application) ID of an App Registration in the tenant.
    * This parameter is required on the browser.
    */
  var clientId: String
  
  /**
    * loginHint allows a user name to be pre-selected for interactive logins.
    * Setting this option skips the account selection prompt and immediately attempts to login with the specified account.
    */
  var loginHint: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether a redirect or a popup window should be used to
    * initiate the user authentication flow. Possible values are "redirect"
    * or "popup" (default) for browser and "popup" (default) for node.
    *
    */
  var loginStyle: js.UndefOr[BrowserLoginStyle] = js.undefined
  
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
object InteractiveBrowserCredentialInBrowserOptions {
  
  inline def apply(clientId: String): InteractiveBrowserCredentialInBrowserOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveBrowserCredentialInBrowserOptions]
  }
  
  extension [Self <: InteractiveBrowserCredentialInBrowserOptions](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
    
    inline def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
    
    inline def setLoginStyle(value: BrowserLoginStyle): Self = StObject.set(x, "loginStyle", value.asInstanceOf[js.Any])
    
    inline def setLoginStyleUndefined: Self = StObject.set(x, "loginStyle", js.undefined)
    
    inline def setRedirectUri(value: String | js.Function0[String]): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriFunction0(value: () => String): Self = StObject.set(x, "redirectUri", js.Any.fromFunction0(value))
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
