package typings
package cordovaDashPluginDashMsDashAdalLib.MicrosoftNs.ADALNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenCacheItem extends js.Object {
  var accessToken: java.lang.String
  var authority: java.lang.String
  var clientId: java.lang.String
  var displayableId: java.lang.String
  var expiresOn: stdLib.Date
  var isMultipleResourceRefreshToken: scala.Boolean
  var resource: java.lang.String
  var tenantId: java.lang.String
  var userInfo: UserInfo
}

object TokenCacheItem {
  @scala.inline
  def apply(
    accessToken: java.lang.String,
    authority: java.lang.String,
    clientId: java.lang.String,
    displayableId: java.lang.String,
    expiresOn: stdLib.Date,
    isMultipleResourceRefreshToken: scala.Boolean,
    resource: java.lang.String,
    tenantId: java.lang.String,
    userInfo: UserInfo
  ): TokenCacheItem = {
    val __obj = js.Dynamic.literal(accessToken = accessToken, authority = authority, clientId = clientId, displayableId = displayableId, expiresOn = expiresOn, isMultipleResourceRefreshToken = isMultipleResourceRefreshToken, resource = resource, tenantId = tenantId, userInfo = userInfo)
  
    __obj.asInstanceOf[TokenCacheItem]
  }
}

