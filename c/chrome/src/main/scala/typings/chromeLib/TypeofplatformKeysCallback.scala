package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofplatformKeysCallback extends js.Object {
  def getKeyPair(
    certificate: stdLib.ArrayBuffer,
    parameters: js.Object,
    callback: js.Function2[
      /* publicKey */ stdLib.CryptoKey, 
      /* privateKey */ stdLib.CryptoKey | scala.Null, 
      scala.Unit
    ]
  ): scala.Unit
  def selectClientCertificates(
    details: chromeLib.chromeNs.platformKeysNs.ClientCertificateSelectDetails,
    callback: js.Function1[/* matches */ js.Array[chromeLib.chromeNs.platformKeysNs.Match], scala.Unit]
  ): scala.Unit
  def subtleCrypto(): stdLib.SubtleCrypto
  def verifyTLSServerCertificate(
    details: chromeLib.chromeNs.platformKeysNs.ServerCertificateVerificationDetails,
    callback: js.Function1[
      /* result */ chromeLib.chromeNs.platformKeysNs.ServerCertificateVerificationResult, 
      scala.Unit
    ]
  ): scala.Unit
}

object TypeofplatformKeysCallback {
  @scala.inline
  def apply(
    getKeyPair: (stdLib.ArrayBuffer, js.Object, js.Function2[
      /* publicKey */ stdLib.CryptoKey, 
      /* privateKey */ stdLib.CryptoKey | scala.Null, 
      scala.Unit
    ]) => scala.Unit,
    selectClientCertificates: (chromeLib.chromeNs.platformKeysNs.ClientCertificateSelectDetails, js.Function1[/* matches */ js.Array[chromeLib.chromeNs.platformKeysNs.Match], scala.Unit]) => scala.Unit,
    subtleCrypto: () => stdLib.SubtleCrypto,
    verifyTLSServerCertificate: (chromeLib.chromeNs.platformKeysNs.ServerCertificateVerificationDetails, js.Function1[
      /* result */ chromeLib.chromeNs.platformKeysNs.ServerCertificateVerificationResult, 
      scala.Unit
    ]) => scala.Unit
  ): TypeofplatformKeysCallback = {
    val __obj = js.Dynamic.literal(getKeyPair = js.Any.fromFunction3(getKeyPair), selectClientCertificates = js.Any.fromFunction2(selectClientCertificates), subtleCrypto = js.Any.fromFunction0(subtleCrypto), verifyTLSServerCertificate = js.Any.fromFunction2(verifyTLSServerCertificate))
  
    __obj.asInstanceOf[TypeofplatformKeysCallback]
  }
}

