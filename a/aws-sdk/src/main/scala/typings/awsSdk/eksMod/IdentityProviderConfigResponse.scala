package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityProviderConfigResponse extends StObject {
  
  /**
    * An object representing an OpenID Connect (OIDC) identity provider configuration.
    */
  var oidc: js.UndefOr[OidcIdentityProviderConfig] = js.undefined
}
object IdentityProviderConfigResponse {
  
  inline def apply(): IdentityProviderConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProviderConfigResponse]
  }
  
  extension [Self <: IdentityProviderConfigResponse](x: Self) {
    
    inline def setOidc(value: OidcIdentityProviderConfig): Self = StObject.set(x, "oidc", value.asInstanceOf[js.Any])
    
    inline def setOidcUndefined: Self = StObject.set(x, "oidc", js.undefined)
  }
}
