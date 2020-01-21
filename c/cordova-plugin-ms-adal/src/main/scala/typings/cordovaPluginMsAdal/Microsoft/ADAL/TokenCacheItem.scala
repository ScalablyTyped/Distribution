package typings.cordovaPluginMsAdal.Microsoft.ADAL

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenCacheItem extends js.Object {
  var accessToken: String
  var authority: String
  var clientId: String
  var displayableId: String
  var expiresOn: Date
  var isMultipleResourceRefreshToken: Boolean
  var resource: String
  var tenantId: String
  var userInfo: UserInfo
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
}

