package typings
package cordovaDashPluginDashMsDashAdalLib.MicrosoftNs.ADALNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ADAL.AuthenticationResult")
@js.native
class AuthenticationResult () extends js.Object {
  var accessToken: java.lang.String = js.native
  var accessTokenType: java.lang.String = js.native
  var expiresOn: stdLib.Date = js.native
  var idToken: java.lang.String = js.native
  var isMultipleResourceRefreshToken: scala.Boolean = js.native
  var status: java.lang.String = js.native
  var statusCode: java.lang.String = js.native
  var tenantId: java.lang.String = js.native
  var userInfo: UserInfo = js.native
  /**
              * Creates authorization header for web requests.
              *
              * @returns {String} The authorization header.
              */
  def createAuthorizationHeader(): java.lang.String = js.native
}

