package typings.azureMsalNode

import typings.azureMsalCommon.distAccountAccountInfoMod.AccountInfo
import typings.azureMsalCommon.distConfigClientConfigurationMod.AzureCloudOptions
import typings.azureMsalCommon.distUtilsConstantsMod.AuthenticationScheme
import typings.azureMsalCommon.distUtilsMsalTypesMod.StringDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRequestSilentFlowRequestMod {
  
  /* Inlined std.Partial<std.Omit<@azure/msal-common.@azure/msal-common.CommonSilentFlowRequest, 'account' | 'scopes' | 'resourceRequestMethod' | 'resourceRequestUri' | 'requestedClaimsHash'>> & {  account :@azure/msal-common.@azure/msal-common.AccountInfo,   scopes :std.Array<string>} */
  trait SilentFlowRequest extends StObject {
    
    var account: AccountInfo
    
    var authenticationScheme: js.UndefOr[AuthenticationScheme] = js.undefined
    
    var authority: js.UndefOr[String] = js.undefined
    
    var azureCloudOptions: js.UndefOr[AzureCloudOptions] = js.undefined
    
    var claims: js.UndefOr[String] = js.undefined
    
    var correlationId: js.UndefOr[String] = js.undefined
    
    var forceRefresh: js.UndefOr[Boolean] = js.undefined
    
    var scopes: js.Array[String]
    
    var shrClaims: js.UndefOr[String] = js.undefined
    
    var shrNonce: js.UndefOr[String] = js.undefined
    
    var sshJwk: js.UndefOr[String] = js.undefined
    
    var sshKid: js.UndefOr[String] = js.undefined
    
    var tokenQueryParameters: js.UndefOr[StringDict] = js.undefined
  }
  object SilentFlowRequest {
    
    inline def apply(account: AccountInfo, scopes: js.Array[String]): SilentFlowRequest = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[SilentFlowRequest]
    }
    
    extension [Self <: SilentFlowRequest](x: Self) {
      
      inline def setAccount(value: AccountInfo): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationScheme(value: AuthenticationScheme): Self = StObject.set(x, "authenticationScheme", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationSchemeUndefined: Self = StObject.set(x, "authenticationScheme", js.undefined)
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
      
      inline def setAzureCloudOptions(value: AzureCloudOptions): Self = StObject.set(x, "azureCloudOptions", value.asInstanceOf[js.Any])
      
      inline def setAzureCloudOptionsUndefined: Self = StObject.set(x, "azureCloudOptions", js.undefined)
      
      inline def setClaims(value: String): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
      
      inline def setForceRefresh(value: Boolean): Self = StObject.set(x, "forceRefresh", value.asInstanceOf[js.Any])
      
      inline def setForceRefreshUndefined: Self = StObject.set(x, "forceRefresh", js.undefined)
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setShrClaims(value: String): Self = StObject.set(x, "shrClaims", value.asInstanceOf[js.Any])
      
      inline def setShrClaimsUndefined: Self = StObject.set(x, "shrClaims", js.undefined)
      
      inline def setShrNonce(value: String): Self = StObject.set(x, "shrNonce", value.asInstanceOf[js.Any])
      
      inline def setShrNonceUndefined: Self = StObject.set(x, "shrNonce", js.undefined)
      
      inline def setSshJwk(value: String): Self = StObject.set(x, "sshJwk", value.asInstanceOf[js.Any])
      
      inline def setSshJwkUndefined: Self = StObject.set(x, "sshJwk", js.undefined)
      
      inline def setSshKid(value: String): Self = StObject.set(x, "sshKid", value.asInstanceOf[js.Any])
      
      inline def setSshKidUndefined: Self = StObject.set(x, "sshKid", js.undefined)
      
      inline def setTokenQueryParameters(value: StringDict): Self = StObject.set(x, "tokenQueryParameters", value.asInstanceOf[js.Any])
      
      inline def setTokenQueryParametersUndefined: Self = StObject.set(x, "tokenQueryParameters", js.undefined)
    }
  }
}
