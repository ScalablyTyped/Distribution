package typings.azureMsalBrowser

import typings.azureMsalBrowser.popupWindowAttributesMod.PopupWindowAttributes
import typings.azureMsalCommon.accountInfoMod.AccountInfo
import typings.azureMsalCommon.msalTypesMod.StringDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endSessionPopupRequestMod {
  
  /* Inlined std.Partial<@azure/msal-common.@azure/msal-common.CommonEndSessionRequest> & {  authority :string | undefined,   mainWindowRedirectUri :string | undefined,   popupWindowAttributes :@azure/msal-browser.@azure/msal-browser/dist/request/PopupWindowAttributes.PopupWindowAttributes | undefined} */
  trait EndSessionPopupRequest extends StObject {
    
    var account: js.UndefOr[AccountInfo | Null] = js.undefined
    
    var authority: js.UndefOr[String] = js.undefined
    
    var correlationId: js.UndefOr[String] = js.undefined
    
    var extraQueryParameters: js.UndefOr[StringDict] = js.undefined
    
    var idTokenHint: js.UndefOr[String] = js.undefined
    
    var logoutHint: js.UndefOr[String] = js.undefined
    
    var mainWindowRedirectUri: js.UndefOr[String] = js.undefined
    
    var popupWindowAttributes: js.UndefOr[PopupWindowAttributes] = js.undefined
    
    var postLogoutRedirectUri: js.UndefOr[String | Null] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
  }
  object EndSessionPopupRequest {
    
    inline def apply(): EndSessionPopupRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndSessionPopupRequest]
    }
    
    extension [Self <: EndSessionPopupRequest](x: Self) {
      
      inline def setAccount(value: AccountInfo): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setAccountNull: Self = StObject.set(x, "account", null)
      
      inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
      
      inline def setExtraQueryParameters(value: StringDict): Self = StObject.set(x, "extraQueryParameters", value.asInstanceOf[js.Any])
      
      inline def setExtraQueryParametersUndefined: Self = StObject.set(x, "extraQueryParameters", js.undefined)
      
      inline def setIdTokenHint(value: String): Self = StObject.set(x, "idTokenHint", value.asInstanceOf[js.Any])
      
      inline def setIdTokenHintUndefined: Self = StObject.set(x, "idTokenHint", js.undefined)
      
      inline def setLogoutHint(value: String): Self = StObject.set(x, "logoutHint", value.asInstanceOf[js.Any])
      
      inline def setLogoutHintUndefined: Self = StObject.set(x, "logoutHint", js.undefined)
      
      inline def setMainWindowRedirectUri(value: String): Self = StObject.set(x, "mainWindowRedirectUri", value.asInstanceOf[js.Any])
      
      inline def setMainWindowRedirectUriUndefined: Self = StObject.set(x, "mainWindowRedirectUri", js.undefined)
      
      inline def setPopupWindowAttributes(value: PopupWindowAttributes): Self = StObject.set(x, "popupWindowAttributes", value.asInstanceOf[js.Any])
      
      inline def setPopupWindowAttributesUndefined: Self = StObject.set(x, "popupWindowAttributes", js.undefined)
      
      inline def setPostLogoutRedirectUri(value: String): Self = StObject.set(x, "postLogoutRedirectUri", value.asInstanceOf[js.Any])
      
      inline def setPostLogoutRedirectUriNull: Self = StObject.set(x, "postLogoutRedirectUri", null)
      
      inline def setPostLogoutRedirectUriUndefined: Self = StObject.set(x, "postLogoutRedirectUri", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
