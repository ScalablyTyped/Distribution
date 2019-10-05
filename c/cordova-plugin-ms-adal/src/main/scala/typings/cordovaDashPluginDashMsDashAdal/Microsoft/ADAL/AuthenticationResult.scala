package typings.cordovaDashPluginDashMsDashAdal.Microsoft.ADAL

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ADAL.AuthenticationResult")
@js.native
class AuthenticationResult () extends js.Object {
  var accessToken: String = js.native
  var accessTokenType: String = js.native
  var expiresOn: Date = js.native
  var idToken: String = js.native
  var isMultipleResourceRefreshToken: Boolean = js.native
  var status: String = js.native
  var statusCode: String = js.native
  var tenantId: String = js.native
  var userInfo: UserInfo = js.native
  /**
    * Creates authorization header for web requests.
    *
    * @returns {String} The authorization header.
    */
  def createAuthorizationHeader(): String = js.native
}

