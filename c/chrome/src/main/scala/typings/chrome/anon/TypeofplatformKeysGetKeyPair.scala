package typings.chrome.anon

import typings.chrome.chrome.platformKeys.ClientCertificateSelectDetails
import typings.chrome.chrome.platformKeys.Match
import typings.chrome.chrome.platformKeys.ServerCertificateVerificationDetails
import typings.chrome.chrome.platformKeys.ServerCertificateVerificationResult
import typings.std.ArrayBuffer
import typings.std.CryptoKey
import typings.std.SubtleCrypto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofplatformKeysGetKeyPair extends js.Object {
  def getKeyPair(
    certificate: ArrayBuffer,
    parameters: js.Object,
    callback: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]
  ): Unit
  def selectClientCertificates(
    details: ClientCertificateSelectDetails,
    callback: js.Function1[/* matches */ js.Array[Match], Unit]
  ): Unit
  def subtleCrypto(): SubtleCrypto
  def verifyTLSServerCertificate(
    details: ServerCertificateVerificationDetails,
    callback: js.Function1[/* result */ ServerCertificateVerificationResult, Unit]
  ): Unit
}

object TypeofplatformKeysGetKeyPair {
  @scala.inline
  def apply(
    getKeyPair: (ArrayBuffer, js.Object, js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]) => Unit,
    selectClientCertificates: (ClientCertificateSelectDetails, js.Function1[/* matches */ js.Array[Match], Unit]) => Unit,
    subtleCrypto: () => SubtleCrypto,
    verifyTLSServerCertificate: (ServerCertificateVerificationDetails, js.Function1[/* result */ ServerCertificateVerificationResult, Unit]) => Unit
  ): TypeofplatformKeysGetKeyPair = {
    val __obj = js.Dynamic.literal(getKeyPair = js.Any.fromFunction3(getKeyPair), selectClientCertificates = js.Any.fromFunction2(selectClientCertificates), subtleCrypto = js.Any.fromFunction0(subtleCrypto), verifyTLSServerCertificate = js.Any.fromFunction2(verifyTLSServerCertificate))
    __obj.asInstanceOf[TypeofplatformKeysGetKeyPair]
  }
}

