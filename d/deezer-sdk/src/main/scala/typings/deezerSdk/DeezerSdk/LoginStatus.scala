package typings.deezerSdk.DeezerSdk

import typings.deezerSdk.AnonExpire
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/getloginstatus | DZ.getLoginStatus}
  */
trait LoginStatus extends js.Object {
  var authResponse: AnonExpire
  var status: ConnectionStatus
}

object LoginStatus {
  @scala.inline
  def apply(authResponse: AnonExpire, status: ConnectionStatus): LoginStatus = {
    val __obj = js.Dynamic.literal(authResponse = authResponse.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LoginStatus]
  }
}

