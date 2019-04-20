package typings
package deezerDashSdkLib.DeezerSdkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/getloginstatus | DZ.getLoginStatus}
  */
trait LoginStatus extends js.Object {
  var authResponse: deezerDashSdkLib.Anon_AccessTokenExpire
  var status: ConnectionStatus
}

object LoginStatus {
  @scala.inline
  def apply(authResponse: deezerDashSdkLib.Anon_AccessTokenExpire, status: ConnectionStatus): LoginStatus = {
    val __obj = js.Dynamic.literal(authResponse = authResponse, status = status)
  
    __obj.asInstanceOf[LoginStatus]
  }
}

