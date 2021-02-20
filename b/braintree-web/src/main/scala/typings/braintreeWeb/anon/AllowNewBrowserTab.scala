package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowNewBrowserTab extends StObject {
  
  var allowNewBrowserTab: js.UndefOr[Boolean] = js.native
  
  var authorization: js.UndefOr[String] = js.native
  
  var client: js.UndefOr[typings.braintreeWeb.clientMod.Client] = js.native
  
  var deepLinkReturnUrl: js.UndefOr[String] = js.native
  
  var ignoreHistoryChanges: js.UndefOr[Boolean] = js.native
  
  var profileId: js.UndefOr[String] = js.native
}
object AllowNewBrowserTab {
  
  @scala.inline
  def apply(): AllowNewBrowserTab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowNewBrowserTab]
  }
  
  @scala.inline
  implicit class AllowNewBrowserTabMutableBuilder[Self <: AllowNewBrowserTab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowNewBrowserTab(value: Boolean): Self = StObject.set(x, "allowNewBrowserTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNewBrowserTabUndefined: Self = StObject.set(x, "allowNewBrowserTab", js.undefined)
    
    @scala.inline
    def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    @scala.inline
    def setClient(value: typings.braintreeWeb.clientMod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    @scala.inline
    def setDeepLinkReturnUrl(value: String): Self = StObject.set(x, "deepLinkReturnUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeepLinkReturnUrlUndefined: Self = StObject.set(x, "deepLinkReturnUrl", js.undefined)
    
    @scala.inline
    def setIgnoreHistoryChanges(value: Boolean): Self = StObject.set(x, "ignoreHistoryChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreHistoryChangesUndefined: Self = StObject.set(x, "ignoreHistoryChanges", js.undefined)
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
  }
}
