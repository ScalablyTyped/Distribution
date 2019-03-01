package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackCertificateDetails extends js.Object {
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

object Anon_CallbackCertificateDetails {
  @scala.inline
  def apply(
    getKeyPair: js.Function3[
      stdLib.ArrayBuffer, 
      js.Object, 
      js.Function2[
        /* publicKey */ stdLib.CryptoKey, 
        /* privateKey */ stdLib.CryptoKey | scala.Null, 
        scala.Unit
      ], 
      scala.Unit
    ],
    selectClientCertificates: js.Function2[
      chromeLib.chromeNs.platformKeysNs.ClientCertificateSelectDetails, 
      js.Function1[/* matches */ js.Array[chromeLib.chromeNs.platformKeysNs.Match], scala.Unit], 
      scala.Unit
    ],
    subtleCrypto: js.Function0[stdLib.SubtleCrypto],
    verifyTLSServerCertificate: js.Function2[
      chromeLib.chromeNs.platformKeysNs.ServerCertificateVerificationDetails, 
      js.Function1[
        /* result */ chromeLib.chromeNs.platformKeysNs.ServerCertificateVerificationResult, 
        scala.Unit
      ], 
      scala.Unit
    ]
  ): Anon_CallbackCertificateDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getKeyPair")(getKeyPair)
    __obj.updateDynamic("selectClientCertificates")(selectClientCertificates)
    __obj.updateDynamic("subtleCrypto")(subtleCrypto)
    __obj.updateDynamic("verifyTLSServerCertificate")(verifyTLSServerCertificate)
    __obj.asInstanceOf[Anon_CallbackCertificateDetails]
  }
}

