package typings.chromeApps.chrome.instanceID

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.instanceID.deleteToken")
@js.native
object deleteToken extends js.Object {
  /**
    * Revokes a granted token.
    * @param deleteTokenParams Parameters for deleteToken.
    * @param callback Function called when the token deletion completes.
    *                 The token was revoked successfully if runtime.lastError is not set.
    */
  def apply(deleteTokenParams: DeleteTokenParams, callback: js.Function0[Unit]): Unit = js.native
}

