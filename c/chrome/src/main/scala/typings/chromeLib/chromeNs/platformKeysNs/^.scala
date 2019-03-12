package typings
package chromeLib.chromeNs.platformKeysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.platformKeys")
@js.native
object ^ extends js.Object {
  def getKeyPair(
    certificate: stdLib.ArrayBuffer,
    parameters: js.Object,
    callback: js.Function2[
      /* publicKey */ stdLib.CryptoKey, 
      /* privateKey */ stdLib.CryptoKey | scala.Null, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def selectClientCertificates(
    details: ClientCertificateSelectDetails,
    callback: js.Function1[/* matches */ js.Array[Match], scala.Unit]
  ): scala.Unit = js.native
  def subtleCrypto(): stdLib.SubtleCrypto = js.native
  def verifyTLSServerCertificate(
    details: ServerCertificateVerificationDetails,
    callback: js.Function1[/* result */ ServerCertificateVerificationResult, scala.Unit]
  ): scala.Unit = js.native
}

