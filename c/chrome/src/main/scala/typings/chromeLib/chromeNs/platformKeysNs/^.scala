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
    details: chromeLib.chromeNs.platformKeysNs.ClientCertificateSelectDetails,
    callback: js.Function1[/* matches */ js.Array[chromeLib.chromeNs.platformKeysNs.Match], scala.Unit]
  ): scala.Unit = js.native
  def subtleCrypto(): stdLib.SubtleCrypto = js.native
  def verifyTLSServerCertificate(
    details: chromeLib.chromeNs.platformKeysNs.ServerCertificateVerificationDetails,
    callback: js.Function1[
      /* result */ chromeLib.chromeNs.platformKeysNs.ServerCertificateVerificationResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

