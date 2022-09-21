package typings.azureMsalNode

import typings.azureMsalCommon.azureRegionMod.AzureRegion
import typings.azureMsalCommon.clientConfigurationMod.AzureCloudOptions
import typings.azureMsalCommon.constantsMod.AuthenticationScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientCredentialRequestMod {
  
  /* Inlined std.Partial<std.Omit<@azure/msal-common.@azure/msal-common.CommonClientCredentialRequest, 'scopes' | 'resourceRequestMethod' | 'resourceRequestUri' | 'requestedClaimsHash' | 'clientAssertion'>> & {  scopes :std.Array<string>,   clientAssertion :string | undefined} */
  trait ClientCredentialRequest extends StObject {
    
    var authenticationScheme: js.UndefOr[AuthenticationScheme] = js.undefined
    
    var authority: js.UndefOr[String] = js.undefined
    
    var azureCloudOptions: js.UndefOr[AzureCloudOptions] = js.undefined
    
    var azureRegion: js.UndefOr[AzureRegion] = js.undefined
    
    var claims: js.UndefOr[String] = js.undefined
    
    var clientAssertion: js.UndefOr[String] = js.undefined
    
    var correlationId: js.UndefOr[String] = js.undefined
    
    var scopes: js.Array[String]
    
    var shrClaims: js.UndefOr[String] = js.undefined
    
    var shrNonce: js.UndefOr[String] = js.undefined
    
    var skipCache: js.UndefOr[Boolean] = js.undefined
    
    var sshJwk: js.UndefOr[String] = js.undefined
    
    var sshKid: js.UndefOr[String] = js.undefined
  }
  object ClientCredentialRequest {
    
    inline def apply(scopes: js.Array[String]): ClientCredentialRequest = {
      val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientCredentialRequest]
    }
    
    extension [Self <: ClientCredentialRequest](x: Self) {
      
      inline def setAuthenticationScheme(value: AuthenticationScheme): Self = StObject.set(x, "authenticationScheme", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationSchemeUndefined: Self = StObject.set(x, "authenticationScheme", js.undefined)
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
      
      inline def setAzureCloudOptions(value: AzureCloudOptions): Self = StObject.set(x, "azureCloudOptions", value.asInstanceOf[js.Any])
      
      inline def setAzureCloudOptionsUndefined: Self = StObject.set(x, "azureCloudOptions", js.undefined)
      
      inline def setAzureRegion(value: AzureRegion): Self = StObject.set(x, "azureRegion", value.asInstanceOf[js.Any])
      
      inline def setAzureRegionUndefined: Self = StObject.set(x, "azureRegion", js.undefined)
      
      inline def setClaims(value: String): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setClientAssertion(value: String): Self = StObject.set(x, "clientAssertion", value.asInstanceOf[js.Any])
      
      inline def setClientAssertionUndefined: Self = StObject.set(x, "clientAssertion", js.undefined)
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setShrClaims(value: String): Self = StObject.set(x, "shrClaims", value.asInstanceOf[js.Any])
      
      inline def setShrClaimsUndefined: Self = StObject.set(x, "shrClaims", js.undefined)
      
      inline def setShrNonce(value: String): Self = StObject.set(x, "shrNonce", value.asInstanceOf[js.Any])
      
      inline def setShrNonceUndefined: Self = StObject.set(x, "shrNonce", js.undefined)
      
      inline def setSkipCache(value: Boolean): Self = StObject.set(x, "skipCache", value.asInstanceOf[js.Any])
      
      inline def setSkipCacheUndefined: Self = StObject.set(x, "skipCache", js.undefined)
      
      inline def setSshJwk(value: String): Self = StObject.set(x, "sshJwk", value.asInstanceOf[js.Any])
      
      inline def setSshJwkUndefined: Self = StObject.set(x, "sshJwk", js.undefined)
      
      inline def setSshKid(value: String): Self = StObject.set(x, "sshKid", value.asInstanceOf[js.Any])
      
      inline def setSshKidUndefined: Self = StObject.set(x, "sshKid", js.undefined)
    }
  }
}
