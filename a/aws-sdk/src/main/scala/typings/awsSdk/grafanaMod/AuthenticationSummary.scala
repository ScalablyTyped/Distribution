package typings.awsSdk.grafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationSummary extends StObject {
  
  /**
    * Specifies whether the workspace uses SAML, Amazon Web Services SSO, or both methods for user authentication.
    */
  var providers: AuthenticationProviders
  
  /**
    * Specifies whether the workplace's user authentication method is fully configured.
    */
  var samlConfigurationStatus: js.UndefOr[SamlConfigurationStatus] = js.undefined
}
object AuthenticationSummary {
  
  inline def apply(providers: AuthenticationProviders): AuthenticationSummary = {
    val __obj = js.Dynamic.literal(providers = providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationSummary]
  }
  
  extension [Self <: AuthenticationSummary](x: Self) {
    
    inline def setProviders(value: AuthenticationProviders): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersVarargs(value: AuthenticationProviderTypes*): Self = StObject.set(x, "providers", js.Array(value*))
    
    inline def setSamlConfigurationStatus(value: SamlConfigurationStatus): Self = StObject.set(x, "samlConfigurationStatus", value.asInstanceOf[js.Any])
    
    inline def setSamlConfigurationStatusUndefined: Self = StObject.set(x, "samlConfigurationStatus", js.undefined)
  }
}
