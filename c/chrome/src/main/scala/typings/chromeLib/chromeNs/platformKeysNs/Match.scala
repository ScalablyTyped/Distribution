package typings
package chromeLib.chromeNs.platformKeysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Match extends js.Object {
  /** The DER encoding of a X.509 certificate. */
  var certificate: stdLib.ArrayBuffer
  /** The  KeyAlgorithm of the certified key. This contains algorithm parameters that are inherent to the key of the certificate (e.g. the key length). Other parameters like the hash function used by the sign function are not included. */
  var keyAlgorithm: stdLib.KeyAlgorithm
}

