package typings.chromeApps.chrome.platformKeys

import typings.std.ArrayBuffer
import typings.std.KeyAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Match extends js.Object {
  /** The DER encoding of a X.509 certificate. */
  var certificate: ArrayBuffer
  /**
    * @see[KeyAlgorithm]{@link http://www.w3.org/TR/WebCryptoAPI/#key-algorithm-interface}
    * @description
    * The KeyAlgorithm of the certified key. This contains algorithm
    * parameters that are inherent to the key of the certificate (e.g. the key
    * length). Other parameters like the hash function used by the sign
    * function are not included. */
  var keyAlgorithm: KeyAlgorithm
}

object Match {
  @scala.inline
  def apply(certificate: ArrayBuffer, keyAlgorithm: KeyAlgorithm): Match = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], keyAlgorithm = keyAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Match]
  }
}

