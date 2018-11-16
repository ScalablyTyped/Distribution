package typings
package chromeLib.chromeNs.platformKeysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ServerCertificateVerificationDetails extends js.Object {
  /** The hostname of the server to verify the certificate for, e.g. the server that presented the serverCertificateChain. */
  var hostname: java.lang.String
  /** Each chain entry must be the DER encoding of a X.509 certificate, the first entry must be the server certificate and each entry must certify the entry preceding it. */
  var serverCertificateChain: js.Array[stdLib.ArrayBuffer]
}

