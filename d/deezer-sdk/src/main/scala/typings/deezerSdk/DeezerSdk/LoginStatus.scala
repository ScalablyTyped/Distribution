package typings.deezerSdk.DeezerSdk

import typings.deezerSdk.anon.Expire
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/getloginstatus | DZ.getLoginStatus}
  */
trait LoginStatus extends js.Object {
  var authResponse: Expire
  var status: ConnectionStatus
}

object LoginStatus {
  @scala.inline
  def apply(authResponse: Expire, status: ConnectionStatus): LoginStatus = {
    val __obj = js.Dynamic.literal(authResponse = authResponse.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginStatus]
  }
}

