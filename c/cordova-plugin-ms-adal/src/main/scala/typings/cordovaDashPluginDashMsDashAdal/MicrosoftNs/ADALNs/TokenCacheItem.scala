package typings.cordovaDashPluginDashMsDashAdal.MicrosoftNs.ADALNs

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
    val __obj = js.Dynamic.literal(accessToken = accessToken, authority = authority, clientId = clientId, displayableId = displayableId, expiresOn = expiresOn, isMultipleResourceRefreshToken = isMultipleResourceRefreshToken, resource = resource, tenantId = tenantId, userInfo = userInfo)
  
    __obj.asInstanceOf[TokenCacheItem]
  }
}

