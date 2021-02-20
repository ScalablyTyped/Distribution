package typings.chromeApps.anon

import typings.chromeApps.chrome.platformKeys.Match
import typings.chromeApps.chrome.platformKeys.SelectDetails
import typings.chromeApps.chrome.platformKeys.VerificationDetails
import typings.chromeApps.chrome.platformKeys.VerificationResult
import typings.std.ArrayBuffer
import typings.std.CryptoKey
import typings.std.SubtleCrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofplatformKeysClientCertificateType extends StObject {
  
  /**
    * @enum
    */
  val ClientCertificateType: ECDSASIGN = js.native
  
  /**
    * @description
    * Passes the key pair of *certificate* for usage with
    * platformKeys.subtleCrypto to *callback*.
    *
    * ❗ Note:
    * Currently, this function only supports the "RSASSA-PKCS1-v1_5"
    * algorithm with one of the hashing algorithms "none", "SHA-1", "SHA-256",
    * "SHA-384", and "SHA-512"
    *
    * @param certificate The certificate of a *Match* returned by *selectClientCertificates*.
    * @param parameters Determines signature/hash algorithm parameters additionally to the parameters fixed by the key itself.
    *   The same parameters are accepted as by WebCrypto's importKey (see docs).
    *   function, e.g. *RsaHashedImportParams* for a RSASSA-PKCS1-v1_5
    *   key. For RSASSA-PKCS1-v1_5 keys, additionally the parameters *{
    *   "hash": { "name": "none" } }* are supported. The sign function will
    *   then apply PKCS#1 v1.5 padding and but not hash the given data.
    * @param callback The public and private CryptoKey of a certificate which can only be used with *subleCrypto*.
    * @param callback.privateKey Might be *null* if this app does not have access to it.
    * @param callback.privateKey
    * @see[WebCrypto's importKey docs]{@link http://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-importKey}
    * @see[CryptoKey docs]{@link http://www.w3.org/TR/WebCryptoAPI/#dfn-CryptoKey}
    */
  def getKeyPair(
    certificate: ArrayBuffer,
    parameters: js.Object,
    callback: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]
  ): Unit = js.native
  
  /**
    * This function filters from a list of client certificates the ones that
    * are known to the platform, match *request* and for which the
    * app has permission to access the certificate and its private key.
    * If *interactive* is true, the user is presented a dialog where
    * they can select from matching certificates and grant the app access
    * to the certificate.
    * The selected / filtered client certificates will be passed to *callback*.
    * @param callback Will provide *matches*: The list of certificates that match the request, that the
    *                 app has permission for and, if *interactive* is true, that were selected by the user.
    */
  def selectClientCertificates(details: SelectDetails, callback: js.Function1[/* matches */ js.Array[Match], Unit]): Unit = js.native
  
  /**
    * An implementation of WebCrypto's SubtleCrypto
    * that allows crypto operations on keys of client
    * certificates that are available to this app.
    * @see[SubtleCrypto]{@link http://www.w3.org/TR/WebCryptoAPI/#subtlecrypto-interface}
    */
  def subtleCrypto(): SubtleCrypto = js.native
  
  /**
    * Checks whether *details.serverCertificateChain* can be trusted
    * for *details.hostname* according to the trust settings of the
    * platform.
    * Note: The actual behavior of the trust verification is not fully
    * specified and might change in the future.
    * The API implementation verifies certificate expiration, validates the
    * certification path and checks trust by a known CA.
    * The implementation is supposed to respect the EKU serverAuth and to
    * support subject alternative names.
    */
  def verifyTLSServerCertificate(details: VerificationDetails, callback: js.Function1[/* result */ VerificationResult, Unit]): Unit = js.native
}
object TypeofplatformKeysClientCertificateType {
  
  @scala.inline
  def apply(
    ClientCertificateType: ECDSASIGN,
    getKeyPair: (ArrayBuffer, js.Object, js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]) => Unit,
    selectClientCertificates: (SelectDetails, js.Function1[/* matches */ js.Array[Match], Unit]) => Unit,
    subtleCrypto: () => SubtleCrypto,
    verifyTLSServerCertificate: (VerificationDetails, js.Function1[/* result */ VerificationResult, Unit]) => Unit
  ): TypeofplatformKeysClientCertificateType = {
    val __obj = js.Dynamic.literal(ClientCertificateType = ClientCertificateType.asInstanceOf[js.Any], getKeyPair = js.Any.fromFunction3(getKeyPair), selectClientCertificates = js.Any.fromFunction2(selectClientCertificates), subtleCrypto = js.Any.fromFunction0(subtleCrypto), verifyTLSServerCertificate = js.Any.fromFunction2(verifyTLSServerCertificate))
    __obj.asInstanceOf[TypeofplatformKeysClientCertificateType]
  }
  
  @scala.inline
  implicit class TypeofplatformKeysClientCertificateTypeMutableBuilder[Self <: TypeofplatformKeysClientCertificateType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientCertificateType(value: ECDSASIGN): Self = StObject.set(x, "ClientCertificateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetKeyPair(
      value: (ArrayBuffer, js.Object, js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]) => Unit
    ): Self = StObject.set(x, "getKeyPair", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSelectClientCertificates(value: (SelectDetails, js.Function1[/* matches */ js.Array[Match], Unit]) => Unit): Self = StObject.set(x, "selectClientCertificates", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSubtleCrypto(value: () => SubtleCrypto): Self = StObject.set(x, "subtleCrypto", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVerifyTLSServerCertificate(value: (VerificationDetails, js.Function1[/* result */ VerificationResult, Unit]) => Unit): Self = StObject.set(x, "verifyTLSServerCertificate", js.Any.fromFunction2(value))
  }
}
