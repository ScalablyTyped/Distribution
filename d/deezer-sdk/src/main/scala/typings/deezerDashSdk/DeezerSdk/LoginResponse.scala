package typings.deezerDashSdk.DeezerSdk

import typings.deezerDashSdk.Anon_AccessToken
import typings.deezerDashSdk.deezerDashSdkStrings.connected
import typings.deezerDashSdk.deezerDashSdkStrings.not_authorized
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/login | DZ.login}
  */
trait LoginResponse extends js.Object {
  var authResponse: Anon_AccessToken
  var status: connected | not_authorized
  var userID: String
}

object LoginResponse {
  @scala.inline
  def apply(authResponse: Anon_AccessToken, status: connected | not_authorized, userID: String): LoginResponse = {
    val __obj = js.Dynamic.literal(authResponse = authResponse.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LoginResponse]
  }
}

