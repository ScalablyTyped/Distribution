package typings.deezerSdk.DeezerSdk

import typings.deezerSdk.AnonAccessToken_
import typings.deezerSdk.deezerSdkStrings.connected
import typings.deezerSdk.deezerSdkStrings.not_authorized
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/login | DZ.login}
  */
trait LoginResponse extends js.Object {
  var authResponse: AnonAccessToken_
  var status: connected | not_authorized
  var userID: String
}

object LoginResponse {
  @scala.inline
  def apply(authResponse: AnonAccessToken_, status: connected | not_authorized, userID: String): LoginResponse = {
    val __obj = js.Dynamic.literal(authResponse = authResponse.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LoginResponse]
  }
}

