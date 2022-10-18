package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowNewBrowserTab extends StObject {
  
  var allowNewBrowserTab: js.UndefOr[Boolean] = js.undefined
  
  var authorization: js.UndefOr[String] = js.undefined
  
  var client: js.UndefOr[typings.braintreeWeb.modulesClientMod.Client] = js.undefined
  
  var deepLinkReturnUrl: js.UndefOr[String] = js.undefined
  
  var ignoreHistoryChanges: js.UndefOr[Boolean] = js.undefined
  
  var profileId: js.UndefOr[String] = js.undefined
}
object AllowNewBrowserTab {
  
  inline def apply(): AllowNewBrowserTab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowNewBrowserTab]
  }
  
  extension [Self <: AllowNewBrowserTab](x: Self) {
    
    inline def setAllowNewBrowserTab(value: Boolean): Self = StObject.set(x, "allowNewBrowserTab", value.asInstanceOf[js.Any])
    
    inline def setAllowNewBrowserTabUndefined: Self = StObject.set(x, "allowNewBrowserTab", js.undefined)
    
    inline def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    inline def setClient(value: typings.braintreeWeb.modulesClientMod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setDeepLinkReturnUrl(value: String): Self = StObject.set(x, "deepLinkReturnUrl", value.asInstanceOf[js.Any])
    
    inline def setDeepLinkReturnUrlUndefined: Self = StObject.set(x, "deepLinkReturnUrl", js.undefined)
    
    inline def setIgnoreHistoryChanges(value: Boolean): Self = StObject.set(x, "ignoreHistoryChanges", value.asInstanceOf[js.Any])
    
    inline def setIgnoreHistoryChangesUndefined: Self = StObject.set(x, "ignoreHistoryChanges", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
  }
}
