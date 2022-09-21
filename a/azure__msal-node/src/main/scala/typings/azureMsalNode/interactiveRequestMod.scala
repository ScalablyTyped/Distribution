package typings.azureMsalNode

import typings.azureMsalCommon.accountInfoMod.AccountInfo
import typings.azureMsalCommon.clientConfigurationMod.AzureCloudOptions
import typings.azureMsalCommon.msalTypesMod.StringDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactiveRequestMod {
  
  /* Inlined std.Pick<@azure/msal-node.@azure/msal-node/dist/request/AuthorizationUrlRequest.AuthorizationUrlRequest, 'authority' | 'correlationId' | 'claims' | 'azureCloudOptions' | 'account' | 'extraQueryParameters' | 'tokenQueryParameters' | 'extraScopesToConsent' | 'loginHint' | 'prompt'> & {openBrowser (url : string): std.Promise<void>,   scopes :std.Array<string> | undefined,   successTemplate :string | undefined,   errorTemplate :string | undefined} */
  trait InteractiveRequest extends StObject {
    
    var account: js.UndefOr[AccountInfo] = js.undefined
    
    var authority: js.UndefOr[String] = js.undefined
    
    var azureCloudOptions: js.UndefOr[AzureCloudOptions] = js.undefined
    
    var claims: js.UndefOr[String] = js.undefined
    
    var correlationId: js.UndefOr[String] = js.undefined
    
    var errorTemplate: js.UndefOr[String] = js.undefined
    
    var extraQueryParameters: js.UndefOr[StringDict] = js.undefined
    
    var extraScopesToConsent: js.UndefOr[js.Array[String]] = js.undefined
    
    var loginHint: js.UndefOr[String] = js.undefined
    
    def openBrowser(url: String): js.Promise[Unit]
    
    var prompt: js.UndefOr[String] = js.undefined
    
    var scopes: js.UndefOr[js.Array[String]] = js.undefined
    
    var successTemplate: js.UndefOr[String] = js.undefined
    
    var tokenQueryParameters: js.UndefOr[StringDict] = js.undefined
  }
  object InteractiveRequest {
    
    inline def apply(openBrowser: String => js.Promise[Unit]): InteractiveRequest = {
      val __obj = js.Dynamic.literal(openBrowser = js.Any.fromFunction1(openBrowser))
      __obj.asInstanceOf[InteractiveRequest]
    }
    
    extension [Self <: InteractiveRequest](x: Self) {
      
      inline def setAccount(value: AccountInfo): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
      
      inline def setAzureCloudOptions(value: AzureCloudOptions): Self = StObject.set(x, "azureCloudOptions", value.asInstanceOf[js.Any])
      
      inline def setAzureCloudOptionsUndefined: Self = StObject.set(x, "azureCloudOptions", js.undefined)
      
      inline def setClaims(value: String): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
      
      inline def setErrorTemplate(value: String): Self = StObject.set(x, "errorTemplate", value.asInstanceOf[js.Any])
      
      inline def setErrorTemplateUndefined: Self = StObject.set(x, "errorTemplate", js.undefined)
      
      inline def setExtraQueryParameters(value: StringDict): Self = StObject.set(x, "extraQueryParameters", value.asInstanceOf[js.Any])
      
      inline def setExtraQueryParametersUndefined: Self = StObject.set(x, "extraQueryParameters", js.undefined)
      
      inline def setExtraScopesToConsent(value: js.Array[String]): Self = StObject.set(x, "extraScopesToConsent", value.asInstanceOf[js.Any])
      
      inline def setExtraScopesToConsentUndefined: Self = StObject.set(x, "extraScopesToConsent", js.undefined)
      
      inline def setExtraScopesToConsentVarargs(value: String*): Self = StObject.set(x, "extraScopesToConsent", js.Array(value*))
      
      inline def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
      
      inline def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
      
      inline def setOpenBrowser(value: String => js.Promise[Unit]): Self = StObject.set(x, "openBrowser", js.Any.fromFunction1(value))
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setSuccessTemplate(value: String): Self = StObject.set(x, "successTemplate", value.asInstanceOf[js.Any])
      
      inline def setSuccessTemplateUndefined: Self = StObject.set(x, "successTemplate", js.undefined)
      
      inline def setTokenQueryParameters(value: StringDict): Self = StObject.set(x, "tokenQueryParameters", value.asInstanceOf[js.Any])
      
      inline def setTokenQueryParametersUndefined: Self = StObject.set(x, "tokenQueryParameters", js.undefined)
    }
  }
}
