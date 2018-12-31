package typings
package davLib.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dav", "Credentials")
@js.native
class Credentials () extends js.Object {
  def this(options: CredentialsOptions) = this()
  /**
    * oauth access token.
    */
  var accessToken: java.lang.String = js.native
  /**
    * oauth code.
    */
  var authorizationCode: java.lang.String = js.native
  /**
    * oauth client id.
    */
  var clientId: java.lang.String = js.native
  /**
    * oauth client secret.
    */
  var clientSecret: java.lang.String = js.native
  /**
    * unix time for access token expiration.
    */
  var expiration: scala.Double = js.native
  /**
    * plaintext password for calendar user.
    */
  var password: java.lang.String = js.native
  /**
    * oauth redirect url.
    */
  var redirectUrl: java.lang.String = js.native
  /**
    * oauth refresh token.
    */
  var refreshToken: java.lang.String = js.native
  /**
    * oauth token url.
    */
  var tokenUrl: java.lang.String = js.native
  /**
    * username (perhaps email) for calendar user.
    */
  var username: java.lang.String = js.native
}

