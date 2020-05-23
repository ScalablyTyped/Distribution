package typings.cordovaPluginMsAdal.Microsoft.ADAL

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationResult extends js.Object {
  var accessToken: String
  var accessTokenType: String
  var expiresOn: Date
  var idToken: String
  var isMultipleResourceRefreshToken: Boolean
  var status: String
  var statusCode: String
  var tenantId: String
  var userInfo: UserInfo
  /**
    * Creates authorization header for web requests.
    *
    * @returns {String} The authorization header.
    */
  def createAuthorizationHeader(): String
}

object AuthenticationResult {
  @scala.inline
  def apply(
    accessToken: String,
    accessTokenType: String,
    createAuthorizationHeader: () => String,
    expiresOn: Date,
    idToken: String,
    isMultipleResourceRefreshToken: Boolean,
    status: String,
    statusCode: String,
    tenantId: String,
    userInfo: UserInfo
  ): AuthenticationResult = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], accessTokenType = accessTokenType.asInstanceOf[js.Any], createAuthorizationHeader = js.Any.fromFunction0(createAuthorizationHeader), expiresOn = expiresOn.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any], isMultipleResourceRefreshToken = isMultipleResourceRefreshToken.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationResult]
  }
}

