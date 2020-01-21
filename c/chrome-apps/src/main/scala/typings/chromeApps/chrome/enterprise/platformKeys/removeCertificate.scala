package typings.chromeApps.chrome.enterprise.platformKeys

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.enterprise.platformKeys.removeCertificate")
@js.native
object removeCertificate extends js.Object {
  /**
    * Removes certificate from the given token if present.
    * Should be used to remove obsolete certificates so that they are not
    * considered during authentication and do not clutter the certificate choice.
    * Should be used to free storage in the certificate store.
    * @param tokenId The id of a Token returned by getTokens.
    * @param certificate The DER encoding of a X.509 certificate.
    * @param [callback] Called back when this operation is finished.
    */
  def apply(tokenId: String, certificate: ArrayBuffer, callback: js.Function0[Unit]): Unit = js.native
}

