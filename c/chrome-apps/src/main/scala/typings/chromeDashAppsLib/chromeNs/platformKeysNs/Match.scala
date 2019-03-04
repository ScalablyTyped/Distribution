package typings
package chromeDashAppsLib.chromeNs.platformKeysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Match extends js.Object {
  /** The DER encoding of a X.509 certificate. */
  var certificate: stdLib.ArrayBuffer
  /**
    * @see[KeyAlgorithm]{@link http://www.w3.org/TR/WebCryptoAPI/#key-algorithm-interface}
    * @description
    * The KeyAlgorithm of the certified key. This contains algorithm
    * parameters that are inherent to the key of the certificate (e.g. the key
    * length). Other parameters like the hash function used by the sign
    * function are not included. */
  var keyAlgorithm: stdLib.KeyAlgorithm
}

object Match {
  @scala.inline
  def apply(certificate: stdLib.ArrayBuffer, keyAlgorithm: stdLib.KeyAlgorithm): Match = {
    val __obj = js.Dynamic.literal(certificate = certificate, keyAlgorithm = keyAlgorithm)
  
    __obj.asInstanceOf[Match]
  }
}

