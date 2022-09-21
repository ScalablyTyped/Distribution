package typings.dav.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dav", "Credentials")
@js.native
open class Credentials () extends StObject {
  def this(options: CredentialsOptions) = this()
  
  /**
    * oauth access token.
    */
  var accessToken: String = js.native
  
  /**
    * oauth code.
    */
  var authorizationCode: String = js.native
  
  /**
    * oauth client id.
    */
  var clientId: String = js.native
  
  /**
    * oauth client secret.
    */
  var clientSecret: String = js.native
  
  /**
    * unix time for access token expiration.
    */
  var expiration: Double = js.native
  
  /**
    * plaintext password for calendar user.
    */
  var password: String = js.native
  
  /**
    * oauth redirect url.
    */
  var redirectUrl: String = js.native
  
  /**
    * oauth refresh token.
    */
  var refreshToken: String = js.native
  
  /**
    * oauth token url.
    */
  var tokenUrl: String = js.native
  
  /**
    * username (perhaps email) for calendar user.
    */
  var username: String = js.native
}
