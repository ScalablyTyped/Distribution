package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIdentityProviderConfigResponse extends StObject {
  
  /**
    * The object that represents an OpenID Connect (OIDC) identity provider configuration.
    */
  var identityProviderConfig: js.UndefOr[IdentityProviderConfigResponse] = js.undefined
}
object DescribeIdentityProviderConfigResponse {
  
  inline def apply(): DescribeIdentityProviderConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIdentityProviderConfigResponse]
  }
  
  extension [Self <: DescribeIdentityProviderConfigResponse](x: Self) {
    
    inline def setIdentityProviderConfig(value: IdentityProviderConfigResponse): Self = StObject.set(x, "identityProviderConfig", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderConfigUndefined: Self = StObject.set(x, "identityProviderConfig", js.undefined)
  }
}
