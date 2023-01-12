package typings.azureIdentity.mod

import typings.azureCoreClient.mod.CommonClientOptions
import typings.azureIdentity.anon.LogPolicyOptionsallowLogg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenCredentialOptions
  extends StObject
     with CommonClientOptions {
  
  /**
    * The authority host to use for authentication requests.
    * Possible values are available through {@link AzureAuthorityHosts}.
    * The default is "https://login.microsoftonline.com".
    */
  var authorityHost: js.UndefOr[String] = js.undefined
  
  /**
    * Allows logging account information once the authentication flow succeeds.
    */
  var loggingOptions: js.UndefOr[LogPolicyOptionsallowLogg] = js.undefined
}
object TokenCredentialOptions {
  
  inline def apply(): TokenCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenCredentialOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TokenCredentialOptions] (val x: Self) extends AnyVal {
    
    inline def setAuthorityHost(value: String): Self = StObject.set(x, "authorityHost", value.asInstanceOf[js.Any])
    
    inline def setAuthorityHostUndefined: Self = StObject.set(x, "authorityHost", js.undefined)
    
    inline def setLoggingOptions(value: LogPolicyOptionsallowLogg): Self = StObject.set(x, "loggingOptions", value.asInstanceOf[js.Any])
    
    inline def setLoggingOptionsUndefined: Self = StObject.set(x, "loggingOptions", js.undefined)
  }
}
