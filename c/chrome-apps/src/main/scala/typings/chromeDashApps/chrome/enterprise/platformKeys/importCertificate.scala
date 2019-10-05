package typings.chromeDashApps.chrome.enterprise.platformKeys

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.enterprise.platformKeys.importCertificate")
@js.native
object importCertificate extends js.Object {
  /**
    * Imports certificate to the given token if the certified key is already stored in this token.
    * After a successful certification request, this function should be used to store the obtained
    * certificate and to make it available to the operating system and browser for authentication.
    * @param tokenId The id of a Token returned by getTokens.
    * @param certificate The DER encoding of a X.509 certificate.
    * @param [callback] Called back when this operation is finished.
    */
  def apply(tokenId: String, certificate: ArrayBuffer, callback: js.Function0[Unit]): Unit = js.native
}

