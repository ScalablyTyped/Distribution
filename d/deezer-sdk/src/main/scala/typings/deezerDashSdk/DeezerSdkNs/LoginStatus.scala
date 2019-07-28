package typings.deezerDashSdk.DeezerSdkNs

import typings.deezerDashSdk.Anon_AccessTokenExpire
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/getloginstatus | DZ.getLoginStatus}
  */
trait LoginStatus extends js.Object {
  var authResponse: Anon_AccessTokenExpire
  var status: ConnectionStatus
}

object LoginStatus {
  @scala.inline
  def apply(authResponse: Anon_AccessTokenExpire, status: ConnectionStatus): LoginStatus = {
    val __obj = js.Dynamic.literal(authResponse = authResponse, status = status)
  
    __obj.asInstanceOf[LoginStatus]
  }
}

