package typings.cordovaPluginMsAdal.Microsoft.ADAL

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenCacheItem extends js.Object {
  
  var accessToken: String = js.native
  
  var authority: String = js.native
  
  var clientId: String = js.native
  
  var displayableId: String = js.native
  
  var expiresOn: Date = js.native
  
  var isMultipleResourceRefreshToken: Boolean = js.native
  
  var resource: String = js.native
  
  var tenantId: String = js.native
  
  var userInfo: UserInfo = js.native
}
object TokenCacheItem {
  
  @scala.inline
  def apply(
    accessToken: String,
    authority: String,
    clientId: String,
    displayableId: String,
    expiresOn: Date,
    isMultipleResourceRefreshToken: Boolean,
    resource: String,
    tenantId: String,
    userInfo: UserInfo
  ): TokenCacheItem = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], authority = authority.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], displayableId = displayableId.asInstanceOf[js.Any], expiresOn = expiresOn.asInstanceOf[js.Any], isMultipleResourceRefreshToken = isMultipleResourceRefreshToken.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenCacheItem]
  }
  
  @scala.inline
  implicit class TokenCacheItemOps[Self <: TokenCacheItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthority(value: String): Self = this.set("authority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayableId(value: String): Self = this.set("displayableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresOn(value: Date): Self = this.set("expiresOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMultipleResourceRefreshToken(value: Boolean): Self = this.set("isMultipleResourceRefreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantId(value: String): Self = this.set("tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfo(value: UserInfo): Self = this.set("userInfo", value.asInstanceOf[js.Any])
  }
}
