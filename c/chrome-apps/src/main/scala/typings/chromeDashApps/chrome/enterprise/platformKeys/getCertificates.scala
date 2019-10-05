package typings.chromeDashApps.chrome.enterprise.platformKeys

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.enterprise.platformKeys.getCertificates")
@js.native
object getCertificates extends js.Object {
  /**
    * Returns the list of all client certificates available from the given token.
    * Can be used to check for the existence and expiration of client certificates that are usable for a certain authentication.
    * @param tokenId The id of a Token returned by getTokens.
    * @param callback Called back with the list of the available certificates.
    */
  def apply(tokenId: String, callback: js.Function1[/* certificates */ js.Array[ArrayBuffer], Unit]): Unit = js.native
}

