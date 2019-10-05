package typings.chromeDashApps.chrome.enterprise.platformKeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.enterprise.platformKeys.getTokens")
@js.native
object getTokens extends js.Object {
  /**
    * Returns the available Tokens.
    * In a regular user's session the list will always contain the user's token with id 'user'.
    * If a system-wide TPM token is available, the returned list will also contain the system-wide token with id 'system'.
    * The system-wide token will be the same for all sessions on this device (device in the sense of e.g. a Chromebook).
    * @param callback Invoked by getTokens with the list of available Tokens.
    */
  def apply(callback: js.Function1[/* tokens */ js.Array[Token], Unit]): Unit = js.native
}

