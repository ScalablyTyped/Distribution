package typings.chrome.chromeNs.platformKeysNs

import typings.std.ArrayBuffer
import typings.std.CryptoKey
import typings.std.SubtleCrypto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.platformKeys")
@js.native
object ^ extends js.Object {
  def getKeyPair(
    certificate: ArrayBuffer,
    parameters: js.Object,
    callback: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]
  ): Unit = js.native
  def selectClientCertificates(
    details: ClientCertificateSelectDetails,
    callback: js.Function1[/* matches */ js.Array[Match], Unit]
  ): Unit = js.native
  def subtleCrypto(): SubtleCrypto = js.native
  def verifyTLSServerCertificate(
    details: ServerCertificateVerificationDetails,
    callback: js.Function1[/* result */ ServerCertificateVerificationResult, Unit]
  ): Unit = js.native
}

