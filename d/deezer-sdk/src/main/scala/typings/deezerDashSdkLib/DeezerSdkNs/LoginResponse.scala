package typings
package deezerDashSdkLib.DeezerSdkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/login | DZ.login}
  */
trait LoginResponse extends js.Object {
  var authResponse: deezerDashSdkLib.Anon_AccessToken
  var status: deezerDashSdkLib.deezerDashSdkLibStrings.connected | deezerDashSdkLib.deezerDashSdkLibStrings.not_authorized
  var userID: java.lang.String
}

object LoginResponse {
  @scala.inline
  def apply(
    authResponse: deezerDashSdkLib.Anon_AccessToken,
    status: deezerDashSdkLib.deezerDashSdkLibStrings.connected | deezerDashSdkLib.deezerDashSdkLibStrings.not_authorized,
    userID: java.lang.String
  ): LoginResponse = {
    val __obj = js.Dynamic.literal(authResponse = authResponse, status = status.asInstanceOf[js.Any], userID = userID)
  
    __obj.asInstanceOf[LoginResponse]
  }
}

