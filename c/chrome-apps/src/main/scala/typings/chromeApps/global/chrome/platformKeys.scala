package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.platformKeys.Match
import typings.chromeApps.chrome.platformKeys.SelectDetails
import typings.chromeApps.chrome.platformKeys.VerificationDetails
import typings.chromeApps.chrome.platformKeys.VerificationResult
import typings.chromeApps.chromeAppsStrings.ecdsaSign
import typings.chromeApps.chromeAppsStrings.rsaSign
import typings.std.CryptoKey
import typings.std.SubtleCrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.platformKeys
///////////////////
// Platform Keys //
///////////////////
/**
  * @requires(CrOS) Only for Chrome OS.
  * @requires Permissions: 'platformKeys'
  * @description
  * Use the *chrome.platformKeys* API to access client certificates
  * managed by the platform. If the user or policy grants the permission, an
  * app can use such a certficate in its custom authentication protocol.
  * E.g. this allows usage of platform managed certificates in third party VPNs
  * @see chrome.vpnProvider
  */
object platformKeys {
  
  @JSGlobal("chrome.platformKeys")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @enum
    */
  object ClientCertificateType {
    
    @JSGlobal("chrome.platformKeys.ClientCertificateType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.platformKeys.ClientCertificateType.ECDSA_SIGN")
    @js.native
    def ECDSA_SIGN: ecdsaSign = js.native
    inline def ECDSA_SIGN_=(x: ecdsaSign): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ECDSA_SIGN")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.platformKeys.ClientCertificateType.RSA_SIGN")
    @js.native
    def RSA_SIGN: rsaSign = js.native
    inline def RSA_SIGN_=(x: rsaSign): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RSA_SIGN")(x.asInstanceOf[js.Any])
  }
  
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
  inline def getKeyPair(
    certificate: js.typedarray.ArrayBuffer,
    parameters: js.Object,
    callback: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeyPair")(certificate.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def selectClientCertificates(details: SelectDetails, callback: js.Function1[/* matches */ js.Array[Match], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectClientCertificates")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * An implementation of WebCrypto's SubtleCrypto
    * that allows crypto operations on keys of client
    * certificates that are available to this app.
    * @see[SubtleCrypto]{@link http://www.w3.org/TR/WebCryptoAPI/#subtlecrypto-interface}
    */
  inline def subtleCrypto(): SubtleCrypto = ^.asInstanceOf[js.Dynamic].applyDynamic("subtleCrypto")().asInstanceOf[SubtleCrypto]
  
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
  inline def verifyTLSServerCertificate(details: VerificationDetails, callback: js.Function1[/* result */ VerificationResult, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyTLSServerCertificate")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
